package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.data.Lap;
import java.util.Collection;

class aw extends fi.polar.polarflow.ui.a.r {
   private void b(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_AUTO_LAP".equals(var1.getAction())) {
         this.b(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1));
         Lap var3 = (Lap)var1.getParcelableExtra("ExerciseLapCalc.KEY_LAP");
         int var2;
         if (var3 != null) {
            var2 = var3.getAvgHR();
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
      this.a(2131230880, 2131230851);
   }

   public void a(Collection var1) {
      this.b(e(var1, "ExerciseLapCalc.ACTION_AUTO_LAP"));
   }

   public void d() {
      this.b(this.a((String)"ExerciseLapCalc.ACTION_AUTO_LAP"));
   }
}
