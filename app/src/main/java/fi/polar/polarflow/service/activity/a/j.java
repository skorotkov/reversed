package fi.polar.polarflow.service.activity.a;

import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.activity.ActivityDistanceCalculator;
import fi.polar.polarmathsmart.activity.ActivityDistanceCalculatorAndroidImpl;
import java.util.Arrays;

public class j extends k {
   private static final String b = j.class.getSimpleName();
   private ActivityDistanceCalculator c;

   public j() {
      super(v.b);
   }

   private void a(s var1) {
      this.a += this.e().calculateActivityDistance(Arrays.asList((int)var1.c));
   }

   private ActivityDistanceCalculator e() {
      if (this.c == null) {
         this.c = new ActivityDistanceCalculatorAndroidImpl((double)(new fi.polar.polarflow.util.k(PhysData.getUserPhysData())).t());
      }

      return this.c;
   }

   public void a(o var1) {
      if (var1 instanceof s) {
         this.a((s)var1);
      } else {
         fi.polar.polarflow.util.d.c(b, "", new IllegalArgumentException("Expecting SummarizerInputSteps"));
      }

   }

   public void b_() {
      super.b_();
      this.c = null;
   }
}
