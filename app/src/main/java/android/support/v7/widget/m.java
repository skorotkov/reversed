package android.support.v7.widget;

import android.view.View;

class m implements Runnable {
   // $FF: synthetic field
   final j a;
   private p b;

   public m(j var1, p var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      if (j.d(this.a) != null) {
         j.e(this.a).e();
      }

      View var1 = (View)j.f(this.a);
      if (var1 != null && var1.getWindowToken() != null && this.b.c()) {
         this.a.h = this.b;
      }

      this.a.j = null;
   }
}
