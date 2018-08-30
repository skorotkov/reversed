package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;
import android.view.View;
import java.util.Collection;

class aj extends fi.polar.polarflow.ui.a.m {
   private void b(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var1.getAction())) {
         this.b(var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1) + 1);
         this.a(0.0F);
      }

   }

   private void c(Intent var1) {
      if (var1 != null && "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS".equals(var1.getAction()) && this.e() == var1.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1)) {
         this.a(var1.getFloatExtra("ExerciseLapCalc.KEY_ASCENT", -1.0F));
      }

   }

   public int a() {
      int var1;
      switch(ak.a[this.l().ordinal()]) {
      case 1:
         var1 = 2130968648;
         break;
      default:
         var1 = super.a();
      }

      return var1;
   }

   public void a(Intent var1) {
      String var2;
      if (var1 != null) {
         var2 = var1.getAction();
      } else {
         var2 = null;
      }

      if ("ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var2)) {
         this.b(var1);
      } else if ("ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS".equals(var2)) {
         this.c(var1);
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a(2131230868);
      this.a(0.0F);
      this.b(1);
   }

   public void a(Collection var1) {
      this.b(e(var1, "ExerciseLapCalc.ACTION_MANUAL_LAP"));
      this.c(e(var1, "ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS"));
   }

   public void d() {
      this.b(this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP"));
      this.c(this.a((String)"ExerciseLapCalc.ACTION_MANUAL_LAP_DATA_GPS"));
   }
}
