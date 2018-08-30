package fi.polar.polarmathsmart.speed;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;

public class AverageSpeedData {
   private Double speedAverage;
   private Integer speedSampleCount;
   private Double speedSampleSum;

   public boolean equals(Object var1) {
      boolean var2 = false;
      boolean var3;
      if (!(var1 instanceof AverageSpeedData)) {
         var3 = var2;
      } else if (this == var1) {
         var3 = true;
      } else {
         AverageSpeedData var4 = (AverageSpeedData)var1;
         var3 = var2;
         if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(this.speedAverage, var4.speedAverage, 0.001D) == 0) {
            var3 = var2;
            if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(this.speedSampleSum, var4.speedSampleSum, 0.001D) == 0) {
               var3 = var2;
               if (this.speedSampleCount == var4.speedSampleCount) {
                  var3 = true;
               }
            }
         }
      }

      return var3;
   }

   public Double getSpeedAverage() {
      return this.speedAverage;
   }

   public Integer getSpeedSampleCount() {
      return this.speedSampleCount;
   }

   public Double getSpeedSampleSum() {
      return this.speedSampleSum;
   }

   public void setSpeedAverage(double var1) {
      this.speedAverage = var1;
   }

   public void setSpeedSampleCount(int var1) {
      this.speedSampleCount = var1;
   }

   public void setSpeedSampleSum(double var1) {
      this.speedSampleSum = var1;
   }
}
