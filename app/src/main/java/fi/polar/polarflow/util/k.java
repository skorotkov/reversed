package fi.polar.polarflow.util;

import android.util.SparseArray;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.defaults.DefaultPhysicalParametersCalculator;
import fi.polar.polarmathsmart.defaults.DefaultPhysicalParametersCalculatorAndroidImpl;
import fi.polar.polarmathsmart.heartrate.DefaultHRValuesCalculator;
import fi.polar.polarmathsmart.heartrate.DefaultHRValuesCalculatorAndroidImpl;
import fi.polar.polarmathsmart.heartrate.HeartRateSitCalculator;
import fi.polar.polarmathsmart.heartrate.HeartRateSitCalculatorAndroidImpl;
import fi.polar.polarmathsmart.respiration.Vo2MaxCalculator;
import fi.polar.polarmathsmart.respiration.Vo2MaxCalculatorAndroidImpl;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepAnalyzer;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepAnalyzerAndroidImpl;
import fi.polar.polarmathsmart.types.ActivityLevel;
import fi.polar.polarmathsmart.types.Gender;
import org.joda.time.LocalDate;

public class k {
   public static final LocalDate a = new LocalDate(1980, 1, 1);
   private static final SparseArray b = new l();
   private static final SparseArray c = new m();
   private final PhysData d;
   private final DefaultPhysicalParametersCalculator e;
   private final DefaultHRValuesCalculator f;
   private final HeartRateSitCalculator g;
   private final Vo2MaxCalculator h;
   private final SleepAnalyzer i;

   public k() {
      this((PhysData)null);
   }

   public k(PhysData var1) {
      this.d = var1;
      this.e = new DefaultPhysicalParametersCalculatorAndroidImpl();
      this.f = new DefaultHRValuesCalculatorAndroidImpl();
      this.g = new HeartRateSitCalculatorAndroidImpl();
      this.h = new Vo2MaxCalculatorAndroidImpl();
      this.i = new SleepAnalyzerAndroidImpl();
   }

   public static int a(ActivityLevel var0) {
      int var1 = b.indexOfValue(var0);
      if (var1 >= 0) {
         var1 = b.keyAt(var1);
      } else {
         var1 = 1;
      }

      return var1;
   }

   public static ActivityLevel a(int var0) {
      ActivityLevel var1 = (ActivityLevel)b.get(var0);
      if (var1 == null) {
         var1 = ActivityLevel.MOSTLY_SITTING;
      }

      return var1;
   }

   public static Gender b(int var0) {
      Gender var1;
      if (var0 == 2) {
         var1 = Gender.FEMALE;
      } else {
         var1 = Gender.MALE;
      }

      return var1;
   }

   public ActivityLevel A() {
      return a(this.B());
   }

   public int B() {
      int var1;
      if (this.d != null && this.d.getTypicalDay() != Integer.MAX_VALUE) {
         var1 = this.d.getTypicalDay();
      } else {
         var1 = this.n();
      }

      return var1;
   }

   public float C() {
      float var1;
      if (this.d != null && this.d.getWeeklyRecoveryTimeSum() != -1.0F) {
         var1 = this.d.getWeeklyRecoveryTimeSum();
      } else {
         var1 = this.o();
      }

      return var1;
   }

   public int D() {
      int var1;
      if (this.d != null && this.d.getUserSleepGoalMinutes() != 0) {
         var1 = this.d.getUserSleepGoalMinutes();
      } else {
         var1 = this.f();
      }

      return var1;
   }

   public LocalDate a() {
      return a;
   }

   public int b() {
      return PhysData.getAge(this.a());
   }

   public int c() {
      return 1;
   }

   public float d() {
      return (float)this.e.getDefaultWeight();
   }

   public float e() {
      return (float)this.e.getDefaultHeight();
   }

   public int f() {
      return (int)(this.i.getSleepDurationRecommendation((double)this.p()).getDefaultRecommendation() * 60.0D);
   }

   public int g() {
      return this.f.getDefaultHrMax(this.p());
   }

   public int h() {
      return this.f.getDefaultHrRest();
   }

   public int i() {
      return this.f.getDefaultAerobicThreshold(this.u());
   }

   public int j() {
      return this.f.getDefaultAnaerobicThreshold(this.u());
   }

   public int k() {
      return this.h.getDefaultVo2Max(this.p(), this.r(), (double)this.t(), (double)this.s());
   }

   public int l() {
      return 20;
   }

   public ActivityLevel m() {
      return this.e.getDefaultTypicalDay();
   }

   public int n() {
      return a(this.m());
   }

   public float o() {
      Float var1 = (Float)c.get(this.z());
      Float var2 = var1;
      if (var1 == null) {
         var2 = (Float)c.get(this.l());
      }

      return var2;
   }

   public int p() {
      int var1;
      if (this.d != null && this.d.getAge() != 0) {
         var1 = this.d.getAge();
      } else {
         var1 = this.b();
      }

      return var1;
   }

   public int q() {
      int var1;
      if (this.d != null && this.d.getGender() != Integer.MAX_VALUE) {
         var1 = this.d.getGender();
      } else {
         var1 = this.c();
      }

      return var1;
   }

   public Gender r() {
      return b(this.q());
   }

   public float s() {
      float var1;
      if (this.d != null && this.d.getWeight() != 0.0F) {
         var1 = this.d.getWeight();
      } else {
         var1 = this.d();
      }

      return var1;
   }

   public float t() {
      float var1;
      if (this.d != null && this.d.getHeight() != 0.0F) {
         var1 = this.d.getHeight();
      } else {
         var1 = this.e();
      }

      return var1;
   }

   public int u() {
      int var1;
      if (this.d != null && this.d.getMaximumHeartrate() != 0) {
         var1 = this.d.getMaximumHeartrate();
      } else {
         var1 = this.g();
      }

      return var1;
   }

   public int v() {
      int var1;
      if (this.d != null && this.d.getRestingHeartrate() != 0) {
         var1 = this.d.getRestingHeartrate();
      } else {
         var1 = this.h();
      }

      return var1;
   }

   public int w() {
      int var1;
      if (this.d != null && this.d.getAerobicThreshold() != 0) {
         var1 = this.d.getAerobicThreshold();
      } else {
         var1 = this.i();
      }

      return var1;
   }

   public int x() {
      int var1;
      if (this.d != null && this.d.getAnaerobicThreshold() != 0) {
         var1 = this.d.getAnaerobicThreshold();
      } else {
         var1 = this.j();
      }

      return var1;
   }

   public int y() {
      int var1;
      if (this.d != null && this.d.getVo2max() != 0) {
         var1 = this.d.getVo2max();
      } else {
         var1 = this.k();
      }

      return var1;
   }

   public int z() {
      int var1;
      if (this.d != null && this.d.getTrainingBackground() != Integer.MAX_VALUE) {
         var1 = this.d.getTrainingBackground();
      } else {
         var1 = this.l();
      }

      return var1;
   }
}
