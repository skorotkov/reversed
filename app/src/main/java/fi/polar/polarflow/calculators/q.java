package fi.polar.polarflow.calculators;

import android.content.Context;
import android.content.Intent;
import android.util.SparseIntArray;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.TrainingStatistics;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.Zones;
import fi.polar.polarmathsmart.trainingbenefit.TrainingBenefitCalculatorAndroidImpl;
import fi.polar.polarmathsmart.trainingbenefit.TrainingFeedback;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class q extends aj implements ak, y {
   private static final ArrayList a = new ArrayList(1);
   private static final SparseIntArray d;
   private final android.support.v4.c.g b;
   private Training e;

   static {
      a.add(fi.polar.polarflow.c_package.n.d);
      d = new r(18);
   }

   q(Context var1) {
      super(a);
      android.support.v4.c.g var2;
      if (var1 != null) {
         var2 = android.support.v4.c.g.a(var1);
      } else {
         var2 = null;
      }

      this.b = var2;
      this.e = Training.getInstance();
      this.a(new z());
   }

   private static float a(int var0, Training var1) {
      float var2 = 0.0F;
      TrainingStatistics var3 = var1.getStatistics();
      if (var3 != null) {
         var2 = var3.getHeartrateStatistics().a(var0);
      }

      return var2;
   }

   private static Intent a(float var0, float var1, long var2) {
      Intent var4 = new Intent("ExerciseSampleHeartrateCalc.ACTION_HR_AVG_DATA");
      var4.putExtra("ExerciseSampleHeartrateCalcKEY_TIMESTAMP", TimeUnit.MILLISECONDS.toNanos(var2));
      if (var0 != 0.0F) {
         var4.putExtra("ExerciseSampleHeartrateCalcKEY_HR_AVG_10S", var0);
      }

      if (var1 != 0.0F) {
         var4.putExtra("ExerciseSampleHeartrateCalcKEY_HR_AVG_30S", var1);
      }

      return var4;
   }

   private int b() {
      TrainingFeedback var1 = TrainingFeedback.NONE;
      List var2 = this.e.getSamples().cloneHeartRateListShort();
      if ((long)var2.size() >= TimeUnit.MINUTES.toSeconds(10L)) {
         fi.polar.polarflow.util.k var3 = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
         var1 = (new TrainingBenefitCalculatorAndroidImpl()).calculateTrainingBenefit(var2, 1, var3.r(), var3.p(), (double)var3.s(), (double)var3.t(), var3.v(), var3.u(), var3.y(), Zones.getHeartRateZoneLimits(this.e));
      }

      fi.polar.polarflow.util.d.c("ExerciseSampleHeartrateCalc", "Training benefit: " + var1.toString());
      return d.get(var1.ordinal());
   }

   public void a() {
      z var1 = (z)this.o();
      this.e.getSamples().addHeartrateSample(var1.a(), var1.l(), var1.n());
      if ((var1.l() + 1) % 10 == 0) {
         float var2 = a(10, this.e);
         float var3 = a(30, this.e);
         this.b.a(a(var2, var3, var1.m()));
      }

   }

   public void a(int var1, int var2) {
      if (var1 < var2) {
         this.e.getSamples().addHeartRateOfflineRange(var1, var2);
      }

   }

   public void d() {
      int var1 = this.p();
      if (var1 != -1) {
         this.e.getSamples().addHeartRateOfflineRange(var1, ((z)this.o()).l());
      }

      this.e.setBenefit(this.b());
   }
}
