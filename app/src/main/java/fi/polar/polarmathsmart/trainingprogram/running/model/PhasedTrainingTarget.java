package fi.polar.polarmathsmart.trainingprogram.running.model;

import java.util.List;

public class PhasedTrainingTarget {
   public List phases;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            PhasedTrainingTarget var3 = (PhasedTrainingTarget)var1;
            if (this.phases != null) {
               if (this.phases.equals(var3.phases)) {
                  return var2;
               }
            } else if (var3.phases == null) {
               return var2;
            }

            var2 = false;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public List getPhases() {
      return this.phases;
   }

   public int hashCode() {
      int var1;
      if (this.phases != null) {
         var1 = this.phases.hashCode();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public void setPhases(List var1) {
      this.phases = var1;
   }

   public String toString() {
      return "PhasedTrainingTarget{phases=" + this.phases + '}';
   }
}
