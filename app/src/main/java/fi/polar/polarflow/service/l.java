package fi.polar.polarflow.service;

import java.util.concurrent.CountDownLatch;

class l implements Runnable {
   // $FF: synthetic field
   final j a;
   // $FF: synthetic field
   final CountDownLatch b;
   // $FF: synthetic field
   final k c;

   l(k var1, j var2, CountDownLatch var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public void run() {
      fi.polar.polarflow.util.d.c(PresyncService.a(), "callPresync(listener=" + this.a + ")");
      this.a.a(this.b);
   }
}
