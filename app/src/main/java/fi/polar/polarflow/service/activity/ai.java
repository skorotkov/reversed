package fi.polar.polarflow.service.activity;

import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.activity.DecideMetSource;
import fi.polar.polarmathsmart.activity.DecideMetSourceAndroidImpl;
import fi.polar.polarmathsmart.heartrate.ConvertHeartRateOrMet;
import fi.polar.polarmathsmart.heartrate.ConvertHeartRateOrMetAndroidImpl;

public class ai {
   private final DecideMetSource a = new DecideMetSourceAndroidImpl();
   private ConvertHeartRateOrMet b;
   private fi.polar.polarflow.util.k c;

   private ConvertHeartRateOrMet b() {
      if (this.b == null) {
         this.b = this.c();
      }

      return this.b;
   }

   private ConvertHeartRateOrMet c() {
      fi.polar.polarflow.util.k var1 = this.d();
      return new ConvertHeartRateOrMetAndroidImpl(var1.p(), (double)var1.t(), (double)var1.s(), var1.r(), var1.y(), (char)var1.u(), (char)var1.v());
   }

   private fi.polar.polarflow.util.k d() {
      if (this.c == null) {
         this.c = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
      }

      return this.c;
   }

   public float a(float var1) {
      return this.b().convertHeartRateToMet(var1);
   }

   public float a(float var1, float var2) {
      fi.polar.polarflow.util.k var3 = this.d();
      return this.a.decideMetSource(var1, var2, var3.p(), var3.r(), false);
   }

   public void a() {
      this.b = null;
      this.c = null;
   }

   public float b(float var1) {
      return this.b().convertMetToHeartRate(var1);
   }
}
