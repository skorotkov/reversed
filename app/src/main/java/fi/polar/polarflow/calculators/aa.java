package fi.polar.polarflow.calculators;

import fi.polar.polarflow.c.f_PolarSensorEvent;

class aa extends ai {
   private final float a;
   private final float b;
   private final float c;
   private final float d;
   private final float e;

   aa() {
      super(0, 0L);
      this.a = -1.0F;
      this.b = Float.NaN;
      this.c = Float.NaN;
      this.d = -1.0F;
      this.e = -1.0F;
   }

   aa(int var1, long var2, f_PolarSensorEvent var4) {
      super(var1, var2, (var4 != null && var4.n));
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
         var8 = var4.e;
         var5 = var8;
         if (var8 < 0.0F) {
            var5 = 0.0F;
         }

         float var9 = var4.f;
         var8 = (float)var4.j;
         var6 = var4.l;
         var10 = var4.m;
         var11 = var5;
         var5 = var9;
      } else {
         var8 = Float.NaN;
         var10 = -1.0F;
         var11 = -1.0F;
      }

      this.a = var11;
      this.b = var5;
      this.c = var8;
      this.d = var6;
      this.e = var10;
   }

   float a() {
      return this.b;
   }

   float b() {
      return this.a;
   }

   float c() {
      return this.c;
   }

   float d() {
      return this.d;
   }

   float e() {
      return this.e;
   }
}
