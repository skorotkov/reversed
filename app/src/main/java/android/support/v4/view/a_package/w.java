package android.support.v4.view.a_package;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

@TargetApi(14)
class w {
   public static int a(Object var0) {
      return ((AccessibilityNodeInfo)var0).getActions();
   }

   public static void a(Object var0, int var1) {
      ((AccessibilityNodeInfo)var0).addAction(var1);
   }

   public static void a(Object var0, Rect var1) {
      ((AccessibilityNodeInfo)var0).getBoundsInParent(var1);
   }

   public static void a(Object var0, CharSequence var1) {
      ((AccessibilityNodeInfo)var0).setClassName(var1);
   }

   public static void a(Object var0, boolean var1) {
      ((AccessibilityNodeInfo)var0).setScrollable(var1);
   }

   public static CharSequence b(Object var0) {
      return ((AccessibilityNodeInfo)var0).getClassName();
   }

   public static void b(Object var0, Rect var1) {
      ((AccessibilityNodeInfo)var0).getBoundsInScreen(var1);
   }

   public static CharSequence c(Object var0) {
      return ((AccessibilityNodeInfo)var0).getContentDescription();
   }

   public static CharSequence d(Object var0) {
      return ((AccessibilityNodeInfo)var0).getPackageName();
   }

   public static CharSequence e(Object var0) {
      return ((AccessibilityNodeInfo)var0).getText();
   }

   public static boolean f(Object var0) {
      return ((AccessibilityNodeInfo)var0).isCheckable();
   }

   public static boolean g(Object var0) {
      return ((AccessibilityNodeInfo)var0).isChecked();
   }

   public static boolean h(Object var0) {
      return ((AccessibilityNodeInfo)var0).isClickable();
   }

   public static boolean i(Object var0) {
      return ((AccessibilityNodeInfo)var0).isEnabled();
   }

   public static boolean j(Object var0) {
      return ((AccessibilityNodeInfo)var0).isFocusable();
   }

   public static boolean k(Object var0) {
      return ((AccessibilityNodeInfo)var0).isFocused();
   }

   public static boolean l(Object var0) {
      return ((AccessibilityNodeInfo)var0).isLongClickable();
   }

   public static boolean m(Object var0) {
      return ((AccessibilityNodeInfo)var0).isPassword();
   }

   public static boolean n(Object var0) {
      return ((AccessibilityNodeInfo)var0).isScrollable();
   }

   public static boolean o(Object var0) {
      return ((AccessibilityNodeInfo)var0).isSelected();
   }
}
