package fi.polar.polarflow.c.fused;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import fi.polar.polarflow.c.d_gps_package.b_GpsLocationProvider;
import fi.polar.polarflow.c.fused.proxy.Log;
import fi.polar.polarflow.ui.o;

public class FusedGpsSensor {
    private static final String TAG = FusedGpsSensor.class.getSimpleName();

    final FusedGpsLocationProvider mGpsLocationProvider;
    FusedLocationProviderClient mFusedLocationClient;

    public FusedGpsSensor(FusedGpsLocationProvider mGpsLocationProvider) {
        Log.i(TAG, "FusedGpsSensor");
        this.mGpsLocationProvider = mGpsLocationProvider;
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(mGpsLocationProvider.getContext());
    }

    private void startLocationUpdates() {
        Log.i(TAG, "startLocationUpdates");
        if (o.d(mGpsLocationProvider.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {

        }
    }
}
