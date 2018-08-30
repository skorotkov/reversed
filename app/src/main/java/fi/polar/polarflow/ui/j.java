package fi.polar.polarflow.ui;

class j implements Runnable {
   // $FF: synthetic field
   final SyncActivity a;

   j(SyncActivity var1) {
      this.a = var1;
   }

   public void run() {
      if (SyncActivity.b(this.a) == 2) {
         this.a.finish();
      } else {
         SyncActivity.c(this.a);
      }

   }
}
