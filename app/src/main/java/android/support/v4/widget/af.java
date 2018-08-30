package android.support.v4.widget;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.PopupWindow;

@TargetApi(19)
class af {
   public static void a(PopupWindow var0, View var1, int var2, int var3, int var4) {
      var0.showAsDropDown(var1, var2, var3, var4);
   }
}
