package fi.polar.polarflow.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.SportProfile;

class p extends BroadcastReceiver {
   // $FF: synthetic field
   final TrainingService a;

   p(TrainingService var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var5 = var2.getAction();
      fi.polar.polarflow.util.d.c("TrainingService", var5);
      if (TrainingService.a(this.a) == 2) {
         fi.polar.polarflow.util.d.e("TrainingService", "Message is ignored. Session is stopping");
      } else if ("TrainingService.action.STOP_SESSION".equals(var5)) {
         if (TrainingService.a(this.a) == 1) {
            TrainingService.a(this.a, var2.getBooleanExtra("TrainingService.key.SKIP_SESSION_SAVE", false));
            this.a.a();
         } else {
            fi.polar.polarflow.util.d.e("TrainingService", "ACTION_STOP_SESSION, but session was already stopped!");
         }
      } else if ("TrainingService.action.START_SESSION".equals(var5)) {
         long var3 = var2.getLongExtra(SportProfile.KEY_SPORT_ID, 0L);
         TrainingService.a(this.a, var3, var2.getStringExtra("TrainingService.extra.TRAINING_TARGET_PATH"));
      } else if ("TrainingService.action.PAUSE_SESSION".equals(var5)) {
         this.a.b();
         TrainingService.a(this.a, "TrainingService.action.TRAINING_PAUSED", 0L);
      } else if ("TrainingService.action.RESUME_SESSION".equals(var5)) {
         this.a.c();
         TrainingService.a(this.a, "TrainingService.action.TRAINING_RESUMED", 0L);
      } else if ("DailyActivityService.action.TRAINING_LOAD_DATA".equals(var5) && TrainingService.a(this.a) == 1) {
         TrainingService.b(this.a).setTrainingLoad(var2.getIntExtra("DailyActivityService.extra.TRAINING_LOAD", -1));
         TrainingService.b(this.a).setRecoveryTime(var2.getLongExtra("DailyActivityService.extra.RECOVERY_TIME", -1L));
         TrainingService.b(this.a).setCalories(var2.getIntExtra("DailyActivityService.extra.TOTAL_CALORIES", -1));
         TrainingService.b(this.a).setFatConsumption(var2.getIntExtra("DailyActivityService.extra.FAT_CONSUMPTION", -1));
      }

   }
}
