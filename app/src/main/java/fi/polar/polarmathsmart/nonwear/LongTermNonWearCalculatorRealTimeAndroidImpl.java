package fi.polar.polarmathsmart.nonwear;

public class LongTermNonWearCalculatorRealTimeAndroidImpl implements LongTermNonWearCalculatorRealTime {
   byte[] algorithm = new byte[this.native_GetDefineLongTermNonWearStatusAlgorithmSize()];

   public LongTermNonWearCalculatorRealTimeAndroidImpl() {
      this.native_DefineLongTermNonWearStatusCtor(this.algorithm);
   }

   public LongTermNonWearCalculatorRealTimeAndroidImpl(int[] var1) {
      this.native_DefineLongTermNonWearStatusCtor2(this.algorithm, var1);
   }

   private native LongTermNonWearOutput native_DefineLongTermNonWearStatus(byte[] var1, float var2);

   private native void native_DefineLongTermNonWearStatusCtor(byte[] var1);

   private native void native_DefineLongTermNonWearStatusCtor2(byte[] var1, int[] var2);

   private native int native_GetDefineLongTermNonWearStatusAlgorithmSize();

   public LongTermNonWearOutput defineLongTermNonWearStatus(float var1) {
      return this.native_DefineLongTermNonWearStatus(this.algorithm, var1);
   }
}
