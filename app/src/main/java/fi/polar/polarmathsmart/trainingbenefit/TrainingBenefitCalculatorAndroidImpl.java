package fi.polar.polarmathsmart.trainingbenefit;

import fi.polar.polarmathsmart.types.Gender;
import fi.polar.polarmathsmart.types.zones.HeartRateZoneLimits;
import java.util.List;

public class TrainingBenefitCalculatorAndroidImpl implements TrainingBenefitCalculator {
   private short[] heartRateZoneLimitsToArray(HeartRateZoneLimits var1) {
      int var2 = var1.getAmountOfZones();
      short[] var3 = new short[var2 + 1];

      for(int var4 = 0; var4 < var2; ++var4) {
         var3[var4] = (Short)var1.getValue(var4);
      }

      var3[var2] = (Short)var1.getUpperLimitForLastZone();
      return var3;
   }

   private native int native_calculateTrainingBenefit(List var1, int var2, int var3, int var4, double var5, double var7, int var9, int var10, int var11, short[] var12);

   public TrainingFeedback calculateTrainingBenefit(List var1, int var2, Gender var3, int var4, double var5, double var7, int var9, int var10, int var11, HeartRateZoneLimits var12) {
      if (var1 != null && !var1.isEmpty()) {
         if (var2 != 1) {
            throw new IllegalArgumentException("Only 1s sampling interval supported");
         } else {
            short[] var14 = this.heartRateZoneLimitsToArray(var12);
            byte var13;
            if (var3 == Gender.MALE) {
               var13 = 0;
            } else {
               var13 = 1;
            }

            var2 = this.native_calculateTrainingBenefit(var1, var2, var13, var4, var5, var7, var9, var10, var11, var14);
            if (var2 < 0) {
               throw new IllegalArgumentException("Error: " + var2);
            } else {
               return TrainingFeedback.values()[var2];
            }
         }
      } else {
         throw new IllegalArgumentException("Heart rate samples cannot be null or zero-length");
      }
   }
}
