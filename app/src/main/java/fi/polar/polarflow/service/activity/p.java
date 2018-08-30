package fi.polar.polarflow.service.activity;

class p implements Runnable {
   // $FF: synthetic field
   final DailyActivityService a;

   p(DailyActivityService var1) {
      this.a = var1;
   }

   public void run() {
      this.a.k();
   }
}
