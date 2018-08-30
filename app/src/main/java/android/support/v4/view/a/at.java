package android.support.v4.view.a;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityRecord;

@TargetApi(15)
class at {
   public static void a(Object var0, int var1) {
      ((AccessibilityRecord)var0).setMaxScrollX(var1);
   }

   public static void b(Object var0, int var1) {
      ((AccessibilityRecord)var0).setMaxScrollY(var1);
   }
}
