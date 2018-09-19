package fi.polar.polarflow.calculators;

import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.TrainingSamples;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.runningindex.ExerciseRunningIndexCalculatorAndroidImpl;
import fi.polar.polarmathsmart.runningindex.ExerciseRunningIndexResult;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class p_ExerciseRunningIndexCalc implements al_Calc, y {
   private static final int b;
   private final Training a_training;

   static {
      b = (int)(TimeUnit.MINUTES.toMillis(12L) / 1000L);
   }

   public p_ExerciseRunningIndexCalc() {
      this((Training)null);
   }

   p_ExerciseRunningIndexCalc(Training var1) {
      if (var1 == null) {
         var1 = Training.getInstance();
      }

      this.a_training = var1;
   }

   private static boolean a_enoughDataToCalculate(TrainingSamples var0) {
      boolean var1;
      if (var0.getHeartRateSamplesCount() >= b && var0.getSpeedSamplesCount() >= b && var0.getAltitudeSamplesCount() >= b) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static ExerciseRunningIndexResult b_calculateRunningIndex(TrainingSamples var0) {
      // $FF: Couldn't be decompiled
      fi.polar.polarflow.util.k var1 = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
      int var2 = var1.u();
      int var3 = var1.v();
      ExerciseRunningIndexResult var4 = (new ExerciseRunningIndexCalculatorAndroidImpl(var2, var3)).calculateRunningIndex(
              1, var2, var3, var0.cloneHeartRateList(), var0.cloneSpeedList(), Collections.nCopies(var0.getAltitudeSamplesCount(), 0.0F));
      if (var4 != null) {
         if (var4.getRunningIndex() > 0) {
            return var4;
         }

         fi.polar.polarflow.util.d.b("ExerciseRunningIndexCalc", "calculateRunningIndex() returned " + var4.getRunningIndex());
      } else {
         fi.polar.polarflow.util.d.b("ExerciseRunningIndexCalc", "calculateRunningIndex() returned null (inconsistent sample count?)");
      }

      // catch var4 = null;
      return var4;
   }

   public void d_closeUntrustedRange() {
      if (a_enoughDataToCalculate(this.a_training.getSamples())) {
         ExerciseRunningIndexResult var1 = b_calculateRunningIndex(this.a_training.getSamples());
         if (var1 != null) {
            fi.polar.polarflow.util.d.c("ExerciseRunningIndexCalc", "runningIndex=" + var1.getRunningIndex() + ", calculationTime=" + var1.getCalculationEndTime());
            this.a_training.setRunningIndex(var1.getRunningIndex(), TimeUnit.MINUTES.toMillis((long)var1.getCalculationEndTime()));
         }
      } else {
         fi.polar.polarflow.util.d.c("ExerciseRunningIndexCalc", "not calculating running index (too short training)");
      }

   }
}
