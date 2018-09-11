package fi.polar.polarflow.c.fused;

import android.location.Location;

import fi.polar.polarmathsmart.gps.LocationDataCalculator;

public class FusedLocationDataCalculator implements LocationDataCalculator {
    @Override
    public double getAltitudeInMeters(boolean var1) {
        return 0;
    }

    @Override
    public double getDistanceInMeters() {
        return 0;
    }

    @Override
    public boolean getFix() {
        return false;
    }

    @Override
    public double getLatitudeInDecimalDegrees() {
        return 0;
    }

    @Override
    public double getLongitudeInDecimalDegrees() {
        return 0;
    }

    @Override
    public int getNumberOfSatellites() {
        return 0;
    }

    @Override
    public double getSpeedInMetersPerSecond() {
        return 0;
    }

    @Override
    public int handleNMEAMessage(String var1) {
        throw new  UnsupportedOperationException();
    }

    public void handleLocation(Location location) {

    }
}
