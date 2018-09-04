package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

import fi.polar.polarflow.c_sensor_package.a_Sensor;
import fi.polar.polarflow.data.Training;

class o implements fi.polar.polarflow.c_sensor_package.b_ble_package.h {
   // $FF: synthetic field
   final j_HeartRateSensorManager a;

   o(j_HeartRateSensorManager var1) {
      this.a = var1;
   }

   public void a(fi.polar.polarflow.c_sensor_package.b_ble_package.a var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onNewDeviceAtCloseRange(" + var1.a().getName() + ")");
      if (j_HeartRateSensorManager.n(this.a) == null && !Training.getInstance().isRunning() && j_HeartRateSensorManager.c(this.a) && !j_HeartRateSensorManager.a(this.a, var1.a().getAddress())) {
         j_HeartRateSensorManager.a(this.a, j_HeartRateSensorManager.a(this.a, var1));
         j_HeartRateSensorManager.q(this.a);
      }

   }

   public void b(fi.polar.polarflow.c_sensor_package.b_ble_package.a var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onPairedDeviceFound(" + var1.a().getName() + ")");
      if (j_HeartRateSensorManager.n(this.a) == null && !j_HeartRateSensorManager.a(this.a, var1.a().getAddress()) && j_HeartRateSensorManager.c(this.a)) {
         j_HeartRateSensorManager.o(this.a).a();
         j_HeartRateSensorManager.a(this.a, j_HeartRateSensorManager.a(this.a, var1));
         j_HeartRateSensorManager.a((a_Sensor) j_HeartRateSensorManager.n(this.a), (fi.polar.polarflow.c_sensor_package.l) j_HeartRateSensorManager.p(this.a));
      }

   }
}
