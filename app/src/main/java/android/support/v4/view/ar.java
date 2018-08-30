package android.support.v4.view;

import android.annotation.TargetApi;
import android.view.LayoutInflater;

@TargetApi(21)
class ar {
   static void a(LayoutInflater var0, as var1) {
      aq var2;
      if (var1 != null) {
         var2 = new aq(var1);
      } else {
         var2 = null;
      }

      var0.setFactory2(var2);
   }
}
