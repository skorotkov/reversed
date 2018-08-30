package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.joda.time.DateTime;

class bi extends BroadcastReceiver {
   // $FF: synthetic field
   final SleepTrackingService a;

   bi(SleepTrackingService var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      fi.polar.polarflow.util.d.c("SleepTrackingService", var2.getAction());
      if (this.a.d() && "DailyActivityService.action.LONG_TERM_NON_WEAR".equals(var2.getAction())) {
         DateTime var3 = (DateTime)var2.getSerializableExtra("DailyActivityService.extra.START_TIME");
         DateTime var4 = (DateTime)var2.getSerializableExtra("DailyActivityService.extra.END_TIME");
         SleepTrackingService.i(this.a).submit(new bq(this.a, var3, var4));
      } else if ("fi.polar.polarflow.action.FLUSH_LOGS".equals(var2.getAction())) {
         SleepTrackingService.i(this.a).submit(new bj(this));
      }

   }
}
