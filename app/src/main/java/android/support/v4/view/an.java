package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.LayoutInflater;

@TargetApi(9)
class an {
   static void a(LayoutInflater var0, as var1) {
      ao var2;
      if (var1 != null) {
         var2 = new ao(var1);
      } else {
         var2 = null;
      }

      var0.setFactory(var2);
   }
}
