package fi.polar.polarflow.ui.exeview.a_package.a_package;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.data.Lap;
import java.util.Collection;

class bg extends fi.polar.polarflow.ui.a_package.p {
   private void b(Intent var1) {
      if (var1 != null && var1.getAction().equals("ExerciseLapCalc.ACTION_MANUAL_LAP")) {
         this.d(((Lap)var1.getParcelableExtra("ExerciseLapCalc.KEY_LAP")).getDurationMillis());
         this.b(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1));
      }

   }

   public void a(Intent var1) {
      this.b(var1);
   }

   public void a(View var1) {
      super.a(var1);
      this.a(2131230891);
      if (this.l() != bj.a && this.g != null) {
         this.g.setVisibility(8);
      }

   }

   public void a(Collection var1) {
      this.b(e(var1, "ExerciseLapCalc.ACTION_MANUAL_LAP"));
   }

   public void d() {
      this.b(this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP"));
   }

   public void e() {
      this.b(this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP"));
   }

   public void f() {
   }
}
