package fi.polar.polarmathsmart.weightmanagement;

public class MinimumWeightTargetCalculatorAndroidImpl implements MinimumWeightTargetCalculator {
   private native double native_calculateMinimumWeightTarget(double var1, double var3);

   public double calculateMinimumWeightTarget(double var1, double var3) {
      return this.native_calculateMinimumWeightTarget(var1, var3);
   }
}
