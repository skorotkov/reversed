package android.support.v4.view.a;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityRecord;

@TargetApi(14)
class as {
   public static void a(Object var0, int var1) {
      ((AccessibilityRecord)var0).setFromIndex(var1);
   }

   public static void a(Object var0, boolean var1) {
      ((AccessibilityRecord)var0).setScrollable(var1);
   }

   public static void b(Object var0, int var1) {
      ((AccessibilityRecord)var0).setItemCount(var1);
   }

   public static void c(Object var0, int var1) {
      ((AccessibilityRecord)var0).setScrollX(var1);
   }

   public static void d(Object var0, int var1) {
      ((AccessibilityRecord)var0).setScrollY(var1);
   }

   public static void e(Object var0, int var1) {
      ((AccessibilityRecord)var0).setToIndex(var1);
   }
}
