package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.heartrate.HeartRateSitCalculatorAndroidImpl;
import fi.polar.polarmathsmart.types.Gender;
import fi.polar.polarmathsmart.types.UserData;

public class ExerciseCaloriesCalculatorAndroidImpl implements ExerciseCaloriesCalculator {
   byte[] algorithm;

   public ExerciseCaloriesCalculatorAndroidImpl(Gender var1, int var2, double var3, double var5, int var7, int var8, int var9) {
      double var10 = (new BasalMetabolicRateCalculatorAndroidImpl()).calculateBasalMetabolicRateInKcalPerMinute(var2, var5, var3, var1);
      var7 = (new HeartRateSitCalculatorAndroidImpl()).calculateSittingHeartRate(var8, var7);
      this.algorithm = new byte[this.native_GetCaloriesAlgorithmSize()];
      this.native_calculateCaloriesHRCtor(this.algorithm, var2, var5, var3, var10, var9, var8, var7);
   }

   public ExerciseCaloriesCalculatorAndroidImpl(Gender var1, int var2, double var3, double var5, int var7, int var8, int var9, int var10) {
      double var11 = (new BasalMetabolicRateCalculatorAndroidImpl()).calculateBasalMetabolicRateInKcalPerMinute(var2, var5, var3, var1);
      this.algorithm = new byte[this.native_GetCaloriesAlgorithmSize()];
      this.native_calculateCaloriesHRCtor(this.algorithm, var2, var5, var3, var11, var10, var9, var8);
   }

   public ExerciseCaloriesCalculatorAndroidImpl(UserData var1) {
      double var2 = (new BasalMetabolicRateCalculatorAndroidImpl()).calculateBasalMetabolicRateInKcalPerMinute(var1.getAge(), var1.getHeight(), var1.getWeight(), var1.getGender());
      this.algorithm = new byte[this.native_GetCaloriesAlgorithmSize()];
      this.native_calculateCaloriesHRCtor(this.algorithm, var1.getAge(), var1.getHeight(), var1.getWeight(), var2, var1.getVo2max(), var1.getHrMax(), var1.getHrSit());
   }

   private native int native_GetCaloriesAlgorithmSize();

   private native int native_calculateCaloriesHRCtor(byte[] var1, int var2, double var3, double var5, double var7, int var9, int var10, int var11);

   private native double native_calculateEnergyPerMinute(byte[] var1, float var2, boolean var3);

   private native double native_calculateEnergyPerMinuteBaro(byte[] var1, float var2, float var3);

   public double calculateEnergyPerMinute(float var1) {
      return this.native_calculateEnergyPerMinute(this.algorithm, var1, false);
   }

   public double calculateEnergyPerMinuteBaro(float var1, float var2) {
      return this.native_calculateEnergyPerMinuteBaro(this.algorithm, var1, var2);
   }

   public double calculateEnergyPerMinuteExtended(float var1) {
      return this.native_calculateEnergyPerMinute(this.algorithm, var1, true);
   }
}
