package fi.polar.polarflow.ui.exeview;

import android.animation.Animator;
import android.support.wearable.view.as;

class ai extends as {
   // $FF: synthetic field
   final ab a;

   ai(ab var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animator var1) {
      ab.e(this.a).setClickable(true);
      if (!ab.h(this.a)) {
         ab.g(this.a).setVisibility(4);
         ab.f(this.a).setVisibility(0);
      } else {
         ab.g(this.a).setVisibility(0);
         ab.f(this.a).setVisibility(4);
      }

   }

   public void onAnimationStart(Animator var1) {
      ab.b(this.a).setClickable(false);
      ab.f(this.a).setVisibility(0);
      ab.g(this.a).setVisibility(0);
   }
}
