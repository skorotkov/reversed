package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.common.AcceptableDeltaAwareDoubleComparator;

public class DailyCaloriesResults {
   private double activityCalories;
   private double bmrCalories;
   private double exerciseCalories;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            DailyCaloriesResults var3 = (DailyCaloriesResults)var1;
            if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.bmrCalories, this.bmrCalories, 0.001D) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.activityCalories, this.activityCalories, 0.001D) != 0) {
               var2 = false;
            } else if (AcceptableDeltaAwareDoubleComparator.INSTANCE.compareDoubles(var3.exerciseCalories, this.exerciseCalories, 0.001D) != 0) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public double getActivityCalories() {
      return this.activityCalories;
   }

   public double getBmrCalories() {
      return this.bmrCalories;
   }

   public double getExerciseCalories() {
      return this.exerciseCalories;
   }

   public void setActivityCalories(double var1) {
      this.activityCalories = var1;
   }

   public void setBmrCalories(double var1) {
      this.bmrCalories = var1;
   }

   public void setExerciseCalories(double var1) {
      this.exerciseCalories = var1;
   }
}
