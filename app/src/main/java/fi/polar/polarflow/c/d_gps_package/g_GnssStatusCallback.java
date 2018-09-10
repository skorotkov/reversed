package fi.polar.polarflow.c.d_gps_package;

import android.location.GnssStatus.Callback;
import fi.polar.polarflow.c.m_SENSOR_STATE;

import java.lang.ref.WeakReference;

class g_GnssStatusCallback extends Callback {
   private final WeakReference a_gpsLocationProvider;

   g_GnssStatusCallback(b_GpsLocationProvider var1) {
      this.a_gpsLocationProvider = new WeakReference(var1);
   }

   public void onFirstFix(int var1) {
      b_GpsLocationProvider var2 = (b_GpsLocationProvider)this.a_gpsLocationProvider.get();
      if (var2 != null) {
         fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(), "GnssStatus first fix, mLocationCalc.getFix():" + b_GpsLocationProvider.h_getLocationDataCalculator(var2).getFix());
         var2.a_setState(m_SENSOR_STATE.d_READY);
      }

   }

   public void onStarted() {
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(), "onStarted()");
      b_GpsLocationProvider var1 = (b_GpsLocationProvider)this.a_gpsLocationProvider.get();
      if (var1 != null) {
         var1.a_setState(m_SENSOR_STATE.c_SEARCHING);
      }

   }

   public void onStopped() {
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(), "onStopped()");
      b_GpsLocationProvider var1 = (b_GpsLocationProvider)this.a_gpsLocationProvider.get();
      if (var1 != null && b_GpsLocationProvider.s_getState(var1) != m_SENSOR_STATE.a_DISABLED) {
         var1.a_setState(m_SENSOR_STATE.b_NOT_READY);
      }

   }
}
