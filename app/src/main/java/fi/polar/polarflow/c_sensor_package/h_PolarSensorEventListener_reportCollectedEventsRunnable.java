package fi.polar.polarflow.c_sensor_package;

import java.util.ArrayList;

class h_PolarSensorEventListener_reportCollectedEventsRunnable implements Runnable {
   // $FF: synthetic field
   final g_PolarSensorEventListener eventListener;

   h_PolarSensorEventListener_reportCollectedEventsRunnable(g_PolarSensorEventListener var1) {
      this.eventListener = var1;
   }

   public void run() {
      if (!g_PolarSensorEventListener.a_get_collectedEvents(this.eventListener).isEmpty()) {
         g_PolarSensorEventListener.b_get_a(this.eventListener).a(new ArrayList(g_PolarSensorEventListener.a_get_collectedEvents(this.eventListener)));
         g_PolarSensorEventListener.a_get_collectedEvents(this.eventListener).clear();
      }

   }
}
