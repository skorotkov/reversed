package fi.polar.polarflow.calculators;

import fi.polar.polarflow.a_package.a_DataTypes;

public class b extends ai_Event {
   private final int a;

   b() {
      super(0, 0L, true);
      this.a = -1;
   }

   b(int var1, long var2, int var4) {
      super(var1, var2, true);
      this.a = a_DataTypes.a_adjust(9, var4);
   }

   int a() {
      return this.a;
   }
}
