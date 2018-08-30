package fi.polar.polarflow.ui.exeview;

class l implements Runnable {
   // $FF: synthetic field
   final ExeViewActivity a;

   l(ExeViewActivity var1) {
      this.a = var1;
   }

   public void run() {
      ExeViewActivity.d(this.a).setSlideAnimationDuration(0);
      ExeViewActivity.b(this.a).a(ExeViewActivity.a(this.a, ExeViewActivity.a(this.a)));
      if (ExeViewActivity.l(this.a) == 1) {
         ExeViewActivity.d(this.a).setCurrentItem(ak.f);
         ExeViewActivity.d(this.a).invalidate();
      }

      ExeViewActivity.d(this.a).setSlideAnimationDuration(1500);
      ExeViewActivity.c(this.a, false);
      ExeViewActivity.d(this.a).animate().setDuration(0L).withEndAction(new m(this)).start();
   }
}
