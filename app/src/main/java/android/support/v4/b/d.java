package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Activity;

@TargetApi(23)
class d {
   public static void a(Activity var0, String[] var1, int var2) {
      if (var0 instanceof e) {
         ((e)var0).a(var2);
      }

      var0.requestPermissions(var1, var2);
   }

   public static boolean a(Activity var0, String var1) {
      return var0.shouldShowRequestPermissionRationale(var1);
   }
}
