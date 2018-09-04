package fi.polar.polarflow.ui.exeview.target.a_package;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import fi.polar.polarflow.data.orm.ExercisePhase;

class l extends fi.polar.polarflow.ui.a_package.i {
   private long g;

   l() {
      super(1000);
   }

   private long s() {
      ExercisePhase var1 = this.Q.getCurrentPhase();
      long var2;
      if (var1 != null) {
         var2 = var1.getStartTime() + this.Q.getTrainingPhase().getPausedTime();
      } else {
         var2 = SystemClock.elapsedRealtime();
      }

      return var2;
   }

   public int a() {
      return 2130968677;
   }

   public void a(Intent var1) {
      if (var1.getAction().equals("ExercisePhaseCalc.ACTION_PHASE_FINISHED") && this.Q.getCurrentPhase() != null) {
         this.g = this.Q.getCurrentPhase().getGoalDuration();
         this.e();
      }

   }

   public void a(View var1) {
      long var2;
      if (this.Q.getCurrentPhase() != null) {
         var2 = this.Q.getCurrentPhase().getGoalDuration();
      } else {
         var2 = 0L;
      }

      this.g = var2;
      super.a(var1);
   }

   public void b(long var1) {
      super.b(this.g - var1 + 999L);
   }

   public void d() {
      long var1;
      if (this.Q.getCurrentPhase() != null) {
         var1 = this.Q.getCurrentPhase().getGoalDuration();
      } else {
         var1 = 0L;
      }

      this.g = var1;
      super.d();
   }

   public void e() {
      this.a(this.s());
   }

   public void f() {
      this.e();
      super.f();
   }

   protected int i() {
      return 1000 - (int)(SystemClock.elapsedRealtime() - this.s()) % 1000;
   }
}
