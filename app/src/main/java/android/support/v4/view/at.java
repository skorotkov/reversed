package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class at {
   static final au a;

   static {
      if (VERSION.SDK_INT >= 17) {
         a = new aw();
      } else {
         a = new av();
      }

   }

   public static int a(MarginLayoutParams var0) {
      return a.a(var0);
   }

   public static void a(MarginLayoutParams var0, int var1) {
      a.a(var0, var1);
   }

   public static int b(MarginLayoutParams var0) {
      return a.b(var0);
   }

   public static void b(MarginLayoutParams var0, int var1) {
      a.b(var0, var1);
   }

   public static void c(MarginLayoutParams var0, int var1) {
      a.c(var0, var1);
   }
}
