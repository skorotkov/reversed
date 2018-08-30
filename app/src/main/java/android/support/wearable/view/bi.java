package android.support.wearable.view;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.cs;
import android.util.DisplayMetrics;

class bi extends cs {
   private final bb f;

   public bi(Context var1, bb var2) {
      super(var1);
      this.f = var2;
   }

   protected float a(DisplayMetrics var1) {
      return 100.0F / (float)var1.densityDpi;
   }

   public int a(int var1, int var2, int var3, int var4, int var5) {
      return (var3 + var4) / 2 - (var1 + var2) / 2;
   }

   protected void a() {
      super.a();
   }

   public PointF c(int var1) {
      PointF var2;
      if (var1 < this.f.g()) {
         var2 = new PointF(0.0F, -1.0F);
      } else {
         var2 = new PointF(0.0F, 1.0F);
      }

      return var2;
   }
}
