package android.support.v7.widget;

import android.view.View;

class cu implements Runnable {
   // $FF: synthetic field
   final ct a;

   cu(ct var1) {
      this.a = var1;
   }

   public void run() {
      View var1 = this.a.i();
      if (var1 != null && var1.getWindowToken() != null) {
         this.a.a();
      }

   }
}
