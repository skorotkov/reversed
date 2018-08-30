package fi.polar.polarmathsmart.recoverystatus;

import fi.polar.polarmathsmart.common.DoubleSportFactorToByte;
import java.util.List;

public class HalfHourCaloriesCalculatorAndroidImpl implements HalfHourCaloriesCalculator {
   private native HalfHourCaloriesResults native_calculateHalfHourCalories(double[] var1, byte[] var2, byte[] var3, double var4, int var6);

   public HalfHourCaloriesResults calculateHalfHourCalories(List var1, List var2, List var3, Double var4) {
      if (var1.size() != 60) {
         throw new InvalidNumberOfDataPointsException("mets-list needs to have exactly 60 samples! (30min)");
      } else if (var2.size() != 60) {
         throw new InvalidNumberOfDataPointsException("impactness-list needs to have exactly 60 items! (30mins)");
      } else if (var3.size() != 60) {
         throw new InvalidNumberOfDataPointsException("activityStates-list needs to have exactly 60 items! (30mins)");
      } else {
         double[] var5 = new double[var1.size()];
         byte[] var6 = new byte[var2.size()];
         byte[] var7 = new byte[var3.size()];
         DoubleSportFactorToByte var8 = new DoubleSportFactorToByte();

         for(int var9 = 0; var9 < var1.size(); ++var9) {
            var5[var9] = (Double)var1.get(var9);
            var6[var9] = var8.DoubleSportFactorToByte((Double)var2.get(var9));
            var7[var9] = ((Integer)var3.get(var9)).byteValue();
         }

         return this.native_calculateHalfHourCalories(var5, var6, var7, var4, var1.size());
      }
   }
}
