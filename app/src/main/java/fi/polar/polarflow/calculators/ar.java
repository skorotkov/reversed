package fi.polar.polarflow.calculators;

import fi.polar.polarmathsmart.swimming.poolswimming.PoolInformation;
import fi.polar.polarmathsmart.swimming.poolswimming.PoolSwimmingOutput;
import java.util.Iterator;
import java.util.List;

class ar implements af {
   // $FF: synthetic field
   final am a;

   ar(am var1) {
      this.a = var1;
   }

   public void a(PoolSwimmingOutput var1) {
      ag var2 = new ag(var1);
      am.r(this.a).getStatistics().getSwimmingSpeedStatistics().a(var2);
      am.r(this.a).setTotalDistance(var2.a(), true);
      am.r(this.a).setCurrentSpeedInKmPerHour(var2.b());
      Iterator var3 = am.v(this.a).iterator();

      while(var3.hasNext()) {
         al var4 = (al)var3.next();
         if (var4 instanceof h) {
            ((h)var4).b(var2);
         } else if (var4 instanceof j) {
            ((j)var4).b(var2);
         }
      }

      List var5 = var1.getPools();
      if (var5 != null) {
         Iterator var7 = var5.iterator();

         while(var7.hasNext()) {
            PoolInformation var6 = (PoolInformation)var7.next();
            am.w(this.a).addPoolMetric(var6);
         }
      }

   }
}
