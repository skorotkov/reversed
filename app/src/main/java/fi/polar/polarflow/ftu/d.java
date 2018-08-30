package fi.polar.polarflow.ftu;

class d implements Runnable {
   // $FF: synthetic field
   final GridAnimationActivity a;

   d(GridAnimationActivity var1) {
      this.a = var1;
   }

   public void run() {
      this.a.finish();
      this.a.overridePendingTransition(0, 17432577);
   }
}
