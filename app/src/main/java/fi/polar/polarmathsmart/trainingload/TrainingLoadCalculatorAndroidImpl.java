package fi.polar.polarmathsmart.trainingload;

import fi.polar.polarmathsmart.types.Gender;
import java.util.List;

public class TrainingLoadCalculatorAndroidImpl implements TrainingLoadCalculator {
   private native TrainingLoadCalculationResults native_calculateTrainingLoad(float[] var1, int var2, double var3, double var5, int var7, int var8, int var9, int var10, int var11, int var12, int var13, float var14, float var15, float var16, float var17, float var18);

   public TrainingLoadCalculationResults calculateTrainingLoad(List var1, double var2, double var4, int var6, Gender var7, int var8, int var9, int var10, int var11, int var12, double var13, double var15, double var17, double var19, double var21) {
      float[] var23 = new float[var1.size()];

      for(int var24 = 0; var24 < var1.size(); ++var24) {
         var23[var24] = ((Double)var1.get(var24)).floatValue();
      }

      return this.native_calculateTrainingLoad(var23, var1.size(), var2, var4, var6, var7.ordinal(), var8, var9, var10, var11, var12, (float)var13, (float)var15, (float)var17, (float)var19, (float)var21);
   }
}
