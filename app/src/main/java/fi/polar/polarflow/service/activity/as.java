package fi.polar.polarflow.service.activity;

import android.hardware.SensorEventListener;
import java.util.concurrent.TimeUnit;

class as {
   private final int a;
   private final String b;
   private SensorEventListener c;
   private au d;
   private boolean e;

   public as(int var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   private static int a(au var0) {
      int var1 = var0.b();
      if (var1 <= 0) {
         var1 = 1;
      }

      return var1;
   }

   private static int a(au var0, long var1) {
      var1 = TimeUnit.MICROSECONDS.toMillis((long)a(var0) * var1);
      int var3;
      if (var1 > 2147483647L) {
         var3 = Integer.MAX_VALUE;
      } else {
         var3 = (int)var1;
      }

      return var3;
   }

   private au c(at var1) {
      if (this.d == null) {
         this.d = var1.a(this.a, this.b);
         if (this.d == null) {
            fi.polar.polarflow.util.d.e("SensorClient", "Could not get sensor: type=" + this.a + ", stringType=" + this.b);
         }
      }

      return this.d;
   }

   public void a(SensorEventListener var1) {
      this.c = var1;
   }

   public boolean a(at var1) {
      boolean var2;
      if (this.c(var1) != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean a(at var1, int var2) {
      if (!this.e && this.c != null) {
         au var3 = this.c(var1);
         if (var3 != null) {
            this.e = var1.a(this.c, var3, var2, a(var3, (long)var2));
            if (!this.e) {
               fi.polar.polarflow.util.d.e("SensorClient", "SensorManager.registerListener() returned false: type=" + this.a + ", stringType=" + this.b);
            }
         }
      }

      return this.e;
   }

   public void b(at var1) {
      if (this.e && this.c != null) {
         var1.a(this.c, this.d);
         this.e = false;
      }

      this.d = null;
   }
}
