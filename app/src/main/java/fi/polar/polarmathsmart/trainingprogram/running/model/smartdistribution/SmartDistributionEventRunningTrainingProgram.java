package fi.polar.polarmathsmart.trainingprogram.running.model.smartdistribution;

public class SmartDistributionEventRunningTrainingProgram extends SmartDistributionTrainingTargetTrainingProgram {
   private String descriptionKey;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            if (!super.equals(var1)) {
               var2 = false;
            } else {
               SmartDistributionEventRunningTrainingProgram var3 = (SmartDistributionEventRunningTrainingProgram)var1;
               if (this.descriptionKey != null) {
                  if (this.descriptionKey.equals(var3.descriptionKey)) {
                     return var2;
                  }
               } else if (var3.descriptionKey == null) {
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

   public String getDescriptionKey() {
      return this.descriptionKey;
   }

   public int hashCode() {
      int var1 = super.hashCode();
      int var2;
      if (this.descriptionKey != null) {
         var2 = this.descriptionKey.hashCode();
      } else {
         var2 = 0;
      }

      return var2 + var1 * 31;
   }

   public void setDescriptionKey(String var1) {
      this.descriptionKey = var1;
   }

   public String toString() {
      return "SmartDistributionEventRunningTrainingProgram{descriptionKey='" + this.descriptionKey + '\'' + '}';
   }
}
