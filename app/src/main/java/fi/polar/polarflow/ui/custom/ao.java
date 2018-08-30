package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.cs;
import android.support.v7.widget.ef;
import android.util.DisplayMetrics;
import android.view.View;

class ao extends cs {
   private final WearableLinearLayoutManager f;

   ao(Context var1, WearableLinearLayoutManager var2) {
      super(var1);
      this.f = var2;
   }

   protected float a(DisplayMetrics var1) {
      return 100.0F / (float)var1.densityDpi;
   }

   public int a(int var1, int var2, int var3, int var4, int var5) {
      return (var3 + var4) / 2 - (var1 + var2) / 2;
   }

   public int a(View var1, int var2) {
      if (var2 == 0) {
         var2 = super.a(var1, var2);
      } else {
         ef var3 = (ef)var1.getLayoutParams();
         var2 = this.a(this.f.i(var1) - var3.topMargin, this.f.k(var1) + var3.bottomMargin, this.f.E(), this.f.C() - this.f.G(), var2);
      }

      return var2;
   }

   public PointF c(int var1) {
      PointF var2;
      if (var1 < this.f.l()) {
         var2 = new PointF(0.0F, -1.0F);
      } else {
         var2 = new PointF(0.0F, 1.0F);
      }

      return var2;
   }
}
