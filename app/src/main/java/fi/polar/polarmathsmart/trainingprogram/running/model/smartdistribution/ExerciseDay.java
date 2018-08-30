package fi.polar.polarmathsmart.trainingprogram.running.model.smartdistribution;

import fi.polar.polarmathsmart.calendar.DayOfWeek;
import java.util.Date;
import java.util.List;

public class ExerciseDay {
   private Date date;
   private DayOfWeek dayOfWeek;
   private List exercises;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            label45: {
               ExerciseDay var3 = (ExerciseDay)var1;
               if (this.date != null) {
                  if (!this.date.equals(var3.date)) {
                     break label45;
                  }
               } else if (var3.date != null) {
                  break label45;
               }

               if (this.dayOfWeek != var3.dayOfWeek) {
                  var2 = false;
               } else {
                  if (this.exercises != null) {
                     if (this.exercises.equals(var3.exercises)) {
                        return var2;
                     }
                  } else if (var3.exercises == null) {
                     return var2;
                  }

                  var2 = false;
               }

               return var2;
            }

            var2 = false;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public Date getDate() {
      return this.date;
   }

   public DayOfWeek getDayOfWeek() {
      return this.dayOfWeek;
   }

   public List getExercises() {
      return this.exercises;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.date != null) {
         var2 = this.date.hashCode();
      } else {
         var2 = 0;
      }

      int var3;
      if (this.dayOfWeek != null) {
         var3 = this.dayOfWeek.hashCode();
      } else {
         var3 = 0;
      }

      if (this.exercises != null) {
         var1 = this.exercises.hashCode();
      }

      return (var3 + var2 * 31) * 31 + var1;
   }

   public void setDate(Date var1) {
      this.date = var1;
   }

   public void setDayOfWeek(DayOfWeek var1) {
      this.dayOfWeek = var1;
   }

   public void setExercises(List var1) {
      this.exercises = var1;
   }

   public String toString() {
      return "ExerciseDay{date='" + this.date + '\'' + ", dayOfWeek=" + this.dayOfWeek + ", exercises=" + this.exercises + '}';
   }
}
