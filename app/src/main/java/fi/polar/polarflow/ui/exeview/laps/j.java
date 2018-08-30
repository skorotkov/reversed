package fi.polar.polarflow.ui.exeview.laps;

class j implements Runnable {
   // $FF: synthetic field
   final LapNotificationView a;

   j(LapNotificationView var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("LapNotificationView", "mRunnableHideAlpha()");
      this.a.animate().alpha(0.0F).setDuration(600L).withEndAction(new k(this)).start();
   }
}
