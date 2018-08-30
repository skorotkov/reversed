package fi.polar.polarflow.ui.myday.item.a;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class f implements AnimationListener {
   // $FF: synthetic field
   final e a;

   f(e var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animation var1) {
      if (e.a(this.a).getDisplayedChild() == 0) {
         e.a(this.a).stopFlipping();
      }

      e.a(this.a, false);
   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
      e.a(this.a, true);
   }
}
