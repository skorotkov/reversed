package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class aj implements OnGlobalLayoutListener {
   // $FF: synthetic field
   final ai a;

   aj(ai var1) {
      this.a = var1;
   }

   public void onGlobalLayout() {
      if (this.a.d() && !this.a.a.g()) {
         View var1 = this.a.b;
         if (var1 != null && var1.isShown()) {
            this.a.a.a();
         } else {
            this.a.c();
         }
      }

   }
}
