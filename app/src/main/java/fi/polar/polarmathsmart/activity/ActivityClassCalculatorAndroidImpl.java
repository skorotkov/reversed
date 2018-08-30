package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.types.ActivityClass;
import fi.polar.polarmathsmart.types.Gender;
import fi.polar.polarmathsmart.types.InActivityAlertType;

public class ActivityClassCalculatorAndroidImpl implements ActivityClassCalculator {
   byte[] algorithm;
   byte[] inActivityAlgorithm;
   InActivityAlertType latestAlert;

   public ActivityClassCalculatorAndroidImpl(int var1, Gender var2) {
      int var3 = var2.ordinal();
      this.algorithm = new byte[this.native_GetClassAlgorithmSize()];
      this.inActivityAlgorithm = new byte[this.native_GetInactivityAlgorithmSize()];
      this.latestAlert = InActivityAlertType.NO_CHANGE;
      this.native_ClassAlgorithmCtor(this.algorithm, var1, var3);
      this.native_InactivityAlgorithmCtor(this.inActivityAlgorithm);
   }

   private native int native_ClassAlgorithmCtor(byte[] var1, int var2, int var3);

   private native int native_GetClassAlgorithmSize();

   private native byte native_GetCurrentActivityClass(byte[] var1);

   private native float native_GetFinalMETValue(byte[] var1);

   private native int native_GetInactivityAlgorithmSize();

   private native byte native_GetStabileActivityClass(byte[] var1);

   private native int native_InactivityAlgorithmCtor(byte[] var1);

   private native int native_UpdateActivityClass(byte[] var1, float var2, boolean var3, boolean var4);

   private native int native_checkInActivityAlert(byte[] var1, byte[] var2);

   public InActivityAlertType getAlert() {
      return this.latestAlert;
   }

   public ActivityClass getCurrentActivityClass() {
      return ActivityClass.convertFromByte(this.native_GetCurrentActivityClass(this.algorithm));
   }

   public float getFinalMETValue() {
      return this.native_GetFinalMETValue(this.algorithm);
   }

   public ActivityClass getStabileActivityClass() {
      return ActivityClass.convertFromByte(this.native_GetStabileActivityClass(this.algorithm));
   }

   public ActivityClass update(float var1, boolean var2, boolean var3) {
      this.native_UpdateActivityClass(this.algorithm, var1, var2, var3);
      this.latestAlert = InActivityAlertType.convertFromInt(this.native_checkInActivityAlert(this.algorithm, this.inActivityAlgorithm));
      return ActivityClass.convertFromByte(this.native_GetStabileActivityClass(this.algorithm));
   }
}
