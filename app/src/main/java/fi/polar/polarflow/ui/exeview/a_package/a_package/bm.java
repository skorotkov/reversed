package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.os.Bundle;

import fi.polar.polarflow.calculators.as_SpeedRangeStatistics;

public class bm extends fi.polar.polarflow.ui.a_package.z {
   public bm() {
      super((new fi.polar.polarflow.ui.a_package.ae()).a(2131230897).b(2131230895).c(2131230893).b("SwimmingMetricsProvider.KEY_POOL_SWIMMING_MAXIMUM_SPEED").a());
   }

   public float a(Bundle var1) {
      return var1.getFloat(z, -1.0F);
   }

   public float a(as_SpeedRangeStatistics var1) {
      float var2;
      if (var1.g_areAnySamplesAdded()) {
         var2 = Math.max(var1.e_getMax(), var1.a(this.Q.getDurationMs(), (double)this.Q.getTotalDistance()));
      } else {
         var2 = var1.i_getMostResentSample();
      }

      return var2;
   }

   public float a(fi.polar.polarflow.calculators.bd var1) {
      return var1.g();
   }

   public float b(Intent var1) {
      return this.a(this.Q.getSpeedStatistics());
   }
}
