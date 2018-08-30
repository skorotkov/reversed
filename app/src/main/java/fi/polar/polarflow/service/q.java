package fi.polar.polarflow.service;

class q implements c {
   // $FF: synthetic field
   final TrainingService a;

   q(TrainingService var1) {
      this.a = var1;
   }

   public void a() {
      fi.polar.polarflow.util.d.c("TrainingService", "onBatteryLow()");
      if (TrainingService.b(this.a).isRunning()) {
         TrainingService.c(this.a);
      }

   }

   public void b() {
   }

   public void c() {
   }
}
