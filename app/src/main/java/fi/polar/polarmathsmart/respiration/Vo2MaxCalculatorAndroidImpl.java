package fi.polar.polarmathsmart.respiration;

import fi.polar.polarmathsmart.types.Gender;

public class Vo2MaxCalculatorAndroidImpl implements Vo2MaxCalculator {
   private native int native_getDefaultVo2Max(int var1, int var2, double var3, double var5);

   public int getDefaultVo2Max(int var1, Gender var2, double var3, double var5) {
      return this.native_getDefaultVo2Max(var1, var2.ordinal(), var3, var5);
   }
}
