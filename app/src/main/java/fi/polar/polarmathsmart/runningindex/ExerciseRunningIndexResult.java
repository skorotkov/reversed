package fi.polar.polarmathsmart.runningindex;

public class ExerciseRunningIndexResult {
   private int calculationEndTime;
   private int runningIndex;

   public ExerciseRunningIndexResult() {
   }

   public ExerciseRunningIndexResult(int var1, int var2) {
      this.runningIndex = var1;
      this.calculationEndTime = var2;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            ExerciseRunningIndexResult var3 = (ExerciseRunningIndexResult)var1;
            if (this.runningIndex != var3.runningIndex) {
               var2 = false;
            } else if (this.calculationEndTime != var3.calculationEndTime) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public int getCalculationEndTime() {
      return this.calculationEndTime;
   }

   public int getRunningIndex() {
      return this.runningIndex;
   }

   public int hashCode() {
      return this.runningIndex * 31 + this.calculationEndTime;
   }

   public void setCalculationEndTime(int var1) {
      this.calculationEndTime = var1;
   }

   public void setRunningIndex(int var1) {
      this.runningIndex = var1;
   }
}
