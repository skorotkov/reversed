package fi.polar.polarflow.c_sensor_package;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

public abstract class c_PolarSensorEventListenerBase implements SensorEventListener {
   private final Handler a_handler;

   public c_PolarSensorEventListenerBase(Handler var1) {
      this.a_handler = var1;
   }

   protected void a() {
      Runnable var1 = this.b_get_reportCollectedEventsRunnable();
      this.a_handler.removeCallbacks(var1);
      this.a_handler.postDelayed(var1, 500L);
   }

   protected abstract Runnable b_get_reportCollectedEventsRunnable();

   public void onSensorChanged(SensorEvent var1) {
      this.a();
   }
}
