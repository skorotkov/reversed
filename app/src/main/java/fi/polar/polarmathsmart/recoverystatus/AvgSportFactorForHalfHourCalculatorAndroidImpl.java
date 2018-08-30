package fi.polar.polarmathsmart.recoverystatus;

import fi.polar.polarmathsmart.common.DoubleSportFactorToByte;
import java.util.List;

public class AvgSportFactorForHalfHourCalculatorAndroidImpl implements AvgSportFactorForHalfHourCalculator {
   private native double native_calculateAvgSportFactorForHalfHour(byte[] var1, byte[] var2, int var3);

   public double calculateAvgSportFactorForHalfHour(List var1, List var2) {
      if (var1.size() != 60) {
         throw new InvalidNumberOfDataPointsException("sportFactors-list needs to have exactly 60 items! (30mins)");
      } else if (var2.size() != 60) {
         throw new InvalidNumberOfDataPointsException("activityClasses-list needs to have exactly 60 items! (30mins)");
      } else {
         DoubleSportFactorToByte var3 = new DoubleSportFactorToByte();
         byte[] var4 = new byte[var1.size()];
         byte[] var5 = new byte[var2.size()];

         for(int var6 = 0; var6 < var1.size(); ++var6) {
            var4[var6] = var3.DoubleSportFactorToByte((Double)var1.get(var6));
            var5[var6] = ((Integer)var2.get(var6)).byteValue();
         }

         return this.native_calculateAvgSportFactorForHalfHour(var4, var5, var1.size());
      }
   }
}
