package fi.polar.polarmathsmart.speed;

public class AverageSpeedCalculatorAndroidImpl implements AverageSpeedCalculator {
   private native AverageSpeedData native_calculateAverageSpeed(double var1, long var3, double var5, double var7, int var9);

   private native double native_calculateFinalAverageSpeed(long var1, double var3);

   public AverageSpeedData calculateAverageSpeed(double var1, long var3, double var5, double var7, int var9) {
      AverageSpeedData var10 = this.native_calculateAverageSpeed(var1, var3, var5, var7, var9);
      if (var10.getSpeedAverage() == -1000.0D) {
         var10.setSpeedAverage(Double.NaN);
      }

      return var10;
   }

   public double calculateFinalAverageSpeed(long var1, double var3) {
      double var5 = this.native_calculateFinalAverageSpeed(var1, var3);
      var3 = var5;
      if (var5 == -1000.0D) {
         var3 = Double.NaN;
      }

      return var3;
   }
}
