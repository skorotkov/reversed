package fi.polar.polarflow.ui.exeview;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class ag implements AnimatorUpdateListener {
   // $FF: synthetic field
   final ab a;

   ag(ab var1) {
      this.a = var1;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      float var2 = (Float)var1.getAnimatedValue();
      ab.f(this.a).setAlpha(var2);
      ab.f(this.a).setScaleX(var2 * 0.5F + 0.5F);
      ab.f(this.a).setScaleY(var2 * 0.5F + 0.5F);
      ab.f(this.a).setTranslationY(50.0F - var2 * 50.0F);
   }
}
