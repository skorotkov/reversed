package fi.polar.polarflow.service;

class s implements fi.polar.polarflow.c_sensor_package.k {
   // $FF: synthetic field
   final TrainingService a;

   s(TrainingService var1) {
      this.a = var1;
   }

   public void a() {
      fi.polar.polarflow.util.d.c("TrainingService", "onStopCompleted");
      TrainingService.e(this.a).post(TrainingService.f(this.a));
   }
}
