package fi.polar.polarmathsmart.weightmanagement;

public class EnergyDeficiencyCalculatorAndroidImpl implements EnergyDeficiencyCalculator {
   private native int native_calculateEnergyDeficiencyDailyTarget(int var1, double var2, int var4);

   private native int native_calculateEnergyDeficiencyTotal(double var1, double var3);

   public int calculateEnergyDeficiencyDailyTarget(int var1, double var2, int var4) {
      return this.native_calculateEnergyDeficiencyDailyTarget(var1, var2, var4);
   }

   public int calculateEnergyDeficiencyTotal(double var1, double var3) {
      return this.native_calculateEnergyDeficiencyTotal(var1, var3);
   }
}
