package android.support.wearable.view;

import android.animation.Animator;

class az extends as {
   // $FF: synthetic field
   final au a;

   az(au var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animator var1) {
      if (!this.a()) {
         au.b(this.a, true);
      }

   }
}
