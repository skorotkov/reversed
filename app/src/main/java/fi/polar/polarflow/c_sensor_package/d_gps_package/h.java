package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.location.OnNmeaMessageListener;
import java.lang.ref.WeakReference;

class h implements OnNmeaMessageListener {
   private final WeakReference a;

   h(b_GpsLocationProvider var1) {
      this.a = new WeakReference(var1);
   }

   public void onNmeaMessage(String var1, long var2) {
      b_GpsLocationProvider var4 = (b_GpsLocationProvider)this.a.get();
      if (var4 != null && b_GpsLocationProvider.r(var4) && b_GpsLocationProvider.b(var4)) {
         i.a(b_GpsLocationProvider.f(var4), var1);
      }

   }
}
