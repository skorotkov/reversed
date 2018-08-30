package fi.polar.polarflow.ui;

class n implements Runnable {
   // $FF: synthetic field
   final SyncActivity a;

   n(SyncActivity var1) {
      this.a = var1;
   }

   public void run() {
      SyncActivity.f(this.a);
   }
}
