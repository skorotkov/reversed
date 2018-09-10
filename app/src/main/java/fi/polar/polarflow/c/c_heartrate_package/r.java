package fi.polar.polarflow.c.c_heartrate_package;

import fi.polar.polarflow.data.orm.BleDevice;
import java.util.concurrent.TimeUnit;

class r implements Runnable {
   // $FF: synthetic field
   final j_HeartRateSensorManager a;

   private r(j_HeartRateSensorManager var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   r(j_HeartRateSensorManager var1, k var2) {
      this(var1);
   }

   public void run() {
      j_HeartRateSensorManager.o(this.a).a();
      if (!j_HeartRateSensorManager.d(this.a) && BleDevice.count(BleDevice.class) > 0L) {
         j_HeartRateSensorManager.o(this.a).a(0);
         j_HeartRateSensorManager.o(this.a).a(TimeUnit.MINUTES.toMillis(10L), j_HeartRateSensorManager.s(this.a));
      }

   }
}
