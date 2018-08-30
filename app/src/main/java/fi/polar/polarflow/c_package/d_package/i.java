package fi.polar.polarflow.c_package.d_package;

import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.location.GnssStatus.Callback;
import fi.polar.polarflow.c_package.m;
import fi.polar.polarflow.ui.o;
import fi.polar.polarflow.util.v;
import fi.polar.polarmathsmart.gps.LocationDataCalculator;

class i {
   // $FF: synthetic field
   final b a;
   private final LocationManager b;
   private final j c;
   private final Callback d;
   private final LocationListener e;
   private final OnNmeaMessageListener f;

   private i(b var1) {
      this.a = var1;
      fi.polar.polarflow.util.d.c(fi.polar.polarflow.c_package.d_package.b.s(), "GpsSensor");
      this.b = (LocationManager)fi.polar.polarflow.c_package.d_package.b.g(var1).getSystemService(Context.LOCATION_SERVICE);
      this.c = new j();
      this.f = new h(var1);
      this.e = new f(var1);
      this.d = new g(var1);
   }

   // $FF: synthetic method
   i(b var1, c var2) {
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
      var7.putExtra("fi.polar.polarflow.SENSOR_STATE", fi.polar.polarflow.c_package.d_package.b.m(this.a));
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
      long var2 = fi.polar.polarflow.c_package.d_package.b.d(this.a).b();
      boolean var4 = fi.polar.polarflow.c_package.d_package.b.h(this.a).getFix();
      if (this.c.a(var1)) {
         if (fi.polar.polarflow.c_package.d_package.b.i(this.a) == 0L) {
            fi.polar.polarflow.c_package.d_package.b.a(this.a, var2);
            fi.polar.polarflow.util.d.c(fi.polar.polarflow.c_package.d_package.b.s(), "First NMEAs handled, diff to GPS start time(" + fi.polar.polarflow.c_package.d_package.b.i(this.a) + " - " + fi.polar.polarflow.c_package.d_package.b.j(this.a) + ") :" + (fi.polar.polarflow.c_package.d_package.b.i(this.a) - fi.polar.polarflow.c_package.d_package.b.j(this.a)));
         } else {
            fi.polar.polarflow.c_package.d_package.b.a(this.a, fi.polar.polarflow.c_package.d_package.b.i(this.a) + 1000L);
         }

         if (var2 - fi.polar.polarflow.c_package.d_package.b.i(this.a) < 0L) {
            fi.polar.polarflow.c_package.d_package.b.a(this.a, var2);
         }

         if (!var4 && fi.polar.polarflow.c_package.d_package.b.h(this.a).getFix()) {
            fi.polar.polarflow.util.d.c(fi.polar.polarflow.c_package.d_package.b.s(), "Fix changed to true. Saving new reference timestamp:" + var2 + " + (previous:" + fi.polar.polarflow.c_package.d_package.b.i(this.a) + ")");
            fi.polar.polarflow.c_package.d_package.b.a(this.a, var2);
         }

         this.a();
         fi.polar.polarflow.c_package.d_package.b.e(this.a).a((fi.polar.polarflow.c_package.b)this.a.k());
      }

   }

   private void b() {
      Intent var1 = new Intent("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED");
      var1.putExtra("fi.polar.polarflow.SENSOR_STATE", fi.polar.polarflow.c_package.d_package.b.n(this.a));
      var1.putExtra("fi.polar.polarflow.KEY_SENSOR_TYPE", fi.polar.polarflow.c_package.d_package.b.o(this.a));
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
      fi.polar.polarflow.c_package.d_package.b.a(this.a, true);
      fi.polar.polarflow.util.d.c(fi.polar.polarflow.c_package.d_package.b.s(), "startListeningUpdates");
      if (o.d(fi.polar.polarflow.c_package.d_package.b.p(this.a), "android.permission.ACCESS_FINE_LOCATION")) {
         this.c.a();
         this.c.a(fi.polar.polarflow.c_package.d_package.b.h(this.a));
         this.b.addNmeaListener(this.f);
         this.b.registerGnssStatusCallback(this.d);

         try {
            this.b.requestLocationUpdates("gps", 1000L, 0.0F, this.e);
            if (this.b.isProviderEnabled("gps")) {
               fi.polar.polarflow.c_package.d_package.b.a(this.a, m.c, true);
            } else {
               fi.polar.polarflow.c_package.d_package.b.b(this.a, m.a, true);
            }
         } catch (IllegalArgumentException var2) {
            fi.polar.polarflow.c_package.d_package.b.c(this.a, m.a, true);
         }
      }

   }

   // $FF: synthetic method
   static void d(i var0) {
      var0.c();
   }

   private void e() {
      fi.polar.polarflow.c_package.d_package.b.a(this.a, false);
      if (o.d(fi.polar.polarflow.c_package.d_package.b.q(this.a), "android.permission.ACCESS_FINE_LOCATION")) {
         this.c.a();
         this.c.a((LocationDataCalculator)null);
         this.b.removeNmeaListener(this.f);
         this.b.unregisterGnssStatusCallback(this.d);
         this.b.removeUpdates(this.e);
      }

      fi.polar.polarflow.util.d.c(fi.polar.polarflow.c_package.d_package.b.s(), "PolarMath, stopListeningUpdates");
      b var1 = this.a;
      m var2;
      if (fi.polar.polarflow.c_package.d_package.b.c(this.a).a()) {
         var2 = m.a;
      } else {
         var2 = m.b;
      }

      fi.polar.polarflow.c_package.d_package.b.d(var1, var2, true);
   }

   // $FF: synthetic method
   static void e(i var0) {
      var0.b();
   }
}
