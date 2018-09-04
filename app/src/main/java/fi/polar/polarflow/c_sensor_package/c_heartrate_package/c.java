package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

class c implements Runnable {
   // $FF: synthetic field
   final b_BleHeartRateSensor a;

   c(b_BleHeartRateSensor var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "Reconnect iOS device because no heart rate in 5 seconds");
      b_BleHeartRateSensor.a(this.a).b();
   }
}
