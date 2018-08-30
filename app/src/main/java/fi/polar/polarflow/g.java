package fi.polar.polarflow;

import android.content.Context;
import fi.polar.polarflow.util.y;

class g implements Runnable {
   private final Context a;

   g(Context var1) {
      this.a = var1;
   }

   public void run() {
      y.a(this.a);
   }
}
