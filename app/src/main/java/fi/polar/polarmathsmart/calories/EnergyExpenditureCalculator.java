package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.types.ActivityLevel;
import fi.polar.polarmathsmart.types.Gender;

public interface EnergyExpenditureCalculator {
   int calculateDailyEnergyExpenditureTarget(int var1, double var2, double var4, double var6, int var8);

   int estimateDailyEnergyExpenditure(int var1, double var2, double var4, Gender var6, ActivityLevel var7);
}
