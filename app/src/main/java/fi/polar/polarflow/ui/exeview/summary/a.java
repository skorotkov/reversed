package fi.polar.polarflow.ui.exeview.summary;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.TrainingSession;

class a extends BroadcastReceiver {
   // $FF: synthetic field
   final SummaryActivity a;

   a(SummaryActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      fi.polar.polarflow.util.d.c(SummaryActivity.a(), "onReceive()");
      if ("TrainingService.action.TRAINING_SAVED_AND_PUBLISHED".equals(var2.getAction()) && var2.getLongExtra("TrainingService.key.TIMESTAMP", -1L) == SummaryActivity.a(this.a)) {
         TrainingSession var3 = TrainingSession.findByStartTime(SummaryActivity.a(this.a));
         if (var3 != null) {
            SummaryActivity.a(this.a, var3);
         }
      }

   }
}
