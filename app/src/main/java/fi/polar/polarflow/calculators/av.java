package fi.polar.polarflow.calculators;

import android.content.Context;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingLapStatistics;

class av extends h {
   bb d;

   av(Context var1, long var2, bb var4) {
      this(var1, var2, var4, new as());
   }

   av(Context var1, long var2, bb var4, as var5) {
      super(var1, var2, (fi.polar.polarflow.util.v)null, var5);
      this.d = var4;
   }

   public void a() {
      super.a();
      ai var1 = this.o();
      if (var1 instanceof ag && ((ag)var1).k()) {
         SwimmingLapStatistics var2 = this.d.e();
         this.a(1, this.i(), var2);
      }

   }
}
