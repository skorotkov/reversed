package fi.polar.polarflow.service.activity;

class u implements Runnable {
   // $FF: synthetic field
   final DailyActivityService a;

   u(DailyActivityService var1) {
      this.a = var1;
   }

   public void run() {
      DailyActivityService.a(this.a, false);
      DailyActivityService.b(this.a, true);
   }
}
