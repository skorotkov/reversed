package fi.polar.polarflow.c.d;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;

class d extends fi.polar.polarflow.c.g {
   // $FF: synthetic field
   final b a;

   d(b var1, fi.polar.polarflow.c.j var2, Handler var3) {
      super(var2, var3);
      this.a = var1;
   }

   public void a(fi.polar.polarflow.c.b var1) {
      if (fi.polar.polarflow.c.d.b.b(this.a)) {
         super.a(var1);
      }

   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onSensorChanged(SensorEvent var1) {
   }
}
