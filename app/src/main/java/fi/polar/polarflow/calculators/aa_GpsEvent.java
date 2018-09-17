package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.f_PolarSensorEvent;

class aa_GpsEvent extends ai_Event {
   private final float a_distance;
   private final float b_speed;
   private final float c_altitude;
   private final float d_ascent;
   private final float e_descent;

   aa_GpsEvent() {
      super(0, 0L);
      this.a_distance = -1.0F;
      this.b_speed = Float.NaN;
      this.c_altitude = Float.NaN;
      this.d_ascent = -1.0F;
      this.e_descent = -1.0F;
   }

   aa_GpsEvent(int var1, long var2, f_PolarSensorEvent var4) {
      super(var1, var2, (var4 != null && var4.n_fix));
      float var5 = Float.NaN;
      float var6 = -1.0F;
//      boolean var7;
//      if (var4 != null && var4.n) {
//         var7 = true;
//      } else {
//         var7 = false;
//      }

      float var8;
      float var10;
      float var11;
      if (var4 != null) {
         var8 = var4.e_distance;
         var5 = var8;
         if (var8 < 0.0F) {
            var5 = 0.0F;
         }

         float var9 = var4.f_speed;
         var8 = (float)var4.j_altitudeInMetersChecked;
         var6 = var4.l_ascent;
         var10 = var4.m_descent;
         var11 = var5;
         var5 = var9;
      } else {
         var8 = Float.NaN;
         var10 = -1.0F;
         var11 = -1.0F;
      }

      this.a_distance = var11;
      this.b_speed = var5;
      this.c_altitude = var8;
      this.d_ascent = var6;
      this.e_descent = var10;
   }

   float a_getSpeed() {
      return this.b_speed;
   }

   float b_getDistance() {
      return this.a_distance;
   }

   float c_getAltitude() {
      return this.c_altitude;
   }

   float d_getAscent() {
      return this.d_ascent;
   }

   float e_getDescent() {
      return this.e_descent;
   }
}
