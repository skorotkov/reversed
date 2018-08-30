package android.support.wearable.b;

import android.os.Build.VERSION;

final class b {
   static final boolean a;

   static {
      a = a(VERSION.SDK_INT);
   }

   static boolean a(int var0) {
      boolean var1 = true;
      if (var0 > 21) {
         try {
            Class.forName("com.google.android.wearable.compat.WearableActivityController");
         } catch (ClassNotFoundException var3) {
            var1 = false;
         }
      }

      return var1;
   }
}
