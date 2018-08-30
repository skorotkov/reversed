package android.support.v7.widget;

class da implements Runnable {
   // $FF: synthetic field
   final ct a;

   da(ct var1) {
      this.a = var1;
   }

   public void run() {
      if (this.a.c != null && android.support.v4.view.bz.y(this.a.c) && this.a.c.getCount() > this.a.c.getChildCount() && this.a.c.getChildCount() <= this.a.d) {
         this.a.g.setInputMethodMode(2);
         this.a.a();
      }

   }
}
