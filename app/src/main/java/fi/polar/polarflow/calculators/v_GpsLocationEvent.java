package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.f_PolarSensorEvent;

class v_GpsLocationEvent extends ai_Event {
   private final double a_latitude;
   private final double b_longitude;
   private final int c_numberOfSatellites;
   private final double d_altitudeInMeters;

   private v_GpsLocationEvent() {
      this(0, 0L, false, 0.0D, 0.0D, -1.0D, 0);
   }

   v_GpsLocationEvent(int var1, long var2, f_PolarSensorEvent var4) {
      this(var1, var2, var4.n_fix, var4.h_latitude, var4.i_longitude, var4.k_altitudeInMeters, var4.g_numberOfSatellites);
   }

   v_GpsLocationEvent(int var1, long var2, boolean var4, double var5, double var7, double var9, int var11) {
      super(var1, var2, var4);
      this.a_latitude = var5;
      this.b_longitude = var7;
      this.d_altitudeInMeters = var9;
      this.c_numberOfSatellites = var11;
   }

   // $FF: synthetic method
   v_GpsLocationEvent(u var1) {
      this();
   }

   // $FF: synthetic method
   static double a_getLatitude(v_GpsLocationEvent var0) {
      return var0.a_latitude;
   }

   // $FF: synthetic method
   static double b_getLongitude(v_GpsLocationEvent var0) {
      return var0.b_longitude;
   }

   // $FF: synthetic method
   static double c_getAltitudeInMeters(v_GpsLocationEvent var0) {
      return var0.d_altitudeInMeters;
   }

   // $FF: synthetic method
   static int d_getNumberOfSatellites(v_GpsLocationEvent var0) {
      return var0.c_numberOfSatellites;
   }
}
