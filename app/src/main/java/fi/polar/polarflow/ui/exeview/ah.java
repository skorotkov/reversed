package fi.polar.polarflow.ui.exeview;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class ah implements AnimatorUpdateListener {
   // $FF: synthetic field
   final ab a;

   ah(ab var1) {
      this.a = var1;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      float var2 = (Float)var1.getAnimatedValue();
      ab.g(this.a).setAlpha(var2);
      ab.g(this.a).setScaleX(1.5F - var2 * 0.5F);
      ab.g(this.a).setScaleY(1.5F - var2 * 0.5F);
      ab.g(this.a).setY(var2 * 100.0F - 100.0F);
   }
}
