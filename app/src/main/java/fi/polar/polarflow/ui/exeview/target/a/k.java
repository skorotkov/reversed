package fi.polar.polarflow.ui.exeview.target.a;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.data.orm.ExercisePhase;
import java.util.Collection;

public class k extends r {
   private int a = 16;

   private void e() {
      ExercisePhase var1 = this.Q.getCurrentPhase();
      if (var1 != null) {
         String var2 = var1.getName();
         String var3 = var2;
         if (var1.getTotalExecutionCount() > 1) {
            String var4 = fi.polar.polarflow.ui.exeview.target.k.a(this.Q, var1);
            var3 = var2;
            if (var4 != null) {
               var3 = fi.polar.polarflow.ui.exeview.target.k.a(var2, var4, this.a);
            }
         }

         this.c.setText(var3);
      }

   }

   public void a(Intent var1) {
      if (var1.getAction().equals("ExercisePhaseCalc.ACTION_PHASE_FINISHED")) {
         this.e();
      }

   }

   public void a(View var1) {
      super.a(var1);
      this.a = var1.getResources().getInteger(2131820553);
   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }
}
