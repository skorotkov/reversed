package fi.polar.polarmathsmart.runningindex;

public class RacePerformanceEstimates {
   private int estimated10kmTimeSeconds;
   private int estimated5kmTimeSeconds;
   private int estimatedCooperDistance;
   private int estimatedHalfMarathonTimeSeconds;
   private int estimatedMarathonTimeSeconds;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            RacePerformanceEstimates var3 = (RacePerformanceEstimates)var1;
            if (this.estimated10kmTimeSeconds != var3.estimated10kmTimeSeconds) {
               var2 = false;
            } else if (this.estimated5kmTimeSeconds != var3.estimated5kmTimeSeconds) {
               var2 = false;
            } else if (this.estimatedCooperDistance != var3.estimatedCooperDistance) {
               var2 = false;
            } else if (this.estimatedHalfMarathonTimeSeconds != var3.estimatedHalfMarathonTimeSeconds) {
               var2 = false;
            } else if (this.estimatedMarathonTimeSeconds != var3.estimatedMarathonTimeSeconds) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public int getEstimated10kmTimeSeconds() {
      return this.estimated10kmTimeSeconds;
   }

   public int getEstimated5kmTimeSeconds() {
      return this.estimated5kmTimeSeconds;
   }

   public int getEstimatedCooperDistance() {
      return this.estimatedCooperDistance;
   }

   public int getEstimatedHalfMarathonTimeSeconds() {
      return this.estimatedHalfMarathonTimeSeconds;
   }

   public int getEstimatedMarathonTimeSeconds() {
      return this.estimatedMarathonTimeSeconds;
   }

   public int hashCode() {
      return (((this.estimatedCooperDistance * 31 + this.estimated5kmTimeSeconds) * 31 + this.estimated10kmTimeSeconds) * 31 + this.estimatedHalfMarathonTimeSeconds) * 31 + this.estimatedMarathonTimeSeconds;
   }

   public void setEstimated10kmTimeSeconds(int var1) {
      this.estimated10kmTimeSeconds = var1;
   }

   public void setEstimated5kmTimeSeconds(int var1) {
      this.estimated5kmTimeSeconds = var1;
   }

   public void setEstimatedCooperDistance(int var1) {
      this.estimatedCooperDistance = var1;
   }

   public void setEstimatedHalfMarathonTimeSeconds(int var1) {
      this.estimatedHalfMarathonTimeSeconds = var1;
   }

   public void setEstimatedMarathonTimeSeconds(int var1) {
      this.estimatedMarathonTimeSeconds = var1;
   }
}
