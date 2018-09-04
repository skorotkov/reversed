package fi.polar.polarflow.service.activity.a_package;

import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.activity.ActivityGoalCalculator;
import fi.polar.polarmathsmart.activity.ActivityGoalCalculatorAndroidImpl;

class l extends k {
   private ActivityGoalCalculator b;

   public l() {
      super(v.a);
   }

   private static ActivityGoalCalculator f() {
      fi.polar.polarflow.util.k var0 = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
      return new ActivityGoalCalculatorAndroidImpl(var0.p(), var0.r(), var0.A());
   }

   public void a() {
      super.a();
      this.b = null;
   }

   public void a(o var1) {
      if (var1 instanceof p) {
         p var2 = (p)var1;
         if (!var2.f) {
            if (this.b == null) {
               this.b = f();
            }

            this.a = this.b.updateMetMinutes(var2.c, this.a);
         }
      } else {
         fi.polar.polarflow.util.d.c("CumulativeMetMin", "", new IllegalArgumentException("Expecting SummarizerInputMet"));
      }

   }

   public float e() {
      if (this.b == null) {
         this.b = f();
      }

      return this.b.getGoal();
   }
}
