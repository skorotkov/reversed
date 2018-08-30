package android.support.v4.view.a;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityEvent;

@TargetApi(19)
class g {
   public static int a(AccessibilityEvent var0) {
      return var0.getContentChangeTypes();
   }

   public static void a(AccessibilityEvent var0, int var1) {
      var0.setContentChangeTypes(var1);
   }
}
