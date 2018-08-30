package fi.polar.polarflow.ui.myday;

import android.view.View;
import android.view.View.OnClickListener;

class d implements OnClickListener {
   // $FF: synthetic field
   final DailyGoalReachedActivity a;

   d(DailyGoalReachedActivity var1) {
      this.a = var1;
   }

   public void onClick(View var1) {
      DailyGoalReachedActivity.a(this.a, 0);
      this.a.finish();
      this.a.overridePendingTransition(2131034123, 2131034125);
   }
}
