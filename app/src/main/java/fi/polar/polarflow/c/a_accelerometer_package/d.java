package fi.polar.polarflow.c.a_accelerometer_package;

import java.util.ArrayList;
import java.util.List;

import fi.polar.polarflow.c.b_PolarSensorEventBase;

class d {
   private final boolean a;
   private List b;
   private b_PolarSensorEventBase c;
   private long d = 0L;

   d(boolean var1) {
      this.a = var1;
      this.b();
      this.c = new b_PolarSensorEventBase(new float[]{0.0F, 0.0F, 0.0F}, 0L, 0);
   }

   private void b() {
      this.b = new ArrayList(50);
   }

   List a() {
      List var1 = this.b;
      this.b();
      return var1;
   }

   void a(b_PolarSensorEventBase var1) {
      boolean var2 = true;
      long var3 = var1.b;
      boolean var5;
      if (this.d == 0L) {
         this.d = var3;
         var5 = var2;
      } else if (var3 - this.d >= 20000000L) {
         this.d += 20000000L;
         var5 = var2;
         if (var3 - this.d >= 20000000L) {
            if (this.a) {
               while(true) {
                  var5 = var2;
                  if (var3 - this.d < 20000000L) {
                     break;
                  }

                  this.b.add(new b_PolarSensorEventBase(this.c));
                  this.d += 20000000L;
               }
            } else {
               this.d = var3;
               var5 = var2;
            }
         }
      } else {
         var5 = false;
      }

      if (var5) {
         this.c = new b_PolarSensorEventBase(var1);
         this.b.add(var1);
      }

   }
}
