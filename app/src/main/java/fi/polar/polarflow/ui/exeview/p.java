package fi.polar.polarflow.ui.exeview;

class p implements Runnable {
   // $FF: synthetic field
   final ExeViewActivity a;

   p(ExeViewActivity var1) {
      this.a = var1;
   }

   public void run() {
      ExeViewActivity.o(this.a).animate().x(ExeViewActivity.n(this.a) + 30.0F).setStartDelay(1000L).start();
      if (ExeViewActivity.n(this.a) == 148.0F) {
         ExeViewActivity.p(this.a).setX(-65.0F);
         ExeViewActivity.p(this.a).setVisibility(0);
      } else {
         ExeViewActivity.p(this.a).setVisibility(8);
      }

   }
}
