package fi.polar.polarflow.calculators;

class aq_SamplerTask implements Runnable {
   // $FF: synthetic field
   final am_SessionCalculators a;

   aq_SamplerTask(am_SessionCalculators var1) {
      this.a = var1;
   }

   public void run() {
      // $FF: Couldn't be decompiled
      if (am_SessionCalculators.r_getTraining(this.a).isRunning()) {
         am_SessionCalculators.c(this.a);
         long var1 = am_SessionCalculators.b_getTimeUtils(this.a).b_elapsedRealtime();

         while(am_SessionCalculators.s(this.a) < var1) {
            am_SessionCalculators.j(this.a).append(am_SessionCalculators.c(this.a)[0], am_SessionCalculators.s(this.a));
            am_SessionCalculators.n(this.a).append(am_SessionCalculators.c(this.a)[0], am_SessionCalculators.s(this.a));
            am_SessionCalculators.t(this.a).append(am_SessionCalculators.c(this.a)[0], am_SessionCalculators.s(this.a));
            int[] var3 = am_SessionCalculators.c(this.a);
            ++var3[0];
            am_SessionCalculators.c(this.a, am_SessionCalculators.s(this.a) + 1000L);
         }

         am_SessionCalculators.u(this.a).postDelayed(this, 1000L);
      } else {
         fi.polar.polarflow.util.d.b(am_SessionCalculators.d(), "Sampler task is running, but training is not running.");
      }
      
   }
}
