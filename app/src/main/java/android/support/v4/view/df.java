package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

class df implements bq {
   // $FF: synthetic field
   final ViewPager a;
   private final Rect b;

   df(ViewPager var1) {
      this.a = var1;
      this.b = new Rect();
   }

   public eo a(View var1, eo var2) {
      eo var6 = bz.a(var1, var2);
      if (!var6.e()) {
         Rect var7 = this.b;
         var7.left = var6.a();
         var7.top = var6.b();
         var7.right = var6.c();
         var7.bottom = var6.d();
         int var3 = 0;

         for(int var4 = this.a.getChildCount(); var3 < var4; ++var3) {
            eo var5 = bz.b(this.a.getChildAt(var3), var6);
            var7.left = Math.min(var5.a(), var7.left);
            var7.top = Math.min(var5.b(), var7.top);
            var7.right = Math.min(var5.c(), var7.right);
            var7.bottom = Math.min(var5.d(), var7.bottom);
         }

         var6 = var6.a(var7.left, var7.top, var7.right, var7.bottom);
      }

      return var6;
   }
}
