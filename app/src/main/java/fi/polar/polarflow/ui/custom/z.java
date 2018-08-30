package fi.polar.polarflow.ui.custom;

import android.animation.Animator;
import android.support.wearable.view.as;

class z extends as {
   // $FF: synthetic field
   final RoundButtonListItemLayout a;

   z(RoundButtonListItemLayout var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animator var1) {
      if (RoundButtonListItemLayout.a(this.a) != null) {
         RoundButtonListItemLayout.a(this.a).setClickable(true);
         RoundButtonListItemLayout.a(this.a).setY((float)this.a.a);
         RoundButtonListItemLayout.a(this.a).setAlpha(1.0F);
      }

   }
}
