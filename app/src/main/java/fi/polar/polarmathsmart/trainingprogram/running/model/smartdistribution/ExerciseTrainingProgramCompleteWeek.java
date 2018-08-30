package fi.polar.polarmathsmart.trainingprogram.running.model.smartdistribution;

import java.util.List;

public class ExerciseTrainingProgramCompleteWeek {
   private List days;
   private short numberOfWeekInProgram;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            ExerciseTrainingProgramCompleteWeek var3 = (ExerciseTrainingProgramCompleteWeek)var1;
            if (this.numberOfWeekInProgram != var3.numberOfWeekInProgram) {
               var2 = false;
            } else {
               if (this.days != null) {
                  if (this.days.equals(var3.days)) {
                     return var2;
                  }
               } else if (var3.days == null) {
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

   public List getDays() {
      return this.days;
   }

   public short getNumberOfWeekInProgram() {
      return this.numberOfWeekInProgram;
   }

   public int hashCode() {
      short var1 = this.numberOfWeekInProgram;
      int var2;
      if (this.days != null) {
         var2 = this.days.hashCode();
      } else {
         var2 = 0;
      }

      return var2 + var1 * 31;
   }

   public void setDays(List var1) {
      this.days = var1;
   }

   public void setNumberOfWeekInProgram(short var1) {
      this.numberOfWeekInProgram = (short)var1;
   }

   public String toString() {
      return "ExerciseTrainingProgramCompleteWeek{numberOfWeekInProgram=" + this.numberOfWeekInProgram + ", days=" + this.days + '}';
   }
}
