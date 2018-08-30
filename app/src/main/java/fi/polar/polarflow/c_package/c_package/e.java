package fi.polar.polarflow.c_package.c_package;

class e implements Runnable {
   // $FF: synthetic field
   final b a;

   e(b var1) {
      this.a = var1;
   }

   public void run() {
      if (b.d(this.a) && b.e(this.a) == 0) {
         b.f(this.a);
      } else {
         fi.polar.polarflow.util.d.f("BleHeartRateSensor", "Retry delay timer expired in unexpected state: mStarted=" + b.d(this.a) + ", mConnectionState=" + b.e(this.a));
      }

   }
}
