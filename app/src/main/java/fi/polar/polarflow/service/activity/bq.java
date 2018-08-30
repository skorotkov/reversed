package fi.polar.polarflow.service.activity;

import org.joda.time.DateTime;

class bq implements Runnable {
   // $FF: synthetic field
   final SleepTrackingService a;
   private final DateTime b;
   private final DateTime c;

   public bq(SleepTrackingService var1, DateTime var2, DateTime var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public void run() {
      SleepTrackingService.a(this.a).a(this.b, this.c);
   }
}
