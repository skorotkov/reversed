package fi.polar.polarflow;

import android.content.Context;
import fi.polar.polarflow.service.activity.DailyActivityService;
import fi.polar.polarflow.service.activity.SleepTrackingService;

class e implements Runnable {
   private final Context a;

   e(Context var1) {
      this.a = var1;
   }

   public void run() {
      DailyActivityService.a(this.a);
      SleepTrackingService.a(this.a);
   }
}
