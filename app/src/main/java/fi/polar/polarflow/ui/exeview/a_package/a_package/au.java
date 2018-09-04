package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import fi.polar.polarflow.data.Lap;
import java.util.Collection;

class au extends fi.polar.polarflow.ui.a_package.p {
   private void b(Intent var1) {
      if (var1 != null && var1.getAction().equals("ExerciseLapCalc.ACTION_MANUAL_LAP")) {
         this.j = ((Lap)var1.getParcelableExtra("ExerciseLapCalc.KEY_LAP")).getSplitTimeMillis();
         this.b(bt.a(var1));
         this.e();
      }

   }

   public void a(Intent var1) {
      if ("ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var1.getAction())) {
         this.b(var1);
         this.f();
      }

   }

   public void a(View var1) {
      Intent var2 = this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP");
      if (var2 != null) {
         this.j = ((Lap)var2.getParcelableExtra("ExerciseLapCalc.KEY_LAP")).getSplitTimeMillis();
      }

      this.i = this.Q.getStartTimeFromBoot() + this.Q.getPausedTime();
      super.a(var1);
      this.b(1);
   }

   public void a(Collection var1) {
      super.a(var1);
      this.b(e(var1, "ExerciseLapCalc.ACTION_MANUAL_LAP"));
   }

   protected void b(int var1) {
      if (this.h != null) {
         TextView var2 = this.h;
         Context var3 = this.h.getContext();
         if (var1 < 0) {
            var1 = 1;
         }

         var2.setText(var3.getString(2131230878, new Object[]{String.valueOf(var1)}));
      } else {
         super.b(var1);
      }

   }

   public void d() {
      super.d();
      this.b(this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP"));
   }

   public void e() {
      this.a(this.i + this.j);
   }
}
