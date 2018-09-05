package fi.polar.polarflow.service.activity;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.recoverystatus.RecoveryTimeCalculator;
import fi.polar.polarmathsmart.recoverystatus.RecoveryTimeCalculatorAndroidImpl;
import fi.polar.polarmathsmart.trainingload.ExerciseTrainingLoadCalculatorAndroidImpl;
import java.util.Collections;
import java.util.List;

class bv {
   private static final String a = bv.class.getSimpleName();
   private final ExerciseTrainingLoadCalculatorAndroidImpl b;
   private final RecoveryTimeCalculator c;
   private final float d;
   private float e = -1.0F;
   private long f = -1L;
   private int g = -1;

   public bv(float var1) {
      fi.polar.polarflow.util.k var2 = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
      float var3 = var1;
      if (var1 == -1.0F) {
         var3 = 1.0F;
         fi.polar.polarflow.util.d.e(a, "Sport factor is undefined, using 1.0f");
      }

      this.b = new ExerciseTrainingLoadCalculatorAndroidImpl((double)var2.s(), (double)var2.t(), var2.y(), var2.r(), var2.p(), var2.v(), var2.u(), var2.w(), var2.x(), (double)var3);
      this.c = new RecoveryTimeCalculatorAndroidImpl();
      this.d = var2.C();
   }

   private double a(double var1) {
      List var3 = Collections.singletonList(var1);
      return (Double)this.c.scaleRecoveryTime(var3, (double)this.d).get(0);
   }

   private static long b(double var0) {
      return (long)(3600000.0D * var0);
   }

   public int a() {
      int var1;
      if (this.e != -1.0F) {
         var1 = (int)this.e;
      } else {
         var1 = -1;
      }

      return var1;
   }

   public void a(float var1, float var2) {
      this.b.exerciseTrainingLoadUpdate(var1, var2);
      this.e = this.b.exerciseTrainingLoadGetTrainingLoad();
      this.f = b(this.a((double)this.b.exerciseTrainingLoadGetUnscaledRecoveryTime()));
      this.g = (int)this.b.exerciseTrainingLoadGetFatPercent();
   }

   public long b() {
      if (this.f != -1L) {
         this.f = a_DataTypes.a_adjust(22, this.f);
      }

      return this.f;
   }

   public int c() {
      return this.g;
   }
}
