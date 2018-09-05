package fi.polar.polarflow.c_sensor_package;

import android.hardware.SensorEvent;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public abstract class g_AndroidSensorEventListener extends c_AndroidSensorEventListenerBase {
   private final j_PolarSensorEventListener a_polarSensorEventListener;
   private final List b_collectedEvents = new ArrayList();
   private final Runnable c_reportCollectedEventsRunnable = new h_AndroidSensorEventListener_reportCollectedEventsRunnable(this);

   public g_AndroidSensorEventListener(j_PolarSensorEventListener var1, Handler var2) {
      super(var2);
      this.a_polarSensorEventListener = var1;
   }

   // $FF: synthetic method
   static List a_get_collectedEvents(g_AndroidSensorEventListener var0) {
      return var0.b_collectedEvents;
   }

   // $FF: synthetic method
   static j_PolarSensorEventListener b_getPolarSensorEventListener(g_AndroidSensorEventListener var0) {
      return var0.a_polarSensorEventListener;
   }

   public void a(b_PolarSensorEventBase var1) {
      this.b_collectedEvents.add(var1);
      super.onSensorChanged((SensorEvent)null);
   }

   protected Runnable b_get_reportCollectedEventsRunnable() {
      return this.c_reportCollectedEventsRunnable;
   }

   public void onSensorChanged(SensorEvent var1) {
      this.b_collectedEvents.add(new b_PolarSensorEventBase(var1));
      super.onSensorChanged(var1);
   }
}
