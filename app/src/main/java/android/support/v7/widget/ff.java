package android.support.v7.widget;

import android.view.View;

class ff implements Runnable {
   // $FF: synthetic field
   final View a;
   // $FF: synthetic field
   final fe b;

   ff(fe var1, View var2) {
      this.b = var1;
      this.a = var2;
   }

   public void run() {
      int var1 = this.a.getLeft();
      int var2 = (this.b.getWidth() - this.a.getWidth()) / 2;
      this.b.smoothScrollTo(var1 - var2, 0);
      this.b.a = null;
   }
}
