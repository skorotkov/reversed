package fi.polar.polarflow.calculators;

import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.TrainingSamples;
import fi.polar.polarmathsmart.runningindex.ExerciseRunningIndexResult;
import java.util.concurrent.TimeUnit;

public class p implements al, y {
   private static final int b;
   private final Training a;

   static {
      b = (int)(TimeUnit.MINUTES.toMillis(12L) / 1000L);
   }

   public p() {
      this((Training)null);
   }

   p(Training var1) {
      if (var1 == null) {
         var1 = Training.getInstance();
      }

      this.a = var1;
   }

   private static boolean a(TrainingSamples var0) {
      boolean var1;
      if (var0.getHeartRateSamplesCount() >= b && var0.getSpeedSamplesCount() >= b && var0.getAltitudeSamplesCount() >= b) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private static ExerciseRunningIndexResult b(TrainingSamples param0) {
      // $FF: Couldn't be decompiled
      return null;
   }

   public void d() {
      if (a(this.a.getSamples())) {
         ExerciseRunningIndexResult var1 = b(this.a.getSamples());
         if (var1 != null) {
            fi.polar.polarflow.util.d.c("ExerciseRunningIndexCalc", "runningIndex=" + var1.getRunningIndex() + ", calculationTime=" + var1.getCalculationEndTime());
            this.a.setRunningIndex(var1.getRunningIndex(), TimeUnit.MINUTES.toMillis((long)var1.getCalculationEndTime()));
         }
      } else {
         fi.polar.polarflow.util.d.c("ExerciseRunningIndexCalc", "not calculating running index (too short training)");
      }

   }
}
