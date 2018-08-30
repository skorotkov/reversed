package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public final class a {
   private static final f a;

   static {
      if (VERSION.SDK_INT >= 19) {
         a = new d();
      } else if (VERSION.SDK_INT >= 16) {
         a = new c();
      } else if (VERSION.SDK_INT >= 14) {
         a = new b();
      } else {
         a = new e();
      }

   }

   public static am a(AccessibilityEvent var0) {
      return new am(var0);
   }

   public static void a(AccessibilityEvent var0, int var1) {
      a.a(var0, var1);
   }

   public static int b(AccessibilityEvent var0) {
      return a.a(var0);
   }
}
