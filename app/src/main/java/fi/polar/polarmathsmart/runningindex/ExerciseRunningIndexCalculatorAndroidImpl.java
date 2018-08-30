package fi.polar.polarmathsmart.runningindex;

import fi.polar.polarmathsmart.types.Gender;
import fi.polar.polarmathsmart.types.RunningPerformanceLevel;
import java.util.List;

public class ExerciseRunningIndexCalculatorAndroidImpl implements ExerciseRunningIndexCalculator {
   byte[] algorithm;
   byte mExerciseSeconds;

   public ExerciseRunningIndexCalculatorAndroidImpl() {
   }

   public ExerciseRunningIndexCalculatorAndroidImpl(int var1, int var2) {
      this.algorithm = new byte[this.native_GetRunningIndexAlgorithmSize()];
      this.native_RunningIndexAlgorithmCtor(this.algorithm, var1, var2);
      this.native_RunningIndex_init(this.algorithm);
      this.mExerciseSeconds = (byte)0;
   }

   private native ExerciseRunningIndexResult native_GetFinalRunningIndexResult(byte[] var1);

   private native int native_GetRunningIndexAlgorithmSize();

   private native void native_RunningIndexAlgorithmCtor(byte[] var1, int var2, int var3);

   private native void native_RunningIndex_init(byte[] var1);

   private native void native_UpdateRunningIndex(byte[] var1, byte var2, int var3, float var4, float var5, int var6);

   private native ExerciseRunningIndexResult native_calculateRunningIndex(int var1, int var2, int[] var3, float[] var4, float[] var5, int var6, int var7);

   private native int native_getPerformanceLevel(int var1, int var2, int var3);

   public ExerciseRunningIndexResult calculateRunningIndex(int var1, int var2, int var3, List var4, List var5, List var6) {
      ExerciseRunningIndexResult var11;
      if (var4.size() == var5.size() && var4.size() == var6.size()) {
         int[] var7 = new int[var4.size()];
         float[] var8 = new float[var5.size()];
         float[] var9 = new float[var6.size()];

         for(int var10 = 0; var10 < var4.size(); ++var10) {
            var7[var10] = (Integer)var4.get(var10);
            var8[var10] = (Float)var5.get(var10);
            var9[var10] = (Float)var6.get(var10);
         }

         var11 = this.native_calculateRunningIndex(var2, var3, var7, var8, var9, var4.size(), var1);
      } else {
         var11 = null;
      }

      return var11;
   }

   public ExerciseRunningIndexResult finalizeRunningIndexCalculation() {
      return this.native_GetFinalRunningIndexResult(this.algorithm);
   }

   public RunningPerformanceLevel getPerformanceLevel(int var1, int var2, Gender var3) {
      var1 = this.native_getPerformanceLevel(var1, var3.ordinal(), var2);
      return RunningPerformanceLevel.values()[var1];
   }

   public void updateRunningIndex(int var1, float var2, float var3, int var4) {
      this.native_UpdateRunningIndex(this.algorithm, this.mExerciseSeconds, var1, var2, var3, var4);
      this.mExerciseSeconds = (byte)((byte)(this.mExerciseSeconds + var4));
      if (this.mExerciseSeconds == 60) {
         this.mExerciseSeconds = (byte)0;
      }

   }
}
