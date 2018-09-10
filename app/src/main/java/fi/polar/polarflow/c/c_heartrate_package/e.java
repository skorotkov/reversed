package fi.polar.polarflow.c.c_heartrate_package;

class e implements Runnable {
   // $FF: synthetic field
   final b_BleHeartRateSensor a;

   e(b_BleHeartRateSensor var1) {
      this.a = var1;
   }

   public void run() {
      if (b_BleHeartRateSensor.d(this.a) && b_BleHeartRateSensor.e(this.a) == 0) {
         b_BleHeartRateSensor.f(this.a);
      } else {
         fi.polar.polarflow.util.d.f("BleHeartRateSensor", "Retry delay timer expired in unexpected state: mStarted=" + b_BleHeartRateSensor.d(this.a) + ", mConnectionState=" + b_BleHeartRateSensor.e(this.a));
      }

   }
}
