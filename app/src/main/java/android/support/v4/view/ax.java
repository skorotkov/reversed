package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.ViewGroup.MarginLayoutParams;

@TargetApi(17)
class ax {
   public static int a(MarginLayoutParams var0) {
      return var0.getMarginStart();
   }

   public static void a(MarginLayoutParams var0, int var1) {
      var0.setMarginStart(var1);
   }

   public static int b(MarginLayoutParams var0) {
      return var0.getMarginEnd();
   }

   public static void b(MarginLayoutParams var0, int var1) {
      var0.setMarginEnd(var1);
   }

   public static void c(MarginLayoutParams var0, int var1) {
      var0.resolveLayoutDirection(var1);
   }
}
