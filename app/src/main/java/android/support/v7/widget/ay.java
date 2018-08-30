package android.support.v7.widget;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class ay implements OnGlobalLayoutListener {
   // $FF: synthetic field
   final aw a;

   ay(aw var1) {
      this.a = var1;
   }

   public void onGlobalLayout() {
      if (!this.a.a((View)this.a.b)) {
         this.a.c();
      } else {
         this.a.f();
         aw.a(this.a);
      }

   }
}
