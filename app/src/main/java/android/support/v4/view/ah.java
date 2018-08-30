package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.KeyEvent;

@TargetApi(11)
class ah {
   public static int a(int var0) {
      return KeyEvent.normalizeMetaState(var0);
   }

   public static boolean a(int var0, int var1) {
      return KeyEvent.metaStateHasModifiers(var0, var1);
   }

   public static boolean b(int var0) {
      return KeyEvent.metaStateHasNoModifiers(var0);
   }
}
