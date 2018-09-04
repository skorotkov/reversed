package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.IBinder;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.UserDeviceSettings;
import fi.polar.polarflow.service.PresyncService;
import fi.polar.polarflow.service.sensorhubsocket.SensorHubDataWriterService;
import fi.polar.polarflow.ui.NotificationReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;

public class DailyActivityService extends k {
   private static final long f;
   private static final long g;
   private long A;
   private y B;
   private boolean C;
   private PresyncService D;
   private boolean E;
   private boolean F;
   private fi.polar.polarflow.b_package.c G;
   private final fi.polar.polarflow.c_sensor_package.d H;
   private final Runnable I;
   private final ak J;
   private final fi.polar.polarflow.service.j K;
   private final Runnable L;
   private final ServiceConnection M;
   final BroadcastReceiver e;
   private final Handler h = new Handler();
   private final IBinder i = new x(this);
   private final List j = Collections.synchronizedList(new ArrayList());
   private final List k = Collections.synchronizedList(new ArrayList());
   private final List l = Collections.synchronizedList(new ArrayList());
   private IntentFilter m;
   private Training n;
   private al o;
   private int p;
   private bs q;
   private z r;
   private ai s;
   private d t;
   private f u;
   private fi.polar.polarflow.service.activity.a_package.d v;
   private aj w;
   private ad x;
   private bv y;
   private DateTime z;

   static {
      f = TimeUnit.SECONDS.toNanos(6L);
      g = Math.min(TimeUnit.MICROSECONDS.toMillis(30000000L), TimeUnit.MICROSECONDS.toMillis(60000000L));
   }

   public DailyActivityService() {
      this.H = new o(this, this.h);
      this.I = new p(this);
      this.e = new q(this);
      this.J = new r(this);
      this.K = new s(this);
      this.L = new u(this);
      this.M = new v(this);
   }

