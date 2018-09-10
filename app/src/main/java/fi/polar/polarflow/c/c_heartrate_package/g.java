package fi.polar.polarflow.c.c_heartrate_package;

class g implements Runnable {
   // $FF: synthetic field
   final b_BleHeartRateSensor a;
   private final int b;

   g(b_BleHeartRateSensor var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (b_BleHeartRateSensor.p(this.a) != null) {
         b_BleHeartRateSensor.p(this.a).a(this.b);
      }

   }
}
