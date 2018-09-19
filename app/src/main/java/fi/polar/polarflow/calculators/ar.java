package fi.polar.polarflow.calculators;

import fi.polar.polarmathsmart.swimming.poolswimming.PoolInformation;
import fi.polar.polarmathsmart.swimming.poolswimming.PoolSwimmingOutput;
import java.util.Iterator;
import java.util.List;

class ar implements af {
   // $FF: synthetic field
   final am_SessionCalculators a;

   ar(am_SessionCalculators var1) {
      this.a = var1;
   }

   public void a(PoolSwimmingOutput var1) {
      ag_PoolSwimmingSample var2 = new ag_PoolSwimmingSample(var1);
      am_SessionCalculators.r_getTraining(this.a).getStatistics().getSwimmingSpeedStatistics().a(var2);
      am_SessionCalculators.r_getTraining(this.a).setTotalDistance(var2.a(), true);
      am_SessionCalculators.r_getTraining(this.a).setCurrentSpeedInKmPerHour(var2.b());
      Iterator var3 = am_SessionCalculators.v_getCalcs(this.a).iterator();

      while(var3.hasNext()) {
         al_Calc var4 = (al_Calc)var3.next();
         if (var4 instanceof h_ExerciseLapCalc) {
            ((h_ExerciseLapCalc)var4).b_handleSample(var2);
         } else if (var4 instanceof j_ExercisePhaseCalc) {
            ((j_ExercisePhaseCalc)var4).b_handleSample(var2);
         }
      }

      List var5 = var1.getPools();
      if (var5 != null) {
         Iterator var7 = var5.iterator();

         while(var7.hasNext()) {
            PoolInformation var6 = (PoolInformation)var7.next();
            am_SessionCalculators.w_getSwimmingSamples(this.a).addPoolMetric(var6);
         }
      }

   }
}
