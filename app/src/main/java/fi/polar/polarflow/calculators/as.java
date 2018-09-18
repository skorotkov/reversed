package fi.polar.polarflow.calculators;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarmathsmart.speed.AverageSpeedCalculator;
import fi.polar.polarmathsmart.speed.AverageSpeedCalculatorAndroidImpl;

public class as extends at_RangeStatistics {
   private final AverageSpeedCalculator e = new AverageSpeedCalculatorAndroidImpl();

   public as() {
      super(0.0F, 399.0F);
   }

   public float a(long var1, double var3) {
      float var5 = Math.max(0.0F, this.i_getMostResentSample());
      return a_DataTypes.a_adjust(2, this.e.calculateAverageSpeed((double)var5, var1, Math.max(0.0D, var3), this.h_getSumOfSamples() - (double)var5, Math.max(0, this.f_getNumOfSamples() - 1)).getSpeedAverage().floatValue());
   }

   public float b(long var1, double var3) {
      return a_DataTypes.a_adjust(2, (float)this.e.calculateFinalAverageSpeed(var1, Math.max(0.0D, var3)));
   }

   public float c(long var1, double var3) {
      return a_DataTypes.a_adjust(2, Math.max(this.e_getMax(), this.b(var1, var3)));
   }
}
