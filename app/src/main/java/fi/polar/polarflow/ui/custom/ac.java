package fi.polar.polarflow.ui.custom;

class ac implements Runnable {
   // $FF: synthetic field
   final SensorToastView a;

   ac(SensorToastView var1) {
      this.a = var1;
   }

   public void run() {
      SensorToastView.a(this.a);
   }
}
