package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;

class h implements Runnable {
   // $FF: synthetic field
   final b_BleHeartRateSensor a;
   private final m_SENSOR_STATE b;

   h(b_BleHeartRateSensor var1, m_SENSOR_STATE var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (b_BleHeartRateSensor.p(this.a) != null) {
         b_BleHeartRateSensor.p(this.a).a(this.b);
      }

   }
}
