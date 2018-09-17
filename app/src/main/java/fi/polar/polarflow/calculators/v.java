package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.f_PolarSensorEvent;

class v extends ai_Event {
   private final double a;
   private final double b;
   private final int c;
   private final double d;

   private v() {
      this(0, 0L, false, 0.0D, 0.0D, -1.0D, 0);
   }

   v(int var1, long var2, f_PolarSensorEvent var4) {
      this(var1, var2, var4.n_fix, var4.h_latitude, var4.i_longitude, var4.k_altitudeInMeters, var4.g_numberOfSatellites);
   }

   v(int var1, long var2, boolean var4, double var5, double var7, double var9, int var11) {
      super(var1, var2, var4);
      this.a = var5;
      this.b = var7;
      this.d = var9;
      this.c = var11;
   }

   // $FF: synthetic method
   v(u var1) {
      this();
   }

   // $FF: synthetic method
   static double a(v var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static double b(v var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static double c(v var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static int d(v var0) {
      return var0.c;
   }
}
