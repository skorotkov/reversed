package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.data.Lap;
import java.util.Collection;

class ax extends fi.polar.polarflow.ui.a_package.r {
   private void b(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_AUTO_LAP".equals(var1.getAction())) {
         this.b(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1));
         Lap var3 = (Lap)var1.getParcelableExtra("ExerciseLapCalc.KEY_LAP");
         int var2;
         if (var3 != null) {
            var2 = var3.getMaxHR();
         } else {
            var2 = 0;
         }

         this.a(var2);
      }

   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.a(2131230881, 2131230893);
   }

   public void a(Collection var1) {
      this.b(e(var1, "ExerciseLapCalc.ACTION_AUTO_LAP"));
   }

   public void d() {
      this.b(this.a((String)"ExerciseLapCalc.ACTION_AUTO_LAP"));
   }
}
