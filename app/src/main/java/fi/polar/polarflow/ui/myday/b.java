package fi.polar.polarflow.ui.myday;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

class b implements Runnable {
   // $FF: synthetic field
   final DailyGoalReachedActivity a;

   b(DailyGoalReachedActivity var1) {
      this.a = var1;
   }

   public void run() {
      Animation var1 = AnimationUtils.loadAnimation(this.a, 2131034132);
      Animation var2 = AnimationUtils.loadAnimation(this.a, 2131034124);
      var2.setAnimationListener(DailyGoalReachedActivity.a(this.a));
      fi.polar.polarflow.ui.o.a((Context)this.a, (long[])DailyGoalReachedActivity.a());
      DailyGoalReachedActivity.b(this.a).setVisibility(0);
      DailyGoalReachedActivity.b(this.a).startAnimation(var1);
      DailyGoalReachedActivity.c(this.a).setVisibility(0);
      DailyGoalReachedActivity.c(this.a).startAnimation(var2);
   }
}
