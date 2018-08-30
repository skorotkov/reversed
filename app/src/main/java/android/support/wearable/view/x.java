package android.support.wearable.view;

import android.annotation.TargetApi;

@TargetApi(20)
class x {
   static float a(float var0, int var1, int var2) {
      float var3;
      if (var0 < (float)var1) {
         var3 = (float)var1;
      } else {
         var3 = var0;
         if (var0 > (float)var2) {
            var3 = (float)var2;
         }
      }

      return var3;
   }

   static int a(int var0, int var1, int var2) {
      if (var0 >= var1) {
         if (var0 > var2) {
            var1 = var2;
         } else {
            var1 = var0;
         }
      }

      return var1;
   }
}
