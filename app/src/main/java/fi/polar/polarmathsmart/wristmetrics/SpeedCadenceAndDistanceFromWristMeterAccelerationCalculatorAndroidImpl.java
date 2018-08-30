package fi.polar.polarmathsmart.wristmetrics;

import fi.polar.polarmathsmart.types.MovingType;

public class SpeedCadenceAndDistanceFromWristMeterAccelerationCalculatorAndroidImpl implements SpeedCadenceAndDistanceFromWristMeterAccelerationCalculator {
   private byte[] algData = new byte[this.native_wristMetricsAlgSize()];

   public SpeedCadenceAndDistanceFromWristMeterAccelerationCalculatorAndroidImpl(float var1, double var2, float var4) {
      this.native_wristMetricsInit(this.algData, var2, var1, var4);
   }

   private native int native_wristMetricsAlgSize();

   private native short native_wristMetricsFilterCadence(byte[] var1, short var2);

   private native short native_wristMetricsGetCadence(byte[] var1, boolean var2);

   private native float native_wristMetricsGetDistance(byte[] var1);

   private native float native_wristMetricsGetSpeed(byte[] var1, boolean var2);

   private native int native_wristMetricsGetSwrState(byte[] var1);

   private native void native_wristMetricsInit(byte[] var1, double var2, float var4, float var5);

   private native void native_wristMetricsUpdate(byte[] var1, short[] var2, short[] var3, short[] var4);

   private native void native_wristMetricsUpdateSettings(byte[] var1, double var2, float var4, float var5);

   public short filterCadence(short var1) {
      return this.native_wristMetricsFilterCadence(this.algData, var1);
   }

   public short getCadence(boolean var1) {
      return this.native_wristMetricsGetCadence(this.algData, var1);
   }

   public float getDistance() {
      return this.native_wristMetricsGetDistance(this.algData);
   }

   public MovingType getMovingType() {
      return MovingType.convertFromInt(this.native_wristMetricsGetSwrState(this.algData));
   }

   public float getSpeed(boolean var1) {
      return this.native_wristMetricsGetSpeed(this.algData, var1);
   }

   public void update(short[] var1, short[] var2, short[] var3) {
      this.native_wristMetricsUpdate(this.algData, var1, var2, var3);
   }

   public void updateSettings(double var1, float var3, float var4) {
      this.native_wristMetricsUpdateSettings(this.algData, var1, var3, var4);
   }
}
