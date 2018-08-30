package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.view.View;
import java.util.Collection;

class h extends fi.polar.polarflow.ui.a.r {
   private void b(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR".equals(var1.getAction()) && this.e() == var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1)) {
         this.a(var1.getIntExtra("ExerciseLapCalc.KEY_AVG_HR", 0));
      }

   }

   private void c(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_AUTO_LAP".equals(var1.getAction())) {
         this.b(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1) + 1);
      }

   }

   public void a(Intent var1) {
      String var2;
      if (var1 != null) {
         var2 = var1.getAction();
      } else {
         var2 = null;
      }

      if ("ExerciseLapCalc.ACTION_AUTO_LAP".equals(var2)) {
         this.c(var1);
      } else if ("ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR".equals(var2)) {
         this.b(var1);
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a(2131230838, 2131230851);
      this.b(1);
   }

   public void a(Collection var1) {
      this.c(e(var1, "ExerciseLapCalc.ACTION_AUTO_LAP"));
      this.b(e(var1, "ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR"));
   }

   public void d() {
      this.c(this.a((String)"ExerciseLapCalc.ACTION_AUTO_LAP"));
      this.b(this.a((String)"ExerciseLapCalc.ACTION_AUTO_LAP_DATA_HR"));
   }
}
