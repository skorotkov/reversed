package fi.polar.polarflow.ui.custom;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class aa implements AnimatorUpdateListener {
   // $FF: synthetic field
   final RoundButtonListItemLayout a;

   aa(RoundButtonListItemLayout var1) {
      this.a = var1;
   }

   public void onAnimationUpdate(ValueAnimator var1) {
      if (RoundButtonListItemLayout.a(this.a) != null) {
         float var2 = (Float)var1.getAnimatedValue();
         float var3 = var1.getAnimatedFraction();
         if (var3 > RoundButtonListItemLayout.a(this.a).getAlpha()) {
            RoundButtonListItemLayout.a(this.a).setAlpha(var3);
         }

         RoundButtonListItemLayout.a(this.a).setY(var2);
      }

   }
}
