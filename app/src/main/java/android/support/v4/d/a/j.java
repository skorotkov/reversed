package android.support.v4.d.a;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;

@TargetApi(11)
class j {
   public static void a(Drawable var0) {
      var0.jumpToCurrentState();
   }

   public static Drawable b(Drawable var0) {
      Object var1 = var0;
      if (!(var0 instanceof w)) {
         var1 = new q(var0);
      }

      return (Drawable)var1;
   }
}
