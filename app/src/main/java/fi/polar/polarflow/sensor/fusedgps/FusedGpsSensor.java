package fi.polar.polarflow.sensor.fusedgps;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wearable.Wearable;

import fi.polar.polarflow.sensor.fusedgps.proxy.SENSOR_STATE;

public class FusedGpsSensor {
    private static final String TAG = FusedGpsSensor.class.getSimpleName();

    private static final long UPDATE_INTERVAL_IN_MILLISECONDS = 1000;
    private static final long FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS = 1000;

    private final FusedGpsLocationProvider mGpsLocationProvider;

    private GoogleApiClient mGoogleApiClient;
    private FusedLocationProviderClient mFusedLocationClient;
    private LocationRequest mLocationRequest;
    private LocationCallback mLocationCallback;

    private boolean mWaitingForGpsSignal;

    public FusedGpsSensor(FusedGpsLocationProvider gpsLocationProvider) {
        Log.i(TAG, "FusedGpsSensor");
        mGpsLocationProvider = gpsLocationProvider;
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(mGpsLocationProvider.getContext());

        mLocationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                Log.i(TAG, "onLocationResult");
                if (locationResult == null) {
                    return;
                }
                if (mWaitingForGpsSignal) {
                    mWaitingForGpsSignal = false;
//                    mGpsLocationProvider.setState(m_SENSOR_STATE.d_READY, true);
                }
                mGpsLocationProvider.handleLocationList(locationResult.getLocations());
            }
            @Override
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                boolean isLocationAvailable = locationAvailability.isLocationAvailable();
                Log.i(TAG, "onLocationAvailability: isLocationAvailable = " + isLocationAvailable);
                if (!isLocationAvailable)
                    mGpsLocationProvider.setState(SENSOR_STATE.SEARCHING, true);
                else
                    mGpsLocationProvider.setState(SENSOR_STATE.READY, true);
            }
        };
        mLocationRequest = createLocationRequest();
        mGoogleApiClient = createGoogleApiClient();
    }

    private GoogleApiClient createGoogleApiClient() {
        return new GoogleApiClient.Builder(mGpsLocationProvider.getContext())
            .addApi(LocationServices.API)
            .addApi(Wearable.API)
            .addConnectionCallbacks(new GoogleApiClient.ConnectionCallbacks() {
                @Override
                public void onConnected(Bundle connectionHint) {
                    Log.i(TAG, "GoogleApiClient.ConnectionCallbacks::onConnected");
                    mGpsLocationProvider.setState(SENSOR_STATE.SEARCHING, true);
                    mWaitingForGpsSignal = true;
                    requestLocationUpdates();
                }

                @Override
                public void onConnectionSuspended(int cause) {
                    Log.i(TAG, "GoogleApiClient.ConnectionCallbacks::onConnectionSuspended");
                    mGpsLocationProvider.setState(SENSOR_STATE.NOT_READY, true);
                    mWaitingForGpsSignal = true;
                    stopListeningUpdates();
                }
            })
            .addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() {
                @Override
                public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
                    Log.e(TAG, "GoogleApiClient.ConnectionCallbacks::onConnectionFailed: " + connectionResult.getErrorMessage());
                    mGpsLocationProvider.setState(SENSOR_STATE.DISABLED, true);
                }
            })
            .build();
    }

    private LocationRequest createLocationRequest() {
        LocationRequest locationRequest = new LocationRequest();

        locationRequest.setInterval(UPDATE_INTERVAL_IN_MILLISECONDS);
        locationRequest.setFastestInterval(FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        return locationRequest;
    }

    public void startListeningUpdates() {
        Log.d(TAG, "startListeningUpdates");
        mGoogleApiClient.connect();
    }

    private void requestLocationUpdates_settings() {

        // does not work on device
        // 09-13 12:26:02.266  3603  3603 I FusedGpsSensor: checkLocationSettings task completed
        // 09-13 12:26:02.275  3603  3603 E FusedGpsSensor: Failed in checkLocationSettings
        // 09-13 12:26:02.275  3603  3603 E FusedGpsSensor: com.google.android.gms.common.api.ApiException: 10: Not implemented on this platform.

        Log.d(TAG, "requestLocationUpdates");
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
                .addLocationRequest(mLocationRequest);
//                .setNeedBle(true);
        SettingsClient client = LocationServices.getSettingsClient(mGpsLocationProvider.getContext());
        Task<LocationSettingsResponse> task = client.checkLocationSettings(builder.build());

        task.addOnCompleteListener(new OnCompleteListener<LocationSettingsResponse>() {
            @Override
            public void onComplete(@NonNull Task<LocationSettingsResponse> task) {
                try {
                    Log.i(TAG, "checkLocationSettings task completed");
                    LocationSettingsResponse response = task.getResult(ApiException.class);
                    // All location settings are satisfied. The client can initialize location
                    // requests here.
                    try {
                        mFusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, null /* Looper */)
                            .addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Log.i(TAG, "Successfully requested location updates");
                                }
                            })
                            .addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull Exception e) {
                                    Log.e(TAG, "Failed in requesting location updates", e);
                                }
                            });
                    } catch (SecurityException exception) {
                        Log.e(TAG, "Failed in requesting location updates", exception);
                        mGpsLocationProvider.setState(SENSOR_STATE.DISABLED, true);
                    }
                } catch (ApiException exception) {
                    Log.e(TAG, "Failed in checkLocationSettings", exception);
                    mGpsLocationProvider.setState(SENSOR_STATE.DISABLED, true);
                }
            }
        });
    }

    private void requestLocationUpdates() {
        Log.d(TAG, "requestLocationUpdates");
        try {
            mFusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, null /* Looper */)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.i(TAG, "Successfully requested location updates");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.e(TAG, "Failed in requesting location updates", e);
                    }
                });
        } catch (SecurityException exception) {
            Log.e(TAG, "Failed in requesting location updates", exception);
            mGpsLocationProvider.setState(SENSOR_STATE.DISABLED, true);
        }
    }

    public void stopListeningUpdates() {
        Log.d(TAG, "stopListeningUpdates");
        mFusedLocationClient.removeLocationUpdates(mLocationCallback);
    }
}
