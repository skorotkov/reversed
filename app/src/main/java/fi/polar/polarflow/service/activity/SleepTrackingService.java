package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.IBinder;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import fi.polar.polarflow.ui.NotificationReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SleepTrackingService extends a {
   private static final long e;
   private final IBinder f = new bm(this);
   private final Handler g = new Handler();
   private final List h = Collections.synchronizedList(new ArrayList());
   private final ExecutorService i = Executors.newSingleThreadExecutor();
   private final Set j = Collections.synchronizedSet(new HashSet());
   private av k;
   private fi.polar.polarflow.util.z l;
   private bb m;
   private bd n;
   private Future o;
   private DailyActivityService p;
   private boolean q;
   private int r;
   private boolean s;
   private final fi.polar.polarflow.c_package.d t;
   private final Runnable u;
   private final Runnable v;
   private final ServiceConnection w;
   private final BroadcastReceiver x;

   static {
      e = TimeUnit.SECONDS.toNanos(1L);
   }

   public SleepTrackingService() {
      super(65545, "com.polar.sensor.sleep.std");
      this.t = new be(this, this.g);
      this.u = new bf(this);
      this.v = new bg(this);
      this.w = new bh(this);
      this.x = new bi(this);
   }

   // $FF: synthetic method
   static int a(SleepTrackingService var0, int var1) {
      var0.r = var1;
      return var1;
   }

   private long a(long var1) {
      if (this.s) {
         var1 = Long.MAX_VALUE;
      } else if (this.p != null) {
         var1 = this.p.j();
      }

      return var1;
   }

   // $FF: synthetic method
   static long a(SleepTrackingService var0, long var1) {
      return var0.a(var1);
   }

   // $FF: synthetic method
   static DailyActivityService a(SleepTrackingService var0, DailyActivityService var1) {
      var0.p = var1;
      return var1;
   }

   // $FF: synthetic method
   static bb a(SleepTrackingService var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static Future a(SleepTrackingService var0, Future var1) {
      var0.o = var1;
      return var1;
   }

   public static void a(Context var0) {
      var0.startService(new Intent(var0, SleepTrackingService.class));
   }

   // $FF: synthetic method
   static void a(SleepTrackingService var0, bd var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static void a(SleepTrackingService var0, fi.polar.polarflow.util.b.a var1, boolean var2) {
      var0.a(var1, var2);
   }

   private void a(bd var1) {
      Intent var2 = new Intent("SleepTrackingService.action.SLEEP_STATE_CHANGED");
      var2.putExtra("SleepTrackingService.extra.SLEEP_STATE", var1);
      this.c.b(var2);
   }

   private void a(fi.polar.polarflow.util.b.a var1, boolean var2) {
      Intent var3 = new Intent("SleepTrackingService.action.SLEEP_ANALYSIS_RESULT");
      var3.putExtra("SleepTrackingService.extra.SLEEP_ANALYSIS", var1);
      if (var2) {
         Intent var4 = new Intent(var3);
         var4.setClass(this.getApplicationContext(), NotificationReceiver.class);
         this.sendBroadcast(var4);
      }

      this.c.b(var3);
   }

   private static boolean a(int var0, int var1) {
      boolean var2;
      if ((float)var0 * 100.0F / (float)var1 < 3.0F) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   // $FF: synthetic method
   static boolean a(SleepTrackingService var0, fi.polar.polarflow.util.b.a var1) {
      return var0.a(var1);
   }

   private boolean a(fi.polar.polarflow.util.b.a var1) {
      SleepAnalysisResult var2 = SleepAnalysisResult.findByPath(var1.c());
      boolean var3;
      if (var2 != null && var1.a() <= var2.getSleepLength()) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   // $FF: synthetic method
   static bd b(SleepTrackingService var0, bd var1) {
      var0.n = var1;
      return var1;
   }

   // $FF: synthetic method
   static Set b(SleepTrackingService var0) {
      return var0.j;
   }

   public static void b(Context var0) {
      var0.stopService(new Intent(var0, SleepTrackingService.class));
   }

   // $FF: synthetic method
   static void b(SleepTrackingService var0, fi.polar.polarflow.util.b.a var1, boolean var2) {
      var0.b(var1, var2);
   }

   private void b(fi.polar.polarflow.util.b.a var1, boolean var2) {
      (new ba(this, this.l, this.d, var1, var2)).run();
   }

   private boolean b(long var1) {
      boolean var3;
      if (!this.s && this.p != null && this.p.a(var1)) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   // $FF: synthetic method
   static boolean b(SleepTrackingService var0, long var1) {
      return var0.b(var1);
   }

   // $FF: synthetic method
   static Handler c(SleepTrackingService var0) {
      return var0.g;
   }

   private void c(long var1) {
      this.p.a(this.r, var1);
   }

   // $FF: synthetic method
   static void c(SleepTrackingService var0, long var1) {
      var0.c(var1);
   }

   // $FF: synthetic method
   static bd d(SleepTrackingService var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static long e() {
      return e;
   }

   // $FF: synthetic method
   static List e(SleepTrackingService var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static Runnable f(SleepTrackingService var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static long g(SleepTrackingService var0) {
      return var0.i();
   }

   // $FF: synthetic method
   static DailyActivityService h(SleepTrackingService var0) {
      return var0.p;
   }

   private boolean h() {
      boolean var1 = false;
      Intent var2 = this.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      if (var2 != null) {
         var1 = a(var2.getIntExtra("level", -1), var2.getIntExtra("scale", 100));
      }

      return var1;
   }

   private long i() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static ExecutorService i(SleepTrackingService var0) {
      return var0.i;
   }

   protected IBinder a() {
      return this.f;
   }

   void a(int var1, boolean var2) {
      if (!var2) {
         this.g.post(this.v);
      }

   }

   public void a(bo var1) {
      fi.polar.polarflow.util.d.c("SleepTrackingService", "unregisterListener(" + var1 + ")");
      this.j.remove(var1);
   }

   public boolean a(bo var1, boolean var2, boolean var3) {
      fi.polar.polarflow.util.d.c("SleepTrackingService", "forceEnd(" + var1 + ", " + var2 + ", " + var3 + ")");
      boolean var4 = false;
      if (this.d()) {
         if (var1 != null) {
            this.j.add(var1);
         }

         this.i.submit(new bl(this, var2, var3));
         var4 = true;
      }

      return var4;
   }

   protected void b() {
      fi.polar.polarflow.util.d.c("SleepTrackingService", "onStartTracking()");
      this.q = this.bindService(new Intent(this, DailyActivityService.class), this.w, 1);
      if (this.m == null) {
         this.m = new bb(this);
      }

      this.n = null;
      this.a.a(this.b, 2000000);
      this.b.a(this.t);
      IntentFilter var1 = new IntentFilter();
      var1.addAction("DailyActivityService.action.LONG_TERM_NON_WEAR");
      var1.addAction("fi.polar.polarflow.action.FLUSH_LOGS");
      this.c.a(this.x, var1);
      if (this.k == null) {
         this.k = new av();
         this.getApplicationContext().registerReceiver(this.k, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
      }

   }

   protected void c() {
      fi.polar.polarflow.util.d.c("SleepTrackingService", "onStopTracking()");
      if (this.n != bd.a) {
         this.m.b();
         if (this.m.d()) {
            fi.polar.polarflow.util.b.a var1 = this.m.e();
            if (var1 != null && this.a(var1)) {
               fi.polar.polarflow.util.b.c var3 = new fi.polar.polarflow.util.b.c(var1);
               byte var2;
               if (this.h()) {
                  var2 = 1;
               } else {
                  var2 = 0;
               }

               this.b(var3.h(var2).a(), false);
            }
         }
      }

      this.c.a(this.x);
      this.a.b(this.b);
      this.i.shutdownNow();
      this.g.removeCallbacksAndMessages((Object)null);
      this.m.a();
      this.m = null;
      if (this.p != null) {
         this.p.b(this.r);
         this.r = 0;
         this.p = null;
      }

      if (this.q) {
         this.unbindService(this.w);
         this.q = false;
      }

      if (this.k != null) {
         this.getApplicationContext().unregisterReceiver(this.k);
         this.k = null;
      }

   }

   protected void f() {
      if (this.o != null && !this.o.isDone() && !this.o.isCancelled()) {
         fi.polar.polarflow.util.d.c("SleepTrackingService", "onStartJob(): task is already running");
      } else {
         this.o = this.i.submit(new bp(this, (be)null));
      }

   }

   protected boolean g() {
      if (this.o != null && !this.o.isDone() && !this.o.isCancelled()) {
         fi.polar.polarflow.util.d.c("SleepTrackingService", "onStopJob(): canceling process events task");
         this.o.cancel(true);
         this.o = null;
      }

      return false;
   }

   public void onCreate() {
      super.onCreate();
      this.a.a((SensorEventListener)this.t);
      if (this.l == null) {
         this.l = new fi.polar.polarflow.util.z();
      }

   }
}
