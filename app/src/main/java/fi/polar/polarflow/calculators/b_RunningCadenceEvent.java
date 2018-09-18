package fi.polar.polarflow.calculators;

import fi.polar.polarflow.a_package.a_DataTypes;

public class b_RunningCadenceEvent extends ai_Event {
   private final int a_cadence;

   b_RunningCadenceEvent() {
      super(0, 0L, true);
      this.a_cadence = -1;
   }

   b_RunningCadenceEvent(int var1, long var2, int var4_cadence) {
      super(var1, var2, true);
      this.a_cadence = a_DataTypes.a_adjust(9, var4_cadence);
   }

   int a_getCadence() {
      return this.a_cadence;
   }
}
