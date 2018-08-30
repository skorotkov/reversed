package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.view.View;
import java.util.Collection;

class am extends fi.polar.polarflow.ui.a.n {
   private void b(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_RUNNING_CADENCE".equals(var1.getAction()) && this.e() == var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1)) {
         this.b(var1.getIntExtra("ExerciseLapCalc.KEY_MAX_RUNNING_CADENCE", -1));
      }

   }

   private void c(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var1.getAction())) {
         this.d(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1) + 1);
      }

   }

   public void a(Intent var1) {
      String var2;
      if (var1 != null) {
         var2 = var1.getAction();
      } else {
         var2 = null;
      }

      if ("ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var2)) {
         this.c(var1);
      } else if ("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_RUNNING_CADENCE".equals(var2)) {
         this.b(var1);
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a(2131230875, 2131230893);
      this.d(1);
   }

   public void a(Collection var1) {
      this.c(e(var1, "ExerciseLapCalc.ACTION_MANUAL_LAP"));
      this.b(e(var1, "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_RUNNING_CADENCE"));
   }

   public void d() {
      this.c(this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP"));
      this.b(this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_RUNNING_CADENCE"));
   }
}
