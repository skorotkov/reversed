package fi.polar.polarflow.ui;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.RelativeLayout.LayoutParams;

class y implements AnimationListener {
   // $FF: synthetic field
   final v a;

   y(v var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animation var1) {
      LayoutParams var2 = (LayoutParams)v.d(this.a).getLayoutParams();
      var2.addRule(3, 2131755540);
      v.d(this.a).setLayoutParams(var2);
      v.a(this.a, ad.e);
   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
   }
}
