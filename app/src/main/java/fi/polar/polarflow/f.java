package fi.polar.polarflow;

import android.content.Context;
import fi.polar.polarflow.service.TrainingService;

class f implements Runnable {
   private final Context a;

   f(Context var1) {
      this.a = var1;
   }

   public void run() {
      TrainingService.a_start(this.a);
   }
}
