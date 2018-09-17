package fi.polar.polarflow.service;

class r_PeriodicSavingTask implements Runnable {
   // $FF: synthetic field
   final TrainingService a_trainingService;

   r_PeriodicSavingTask(TrainingService var1) {
      this.a_trainingService = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("TrainingService", "mPeriodicSavingTask: Battery low, saving training session");
      this.a_trainingService.d_saveAndPublishSession();
      TrainingService.e(this.a_trainingService).postDelayed(TrainingService.d(this.a_trainingService), 60000L);
   }
}
