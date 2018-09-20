package fi.polar.polarflow.sensor.fusedgps;

import android.location.Location;

import java.util.Locale;

import fi.polar.polarmathsmart.gps.LocationDataCalculator;

class FusedLocationDataCalculator implements LocationDataCalculator {
    private static final String TAG = FusedLocationDataCalculator.class.getSimpleName();

    private Location mPreviousLocation = null;
    private double mTotalDistance = 0.0D;
    private double mSpeed = Double.NaN;

    @Override
    public double getAltitudeInMeters(boolean var1) {
        if (mPreviousLocation.hasAltitude())
            return mPreviousLocation.getAltitude();
        else
            return Double.NaN;
    }

    @Override
    public double getDistanceInMeters() {
        return mTotalDistance;
    }

    @Override
    public boolean getFix() {
        return mPreviousLocation.hasAccuracy() && mPreviousLocation.getAccuracy() < 20;
    }

    @Override
    public double getLatitudeInDecimalDegrees() {
        return mPreviousLocation.getLatitude();
    }

    @Override
    public double getLongitudeInDecimalDegrees() {
        return mPreviousLocation.getLongitude();
    }

    @Override
    public int getNumberOfSatellites() {
        return 0;
    }

    @Override
    public double getSpeedInMetersPerSecond() {
        return mSpeed;
//        if (mPreviousLocation.hasSpeed())
//            return mPreviousLocation.getSpeed();
//        else
//            return Double.NaN;
    }

    @Override
    public int handleNMEAMessage(String var1) {
        throw new  UnsupportedOperationException();
    }

    void handleLocation(Location location) {
        if (mPreviousLocation != null) {
            double distanceDelta = mPreviousLocation.distanceTo(location);
            mTotalDistance += distanceDelta;
            mSpeed = distanceDelta / ((location.getElapsedRealtimeNanos() - mPreviousLocation.getElapsedRealtimeNanos()) / 1000000000D);
            Log.i(TAG, String.format(Locale.US, "handleLocation: mTotalDistance = %.2f (m), speed = %.2f (m/s)", mTotalDistance, mSpeed));
        }
        mPreviousLocation = location;
    }
}
