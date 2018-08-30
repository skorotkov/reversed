package fi.polar.polarmathsmart.weightmanagement;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;

public class WeightTrend {
   private double estimatedWeightForNextDay;
   private WeightPlotPoint firstPoint;
   private WeightPlotPoint secondPoint;

   public WeightTrend() {
   }

   public WeightTrend(double var1, WeightPlotPoint var3, WeightPlotPoint var4) {
      this.estimatedWeightForNextDay = var1;
      this.firstPoint = var3;
      this.secondPoint = var4;
   }

   public double calculateEstimatedWeightForAnyGivenMoment(double var1) {
      double var3 = this.secondPoint.getTime();
      double var5 = this.firstPoint.getTime();
      return (this.secondPoint.getWeight() - this.firstPoint.getWeight()) / (var3 - var5) * (var1 - this.firstPoint.getTime()) + this.firstPoint.getWeight();
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            WeightTrend var3 = (WeightTrend)var1;
            if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.estimatedWeightForNextDay, this.estimatedWeightForNextDay, 0.001D) != 0) {
               var2 = false;
            } else {
               label46: {
                  if (this.firstPoint != null) {
                     if (this.firstPoint.equals(var3.firstPoint)) {
                        break label46;
                     }
                  } else if (var3.firstPoint == null) {
                     break label46;
                  }

                  var2 = false;
                  return var2;
               }

               if (this.secondPoint != null) {
                  if (this.secondPoint.equals(var3.secondPoint)) {
                     return var2;
                  }
               } else if (var3.secondPoint == null) {
                  return var2;
               }

               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public double getEstimatedWeightForNextDay() {
      return this.estimatedWeightForNextDay;
   }

   public WeightPlotPoint getFirstPoint() {
      return this.firstPoint;
   }

   public WeightPlotPoint getSecondPoint() {
      return this.secondPoint;
   }

   public int hashCode() {
      int var1 = 0;
      long var2 = Double.doubleToLongBits(this.estimatedWeightForNextDay);
      int var4 = (int)(var2 ^ var2 >>> 32);
      int var5;
      if (this.firstPoint != null) {
         var5 = this.firstPoint.hashCode();
      } else {
         var5 = 0;
      }

      if (this.secondPoint != null) {
         var1 = this.secondPoint.hashCode();
      }

      return (var5 + var4 * 31) * 31 + var1;
   }

   public void setEstimatedWeightForNextDay(double var1) {
      this.estimatedWeightForNextDay = var1;
   }

   public void setFirstPoint(WeightPlotPoint var1) {
      this.firstPoint = var1;
   }

   public void setSecondPoint(WeightPlotPoint var1) {
      this.secondPoint = var1;
   }

   public String toString() {
      return "WeightTrend{estimatedWeightForNextDay=" + this.estimatedWeightForNextDay + ", firstPoint=" + this.firstPoint + ", secondPoint=" + this.secondPoint + '}';
   }
}
