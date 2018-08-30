package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.types.Gender;

public class BasalMetabolicRateCalculatorAndroidImpl implements BasalMetabolicRateCalculator {
   private native double native_calculateBasalMetabolicRateInKcalPerMinute(int var1, double var2, double var4, int var6);

   public double calculateBasalMetabolicRateInKcalPerMinute(int var1, double var2, double var4, Gender var6) {
      return this.native_calculateBasalMetabolicRateInKcalPerMinute(var1, var2, var4, var6.ordinal());
   }
}
