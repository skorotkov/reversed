package fi.polar.polarmathsmart.heartrate;

import fi.polar.polarmathsmart.types.Gender;

public class ConvertHeartRateOrMetAndroidImpl implements ConvertHeartRateOrMet {
   byte[] algorithm = new byte[this.native_GetConvertAlgorithmSize()];

   public ConvertHeartRateOrMetAndroidImpl(int var1, double var2, double var4, Gender var6, int var7, char var8, char var9) {
      int var10 = var6.ordinal();
      this.native_ConvertAlgorithmCtor(this.algorithm, var1, var2, var4, var10, var7, (byte)var8, (byte)var9);
   }

   public ConvertHeartRateOrMetAndroidImpl(Gender var1, int var2, double var3, double var5, int var7, int var8, int var9) {
      int var10 = var1.ordinal();
      this.native_ConvertAlgorithmCtor(this.algorithm, var2, var5, var3, var10, var9, (byte)var8, (byte)var7);
   }

   private native int native_ConvertAlgorithmCtor(byte[] var1, int var2, double var3, double var5, int var7, int var8, byte var9, byte var10);

   private native float native_ConvertHeartRateToMet(byte[] var1, float var2);

   private native float native_ConvertMetToHeartRate(byte[] var1, float var2);

   private native int native_GetConvertAlgorithmSize();

   public float convertHeartRateToMet(float var1) {
      return this.native_ConvertHeartRateToMet(this.algorithm, var1);
   }

   public float convertMetToHeartRate(float var1) {
      return this.native_ConvertMetToHeartRate(this.algorithm, var1);
   }
}
