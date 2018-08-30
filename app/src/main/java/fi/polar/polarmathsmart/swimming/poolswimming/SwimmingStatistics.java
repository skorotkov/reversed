package fi.polar.polarmathsmart.swimming.poolswimming;

public class SwimmingStatistics {
   SwimmingStyleStatistics mBackstrokeStatistics;
   SwimmingStyleStatistics mBreaststrokeStatistics;
   SwimmingStyleStatistics mButterflyStatistics;
   SwimmingStyleStatistics mFreestyleStatistics;
   int mNbrOfPoolsSwimmed;
   float mSwimmingDistance;
   SwimmingPoolInformation mSwimmingPool;
   int mTotalStrokeCount;

   public SwimmingStatistics() {
   }

   public SwimmingStatistics(float var1, SwimmingStyleStatistics var2, SwimmingStyleStatistics var3, SwimmingStyleStatistics var4, SwimmingStyleStatistics var5, int var6, int var7, SwimmingPoolInformation var8) {
      this.mSwimmingDistance = var1;
      this.mFreestyleStatistics = var2;
      this.mBreaststrokeStatistics = var3;
      this.mBackstrokeStatistics = var4;
      this.mButterflyStatistics = var5;
      this.mTotalStrokeCount = var6;
      this.mNbrOfPoolsSwimmed = var7;
      this.mSwimmingPool = var8;
   }

   public SwimmingStyleStatistics getBackstrokeStatistics() {
      return this.mBackstrokeStatistics;
   }

   public SwimmingStyleStatistics getBreaststrokeStatistics() {
      return this.mBreaststrokeStatistics;
   }

   public SwimmingStyleStatistics getButterflyStatistics() {
      return this.mButterflyStatistics;
   }

   public SwimmingStyleStatistics getFreestyleStatistics() {
      return this.mFreestyleStatistics;
   }

   public int getNbrOfPoolsSwimmed() {
      return this.mNbrOfPoolsSwimmed;
   }

   public float getSwimmingDistance() {
      return this.mSwimmingDistance;
   }

   public SwimmingPoolInformation getSwimmingPool() {
      return this.mSwimmingPool;
   }

   public int getTotalStrokeCount() {
      return this.mTotalStrokeCount;
   }

   public void setBackstrokeStatistics(SwimmingStyleStatistics var1) {
      this.mBackstrokeStatistics = var1;
   }

   public void setBreaststrokeStatistics(SwimmingStyleStatistics var1) {
      this.mBreaststrokeStatistics = var1;
   }

   public void setButterflyStatistics(SwimmingStyleStatistics var1) {
      this.mButterflyStatistics = var1;
   }

   public void setFreestyleStatistics(SwimmingStyleStatistics var1) {
      this.mFreestyleStatistics = var1;
   }

   public void setNbrOfPoolsSwimmed(int var1) {
      this.mNbrOfPoolsSwimmed = var1;
   }

   public void setSwimmingDistance(float var1) {
      this.mSwimmingDistance = var1;
   }

   public void setSwimmingPool(SwimmingPoolInformation var1) {
      this.mSwimmingPool = var1;
   }

   public void setTotalStrokeCount(int var1) {
      this.mTotalStrokeCount = var1;
   }
}
