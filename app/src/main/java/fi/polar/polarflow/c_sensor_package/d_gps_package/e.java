package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import fi.polar.polarflow.c_sensor_package.b_PolarSensorEvent;

class e extends BroadcastReceiver {
   // $FF: synthetic field
   final b_GpsLocationProvider a;

   e(b_GpsLocationProvider var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(var2.getAction())) {
         boolean var3 = b_GpsLocationProvider.c(this.a).a();
         fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "onReceive: ACTION_POWER_SAVE_MODE_CHANGED, enabled= " + var3);
         if (var3) {
            this.a.t = b_GpsLocationProvider.d(this.a).b();
            this.a.u = false;
            b_GpsLocationProvider.e(this.a).a((b_PolarSensorEvent)this.a.k());
            i.c(b_GpsLocationProvider.f(this.a));
         } else {
            i.b(b_GpsLocationProvider.f(this.a));
         }
      }

   }
}
