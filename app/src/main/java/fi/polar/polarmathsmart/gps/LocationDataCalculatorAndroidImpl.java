package fi.polar.polarmathsmart.gps;

public class LocationDataCalculatorAndroidImpl implements LocationDataCalculator {
   private double altitudeInMeters;
   private double distanceInMeters;
   private double filtAltitudeInMeters;
   private boolean fix;
   private byte[] gpsData = new byte[this.native_gpsDataByteSize()];
   private double latitudeInDecimalDegrees;
   private double longitudeInDecimalDegrees;
   private int numberOfSatellites;
   private double speedInMetersPerSecond;

   public LocationDataCalculatorAndroidImpl(int var1, int var2, int var3) {
      this.native_gpsInit(this.gpsData, var1, var2, var3);
      this.distanceInMeters = 0.0D;
      this.speedInMetersPerSecond = 0.0D;
      this.numberOfSatellites = 0;
      this.fix = false;
      this.latitudeInDecimalDegrees = 0.0D;
      this.longitudeInDecimalDegrees = 0.0D;
      this.altitudeInMeters = 0.0D;
      this.filtAltitudeInMeters = 0.0D;
   }

   private native boolean native_altitudeOk(byte[] var1);

   private native int native_gpsDataByteSize();

   private native int native_gpsInit(byte[] var1, int var2, int var3, int var4);

   private native int native_handleNMEAMessage(byte[] var1, String var2);

   private native boolean native_speedOk(byte[] var1);

   public double getAltitudeInMeters(boolean var1) {
      double var2;
      if (!var1) {
         var2 = this.altitudeInMeters;
      } else if (!this.native_altitudeOk(this.gpsData)) {
         var2 = Double.NaN;
      } else {
         var2 = this.filtAltitudeInMeters;
      }

      return var2;
   }

   public double getDistanceInMeters() {
      return this.distanceInMeters;
   }

   public boolean getFix() {
      return this.fix;
   }

   public double getLatitudeInDecimalDegrees() {
      return this.latitudeInDecimalDegrees;
   }

   public double getLongitudeInDecimalDegrees() {
      return this.longitudeInDecimalDegrees;
   }

   public int getNumberOfSatellites() {
      return this.numberOfSatellites;
   }

   public double getSpeedInMetersPerSecond() {
      double var1;
      if (this.native_speedOk(this.gpsData)) {
         var1 = this.speedInMetersPerSecond;
      } else {
         var1 = Double.NaN;
      }

      return var1;
   }

   public int handleNMEAMessage(String var1) {
      var1 = var1.trim();
      return this.native_handleNMEAMessage(this.gpsData, var1);
   }
}
