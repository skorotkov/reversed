package fi.polar.polarmathsmart.heartrate;

public class DefaultHRValuesCalculatorAndroidImpl implements DefaultHRValuesCalculator {
   private native int native_getDefaultAerobicThreshold(int var1);

   private native int native_getDefaultAnaerobicThreshold(int var1);

   private native int native_getDefaultHrMax(int var1);

   private native int native_getDefaultHrRest();

   public int getDefaultAerobicThreshold(int var1) {
      return this.native_getDefaultAerobicThreshold(var1);
   }

   public int getDefaultAnaerobicThreshold(int var1) {
      return this.native_getDefaultAnaerobicThreshold(var1);
   }

   public int getDefaultHrMax(int var1) {
      return this.native_getDefaultHrMax(var1);
   }

   public int getDefaultHrRest() {
      return this.native_getDefaultHrRest();
   }
}
