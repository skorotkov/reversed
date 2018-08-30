package android.support.v7.widget;

import java.util.Comparator;

final class ce implements Comparator {
   public int a(cg var1, cg var2) {
      byte var3 = -1;
      byte var4 = 1;
      boolean var5;
      if (var1.d == null) {
         var5 = true;
      } else {
         var5 = false;
      }

      boolean var6;
      if (var2.d == null) {
         var6 = true;
      } else {
         var6 = false;
      }

      int var7;
      if (var5 != var6) {
         if (var1.d == null) {
            var7 = var4;
         } else {
            var7 = -1;
         }
      } else if (var1.a != var2.a) {
         if (var1.a) {
            var7 = var3;
         } else {
            var7 = 1;
         }
      } else {
         int var8 = var2.b - var1.b;
         var7 = var8;
         if (var8 == 0) {
            var8 = var1.c - var2.c;
            var7 = var8;
            if (var8 == 0) {
               var7 = 0;
            }
         }
      }

      return var7;
   }

   // $FF: synthetic method
   public int compare(Object var1, Object var2) {
      return this.a((cg)var1, (cg)var2);
   }
}
