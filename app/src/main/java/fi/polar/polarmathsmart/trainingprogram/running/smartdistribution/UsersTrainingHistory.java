package fi.polar.polarmathsmart.trainingprogram.running.smartdistribution;

import fi.polar.polarmathsmart.trainingprogram.running.model.ProgramCreationAnswers$AverageExerciseDuration;
import fi.polar.polarmathsmart.trainingprogram.running.model.ProgramCreationAnswers$AverageExerciseIntensity;
import fi.polar.polarmathsmart.trainingprogram.running.model.ProgramCreationAnswers$ExerciseFrequency;

public class UsersTrainingHistory {
   private ProgramCreationAnswers$AverageExerciseDuration averageExerciseDuration;
   private ProgramCreationAnswers$AverageExerciseIntensity averageExerciseIntensity;
   private ProgramCreationAnswers$ExerciseFrequency exerciseFrequency;

   public UsersTrainingHistory() {
   }

   public UsersTrainingHistory(ProgramCreationAnswers$ExerciseFrequency var1, ProgramCreationAnswers$AverageExerciseDuration var2, ProgramCreationAnswers$AverageExerciseIntensity var3) {
      this.exerciseFrequency = var1;
      this.averageExerciseDuration = var2;
      this.averageExerciseIntensity = var3;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            UsersTrainingHistory var3 = (UsersTrainingHistory)var1;
            if (this.averageExerciseDuration != var3.averageExerciseDuration) {
               var2 = false;
            } else if (this.averageExerciseIntensity != var3.averageExerciseIntensity) {
               var2 = false;
            } else if (this.exerciseFrequency != var3.exerciseFrequency) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public ProgramCreationAnswers$AverageExerciseDuration getAverageExerciseDuration() {
      return this.averageExerciseDuration;
   }

   public ProgramCreationAnswers$AverageExerciseIntensity getAverageExerciseIntensity() {
      return this.averageExerciseIntensity;
   }

   public ProgramCreationAnswers$ExerciseFrequency getExerciseFrequency() {
      return this.exerciseFrequency;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.exerciseFrequency != null) {
         var2 = this.exerciseFrequency.hashCode();
      } else {
         var2 = 0;
      }

      int var3;
      if (this.averageExerciseDuration != null) {
         var3 = this.averageExerciseDuration.hashCode();
      } else {
         var3 = 0;
      }

      if (this.averageExerciseIntensity != null) {
         var1 = this.averageExerciseIntensity.hashCode();
      }

      return (var3 + var2 * 31) * 31 + var1;
   }

   public void setAverageExerciseDuration(ProgramCreationAnswers$AverageExerciseDuration var1) {
      this.averageExerciseDuration = var1;
   }

   public void setAverageExerciseIntensity(ProgramCreationAnswers$AverageExerciseIntensity var1) {
      this.averageExerciseIntensity = var1;
   }

   public void setExerciseFrequency(ProgramCreationAnswers$ExerciseFrequency var1) {
      this.exerciseFrequency = var1;
   }

   public String toString() {
      return "UsersTrainingHistory{exerciseFrequency=" + this.exerciseFrequency + ", averageExerciseDuration=" + this.averageExerciseDuration + ", averageExerciseIntensity=" + this.averageExerciseIntensity + '}';
   }
}
