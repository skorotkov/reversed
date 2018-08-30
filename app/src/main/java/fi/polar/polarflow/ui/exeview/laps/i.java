package fi.polar.polarflow.ui.exeview.laps;

class i implements Runnable {
   // $FF: synthetic field
   final LapNotificationView a;

   i(LapNotificationView var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("LapNotificationView", "mRunnableHideAnimate()");
      LapNotificationView.a(this.a);
   }
}
