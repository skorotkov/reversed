package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.types.ActivityIntensity;
import fi.polar.polarmathsmart.types.ActivityLevel;
import fi.polar.polarmathsmart.types.Gender;

public class ActivityGoalCalculatorAndroidImpl implements ActivityGoalCalculator {
   byte[] algorithm;

   public ActivityGoalCalculatorAndroidImpl() {
   }

   public ActivityGoalCalculatorAndroidImpl(int var1, Gender var2, ActivityLevel var3) {
      int var4 = var3.ordinal();
      int var5 = var2.ordinal();
      this.algorithm = new byte[this.native_getGoalAlgorithmSize()];
      this.native_ActivityGoalCtor(this.algorithm, var1, var5, var4);
   }

   private native byte[] native_ActivityGoalCtor(byte[] var1, int var2, int var3, int var4);

   private native int native_getCurrentIntensityLevel(byte[] var1, float var2);

   private native float native_getGoal(byte[] var1);

   private native int native_getGoalAlgorithmSize();

   private native byte[] native_setGoal(byte[] var1, float var2);

   private native float native_updateMetMinutes(byte[] var1, float var2, float var3);

   public float calculateActivityGoal(ActivityLevel var1, int var2, Gender var3) {
      byte[] var4 = new byte[this.native_getGoalAlgorithmSize()];
      this.native_ActivityGoalCtor(var4, var2, var3.ordinal(), var1.ordinal());
      return this.native_getGoal(var4);
   }

   public ActivityIntensity getCurrentIntensityLevel(float var1) {
      return ActivityIntensity.convertFromInt(this.native_getCurrentIntensityLevel(this.algorithm, var1));
   }

   public float getGoal() {
      return this.native_getGoal(this.algorithm);
   }

   public void setGoal(float var1) {
      this.native_setGoal(this.algorithm, var1);
   }

   public float updateMetMinutes(float var1, float var2) {
      return this.native_updateMetMinutes(this.algorithm, var1, var2);
   }
}
