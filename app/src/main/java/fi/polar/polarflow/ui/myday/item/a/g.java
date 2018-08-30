package fi.polar.polarflow.ui.myday.item.a;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class g implements AnimationListener {
   // $FF: synthetic field
   final e a;

   g(e var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animation var1) {
      e.b(this.a, false);
   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
      e.b(this.a, true);
   }
}
