package fi.polar.polarflow.ui.myday;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class c implements AnimationListener {
   // $FF: synthetic field
   final DailyGoalReachedActivity a;

   c(DailyGoalReachedActivity var1) {
      this.a = var1;
   }

   public void onAnimationEnd(Animation var1) {
      DailyGoalReachedActivity.a(this.a, -1);
      this.a.finish();
      this.a.overridePendingTransition(2131034123, 2131034125);
   }

   public void onAnimationRepeat(Animation var1) {
   }

   public void onAnimationStart(Animation var1) {
   }
}
