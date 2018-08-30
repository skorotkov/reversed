package fi.polar.polarflow.c_package.d_package;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;

class d extends fi.polar.polarflow.c_package.g {
   // $FF: synthetic field
   final b a;

   d(b var1, fi.polar.polarflow.c_package.j var2, Handler var3) {
      super(var2, var3);
      this.a = var1;
   }

   public void a(fi.polar.polarflow.c_package.b var1) {
      if (fi.polar.polarflow.c_package.d_package.b.b(this.a)) {
         super.a(var1);
      }

   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onSensorChanged(SensorEvent var1) {
   }
}
