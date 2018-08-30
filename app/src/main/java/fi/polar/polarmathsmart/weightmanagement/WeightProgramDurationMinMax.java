package fi.polar.polarmathsmart.weightmanagement;

public class WeightProgramDurationMinMax {
   private int defaultDuration;
   private int maximumDurationAtTheBeginning;
   private int minimumDurationAtTheBeginning;

   public WeightProgramDurationMinMax() {
   }

   public WeightProgramDurationMinMax(int var1, int var2, int var3) {
      this.minimumDurationAtTheBeginning = var1;
      this.maximumDurationAtTheBeginning = var2;
      this.defaultDuration = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            WeightProgramDurationMinMax var3 = (WeightProgramDurationMinMax)var1;
            if (this.defaultDuration != var3.defaultDuration) {
               var2 = false;
            } else if (this.maximumDurationAtTheBeginning != var3.maximumDurationAtTheBeginning) {
               var2 = false;
            } else if (this.minimumDurationAtTheBeginning != var3.minimumDurationAtTheBeginning) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public int getDefaultDuration() {
      return this.defaultDuration;
   }

   public int getMaximumDurationAtTheBeginning() {
      return this.maximumDurationAtTheBeginning;
   }

   public int getMinimumDurationAtTheBeginning() {
      return this.minimumDurationAtTheBeginning;
   }

   public int hashCode() {
      return (this.minimumDurationAtTheBeginning * 31 + this.maximumDurationAtTheBeginning) * 31 + this.defaultDuration;
   }

   public void setDefaultDuration(int var1) {
      this.defaultDuration = var1;
   }

   public void setMaximumDurationAtTheBeginning(int var1) {
      this.maximumDurationAtTheBeginning = var1;
   }

   public void setMinimumDurationAtTheBeginning(int var1) {
      this.minimumDurationAtTheBeginning = var1;
   }

   public String toString() {
      return "WeightProgramDurationMinMax{minimumDurationAtTheBeginning=" + this.minimumDurationAtTheBeginning + ", maximumDurationAtTheBeginning=" + this.maximumDurationAtTheBeginning + ", defaultDuration=" + this.defaultDuration + '}';
   }
}
