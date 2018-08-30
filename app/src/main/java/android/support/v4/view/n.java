package android.support.v4.view;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.view.View.AccessibilityDelegate;

@TargetApi(16)
class n {
   public static Object a(p var0) {
      return new o(var0);
   }

   public static Object a(Object var0, View var1) {
      return ((AccessibilityDelegate)var0).getAccessibilityNodeProvider(var1);
   }

   public static boolean a(Object var0, View var1, int var2, Bundle var3) {
      return ((AccessibilityDelegate)var0).performAccessibilityAction(var1, var2, var3);
   }
}
