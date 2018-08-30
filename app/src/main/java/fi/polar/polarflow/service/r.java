package fi.polar.polarflow.service;

class r implements Runnable {
   // $FF: synthetic field
   final TrainingService a;

   r(TrainingService var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("TrainingService", "mPeriodicSavingTask: Battery low, saving training session");
      this.a.d();
      TrainingService.e(this.a).postDelayed(TrainingService.d(this.a), 60000L);
   }
}
