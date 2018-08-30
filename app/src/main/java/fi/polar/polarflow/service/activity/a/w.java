package fi.polar.polarflow.service.activity.a;

import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.activity.ActivityGuidanceAndroidImpl;
import fi.polar.polarmathsmart.activity.model.ActivityGuidance;
import java.util.concurrent.TimeUnit;

public class w {
   private fi.polar.polarflow.util.k a;

   private fi.polar.polarflow.util.k b() {
      if (this.a == null) {
         this.a = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
      }

      return this.a;
   }

   public x a(float var1, float var2) {
      var1 -= var2;
      x var5;
      if (var1 > 0.0F) {
         fi.polar.polarflow.util.k var3 = this.b();
         ActivityGuidance var4 = (new ActivityGuidanceAndroidImpl()).defineActivityGuidance(var1, var3.p(), var3.r());
         var5 = new x(TimeUnit.MINUTES.toMillis((long)var4.getGuidanceLight()), TimeUnit.MINUTES.toMillis((long)var4.getGuidanceModerate()), TimeUnit.MINUTES.toMillis((long)var4.getGuidanceVigorous()));
      } else {
         var5 = new x(0L, 0L, 0L);
      }

      return var5;
   }

   public void a() {
      this.a = null;
   }
}
