package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

public final class dr {
   static final dt a;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 21) {
         a = new dv();
      } else if (var0 >= 19) {
         a = new du();
      } else if (var0 >= 14) {
         a = new ds();
      } else {
         a = new dw();
      }

   }

   public static void a(ViewParent var0, View var1) {
      a.a(var0, var1);
   }

   public static void a(ViewParent var0, View var1, int var2, int var3, int var4, int var5) {
      a.a(var0, var1, var2, var3, var4, var5);
   }

   public static void a(ViewParent var0, View var1, int var2, int var3, int[] var4) {
      a.a(var0, var1, var2, var3, var4);
   }

   public static boolean a(ViewParent var0, View var1, float var2, float var3) {
      return a.a(var0, var1, var2, var3);
   }

   public static boolean a(ViewParent var0, View var1, float var2, float var3, boolean var4) {
      return a.a(var0, var1, var2, var3, var4);
   }

   public static boolean a(ViewParent var0, View var1, View var2, int var3) {
      return a.a(var0, var1, var2, var3);
   }

   public static void b(ViewParent var0, View var1, View var2, int var3) {
      a.b(var0, var1, var2, var3);
   }
}
