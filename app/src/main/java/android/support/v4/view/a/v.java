package android.support.v4.view.a;

import android.annotation.TargetApi;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

@TargetApi(21)
class v {
   public static Object a(int var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      return CollectionItemInfo.obtain(var0, var1, var2, var3, var4, var5);
   }

   public static Object a(int var0, int var1, boolean var2, int var3) {
      return CollectionInfo.obtain(var0, var1, var2, var3);
   }
}
