package fi.polar.polarmathsmart.calories;

public class FusionCaloriesCalculatorAndroidImpl implements FusionCaloriesCalculator {
   byte[] algorithm = new byte[this.native_fusionCaloriesGetSize()];

   public FusionCaloriesCalculatorAndroidImpl(float var1, float var2, boolean var3) {
      this.native_fusionCaloriesCtor(this.algorithm, var1, var2, var3);
   }

   private native float native_fusionCaloriesCalculate(byte[] var1, float var2, float var3, short var4);

   private native int native_fusionCaloriesCtor(byte[] var1, float var2, float var3, boolean var4);

   private native int native_fusionCaloriesGetSize();

   private native void native_fusionCaloriesUpdateChangePoints(byte[] var1, float var2, float var3);

   public float calculateFusionCalories(float var1, float var2, short var3) {
      return this.native_fusionCaloriesCalculate(this.algorithm, var1, var2, var3);
   }

   public void updateChangePoints(float var1, float var2) {
      this.native_fusionCaloriesUpdateChangePoints(this.algorithm, var1, var2);
   }
}
