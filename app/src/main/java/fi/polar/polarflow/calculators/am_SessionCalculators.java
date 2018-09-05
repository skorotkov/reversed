package fi.polar.polarflow.calculators;

import android.content.Context;
import android.os.Handler;
import android.util.SparseLongArray;

import fi.polar.polarflow.c_sensor_package.a_accelerometer_package.a_AccelerometerSensor;
import fi.polar.polarflow.c_sensor_package.a_accelerometer_package.e_RunningCadenceProvider;
import fi.polar.polarflow.c_sensor_package.b_PolarSensorEventBase;
import fi.polar.polarflow.c_sensor_package.c_heartrate_package.a_HeartRateSensor;
import fi.polar.polarflow.c_sensor_package.d_gps_package.a_GpsLocationProviderBase;
import fi.polar.polarflow.c_sensor_package.e_PolarSensorListenerEx;
import fi.polar.polarflow.c_sensor_package.f_PolarSensorEvent;
import fi.polar.polarflow.c_sensor_package.l_PolarSensorListener;
import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.TrainingStatistics;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.SwimmingSamples;
import fi.polar.polarflow.data.orm.UserDeviceSettings;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingPoolInformation;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;

public class am_SessionCalculators {
   private static final String a = am_SessionCalculators.class.getSimpleName();
   private static final long l;
   private int A;
   private int B;
   private int C;
   private long D;
   private long E;
   private final e_PolarSensorListenerEx F_heartRatePolarSensorListener;
   private final e_PolarSensorListenerEx G_gpsPolarSensorListener;
   private final l_PolarSensorListener H_runningCadencePolarSensorListener;
   private final Runnable I;
   private final af J;
   private final List b;
   private final Context context;
   private final SparseLongArray d;
   private final SparseLongArray e;
   private final SparseLongArray f;
   private b_PolarSensorEventBase g;
   private f_PolarSensorEvent h;
   private int i;
   private long j;
   private int k;
   private final int m;
   private boolean n;
   private boolean o;
   private final List p;
   private final List q;
   private final Handler r;
   private final Training s;
   private fi.polar.polarflow.util.aa t;
   private final int[] u;
   private a_GpsLocationProviderBase v_gpsSensor;
   private a_HeartRateSensor w_heartRateSensor;
   private e_RunningCadenceProvider x_runningCadenceProvider;
   private bb y;
   private SwimmingSamples z;

   static {
      l = TimeUnit.MILLISECONDS.toNanos(500L);
   }

   public am_SessionCalculators(Context var1) {
      this(var1, Training.getInstance(), new Handler());
   }

   public am_SessionCalculators(Context var1, Training var2, Handler var3) {
      this.m = 5;
      this.F_heartRatePolarSensorListener = new an(this);
      this.G_gpsPolarSensorListener = new ao(this);
      this.H_runningCadencePolarSensorListener = new ap(this);
      this.I = new aq(this);
      this.J = new ar(this);
      this.context = var1;
      this.b = new ArrayList();
      this.d = new SparseLongArray();
      this.e = new SparseLongArray();
      this.f = new SparseLongArray();
      this.r = var3;
      this.u = new int[]{0};
      this.s = var2;
      this.t = new fi.polar.polarflow.util.aa();
      this.E = 0L;
      this.p = new ArrayList();
      this.q = new ArrayList();
      this.i = -1;
      this.j = 0L;
      this.k = 0;
   }

