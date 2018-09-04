package fi.polar.polarflow.c_package.a_package;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

class b implements SensorEventListener {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onSensorChanged(SensorEvent var1) {
      if (fi.polar.polarflow.c_package.a_package.a.a(this.a) == 0L || var1.timestamp - fi.polar.polarflow.c_package.a_package.a.a(this.a) >= fi.polar.polarflow.c_package.a_package.a.b(this.a)) {
         fi.polar.polarflow.c_package.a_package.a.a(this.a, var1.timestamp);
         float var2 = var1.values[1];
         float var3 = -var1.values[0];
         float var4 = var1.values[2];
         long var5 = var1.timestamp;
         int var7 = var1.accuracy;
         fi.polar.polarflow.c_package.b var8 = new fi.polar.polarflow.c_package.b(new float[]{var2, var3, var4}, var5, var7);
         fi.polar.polarflow.c_package.a_package.a.c(this.a).a(var8);
         if (fi.polar.polarflow.c_package.a_package.a.d(this.a) == 0L) {
            fi.polar.polarflow.c_package.a_package.a.b(this.a, fi.polar.polarflow.c_package.a_package.a.a(this.a));
         }

         if (var1.timestamp - fi.polar.polarflow.c_package.a_package.a.d(this.a) >= fi.polar.polarflow.c_package.a_package.a.e(this.a)) {
            this.a.k();
            fi.polar.polarflow.c_package.a_package.a.b(this.a, var1.timestamp);
         }
      }

   }
}
