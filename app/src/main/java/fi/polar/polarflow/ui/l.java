package fi.polar.polarflow.ui;

class l implements Runnable {
   // $FF: synthetic field
   final SyncActivity a;

   l(SyncActivity var1) {
      this.a = var1;
   }

   public void run() {
      SyncActivity.g(this.a);
      fi.polar.polarflow.util.y.a(this.a);
   }
}
