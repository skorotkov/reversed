package fi.polar.polarflow.c.c_heartrate_package;

import java.util.List;

import fi.polar.polarflow.c.b_PolarSensorEventBase;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.m_SENSOR_STATE;

class l implements e_PolarSensorListenerEx {
   // $FF: synthetic field
   final j_HeartRateSensorManager a;

   l(j_HeartRateSensorManager var1) {
      this.a = var1;
   }

   public void a(int var1) {
   }

   public void a(m_SENSOR_STATE var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "mInDeviceSensorObserver.onStateChanged(" + var1 + ")");
      if (j_HeartRateSensorManager.c(this.a) && !j_HeartRateSensorManager.d(this.a)) {
         if (var1 == m_SENSOR_STATE.a_DISABLED) {
            j_HeartRateSensorManager.e(this.a);
         } else if (var1 == m_SENSOR_STATE.c_SEARCHING) {
            j_HeartRateSensorManager.f(this.a);
         } else if (var1 == m_SENSOR_STATE.d_READY) {
            j_HeartRateSensorManager.g(this.a);
         }
      }

   }

   public void a_onPolarSensorEvents(List var1) {
      if (j_HeartRateSensorManager.c(this.a) && !j_HeartRateSensorManager.d(this.a)) {
         b_PolarSensorEventBase var2 = (b_PolarSensorEventBase)var1.get(var1.size() - 1);
         this.a.a(Math.round(var2.a[0]));
         this.a.l();
         if (j_HeartRateSensorManager.h(this.a) != null) {
            j_HeartRateSensorManager.h(this.a).a_onPolarSensorEvents(var1);
         }
      }

   }
}
