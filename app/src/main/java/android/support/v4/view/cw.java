package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewConfiguration;

public final class cw {
   static final da a;

   static {
      if (VERSION.SDK_INT >= 14) {
         a = new cz();
      } else if (VERSION.SDK_INT >= 11) {
         a = new cy();
      } else {
         a = new cx();
      }

   }

   @Deprecated
   public static int a(ViewConfiguration var0) {
      return var0.getScaledPagingTouchSlop();
   }

   public static boolean b(ViewConfiguration var0) {
      return a.a(var0);
   }
}
