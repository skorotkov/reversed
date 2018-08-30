package fi.polar.polarmathsmart.wristmetrics;

import fi.polar.polarmathsmart.types.MovingType;

public class WristMetricsGpsCalibrationOffsetCalculatorAndroidImpl implements WristMetricsGpsCalibrationOffsetCalculator {
   private byte[] algData = new byte[this.native_wristMetricsCalibOffsetAlgSize()];

   public WristMetricsGpsCalibrationOffsetCalculatorAndroidImpl() {
      this.native_wristMetricsCalibOffsetInit(this.algData);
   }

   private native int native_wristMetricsCalibOffsetAlgSize();

   private native float native_wristMetricsCalibOffsetCalc(byte[] var1, float var2, int var3, boolean var4, float var5, short var6, float var7, float var8, boolean var9);

   private native void native_wristMetricsCalibOffsetInit(byte[] var1);

   public float calculateGpsCalibrationOffsetForRunning(float var1, MovingType var2, boolean var3, float var4, short var5, float var6, float var7, boolean var8) {
      return this.native_wristMetricsCalibOffsetCalc(this.algData, var1, var2.ordinal(), var3, var4, var5, var6, var7, var8);
   }
}
