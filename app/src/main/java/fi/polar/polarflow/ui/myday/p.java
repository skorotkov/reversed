package fi.polar.polarflow.ui.myday;

import fi.polar.polarflow.service.activity.bo;

class p implements bo {
   // $FF: synthetic field
   final StopSleepActivity a;

   p(StopSleepActivity var1) {
      this.a = var1;
   }

   public void a(fi.polar.polarflow.util.b.a var1) {
      StopSleepActivity.a(this.a).setVisibility(8);
      if (var1 != null) {
         StopSleepActivity.a(this.a, true);
         StopSleepActivity.a(this.a, var1.c());
         fi.polar.polarflow.ui.myday.a.a var2 = fi.polar.polarflow.ui.myday.a.a.a(Integer.MAX_VALUE);
         var2.a(StopSleepActivity.b(this.a));
         this.a.getFragmentManager().beginTransaction().add(2131755520, var2).commit();
      } else {
         fi.polar.polarflow.util.d.e("StopSleepTrackingActivity", "force end did not produce result");
         fi.polar.polarflow.ui.o.a(this.a.getApplicationContext(), fi.polar.polarflow.util.b.b);
         fi.polar.polarflow.ui.myday.sleep.a var3 = new fi.polar.polarflow.ui.myday.sleep.a();
         this.a.getFragmentManager().beginTransaction().add(2131755520, var3).commit();
      }

      this.a.getFragmentManager().executePendingTransactions();
   }
}
