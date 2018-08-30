package fi.polar.polarflow.ui.exeview.screenlock;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class b implements AnimationListener {
   // $FF: synthetic field
   final SwipeDownHintView a;

   b(SwipeDownHintView var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animation var1) {
      this.a.setVisibility(8);
   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
   }
}
