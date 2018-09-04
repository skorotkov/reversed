package fi.polar.polarflow.ui.exeview.target.a_package;

import android.content.Intent;
import java.util.Collection;

public class m extends r {
   protected fi.polar.polarflow.ui.exeview.target.m a = new fi.polar.polarflow.ui.exeview.target.m();

   private void e() {
      if (this.a.a(this.Q) >= 100) {
         this.c.setText(2131230832);
      }

   }

   public void a(Intent var1) {
      if (var1.getAction().equals("ExerciseVolumeTargetCalc.action.TARGET_REACHED")) {
         this.e();
      }

   }

   public void a(Collection var1) {
      this.e();
   }

   public void d() {
      this.e();
   }
}
