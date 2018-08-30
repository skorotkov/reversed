package fi.polar.polarmathsmart.trainingprogram.running.model.smartdistribution;

import fi.polar.polarmathsmart.trainingprogram.running.model.PhasedTrainingTarget;
import fi.polar.polarmathsmart.trainingprogram.running.model.TrainingProgramRun;
import java.util.Date;

public class TrainingProgramExercise {
   private String nameKey;
   private String phasedTargetString;
   private PhasedTrainingTarget phasedTrainingTarget;
   private String sportName;
   private Date startDateTime;
   private int totalDurationInMinutes;

   public TrainingProgramExercise() {
   }

   public TrainingProgramExercise(TrainingProgramRun var1) {
      this.setNameKey(var1.getNameKey());
      this.setPhasedTargetString(var1.getPhasedTargetString());
      this.setPhasedTrainingTarget(var1.getPhasedTrainingTarget());
      this.setSportName("RUNNING");
      this.setTotalDurationInMinutes(var1.getTotalDurationInMinutes());
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            TrainingProgramExercise var3 = (TrainingProgramExercise)var1;
            if (this.totalDurationInMinutes != var3.totalDurationInMinutes) {
               var2 = false;
            } else {
               label60: {
                  if (this.nameKey != null) {
                     if (this.nameKey.equals(var3.nameKey)) {
                        break label60;
                     }
                  } else if (var3.nameKey == null) {
                     break label60;
                  }

                  var2 = false;
                  return var2;
               }

               label61: {
                  if (this.sportName != null) {
                     if (this.sportName.equals(var3.sportName)) {
                        break label61;
                     }
                  } else if (var3.sportName == null) {
                     break label61;
                  }

                  var2 = false;
                  return var2;
               }

               if (this.startDateTime != null) {
                  if (this.startDateTime.equals(var3.startDateTime)) {
                     return var2;
                  }
               } else if (var3.startDateTime == null) {
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

   public String getNameKey() {
      return this.nameKey;
   }

   public String getPhasedTargetString() {
      return this.phasedTargetString;
   }

   public PhasedTrainingTarget getPhasedTrainingTarget() {
      return this.phasedTrainingTarget;
   }

   public String getSportName() {
      return this.sportName;
   }

   public Date getStartDateTime() {
      return this.startDateTime;
   }

   public int getTotalDurationInMinutes() {
      return this.totalDurationInMinutes;
   }

   public int hashCode() {
      int var1 = 0;
      int var2;
      if (this.startDateTime != null) {
         var2 = this.startDateTime.hashCode();
      } else {
         var2 = 0;
      }

      int var3;
      if (this.sportName != null) {
         var3 = this.sportName.hashCode();
      } else {
         var3 = 0;
      }

      int var4;
      if (this.nameKey != null) {
         var4 = this.nameKey.hashCode();
      } else {
         var4 = 0;
      }

      int var5 = this.totalDurationInMinutes;
      int var6;
      if (this.phasedTargetString != null) {
         var6 = this.phasedTargetString.hashCode();
      } else {
         var6 = 0;
      }

      if (this.phasedTrainingTarget != null) {
         var1 = this.phasedTrainingTarget.hashCode();
      }

      return (var6 + ((var4 + (var3 + var2 * 31) * 31) * 31 + var5) * 31) * 31 + var1;
   }

   public void setNameKey(String var1) {
      this.nameKey = var1;
   }

   public void setPhasedTargetString(String var1) {
      this.phasedTargetString = var1;
   }

   public void setPhasedTrainingTarget(PhasedTrainingTarget var1) {
      this.phasedTrainingTarget = var1;
   }

   public void setSportName(String var1) {
      this.sportName = var1;
   }

   public void setStartDateTime(Date var1) {
      this.startDateTime = var1;
   }

   public void setTotalDurationInMinutes(int var1) {
      this.totalDurationInMinutes = var1;
   }

   public String toString() {
      return "TrainingProgramExercise{startDateTime='" + this.startDateTime + '\'' + ", sportName='" + this.sportName + '\'' + ", nameKey='" + this.nameKey + '\'' + ", totalDurationInMinutes=" + this.totalDurationInMinutes + ", phasedTargetString='" + this.phasedTargetString + '\'' + '}';
   }
}
