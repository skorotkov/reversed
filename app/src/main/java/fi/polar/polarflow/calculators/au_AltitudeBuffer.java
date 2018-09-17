package fi.polar.polarflow.calculators;

import java.util.ArrayList;

class au_AltitudeBuffer extends ArrayList {
   // $FF: synthetic field
   final at_RangeStatistics a;

   au_AltitudeBuffer(at_RangeStatistics var1) {
      this.a = var1;
   }

   public boolean a(Float var1) {
      if (this.size() == 30) {
         this.remove(0);
      }

      return super.add(var1);
   }

   // $FF: synthetic method
   public boolean add(Object var1) {
      return this.a((Float)var1);
   }
}
