package fi.polar.polarflow.ui.exeview;

class m implements Runnable {
   // $FF: synthetic field
   final l a;

   m(l var1) {
      this.a = var1;
   }

   public void run() {
      ExeViewActivity.d(this.a.a).setCurrentItem(ak.b);
      ExeViewActivity.d(this.a.a).setSlideAnimationDuration(600);
   }
}
