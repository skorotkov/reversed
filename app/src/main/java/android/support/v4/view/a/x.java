package android.support.v4.view.a;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityNodeInfo;

@TargetApi(18)
class x {
   public static String a(Object var0) {
      return ((AccessibilityNodeInfo)var0).getViewIdResourceName();
   }
}
