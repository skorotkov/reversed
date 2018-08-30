package fi.polar.polarmathsmart.swimming.poolswimming;

public class SwimmingLapStatistics {
   float avgDurationOfPool;
   int lapStrokes;
   float minDurationOfPool;
   int poolCount;

   public float getAvgDurationOfPool() {
      return this.avgDurationOfPool;
   }

   public int getLapStrokes() {
      return this.lapStrokes;
   }

   public float getMinDurationOfPool() {
      return this.minDurationOfPool;
   }

   public int getPoolCount() {
      return this.poolCount;
   }

   public void setAvgDurationOfPool(float var1) {
      this.avgDurationOfPool = var1;
   }

   public void setLapStrokes(int var1) {
      this.lapStrokes = var1;
   }

   public void setMinDurationOfPool(float var1) {
      this.minDurationOfPool = var1;
   }

   public void setPoolCount(int var1) {
      this.poolCount = var1;
   }
}
