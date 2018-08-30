package fi.polar.polarflow.ui.exewait;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class g implements AnimatorUpdateListener {
   // $FF: synthetic field
   final ExeWaitGridPager a;

   g(ExeWaitGridPager var1) {
      this.a = var1;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      Integer var2 = (Integer)var1.getAnimatedValue();
      this.a.scrollTo(var2, 0);
   }
}
