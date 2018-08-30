package fi.polar.polarmathsmart.recoverystatus;

import fi.polar.polarmathsmart.types.Gender;

public class PALCritCalculatorAndroidImpl implements PALCritCalculator {
   private native double native_calculatePALCrit(int var1, int var2, double var3, double var5, int var7, int var8, int var9);

   public double calculatePALCrit(Gender var1, int var2, double var3, double var5, int var7, int var8, int var9) {
      return this.native_calculatePALCrit(var1.ordinal(), var2, var3, var5, var7, var8, var9);
   }
}
