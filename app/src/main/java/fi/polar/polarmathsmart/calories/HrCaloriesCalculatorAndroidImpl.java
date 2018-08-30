package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.types.PmsSportId;

public class HrCaloriesCalculatorAndroidImpl implements HrCaloriesCalculator {
   byte[] algorithm = new byte[this.native_hrCaloriesGetSize()];

   public HrCaloriesCalculatorAndroidImpl(short var1, float var2, float var3, float var4, float var5) {
      this.native_hrCaloriesCtor(this.algorithm, var1, var2, var3, var4, var5);
   }

   private native float native_hrCaloriesCalculate(byte[] var1, short var2);

   private native int native_hrCaloriesCtor(byte[] var1, short var2, float var3, float var4, float var5, float var6);

   private native float native_hrCaloriesGetEeChangePoint(byte[] var1, boolean var2, int var3);

   private native float native_hrCaloriesGetHrChangePoint(byte[] var1, boolean var2, int var3);

   private native int native_hrCaloriesGetSize();

   public float calculateHrCalories(short var1) {
      return this.native_hrCaloriesCalculate(this.algorithm, var1);
   }

   public float getEeChangePoint(boolean var1, PmsSportId var2) {
      return this.native_hrCaloriesGetEeChangePoint(this.algorithm, var1, var2.getValue());
   }

   public float getHrChangePoint(boolean var1, PmsSportId var2) {
      return this.native_hrCaloriesGetHrChangePoint(this.algorithm, var1, var2.getValue());
   }
}
