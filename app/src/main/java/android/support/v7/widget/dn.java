package android.support.v7.widget;

class dn implements Runnable {
   // $FF: synthetic field
   final dl a;

   dn(dl var1) {
      this.a = var1;
   }

   public void run() {
      if (this.a.w != null) {
         this.a.w.a();
      }

      this.a.D = false;
   }
}
