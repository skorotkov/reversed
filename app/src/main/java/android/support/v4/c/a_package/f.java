package android.support.v4.c.a_package;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.util.DisplayMetrics;

@TargetApi(9)
class f {
   static int a(Resources var0) {
      DisplayMetrics var1 = var0.getDisplayMetrics();
      return (int)((float)var1.heightPixels / var1.density);
   }

   static int b(Resources var0) {
      DisplayMetrics var1 = var0.getDisplayMetrics();
      return (int)((float)var1.widthPixels / var1.density);
   }

   static int c(Resources var0) {
      return Math.min(b(var0), a(var0));
   }
}
