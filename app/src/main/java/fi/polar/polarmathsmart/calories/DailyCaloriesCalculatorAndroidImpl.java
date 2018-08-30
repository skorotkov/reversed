package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.types.ActivityClass;
import java.util.List;

public class DailyCaloriesCalculatorAndroidImpl implements DailyCaloriesCalculator {
   private native DailyCaloriesResults native_calculateDailyCalories(float[] var1, float[] var2, byte[] var3, double var4);

   public DailyCaloriesResults calculateDailyCalories(List var1, List var2, List var3, double var4) {
      DailyCaloriesResults var10;
      if (var1.size() == var2.size() && var1.size() == var3.size()) {
         float[] var6 = new float[var1.size()];
         float[] var7 = new float[var1.size()];
         byte[] var8 = new byte[var3.size()];

         for(int var9 = 0; var9 < var1.size(); ++var9) {
            var6[var9] = (Float)var1.get(var9);
            var7[var9] = (Float)var2.get(var9);
            var8[var9] = (byte)((byte)((ActivityClass)var3.get(var9)).ordinal());
         }

         var10 = this.native_calculateDailyCalories(var6, var7, var8, var4);
      } else {
         var10 = new DailyCaloriesResults();
         var10.setBmrCalories((double)0.0F);
         var10.setActivityCalories((double)0.0F);
         var10.setExerciseCalories((double)0.0F);
      }

      return var10;
   }
}
