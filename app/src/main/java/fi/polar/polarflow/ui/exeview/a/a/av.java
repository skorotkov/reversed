package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.data.Lap;
import java.util.Collection;

class av extends fi.polar.polarflow.ui.a.o {
   private void b(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_AUTO_LAP".equals(var1.getAction())) {
         this.b(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1));
         Lap var3 = (Lap)var1.getParcelableExtra("ExerciseLapCalc.KEY_LAP");
         float var2;
         if (var3 != null) {
            var2 = var3.getDistance();
         } else {
            var2 = 0.0F;
         }

         this.a(var2);
      }

   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.a(2131230884);
      this.b(var1.getContext().getString(2131231099));
   }

   public void a(Collection var1) {
      this.b(e(var1, "ExerciseLapCalc.ACTION_AUTO_LAP"));
   }

   public void d() {
      this.b(this.a((String)"ExerciseLapCalc.ACTION_AUTO_LAP"));
   }
}
