package fi.polar.polarmathsmart.swimming.poolswimming;

import fi.polar.polarmathsmart.resample.ReSampleOutput;
import fi.polar.polarmathsmart.types.Handedness;
import java.util.ArrayList;

public class PoolSwimmingAlgorithmAndroidImpl {
   byte[] algorithm = new byte[this.native_GetAlgorithmSize()];
   byte[] filter = new byte[this.native_GetFilterSize()];
   int mCurrentStyle;
   byte[] statistics = new byte[this.native_GetStatisticsSize()];

   public PoolSwimmingAlgorithmAndroidImpl(SwimmingPoolInformation var1, Handedness var2, float var3) {
      this.native_PoolswimmingFilterCtor(this.filter, var2.ordinal());
      this.native_PoolswimmingAlgorithmCtor(this.algorithm, this.filter, var3, var1.mPoolLength);
      this.native_PoolswimmingStatisticsCtor(this.statistics, var1.mPoolLength, var1.mSwimmingPoolType);
      this.mCurrentStyle = 0;
   }

   private native PoolSwimmingOutput native_EndSwimming(byte[] var1, byte[] var2, byte[] var3);

   private native int native_FeedAccSample(byte[] var1, float var2, float var3, float var4, long var5);

   private native void native_FeedHrSample(byte[] var1, int var2, int var3);

   private native ArrayList native_FeedMultipleAccSamples(byte[] var1, float[] var2, float[] var3, float[] var4);

   private native PoolSwimmingOutput native_FeedStyle(byte[] var1, byte[] var2, byte[] var3, int var4);

   private native int native_GetAlgorithmSize();

   private native int native_GetFilterSize();

   private native int native_GetStatisticsSize();

   private native SwimmingStatistics native_GetSwimmingStatistics(byte[] var1);

   private native void native_PoolswimmingAlgorithmCtor(byte[] var1, byte[] var2, float var3, float var4);

   private native void native_PoolswimmingFilterCtor(byte[] var1, int var2);

   private native void native_PoolswimmingStatisticsCtor(byte[] var1, float var2, int var3);

   private native SwimmingLapStatistics native_TakeAutomaticLap(byte[] var1, byte[] var2);

   private native SwimmingLapStatistics native_TakeDistanceAutomaticLap(byte[] var1, byte[] var2);

   private native SwimmingLapStatistics native_TakeManualLap(byte[] var1, byte[] var2);

   public PoolSwimmingOutput endSwimming() {
      return this.native_EndSwimming(this.algorithm, this.filter, this.statistics);
   }

   public ArrayList feedAccSample(ReSampleOutput var1) {
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < var1.getReSampledTimestamps().size(); ++var3) {
         var2.add(this.native_FeedAccSample(this.filter, (Float)var1.getReSampledX().get(var3), (Float)var1.getReSampledY().get(var3), (Float)var1.getReSampledZ().get(var3), (Long)var1.getReSampledTimestamps().get(var3)));
      }

      return var2;
   }

   public void feedHrSample(int var1) {
      this.native_FeedHrSample(this.statistics, this.mCurrentStyle, var1);
   }

   public ArrayList feedMultipleAccSamples(float[] var1, float[] var2, float[] var3) {
      return this.native_FeedMultipleAccSamples(this.filter, var1, var2, var3);
   }

   public PoolSwimmingOutput feedStyle(int var1) {
      this.mCurrentStyle = var1;
      return this.native_FeedStyle(this.algorithm, this.filter, this.statistics, var1);
   }

   public SwimmingStatistics getSwimmingStatistics() {
      return this.native_GetSwimmingStatistics(this.statistics);
   }

   public SwimmingLapStatistics takeAutomaticLap() {
      return this.native_TakeAutomaticLap(this.algorithm, this.filter);
   }

   public SwimmingLapStatistics takeDistanceAutomaticLap() {
      return this.native_TakeDistanceAutomaticLap(this.algorithm, this.filter);
   }

   public SwimmingLapStatistics takeManualLap() {
      return this.native_TakeManualLap(this.algorithm, this.filter);
   }
}
