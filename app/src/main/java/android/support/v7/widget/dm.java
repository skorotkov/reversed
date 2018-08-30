package android.support.v7.widget;

class dm implements Runnable {
   // $FF: synthetic field
   final dl a;

   dm(dl var1) {
      this.a = var1;
   }

   public void run() {
      if (this.a.r && !this.a.isLayoutRequested()) {
         if (!this.a.p) {
            this.a.requestLayout();
         } else if (this.a.t) {
            this.a.s = true;
         } else {
            this.a.c();
         }
      }

   }
}
