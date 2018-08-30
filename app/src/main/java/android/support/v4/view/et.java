package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.WindowInsets;

@TargetApi(20)
class et {
   public static int a(Object var0) {
      return ((WindowInsets)var0).getSystemWindowInsetBottom();
   }

   public static Object a(Object var0, int var1, int var2, int var3, int var4) {
      return ((WindowInsets)var0).replaceSystemWindowInsets(var1, var2, var3, var4);
   }

   public static int b(Object var0) {
      return ((WindowInsets)var0).getSystemWindowInsetLeft();
   }

   public static int c(Object var0) {
      return ((WindowInsets)var0).getSystemWindowInsetRight();
   }

   public static int d(Object var0) {
      return ((WindowInsets)var0).getSystemWindowInsetTop();
   }
}
