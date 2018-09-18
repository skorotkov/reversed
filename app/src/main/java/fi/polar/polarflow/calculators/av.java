package fi.polar.polarflow.calculators;

import android.content.Context;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingLapStatistics;

class av extends h_ExerciseLapCalc {
   bb_SwimmingMetricsProvider d;

   av(Context var1, long var2, bb_SwimmingMetricsProvider var4) {
      this(var1, var2, var4, new as_SpeedRangeStatistics());
   }

   av(Context var1, long var2, bb_SwimmingMetricsProvider var4, as_SpeedRangeStatistics var5) {
      super(var1, var2, (v_StickyLocalBroadcastManager)null, var5);
      this.d = var4;
   }

   public void a_handleCurrentEvent() {
      super.a_handleCurrentEvent();
      ai_Event var1 = this.o_getCurrentEvent();
      if (var1 instanceof ag_PoolSwimmingEvent && ((ag_PoolSwimmingEvent)var1).k()) {
         SwimmingLapStatistics var2 = this.d.e();
         this.a(1, this.i(), var2);
      }

   }
}
