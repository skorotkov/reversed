package fi.polar.polarflow.ui.custom;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class af implements AnimatorListener {
   // $FF: synthetic field
   final SensorToastView a;

   af(SensorToastView var1) {
      this.a = var1;
   }

   public void onAnimationCancel(Animator var1) {
   }

   public void onAnimationEnd(Animator var1) {
   }

   public void onAnimationRepeat(Animator var1) {
   }

   public void onAnimationStart(Animator var1) {
      SensorToastView.b(this.a).setVisibility(8);
   }
}
