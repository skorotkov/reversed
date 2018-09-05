package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import fi.polar.polarflow.c_sensor_package.b_PolarSensorEventBase;

class e_PowerSaveModeBroadcastReceiver extends BroadcastReceiver {
   // $FF: synthetic field
   final b_GpsLocationProvider a_gpsLocationProvider;

   e_PowerSaveModeBroadcastReceiver(b_GpsLocationProvider var1) {
      this.a_gpsLocationProvider = var1;
   }

   public void onReceive(Context context, Intent intent) {
      if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
         boolean var3 = b_GpsLocationProvider.c(this.a_gpsLocationProvider).a();
         fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(), "onReceive: ACTION_POWER_SAVE_MODE_CHANGED, enabled= " + var3);
         if (var3) {
            this.a_gpsLocationProvider.t = b_GpsLocationProvider.d(this.a_gpsLocationProvider).b();
            this.a_gpsLocationProvider.u_fix = false;
            b_GpsLocationProvider.e(this.a_gpsLocationProvider).a((b_PolarSensorEventBase)this.a_gpsLocationProvider.k());
            i_GpsSensor.c(b_GpsLocationProvider.f(this.a_gpsLocationProvider));
         } else {
            i_GpsSensor.b(b_GpsLocationProvider.f(this.a_gpsLocationProvider));
         }
      }

   }
}
