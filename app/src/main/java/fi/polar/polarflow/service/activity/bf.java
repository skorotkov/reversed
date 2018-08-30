package fi.polar.polarflow.service.activity;

class bf implements Runnable {
   // $FF: synthetic field
   final SleepTrackingService a;

   bf(SleepTrackingService var1) {
      this.a = var1;
   }

   public void run() {
      long var1 = SleepTrackingService.g(this.a);
      long var3 = SleepTrackingService.a(this.a, 0L);
      if (var3 != 0L && var3 >= var1) {
         this.a.k();
      }

   }
}
