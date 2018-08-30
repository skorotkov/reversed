package fi.polar.polarflow.ui.exeview.laps;

class k implements Runnable {
   // $FF: synthetic field
   final j a;

   k(j var1) {
      this.a = var1;
   }

   public void run() {
      this.a.a.setVisibility(8);
      LapNotificationView.a(this.a.a, false);
   }
}
