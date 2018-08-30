package fi.polar.polarflow.ui.exewait;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class z implements AnimatorListener {
   // $FF: synthetic field
   final x a;

   z(x var1) {
      this.a = var1;
   }

   public void onAnimationCancel(Animator var1) {
   }

   public void onAnimationEnd(Animator var1) {
      x.a(this.a);
      x.b(this.a);
   }

   public void onAnimationRepeat(Animator var1) {
   }

   public void onAnimationStart(Animator var1) {
   }
}
