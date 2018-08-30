package fi.polar.polarmathsmart.trainingprogram.running.model;

import java.util.List;

public abstract class TrainingTargetTrainingProgram {
   protected String name;
   protected List weeks;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            TrainingTargetTrainingProgram var3;
            label43: {
               var3 = (TrainingTargetTrainingProgram)var1;
               if (this.name != null) {
                  if (this.name.equals(var3.name)) {
                     break label43;
                  }
               } else if (var3.name == null) {
                  break label43;
               }

               var2 = false;
               return var2;
            }

            if (this.weeks != null) {
               if (this.weeks.equals(var3.weeks)) {
                  return var2;
               }
            } else if (var3.weeks == null) {
               return var2;
            }

            var2 = false;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public String getName() {
      return this.name;
   }

   public List getWeeks() {
      return this.weeks;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.name != null) {
         var2 = this.name.hashCode();
      } else {
         var2 = 0;
      }

      if (this.weeks != null) {
         var1 = this.weeks.hashCode();
      }

      return var2 * 31 + var1;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public void setWeeks(List var1) {
      this.weeks = var1;
   }

   public String toString() {
      return this.getClass().getName() + "{" + "name='" + this.name + '\'' + "name='" + this.name + '\'' + ", weeks=" + this.weeks + '}';
   }
}
