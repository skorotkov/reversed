package fi.polar.polarflow;

import android.content.Context;

class b implements Runnable {
   private final fi.polar.polarflow.service.d a;

   b(Context var1) {
      this.a = fi.polar.polarflow.service.d.a(var1);
   }

   public void run() {
      this.a.a(0);
      this.a.a(2);
      this.a.a(1);
   }
}
