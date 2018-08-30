package fi.polar.polarmathsmart.trainingprogram.running.model;

public class TrainingTargetPhase {
   private PhaseGoal goal;
   private IntensityGuidance intensityGuidance;
   private Short jumpIndex;
   private Short repeatCount;

   public TrainingTargetPhase cloneProperties() {
      TrainingTargetPhase var1 = new TrainingTargetPhase();
      var1.setJumpIndex(this.jumpIndex);
      var1.setRepeatCount(this.repeatCount);
      var1.setIntensityGuidance(this.intensityGuidance);
      var1.setGoal(this.goal);
      return var1;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            TrainingTargetPhase var3 = (TrainingTargetPhase)var1;
            if (!this.goal.equals(var3.goal)) {
               var2 = false;
            } else if (!this.intensityGuidance.equals(var3.intensityGuidance)) {
               var2 = false;
            } else {
               label49: {
                  if (this.jumpIndex != null) {
                     if (this.jumpIndex.equals(var3.jumpIndex)) {
                        break label49;
                     }
                  } else if (var3.jumpIndex == null) {
                     break label49;
                  }

                  var2 = false;
                  return var2;
               }

               if (this.repeatCount != null) {
                  if (this.repeatCount.equals(var3.repeatCount)) {
                     return var2;
                  }
               } else if (var3.repeatCount == null) {
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

   public PhaseGoal getGoal() {
      return this.goal;
   }

   public IntensityGuidance getIntensityGuidance() {
      return this.intensityGuidance;
   }

   public Short getJumpIndex() {
      return this.jumpIndex;
   }

   public Short getRepeatCount() {
      return this.repeatCount;
   }

   public int hashCode() {
      int var1 = 0;
      int var2 = this.intensityGuidance.hashCode();
      int var3 = this.goal.hashCode();
      int var4;
      if (this.jumpIndex != null) {
         var4 = this.jumpIndex.hashCode();
      } else {
         var4 = 0;
      }

      if (this.repeatCount != null) {
         var1 = this.repeatCount.hashCode();
      }

      return (var4 + (var2 * 31 + var3) * 31) * 31 + var1;
   }

   public void setGoal(PhaseGoal var1) {
      this.goal = var1;
   }

   public void setIntensityGuidance(IntensityGuidance var1) {
      this.intensityGuidance = var1;
   }

   public void setJumpIndex(Short var1) {
      this.jumpIndex = var1;
   }

   public void setRepeatCount(Short var1) {
      this.repeatCount = var1;
   }

   public String toString() {
      return "TrainingTargetPhase{intensityGuidance=" + this.intensityGuidance + ", goal=" + this.goal + ", jumpIndex=" + this.jumpIndex + ", repeatCount=" + this.repeatCount + '}';
   }
}
