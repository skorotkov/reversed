package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.location.OnNmeaMessageListener;
import java.lang.ref.WeakReference;

class h_PolarNmeaMessageListener implements OnNmeaMessageListener {
   private final WeakReference a_gpsLocationProvider;

   h_PolarNmeaMessageListener(b_GpsLocationProvider var1) {
      this.a_gpsLocationProvider = new WeakReference(var1);
   }

   public void onNmeaMessage(String var1, long var2) {
      b_GpsLocationProvider var4 = (b_GpsLocationProvider)this.a_gpsLocationProvider.get();
      if (var4 != null && b_GpsLocationProvider.r(var4) && b_GpsLocationProvider.b(var4)) {
         i_GpsSensor.a_handleNmeaMessage(b_GpsLocationProvider.f(var4), var1);
      }

   }
}