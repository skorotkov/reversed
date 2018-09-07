package fi.polar.polarflow.calculators;

import android.content.Context;
import android.os.Handler;

import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingLapStatistics;

class az extends ab {
   private final bb d;
   private final Runnable e;

   az(Context var1, long var2, bb var4) {
      this(var1, var2, var4, (Handler)null, (v_StickyLocalBroadcastManager)null);
   }

   az(Context var1, long var2, bb var4, Handler var5, v_StickyLocalBroadcastManager var6) {
      super(var1, var2, var5, var6);
      this.e = new ba(this);
      this.d = var4;
   }

   // $FF: synthetic method
   static bb a(az var0) {
      return var0.d;
   }

   public void d() {
      if (this.h()) {
         SwimmingLapStatistics var1 = this.d.d();
         this.b(-1, this.i(), var1);
      }

      this.e();
   }

   protected Runnable f() {
      return this.e;
   }
}
