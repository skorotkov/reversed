package fi.polar.polarflow.ui.exeview.target;

class o implements Runnable {
   // $FF: synthetic field
   final n a;

   o(n var1) {
      this.a = var1;
   }

   public void run() {
      this.a.dismissAllowingStateLoss();
   }
}
