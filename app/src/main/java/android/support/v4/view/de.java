package android.support.v4.view;

class de implements Runnable {
   // $FF: synthetic field
   final ViewPager a;

   de(ViewPager var1) {
      this.a = var1;
   }

   public void run() {
      this.a.setScrollState(0);
      this.a.c();
   }
}
