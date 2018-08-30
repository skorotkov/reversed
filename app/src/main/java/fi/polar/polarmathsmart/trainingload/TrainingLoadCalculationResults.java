package fi.polar.polarmathsmart.trainingload;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;
import fi.polar.polarmathsmart.common.AlgorithmConstants$AcceptableDeltas;

public class TrainingLoadCalculationResults {
   private double carbohydrateConsumption;
   private double cumulativeMechanicalStimulus;
   private double glycogenLeftPercent;
   private double proteinConsumption;
   private double recoveryTime;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            TrainingLoadCalculationResults var3 = (TrainingLoadCalculationResults)var1;
            if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.recoveryTime, this.recoveryTime, AlgorithmConstants$AcceptableDeltas.TRAININGLOAD) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.cumulativeMechanicalStimulus, this.cumulativeMechanicalStimulus, AlgorithmConstants$AcceptableDeltas.TRAININGLOAD) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.carbohydrateConsumption, this.carbohydrateConsumption, AlgorithmConstants$AcceptableDeltas.TRAININGLOAD) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.proteinConsumption, this.proteinConsumption, AlgorithmConstants$AcceptableDeltas.TRAININGLOAD) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.glycogenLeftPercent, this.glycogenLeftPercent, AlgorithmConstants$AcceptableDeltas.TRAININGLOAD) != 0) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public double getCarbohydrateConsumption() {
      return this.carbohydrateConsumption;
   }

   public double getCumulativeMechanicalStimulus() {
      return this.cumulativeMechanicalStimulus;
   }

   public double getGlycogenLeftPercent() {
      return this.glycogenLeftPercent;
   }

   public double getProteinConsumption() {
      return this.proteinConsumption;
   }

   public double getRecoveryTime() {
      return this.recoveryTime;
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.recoveryTime);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.cumulativeMechanicalStimulus);
      int var4 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.carbohydrateConsumption);
      int var5 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.proteinConsumption);
      int var6 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.glycogenLeftPercent);
      return (((var3 * 31 + var4) * 31 + var5) * 31 + var6) * 31 + (int)(var1 ^ var1 >>> 32);
   }

   public void setCarbohydrateConsumption(double var1) {
      this.carbohydrateConsumption = var1;
   }

   public void setCumulativeMechanicalStimulus(double var1) {
      this.cumulativeMechanicalStimulus = var1;
   }

   public void setGlycogenLeftPercent(double var1) {
      this.glycogenLeftPercent = var1;
   }

   public void setProteinConsumption(double var1) {
      this.proteinConsumption = var1;
   }

   public void setRecoveryTime(double var1) {
      this.recoveryTime = var1;
   }

   public String toString() {
      return "TrainingLoadResults{recoveryTime=" + this.recoveryTime + ", cumulativeMechanicalStimulus=" + this.cumulativeMechanicalStimulus + ", carbohydrateConsumption=" + this.carbohydrateConsumption + ", proteinConsumption=" + this.proteinConsumption + ", glycogenLeftPercent=" + this.glycogenLeftPercent + '}';
   }
}
