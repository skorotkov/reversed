package fi.polar.polarmathsmart.trainingbenefit;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;
import fi.polar.polarmathsmart.types.zones.DoubleValuesInZones;

public class TimeAndCaloriesInHrZones {
   private DoubleValuesInZones caloriesInZones;
   private double caloriesTotal = 0.0D;
   private DoubleValuesInZones minutesInZones;

   public TimeAndCaloriesInHrZones(int var1) {
      this.minutesInZones = new DoubleValuesInZones(var1, 0.001D);
      this.caloriesInZones = new DoubleValuesInZones(var1, 0.001D);
   }

   public TimeAndCaloriesInHrZones(DoubleValuesInZones var1, DoubleValuesInZones var2, double var3) {
      this.minutesInZones = var1;
      this.caloriesInZones = var2;
      this.caloriesTotal = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            TimeAndCaloriesInHrZones var3 = (TimeAndCaloriesInHrZones)var1;
            if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(this.caloriesTotal, var3.caloriesTotal, 0.001D) != 0) {
               var2 = false;
            } else {
               label46: {
                  if (this.caloriesInZones != null) {
                     if (this.caloriesInZones.equals(var3.caloriesInZones)) {
                        break label46;
                     }
                  } else if (var3.caloriesInZones == null) {
                     break label46;
                  }

                  var2 = false;
                  return var2;
               }

               if (this.minutesInZones != null) {
                  if (this.minutesInZones.equals(var3.minutesInZones)) {
                     return var2;
                  }
               } else if (var3.minutesInZones == null) {
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

   public DoubleValuesInZones getCaloriesInZones() {
      return this.caloriesInZones;
   }

   public double getCaloriesTotal() {
      return this.caloriesTotal;
   }

   public DoubleValuesInZones getMinutesInZones() {
      return this.minutesInZones;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.minutesInZones != null) {
         var2 = this.minutesInZones.hashCode();
      } else {
         var2 = 0;
      }

      if (this.caloriesInZones != null) {
         var1 = this.caloriesInZones.hashCode();
      }

      long var3 = Double.doubleToLongBits(this.caloriesTotal);
      return (var2 * 31 + var1) * 31 + (int)(var3 ^ var3 >>> 32);
   }

   public void setCaloriesInZones(DoubleValuesInZones var1) {
      this.caloriesInZones = var1;
   }

   public void setCaloriesTotal(double var1) {
      this.caloriesTotal = var1;
   }

   public void setMinutesInZones(DoubleValuesInZones var1) {
      this.minutesInZones = var1;
   }

   public String toString() {
      return "TimeAndCaloriesInHrZones{minutesInZones=" + this.minutesInZones + ", caloriesInZones=" + this.caloriesInZones + ", caloriesTotal=" + this.caloriesTotal + '}';
   }
}
