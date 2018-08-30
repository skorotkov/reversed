package fi.polar.polarflow.service.bluetooth;

import android.app.Service;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

public class BluetoothAdaptationService extends Service implements e {
   private static final String b = BluetoothAdaptationService.class.getSimpleName();
   BluetoothDevice a = null;
   private fi.polar.a.d c;
   private a d;
   private android.support.v4.c.g e;
   private l f;
   private h g;
   private WakeLock h;
   private m i;
   private int j;
   private Handler k;
   private int l;
   private int m;
   private final BroadcastReceiver n = new f(this);
   private final Runnable o = new g(this);

   public static Intent a(Context var0) {
      Intent var1 = new Intent(var0, BluetoothAdaptationService.class);
      var1.setAction("fi.polar.polarflow.service.bluetooth.action.STOP");
      return var1;
   }

   public static Intent a(Context var0, int var1) {
      Intent var2 = new Intent(var0, BluetoothAdaptationService.class);
      var2.setAction("fi.polar.polarflow.service.bluetooth.action.START_HOST_DISCOVERY");
      var2.putExtra("fi.polar.polarflow.service.bluetooth.extra.HOST_DISCOVERY_TIMEOUT", var1);
      return var2;
   }

   public static Intent a(Context var0, String var1, int var2) {
      Intent var3 = new Intent(var0, BluetoothAdaptationService.class);
      var3.setAction("fi.polar.polarflow.service.bluetooth.action.START_SYNC");
      var3.putExtra("fi.polar.polarflow.service.bluetooth.extra.HOST_ADDRESS", var1);
      var3.putExtra("fi.polar.polarflow.service.bluetooth.extra.RETRY_COUNT", var2);
      return var3;
   }

