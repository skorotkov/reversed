package fi.polar.polarmathsmart.activity;

import java.util.List;

public class ActivityDistanceCalculatorAndroidImpl implements ActivityDistanceCalculator {
   byte[] algorithm = new byte[this.native_getActivityDistanceAlgorithmSize()];
   float mCurrentDistance;

   public ActivityDistanceCalculatorAndroidImpl(double var1) {
      this.native_ActivityDistanceAlgorithmCtor(this.algorithm, var1);
      this.mCurrentDistance = 0.0F;
   }

   public ActivityDistanceCalculatorAndroidImpl(double var1, float var3) {
      this.native_ActivityDistanceAlgorithmCtor(this.algorithm, var1);
      this.mCurrentDistance = var3;
   }

   private native void native_ActivityDistanceAlgorithmCtor(byte[] var1, double var2);

   private native float native_calculateActivityDistance(byte[] var1, byte[] var2);

   private native int native_getActivityDistanceAlgorithmSize();

   public float calculateActivityDistance(List var1) {
      float var2 = 0.0F;
      if (var1.size() > 0) {
         byte[] var3 = new byte[var1.size()];

         for(int var4 = 0; var4 < var1.size(); ++var4) {
            var3[var4] = ((Integer)var1.get(var4)).byteValue();
         }

         var2 = this.native_calculateActivityDistance(this.algorithm, var3);
      }

      return var2 + this.mCurrentDistance;
   }
}
