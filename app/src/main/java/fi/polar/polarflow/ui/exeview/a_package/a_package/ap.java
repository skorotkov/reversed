package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.util.Pair;
import android.view.View;
import java.util.Collection;

class ap extends fi.polar.polarflow.ui.a_package.o {
   private Pair c = Pair.create("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS", "ExerciseLapCalc.KEY_DISTANCE");
   private String d = "ExerciseLapCalc.KEY_LAP_NUMBER";

   private void b(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var1.getAction())) {
         this.b(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1) + 1);
         this.a(0.0F);
      }

   }

   private void c(Intent var1) {
      if (var1 != null && ((String)this.c.first).equals(var1.getAction()) && this.e() == var1.getIntExtra(this.d, -1)) {
         this.a(var1.getFloatExtra((String)this.c.second, -1.0F));
      }

   }

   public void a(Intent var1) {
      if (var1 != null) {
         String var2 = var1.getAction();
         if ("ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var2)) {
            this.b(var1);
         } else if (((String)this.c.first).equals(var2)) {
            this.c(var1);
         }
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a(2131230871);
      this.b(1);
      this.a(0.0F);
      if (this.n()) {
         this.c = Pair.create("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA", "SwimmingMetricsProvider.KEY_POOL_SWIMMING_LAP_DISTANCE");
         this.d = "SwimmingMetricsProvider.KEY_POOL_SWIMMING_LAP_NUMBER";
      }

   }

   public void a(Collection var1) {
      this.b(e(var1, "ExerciseLapCalc.ACTION_MANUAL_LAP"));
      this.c(e(var1, (String)this.c.first));
   }

   public void d() {
      this.b(this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP"));
      this.c(this.a((String)((String)this.c.first)));
   }
}
