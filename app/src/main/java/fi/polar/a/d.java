package fi.polar.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class d {
   private static final String b = d.class.getSimpleName();
   final c a;
   private android.support.v4.c.g c;
   private k d;
   private i e;
   private final boolean[] f;
   private final Map g;
   private final Context h;
   private int i;
   private int j;
   private int k;
   private int l;
   private int m;
   private int n;
   private BluetoothDevice o;
   private boolean p;
   private Handler q;
   private HandlerThread r;
   private final ReentrantLock s;
   private final Condition t;
   private boolean u;
   private final BluetoothGattCallback v;
   private final Runnable w;
   private final Runnable x;

   public d(Context var1, l var2) {
      this.e = fi.polar.a.i.a;
      this.f = new boolean[1];
      this.g = new HashMap();
      this.i = 0;
      this.j = 60000;
      this.k = 5000;
      this.l = 1000;
      this.m = 4000;
      this.n = 1000;
      this.p = false;
      this.s = new ReentrantLock();
      this.t = this.s.newCondition();
      this.u = false;
      this.v = new e(this);
      this.w = new f(this);
      this.x = new g(this);
      this.a = new h(this);
      this.h = var1;
      this.d = new k();
      this.c = android.support.v4.c.g.a(this.h);
      o var3 = new o(fi.polar.a.a_package.a.c, var2);
      var3.a(this.a);
      this.g.put(fi.polar.a.a_package.a.c, var3);
      n var4 = new n(fi.polar.a.a_package.a.d, var2);
      var4.a(this.a);
      this.g.put(fi.polar.a.a_package.a.d, var4);
   }

   // $FF: synthetic method
   static int a(d var0, int var1) {
      var0.i = var1;
      return var1;
   }

   // $FF: synthetic method
   static k a(d var0) {
      return var0.d;
   }

   private void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(int var1, byte[] var2) {
      boolean var3 = true;
      fi.polar.a.a_package.b.c(b, "onDataMtuCharNotificationChanged(status=" + fi.polar.a.a_package.b.b(var1) + ")");
      if (var1 == 0 && var2 != null && var2.length > 0) {
         if (var2[0] != 1) {
            var3 = false;
         }

         fi.polar.a.a_package.b.c(b, "onDataMtuCharNotificationChanged(enabled=" + var3 + ")");
         if (var3) {
            this.a(var3);
         } else if (!this.q()) {
            this.b(257, (byte[])null);
         }
      } else {
         fi.polar.a.a_package.b.c(b, "onDataMtuCharNotificationChanged(failed, start disconnecting)");
         if (!this.q()) {
            this.b(257, (byte[])null);
         }
      }

   }

   private void a(BluetoothDevice var1, Context var2, boolean var3, BluetoothGattCallback var4, int var5) {
      if (VERSION.SDK_INT >= 23) {
         this.d.a(var1, var2, var3, var4, var5);
      } else {
         this.d.a(var1, var2, var3, var4);
      }

   }

   // $FF: synthetic method
   static void a(d var0, int var1, byte[] var2) {
      var0.a(var1, var2);
   }

   private void a(i var1) {
      fi.polar.a.a_package.b.b(b, "setState(" + this.e + "->" + var1 + ")");
      this.e = var1;
   }

   private void a(boolean var1) {
      fi.polar.a.a_package.b.c(b, "onNotificationsSubscribed(enabled=" + var1 + ")");
      if (var1) {
         if (!this.r()) {
            this.c(257);
         }
      } else {
         fi.polar.a.a_package.b.c(b, "onNotificationsSubscribed(final characteristic disabled, disconnect from GATT)");
         this.t();
      }

   }

   private boolean a(BluetoothGattDescriptor var1, boolean var2) {
      byte[] var3;
      if (var2) {
         var3 = BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE;
      } else {
         var3 = BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE;
      }

      if (this.d.a(var1.getCharacteristic(), var2) && var1.setValue(var3)) {
         var2 = this.d.a(var1);
      } else {
         var2 = false;
      }

      fi.polar.a.a_package.b.c(b, "setCharacteristicNotification(success=" + var2 + ")");
      return var2;
   }

   // $FF: synthetic method
   static boolean a(d var0, UUID var1, UUID var2, byte[] var3) {
      return var0.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static boolean a(d var0, boolean var1) {
      var0.p = var1;
      return var1;
   }

   private boolean a(UUID var1, UUID var2) {
      boolean var3 = false;
      BluetoothGattCharacteristic var4 = this.b(var1, var2);
      if (var4 != null) {
         var3 = this.d.a(var4);
      }

      fi.polar.a.a_package.b.c(b, "readCharacteristic(serviceId=" + var1 + ", characteristicId=" + var2 + ", success=" + var3 + ")");
      return var3;
   }

   private boolean a(UUID var1, UUID var2, boolean var3) {
      boolean var4 = false;
      BluetoothGattCharacteristic var5 = this.b(var1, var2);
      fi.polar.a.a_package.b.c(b, "setCharacteristicNotification(serviceId=" + var1 + ", characteristicId=" + var2 + ", enable=" + var3 + ")");
      if (var5 != null) {
         BluetoothGattDescriptor var6 = var5.getDescriptor(fi.polar.a.a_package.a.a);
         if (var6 != null) {
            var3 = this.a(var6, var3);
         } else {
            fi.polar.a.a_package.b.d(b, "setCharacteristicNotification(Could not find Client Characteristic Configuration descriptor)");
            var3 = var4;
         }
      } else {
         fi.polar.a.a_package.b.d(b, "setCharacteristicNotification(Could not find characteristic)");
         var3 = var4;
      }

      return var3;
   }

   private boolean a(UUID param1, UUID param2, byte[] param3) {
      // $FF: Couldn't be decompiled
      return true;
   }

   private BluetoothGattCharacteristic b(UUID var1, UUID var2) {
      BluetoothGattService var3 = this.d.a(var1);
      fi.polar.a.a_package.b.c(b, "findCharacteristic=" + var1 + ", characteristicId=" + var2 + ")");
      BluetoothGattCharacteristic var4;
      if (var3 != null) {
         var4 = var3.getCharacteristic(var2);
      } else {
         var4 = null;
      }

      return var4;
   }

   // $FF: synthetic method
   static i b(d var0) {
      return var0.e;
   }

   private j b(int var1) {
      j var2 = fi.polar.a.j.a;
      j var3 = var2;
      if (this.i < 3) {
         var3 = var2;
         if (!this.d(var1)) {
            if (this.e == fi.polar.a.i.c) {
               var3 = fi.polar.a.j.b;
            } else {
               var3 = var2;
               if (this.e == fi.polar.a.i.b) {
                  var3 = fi.polar.a.j.c;
               }
            }
         }
      }

      fi.polar.a.a_package.b.c(b, "getReconnectMode(gattStatus=" + var1 + ", connectionState=" + this.e + ", mConnectFailCount=" + this.i + ", reconnectMode=" + var3 + ")");
      return var3;
   }

   // $FF: synthetic method
   static j b(d var0, int var1) {
      return var0.b(var1);
   }

   private void b(int var1, byte[] var2) {
      boolean var3 = true;
      fi.polar.a.a_package.b.c(b, "onH2DCharNotificationChanged(status=" + fi.polar.a.a_package.b.b(var1) + ")");
      if (var1 == 0 && var2 != null && var2.length > 0) {
         if (var2[0] != 1) {
            var3 = false;
         }

         fi.polar.a.a_package.b.c(b, "onH2DCharNotificationChanged(enabled=" + var3 + ")");
         this.a(var3);
      } else {
         fi.polar.a.a_package.b.c(b, "onH2DCharNotificationChanged(failed, disconnect)");
         this.t();
      }

   }

   // $FF: synthetic method
   static void b(d var0, int var1, byte[] var2) {
      var0.b(var1, var2);
   }

   // $FF: synthetic method
   static boolean b(d var0, boolean var1) {
      var0.u = var1;
      return var1;
   }

   private void c(int var1) {
      fi.polar.a.a_package.b.c(b, "onDataMtuCharRead(status=" + fi.polar.a.a_package.b.b(var1) + ")");
      this.m();
      if (var1 == 0) {
         this.a(fi.polar.a.i.c);
         this.c.a(new Intent("com.polar.pftp.ACTION_CONNECTED"));
         this.g();
      } else {
         this.a();
      }

   }

   // $FF: synthetic method
   static void c(d var0, int var1) {
      var0.c(var1);
   }

   // $FF: synthetic method
   static boolean c(d var0) {
      return var0.p;
   }

   // $FF: synthetic method
   static String d() {
      return b;
   }

   // $FF: synthetic method
   static void d(d var0) {
      var0.m();
   }

   private boolean d(int var1) {
      boolean var2;
      if (var1 != 0 && var1 != 257 && var1 != 3 && var1 != 2 && var1 != 7 && var1 != 15 && var1 != 13 && var1 != 143 && var1 != 5 && var1 != 6) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   // $FF: synthetic method
   static int e(d var0) {
      int var1 = var0.i;
      var0.i = var1 + 1;
      return var1;
   }

   private void e() {
      // $FF: Couldn't be decompiled
   }

   private void f() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void f(d var0) {
      var0.l();
   }

   private void g() {
      a var1 = (a)this.g.get(fi.polar.a.a_package.a.c);
      if (!var1.c()) {
         var1.a();
      }

      var1 = (a)this.g.get(fi.polar.a.a_package.a.d);
      if (!var1.c()) {
         var1.a();
      }

   }

   // $FF: synthetic method
   static boolean g(d var0) {
      return var0.j();
   }

   private void h() {
      a var1 = (a)this.g.get(fi.polar.a.a_package.a.c);
      if (var1.c()) {
         var1.b();
      }

      var1 = (a)this.g.get(fi.polar.a.a_package.a.d);
      if (var1.c()) {
         var1.b();
      }

   }

   // $FF: synthetic method
   static void h(d var0) {
      var0.s();
   }

   @TargetApi(23)
   private void i() {
      this.a(this.j);
      fi.polar.a.a_package.b.c(b, "connect(..attempt connectGatt)");
      this.a(this.o, this.h, true, this.v, 2);
   }

   // $FF: synthetic method
   static boolean i(d var0) {
      return var0.o();
   }

   // $FF: synthetic method
   static ReentrantLock j(d var0) {
      return var0.s;
   }

   private boolean j() {
      this.a(this.j);
      fi.polar.a.a_package.b.c(b, "reconnect(...attempt connect, gatt=" + this.d + ")");
      return this.d.a();
   }

   private int k() {
      int var1 = this.l * (1 << this.i - 1);
      int var2 = var1;
      if (var1 > this.m) {
         var2 = this.m;
      }

      return var2;
   }

   // $FF: synthetic method
   static Condition k(d var0) {
      return var0.t;
   }

   // $FF: synthetic method
   static Map l(d var0) {
      return var0.g;
   }

   private void l() {
      // $FF: Couldn't be decompiled
   }

   private void m() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void m(d var0) {
      var0.i();
   }

   private void n() {
      // $FF: Couldn't be decompiled
   }

   private boolean o() {
      fi.polar.a.a_package.b.c(b, "enableDataMtuCharNotification()");
      return this.a(fi.polar.a.a_package.a.b, fi.polar.a.a_package.a.c, true);
   }

   private boolean p() {
      fi.polar.a.a_package.b.c(b, "disableDataMtuCharNotification()");
      return this.a(fi.polar.a.a_package.a.b, fi.polar.a.a_package.a.c, false);
   }

   private boolean q() {
      fi.polar.a.a_package.b.c(b, "disableH2DCharNotification()");
      return this.a(fi.polar.a.a_package.a.b, fi.polar.a.a_package.a.e, false);
   }

   private boolean r() {
      fi.polar.a.a_package.b.c(b, "readDataMtuChar()");
      return this.a(fi.polar.a.a_package.a.b, fi.polar.a.a_package.a.c);
   }

   private void s() {
      i var1 = this.e;
      if (this.e != fi.polar.a.i.a) {
         this.h();
         this.f();
         this.a(fi.polar.a.i.a);
         android.support.v4.c.g var2 = this.c;
         String var3;
         if (var1 != fi.polar.a.i.b && var1 != fi.polar.a.i.e) {
            var3 = "com.polar.pftp.ACTION_DISCONNECTED";
         } else {
            var3 = "com.polar.pftp.ACTION_CONNECTION_FAILED";
         }

         var2.a(new Intent(var3));
      } else {
         fi.polar.a.a_package.b.a(b, "handleDisconnect(unexpected state, disconnected)");
      }

   }

   private void t() {
      this.m();
      this.s();
      this.d.b();
      this.d.c();
   }

   public void a() {
      this.m();
      if (this.e != fi.polar.a.i.a) {
         i var1;
         if (this.e == fi.polar.a.i.b) {
            var1 = fi.polar.a.i.e;
         } else {
            var1 = fi.polar.a.i.d;
         }

         this.a(var1);
         this.a(this.k);
         if (!this.p()) {
            this.a(257, (byte[])null);
         }
      } else {
         fi.polar.a.a_package.b.d(b, "Already disconnected");
      }

   }

   public boolean a(BluetoothDevice var1) {
      boolean var2 = false;
      fi.polar.a.a_package.b.b(b, "connect(name=\"" + var1.getName() + "\", addr=" + var1.getAddress() + ", connectionState=" + this.e + ")");
      if (this.e == fi.polar.a.i.a) {
         this.a(fi.polar.a.i.b);
         this.o = var1;
         this.i = 0;
         this.e();
         this.n();
         this.i();
         var2 = true;
      } else {
         fi.polar.a.a_package.b.b(b, "connect(failed, already connected/connecting)");
      }

      return var2;
   }

   public boolean b() {
      boolean var1;
      if (this.e == fi.polar.a.i.c) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean c() {
      boolean var1;
      if (this.e == fi.polar.a.i.b) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
