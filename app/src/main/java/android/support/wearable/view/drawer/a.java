package android.support.wearable.view.drawer;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.support.wearable.view.as;

class a extends as {
   // $FF: synthetic field
   final PageIndicatorView a;

   a(PageIndicatorView var1) {
      this.a = var1;
   }

   public void a(Animator var1) {
      PageIndicatorView.a(this.a, false);
      this.a.animate().alpha(0.0F).setListener((AnimatorListener)null).setStartDelay((long)PageIndicatorView.b(this.a)).setDuration((long)PageIndicatorView.a(this.a)).start();
   }
}
