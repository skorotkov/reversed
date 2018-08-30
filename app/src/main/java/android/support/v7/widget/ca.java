package android.support.v7.widget;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class ca implements OnGlobalLayoutListener {
   boolean a;
   // $FF: synthetic field
   final by b;

   ca(by var1) {
      this.b = var1;
      this.a = android.support.v4.view.bz.y(this.b.c);
   }

   public void onGlobalLayout() {
      boolean var1 = this.a;
      this.a = android.support.v4.view.bz.y(this.b.c);
      if (var1 && !this.a) {
         by.a(this.b);
      }

   }
}
