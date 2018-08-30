package fi.polar.polarmathsmart.ascentdescent;

import java.util.List;

public class AscentDescentCalculatorAndroidImpl implements AscentDescentCalculator {
   byte[] algorithm;

   public AscentDescentCalculatorAndroidImpl() {
   }

   public AscentDescentCalculatorAndroidImpl(int var1, float var2) {
      this.algorithm = new byte[this.native_GetAscentDescentAlgorithmSize()];
      this.native_AscentDescentAlgorithmCtor(this.algorithm, var1, var2);
   }

   private native void native_AscentDescentAlgorithmCtor(byte[] var1, int var2, float var3);

   private native int native_GetAscentDescentAlgorithmSize();

   private native AscentDescentOutput native_addAltitude(byte[] var1, float var2);

   private native void native_addjustLevel(byte[] var1, float var2);

   private native AscentDescentOutput native_calculateAscentDescentForList(List var1, int var2);

   public AscentDescentOutput addAltitude(float var1) {
      return this.native_addAltitude(this.algorithm, var1);
   }

   public void adjustLevel(float var1) {
      this.native_addjustLevel(this.algorithm, var1);
   }

   public AscentDescentOutput calculateAscentDescent(List var1, int var2) {
      return this.native_calculateAscentDescentForList(var1, var2);
   }
}
