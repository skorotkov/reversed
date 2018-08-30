package fi.polar.polarmathsmart.gps;

public interface LocationDataCalculator {
   double getAltitudeInMeters(boolean var1);

   double getDistanceInMeters();

   boolean getFix();

   double getLatitudeInDecimalDegrees();

   double getLongitudeInDecimalDegrees();

   int getNumberOfSatellites();

   double getSpeedInMetersPerSecond();

   int handleNMEAMessage(String var1);
}
