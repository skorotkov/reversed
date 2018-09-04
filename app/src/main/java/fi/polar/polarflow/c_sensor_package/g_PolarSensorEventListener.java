package fi.polar.polarflow.c_sensor_package;

import android.hardware.SensorEvent;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

public abstract class g_PolarSensorEventListener extends c_PolarSensorEventListenerBase {
   private final j a;
   private final List b_collectedEvents = new ArrayList();
   private final Runnable c_reportCollectedEventsRunnable = new h_PolarSensorEventListener_reportCollectedEventsRunnable(this);

   public g_PolarSensorEventListener(j var1, Handler var2) {
      super(var2);
      this.a = var1;
   }

   // $FF: synthetic method
   static List a_get_collectedEvents(g_PolarSensorEventListener var0) {
      return var0.b_collectedEvents;
   }

   // $FF: synthetic method
   static j b_get_a(g_PolarSensorEventListener var0) {
      return var0.a;
   }

   public void a(b_PolarSensorEvent var1) {
      this.b_collectedEvents.add(var1);
      super.onSensorChanged((SensorEvent)null);
   }

   protected Runnable b_get_reportCollectedEventsRunnable() {
      return this.c_reportCollectedEventsRunnable;
   }

   public void onSensorChanged(SensorEvent var1) {
      this.b_collectedEvents.add(new b_PolarSensorEvent(var1));
      super.onSensorChanged(var1);
   }
}
