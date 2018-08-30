package fi.polar.polarflow.service.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class a {
   private static final String a = a.class.getSimpleName();
   private j b = new j();
   private final List c;
   private l d;
   private BluetoothDevice e;
   private final Context f;
   private Handler g;
   private boolean h;
   private boolean i;
   private e j;
   private UUID k;
   private final Set l;
   private int m = 20000;
   private int n = 5000;
   private boolean o;
   private final BluetoothGattCallback p = new b(this);
   private final Runnable q = new c(this);
   private final Runnable r = new d(this);

   public a(Context var1) {
      this.f = var1;
      this.d = new l(this.f);
      this.g = new Handler();
      this.l = new HashSet();
      this.c = new ArrayList();
      this.o = false;
   }

   // $FF: synthetic method
   static j a(a var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static void b(a var0) {
      var0.h();
   }

   // $FF: synthetic method
   static void c(a var0) {
      var0.e();
   }

   // $FF: synthetic method
   static String d() {
      return a;
   }

   // $FF: synthetic method
   static UUID d(a var0) {
      return var0.k;
   }

   // $FF: synthetic method
   static BluetoothDevice e(a var0) {
      return var0.e;
   }

   private void e() {
      fi.polar.polarflow.util.d.c(a, "handleDisconnect(discoveringServices=" + this.h + ")");
      if (this.h) {
         this.h = false;
         if (this.i && !this.f()) {
            this.g.postDelayed(this.q, (long)this.n);
         }
      }

   }

   // $FF: synthetic method
   static Set f(a var0) {
      return var0.l;
   }

   private boolean f() {
      boolean var1 = true;
      boolean var2 = false;
      fi.polar.polarflow.util.d.c(a, "queryNextCandidate(started=" + this.i + ", discoveringServices=" + this.h + ", candidateList=" + this.c + ")");
      if (this.i && !this.h && !this.c.isEmpty()) {
         this.h = true;
         this.e = (BluetoothDevice)this.c.remove(0);

         while(true) {
            if (!this.l.contains(this.e.getAddress())) {
               this.g();
               this.b.a(this.e, this.f, true, this.p, 2);
               var2 = var1;
               if (this.o) {
                  fi.polar.polarflow.util.d.c(a, "refreshGatt");
                  this.b.f();
                  var2 = var1;
               }
               break;
            }

            if (this.c.isEmpty()) {
               fi.polar.polarflow.util.d.c(a, "queryNextCandidate(No more undiscovered devices)");
               this.h = false;
               this.e = null;
               break;
            }

            this.e = (BluetoothDevice)this.c.remove(0);
         }
      } else {
         fi.polar.polarflow.util.d.c(a, "queryNextCandidate(No more devices to query)");
         this.e = null;
         this.o = false;
         var2 = false;
      }

      return var2;
   }

   // $FF: synthetic method
   static e g(a var0) {
      return var0.j;
   }

   private void g() {
      fi.polar.polarflow.util.d.c(a, "startConnectTimer(timeOut=" + this.m + ")");
      this.h();
      this.g.postDelayed(this.r, (long)this.m);
   }

   // $FF: synthetic method
   static List h(a var0) {
      return var0.c;
   }

   private void h() {
      fi.polar.polarflow.util.d.c(a, "connect(stopConnectTimer)");
      this.g.removeCallbacks(this.r);
   }

   // $FF: synthetic method
   static l i(a var0) {
      return var0.d;
   }

   private void i() {
      this.l.clear();
   }

   // $FF: synthetic method
   static boolean j(a var0) {
      return var0.f();
   }

   // $FF: synthetic method
   static Runnable k(a var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static Handler l(a var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static int m(a var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static int n(a var0) {
      return var0.m;
   }

   public void a() {
      fi.polar.polarflow.util.d.c(a, "stop(started=" + this.i + ")");
      if (this.i) {
         this.i = false;
         this.o = false;
         this.g.removeCallbacks(this.q);
         this.h();
         this.c.clear();
         if (this.h) {
            this.b.b();
            this.b.c();
         }
      }

   }

   public void a(e var1) {
      this.j = var1;
   }

   public void a(UUID var1) {
      fi.polar.polarflow.util.d.c(a, "start(started=" + this.i + ")");
      if (!this.i) {
         this.i = true;
         this.b();
         this.i();
         this.k = var1;
         this.g.post(this.q);
      }

   }

   public void b() {
      fi.polar.polarflow.util.d.c(a, "enableGattRefresh(mStarted=" + this.i + ")");
      if (this.i) {
         this.o = true;
      }

   }

   public boolean c() {
      return this.i;
   }
}
