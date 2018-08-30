package fi.polar.polarflow.ui.custom;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class i implements AnimatorListener {
   // $FF: synthetic field
   final CircularProgressBar a;

   i(CircularProgressBar var1) {
      this.a = var1;
   }

   public void onAnimationCancel(Animator var1) {
      fi.polar.polarflow.util.d.d(CircularProgressBar.d(), "onAnimationCancel");
   }

   public void onAnimationEnd(Animator var1) {
      fi.polar.polarflow.util.d.d(CircularProgressBar.d(), "mProgressAnimatorListener onAnimationEnd");
      CircularProgressBar var3 = this.a;
      boolean var2;
      if (!CircularProgressBar.f(this.a)) {
         var2 = true;
      } else {
         var2 = false;
      }

      CircularProgressBar.a(var3, var2);
      if (CircularProgressBar.e(this.a) != null) {
         if (CircularProgressBar.g(this.a)) {
            CircularProgressBar.e(this.a).b();
         } else {
            CircularProgressBar.e(this.a).c();
         }
      }

   }

   public void onAnimationRepeat(Animator var1) {
      fi.polar.polarflow.util.d.d(CircularProgressBar.d(), "onAnimationRepeat");
   }

   public void onAnimationStart(Animator var1) {
      fi.polar.polarflow.util.d.d(CircularProgressBar.d(), "mProgressAnimatorListener onAnimationStart");
      if (CircularProgressBar.e(this.a) != null) {
         CircularProgressBar.e(this.a).a();
      }

   }
}
