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
import fi.polar.polarmathsmart.gps.LocationDataCalculator;

class i {
   // $FF: synthetic field
   final b_GpsLocationProvider a;
   private final LocationManager b;
   private final j_NmeaFilter c;
   private final Callback d;
   private final LocationListener e;
   private final OnNmeaMessageListener f;

   private i(b_GpsLocationProvider var1) {
      this.a = var1;
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "GpsSensor");
      this.b = (LocationManager) b_GpsLocationProvider.g(var1).getSystemService(Context.LOCATION_SERVICE);
      this.c = new j_NmeaFilter();
      this.f = new h(var1);
      this.e = new f_GnssLocationListener(var1);
      this.d = new g(var1);
   }

   // $FF: synthetic method
   i(b_GpsLocationProvider var1, c var2) {
      this(var1);
   }

   private void a() {
      // $FF: Couldn't be decompiled
   }

   private void a(float var1, float var2, double var3, float var5, float var6) {
      Intent var7 = new Intent("fi.polar.polarflow.ACTION_LOCATION_DATA");
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE", "fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR");
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_CURRENT_SPEED_VALUE", var1);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE", var2);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ALTITUDE_VALUE", var3);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_ASCENT_VALUE", var5);
      var7.putExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DESCENT_VALUE", var6);
      var7.putExtra("fi.polar.polarflow.SENSOR_STATE", b_GpsLocationProvider.m(this.a));
      v.a().b(var7);
   }

   // $FF: synthetic method
   static void a(i var0) {
      var0.a();
   }

   // $FF: synthetic method
   static void a(i var0, String var1) {
      var0.a(var1);
   }

   private void a(String var1) {
      long var2 = b_GpsLocationProvider.d(this.a).b();
      boolean var4 = b_GpsLocationProvider.h(this.a).getFix();
      if (this.c.a(var1)) {
         if (b_GpsLocationProvider.i(this.a) == 0L) {
            b_GpsLocationProvider.a(this.a, var2);
            fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "First NMEAs handled, diff to GPS start time(" + b_GpsLocationProvider.i(this.a) + " - " + b_GpsLocationProvider.j(this.a) + ") :" + (b_GpsLocationProvider.i(this.a) - b_GpsLocationProvider.j(this.a)));
         } else {
            b_GpsLocationProvider.a(this.a, b_GpsLocationProvider.i(this.a) + 1000L);
         }

         if (var2 - b_GpsLocationProvider.i(this.a) < 0L) {
            b_GpsLocationProvider.a(this.a, var2);
         }

         if (!var4 && b_GpsLocationProvider.h(this.a).getFix()) {
            fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "Fix changed to true. Saving new reference timestamp:" + var2 + " + (previous:" + b_GpsLocationProvider.i(this.a) + ")");
            b_GpsLocationProvider.a(this.a, var2);
         }

         this.a();
         b_GpsLocationProvider.e(this.a).a((b_PolarSensorEvent)this.a.k());
      }

   }

   private void b() {
      Intent var1 = new Intent("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
      var1.putExtra("fi.polar.polarflow.SENSOR_STATE", b_GpsLocationProvider.n(this.a));
      var1.putExtra("fi.polar.polarflow.KEY_SENSOR_TYPE", b_GpsLocationProvider.o(this.a));
      v.a().b(var1);
   }

   // $FF: synthetic method
   static void b(i var0) {
      var0.d();
   }

   private void c() {
      v.a().a("fi.polar.polarflow.ACTION_LOCATION_DATA", "fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
   }

   // $FF: synthetic method
   static void c(i var0) {
      var0.e();
   }

   private void d() {
      b_GpsLocationProvider.a(this.a, true);
      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "startListeningUpdates");
      if (o.d(b_GpsLocationProvider.p(this.a), "android.permission.ACCESS_FINE_LOCATION")) {
         this.c.a();
         this.c.a(b_GpsLocationProvider.h(this.a));
         this.b.addNmeaListener(this.f);
         this.b.registerGnssStatusCallback(this.d);

         try {
            this.b.requestLocationUpdates("gps", 1000L, 0.0F, this.e);
            if (this.b.isProviderEnabled("gps")) {
               b_GpsLocationProvider.a_setState(this.a, m_SENSOR_STATE.c_SEARCHING, true);
            } else {
               b_GpsLocationProvider.b_setState(this.a, m_SENSOR_STATE.a_DISABLED, true);
            }
         } catch (IllegalArgumentException var2) {
            b_GpsLocationProvider.c_setState(this.a, m_SENSOR_STATE.a_DISABLED, true);
         }
      }

   }

   // $FF: synthetic method
   static void d(i var0) {
      var0.c();
   }

   private void e() {
      b_GpsLocationProvider.a(this.a, false);
      if (o.d(b_GpsLocationProvider.q(this.a), "android.permission.ACCESS_FINE_LOCATION")) {
         this.c.a();
         this.c.a((LocationDataCalculator)null);
         this.b.removeNmeaListener(this.f);
         this.b.unregisterGnssStatusCallback(this.d);
         this.b.removeUpdates(this.e);
      }

      fi.polar.polarflow.util.d.c(b_GpsLocationProvider.s(), "PolarMath, stopListeningUpdates");
      b_GpsLocationProvider var1 = this.a;
      m_SENSOR_STATE var2;
      if (b_GpsLocationProvider.c(this.a).a()) {
         var2 = m_SENSOR_STATE.a_DISABLED;
      } else {
         var2 = m_SENSOR_STATE.b_NOT_READY;
      }

      b_GpsLocationProvider.d_setState(var1, var2, true);
   }

   // $FF: synthetic method
   static void e(i var0) {
      var0.b();
   }
}
