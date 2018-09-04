package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.location.GnssStatus.Callback;
import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;

import java.lang.ref.WeakReference;

class g extends Callback {
   private final WeakReference a;

   g(b_GpsLocationProvider var1) {
      this.a = new WeakReference(var1);
   }

   public void onFirstFix(int var1) {
      b_GpsLocationProvider var2 = (b_GpsLocationProvider)this.a.get();
      if (var2 != null) {
         fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "GnssStatus first fix, mLocationCalc.getFix():" + b_GpsLocationProvider.h(var2).getFix());
         var2.a_setState(m_SENSOR_STATE.d_READY);
      }

   }

   public void onStarted() {
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "onStarted()");
      b_GpsLocationProvider var1 = (b_GpsLocationProvider)this.a.get();
      if (var1 != null) {
         var1.a_setState(m_SENSOR_STATE.c_SEARCHING);
      }

   }

   public void onStopped() {
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "onStopped()");
      b_GpsLocationProvider var1 = (b_GpsLocationProvider)this.a.get();
      if (var1 != null && b_GpsLocationProvider.s(var1) != m_SENSOR_STATE.a_DISABLED) {
         var1.a_setState(m_SENSOR_STATE.b_NOT_READY);
      }

   }
}
