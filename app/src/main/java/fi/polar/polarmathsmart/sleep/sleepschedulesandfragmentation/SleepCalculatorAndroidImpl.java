package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

public class SleepCalculatorAndroidImpl {
   byte[] algorithm = new byte[this.native_GetSleepCalculatorSize()];

   public SleepCalculatorAndroidImpl() {
      this.native_SleepCalculatorCtor(this.algorithm);
   }

   private native boolean native_CheckWakeAfterAlarm(byte[] var1, int var2);

   private native SleepCalculatorResult native_ForceEnd(byte[] var1);

   private native SleepCalculatorResult native_GetResult(byte[] var1);

   private native int native_GetSleepCalculatorSize();

   private native int native_GetSleepStartTimeSeconds(byte[] var1);

   private native void native_SetButtonAction(byte[] var1, boolean var2);

   private native void native_SleepCalculatorCtor(byte[] var1);

   private native void native_StartNonWear(byte[] var1);

   private native void native_StopNonWear(byte[] var1);

   private native void native_StoreNonWearInfo(byte[] var1, int var2, int var3);

   private native int native_TimeIncrement1s(byte[] var1, int var2, int var3, int var4);

   public boolean checkWakeAfterAlarm(int var1) {
      return this.native_CheckWakeAfterAlarm(this.algorithm, var1);
   }

   public SleepCalculatorResult forceEnd() {
      return this.native_ForceEnd(this.algorithm);
   }

   public SleepCalculatorResult getResult() {
      return this.native_GetResult(this.algorithm);
   }

   public int getSleepStartTimeSeconds() {
      return this.native_GetSleepStartTimeSeconds(this.algorithm);
   }

   public void setButtonAction(boolean var1) {
      this.native_SetButtonAction(this.algorithm, var1);
   }

   public void startNonWear() {
      this.native_StartNonWear(this.algorithm);
   }

   public void stopNonWear() {
      this.native_StopNonWear(this.algorithm);
   }

   public void storeNonWearInfo(int var1, int var2) {
      this.native_StoreNonWearInfo(this.algorithm, var1, var2);
   }

   public int timeIncrement1s(int var1, int var2, int var3) {
      return this.native_TimeIncrement1s(this.algorithm, var1, var2, var3);
   }
}
