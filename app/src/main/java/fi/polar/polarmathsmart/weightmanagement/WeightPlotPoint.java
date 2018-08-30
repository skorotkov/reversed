package fi.polar.polarmathsmart.weightmanagement;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;

public class WeightPlotPoint {
   private double time;
   private double weight;

   public WeightPlotPoint(double var1, double var3) {
      this.time = var1;
      this.weight = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            WeightPlotPoint var3 = (WeightPlotPoint)var1;
            if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.time, this.time, 0.001D) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.weight, this.weight, 0.001D) != 0) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public double getTime() {
      return this.time;
   }

   public double getWeight() {
      return this.weight;
   }

   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.time);
      int var3 = (int)(var1 ^ var1 >>> 32);
      var1 = Double.doubleToLongBits(this.weight);
      return var3 * 31 + (int)(var1 ^ var1 >>> 32);
   }

   public void setTime(double var1) {
      this.time = var1;
   }

   public void setWeight(double var1) {
      this.weight = var1;
   }

   public String toString() {
      return "WeightPlotPoint{time=" + this.time + ", weight=" + this.weight + '}';
   }
}