   // $FF: synthetic method
   static int a(DailyActivityService var0, int var1) {
      var0.p = var1;
      return var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.b_package.c a(DailyActivityService var0, long var1) {
      return var0.b(var1);
   }

   // $FF: synthetic method
   static PresyncService a(DailyActivityService var0, PresyncService var1) {
      var0.D = var1;
      return var1;
   }

   private fi.polar.polarflow.service.activity.a_package.o a(am var1) {
      Object var2;
      if (var1 instanceof ao) {
         var2 = this.a((ao)var1);
      } else {
         var2 = this.a((aq)var1);
      }

      return (fi.polar.polarflow.service.activity.a_package.o)var2;
   }

   private fi.polar.polarflow.service.activity.a_package.p a(ao var1) {
      fi.polar.polarflow.b_package.c var2 = this.b(var1.b);
      if (var2 != null) {
         var2.a(var1.a, var1.b);
      }

      ar var3 = this.c(var1.b);
      an var4 = this.a(var1.b, f);
      fi.polar.polarflow.service.activity.a_package.p var12;
      if (var4 == null && a(var3) && !this.d(var1.b) && this.j.size() < 30) {
         var12 = null;
      } else {
         List var5 = this.b(var1.b + TimeUnit.MICROSECONDS.toNanos(30000000L), f);
         if (!var5.isEmpty()) {
            ad var13 = this.x;
            if (var13 != null) {
               Iterator var15 = var5.iterator();

               while(var15.hasNext()) {
                  an var6 = (an)var15.next();
                  var13.a(var1.a, var6.a);
               }
            }
         }

         DateTime var17 = this.q.a(var1.b);
         boolean var7 = this.a(var1.b);
         String var16 = "ActMet30s=" + var1.a;
         float var8 = var1.a;
         float var9 = var8;
         String var14 = var16;
         if (var4 != null) {
            var9 = var8;
            var14 = var16;
            if (var4.c != 0.0F) {
               var8 = this.s.a(var4.c);
               var9 = this.s.a(var1.a, var8);
               var14 = var16 + ", HrMet30s=" + var8 + ", ChosenMet30s=" + var9;
            }
         }

         int var10 = this.t.a(var9, var1.c, var7);
         var9 = this.t.c();
         (new StringBuilder()).append(var14).append(", FinalMet30s=").append(var9).toString();
         var9 = fi.polar.polarflow.a_package.a.a(19, var9);
         bv var11 = this.y;
         if (var11 != null) {
            if (var4 != null && var4.c != 0.0F) {
               var11.a(var9, var4.c);
            } else {
               var11.a(var9, 0.0F);
            }
         }

         this.u.a(var9, var17, var10);
         this.w.a(var17, this.t.d(), this.t.a(), this.t.b());
         this.C = this.a(var17);
         this.z = var17;
         var12 = new fi.polar.polarflow.service.activity.a_package.p(var17, var9, b(var3), var10);
      }

      return var12;
   }

   private fi.polar.polarflow.service.activity.a_package.s a(aq var1) {
      DateTime var2 = this.q.a(var1.b);
      this.u.a(var1.a, var2);
      this.z = var2;
      return new fi.polar.polarflow.service.activity.a_package.s(var2, (float)var1.a);
   }

   // $FF: synthetic method
   static ad a(DailyActivityService var0, ad var1) {
      var0.x = var1;
      return var1;
   }

   private an a(long param1, long param3) {
      // $FF: Couldn't be decompiled
      return null;
   }

   // $FF: synthetic method
   static bv a(DailyActivityService var0, bv var1) {
      var0.y = var1;
      return var1;
   }

   // $FF: synthetic method
   static y a(DailyActivityService var0) {
      return var0.B;
   }

   // $FF: synthetic method
   static y a(DailyActivityService var0, y var1) {
      var0.B = var1;
      return var1;
   }

   public static void a(Context var0) {
      var0.startService(new Intent(var0, DailyActivityService.class));
   }

   // $FF: synthetic method
   static void a(DailyActivityService var0, w var1) {
      var0.a(var1);
   }

   private void a(w var1) {
      Intent var2 = new Intent("DailyActivityService.action.USER_INACTIVITY_STATUS");
      var2.putExtra("DailyActivityService.extra.INACTIVITY_STATUS", var1);
      var2.setClass(this.getApplicationContext(), NotificationReceiver.class);
      this.a(var2);
   }

   private void a(boolean var1) {
      boolean var2 = this.u.a(var1);
      var1 = this.v.a(var1);
      if (var2 && var1) {
         this.A = this.q.b();
      }

      this.q();
   }

   // $FF: synthetic method
   static boolean a(DailyActivityService var0, boolean var1) {
      var0.F = var1;
      return var1;
   }

   private static boolean a(ar var0) {
      boolean var1;
      if (var0 != null && var0.a != -1L && !var0.c && var0.d) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean a(DateTime var1) {
      boolean var2;
      if (this.z != null && !fi.polar.polarflow.util.ab.a(var1, this.z)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private static long b(ar var0) {
      long var1;
      if (var0 != null) {
         var1 = var0.a;
      } else {
         var1 = -1L;
      }

      return var1;
   }

   private fi.polar.polarflow.b_package.c b(long var1) {
      return null;
   }

   // $FF: synthetic method
   static f b(DailyActivityService var0) {
      return var0.u;
   }

   private List b(long param1, long param3) {
      // $FF: Couldn't be decompiled
      return null;
   }

   public static void b(Context var0) {
      var0.stopService(new Intent(var0, DailyActivityService.class));
   }

   // $FF: synthetic method
   static void b(DailyActivityService var0, int var1) {
      var0.c(var1);
   }

   // $FF: synthetic method
   static void b(DailyActivityService var0, boolean var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static ak c(DailyActivityService var0) {
      return var0.J;
   }

   private ar c(long param1) {
      // $FF: Couldn't be decompiled
      return null;
   }

   private void c(int var1) {
      if (var1 > 0) {
         this.v.b();
         this.q();
         this.n();
      }

   }

   // $FF: synthetic method
   static aj d(DailyActivityService var0) {
      return var0.w;
   }

   private boolean d(long var1) {
      long var3 = ac.b(this.k);
      boolean var5;
      if (var3 != 0L && var3 > var1) {
         var5 = true;
      } else {
         var5 = false;
      }

      return var5;
   }

   // $FF: synthetic method
   static z e(DailyActivityService var0) {
      return var0.r;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_sensor_package.d f(DailyActivityService var0) {
      return var0.H;
   }

   // $FF: synthetic method
   static al g(DailyActivityService var0) {
      return var0.o;
   }

   // $FF: synthetic method
   static IntentFilter h(DailyActivityService var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static List i(DailyActivityService var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static Runnable j(DailyActivityService var0) {
      return var0.I;
   }

   // $FF: synthetic method
   static bs k(DailyActivityService var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static List l(DailyActivityService var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static ai m(DailyActivityService var0) {
      return var0.s;
   }

   // $FF: synthetic method
   static Training n(DailyActivityService var0) {
      return var0.n;
   }

   private void n() {
      Intent var1 = new Intent(this, SensorHubDataWriterService.class);
      var1.setAction("SensorHubDataWriterService.action.SET_SENSOR_PHYSICAL_DATA");
      var1.putExtra("SensorHubDataWriterService.extra.PHYSICAL_DATA", (new fi.polar.polarflow.service.sensorhubsocket.i()).a(UserDeviceSettings.getUsersDeviceLocation()).a(PhysData.getUserPhysData()).a());
      this.startService(var1);
   }

   // $FF: synthetic method
   static List o(DailyActivityService var0) {
      return var0.k;
   }

   private boolean o() {
      boolean var1;
      if (this.A != -1L && this.q.b() - this.A <= 540000L) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   // $FF: synthetic method
   static Handler p(DailyActivityService var0) {
      return var0.h;
   }

   private void p() {
      ad var1 = this.x;
      bv var2 = this.y;
      if (var1 != null || var2 != null) {
         Intent var3 = new Intent("DailyActivityService.action.TRAINING_LOAD_DATA");
         if (var1 != null) {
            var3.putExtra("DailyActivityService.extra.TOTAL_CALORIES", var1.a());
         }

         if (var2 != null) {
            var3.putExtra("DailyActivityService.extra.TRAINING_LOAD", var2.a());
            var3.putExtra("DailyActivityService.extra.RECOVERY_TIME", var2.b());
            var3.putExtra("DailyActivityService.extra.FAT_CONSUMPTION", var2.c());
         }

         this.c.b(var3);
      }

   }

   // $FF: synthetic method
   static fi.polar.polarflow.service.j q(DailyActivityService var0) {
      return var0.K;
   }

   private void q() {
      this.r.a();
      if (this.C) {
         fi.polar.polarflow.util.w.a((Context)this);
         this.C = false;
      }

   }

   // $FF: synthetic method
   static PresyncService r(DailyActivityService var0) {
      return var0.D;
   }

   private void r() {
      this.t();
      this.F = true;
      this.h.post(this.L);
   }

   private void s() {
      this.t();
      this.F = true;
      this.h.postDelayed(this.L, 4000L);
   }

   private void t() {
      this.h.removeCallbacks(this.L);
      this.F = false;
   }

   protected IBinder a() {
      return this.i;
   }

   protected void a(int var1) {
      if (var1 > 0) {
         this.p();
         this.a(this.o());
      }

      if (this.F) {
         this.r();
      }

   }

   public void a(int var1, long var2) {
      this.o.a(var1, var2);
   }

   protected void a(Intent var1) {
      this.sendBroadcast(var1);
   }

   public boolean a(long var1) {
      Boolean var3 = this.o.a(var1);
      boolean var4;
      if (var3 == null) {
         var4 = false;
      } else {
         var4 = var3;
      }

      return var4;
   }

   protected void b() {
      fi.polar.polarflow.util.d.c("DailyActivityService", "onStartTracking()");
      if (this.B == fi.polar.polarflow.service.activity.y.a) {
         this.B = fi.polar.polarflow.service.activity.y.b;
         this.n();
         this.v.a((fi.polar.polarflow.service.activity.a_package.f)(new n(this)));
         this.E = this.bindService(new Intent(this, PresyncService.class), this.M, 1);
      }

   }

   public void b(int var1) {
      this.o.a(var1);
   }

   protected void c() {
      fi.polar.polarflow.util.d.c("DailyActivityService", "onStopTracking()");
      if (this.G != null) {
         this.G.b();
      }

      if (this.B == fi.polar.polarflow.service.activity.y.b) {
         this.v.a();
      } else if (this.B == fi.polar.polarflow.service.activity.y.c) {
         this.a.b(this.b);
         this.o.b();
         this.o.a(this.p);
         this.c.a(this.e);
         this.w.b();
         this.u.b();
         this.v.a();
         this.r.a();
      }

      this.B = fi.polar.polarflow.service.activity.y.a;
      if (this.D != null) {
         this.D.b(this.K);
         this.D = null;
      }

      if (this.E) {
         this.unbindService(this.M);
         this.E = false;
      }

   }

   protected int e() {
      // $FF: Couldn't be decompiled
      return 0;
   }

   public void h() {
      long var1 = this.q.a();
      long var3;
      if (this.z != null) {
         var3 = this.z.getMillis();
      } else {
         var3 = 0L;
      }

      if (var1 - var3 >= g) {
         this.s();
         this.b.a(this.H);
      } else {
         this.r();
      }

   }

   public int i() {
      return this.o.h();
   }

   public long j() {
      return this.o.i();
   }

   public void onCreate() {
      fi.polar.polarflow.util.d.c("DailyActivityService", "onCreate()");
      super.onCreate();
      this.m = new IntentFilter();
      this.m.addAction("TrainingService.action.TRAINING_STARTED");
      this.m.addAction("TrainingService.action.TRAINING_PAUSED");
      this.m.addAction("TrainingService.action.TRAINING_RESUMED");
      this.m.addAction("TrainingService.action.TRAINING_STOPPED");
      this.m.addAction("ExerciseSampleHeartrateCalc.ACTION_HR_AVG_DATA");
      this.m.addAction("SyncJournalingService.action.JOURNALING_COMPLETED");
      this.m.addAction("fi.polar.polarflow.action.FLUSH_LOGS");
      if (this.n == null) {
         this.n = Training.getInstance();
      }

      this.a.a((SensorEventListener)this.H);
      if (this.o == null) {
         this.o = new al(this);
      }

      if (this.q == null) {
         this.q = new bs(this);
      }

      this.r = new z(this, this.d);
      this.v = new fi.polar.polarflow.service.activity.a_package.d(this, this.c, this.q, this.r);
      this.s = new ai();
      this.t = new d();
      this.u = new f(this.c, this.q, this.r);
      if (this.w == null) {
         this.w = new aj();
      }

      this.B = fi.polar.polarflow.service.activity.y.a;
      this.A = -1L;
   }
}
