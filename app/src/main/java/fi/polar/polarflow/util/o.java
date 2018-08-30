package fi.polar.polarflow.util;

import android.content.Context;
import fi.polar.polarflow.data.OnPublishedListener;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class o implements Runnable {
   private final Context a;
   private final CountDownLatch b;
   private final OnPublishedListener c = new p(this);

   public o(Context var1) {
      this.a = var1;
      this.b = new CountDownLatch(1);
   }

   // $FF: synthetic method
   static CountDownLatch a(o var0) {
      return var0.b;
   }

   public void run() {
      if (w.a(this.a, this.c)) {
         try {
            if (!this.b.await(10L, TimeUnit.SECONDS)) {
               d.e("ProcessPendingSyncInfoTask", "Timeout when waiting for publish");
            }
         } catch (InterruptedException var2) {
            d.b("ProcessPendingSyncInfoTask", "Interrupted when waiting for publish", var2);
         }
      }

   }
}
