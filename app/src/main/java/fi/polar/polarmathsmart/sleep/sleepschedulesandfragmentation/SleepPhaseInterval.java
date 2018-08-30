package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

public class SleepPhaseInterval {
   private Double intervalEndOffset;
   private Double intervalStartOffset;

   public SleepPhaseInterval(Double var1, Double var2) {
      this.intervalStartOffset = var1;
      this.intervalEndOffset = var2;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 == null) {
            var2 = false;
         } else if (this.getClass() != var1.getClass()) {
            var2 = false;
         } else {
            SleepPhaseInterval var3 = (SleepPhaseInterval)var1;
            if (this.intervalEndOffset == null) {
               if (var3.getIntervalEndOffset() != null) {
                  var2 = false;
                  return var2;
               }
            } else if (!this.intervalEndOffset.equals(var3.getIntervalEndOffset())) {
               var2 = false;
               return var2;
            }

            if (this.intervalStartOffset == null) {
               if (var3.getIntervalStartOffset() != null) {
                  var2 = false;
               }
            } else if (!this.intervalStartOffset.equals(var3.getIntervalStartOffset())) {
               var2 = false;
            }
         }
      }

      return var2;
   }

   public Double getIntervalDuration() {
      return this.intervalEndOffset + 30.0D - this.intervalStartOffset;
   }

   public Double getIntervalEndOffset() {
      return this.intervalEndOffset;
   }

   public Double getIntervalStartOffset() {
      return this.intervalStartOffset;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.intervalEndOffset == null) {
         var2 = 0;
      } else {
         var2 = this.intervalEndOffset.hashCode();
      }

      if (this.intervalStartOffset != null) {
         var1 = this.intervalStartOffset.hashCode();
      }

      return (var2 + 139) * 139 + var1;
   }

   public void setIntervalEndOffset(Double var1) {
      this.intervalEndOffset = var1;
   }

   public void setIntervalStartOffset(Double var1) {
      this.intervalStartOffset = var1;
   }

   public String toString() {
      return "[" + this.getIntervalStartOffset() + "," + this.getIntervalEndOffset() + "]";
   }
}
