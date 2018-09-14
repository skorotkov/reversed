package fi.polar.polarflow.sensor.fusedgps;

import android.location.Location;

import java.util.Locale;

import fi.polar.polarmathsmart.gps.LocationDataCalculator;

class FusedLocationDataCalculator implements LocationDataCalculator {
    private static final String TAG = FusedLocationDataCalculator.class.getSimpleName();

    private Location mPreviousLocation = null;
    private double mTotalDistance = 0.0D;

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
        throw new UnsupportedOperationException();
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
        if (mPreviousLocation.hasSpeed())
            return mPreviousLocation.getSpeed();
        else
            return Double.NaN;
    }

    @Override
    public int handleNMEAMessage(String var1) {
        throw new  UnsupportedOperationException();
    }

    void handleLocation(Location location) {
        if (mPreviousLocation != null) {
            mTotalDistance += mPreviousLocation.distanceTo(location);
            Log.i(TAG, String.format(Locale.US, "handleLocation: mTotalDistance = %.2f", mTotalDistance));
        }
        mPreviousLocation = location;
    }
}
