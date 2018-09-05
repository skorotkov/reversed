package fi.polar.polarflow.service.activity;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.calories.ExerciseCaloriesCalculator;
import fi.polar.polarmathsmart.calories.ExerciseCaloriesCalculatorAndroidImpl;

class ad {
   protected ExerciseCaloriesCalculator a;
   private final ai b;
   private double c;

   public ad() {
      this(new ai());
   }

   public ad(ai var1) {
      this.b = var1;
   }

   private void a(float var1) {
      this.c += this.c(this.b.b(var1));
   }

   private ExerciseCaloriesCalculator b() {
      if (this.a == null) {
         this.a = this.c();
      }

      return this.a;
   }

   private void b(float var1) {
      this.c += this.c(var1);
   }

   private boolean b(float var1, float var2) {
      boolean var3 = false;
      boolean var4 = var3;
      if (var2 != 0.0F) {
         var2 = this.b.a(var2);
         var4 = var3;
         if (var2 == this.b.a(var1, var2)) {
            var4 = true;
         }
      }

      return var4;
   }

   private double c(float var1) {
      return this.b().calculateEnergyPerMinute(var1) / 6.0D;
   }

   private ExerciseCaloriesCalculator c() {
      fi.polar.polarflow.util.k var1 = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
      return new ExerciseCaloriesCalculatorAndroidImpl(var1.r(), var1.p(), (double)var1.s(), (double)var1.t(), var1.v(), var1.u(), var1.y());
   }

   public int a() {
      return a_DataTypes.a_adjust(7, (int)this.c);
   }

   public void a(float var1, float var2) {
      if (this.b(var1, var2)) {
         this.b(var2);
      } else {
         this.a(var1);
      }

   }
}
