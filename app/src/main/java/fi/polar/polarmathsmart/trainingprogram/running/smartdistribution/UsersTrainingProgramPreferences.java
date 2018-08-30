package fi.polar.polarmathsmart.trainingprogram.running.smartdistribution;

import fi.polar.polarmathsmart.calendar.DayOfWeek;
import java.util.Set;

public class UsersTrainingProgramPreferences {
   private Set preferredTrainingDays;
   private DayOfWeek startDayOfTrainingWeek;
   private short supportingExercisesLevel;

   public UsersTrainingProgramPreferences() {
   }

   public UsersTrainingProgramPreferences(DayOfWeek var1, Set var2, short var3) {
      this.startDayOfTrainingWeek = var1;
      this.preferredTrainingDays = var2;
      this.supportingExercisesLevel = (short)var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            UsersTrainingProgramPreferences var3 = (UsersTrainingProgramPreferences)var1;
            if (this.supportingExercisesLevel != var3.supportingExercisesLevel) {
               var2 = false;
            } else {
               label35: {
                  if (this.preferredTrainingDays != null) {
                     if (this.preferredTrainingDays.equals(var3.preferredTrainingDays)) {
                        break label35;
                     }
                  } else if (var3.preferredTrainingDays == null) {
                     break label35;
                  }

                  var2 = false;
                  return var2;
               }

               if (this.startDayOfTrainingWeek != var3.startDayOfTrainingWeek) {
                  var2 = false;
               }
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public Set getPreferredTrainingDays() {
      return this.preferredTrainingDays;
   }

   public DayOfWeek getStartDayOfTrainingWeek() {
      return this.startDayOfTrainingWeek;
   }

   public short getSupportingExercisesLevel() {
      return this.supportingExercisesLevel;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.startDayOfTrainingWeek != null) {
         var2 = this.startDayOfTrainingWeek.hashCode();
      } else {
         var2 = 0;
      }

      if (this.preferredTrainingDays != null) {
         var1 = this.preferredTrainingDays.hashCode();
      }

      return (var2 * 31 + var1) * 31 + this.supportingExercisesLevel;
   }

   public void setPreferredTrainingDays(Set var1) {
      this.preferredTrainingDays = var1;
   }

   public void setStartDayOfTrainingWeek(DayOfWeek var1) {
      this.startDayOfTrainingWeek = var1;
   }

   public void setSupportingExercisesLevel(short var1) {
      this.supportingExercisesLevel = (short)var1;
   }

   public String toString() {
      return "UsersTrainingProgramPreferences{startDayOfTrainingWeek=" + this.startDayOfTrainingWeek + ", preferredTrainingDays=" + this.preferredTrainingDays + ", supportingExercisesLevel=" + this.supportingExercisesLevel + '}';
   }
}
