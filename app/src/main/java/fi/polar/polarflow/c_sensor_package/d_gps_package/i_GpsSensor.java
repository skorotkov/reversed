package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.location.GnssStatus.Callback;

import fi.polar.polarflow.c_sensor_package.b_PolarSensorEvent;
import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.util.v;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentCalculatorAndroidImpl;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentOutput;
import fi.polar.polarmathsmart.gps.LocationDataCalculator;

class i_GpsSensor {
   // $FF: synthetic field
   final b_GpsLocationProvider a_gpsLocationProvider;
   private final LocationManager b_systemLocationManager;
   private final j_NmeaFilter c_nmeaFilter;
   private final Callback d_gnssStatusCallback;
   private final LocationListener e_gnssLocationListener;
   private final OnNmeaMessageListener f_nmeaMessageListener;

   private i_GpsSensor(b_GpsLocationProvider var1) {
      this.a_gpsLocationProvider = var1;
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "GpsSensor");
      this.b_systemLocationManager = (LocationManager) b_GpsLocationProvider.g(var1).getSystemService(Context.LOCATION_SERVICE);
      this.c_nmeaFilter = new j_NmeaFilter();
      this.f_nmeaMessageListener = new h_PolarNmeaMessageListener(var1);
      this.e_gnssLocationListener = new f_GnssLocationListener(var1);
      this.d_gnssStatusCallback = new g_GnssStatusCallback(var1);
   }

   // $FF: synthetic method
   i_GpsSensor(b_GpsLocationProvider var1, c_GpsPolarSensorEventListener var2) {
      this(var1);
   }

   private void a() {
      // $FF: Couldn't be decompiled

      // decompiled after remove of try ... catch
      Object var1 = this.a_gpsLocationProvider.v;
      this.a_gpsLocationProvider.t = fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.i(this.a_gpsLocationProvider);
      this.a_gpsLocationProvider.u = fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getFix();
      this.a_gpsLocationProvider.k = fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getNumberOfSatellites();
      this.a_gpsLocationProvider.i = fi.polar.polarflow.a_package.a.b(4, fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getAltitudeInMeters(true));
      this.a_gpsLocationProvider.j = fi.polar.polarflow.a_package.a.b(4, fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getAltitudeInMeters(false));
      this.a_gpsLocationProvider.o = (float)fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.a(fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getSpeedInMetersPerSecond());
      this.a_gpsLocationProvider.g = fi.polar.polarflow.a_package.a.b(5, fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getLatitudeInDecimalDegrees());
      this.a_gpsLocationProvider.h = fi.polar.polarflow.a_package.a.b(6, fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getLongitudeInDecimalDegrees());
      AscentDescentOutput var2 = null;
      if (fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.k(this.a_gpsLocationProvider) != null) {
         var2 = fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.k(this.a_gpsLocationProvider).addAltitude((float)this.a_gpsLocationProvider.i);
      }

      this.a_gpsLocationProvider.a_setState(m_SENSOR_STATE.d_READY);
      if (fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.l(this.a_gpsLocationProvider)) {
         this.a_gpsLocationProvider.l = (float)fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getDistanceInMeters();
         if (fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.k(this.a_gpsLocationProvider) == null && !Double.isNaN(this.a_gpsLocationProvider.i)) {
            fi.polar.polarflow.c_sensor_package.d_gps_package.b_GpsLocationProvider.a(this.a_gpsLocationProvider, new AscentDescentCalculatorAndroidImpl(1, (float)this.a_gpsLocationProvider.i));
         } else if (var2 != null) {
            this.a_gpsLocationProvider.r = var2.getAscent();
            this.a_gpsLocationProvider.s = var2.getDescent();
         }

         this.a(this.a_gpsLocationProvider.p(), this.a_gpsLocationProvider.o(), this.a_gpsLocationProvider.l(), this.a_gpsLocationProvider.q(), this.a_gpsLocationProvider.r());
      }
   }

   private void a(float var1, float var2, double var3, float var5, float var6) {
      Intent var7 = new Intent("fi.polar.polarflow.ACTION_LOCATION_DATA");
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE", "fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR");
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_CURRENT_SPEED_VALUE", var1);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE", var2);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ALTITUDE_VALUE", var3);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ASCENT_VALUE", var5);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DESCENT_VALUE", var6);
      var7.putExtra("fi.polar.polarflow.SENSOR_STATE", b_GpsLocationProvider.m_getState(this.a_gpsLocationProvider));
      v.a().b(var7);
   }

   // $FF: synthetic method
   static void a(i_GpsSensor var0) {
      var0.a();
   }

   // $FF: synthetic method
   static void a_handleNmeaMessage(i_GpsSensor var0, String var1) {
      var0.a_handleNmeaMessage(var1);
   }

   private void a_handleNmeaMessage(String var1) {
      long var2 = b_GpsLocationProvider.d(this.a_gpsLocationProvider).b();
      boolean var4 = b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getFix();
      if (this.c_nmeaFilter.a(var1)) {
         if (b_GpsLocationProvider.i(this.a_gpsLocationProvider) == 0L) {
            b_GpsLocationProvider.a(this.a_gpsLocationProvider, var2);
            fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "First NMEAs handled, diff to GPS start time(" + b_GpsLocationProvider.i(this.a_gpsLocationProvider) + " - " + b_GpsLocationProvider.j(this.a_gpsLocationProvider) + ") :" + (b_GpsLocationProvider.i(this.a_gpsLocationProvider) - b_GpsLocationProvider.j(this.a_gpsLocationProvider)));
         } else {
            b_GpsLocationProvider.a(this.a_gpsLocationProvider, b_GpsLocationProvider.i(this.a_gpsLocationProvider) + 1000L);
         }

         if (var2 - b_GpsLocationProvider.i(this.a_gpsLocationProvider) < 0L) {
            b_GpsLocationProvider.a(this.a_gpsLocationProvider, var2);
         }

         if (!var4 && b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getFix()) {
            fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "Fix changed to true. Saving new reference timestamp:" + var2 + " + (previous:" + b_GpsLocationProvider.i(this.a_gpsLocationProvider) + ")");
            b_GpsLocationProvider.a(this.a_gpsLocationProvider, var2);
         }

         this.a();
         b_GpsLocationProvider.e(this.a_gpsLocationProvider).a((b_PolarSensorEvent)this.a_gpsLocationProvider.k());
      }

   }

   private void b() {
      Intent var1 = new Intent("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
      var1.putExtra("fi.polar.polarflow.SENSOR_STATE", b_GpsLocationProvider.n_getState(this.a_gpsLocationProvider));
      var1.putExtra("fi.polar.polarflow.KEY_SENSOR_TYPE", b_GpsLocationProvider.o_getType(this.a_gpsLocationProvider));
      v.a().b(var1);
   }

   // $FF: synthetic method
   static void b(i_GpsSensor var0) {
      var0.d();
   }

   private void c() {
      v.a().a("fi.polar.polarflow.ACTION_LOCATION_DATA", "fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
   }

   // $FF: synthetic method
   static void c(i_GpsSensor var0) {
      var0.e();
   }

   private void d() {
      b_GpsLocationProvider.a(this.a_gpsLocationProvider, true);
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "startListeningUpdates");
      if (o.d(b_GpsLocationProvider.p_getContext(this.a_gpsLocationProvider), "android.permission.ACCESS_FINE_LOCATION")) {
         this.c_nmeaFilter.a_reset();
         this.c_nmeaFilter.a_setLocationDataCalculator(b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider));
         this.b_systemLocationManager.addNmeaListener(this.f_nmeaMessageListener);
         this.b_systemLocationManager.registerGnssStatusCallback(this.d_gnssStatusCallback);

         try {
            this.b_systemLocationManager.requestLocationUpdates("gps", 1000L, 0.0F, this.e_gnssLocationListener);
            if (this.b_systemLocationManager.isProviderEnabled("gps")) {
               b_GpsLocationProvider.a_setState(this.a_gpsLocationProvider, m_SENSOR_STATE.c_SEARCHING, true);
            } else {
               b_GpsLocationProvider.b_setState(this.a_gpsLocationProvider, m_SENSOR_STATE.a_DISABLED, true);
            }
         } catch (IllegalArgumentException var2) {
            b_GpsLocationProvider.c_setState(this.a_gpsLocationProvider, m_SENSOR_STATE.a_DISABLED, true);
         }
      }

   }

   // $FF: synthetic method
   static void d(i_GpsSensor var0) {
      var0.c();
   }

   private void e() {
      b_GpsLocationProvider.a(this.a_gpsLocationProvider, false);
      if (o.d(b_GpsLocationProvider.q_getContext(this.a_gpsLocationProvider), "android.permission.ACCESS_FINE_LOCATION")) {
         this.c_nmeaFilter.a_reset();
         this.c_nmeaFilter.a_setLocationDataCalculator((LocationDataCalculator)null);
         this.b_systemLocationManager.removeNmeaListener(this.f_nmeaMessageListener);
         this.b_systemLocationManager.unregisterGnssStatusCallback(this.d_gnssStatusCallback);
         this.b_systemLocationManager.removeUpdates(this.e_gnssLocationListener);
      }

      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "PolarMath, stopListeningUpdates");
      b_GpsLocationProvider var1 = this.a_gpsLocationProvider;
      m_SENSOR_STATE var2;
      if (b_GpsLocationProvider.c(this.a_gpsLocationProvider).a()) {
         var2 = m_SENSOR_STATE.a_DISABLED;
      } else {
         var2 = m_SENSOR_STATE.b_NOT_READY;
      }

      b_GpsLocationProvider.d_setState(var1, var2, true);
   }

   // $FF: synthetic method
   static void e(i_GpsSensor var0) {
      var0.b();
   }
}
