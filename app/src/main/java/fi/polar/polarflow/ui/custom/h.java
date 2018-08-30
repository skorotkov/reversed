package fi.polar.polarflow.ui.custom;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class h implements AnimatorUpdateListener {
   // $FF: synthetic field
   final CircularProgressBar a;

   h(CircularProgressBar var1) {
      this.a = var1;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      Float var3 = (Float)CircularProgressBar.a(this.a).getAnimatedValue();
      float var2 = (3000.0F - var3 * (float)CircularProgressBar.b(this.a)) / 1000.0F;
      CircularProgressBar.c(this.a).setProgress(var3);
      CircularProgressBar.d(this.a).setText(String.valueOf(Math.round(Float.valueOf(var2))));
   }
}
