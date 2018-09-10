package fi.polar.polarflow.c.d_gps_package;

import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.location.GnssStatus.Callback;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.c.b_PolarSensorEventBase;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;
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
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(), "GpsSensor");
      this.b_systemLocationManager = (LocationManager) b_GpsLocationProvider.g_getContext(var1).getSystemService(Context.LOCATION_SERVICE);
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
      this.a_gpsLocationProvider.t = b_GpsLocationProvider.i_getD(this.a_gpsLocationProvider);
      this.a_gpsLocationProvider.u_fix = b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getFix();
      this.a_gpsLocationProvider.k_numberOfSatellites = b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getNumberOfSatellites();
      this.a_gpsLocationProvider.i_altitudeInMetersChecked = a_DataTypes.b_adjust(4, b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getAltitudeInMeters(true));
      this.a_gpsLocationProvider.j_altitudeInMeters = a_DataTypes.b_adjust(4, b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getAltitudeInMeters(false));
      this.a_gpsLocationProvider.o_speedInMetersPerSecond = (float)b_GpsLocationProvider.a_boundSpeed(b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getSpeedInMetersPerSecond());
      this.a_gpsLocationProvider.g_latitudeInDecimalDegrees = a_DataTypes.b_adjust(5, b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getLatitudeInDecimalDegrees());
      this.a_gpsLocationProvider.h_longitudeInDecimalDegrees = a_DataTypes.b_adjust(6, b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getLongitudeInDecimalDegrees());
      AscentDescentOutput var2 = null;
      if (b_GpsLocationProvider.k_getAscentDescentCalculator(this.a_gpsLocationProvider) != null) {
         var2 = b_GpsLocationProvider.k_getAscentDescentCalculator(this.a_gpsLocationProvider).addAltitude((float)this.a_gpsLocationProvider.i_altitudeInMetersChecked);
      }

      this.a_gpsLocationProvider.a_setState(m_SENSOR_STATE.d_READY);
      if (b_GpsLocationProvider.l(this.a_gpsLocationProvider)) {
         this.a_gpsLocationProvider.l = (float)b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getDistanceInMeters();
         if (b_GpsLocationProvider.k_getAscentDescentCalculator(this.a_gpsLocationProvider) == null && !Double.isNaN(this.a_gpsLocationProvider.i_altitudeInMetersChecked)) {
            b_GpsLocationProvider.a_setAscentDescentCalculator(this.a_gpsLocationProvider, new AscentDescentCalculatorAndroidImpl(1, (float)this.a_gpsLocationProvider.i_altitudeInMetersChecked));
         } else if (var2 != null) {
            this.a_gpsLocationProvider.r = var2.getAscent();
            this.a_gpsLocationProvider.s = var2.getDescent();
         }

         this.a_broadcastLocationData(this.a_gpsLocationProvider.p_getSpeedInMetersPerSecond(),
                 this.a_gpsLocationProvider.o_getTotalDistance(),
                 this.a_gpsLocationProvider.l_getAltitudeInMetersChecked(),
                 this.a_gpsLocationProvider.q_getAscentDelta(),
                 this.a_gpsLocationProvider.r_getDescentDelta());
      }
   }

   private void a_broadcastLocationData(float var1_speed, float var2_totalDistance, double var3_altitude, float var5_ascent, float var6_descent) {
      Intent var7 = new Intent("fi.polar.polarflow.ACTION_LOCATION_DATA");
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE", "fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR");
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_CURRENT_SPEED_VALUE", var1_speed);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE", var2_totalDistance);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ALTITUDE_VALUE", var3_altitude);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ASCENT_VALUE", var5_ascent);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DESCENT_VALUE", var6_descent);
      var7.putExtra("fi.polar.polarflow.SENSOR_STATE", b_GpsLocationProvider.m_getState(this.a_gpsLocationProvider));
      v_StickyLocalBroadcastManager.a_getInstance().b_sendStickyBroadcast(var7);
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
      long var2_elapsedRealtime = b_GpsLocationProvider.d_getTimeUtils(this.a_gpsLocationProvider).b_elapsedRealtime();
      boolean var4_fix = b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getFix();
      if (this.c_nmeaFilter.a(var1)) {
         if (b_GpsLocationProvider.i_getD(this.a_gpsLocationProvider) == 0L) {
            b_GpsLocationProvider.a_setD(this.a_gpsLocationProvider, var2_elapsedRealtime);
            fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(),
                    "First NMEAs handled, diff to GPS start time(" + b_GpsLocationProvider.i_getD(this.a_gpsLocationProvider) + " - " + b_GpsLocationProvider.j(this.a_gpsLocationProvider) + ") :" + (b_GpsLocationProvider.i_getD(this.a_gpsLocationProvider) - b_GpsLocationProvider.j(this.a_gpsLocationProvider)));
         } else {
            b_GpsLocationProvider.a_setD(this.a_gpsLocationProvider, b_GpsLocationProvider.i_getD(this.a_gpsLocationProvider) + 1000L);
         }

         if (var2_elapsedRealtime - b_GpsLocationProvider.i_getD(this.a_gpsLocationProvider) < 0L) {
            b_GpsLocationProvider.a_setD(this.a_gpsLocationProvider, var2_elapsedRealtime);
         }

         if (!var4_fix && b_GpsLocationProvider.h_getLocationDataCalculator(this.a_gpsLocationProvider).getFix()) {
            fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(), "Fix changed to true. Saving new reference timestamp:" + var2_elapsedRealtime + " + (previous:" + b_GpsLocationProvider.i_getD(this.a_gpsLocationProvider) + ")");
            b_GpsLocationProvider.a_setD(this.a_gpsLocationProvider, var2_elapsedRealtime);
         }

         this.a();
         b_GpsLocationProvider.e_getAndroidSensorEventListener(this.a_gpsLocationProvider).a((b_PolarSensorEventBase)this.a_gpsLocationProvider.k());
      }

   }

   private void b_broadcastStateChanged() {
      Intent var1 = new Intent("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
      var1.putExtra("fi.polar.polarflow.SENSOR_STATE", b_GpsLocationProvider.n_getState(this.a_gpsLocationProvider));
      var1.putExtra("fi.polar.polarflow.KEY_SENSOR_TYPE", b_GpsLocationProvider.o_getType(this.a_gpsLocationProvider));
      v_StickyLocalBroadcastManager.a_getInstance().b_sendStickyBroadcast(var1);
   }

   // $FF: synthetic method
   static void b_startListeningUpdates(i_GpsSensor var0) {
      var0.d_startListeningUpdates();
   }

   private void c_removeFromStickyLocalBroadcastManagerMap() {
      v_StickyLocalBroadcastManager.a_getInstance().a_removeFromMap("fi.polar.polarflow.ACTION_LOCATION_DATA", "fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
   }

   // $FF: synthetic method
   static void c_stopListeningUpdates(i_GpsSensor var0) {
      var0.e_stopListeningUpdates();
   }

   private void d_startListeningUpdates() {
      b_GpsLocationProvider.a_setGpsSensorStarted(this.a_gpsLocationProvider, true);
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(), "startListeningUpdates");
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
   static void d_removeFromStickyLocalBroadcastManagerMap(i_GpsSensor var0) {
      var0.c_removeFromStickyLocalBroadcastManagerMap();
   }

   private void e_stopListeningUpdates() {
      b_GpsLocationProvider.a_setGpsSensorStarted(this.a_gpsLocationProvider, false);
      if (o.d(b_GpsLocationProvider.q_getContext(this.a_gpsLocationProvider), "android.permission.ACCESS_FINE_LOCATION")) {
         this.c_nmeaFilter.a_reset();
         this.c_nmeaFilter.a_setLocationDataCalculator((LocationDataCalculator)null);
         this.b_systemLocationManager.removeNmeaListener(this.f_nmeaMessageListener);
         this.b_systemLocationManager.unregisterGnssStatusCallback(this.d_gnssStatusCallback);
         this.b_systemLocationManager.removeUpdates(this.e_gnssLocationListener);
      }

      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s_getClassName(), "PolarMath, stopListeningUpdates");
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
   static void e_broadcastStateChanged(i_GpsSensor var0) {
      var0.b_broadcastStateChanged();
   }
}
