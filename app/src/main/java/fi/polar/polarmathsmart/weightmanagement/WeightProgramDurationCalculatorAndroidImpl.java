package fi.polar.polarmathsmart.weightmanagement;

import android.util.Log;

public class WeightProgramDurationCalculatorAndroidImpl implements WeightProgramDurationCalculator {
   private native short native_calculateMinimumProgramDurationAfterTwoWeeks(int var1, int var2);

   private native WeightProgramDurationMinMax native_calculateProgramDurationMinMax(int var1, int var2);

   public short calculateMinimumProgramDurationAfterTwoWeeks(int var1, int var2) {
      return this.native_calculateMinimumProgramDurationAfterTwoWeeks(var1, var2);
   }

   public WeightProgramDurationMinMax calculateProgramDurationMinMax(int var1, int var2) {
      try {
         WeightProgramDurationMinMax var3 = this.native_calculateProgramDurationMinMax(var1, var2);
         return var3;
      } catch (Exception var4) {
         Log.d("TEST", "Exception " + var4.toString());
         throw var4;
      }
   }
}
