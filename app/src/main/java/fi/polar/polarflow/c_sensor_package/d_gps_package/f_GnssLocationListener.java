package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;

import java.lang.ref.WeakReference;

class f_GnssLocationListener implements LocationListener {
   private final WeakReference a;

   f_GnssLocationListener(b_GpsLocationProvider var1) {
      this.a = new WeakReference(var1);
   }

   private void a(m_SENSOR_STATE var1) {
      if (this.a.get() != null) {
         ((b_GpsLocationProvider)this.a.get()).a_setState(var1);
      }

   }

   public void onLocationChanged(Location var1) {
   }

   public void onProviderDisabled(String var1) {
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "mLocationListener onProviderDisabled: " + var1);
      this.a(m_SENSOR_STATE.a_DISABLED);
   }

   public void onProviderEnabled(String var1) {
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "mLocationListener onProviderEnabled: " + var1);
      this.a(m_SENSOR_STATE.c_SEARCHING);
   }

   public void onStatusChanged(String var1, int var2, Bundle var3) {
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "GnssLocationListener onStatusChanged, provider: " + var1);
      switch(var2) {
      case 0:
         fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "GnssLocationListener onStatusChanged: OUT_OF_SERVICE");
         this.a(m_SENSOR_STATE.a_DISABLED);
         break;
      case 1:
         fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "GnssLocationListener onStatusChanged: TEMPORARILY_UNAVAILABLE");
         this.a(m_SENSOR_STATE.c_SEARCHING);
         break;
      case 2:
         fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "GnssLocationListener onStatusChanged: AVAILABLE");
         this.a(m_SENSOR_STATE.d_READY);
      }

   }
}
