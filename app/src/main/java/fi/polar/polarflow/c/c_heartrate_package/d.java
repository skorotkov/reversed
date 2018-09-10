package fi.polar.polarflow.c.c_heartrate_package;

import fi.polar.polarflow.c.m_SENSOR_STATE;

class d implements Runnable {
   // $FF: synthetic field
   final b_BleHeartRateSensor a;

   d(b_BleHeartRateSensor var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.e("BleHeartRateSensor", "connectGatt() taking longer than " + b_BleHeartRateSensor.b(this.a) + " ms -> disconnect");
      b_BleHeartRateSensor.a(this.a, m_SENSOR_STATE.a_DISABLED);
      b_BleHeartRateSensor.c(this.a);
   }
}
