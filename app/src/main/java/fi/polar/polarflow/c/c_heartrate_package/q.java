package fi.polar.polarflow.c.c_heartrate_package;

class q implements Runnable {
   // $FF: synthetic field
   final j_HeartRateSensorManager a;
   private final String b;

   public q(j_HeartRateSensorManager var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (j_HeartRateSensorManager.n(this.a) != null && j_HeartRateSensorManager.n(this.a).q().equals(this.b)) {
         j_HeartRateSensorManager.a((j_HeartRateSensorManager)this.a, (b_BleHeartRateSensor)null);
         j_HeartRateSensorManager.b(this.a, this.b);
         j_HeartRateSensorManager.r(this.a);
      }

   }
}
