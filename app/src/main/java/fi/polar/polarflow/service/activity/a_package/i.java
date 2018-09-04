package fi.polar.polarflow.service.activity.a_package;

import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarmathsmart.calories.BasalMetabolicRateCalculatorAndroidImpl;
import fi.polar.polarmathsmart.calories.DailyCaloriesCalculator;
import fi.polar.polarmathsmart.calories.DailyCaloriesCalculatorAndroidImpl;
import fi.polar.polarmathsmart.calories.DailyCaloriesResults;
import java.util.ArrayList;

class i extends k {
   private final DailyCaloriesCalculator b = new DailyCaloriesCalculatorAndroidImpl();
   private double c;
   private double d;
   private double e;
   private double f;

   public i() {
      super(v.a);
   }

   private float a(long var1) {
      float var4;
      if (var1 != -2L && var1 != -1L) {
         Sport var3 = Sport.getSport(var1);
         if (var3 != null) {
            var4 = var3.getFactor();
         } else {
            var4 = 1.0F;
         }
      } else {
         var4 = 0.0F;
      }

      return var4;
   }

   private void a(p var1) {
      ArrayList var2 = new ArrayList();
      var2.add(var1.c);
      ArrayList var3 = new ArrayList();
      var3.add(this.a(var1.d));
      ArrayList var4 = new ArrayList();
      var4.add(fi.polar.polarflow.service.activity.d.a(var1.e));
      DailyCaloriesResults var7 = this.b.calculateDailyCalories(var2, var3, var4, this.e());
      this.d += var7.getActivityCalories();
      this.e += var7.getExerciseCalories();
      double var5 = this.f;
      this.f = var7.getBmrCalories() + var5;
   }

   private double e() {
      if (this.c == 0.0D) {
         fi.polar.polarflow.util.k var1 = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
         this.c = (new BasalMetabolicRateCalculatorAndroidImpl()).calculateBasalMetabolicRateInKcalPerMinute(var1.p(), (double)var1.t(), (double)var1.s(), var1.r());
      }

      return this.c;
   }

   public void a() {
      super.a();
      this.c = 0.0D;
      this.d = 0.0D;
      this.e = 0.0D;
      this.f = 0.0D;
   }

   public void a(o var1) {
      if (var1 instanceof p) {
         this.a((p)var1);
      } else {
         fi.polar.polarflow.util.d.c("CumulativeCalories", "", new IllegalArgumentException("Expecting SummarizerInputMet"));
      }

   }

   public double b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }
}
