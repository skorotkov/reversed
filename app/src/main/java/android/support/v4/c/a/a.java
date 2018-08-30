package android.support.v4.c.a;

import android.content.res.Resources;
import android.os.Build.VERSION;

public final class a {
   private static final b a;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 17) {
         a = new e();
      } else if (var0 >= 13) {
         a = new d();
      } else {
         a = new c();
      }

   }

   public static int a(Resources var0) {
      return a.a(var0);
   }

   public static int b(Resources var0) {
      return a.b(var0);
   }

   public static int c(Resources var0) {
      return a.c(var0);
   }
}
