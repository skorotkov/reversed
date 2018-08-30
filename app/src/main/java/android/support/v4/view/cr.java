package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.Display;
import android.view.View;

@TargetApi(17)
class cr {
   public static int a(View var0) {
      return var0.getLayoutDirection();
   }

   public static int b(View var0) {
      return var0.getWindowSystemUiVisibility();
   }

   public static Display c(View var0) {
      return var0.getDisplay();
   }
}
