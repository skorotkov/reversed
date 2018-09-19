package fi.polar.polarflow.calculators;

import fi.polar.polarmathsmart.swimming.poolswimming.PoolSwimmingOutput;

class ag_PoolSwimmingSample extends ai_Sample {
   private final PoolSwimmingOutput a;

   ag_PoolSwimmingSample(PoolSwimmingOutput var1) {
      super(-1, -1L);
      this.a = var1;
   }

   float a() {
      return this.a.getDistance();
   }

   float b() {
      return this.a.getCurrentSpeed();
   }

   float c() {
      return this.a.getAvgSpeed();
   }

   float d() {
      return this.a.getMaxSpeed();
   }

   float e() {
      return this.a.getLapDistance();
   }

   float f() {
      return this.a.getLapAvgSpeed();
   }

   float g() {
      return this.a.getLapMaxSpeed();
   }

   float h() {
      return this.a.getaLapDistance();
   }

   float i() {
      return this.a.getaLapAvgSpeed();
   }

   float j() {
      return this.a.getaLapMaxSpeed();
   }

   boolean k() {
      boolean var1;
      if (this.a.getAutoDistanceLapShouldTrigger() != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
