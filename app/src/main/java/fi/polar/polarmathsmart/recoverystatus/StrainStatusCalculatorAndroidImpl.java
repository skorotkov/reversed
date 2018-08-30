package fi.polar.polarmathsmart.recoverystatus;

import java.util.List;

public class StrainStatusCalculatorAndroidImpl implements StrainStatusCalculator {
   private native List native_calculateStrainStatus(float[] var1);

   public List calculateStrainStatus(List var1) {
      if (var1.size() < 384) {
         throw new InvalidNumberOfDataPointsException("Scaled recovery times -list needs to have 384 or more items!");
      } else {
         float[] var2 = new float[var1.size()];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = ((Double)var1.get(var3)).floatValue();
         }

         return this.native_calculateStrainStatus(var2);
      }
   }
}
