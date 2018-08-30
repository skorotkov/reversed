package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.types.ActivityLevel;
import fi.polar.polarmathsmart.types.Gender;

public class EnergyExpenditureCalculatorAndroidImpl implements EnergyExpenditureCalculator {
   private native int native_calculateDailyEnergyExpenditureTarget(int var1, double var2, double var4, double var6, int var8);

   private native int native_estimateDailyEnergyExpenditure(int var1, double var2, double var4, int var6, double var7);

   public int calculateDailyEnergyExpenditureTarget(int var1, double var2, double var4, double var6, int var8) {
      return this.native_calculateDailyEnergyExpenditureTarget(var1, var2, var4, var6, var8);
   }

   public int estimateDailyEnergyExpenditure(int var1, double var2, double var4, Gender var6, ActivityLevel var7) {
      return this.native_estimateDailyEnergyExpenditure(var1, var2, var4, var6.ordinal(), var7.getFactor());
   }
}
