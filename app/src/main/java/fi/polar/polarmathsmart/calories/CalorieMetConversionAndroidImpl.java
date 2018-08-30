package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.types.Gender;

public class CalorieMetConversionAndroidImpl implements CalorieMetConversion {
   private native float native_calculateMetsFromCalories(float var1, int var2, int var3, float var4, float var5);

   private native float native_calculateMetsFromCalories2(float var1, float var2);

   public float calculateMetsFromCalories(float var1, int var2, Gender var3, float var4, float var5) {
      byte var6;
      if (var3 == Gender.MALE) {
         var6 = 0;
      } else {
         var6 = 1;
      }

      return this.native_calculateMetsFromCalories(var1, var2, var6, var4, var5);
   }

   public float calculateMetsFromCalories2(float var1, float var2) {
      return this.native_calculateMetsFromCalories2(var1, var2);
   }
}
