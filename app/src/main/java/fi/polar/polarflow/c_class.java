package fi.polar.polarflow;

import android.content.Context;
import fi.polar.polarflow.service.PeriodicJobService;
import fi.polar.polarflow.util.j;

class c_class implements Runnable {
   private final Context a;

   c_class(Context var1) {
      this.a = var1;
   }

   public void run() {
      j.a(this.a, false);
      PeriodicJobService.a(this.a);
   }
}
