package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

class k implements fi.polar.polarflow.c_sensor_package.b_ble_package.m {
   // $FF: synthetic field
   final j_HeartRateSensorManager a;

   k(j_HeartRateSensorManager var1) {
      this.a = var1;
   }

   public void a(boolean var1) {
      if (var1) {
         j_HeartRateSensorManager.a(this.a);
      } else {
         j_HeartRateSensorManager.b(this.a);
      }

   }
}
