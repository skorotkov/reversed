package fi.polar.polarflow.ui.exeview.laps;

class l implements Runnable {
   // $FF: synthetic field
   final LapNotificationView a;

   l(LapNotificationView var1) {
      this.a = var1;
   }

   public void run() {
      this.a.setVisibility(8);
   }
}
