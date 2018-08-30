package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.VelocityTracker;

public final class bu {
   static final bx a;

   static {
      if (VERSION.SDK_INT >= 11) {
         a = new bw();
      } else {
         a = new bv();
      }

   }

   public static float a(VelocityTracker var0, int var1) {
      return a.a(var0, var1);
   }

   public static float b(VelocityTracker var0, int var1) {
      return a.b(var0, var1);
   }
}
