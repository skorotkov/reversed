package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

import fi.polar.polarflow.c_sensor_package.a_Sensor;

class p implements Runnable {
   // $FF: synthetic field
   final j_HeartRateSensorManager a;
   private final String b;

   public p(j_HeartRateSensorManager var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (j_HeartRateSensorManager.n(this.a) != null && j_HeartRateSensorManager.n(this.a).q().equals(this.b)) {
         j_HeartRateSensorManager.o(this.a).a();
         j_HeartRateSensorManager.a((a_Sensor) j_HeartRateSensorManager.n(this.a), (fi.polar.polarflow.c_sensor_package.l) j_HeartRateSensorManager.p(this.a));
      }

   }
}
