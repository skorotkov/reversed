package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class ad {
   static final ag a;

   static {
      if (VERSION.SDK_INT >= 11) {
         a = new af();
      } else {
         a = new ae();
      }

   }

   public static boolean a(KeyEvent var0) {
      return a.b(var0.getMetaState());
   }

   public static boolean a(KeyEvent var0, int var1) {
      return a.a(var0.getMetaState(), var1);
   }
}
