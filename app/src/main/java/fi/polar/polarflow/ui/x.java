package fi.polar.polarflow.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class x implements AnimationListener {
   // $FF: synthetic field
   final v a;

   x(v var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animation var1) {
      v.c(this.a).postDelayed(v.b(this.a), 3000L);
      v.a(this.a, ad.c);
   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
   }
}
