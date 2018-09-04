package fi.polar.polarmathsmart.trainingload;

import fi.polar.polarmathsmart.types.Gender;
import java.util.List;

public class ExerciseTrainingLoadCalculatorAndroidImpl implements ExerciseTrainingLoadCalculator {
   byte[] algorithm;

   public ExerciseTrainingLoadCalculatorAndroidImpl() {
   }

   public ExerciseTrainingLoadCalculatorAndroidImpl(double var1, double var3, int var5, Gender var6, int var7, int var8, int var9, int var10, int var11, double var12) {
      this.algorithm = new byte[this.native_GetExerciseTrainingLoadAlgorithmSize()];
      this.native_ExerciseTrainingLoadAlgorithmCtor(this.algorithm, var1, var3, var5, var6.ordinal(), var7, var8, var9, var10, var11, var12);
   }

   private native void native_ExerciseTrainingLoadAlgorithmCtor(byte[] var1, double var2, double var4, int var6, int var7, int var8, int var9, int var10, int var11, int var12, double var13);

   private native void native_ExerciseTrainingLoadUpdate(byte[] var1, float var2, float var3);

   private native int native_GetExerciseTrainingLoadAlgorithmSize();

   private native float native_GetExerciseTrainingLoadFatPercent(byte[] var1);

   private native float native_GetExerciseTrainingLoadRecoveryTime(byte[] var1);

   private native float native_GetExerciseTrainingLoadTrainingLoad(byte[] var1);

   public ExerciseTrainingLoadResults calculateExerciseTrainingLoad(List var1, double var2, double var4, int var6, Gender var7, int var8, int var9, int var10, int var11, int var12, double var13) {
      byte[] var15 = new byte[this.native_GetExerciseTrainingLoadAlgorithmSize()];
      this.native_ExerciseTrainingLoadAlgorithmCtor(var15, var2, var4, var6, var7.ordinal(), var8, var9, var10, var11, var12, var13);

      for(var6 = 0; var6 < var1.size(); ++var6) {
         this.native_ExerciseTrainingLoadUpdate(var15, (float)var1.get(var6), 0.0F);
      }

      return new ExerciseTrainingLoadResults((double)this.native_GetExerciseTrainingLoadRecoveryTime(var15), (double)this.native_GetExerciseTrainingLoadFatPercent(var15), (double)this.native_GetExerciseTrainingLoadTrainingLoad(var15));
   }

   public float exerciseTrainingLoadGetFatPercent() {
      return this.native_GetExerciseTrainingLoadFatPercent(this.algorithm);
   }

   public float exerciseTrainingLoadGetTrainingLoad() {
      return this.native_GetExerciseTrainingLoadTrainingLoad(this.algorithm);
   }

   public float exerciseTrainingLoadGetUnscaledRecoveryTime() {
      return this.native_GetExerciseTrainingLoadRecoveryTime(this.algorithm);
   }

   public void exerciseTrainingLoadUpdate(float var1, float var2) {
      this.native_ExerciseTrainingLoadUpdate(this.algorithm, var1, var2);
   }
}
