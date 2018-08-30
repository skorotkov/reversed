package fi.polar.polarflow.service.activity;

import android.content.Context;
import android.util.SparseArray;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.SleepWakePhase;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepAnalyzerAndroidImpl;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepCalculatorAndroidImpl;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepCalculatorResult;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepEvaluationResult;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepQualityRate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;

class bb {
   private static final SparseArray a = new bc();
   private SleepCalculatorAndroidImpl b;
   private final br c;
   private SleepCalculatorResult d;
   private long e;
   private long f;
   private int g;
   private boolean h;
   private DateTime i;
   private final Context j;
   private fi.polar.polarflow.b.f k;

   public bb(Context var1) {
      this(var1, new fi.polar.polarflow.util.aa());
   }

   public bb(Context var1, fi.polar.polarflow.util.aa var2) {
      this.j = var1;
      this.b = new SleepCalculatorAndroidImpl();
      this.c = new br(var2);
   }

   private int a(DateTime var1) {
      int var2 = 0;
      if (var1 != null) {
         var2 = this.b(this.c.a(this.c.g(), var1));
      }

      return var2;
   }

   private fi.polar.polarflow.b.f a(long var1) {
      return null;
   }

   private void a(int var1) {
      this.a(var1, this.k());
   }

   private void a(int var1, long var2) {
      if (var1 != this.g) {
         this.a(fi.polar.polarflow.b.g.b[this.g] + " -> " + fi.polar.polarflow.b.g.b[var1], var2);
         fi.polar.polarflow.b.f var4 = this.a(var2);
         if (var4 != null) {
            var4.a(var1, var2);
         }

         this.g = var1;
      }

   }

   private void a(String var1) {
      this.a(var1, this.k());
   }

   private void a(String var1, long var2) {
      fi.polar.polarflow.b.f var4 = this.a(var2);
      if (var4 != null) {
         var4.a(var1);
      }

   }

   private void a(DateTime var1, DateTime var2, DateTime var3, SleepCalculatorResult var4, SleepEvaluationResult var5, long var6) {
   }

   private int b(long var1) {
      byte var3 = 0;
      int var4 = var3;
      if (this.f > 0L) {
         if (var1 > this.f) {
            var4 = (int)TimeUnit.NANOSECONDS.toSeconds(var1 - this.f);
         } else {
            this.a("timestampToSecondsFromCalcStart(" + var1 + "), time is before calculation start: " + this.d(this.f) + " (" + this.f + ")");
            var4 = var3;
         }
      }

      return var4;
   }

   private void b(DateTime var1, DateTime var2) {
      if (this.f > 0L) {
         int var3 = this.a(var1);
         int var4 = var3;
         if (var3 == 0) {
            this.a("Long-term non-wear period start before calc start, set it to 1 s from calc start");
            var4 = 1;
         }

         var3 = this.a(var2);
         if (var3 > 0) {
            this.a("storeNonWearInfo(" + var4 + ", " + var3 + ")");
            this.b.storeNonWearInfo(var4, var3);
         } else {
            this.a("Ignore long-term non-wear period, end time is before calc start");
         }
      } else {
         this.a("Ignore long-term non-wear period, no calculation ongoing");
      }

   }

   private DateTime c(long var1) {
      return this.c.a(this.c.g(), var1);
   }

   private String d(long var1) {
      return this.c.b(this.c.g(), var1);
   }

   private void g() {
      this.b = new SleepCalculatorAndroidImpl();
      this.h();
      this.a(0);
   }

   private void h() {
      this.f = 0L;
      this.h = false;
   }

   private fi.polar.polarflow.b.f i() {
      return this.a(this.k());
   }

   private List j() {
      ArrayList var1 = new ArrayList();
      if (this.d != null) {
         List var2 = this.d.getCompressedTimeStamps();
         List var3 = this.d.getCompressedStates();
         if (var2 != null && var3 != null && var2.size() == var3.size()) {
            for(int var4 = 0; var4 < var2.size(); ++var4) {
               var1.add(new SleepWakePhase(((Double)var2.get(var4)).intValue(), ((Double)var3.get(var4)).intValue()));
            }
         }
      }

      return var1;
   }

