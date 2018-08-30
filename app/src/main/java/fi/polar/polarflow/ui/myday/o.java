package fi.polar.polarflow.ui.myday;

class o implements Runnable {
   // $FF: synthetic field
   final MyDayGridPager a;
   // $FF: synthetic field
   final l b;

   o(l var1, MyDayGridPager var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      this.a.scrollTo(0, this.a.getScrollY());
   }
}
