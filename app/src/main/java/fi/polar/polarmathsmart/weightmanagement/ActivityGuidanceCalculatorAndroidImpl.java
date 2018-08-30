package fi.polar.polarmathsmart.weightmanagement;

import fi.polar.polarmathsmart.types.Gender;

public class ActivityGuidanceCalculatorAndroidImpl implements ActivityGuidanceCalculator {
   private native ActivityGuidance native_calculateActivityGuidance(int var1, int var2, int var3, double var4, double var6, int var8, double var9, double var11, int var13);

   private native ActivityGuidance native_calculateAdditionalActivityGuidance(int var1, double var2, int var4, double var5, double var7, int var9);

   public ActivityGuidance calculateActivityGuidance(int var1, int var2, int var3, double var4, double var6, int var8, double var9, double var11, Gender var13) {
      return this.native_calculateActivityGuidance(var1, var2, var3, var4, var6, var8, var9, var11, var13.ordinal());
   }

   public ActivityGuidance calculateAdditionalActivityGuidance(int var1, double var2, int var4, double var5, double var7, Gender var9) {
      return this.native_calculateAdditionalActivityGuidance(var1, var2, var4, var5, var7, var9.ordinal());
   }
}
