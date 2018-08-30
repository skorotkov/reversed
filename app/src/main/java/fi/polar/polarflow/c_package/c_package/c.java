package fi.polar.polarflow.c_package.c_package;

class c implements Runnable {
   // $FF: synthetic field
   final b a;

   c(b var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("BleHeartRateSensor", "Reconnect iOS device because no heart rate in 5 seconds");
      b.a(this.a).b();
   }
}
