package fi.polar.polarflow.calculators;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Handler;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

public class ax extends e_DurationLapCalc {
   private bb_SwimmingMetricsProvider d;
   private final Runnable e;

   ax(Context var1, long var2, long var4, bb_SwimmingMetricsProvider var6) {
      this(var1, (Handler)null, (AlarmManager)null, var2, var4, var6);
   }

   ax(Context var1, Handler var2, AlarmManager var3, long var4, long var6, bb_SwimmingMetricsProvider var8) {
      this(var1, var2, var3, var4, var6, var8, (v_StickyLocalBroadcastManager)null);
   }

   ax(Context var1, Handler var2, AlarmManager var3, long var4, long var6, bb_SwimmingMetricsProvider var8, v_StickyLocalBroadcastManager var9) {
      super(var1, var2, var3, var4, var6, var9);
      this.e = new ay(this);
      this.d = var8;
   }

   // $FF: synthetic method
   static bb_SwimmingMetricsProvider a(ax var0) {
      return var0.d;
   }

   protected Runnable g() {
      return this.e;
   }
}
