package fi.polar.polarmathsmart.calories;

public class HrCaloriesModelParametersCalculatorAndroidImpl implements HrCaloriesModelParametersCalculator {
   private native HrCaloriesModelParameters native_calculateHrCaloriesModelParameters(float var1, float var2, float var3, float var4);

   public HrCaloriesModelParameters calculateHrCaloriesModelParameters(float var1, float var2, float var3, float var4) {
      return this.native_calculateHrCaloriesModelParameters(var1, var2, var3, var4);
   }
}
