package fi.polar.polarflow.calculators;

class aq_SamplerTask implements Runnable {
   // $FF: synthetic field
   final am_SessionCalculators a_sessionCalculators;

   aq_SamplerTask(am_SessionCalculators var1) {
      this.a_sessionCalculators = var1;
   }

   public void run() {
      // $FF: Couldn't be decompiled
      if (am_SessionCalculators.r_getTraining(this.a_sessionCalculators).isRunning()) {

         am_SessionCalculators.c_getMaxSampleIndex(this.a_sessionCalculators); // looks like for syncronized

         long var1_elapsedRealtime = am_SessionCalculators.b_getTimeUtils(this.a_sessionCalculators).b_elapsedRealtime();

         while(am_SessionCalculators.s_getCurrentSamplingTimeFromBoot(this.a_sessionCalculators) < var1_elapsedRealtime) {
            am_SessionCalculators.j_getHrSamplesTimeFromBoot(this.a_sessionCalculators).append(am_SessionCalculators.c_getMaxSampleIndex(this.a_sessionCalculators)[0], am_SessionCalculators.s_getCurrentSamplingTimeFromBoot(this.a_sessionCalculators));
            am_SessionCalculators.n_getGpsSamplesTimeFromBoot(this.a_sessionCalculators).append(am_SessionCalculators.c_getMaxSampleIndex(this.a_sessionCalculators)[0], am_SessionCalculators.s_getCurrentSamplingTimeFromBoot(this.a_sessionCalculators));
            am_SessionCalculators.t_get_f_samplesTimeFromBoot(this.a_sessionCalculators).append(am_SessionCalculators.c_getMaxSampleIndex(this.a_sessionCalculators)[0], am_SessionCalculators.s_getCurrentSamplingTimeFromBoot(this.a_sessionCalculators));
            int[] var3 = am_SessionCalculators.c_getMaxSampleIndex(this.a_sessionCalculators);
            ++var3[0];
            am_SessionCalculators.c_setAndReturnCurrentSamplingTimeFromBoot(this.a_sessionCalculators, am_SessionCalculators.s_getCurrentSamplingTimeFromBoot(this.a_sessionCalculators) + 1000L);
         }

         am_SessionCalculators.u_getHandler(this.a_sessionCalculators).postDelayed(this, 1000L);
      } else {
         fi.polar.polarflow.util.d.b(am_SessionCalculators.d(), "Sampler task is running, but training is not running.");
      }
      
   }
}