   // $FF: synthetic method
   static WakeLock a(BluetoothAdaptationService var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static String a() {
      return b;
   }

   private void a(BluetoothDevice var1, int var2) {
      fi.polar.polarflow.util.d.c(b, "handleStartSync(mCurrentDevice=" + var1 + ")");
      if (this.g != fi.polar.polarflow.service.bluetooth.h.a && this.g != fi.polar.polarflow.service.bluetooth.h.b) {
         fi.polar.polarflow.util.d.c(b, "handleStartSync(...Already in sync, will not start again)");
      } else {
         this.a(fi.polar.polarflow.service.bluetooth.h.c);
         this.a = var1;
         this.l = var2;
         this.m = 0;
         this.g();
         this.h();
      }

   }

   private void a(h var1) {
      h var2 = this.g;
      this.g = var1;
      fi.polar.polarflow.util.d.c(b, "setState(" + var2 + "->" + this.g + ")");
   }

   // $FF: synthetic method
   static h b(BluetoothAdaptationService var0) {
      return var0.g;
   }

   private void b() {
      this.l = 0;
      if (this.c == null || !this.c.b() && !this.c.c()) {
         this.stopSelf();
      } else {
         fi.polar.polarflow.util.d.c(b, "handleStop(...disconnect device)");
         this.a(fi.polar.polarflow.service.bluetooth.h.d);
         this.c.a();
      }

   }

   // $FF: synthetic method
   static m c(BluetoothAdaptationService var0) {
      return var0.i;
   }

   private void c() {
      fi.polar.polarflow.util.d.c(b, "handleServiceStopped()");
      this.g();
      if (this.c != null && (this.c.b() || this.c.c())) {
         fi.polar.polarflow.util.d.c(b, "handleServiceStopped(...disconnect device)");
         this.c.a();
      }

      if (this.h.isHeld()) {
         fi.polar.polarflow.util.d.c(b, "handleServiceStopped(...release wake lock)");
         this.h.release();
      }

      this.a(fi.polar.polarflow.service.bluetooth.h.a);
   }

   // $FF: synthetic method
   static int d(BluetoothAdaptationService var0) {
      return var0.m;
   }

   private void d() {
      fi.polar.polarflow.util.d.c(b, "startHostDiscovery()");
      if (this.j == 0) {
         this.stopSelf();
      } else {
         if (this.j > 7200000) {
            this.j = 7200000;
         }

         if (!this.d.c()) {
            this.d.a(fi.polar.a.a.a.b);
         } else {
            this.d.b();
         }

         this.e();
      }

   }

   // $FF: synthetic method
   static int e(BluetoothAdaptationService var0) {
      return var0.l;
   }

   private void e() {
      this.k.removeCallbacks(this.o);
      this.k.postDelayed(this.o, (long)this.j);
   }

   // $FF: synthetic method
   static int f(BluetoothAdaptationService var0) {
      int var1 = var0.m;
      var0.m = var1 + 1;
      return var1;
   }

   private void f() {
      fi.polar.polarflow.util.d.c(b, "handleStartHostDiscovery()");
      if (this.g == fi.polar.polarflow.service.bluetooth.h.a) {
         this.a(fi.polar.polarflow.service.bluetooth.h.b);
         this.d();
      } else if (this.g == fi.polar.polarflow.service.bluetooth.h.b) {
         this.d.b();
      } else {
         fi.polar.polarflow.util.d.e(b, "handleStartHostDiscovery(...Service busy, will not start discovery, state = " + this.g + ")");
      }

   }

   private void g() {
      fi.polar.polarflow.util.d.c(b, "stopHostDiscovery()");
      if (this.d.c()) {
         this.d.a();
      }

      this.k.removeCallbacks(this.o);
   }

   // $FF: synthetic method
   static void g(BluetoothAdaptationService var0) {
      var0.h();
   }

   // $FF: synthetic method
   static android.support.v4.c.g h(BluetoothAdaptationService var0) {
      return var0.e;
   }

   private void h() {
      fi.polar.polarflow.util.d.c(b, "handleStartSyncInternal(mCurrentDevice=" + this.a + ")");
      if (this.a != null) {
         if (!this.c.a(this.a)) {
            fi.polar.polarflow.util.d.e(b, "handleStartSyncInternal(...failed to initiate connect)");
            this.stopSelf();
         }
      } else {
         fi.polar.polarflow.util.d.b(b, "handleStartSyncInternal(...Tried to start sync but no device provided");
         this.stopSelf();
      }

   }

   public void a(BluetoothDevice var1) {
      fi.polar.polarflow.util.d.c(b, "onServiceProvided(name=" + var1.getName() + ", address=" + var1.getAddress() + ")");
      Intent var2 = new Intent();
      var2.setAction("fi.polar.polarflow.service.bluetooth.action.HOST_FOUND");
      var2.putExtra("fi.polar.polarflow.service.bluetooth.extra.HOST_ADDRESS", var1.getAddress());
      this.sendBroadcast(var2);
      this.stopSelf();
   }

   public IBinder onBind(Intent var1) {
      fi.polar.polarflow.util.d.b(b, "onBind(This service cannot be bound. Use context.startService instead)");
      return null;
   }

   public void onCreate() {
      fi.polar.polarflow.util.d.c(b, "onCreate()");
      super.onCreate();
      if (this.e == null) {
         this.e = android.support.v4.c.g.a(this);
      }

      if (this.i == null) {
         this.i = new m(this);
      }

      if (this.c == null) {
         this.c = new fi.polar.a.d(this, this.i);
      }

      if (this.d == null) {
         this.d = new a(this);
      }

      if (this.f == null) {
         this.f = new l(this);
      }

      this.k = new Handler();
      this.d.a((e)this);
      this.h = ((PowerManager)this.getSystemService("power")).newWakeLock(1, "sync_wakelock");
      IntentFilter var1 = new IntentFilter();
      var1.addAction("com.polar.pftp.ACTION_CONNECTION_FAILED");
      var1.addAction("com.polar.pftp.ACTION_CONNECTED");
      var1.addAction("com.polar.pftp.ACTION_DISCONNECTED");
      this.e.a(this.n, var1);
      this.h.setReferenceCounted(false);
      this.a(fi.polar.polarflow.service.bluetooth.h.a);
   }

   public void onDestroy() {
      fi.polar.polarflow.util.d.c(b, "onDestroy()");
      this.e.a(this.n);
      this.c();
      super.onDestroy();
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      fi.polar.polarflow.util.d.c(b, "onStartCommand(intent=" + var1 + ", flags=" + var2 + ", startId=" + var3 + ")");
      if (var1 != null) {
         String var4 = var1.getAction();
         if ("fi.polar.polarflow.service.bluetooth.action.START_SYNC".equals(var4)) {
            BluetoothDevice var5 = null;
            if (var1.hasExtra("fi.polar.polarflow.service.bluetooth.extra.HOST_ADDRESS")) {
               var5 = this.f.a().a(var1.getStringExtra("fi.polar.polarflow.service.bluetooth.extra.HOST_ADDRESS"));
            }

            this.a(var5, var1.getIntExtra("fi.polar.polarflow.service.bluetooth.extra.RETRY_COUNT", 0));
         } else if ("fi.polar.polarflow.service.bluetooth.action.STOP".equals(var4)) {
            this.b();
         } else if ("fi.polar.polarflow.service.bluetooth.action.START_HOST_DISCOVERY".equals(var4)) {
            this.j = var1.getIntExtra("fi.polar.polarflow.service.bluetooth.extra.HOST_DISCOVERY_TIMEOUT", 0);
            this.f();
         }
      }

      return 2;
   }
}
