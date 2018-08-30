package android.support.wearable.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class j implements AnimatorUpdateListener {
   // $FF: synthetic field
   final CircledImageView a;

   j(CircledImageView var1) {
      this.a = var1;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      int var2 = (Integer)var1.getAnimatedValue();
      if (var2 != CircledImageView.a(this.a)) {
         CircledImageView.a(this.a, var2);
         this.a.invalidate();
      }

   }
}
