package android.support.v7.widget;

class g implements Runnable {
   // $FF: synthetic field
   final ActionBarOverlayLayout a;

   g(ActionBarOverlayLayout var1) {
      this.a = var1;
   }

   public void run() {
      this.a.c();
      this.a.c = android.support.v4.view.bz.p(this.a.a).c((float)(-this.a.a.getHeight())).a(this.a.d);
   }
}
