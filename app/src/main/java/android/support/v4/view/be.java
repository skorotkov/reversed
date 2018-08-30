package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.MenuItem;
import android.view.View;

@TargetApi(11)
class be {
   public static MenuItem a(MenuItem var0, View var1) {
      return var0.setActionView(var1);
   }

   public static void a(MenuItem var0, int var1) {
      var0.setShowAsAction(var1);
   }

   public static MenuItem b(MenuItem var0, int var1) {
      return var0.setActionView(var1);
   }
}
