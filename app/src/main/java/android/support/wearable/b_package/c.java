package android.support.wearable.b_package;

import android.os.Build.VERSION;
import com.google.android.wearable.WearableSharedLib;

final class c {
   static final int a;

   static {
      a = a(VERSION.SDK_INT);
   }

   static int a(int var0) {
      if (var0 < 25) {
         var0 = 0;
      } else {
         var0 = WearableSharedLib.version();
      }

      return var0;
   }
}
