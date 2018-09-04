package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.util.Pair;
import android.view.View;
import java.util.Collection;

public class x extends fi.polar.polarflow.ui.a_package.g {
   private Pair c = Pair.create("fi.polar.polarflow.ACTION_LOCATION_DATA", "fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE");

   private void b(Intent var1) {
      if (var1 != null && var1.getAction().equals(this.c.first) && (this.n() || var1.getStringExtra("fi.polar.polarflow.KEY_SENSOR_CALCULATOR_TYPE").equals("fi.polar.polarflow.SENSOR_CALCULATOR_TYPE_POLAR"))) {
         this.a(var1.getFloatExtra((String)this.c.second, -1.0F));
      }

   }

   private void e() {
      if (this.P != null) {
         this.a(this.P.getFloat(r, -1.0F));
      } else if (this.Q.isRunning()) {
         this.a(this.Q.getTotalDistance());
      }

   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      if (this.n()) {
         this.c = Pair.create("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA", "SwimmingMetricsProvider.KEY_POOL_SWIMMING_DISTANCE");
      }

   }

   public void a(Collection var1) {
      this.b(e(var1, (String)this.c.first));
   }

   public void d() {
      this.e();
   }
}
