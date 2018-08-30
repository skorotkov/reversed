package fi.polar.polarflow.ui.exeview.target;

class e implements Runnable {
   // $FF: synthetic field
   final d a;

   e(d var1) {
      this.a = var1;
   }

   public void run() {
      this.a.dismissAllowingStateLoss();
   }
}
