package android.support.v4.widget;

import android.annotation.TargetApi;
import android.widget.EdgeEffect;

@TargetApi(21)
class o {
   public static boolean a(Object var0, float var1, float var2) {
      ((EdgeEffect)var0).onPull(var1, var2);
      return true;
   }
}
