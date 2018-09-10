package fi.polar.polarflow.c;

import java.util.ArrayList;

class h_AndroidSensorEventListener_reportCollectedEventsRunnable implements Runnable {
   // $FF: synthetic field
   final g_AndroidSensorEventListener eventListener;

   h_AndroidSensorEventListener_reportCollectedEventsRunnable(g_AndroidSensorEventListener var1) {
      this.eventListener = var1;
   }

   public void run() {
      if (!g_AndroidSensorEventListener.a_get_collectedEvents(this.eventListener).isEmpty()) {
         g_AndroidSensorEventListener.b_getPolarSensorEventListener(this.eventListener).a_onPolarSensorEvents(new ArrayList(g_AndroidSensorEventListener.a_get_collectedEvents(this.eventListener)));
         g_AndroidSensorEventListener.a_get_collectedEvents(this.eventListener).clear();
      }

   }
}
