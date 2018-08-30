package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class ai {
   static final aj a;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 21) {
         a = new am();
      } else if (var0 >= 11) {
         a = new al();
      } else {
         a = new ak();
      }

   }

   public static void a(LayoutInflater var0, as var1) {
      a.a(var0, var1);
   }
}
