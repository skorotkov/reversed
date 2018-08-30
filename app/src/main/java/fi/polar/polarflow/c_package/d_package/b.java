package fi.polar.polarflow.c_package.d_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import fi.polar.polarflow.c_package.l;
import fi.polar.polarflow.c_package.m;
import fi.polar.polarflow.util.aa;
import fi.polar.polarflow.util.n;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentCalculatorAndroidImpl;
import fi.polar.polarmathsmart.ascentdescent.AscentDescentOutput;
import fi.polar.polarmathsmart.gps.LocationDataCalculator;
import fi.polar.polarmathsmart.gps.LocationDataCalculatorAndroidImpl;

public class b extends a {
   private static final String w = b.class.getSimpleName();
   private fi.polar.polarflow.c_package.e A;
   private boolean B;
   private final Handler C;
   private long D;
   private long E;
   private aa F;
   private n G;
   private final fi.polar.polarflow.c_package.j H;
   private final fi.polar.polarflow.c_package.g I;
   private final BroadcastReceiver J;
   private LocationDataCalculator x;
   private AscentDescentCalculatorAndroidImpl y;
   private final i z;

   public b(Context var1) {
      this(var1, new LocationDataCalculatorAndroidImpl(30, 10, 5));
   }

   b(Context var1, LocationDataCalculatorAndroidImpl var2) {
      super(var1, fi.polar.polarflow.c_package.n.b);
      this.y = null;
      this.A = null;
      this.C = new Handler();
      this.D = 0L;
      this.E = 0L;
      this.H = new c(this);
      this.I = new d(this, this.H, this.C);
      this.J = new e(this);
      fi.polar.polarflow.util.d.c(w, "GpsLocationProvider");
      this.z = new i(this, (c)null);
      this.x = var2;
      this.F = new aa();
      this.G = new n(this.a);
   }

   // $FF: synthetic method
   static double a(double var0) {
      return b(var0);
   }

   // $FF: synthetic method
   static long a(b var0, long var1) {
      var0.D = var1;
      return var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.e a(b var0) {
      return var0.A;
   }

   // $FF: synthetic method
   static AscentDescentCalculatorAndroidImpl a(b var0, AscentDescentCalculatorAndroidImpl var1) {
      var0.y = var1;
      return var1;
   }

   // $FF: synthetic method
   static void a(b var0, m var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static boolean a(b var0, boolean var1) {
      var0.B = var1;
      return var1;
   }

   private static double b(double var0) {
      double var2;
      if (var0 < 0.0D) {
         fi.polar.polarflow.util.d.e(w, "Speed is below minimum: " + var0 + " m/s");
         var2 = 0.0D;
      } else {
         var2 = var0;
         if (var0 > 110.83333626941406D) {
            fi.polar.polarflow.util.d.e(w, "Speed is above maximum : " + var0 + " m/s");
            var2 = 110.83333626941406D;
         }
      }

      return var2;
   }

   // $FF: synthetic method
   static void b(b var0, m var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static boolean b(b var0) {
      return var0.B;
   }

   // $FF: synthetic method
   static n c(b var0) {
      return var0.G;
   }

   // $FF: synthetic method
   static void c(b var0, m var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static aa d(b var0) {
      return var0.F;
   }

   // $FF: synthetic method
   static void d(b var0, m var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.g e(b var0) {
      return var0.I;
   }

   // $FF: synthetic method
   static i f(b var0) {
      return var0.z;
   }

   // $FF: synthetic method
   static Context g(b var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static LocationDataCalculator h(b var0) {
      return var0.x;
   }

   // $FF: synthetic method
   static long i(b var0) {
      return var0.D;
   }

   // $FF: synthetic method
   static long j(b var0) {
      return var0.E;
   }

   // $FF: synthetic method
   static AscentDescentCalculatorAndroidImpl k(b var0) {
      return var0.y;
   }

   // $FF: synthetic method
   static boolean l(b var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static m m(b var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static m n(b var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.n o(b var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static Context p(b var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static Context q(b var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static boolean r(b var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static m s(b var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static String s() {
      return w;
   }

   protected void a() {
      super.a();
      this.n = (float)this.x.getDistanceInMeters();
      this.i = fi.polar.polarflow.a_package.a.b(4, this.x.getAltitudeInMeters(true));
   }

   public void a(l var1) {
      this.A = (fi.polar.polarflow.c_package.e)var1;
   }

   public void a(m var1) {
      if (fi.polar.polarflow.c_package.m.d.equals(var1)) {
         if (!this.x.getFix()) {
            super.a(fi.polar.polarflow.c_package.m.c, false);
         } else {
            super.a(var1, false);
         }
      } else {
         super.a(var1, false);
      }

   }

   public void b() {
      this.E = this.F.b();
      fi.polar.polarflow.util.d.c(w, "start() at: " + this.E);
      if (!fi.polar.polarflow.ui.o.d(this.a, "android.permission.ACCESS_FINE_LOCATION")) {
         this.a(fi.polar.polarflow.c_package.m.a, true);
      } else if (!this.d) {
         this.d = true;
         this.a.registerReceiver(this.J, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"), (String)null, this.C);
         if (this.G.a()) {
            this.a(fi.polar.polarflow.c_package.m.a, true);
         } else if (!this.B) {
            fi.polar.polarflow.c_package.d_package.i.b(this.z);
         }
      } else {
         this.d();
      }

   }

   public void c() {
      fi.polar.polarflow.util.d.c(w, "stop()");
      if (this.d) {
         this.d = false;
         this.a.unregisterReceiver(this.J);
         fi.polar.polarflow.c_package.d_package.i.c(this.z);
      } else {
         this.d();
      }

      this.C.removeCallbacksAndMessages((Object)null);
      fi.polar.polarflow.c_package.d_package.i.d(this.z);
   }

   public void d() {
      fi.polar.polarflow.c_package.d_package.i.e(this.z);
   }

   public void f() {
      this.e = false;
      this.f = true;
   }

   public void g() {
      this.m += (float)this.x.getDistanceInMeters() - this.l;
      if (this.y != null) {
         AscentDescentOutput var1 = this.y.addAltitude((float)this.i);
         this.p += var1.getAscent() - this.r;
         this.q += var1.getDescent() - this.s;
         this.r = var1.getAscent();
         this.s = var1.getDescent();
      }

      this.e = true;
      this.f = false;
   }

   public void h() {
      super.h();
      if (this.d && this.B) {
         fi.polar.polarflow.c_package.d_package.i.a(this.z);
      }

   }
}
