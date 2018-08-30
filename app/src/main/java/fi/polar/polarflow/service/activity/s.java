package fi.polar.polarflow.service.activity;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

class s implements fi.polar.polarflow.service.j {
   // $FF: synthetic field
   final DailyActivityService a;

   s(DailyActivityService var1) {
      this.a = var1;
   }

   public void a(CountDownLatch var1) {
      if (!this.a.m()) {
         CountDownLatch var2 = new CountDownLatch(1);
         t var3 = new t(this, var2);
         DailyActivityService.e(this.a).a((ab)var3);
         this.a.h();

         try {
            var2.await(5000L, TimeUnit.MILLISECONDS);
         } catch (InterruptedException var4) {
            fi.polar.polarflow.util.d.b("DailyActivityService", "Interrupted while waiting in presync", var4);
         }

         DailyActivityService.e(this.a).b(var3);
      }

      var1.countDown();
   }
}
