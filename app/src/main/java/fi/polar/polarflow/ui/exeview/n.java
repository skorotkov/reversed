package fi.polar.polarflow.ui.exeview;

class n implements Runnable {
   // $FF: synthetic field
   final ExeViewActivity a;

   n(ExeViewActivity var1) {
      this.a = var1;
   }

   public void run() {
      ExeViewActivity.d(this.a).setCurrentItem(ExeViewActivity.m(this.a));
      ExeViewActivity.d(this.a).setSlideAnimationDuration(600);
      ExeViewActivity.a(this.a, ak.b);
   }
}
