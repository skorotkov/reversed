package fi.polar.polarmathsmart.heartrate;

public class HeartRateSitCalculatorAndroidImpl implements HeartRateSitCalculator {
   private native int native_calculateSittingHeartRate(int var1, int var2);

   public int calculateSittingHeartRate(int var1, int var2) {
      return this.native_calculateSittingHeartRate(var1, var2);
   }
}
