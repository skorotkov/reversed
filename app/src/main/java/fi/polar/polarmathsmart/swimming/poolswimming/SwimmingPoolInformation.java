package fi.polar.polarmathsmart.swimming.poolswimming;

public class SwimmingPoolInformation {
   static final int SWIMMING_POOL_METERS = 0;
   static final int SWIMMING_POOL_YARDS = 1;
   float mPoolLength;
   int mSwimmingPoolType;

   public SwimmingPoolInformation() {
   }

   public SwimmingPoolInformation(int var1, float var2) {
      this.mSwimmingPoolType = var1;
      this.mPoolLength = var2;
   }

   public float getSwimmingPoolLength() {
      return this.mPoolLength;
   }

   public int getSwimmingPoolType() {
      return this.mSwimmingPoolType;
   }

   public void setSwimmingPoolLength(float var1) {
      this.mPoolLength = var1;
   }

   public void setSwimmingPoolType(int var1) {
      this.mSwimmingPoolType = var1;
   }
}
