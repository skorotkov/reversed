package fi.polar.polarflow.ui.myday;

class q implements fi.polar.polarflow.ui.u {
   // $FF: synthetic field
   final StopSleepActivity a;

   q(StopSleepActivity var1) {
      this.a = var1;
   }

   public void a(fi.polar.polarflow.ui.q var1) {
      this.a.getFragmentManager().beginTransaction().remove(var1).commit();
      this.a.getFragmentManager().executePendingTransactions();
      StopSleepActivity.a(this.a).setVisibility(0);
      if (StopSleepActivity.c(this.a) != null) {
         if (!StopSleepActivity.c(this.a).a(StopSleepActivity.d(this.a), false, false)) {
            fi.polar.polarflow.util.d.e("StopSleepTrackingActivity", "forceEnd() returned false");
            this.a.finish();
         }
      } else {
         StopSleepActivity.b(this.a, true);
      }

   }

   public void b(fi.polar.polarflow.ui.q var1) {
      this.a.finish();
   }

   public void c(fi.polar.polarflow.ui.q var1) {
      this.a.finish();
   }

   public void d(fi.polar.polarflow.ui.q var1) {
      this.a.finish();
   }
}
