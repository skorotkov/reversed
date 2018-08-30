package android.support.v4.widget;

import android.annotation.TargetApi;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

@TargetApi(21)
class ad {
   private static Field a;

   static {
      try {
         a = PopupWindow.class.getDeclaredField("mOverlapAnchor");
         a.setAccessible(true);
      } catch (NoSuchFieldException var1) {
         Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", var1);
      }

   }

   static void a(PopupWindow var0, boolean var1) {
      if (a != null) {
         try {
            a.set(var0, var1);
         } catch (IllegalAccessException var2) {
            Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", var2);
         }
      }

   }
}
