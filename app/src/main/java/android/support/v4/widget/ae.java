package android.support.v4.widget;

import android.annotation.TargetApi;
import android.widget.PopupWindow;

@TargetApi(23)
class ae {
   static void a(PopupWindow var0, int var1) {
      var0.setWindowLayoutType(var1);
   }

   static void a(PopupWindow var0, boolean var1) {
      var0.setOverlapAnchor(var1);
   }
}
