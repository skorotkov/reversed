package fi.polar.polarflow.service.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

class bh implements ServiceConnection {
   // $FF: synthetic field
   final SleepTrackingService a;

   bh(SleepTrackingService var1) {
      this.a = var1;
   }

   public void onServiceConnected(ComponentName var1, IBinder var2) {
      fi.polar.polarflow.util.d.c("SleepTrackingService", "mDailyActivityServiceConnection.onServiceConnected()");
      SleepTrackingService.a(this.a, ((x)var2).a());
      SleepTrackingService.a(this.a, SleepTrackingService.h(this.a).i());
   }

   public void onServiceDisconnected(ComponentName var1) {
      fi.polar.polarflow.util.d.c("SleepTrackingService", "mDailyActivityServiceConnection.onServiceDisconnected()");
      SleepTrackingService.a(this.a, (DailyActivityService)null);
   }
}
