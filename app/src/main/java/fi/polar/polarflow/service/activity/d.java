package fi.polar.polarflow.service.activity;

import android.util.SparseArray;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarmathsmart.activity.ActivityClassCalculator;
import fi.polar.polarmathsmart.activity.ActivityClassCalculatorAndroidImpl;
import fi.polar.polarmathsmart.types.ActivityClass;
import fi.polar.polarmathsmart.types.InActivityAlertType;

public class d {
   private static final SparseArray a = new e();
   private ActivityClassCalculator b;

   public static int a(ActivityClass var0) {
      int var1 = a.indexOfValue(var0);
      if (var1 >= 0) {
         var1 = a.keyAt(var1);
      } else {
         var1 = 8;
      }

      return var1;
   }

   public static ActivityClass a(int var0) {
      ActivityClass var1 = (ActivityClass)a.get(var0);
      if (var1 == null) {
         var1 = ActivityClass.NON_WEAR;
      }

      return var1;
   }

   private ActivityClassCalculator e() {
      if (this.b == null) {
         this.b = f();
      }

      return this.b;
   }

   private static ActivityClassCalculator f() {
      fi.polar.polarflow.util.k var0 = new fi.polar.polarflow.util.k(PhysData.getUserPhysData());
      return new ActivityClassCalculatorAndroidImpl(var0.p(), var0.r());
   }

   public int a() {
      return a(this.e().getCurrentActivityClass());
   }

   public int a(float var1, boolean var2, boolean var3) {
      return a(this.e().update(var1, var2, var3));
   }

   public int b() {
      return a(this.e().getStabileActivityClass());
   }

   public float c() {
      return this.e().getFinalMETValue();
   }

   public InActivityAlertType d() {
      return this.e().getAlert();
   }
}
