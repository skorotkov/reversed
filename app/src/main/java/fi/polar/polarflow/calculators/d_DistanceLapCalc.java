package fi.polar.polarflow.calculators;

import android.content.Context;

import fi.polar.polarflow.a_package.a_DataTypes;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

public class d_DistanceLapCalc extends h_ExerciseLapCalc {
   private final float d;
   private boolean e;

   d_DistanceLapCalc(Context var1, float var2, long var3) {
      this(var1, var2, var3, new as());
   }

   d_DistanceLapCalc(Context var1, float var2, long var3, as var5) {
      super(var1, var3, (v_StickyLocalBroadcastManager)null, var5);
      float var6 = a_DataTypes.a_adjust(1, var2);
      var2 = var6;
      if (var6 < 100.0F) {
         fi.polar.polarflow.util.d.f("DistanceLapCalc", "Distance should be >= 100 meters");
         var2 = 100.0F;
      }

      this.d = var2;
   }

   public void a() {
      super.a();
      if (this.k() >= this.d) {
         float var1 = this.d;
         if (this.e) {
            var1 = this.k();
         }

         this.a(1, this.i(), var1);
      }

      boolean var2;
      if (!this.o().n_isTrusted()) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.e = var2;
   }
}
