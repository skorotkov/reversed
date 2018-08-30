package android.support.wearable.view;

class ae implements Runnable {
   // $FF: synthetic field
   final GridViewPager a;

   ae(GridViewPager var1) {
      this.a = var1;
   }

   public void run() {
      GridViewPager.a((GridViewPager)this.a, 0);
      GridViewPager.a(this.a);
   }
}
