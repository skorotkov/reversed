package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.os.Bundle;

public class bl extends fi.polar.polarflow.ui.a.z {
   public bl() {
      super((new fi.polar.polarflow.ui.a.ae()).a(2131230855).b(2131230853).c(2131230851).b("SwimmingMetricsProvider.KEY_POOL_SWIMMING_AVERAGE_SPEED").a());
   }

   public float a(Bundle var1) {
      return var1.getFloat(y, -1.0F);
   }

   public float a(fi.polar.polarflow.calculators.as var1) {
      float var2;
      if (var1.g()) {
         var2 = var1.a(this.Q.getDurationMs(), (double)this.Q.getTotalDistance());
      } else {
         var2 = var1.i();
      }

      return var2;
   }

   public float a(fi.polar.polarflow.calculators.bd var1) {
      return var1.f();
   }

   public float b(Intent var1) {
      return this.a(this.Q.getSpeedStatistics());
   }
}
