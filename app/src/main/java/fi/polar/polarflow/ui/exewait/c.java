package fi.polar.polarflow.ui.exewait;

class c implements Runnable {
   // $FF: synthetic field
   final ExeWaitActivity a;

   c(ExeWaitActivity var1) {
      this.a = var1;
   }

   public void run() {
      fi.polar.polarflow.util.d.c("ExeWaitActivity", "30 minutes from coming to ExeWait, returning to watch face.");
      this.a.finishAffinity();
   }
}
