package fi.polar.polarflow.ui.custom;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.ViewGroup.LayoutParams;

class ad implements AnimatorUpdateListener {
   // $FF: synthetic field
   final SensorToastView a;

   ad(SensorToastView var1) {
      this.a = var1;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      LayoutParams var2 = this.a.getLayoutParams();
      var2.width = (Integer)var1.getAnimatedValue();
      this.a.setLayoutParams(var2);
   }
}
