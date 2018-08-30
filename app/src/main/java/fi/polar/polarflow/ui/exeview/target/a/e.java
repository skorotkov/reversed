package fi.polar.polarflow.ui.exeview.target.a;

import android.content.Intent;
import android.view.View;
import fi.polar.polarflow.ui.exeview.a.a.x;
import java.util.Collection;

public class e extends x {
   private float c = -1.0F;

   public e() {
      this.a = 3;
   }

   private void b(Intent var1) {
      if (var1 != null && "ExercisePhaseCalc.ACTION_PHASE_CURRENT_DATA".equals(var1.getAction())) {
         this.a(var1.getFloatExtra("ExercisePhaseCalc.KEY_DISTANCE", this.Q.getTrainingPhase().getDistance()));
      }

   }

   private void e() {
      if (this.Q.isRunning() && this.Q.getCurrentPhase() != null) {
         this.c = this.Q.getCurrentPhase().getGoalDistance();
         this.a(this.Q.getTrainingPhase().getDistance());
      }

   }

   public int a() {
      return 2130968674;
   }

   public void a(float var1) {
      float var2 = var1;
      if (var1 < 0.0F) {
         var2 = 0.0F;
      }

      super.a(this.c - var2);
   }

   public void a(Intent var1) {
      if (var1.getAction().equals("ExercisePhaseCalc.ACTION_PHASE_FINISHED")) {
         this.e();
      } else if ("ExercisePhaseCalc.ACTION_PHASE_CURRENT_DATA".equals(var1.getAction())) {
         this.b(var1);
      }

   }

   public void a(View var1) {
      super.a(var1);
      if (this.n()) {
         this.a = 18;
      }

   }

   public void a(Collection var1) {
      this.b(e(var1, "ExercisePhaseCalc.ACTION_PHASE_CURRENT_DATA"));
   }

   public void d() {
      this.e();
   }
}
