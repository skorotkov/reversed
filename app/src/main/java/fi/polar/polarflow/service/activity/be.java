package fi.polar.polarflow.service.activity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;

class be extends fi.polar.polarflow.c_package.d {
   // $FF: synthetic field
   final SleepTrackingService a;

   be(SleepTrackingService var1, Handler var2) {
      super(var2);
      this.a = var1;
   }

   protected Runnable b() {
      return SleepTrackingService.f(this.a);
   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onFlushCompleted(Sensor var1) {
      fi.polar.polarflow.util.d.c("SleepTrackingService", "onFlushCompleted()");
   }

   public void onSensorChanged(SensorEvent var1) {
      SleepTrackingService.e(this.a).add(new ap(var1.timestamp, (int)var1.values[0], (int)var1.values[1], (int)var1.values[2]));
      SleepTrackingService.e(this.a).add(new ap(var1.timestamp + SleepTrackingService.e(), (int)var1.values[3], (int)var1.values[4], (int)var1.values[5]));
      super.onSensorChanged(var1);
   }
}
