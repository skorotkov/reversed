package android.support.v4.view.a;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

@TargetApi(19)
class y {
   public static Object a(int var0, int var1, int var2, int var3, boolean var4) {
      return CollectionItemInfo.obtain(var0, var1, var2, var3, var4);
   }

   public static Object a(int var0, int var1, boolean var2, int var3) {
      return CollectionInfo.obtain(var0, var1, var2);
   }

   public static void a(Object var0, Object var1) {
      ((AccessibilityNodeInfo)var0).setCollectionInfo((CollectionInfo)var1);
   }

   public static void b(Object var0, Object var1) {
      ((AccessibilityNodeInfo)var0).setCollectionItemInfo((CollectionItemInfo)var1);
   }
}
