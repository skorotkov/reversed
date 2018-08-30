package fi.polar.polarflow.ui.exeview;

class v implements Runnable {
   // $FF: synthetic field
   final u a;

   v(u var1) {
      this.a = var1;
   }

   public void run() {
      ExeViewActivity.p(this.a.a).setVisibility(8);
      ExeViewActivity.p(this.a.a).setX(ExeViewActivity.n(this.a.a));
   }
}
