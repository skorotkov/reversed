package fi.polar.polarflow.service.activity;

import java.util.concurrent.CountDownLatch;

class t implements ab {
   // $FF: synthetic field
   final CountDownLatch a;
   // $FF: synthetic field
   final s b;

   t(s var1, CountDownLatch var2) {
      this.b = var1;
      this.a = var2;
   }

   public void a(int var1) {
      if (var1 > 0) {
         this.a.countDown();
      }

   }
}
