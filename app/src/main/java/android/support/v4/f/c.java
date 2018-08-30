package android.support.v4.f;

import android.os.Build.VERSION;

public class c {
   public static boolean a() {
      boolean var0;
      if (VERSION.SDK_INT >= 24) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }
}
