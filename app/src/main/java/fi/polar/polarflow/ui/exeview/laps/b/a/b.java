package fi.polar.polarflow.ui.exeview.laps.b.a;

import android.content.Intent;
import android.util.Pair;
import android.view.View;
import java.util.Collection;

public class b extends fi.polar.polarflow.ui.a.g {
   private Pair c = Pair.create("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS", "ExerciseLapCalc.KEY_DISTANCE");

   private void b(Intent var1) {
      if (var1 != null && ((String)this.c.first).equals(var1.getAction())) {
         this.a(var1.getFloatExtra((String)this.c.second, -1.0F));
      }

   }

   public void a(Intent var1) {
      super.a(var1);
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      if (this.n()) {
         this.c = Pair.create("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA", "SwimmingMetricsProvider.KEY_POOL_SWIMMING_LAP_DISTANCE");
      }

      this.a(0.0F);
   }

   public void a(Collection var1) {
      this.b(e(var1, (String)this.c.first));
   }

   public void d() {
      super.d();
      this.b(this.a((String)((String)this.c.first)));
   }
}
