package android.support.v4.d.a_package;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;

@TargetApi(19)
class k {
   public static void a(Drawable var0, boolean var1) {
      var0.setAutoMirrored(var1);
   }

   public static boolean a(Drawable var0) {
      return var0.isAutoMirrored();
   }

   public static Drawable b(Drawable var0) {
      Object var1 = var0;
      if (!(var0 instanceof w)) {
         var1 = new s(var0);
      }

      return (Drawable)var1;
   }

   public static int c(Drawable var0) {
      return var0.getAlpha();
   }
}
