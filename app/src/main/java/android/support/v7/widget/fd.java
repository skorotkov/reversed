package android.support.v7.widget;

import android.view.View;

class fd {
   static int a(ev var0, di var1, View var2, View var3, ec var4, boolean var5) {
      int var6;
      if (var4.y() != 0 && var0.e() != 0 && var2 != null && var3 != null) {
         if (!var5) {
            var6 = Math.abs(var4.d(var2) - var4.d(var3)) + 1;
         } else {
            var6 = var1.b(var3);
            int var7 = var1.a(var2);
            var6 = Math.min(var1.f(), var6 - var7);
         }
      } else {
         var6 = 0;
      }

      return var6;
   }

   static int a(ev var0, di var1, View var2, View var3, ec var4, boolean var5, boolean var6) {
      byte var7 = 0;
      int var8 = var7;
      if (var4.y() != 0) {
         var8 = var7;
         if (var0.e() != 0) {
            var8 = var7;
            if (var2 != null) {
               if (var3 == null) {
                  var8 = var7;
               } else {
                  int var11 = Math.min(var4.d(var2), var4.d(var3));
                  var8 = Math.max(var4.d(var2), var4.d(var3));
                  if (var6) {
                     var11 = Math.max(0, var0.e() - var8 - 1);
                  } else {
                     var11 = Math.max(0, var11);
                  }

                  var8 = var11;
                  if (var5) {
                     int var9 = Math.abs(var1.b(var3) - var1.a(var2));
                     var8 = Math.abs(var4.d(var2) - var4.d(var3));
                     float var10 = (float)var9 / (float)(var8 + 1);
                     var8 = Math.round((float)var11 * var10 + (float)(var1.c() - var1.a(var2)));
                  }
               }
            }
         }
      }

      return var8;
   }

   static int b(ev var0, di var1, View var2, View var3, ec var4, boolean var5) {
      int var6;
      if (var4.y() != 0 && var0.e() != 0 && var2 != null && var3 != null) {
         if (!var5) {
            var6 = var0.e();
         } else {
            int var7 = var1.b(var3);
            int var8 = var1.a(var2);
            var6 = Math.abs(var4.d(var2) - var4.d(var3));
            var6 = (int)((float)(var7 - var8) / (float)(var6 + 1) * (float)var0.e());
         }
      } else {
         var6 = 0;
      }

      return var6;
   }
}
