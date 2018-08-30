package fi.polar.polarmathsmart.wristmetrics;

public class WristMetricsGpsInMotionCalculatorAndroidImpl implements WristMetricsGpsInMotionCalculator {
   private byte[] algData = new byte[this.native_wristMetricsGpsInMotionAlgSize()];

   public WristMetricsGpsInMotionCalculatorAndroidImpl() {
      this.native_wristMetricsGpsInMotionInit(this.algData);
   }

   private native int native_wristMetricsGpsInMotionAlgSize();

   private native boolean native_wristMetricsGpsInMotionCalc(byte[] var1, float var2, float var3, short var4, boolean var5);

   private native void native_wristMetricsGpsInMotionInit(byte[] var1);

   public boolean calculateGpsInMotion(float var1, float var2, short var3, boolean var4) {
      return this.native_wristMetricsGpsInMotionCalc(this.algData, var1, var2, var3, var4);
   }
}
