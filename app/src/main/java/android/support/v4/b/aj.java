package android.support.v4.b;

import android.view.View;
import android.view.animation.Animation;

class aj extends ak {
   // $FF: synthetic field
   final p a;
   // $FF: synthetic field
   final ah b;

   aj(ah var1, View var2, Animation var3, p var4) {
      super(var2, var3);
      this.b = var1;
      this.a = var4;
   }

   public void onAnimationEnd(Animation var1) {
      super.onAnimationEnd(var1);
      if (this.a.r() != null) {
         this.a.a((View)null);
         this.b.a(this.a, this.a.s(), 0, 0, false);
      }

   }
}
