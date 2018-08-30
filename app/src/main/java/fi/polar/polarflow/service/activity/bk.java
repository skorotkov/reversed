package fi.polar.polarflow.service.activity;

abstract class bk implements Runnable {
   // $FF: synthetic field
   final SleepTrackingService a;

   private bk(SleepTrackingService var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   bk(SleepTrackingService var1, be var2) {
      this(var1);
   }

   protected fi.polar.polarflow.util.b.a a(boolean var1, boolean var2) {
      fi.polar.polarflow.util.b.a var3;
      if (SleepTrackingService.a(this.a).d()) {
         var3 = SleepTrackingService.a(this.a).e();
         if (var3 != null && SleepTrackingService.a(this.a, var3)) {
            SleepTrackingService.a(this.a, var3, var2);
            SleepTrackingService.b(this.a, var3, var1);
            return var3;
         }
      }

      var3 = null;
      return var3;
   }

   protected void a() {
      bd var1 = SleepTrackingService.a(this.a).c();
      if (var1 != SleepTrackingService.d(this.a)) {
         SleepTrackingService.a(this.a, var1);
         SleepTrackingService.b(this.a, var1);
      }

   }
}
