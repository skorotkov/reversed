package fi.polar.polarflow.ui.myday;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import fi.polar.polarflow.service.activity.SleepTrackingService;
import fi.polar.polarflow.service.activity.bm;

class s implements ServiceConnection {
   // $FF: synthetic field
   final StopSleepActivity a;

   s(StopSleepActivity var1) {
      this.a = var1;
   }

   public void onServiceConnected(ComponentName var1, IBinder var2) {
      StopSleepActivity.a(this.a, ((bm)var2).a());
      if (StopSleepActivity.j(this.a)) {
         StopSleepActivity.b(this.a, false);
         StopSleepActivity.c(this.a).a(StopSleepActivity.d(this.a), false, false);
      }

   }

   public void onServiceDisconnected(ComponentName var1) {
      StopSleepActivity.a(this.a, (SleepTrackingService)null);
   }
}
