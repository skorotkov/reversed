package fi.polar.polarflow.calculators;

import android.content.Context;
import android.os.Handler;
import android.util.SparseLongArray;
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

public class am {
   private static final String a = am.class.getSimpleName();
   private static final long l;
   private int A;
   private int B;
   private int C;
   private long D;
   private long E;
   private final fi.polar.polarflow.c_package.e F;
   private final fi.polar.polarflow.c_package.e G;
   private final fi.polar.polarflow.c_package.l H;
   private final Runnable I;
   private final af J;
   private final List b;
   private final Context c;
   private final SparseLongArray d;
   private final SparseLongArray e;
   private final SparseLongArray f;
   private fi.polar.polarflow.c_package.b g;
   private fi.polar.polarflow.c_package.f h;
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
   private fi.polar.polarflow.c_package.d_package.a v;
   private fi.polar.polarflow.c_package.c_package.a w;
   private fi.polar.polarflow.c_package.a_package.e x;
   private bb y;
   private SwimmingSamples z;

   static {
      l = TimeUnit.MILLISECONDS.toNanos(500L);
   }

   public am(Context var1) {
      this(var1, Training.getInstance(), new Handler());
   }

   public am(Context var1, Training var2, Handler var3) {
      this.m = 5;
      this.F = new an(this);
      this.G = new ao(this);
      this.H = new ap(this);
      this.I = new aq(this);
      this.J = new ar(this);
      this.c = var1;
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
   static int a(am var0, int var1) {
      var0.i = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(am var0, long var1) {
      var0.j = var1;
      return var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.b a(am var0, fi.polar.polarflow.c_package.b var1) {
      var0.g = var1;
      return var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.f a(am var0, fi.polar.polarflow.c_package.f var1) {
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
   static void a(am var0, int var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(am var0, int var1, boolean var2, int var3) {
      var0.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static void a(am var0, List var1, int var2) {
      var0.a(var1, var2);
   }

   private void a(List param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static boolean a(am var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static long b(am var0, long var1) {
      var0.E = var1;
      return var1;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.util.aa b(am var0) {
      return var0.t;
   }

   // $FF: synthetic method
   static void b(am var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static int c(am var0, int var1) {
      var0.k = var1;
      return var1;
   }

   // $FF: synthetic method
   static long c(am var0, long var1) {
      var0.D = var1;
      return var1;
   }

   // $FF: synthetic method
   static int[] c(am var0) {
      return var0.u;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.b d(am var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static String d() {
      return a;
   }

   // $FF: synthetic method
   static int e(am var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static long e() {
      return l;
   }

   // $FF: synthetic method
   static long f(am var0) {
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
   static List g(am var0) {
      return var0.p;
   }

   private void g() {
      this.i();
      this.b.clear();
   }

   // $FF: synthetic method
   static int h(am var0) {
      return var0.A;
   }

   private void h() {
      this.i();
      this.D = this.s.getSamplingStartTimeFromBoot();
      this.r.postDelayed(this.I, 1000L);
   }

   // $FF: synthetic method
   static int i(am var0) {
      int var1 = var0.A;
      var0.A = var1 + 1;
      return var1;
   }

   private void i() {
      this.r.removeCallbacks(this.I);
   }

   // $FF: synthetic method
   static SparseLongArray j(am var0) {
      return var0.d;
   }

   private void j() {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static List k(am var0) {
      return var0.q;
   }

   // $FF: synthetic method
   static int l(am var0) {
      return var0.B;
   }

   // $FF: synthetic method
   static int m(am var0) {
      int var1 = var0.B;
      var0.B = var1 + 1;
      return var1;
   }

   // $FF: synthetic method
   static SparseLongArray n(am var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static long o(am var0) {
      return var0.E;
   }

   // $FF: synthetic method
   static fi.polar.polarflow.c_package.f p(am var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static int q(am var0) {
      return var0.k;
   }

   // $FF: synthetic method
   static Training r(am var0) {
      return var0.s;
   }

   // $FF: synthetic method
   static long s(am var0) {
      return var0.D;
   }

   // $FF: synthetic method
   static SparseLongArray t(am var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static Handler u(am var0) {
      return var0.r;
   }

   // $FF: synthetic method
   static List v(am var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static SwimmingSamples w(am var0) {
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
      if (this.w != null) {
         this.w.a((fi.polar.polarflow.c_package.l)null);
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

      if (this.v != null) {
         this.v.a((fi.polar.polarflow.c_package.l)null);
         this.j();
      }

      if (this.x != null) {
         this.x.a((fi.polar.polarflow.c_package.l)null);
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

   void a(int var1, fi.polar.polarflow.c_package.f var2) {
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

   public void a(fi.polar.polarflow.c_package.d_package.a var1, fi.polar.polarflow.c_package.c_package.a var2, fi.polar.polarflow.c_package.a_package.e var3, fi.polar.polarflow.c_package.a_package.a var4) {
      fi.polar.polarflow.util.d.c(a, "startSessionCalculators");
      this.b.clear();
      if (var1 != null) {
         this.v = var1;
         this.b.add(new s());
         this.b.add(new t());
         if (this.v.e() == fi.polar.polarflow.c_package.m.d) {
            this.s.getStatistics().getSpeedStatistics().b(this.v.p());
         }

         this.v.a(this.G);
         this.h = this.v.k();
      }

      float var5;
      long var6;
      if (var2 != null) {
         this.w = var2;
         this.b.add(new q(this.c));
         if (this.w.e() == fi.polar.polarflow.c_package.m.d) {
            this.s.getStatistics().getHeartrateStatistics().b((float)this.w.n());
            var5 = (float)this.w.n();
            var6 = this.t.c();
            this.g = new fi.polar.polarflow.c_package.b(new float[]{var5}, var6, 3);
         } else {
            var6 = this.t.c();
            this.g = new fi.polar.polarflow.c_package.b(new float[]{0.0F}, var6, -1);
         }

         this.w.a(this.F);
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
            this.b.add(new az(this.c, var6, this.y));
            if (var9 == 2) {
               this.b.add(new av(this.c, var6, this.y));
            } else if (var9 == 3) {
               this.b.add(new ax(this.c, var8.getSettings().getAutomaticLapDuration(), var6, this.y));
            }
         }
      } else if (var2 != null || var1 != null) {
         this.b.add(new ab(this.c, var6));
         if (var9 == 2) {
            this.b.add(new d(this.c, var8.getSettings().getAutomaticLapDistance(), var6));
         } else if (var9 == 3) {
            this.b.add(new e(this.c, var8.getSettings().getAutomaticLapDuration(), var6));
         }
      }

      if (this.s.getTrainingSessionTarget() != null) {
         if (this.s.getTrainingSessionTarget().getExerciseTarget().getTargetType() == 2) {
            this.b.add(new j(this.c));
         } else if (this.s.getTrainingSessionTarget().getExerciseTarget().getTargetType() == 1) {
            this.b.add(new w(this.c));
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
         this.x = var3;
         this.x.a(this.H);
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