   private long k() {
      return TimeUnit.MILLISECONDS.toNanos(this.c.b());
   }

   public void a() {
      if (this.k != null) {
         this.k.b();
      }

   }

   public void a(long var1, int var3, int var4, int var5, boolean var6) {
      fi.polar.polarflow.b.f var7 = this.a(var1);
      if ((long)this.b(var1) > TimeUnit.DAYS.toSeconds(1L) && this.g == 1) {
         this.a("24h passed and no sleep detected", var1);
         this.g();
      }

      if (this.f == 0L) {
         this.f = var1;
         this.a("calcStart=" + this.d(var1), var1);
      }

      if (var6 != this.h) {
         if (var6) {
            if (var7 != null) {
               var7.a(fi.polar.polarflow.b.e.a, var1);
            }

            this.b.startNonWear();
         } else {
            if (var7 != null) {
               var7.a(fi.polar.polarflow.b.e.b, var1);
            }

            this.b.stopNonWear();
         }

         this.h = var6;
      }

      int var8 = this.b.timeIncrement1s(var3, var4, var5);
      if (var7 != null) {
         var7.a(var3, var4, var5, var1);
      }

      if (var8 != this.g) {
         if (var8 == 5) {
            this.d = this.b.getResult();
            this.e = this.f;
            this.h();
            this.a(var8, var1);
         } else {
            this.a(var8, var1);
         }
      }

   }

   public void a(DateTime var1, DateTime var2) {
      this.a("setLongTermNonWear(start=" + var1 + ", end=" + var2 + ")");
      if (var1 != null) {
         if (var2 != null) {
            this.b(var1, var2);
            this.i = null;
         } else {
            this.a("Ignore long-term non-wear period start for now, end time not known yet");
            this.i = var1;
         }
      }

   }

   public void b() {
      this.a("forceEnd()");
      if (this.f > 0L) {
         if (this.i != null) {
            this.b(this.i, this.c.c());
         }

         fi.polar.polarflow.b.f var1 = this.i();
         if (var1 != null) {
            var1.a(fi.polar.polarflow.b.e.c, this.k());
         }

         SleepCalculatorResult var2 = this.b.forceEnd();
         if (var2 != null) {
            this.a("Got result from forceEnd()");
            this.d = var2;
            this.e = this.f;
         } else {
            this.a("Got null from forceEnd()");
         }

         this.h();
         this.a(0);
      }

   }

   public bd c() {
      bd var1 = (bd)a.get(this.g);
      if (var1 == null) {
         var1 = bd.a;
      }

      return var1;
   }

   public boolean d() {
      boolean var1;
      if (this.d != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fi.polar.polarflow.util.b.a e() {
      fi.polar.polarflow.util.b.a var8;
      if (this.d != null) {
         fi.polar.polarflow.util.k var1 = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
         SleepAnalyzerAndroidImpl var2 = new SleepAnalyzerAndroidImpl();
         double var3 = (double)var1.D() / 60.0D;
         SleepEvaluationResult var9 = var2.evaluateSleep(this.d.getCompressedTimeStamps(), this.d.getCompressedStates(), (double)var1.p(), var3, SleepQualityRate.ANSWER_NOT_AVAILABLE);
         DateTime var5 = this.c(this.e);
         DateTime var6 = var5.plusSeconds(this.d.getSleepStartTime());
         DateTime var7 = var5.plusSeconds(this.d.getSleepEndTime());
         this.a(var5, var6, var7, this.d, var9, this.k());
         var8 = (new fi.polar.polarflow.util.b.c()).a(var6).b(var7).c(new DateTime()).a((int)var9.getDuration()).b((int)var9.getSleepSpan()).c((int)var9.getTotalInterruptionDuration()).d(var1.D()).e(var9.getOneNightFeedback()).a(var9.getEfficiency()).b(var9.getContinuityIndex()).f((int)var9.getContinuityIndexClass()).a(this.j()).a();
         this.d = null;
         this.e = 0L;
      } else {
         var8 = null;
      }

      return var8;
   }

   public void f() {
      fi.polar.polarflow.b.f var1 = this.i();
      if (var1 != null) {
         var1.a();
      }

   }
}
