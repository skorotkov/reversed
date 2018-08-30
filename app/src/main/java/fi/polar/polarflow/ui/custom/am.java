package fi.polar.polarflow.ui.custom;

import android.animation.Animator;
import android.support.wearable.view.as;

class am extends as {
   // $FF: synthetic field
   final WearableLinearLayoutManager a;

   am(WearableLinearLayoutManager var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animator var1) {
      this.a.p();
   }
}
