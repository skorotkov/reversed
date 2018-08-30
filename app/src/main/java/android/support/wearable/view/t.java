package android.support.wearable.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

class t extends as {
   // $FF: synthetic field
   final DotsPageIndicator a;

   t(DotsPageIndicator var1) {
      this.a = var1;
   }

   public void a(Animator var1) {
      DotsPageIndicator.a(this.a, false);
      this.a.animate().alpha(0.0F).setListener((AnimatorListener)null).setStartDelay((long)DotsPageIndicator.b(this.a)).setDuration((long)DotsPageIndicator.a(this.a)).start();
   }
}
