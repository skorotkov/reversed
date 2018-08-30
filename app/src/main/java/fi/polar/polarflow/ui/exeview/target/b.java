package fi.polar.polarflow.ui.exeview.target;

class b implements Runnable {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public void run() {
      this.a.dismissAllowingStateLoss();
   }
}
