package fi.polar.polarflow.c_package.c_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import fi.polar.polarflow.data.ExerciseSensor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class j extends a {
   private final Handler g = new Handler();
   private fi.polar.polarflow.c_package.b_package.b h;
   private s i;
   private final fi.polar.polarflow.c_package.b_package.j j;
   private final Set k;
   private i l;
   private b m;
   private boolean n;
   private boolean o;
   private fi.polar.polarflow.c_package.e p;
   private final fi.polar.polarflow.c_package.e q = new l(this);
   private final fi.polar.polarflow.c_package.l r = new m(this);
   private final BroadcastReceiver s = new n(this);
   private final fi.polar.polarflow.c_package.b_package.h t = new o(this);

   public j(Context var1) {
      super(var1);
      this.h = new fi.polar.polarflow.c_package.b_package.b(var1);
      this.i = new s(var1);
      this.j = new fi.polar.polarflow.c_package.b_package.j(var1);
      this.k = new HashSet();
      this.l = new i();
   }

   private void A() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "switchToBleSensor()");
      if (!this.n && this.m != null) {
         this.n = true;
         a((fi.polar.polarflow.c_package.a)this.i);
         if (!b((fi.polar.polarflow.c_package.a)this.m)) {
            b((fi.polar.polarflow.c_package.a)this.m, (fi.polar.polarflow.c_package.l)this.r);
         }
      }

   }

   private void B() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "switchToInDeviceSensor()");
      if (this.n) {
         this.n = false;
         a((fi.polar.polarflow.c_package.a)this.m);
         this.m = null;
         if (!b((fi.polar.polarflow.c_package.a)this.i)) {
            b((fi.polar.polarflow.c_package.a)this.i, (fi.polar.polarflow.c_package.l)this.q);
         }
      }

   }

   private void C() {
      List var1 = this.h.c();
      fi.polar.polarflow.c_package.b_package.a var2 = this.a(var1);
      if (var2 != null) {
         this.h.a();
         this.m = this.a(var2);
         b((fi.polar.polarflow.c_package.a)this.m, (fi.polar.polarflow.c_package.l)this.r);
      } else {
         var2 = this.b(var1);
         if (var2 != null) {
            this.m = this.a(var2);
            this.s();
         } else if (!this.h.b()) {
            this.h.a(this.t);
         }
      }

   }

   private void D() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBluetoothEnabled()");
      if (!this.n) {
         this.h.a();
         this.m = null;
         this.h.a(this.t);
      }

   }

   private void E() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBluetoothDisabled()");
      if (this.h.b()) {
         this.h.a();
      }

      if (this.n) {
         this.a((fi.polar.polarflow.c_package.m)fi.polar.polarflow.c_package.m.c);
         this.B();
      }

   }

   private fi.polar.polarflow.c_package.b_package.a a(List var1) {
      Iterator var2 = var1.iterator();

      fi.polar.polarflow.c_package.b_package.a var3;
      do {
         if (!var2.hasNext()) {
            var3 = null;
            break;
         }

         var3 = (fi.polar.polarflow.c_package.b_package.a)var2.next();
      } while(!var3.d() || this.a(var3.a().getAddress()));

      return var3;
   }

   private b a(fi.polar.polarflow.c_package.b_package.a var1) {
      b var2 = this.l.a(this.a, var1.a(), var1.e());
      var2.b(var1.c());
      return var2;
   }

   // $FF: synthetic method
   static b a(j var0, fi.polar.polarflow.c_package.b_package.a var1) {
      return var0.a(var1);
   }

   // $FF: synthetic method
   static b a(j var0, b var1) {
      var0.m = var1;
      return var1;
   }

   private static void a(fi.polar.polarflow.c_package.a var0) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "stopSensor(" + var0 + ")");
      if (var0 != null) {
         if (var0 instanceof fi.polar.polarflow.c_package.i) {
            ((fi.polar.polarflow.c_package.i)var0).a((fi.polar.polarflow.c_package.l)null);
         }

         var0.c();
      }

   }

   // $FF: synthetic method
   static void a(fi.polar.polarflow.c_package.a var0, fi.polar.polarflow.c_package.l var1) {
      b(var0, var1);
   }

   // $FF: synthetic method
   static void a(j var0) {
      var0.D();
   }

   // $FF: synthetic method
   static boolean a(j var0, String var1) {
      return var0.a(var1);
   }

   private boolean a(String var1) {
      return this.k.contains(var1.toUpperCase(Locale.US));
   }

   private fi.polar.polarflow.c_package.b_package.a b(List var1) {
      Iterator var2 = var1.iterator();

      fi.polar.polarflow.c_package.b_package.a var6;
      while(true) {
         if (!var2.hasNext()) {
            var6 = null;
            break;
         }

         var6 = (fi.polar.polarflow.c_package.b_package.a)var2.next();
         if (!var6.d() && !this.a(var6.a().getAddress())) {
            fi.polar.polarflow.c_package.b_package.b var3 = this.h;
            int var4 = var6.b();
            boolean var5;
            if (var6.c() == 107) {
               var5 = true;
            } else {
               var5 = false;
            }

            if (var3.a(var4, var5)) {
               break;
            }
         }
      }

      return var6;
   }

   private static void b(fi.polar.polarflow.c_package.a var0, fi.polar.polarflow.c_package.l var1) {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "startSensor(" + var0 + ")");
      if (var0 != null) {
         if (var0 instanceof fi.polar.polarflow.c_package.i) {
            ((fi.polar.polarflow.c_package.i)var0).a(var1);
         }

         var0.b();
      }

   }

   // $FF: synthetic method
   static void b(j var0) {
      var0.E();
   }

   // $FF: synthetic method
   static void b(j var0, String var1) {
      var0.b(var1);
   }

   private void b(String var1) {
      this.k.add(var1.toUpperCase(Locale.US));
   }

   private static boolean b(fi.polar.polarflow.c_package.a var0) {
      boolean var1;
      if (var0.e() != fi.polar.polarflow.c_package.m.c && var0.e() != fi.polar.polarflow.c_package.m.d) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   // $FF: synthetic method
   static boolean c(j var0) {
      return var0.o;
   }

   // $FF: synthetic method
   static boolean d(j var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static void e(j var0) {
      var0.y();
   }

   // $FF: synthetic method
   static void f(j var0) {
      var0.z();
   }

   // $FF: synthetic method
   static void g(j var0) {
      var0.x();
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.e h(j var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static void i(j var0) {
      var0.v();
   }

   // $FF: synthetic method
   static void j(j var0) {
      var0.w();
   }

   // $FF: synthetic method
   static void k(j var0) {
      var0.t();
   }

   // $FF: synthetic method
   static void l(j var0) {
      var0.u();
   }

   // $FF: synthetic method
   static Handler m(j var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static b n(j var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.b_package.b o(j var0) {
      return var0.h;
   }

   private a p() {
      Object var1;
      if (this.n) {
         var1 = this.m;
      } else {
         var1 = this.i;
      }

      return (a)var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.l p(j var0) {
      return var0.r;
   }

   private void q() {
      IntentFilter var1 = new IntentFilter();
      var1.addAction("TrainingService.action.TRAINING_STARTED");
      var1.addAction("fi.polar.polarflow.ACTION_SENSOR_PAIRING_CONFIRMED");
      var1.addAction("fi.polar.polarflow.ACTION_SENSOR_PAIRING_DECLINED");
      this.o().a(this.s, var1);
   }

   // $FF: synthetic method
   static void q(j var0) {
      var0.s();
   }

   private void r() {
      this.o().a(this.s);
   }

   // $FF: synthetic method
   static void r(j var0) {
      var0.C();
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.b_package.h s(j var0) {
      return var0.t;
   }

   private void s() {
      Intent var1 = new Intent("fi.polar.polarflow.ACTION_SENSOR_PAIRING_CONFIRMATION_NEEDED");
      var1.putExtras(this.m.k());
      this.o().a(var1);
   }

   private void t() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBleSensorReady()");
      this.A();
      this.a(fi.polar.polarflow.c_package.m.d, true);
   }

   private void u() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBleSensorConnectFailed()");
      if (!this.m.p()) {
         this.b(this.m.q());
         a((fi.polar.polarflow.c_package.a)this.m);
         this.m = null;
         this.C();
      }

   }

   private void v() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBleSensorDisconnected()");
      this.a((fi.polar.polarflow.c_package.m)fi.polar.polarflow.c_package.m.c);
      this.n = false;
      b((fi.polar.polarflow.c_package.a)this.i, (fi.polar.polarflow.c_package.l)this.q);
   }

   private void w() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onBleSensorSearching()");
      this.a((fi.polar.polarflow.c_package.m)fi.polar.polarflow.c_package.m.c);
   }

   private void x() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onInDeviceSensorReady()");
      this.a((fi.polar.polarflow.c_package.m)fi.polar.polarflow.c_package.m.d);
   }

   private void y() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onInDeviceSensorDisabled()");
      if (this.h.b()) {
         this.a((fi.polar.polarflow.c_package.m)fi.polar.polarflow.c_package.m.c);
      } else {
         this.a((fi.polar.polarflow.c_package.m)fi.polar.polarflow.c_package.m.a);
      }

   }

   private void z() {
      fi.polar.polarflow.util.d.c("HeartRateSensorManager", "onInDeviceSensorSearching()");
      this.a((fi.polar.polarflow.c_package.m)fi.polar.polarflow.c_package.m.c);
   }

   public void a(fi.polar.polarflow.c_package.l var1) {
      this.p = (fi.polar.polarflow.c_package.e)var1;
   }

   protected void a(fi.polar.polarflow.c_package.m var1, boolean var2) {
      super.a(var1, var2);
      if (var1 != fi.polar.polarflow.c_package.m.d) {
         this.a(0);
      }

   }

   public void b() {
      if (!this.o) {
         this.o = true;
         this.a((fi.polar.polarflow.c_package.m)fi.polar.polarflow.c_package.m.c);
         this.q();
         this.j.a((fi.polar.polarflow.c_package.b_package.m)(new k(this)));
         this.k.clear();
         this.m = null;
         this.n = false;
         this.h.a(2);
         this.h.a(fi.polar.polarflow.c_package.b.i.b);
         this.h.a(fi.polar.polarflow.util.i.a(this.a, "PAIRING_RSSI_THRESHOLD_POLAR", -55), fi.polar.polarflow.util.i.a(this.a, "PAIRING_RSSI_THRESHOLD_OTHER", -55));
         this.h.a(this.t);
         b((fi.polar.polarflow.c_package.a)this.i, (fi.polar.polarflow.c_package.l)this.q);
      } else {
         this.d();
      }

   }

   public void c() {
      this.a(fi.polar.polarflow.c_package.m.b, true);
      if (this.o) {
         this.o = false;
         this.j.a();
         this.r();
         a((fi.polar.polarflow.c_package.a)this.i);
         a((fi.polar.polarflow.c_package.a)this.m);
         this.h.a();
         this.g.removeCallbacksAndMessages((Object)null);
      }

      this.m();
   }

   public void h() {
      if (this.o) {
         this.p().h();
      }

   }

   public void i() {
      if (this.o) {
         this.p().h();
      }

   }

   public ExerciseSensor j() {
      a var1 = this.p();
      ExerciseSensor var2;
      if (var1 != null) {
         var2 = var1.j();
      } else {
         var2 = null;
      }

      return var2;
   }

   protected Bundle k() {
      Bundle var1;
      if (this.n) {
         var1 = this.m.k();
      } else {
         var1 = this.i.k();
      }

      var1.putSerializable("fi.polar.polarflow.SENSOR_STATE", this.e());
      return var1;
   }
}
