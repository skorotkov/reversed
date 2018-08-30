package fi.polar.polarmathsmart.trainingprogram.running.smartdistribution;

import fi.polar.polarmathsmart.trainingprogram.running.model.smartdistribution.SmartDistributionEventRunningTrainingProgram;
import java.util.List;

public class SmartDistributionRunningTrainingProgram {
   private SmartDistributionEventRunningTrainingProgram eventRunningTrainingProgram;
   private List generalRunningTrainingPrograms;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            SmartDistributionRunningTrainingProgram var3;
            label43: {
               var3 = (SmartDistributionRunningTrainingProgram)var1;
               if (this.eventRunningTrainingProgram != null) {
                  if (this.eventRunningTrainingProgram.equals(var3.eventRunningTrainingProgram)) {
                     break label43;
                  }
               } else if (var3.eventRunningTrainingProgram == null) {
                  break label43;
               }

               var2 = false;
               return var2;
            }

            if (this.generalRunningTrainingPrograms != null) {
               if (this.generalRunningTrainingPrograms.equals(var3.generalRunningTrainingPrograms)) {
                  return var2;
               }
            } else if (var3.generalRunningTrainingPrograms == null) {
               return var2;
            }

            var2 = false;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public SmartDistributionEventRunningTrainingProgram getEventRunningTrainingProgram() {
      return this.eventRunningTrainingProgram;
   }

   public List getGeneralRunningTrainingPrograms() {
      return this.generalRunningTrainingPrograms;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.generalRunningTrainingPrograms != null) {
         var2 = this.generalRunningTrainingPrograms.hashCode();
      } else {
         var2 = 0;
      }

      if (this.eventRunningTrainingProgram != null) {
         var1 = this.eventRunningTrainingProgram.hashCode();
      }

      return var2 * 31 + var1;
   }

   public void setEventRunningTrainingProgram(SmartDistributionEventRunningTrainingProgram var1) {
      this.eventRunningTrainingProgram = var1;
   }

   public void setGeneralRunningTrainingPrograms(List var1) {
      this.generalRunningTrainingPrograms = var1;
   }

   public String toString() {
      return "SmartDistributionRunningTrainingProgram{generalRunningTrainingPrograms=" + this.generalRunningTrainingPrograms + ", eventRunningTrainingProgram=" + this.eventRunningTrainingProgram + '}';
   }
}
