package fi.polar.polarflow.ui.custom;

import android.content.Context;
import android.support.v7.widget.ds;
import android.support.v7.widget.et;
import android.support.v7.widget.ev;
import android.view.View;

public class ak extends ao {
   private final WearableLinearLayoutManager f;
   private final ds g;

   public ak(Context var1, WearableLinearLayoutManager var2, ds var3) {
      super(var1, var2);
      this.f = var2;
      this.g = var3;
   }

   public void a(View var1, ev var2, et var3) {
      int var4 = (int)var1.getY();
      int var5 = var4;
      if (this.g.a() - 1 == this.f.d(var1)) {
         int var6 = var1.getHeight();
         int var7 = this.f.C();
         var5 = var4;
         if (var6 < var7) {
            var5 = var4 + var6 - var7;
         }
      }

      if (var5 == 0) {
         this.f();
      } else {
         var3.a(0, var5, this.a(Math.abs(var5)), this.b);
      }

   }
}
