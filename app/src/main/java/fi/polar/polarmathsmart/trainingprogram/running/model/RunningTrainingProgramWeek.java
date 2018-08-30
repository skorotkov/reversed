package fi.polar.polarmathsmart.trainingprogram.running.model;

import java.util.List;

public class RunningTrainingProgramWeek {
   private short numberOfWeekInProgram;
   private List runs;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            RunningTrainingProgramWeek var3 = (RunningTrainingProgramWeek)var1;
            if (this.numberOfWeekInProgram != var3.numberOfWeekInProgram) {
               var2 = false;
            } else {
               if (this.runs != null) {
                  if (this.runs.equals(var3.runs)) {
                     return var2;
                  }
               } else if (var3.runs == null) {
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

   public short getNumberOfWeekInProgram() {
      return this.numberOfWeekInProgram;
   }

   public List getRuns() {
      return this.runs;
   }

   public int hashCode() {
      short var1 = this.numberOfWeekInProgram;
      int var2;
      if (this.runs != null) {
         var2 = this.runs.hashCode();
      } else {
         var2 = 0;
      }

      return var2 + var1 * 31;
   }

   public void setNumberOfWeekInProgram(short var1) {
      this.numberOfWeekInProgram = (short)var1;
   }

   public void setRuns(List var1) {
      this.runs = var1;
   }

   public String toString() {
      return "RunningTrainingProgramWeek{numberOfWeekInProgram=" + this.numberOfWeekInProgram + ", runs=" + this.runs + '}';
   }
}
