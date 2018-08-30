package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.ListView;

public final class q {
   public static void a(ListView var0, int var1) {
      if (VERSION.SDK_INT >= 19) {
         s.a(var0, var1);
      } else {
         r.a(var0, var1);
      }

   }
}
