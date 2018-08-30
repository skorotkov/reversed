package fi.polar.polarmathsmart.swimming.poolswimming;

public class SwimmingStyleStatistics {
   int mAvgHeartrate;
   float mAvgSwolf;
   float mDistance;
   float mDuration;
   int mMaxHeartrate;
   float mPoolTimeMin;
   int mStrokeCount;

   public SwimmingStyleStatistics() {
   }

   public SwimmingStyleStatistics(float var1, int var2, float var3, int var4, int var5, float var6, float var7) {
      this.mDistance = var1;
      this.mStrokeCount = var2;
      this.mDuration = var3;
      this.mAvgHeartrate = var4;
      this.mMaxHeartrate = var5;
      this.mAvgSwolf = var6;
      this.mPoolTimeMin = var7;
   }

   public int getAvgHeartrate() {
      return this.mAvgHeartrate;
   }

   public float getAvgSwolf() {
      return this.mAvgSwolf;
   }

   public float getDistance() {
      return this.mDistance;
   }

   public float getDuration() {
      return this.mDuration;
   }

   public int getMaxHeartrate() {
      return this.mMaxHeartrate;
   }

   public float getPoolTimeMin() {
      return this.mPoolTimeMin;
   }

   public int getStrokeCount() {
      return this.mStrokeCount;
   }

   public void setAvgHeartrate(int var1) {
      this.mAvgHeartrate = var1;
   }

   public void setAvgSwolf(float var1) {
      this.mAvgSwolf = var1;
   }

   public void setDistance(float var1) {
      this.mDistance = var1;
   }

   public void setDuration(float var1) {
      this.mDuration = var1;
   }

   public void setMaxHeartrate(int var1) {
      this.mMaxHeartrate = var1;
   }

   public void setPoolTimeMin(float var1) {
      this.mPoolTimeMin = var1;
   }

   public void setStrokeCount(int var1) {
      this.mStrokeCount = var1;
   }
}
