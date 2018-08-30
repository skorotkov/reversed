package fi.polar.polarflow.service.activity;

import java.util.concurrent.Future;

class bg implements Runnable {
   // $FF: synthetic field
   final SleepTrackingService a;

   bg(SleepTrackingService var1) {
      this.a = var1;
   }

   public void run() {
      SleepTrackingService.a(this.a, (Future)null);
      this.a.l();
   }
}
