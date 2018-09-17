package fi.polar.polarflow.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.SportProfile;

class p_TrainingServiceBroadcastReceiver extends BroadcastReceiver {
   // $FF: synthetic field
   final TrainingService a_trainingService;

   p_TrainingServiceBroadcastReceiver(TrainingService var1) {
      this.a_trainingService = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var5 = var2.getAction();
      fi.polar.polarflow.util.d.c("TrainingService", var5);
      if (TrainingService.a_getSessionState(this.a_trainingService) == 2) {
         fi.polar.polarflow.util.d.e("TrainingService", "Message is ignored. Session is stopping");
      } else if ("TrainingService.action.STOP_SESSION".equals(var5)) {
         if (TrainingService.a_getSessionState(this.a_trainingService) == 1) {
            TrainingService.a(this.a_trainingService, var2.getBooleanExtra("TrainingService.key.SKIP_SESSION_SAVE", false));
            this.a_trainingService.a_stopSession();
         } else {
            fi.polar.polarflow.util.d.e("TrainingService", "ACTION_STOP_SESSION, but session was already stopped!");
         }
      } else if ("TrainingService.action.START_SESSION".equals(var5)) {
         long var3 = var2.getLongExtra(SportProfile.KEY_SPORT_ID, 0L);
         TrainingService.a_startSession(this.a_trainingService, var3, var2.getStringExtra("TrainingService.extra.TRAINING_TARGET_PATH"));
      } else if ("TrainingService.action.PAUSE_SESSION".equals(var5)) {
         this.a_trainingService.b_pauseSession();
         TrainingService.a_broadcastSessionStateChange(this.a_trainingService, "TrainingService.action.TRAINING_PAUSED", 0L);
      } else if ("TrainingService.action.RESUME_SESSION".equals(var5)) {
         this.a_trainingService.c_resumeSession();
         TrainingService.a_broadcastSessionStateChange(this.a_trainingService, "TrainingService.action.TRAINING_RESUMED", 0L);
      } else if ("DailyActivityService.action.TRAINING_LOAD_DATA".equals(var5) && TrainingService.a_getSessionState(this.a_trainingService) == 1) {
         TrainingService.b_getTraining(this.a_trainingService).setTrainingLoad(var2.getIntExtra("DailyActivityService.extra.TRAINING_LOAD", -1));
         TrainingService.b_getTraining(this.a_trainingService).setRecoveryTime(var2.getLongExtra("DailyActivityService.extra.RECOVERY_TIME", -1L));
         TrainingService.b_getTraining(this.a_trainingService).setCalories(var2.getIntExtra("DailyActivityService.extra.TOTAL_CALORIES", -1));
         TrainingService.b_getTraining(this.a_trainingService).setFatConsumption(var2.getIntExtra("DailyActivityService.extra.FAT_CONSUMPTION", -1));
      }

   }
}
