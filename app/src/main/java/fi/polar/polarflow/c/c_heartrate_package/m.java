package fi.polar.polarflow.c.c_heartrate_package;

import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;

class m implements l_PolarSensorListener {
   // $FF: synthetic field
   final j_HeartRateSensorManager a;

   m(j_HeartRateSensorManager var1) {
      this.a = var1;
   }

   public void a(int var1) {
      if (j_HeartRateSensorManager.c(this.a) && j_HeartRateSensorManager.d(this.a)) {
         if (this.a.n() != var1) {
            this.a.a(var1);
            this.a.l();
         }

         if (j_HeartRateSensorManager.h(this.a) != null) {
            j_HeartRateSensorManager.h(this.a).a(var1);
         }
      }

   }

   public void a(m_SENSOR_STATE var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "mBleSensorObserver.onStateChanged(" + var1 + ")");
      if (j_HeartRateSensorManager.c(this.a)) {
         if (j_HeartRateSensorManager.d(this.a)) {
            if (var1 == m_SENSOR_STATE.a_DISABLED) {
               j_HeartRateSensorManager.i(this.a);
            } else if (var1 == m_SENSOR_STATE.c_SEARCHING) {
               j_HeartRateSensorManager.j(this.a);
            } else if (var1 == m_SENSOR_STATE.d_READY) {
               j_HeartRateSensorManager.k(this.a);
            }
         } else if (var1 == m_SENSOR_STATE.a_DISABLED) {
            j_HeartRateSensorManager.l(this.a);
         } else if (var1 == m_SENSOR_STATE.d_READY) {
            j_HeartRateSensorManager.k(this.a);
         }
      }

   }
}
