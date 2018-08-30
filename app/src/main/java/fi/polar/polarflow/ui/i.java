package fi.polar.polarflow.ui;

class i implements Runnable {
   // $FF: synthetic field
   final long a;
   // $FF: synthetic field
   final SyncActivity b;

   i(SyncActivity var1, long var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      SyncActivity.a(this.b).animate().alpha(0.0F).setStartDelay(this.a);
   }
}
