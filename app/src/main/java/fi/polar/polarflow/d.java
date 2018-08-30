package fi.polar.polarflow;

import android.content.Context;
import fi.polar.polarflow.util.y;

class d implements Runnable {
   private final Context a;

   d(Context var1) {
      this.a = var1;
   }

   public void run() {
      y.b(this.a, true);
   }
}
