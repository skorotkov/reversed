package fi.polar.polarflow.service.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import fi.polar.polarflow.service.PresyncService;

class v implements ServiceConnection {
   // $FF: synthetic field
   final DailyActivityService a;

   v(DailyActivityService var1) {
      this.a = var1;
   }

   public void onServiceConnected(ComponentName var1, IBinder var2) {
      DailyActivityService.a(this.a, ((fi.polar.polarflow.service.i)var2).a());
      DailyActivityService.r(this.a).a(DailyActivityService.q(this.a));
   }

   public void onServiceDisconnected(ComponentName var1) {
      DailyActivityService.a(this.a, (PresyncService)null);
   }
}
