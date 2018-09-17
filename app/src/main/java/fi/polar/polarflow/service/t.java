package fi.polar.polarflow.service;

import fi.polar.polarflow.data.TrainingDataRefs;

class t implements Runnable {
   // $FF: synthetic field
   final TrainingService a;

   t(TrainingService var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("TrainingService", "mStopSessionTask");
      TrainingService.b(this.a, false);
      TrainingDataRefs var1 = TrainingService.b_getTraining(this.a).getTrainingDataRefs(false);
      TrainingService.b_getTraining(this.a).stopSessionAndRelease();
      this.a.stopForeground(true);
      TrainingService.a_broadcastSessionStateChange(this.a, "TrainingService.action.TRAINING_STOPPED", var1.getEndTimeFromBoot());
      if (TrainingService.g(this.a)) {
         TrainingService.h(this.a).a(this.a.getApplicationContext(), true);
      } else {
         TrainingService.a_saveAndPublishSession(this.a, var1, TrainingService.i(this.a));
      }

      TrainingService.a(this.a, 0);
   }
}
