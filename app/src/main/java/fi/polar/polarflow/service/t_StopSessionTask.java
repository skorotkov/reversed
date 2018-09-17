package fi.polar.polarflow.service;

import fi.polar.polarflow.data.TrainingDataRefs;

class t_StopSessionTask implements Runnable {
   // $FF: synthetic field
   final TrainingService a_trainingService;

   t_StopSessionTask(TrainingService var1) {
      this.a_trainingService = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("TrainingService", "mStopSessionTask");
      TrainingService.b(this.a_trainingService, false);
      TrainingDataRefs var1 = TrainingService.b_getTraining(this.a_trainingService).getTrainingDataRefs(false);
      TrainingService.b_getTraining(this.a_trainingService).stopSessionAndRelease();
      this.a_trainingService.stopForeground(true);
      TrainingService.a_broadcastSessionStateChange(this.a_trainingService, "TrainingService.action.TRAINING_STOPPED", var1.getEndTimeFromBoot());
      if (TrainingService.g(this.a_trainingService)) {
         TrainingService.h(this.a_trainingService).a(this.a_trainingService.getApplicationContext(), true);
      } else {
         TrainingService.a_saveAndPublishSession(this.a_trainingService, var1, TrainingService.i(this.a_trainingService));
      }

      TrainingService.a_setSessionState(this.a_trainingService, 0);
   }
}
