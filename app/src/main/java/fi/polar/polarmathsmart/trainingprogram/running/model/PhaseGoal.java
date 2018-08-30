package fi.polar.polarmathsmart.trainingprogram.running.model;

public class PhaseGoal {
   private PhaseGoal$PhaseGoalType type;
   private int value;

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            PhaseGoal var3 = (PhaseGoal)var1;
            if (this.value != var3.value) {
               var2 = false;
            } else if (this.type != var3.type) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public PhaseGoal$PhaseGoalType getType() {
      return this.type;
   }

   public int getValue() {
      return this.value;
   }

   public int hashCode() {
      int var1;
      if (this.type != null) {
         var1 = this.type.hashCode();
      } else {
         var1 = 0;
      }

      return var1 * 31 + this.value;
   }

   public void setType(PhaseGoal$PhaseGoalType var1) {
      this.type = var1;
   }

   public void setValue(int var1) {
      this.value = var1;
   }

   public String toString() {
      return "PhaseGoal{type=" + this.type + ", value=" + this.value + '}';
   }
}
