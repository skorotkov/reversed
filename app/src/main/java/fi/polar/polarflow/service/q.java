package fi.polar.polarflow.service;

class q implements c_BatteryManagerListener {
   // $FF: synthetic field
   final TrainingService a;

   q(TrainingService var1) {
      this.a = var1;
   }

   public void a_onBatteryLow() {
      fi.polar.polarflow.util.d.c("TrainingService", "onBatteryLow()");
      if (TrainingService.b_getTraining(this.a).isRunning()) {
         TrainingService.c(this.a);
      }

   }

   public void b_onBatterySafeForOperations() {
   }

   public void c_BatteryNotSafeForOperations() {
   }
}
