package fi.polar.polarmathsmart.trainingprogram.running.model;

public class TrainingProgramRun {
   private String nameKey;
   private short numberOfRunInWeek;
   private String phasedTargetString;
   private PhasedTrainingTarget phasedTrainingTarget;
   private int totalDurationInMinutes;

   private boolean phasedTargetsEqual(TrainingProgramRun var1) {
      boolean var2 = true;
      if (this.phasedTargetString == null) {
         if (var1.phasedTargetString != null) {
            var2 = false;
         }
      } else if (!this.phasedTargetString.equals(var1.phasedTargetString)) {
         var2 = false;
      } else if (this.phasedTrainingTarget == null) {
         if (var1.phasedTrainingTarget != null) {
            var2 = false;
         }
      } else {
         var2 = this.phasedTrainingTarget.equals(var1.phasedTrainingTarget);
      }

      return var2;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            TrainingProgramRun var3 = (TrainingProgramRun)var1;
            if (this.numberOfRunInWeek != var3.numberOfRunInWeek) {
               var2 = false;
            } else if (this.totalDurationInMinutes != var3.totalDurationInMinutes) {
               var2 = false;
            } else {
               label38: {
                  if (this.nameKey != null) {
                     if (this.nameKey.equals(var3.nameKey)) {
                        break label38;
                     }
                  } else if (var3.nameKey == null) {
                     break label38;
                  }

                  var2 = false;
                  return var2;
               }

               if (!this.phasedTargetsEqual(var3)) {
                  var2 = false;
               }
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

   public short getNumberOfRunInWeek() {
      return this.numberOfRunInWeek;
   }

   public String getPhasedTargetString() {
      return this.phasedTargetString;
   }

   public PhasedTrainingTarget getPhasedTrainingTarget() {
      return this.phasedTrainingTarget;
   }

   public int getTotalDurationInMinutes() {
      return this.totalDurationInMinutes;
   }

   public int hashCode() {
      int var1 = 0;
      short var2 = this.numberOfRunInWeek;
      int var3;
      if (this.nameKey != null) {
         var3 = this.nameKey.hashCode();
      } else {
         var3 = 0;
      }

      int var4 = this.totalDurationInMinutes;
      int var5;
      if (this.phasedTargetString != null) {
         var5 = this.phasedTargetString.hashCode();
      } else {
         var5 = 0;
      }

      if (this.phasedTrainingTarget != null) {
         var1 = this.phasedTrainingTarget.hashCode();
      }

      return (var5 + ((var3 + var2 * 31) * 31 + var4) * 31) * 31 + var1;
   }

   public void setNameKey(String var1) {
      this.nameKey = var1;
   }

   public void setNumberOfRunInWeek(short var1) {
      this.numberOfRunInWeek = (short)var1;
   }

   public void setPhasedTargetString(String var1) {
      this.phasedTargetString = var1;
   }

   public void setPhasedTrainingTarget(PhasedTrainingTarget var1) {
      this.phasedTrainingTarget = var1;
   }

   public void setTotalDurationInMinutes(int var1) {
      this.totalDurationInMinutes = var1;
   }

   public String toString() {
      return "TrainingProgramRun{numberOfRunInWeek=" + this.numberOfRunInWeek + ", nameKey='" + this.nameKey + '\'' + ", totalDurationInMinutes=" + this.totalDurationInMinutes + ", phasedTargetString='" + this.phasedTargetString + '\'' + ", phasedTrainingTarget=" + this.phasedTrainingTarget + '}';
   }
}