   // $FF: synthetic method
   static int a(am_SessionCalculators var0, int var1) {
      var0.i = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(am_SessionCalculators var0, long var1) {
      var0.j = var1;
      return var1;
   }

   // $FF: synthetic method
   static b_PolarSensorEventBase a(am_SessionCalculators var0, b_PolarSensorEventBase var1) {
      var0.g = var1;
      return var1;
   }

   // $FF: synthetic method
   static f_PolarSensorEvent a(am_SessionCalculators var0, f_PolarSensorEvent var1) {
      var0.h = var1;
      return var1;
   }

   private void a(int param1) {
      // $FF: Couldn't be decompiled
   }

   private void a(int var1, boolean var2) {
      this.a(var1, var2, Integer.MAX_VALUE);
   }

   private void a(int param1, boolean param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void a(am_SessionCalculators var0, int var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(am_SessionCalculators var0, int var1, boolean var2, int var3) {
      var0.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static void a(am_SessionCalculators var0, List var1, int var2) {
      var0.a(var1, var2);
   }

   private void a(List param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean a(am_SessionCalculators var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static long b(am_SessionCalculators var0, long var1) {
      var0.E = var1;
      return var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.util.aa b(am_SessionCalculators var0) {
      return var0.t;
   }

   // $FF: synthetic method
   static void b(am_SessionCalculators var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static int c(am_SessionCalculators var0, int var1) {
      var0.k = var1;
      return var1;
   }

   // $FF: synthetic method
   static long c(am_SessionCalculators var0, long var1) {
      var0.D = var1;
      return var1;
   }

   // $FF: synthetic method
   static int[] c(am_SessionCalculators var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static b_PolarSensorEventBase d(am_SessionCalculators var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static String d() {
      return a;
   }

   // $FF: synthetic method
   static int e(am_SessionCalculators var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static long e() {
      return l;
   }

   // $FF: synthetic method
   static long f(am_SessionCalculators var0) {
      return var0.j;
   }

   private static SwimmingPoolInformation f() {
      int var0 = fi.polar.polarflow.util.u.a().k();
      int var1 = fi.polar.polarflow.util.u.a().j();
      int var2 = var1;
      if (var0 == 1) {
         var2 = fi.polar.polarflow.ui.o.b(var1);
      }

      return new SwimmingPoolInformation(var0, (float)var2);
   }

   // $FF: synthetic method
   static List g(am_SessionCalculators var0) {
      return var0.p;
   }

   private void g() {
      this.i();
      this.b.clear();
   }

   // $FF: synthetic method
   static int h(am_SessionCalculators var0) {
      return var0.A;
   }

   private void h() {
      this.i();
      this.D = this.s.getSamplingStartTimeFromBoot();
      this.r.postDelayed(this.I, 1000L);
   }

   // $FF: synthetic method
   static int i(am_SessionCalculators var0) {
      int var1 = var0.A;
      var0.A = var1 + 1;
      return var1;
   }

   private void i() {
      this.r.removeCallbacks(this.I);
   }

   // $FF: synthetic method
   static SparseLongArray j(am_SessionCalculators var0) {
      return var0.d;
   }

   private void j() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static List k(am_SessionCalculators var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static int l(am_SessionCalculators var0) {
      return var0.B;
   }

   // $FF: synthetic method
   static int m(am_SessionCalculators var0) {
      int var1 = var0.B;
      var0.B = var1 + 1;
      return var1;
   }

   // $FF: synthetic method
   static SparseLongArray n(am_SessionCalculators var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static long o(am_SessionCalculators var0) {
      return var0.E;
   }

   // $FF: synthetic method
   static f_PolarSensorEvent p(am_SessionCalculators var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static int q(am_SessionCalculators var0) {
      return var0.k;
   }

   // $FF: synthetic method
   static Training r(am_SessionCalculators var0) {
      return var0.s;
   }

   // $FF: synthetic method
   static long s(am_SessionCalculators var0) {
      return var0.D;
   }

   // $FF: synthetic method
   static SparseLongArray t(am_SessionCalculators var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static Handler u(am_SessionCalculators var0) {
      return var0.r;
   }

   // $FF: synthetic method
   static List v(am_SessionCalculators var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static SwimmingSamples w(am_SessionCalculators var0) {
      return var0.z;
   }

   public void a() {
      boolean var1 = false;
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         al var3 = (al)var2.next();
         if (var3 instanceof aj) {
            ((aj)var3).b(true);
         }
      }

      this.o = true;
      if (this.w_heartRateSensor != null) {
         this.w_heartRateSensor.a_setPolarSensorListener((l_PolarSensorListener)null);
         int var4;
         if (this.i != -1) {
            var4 = this.i;
         } else {
            var4 = 0;
         }

         if (this.i != -1) {
            var1 = true;
         }

         this.a(var4, var1);
      }

      if (this.v_gpsSensor != null) {
         this.v_gpsSensor.a_setPolarSensorListener((l_PolarSensorListener)null);
         this.j();
      }

      if (this.x_runningCadenceProvider != null) {
         this.x_runningCadenceProvider.a_setPolarSensorListener((l_PolarSensorListener)null);
         this.a(this.k);
      }

      if (this.y != null) {
         SwimmingStatistics var5 = this.y.a();
         TrainingStatistics var7 = Training.getInstance().getStatistics();
         if (var7 != null) {
            var7.setSwimmingStatistics(new fi.polar.polarflow.data.orm.SwimmingStatistics(var5));
         }
      }

      Iterator var8 = this.b.iterator();

      while(var8.hasNext()) {
         al var6 = (al)var8.next();
         if (var6 instanceof y) {
            ((y)var6).d();
         }
      }

      this.g();
   }

   void a(int var1, int var2) {
      long var3 = this.d.get(this.A);
      if (this.o) {
         this.d.put(this.A, 0L);
      } else {
         this.d.delete(this.A);
      }

      boolean var5 = true;
      if (var2 == 0) {
         var5 = false;
      }

      Iterator var6 = this.b.iterator();

      while(var6.hasNext()) {
         al var7 = (al)var6.next();
         if (var7 instanceof h) {
            ((h)var7).b(new z(var1, var3, var5, var2));
         } else if (var7 instanceof q) {
            ((q)var7).b(new z(var1, var3, var5, var2));
         } else if (var7 instanceof j) {
            ((j)var7).b(new z(var1, var3, var5, var2));
         }
      }

   }

   void a(int var1, f_PolarSensorEvent var2) {
      long var3 = this.e.get(this.B);
      if (this.o) {
         this.e.put(this.B, 0L);
      } else {
         this.e.delete(this.B);
      }

      Iterator var5 = this.b.iterator();

      while(var5.hasNext()) {
         al var6 = (al)var5.next();
         if (var6 instanceof h) {
            ((h)var6).b(new aa(var1, var3, var2));
         } else if (var6 instanceof s) {
            ((s)var6).b(new aa(var1, var3, var2));
         } else if (var6 instanceof t) {
            ((t)var6).b(new v(var1, var3, var2));
         } else if (var6 instanceof j) {
            ((j)var6).b(new aa(var1, var3, var2));
         }
      }

   }

   public void a_startSessionCalculators(a_GpsLocationProviderBase var1, a_HeartRateSensor var2, e_RunningCadenceProvider var3, a_AccelerometerSensor var4) {
      fi.polar.polarflow.util.d.c(a, "startSessionCalculators");
      this.b.clear();
      if (var1 != null) {
         this.v_gpsSensor = var1;
         this.b.add(new s());
         this.b.add(new t());
         if (this.v_gpsSensor.e_getState() == m_SENSOR_STATE.d_READY) {
            this.s.getStatistics().getSpeedStatistics().b(this.v_gpsSensor.p());
         }

         this.v_gpsSensor.a_setPolarSensorListener(this.G_gpsPolarSensorListener);
         this.h = this.v_gpsSensor.k();
      }

      float var5;
      long var6;
      if (var2 != null) {
         this.w_heartRateSensor = var2;
         this.b.add(new q(this.context));
         if (this.w_heartRateSensor.e_getState() == m_SENSOR_STATE.d_READY) {
            this.s.getStatistics().getHeartrateStatistics().b((float)this.w_heartRateSensor.n());
            var5 = (float)this.w_heartRateSensor.n();
            var6 = this.t.c();
            this.g = new b_PolarSensorEventBase(new float[]{var5}, var6, 3);
         } else {
            var6 = this.t.c();
            this.g = new b_PolarSensorEventBase(new float[]{0.0F}, var6, -1);
         }

         this.w_heartRateSensor.a_setPolarSensorListener(this.F_heartRatePolarSensorListener);
      }

      SportProfile var8 = this.s.getSportProfile();
      int var9 = -1;
      if (var8 != null) {
         var9 = var8.getSettings().getAutomaticLap();
      }

      var6 = this.s.getStartTimeFromBoot();
      if (var4 != null) {
         if (Sport.isSwimmingSport(this.s.getSportId())) {
            this.z = this.s.getSwimmingSamples();
            this.z.setStart(new DateTime(this.s.getStartTime()));
            this.y = new bb(var2, var4, var6);
            var5 = -1.0F;
            if (var8 != null) {
               var5 = var8.getSettings().getAutomaticLapDistance();
            }

            this.y.a(f(), UserDeviceSettings.getUsersDeviceLocation(), var5);
            this.y.a(this.J);
            this.b.add(new az(this.context, var6, this.y));
            if (var9 == 2) {
               this.b.add(new av(this.context, var6, this.y));
            } else if (var9 == 3) {
               this.b.add(new ax(this.context, var8.getSettings().getAutomaticLapDuration(), var6, this.y));
            }
         }
      } else if (var2 != null || var1 != null) {
         this.b.add(new ab(this.context, var6));
         if (var9 == 2) {
            this.b.add(new d(this.context, var8.getSettings().getAutomaticLapDistance(), var6));
         } else if (var9 == 3) {
            this.b.add(new e(this.context, var8.getSettings().getAutomaticLapDuration(), var6));
         }
      }

      if (this.s.getTrainingSessionTarget() != null) {
         if (this.s.getTrainingSessionTarget().getExerciseTarget().getTargetType() == 2) {
            this.b.add(new j(this.context));
         } else if (this.s.getTrainingSessionTarget().getExerciseTarget().getTargetType() == 1) {
            this.b.add(new w(this.context));
         }
      }

      Sport var10;
      if (var8 != null) {
         var10 = var8.getSport();
      } else {
         var10 = null;
      }

      if (var1 != null && var2 != null && var10 != null && var10.getParentId() == 1L) {
         this.b.add(new p());
      }

      if (var3 != null) {
         this.b.add(new o());
         this.x_runningCadenceProvider = var3;
         this.x_runningCadenceProvider.a_setPolarSensorListener(this.H_runningCadencePolarSensorListener);
      }

      if (!this.b.isEmpty()) {
         this.D = this.s.getSamplingStartTimeFromBoot();
         this.r.post(this.I);
      }

   }

   public void b() {
      fi.polar.polarflow.util.d.c(a, "pauseSessionCalculators");
      this.n = true;
      this.i();
      Iterator var1 = this.b.iterator();

      while(var1.hasNext()) {
         al var2 = (al)var1.next();
         if (var2 instanceof ae) {
            ((ae)var2).b();
         }
      }

      if (this.y != null) {
         this.y.b();
      }

   }

   void b(int var1, int var2) {
      long var3 = this.f.get(this.C);
      if (this.o) {
         this.f.put(this.C, 0L);
      } else {
         this.f.delete(this.C);
      }

      b var5 = new b(var1, var3, var2);
      Iterator var6 = this.b.iterator();

      while(var6.hasNext()) {
         al var7 = (al)var6.next();
         if (var7 instanceof o) {
            ((o)var7).b(var5);
         } else if (var7 instanceof h) {
            ((h)var7).b(var5);
         } else if (var7 instanceof j) {
            ((j)var7).b(var5);
         }
      }

   }

   public void c() {
      fi.polar.polarflow.util.d.c(a, "resumeSessionCalculators");
      this.n = false;
      Iterator var1 = this.b.iterator();

      while(var1.hasNext()) {
         al var2 = (al)var1.next();
         if (var2 instanceof ah) {
            ((ah)var2).c();
         }
      }

      if (this.y != null) {
         this.y.c();
      }

      this.h();
   }
}
