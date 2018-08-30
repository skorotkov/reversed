package fi.polar.polarmathsmart.trainingload;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;
import fi.polar.polarmathsmart.common.AlgorithmConstants$AcceptableDeltas;
import java.math.BigDecimal;

public class ExerciseTrainingLoadResults {
   private double fatPercent;
   private double trainingLoad;
   private double unscaledRecoveryTime;

   public ExerciseTrainingLoadResults(double var1, double var3, double var5) {
      this.unscaledRecoveryTime = var1;
      this.fatPercent = var3;
      this.trainingLoad = var5;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            ExerciseTrainingLoadResults var3 = (ExerciseTrainingLoadResults)var1;
            if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(this.getUnscaledRecoveryTime(), var3.getUnscaledRecoveryTime(), 0.1D) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(this.getFatPercent(), var3.getFatPercent(), AlgorithmConstants$AcceptableDeltas.TRAININGLOAD) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(this.getTrainingLoad(), var3.getTrainingLoad(), AlgorithmConstants$AcceptableDeltas.TRAININGLOAD) != 0) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public double getFatPercent() {
      return this.fatPercent;
   }

   public double getTrainingLoad() {
      return this.trainingLoad;
   }

   public double getUnscaledRecoveryTime() {
      return this.unscaledRecoveryTime;
   }

   public int hashCode() {
      BigDecimal var1 = new BigDecimal(this.getUnscaledRecoveryTime());
      double var2 = Double.valueOf(0.0D);
      double var4 = var1.setScale(2, 4).doubleValue();
      var1 = new BigDecimal(this.getFatPercent());
      var4 = Double.valueOf(var4 + var2);
      var2 = var1.setScale(2, 4).doubleValue();
      var1 = new BigDecimal(this.getTrainingLoad());
      var4 = Double.valueOf(var2 + var4);
      return Double.valueOf(var1.setScale(2, 4).doubleValue() + var4).hashCode();
   }
}
