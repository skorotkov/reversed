package android.support.v4.widget;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.ListView;

@TargetApi(9)
class r {
   static void a(ListView var0, int var1) {
      int var2 = var0.getFirstVisiblePosition();
      if (var2 != -1) {
         View var3 = var0.getChildAt(0);
         if (var3 != null) {
            var0.setSelectionFromTop(var2, var3.getTop() - var1);
         }
      }

   }
}
