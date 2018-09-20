package fi.polar.polarflow.sensor.fusedgps;

import android.os.Bundle;
import android.support.annotation.NonNull;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
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

    FusedGpsSensor(FusedGpsLocationProvider gpsLocationProvider) {
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
                mGpsLocationProvider.storeLocationList(locationResult.getLocations());
            }
            @Override
            public void onLocationAvailability(LocationAvailability locationAvailability) {
                boolean isLocationAvailable = locationAvailability.isLocationAvailable();
                Log.i(TAG, "onLocationAvailability: isLocationAvailable = " + isLocationAvailable);
                if (!isLocationAvailable) {
                    mGpsLocationProvider.setFix(false);
                    mGpsLocationProvider.setState(SENSOR_STATE.SEARCHING, true);
                } else {
                    mGpsLocationProvider.setState(SENSOR_STATE.READY, true);
                }
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

    void startListeningUpdates() {
        Log.d(TAG, "startListeningUpdates");
        mGoogleApiClient.connect();
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

    void stopListeningUpdates() {
        Log.d(TAG, "stopListeningUpdates");
        mFusedLocationClient.removeLocationUpdates(mLocationCallback);
        mGoogleApiClient.disconnect();
    }
}
