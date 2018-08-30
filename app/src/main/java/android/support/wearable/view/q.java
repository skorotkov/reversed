package android.support.wearable.view;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class q implements AnimationListener {
   // $FF: synthetic field
   final o a;

   q(o var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animation var1) {
      ((ViewGroup)o.a(this.a).getParent()).removeView(o.a(this.a));
      o.a(this.a, false);
      if (o.b(this.a) != null) {
         o.b(this.a).a();
      }

   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
   }
}
