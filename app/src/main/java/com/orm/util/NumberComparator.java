package com.orm.util;

import java.util.Comparator;

public class NumberComparator implements Comparator {
   private static char charAt(String var0, int var1) {
      char var2;
      if (var1 >= var0.length()) {
         byte var3 = 0;
         var2 = (char)var3;
      } else {
         char var4 = var0.charAt(var1);
         var2 = var4;
      }

      return var2;
   }

   private int compareRight(String var1, String var2) {
      int var3 = 0;
      int var4 = 0;
      byte var5 = 0;

      while(true) {
         char var6 = charAt(var1, var4);
         char var7 = charAt(var2, var3);
         if (!Character.isDigit(var6) && !Character.isDigit(var7)) {
            break;
         }

         if (!Character.isDigit(var6)) {
            var5 = -1;
            break;
         }

         if (!Character.isDigit(var7)) {
            var5 = 1;
            break;
         }

         byte var8;
         if (var6 < var7) {
            var8 = var5;
            if (var5 == 0) {
               var8 = -1;
            }
         } else if (var6 > var7) {
            var8 = var5;
            if (var5 == 0) {
               var8 = 1;
            }
         } else {
            var8 = var5;
            if (var6 == 0) {
               var8 = var5;
               if (var7 == 0) {
                  break;
               }
            }
         }

         ++var4;
         ++var3;
         var5 = var8;
      }

      return var5;
   }

   public int compare(Object var1, Object var2) {
      String var11 = var1.toString();
      String var12 = var2.toString();
      int var3 = 0;
      int var4 = 0;

      while(true) {
         char var5 = charAt(var11, var4);
         char var6 = charAt(var12, var3);
         byte var7 = 0;
         int var8 = var4;
         var4 = var7;

         char var9;
         for(var9 = var5; Character.isSpaceChar(var9) || var9 == '0'; var9 = var5) {
            if (var9 == '0') {
               ++var4;
            } else {
               var4 = 0;
            }

            ++var8;
            var5 = charAt(var11, var8);
         }

         int var13 = 0;
         char var10 = var6;

         int var14;
         for(var14 = var3; Character.isSpaceChar(var10) || var10 == '0'; var13 = var3) {
            if (var10 == '0') {
               var3 = var13 + 1;
            } else {
               var3 = 0;
            }

            ++var14;
            var5 = charAt(var12, var14);
            var10 = var5;
         }

         if (Character.isDigit(var9) && Character.isDigit(var10)) {
            var3 = this.compareRight(var11.substring(var8), var12.substring(var14));
            if (var3 != 0) {
               break;
            }
         }

         if (var9 == 0 && var10 == 0) {
            var3 = var4 - var13;
            break;
         }

         if (var9 < var10) {
            var3 = -1;
            break;
         }

         if (var9 > var10) {
            var3 = 1;
            break;
         }

         var4 = var8 + 1;
         var3 = var14 + 1;
      }

      return var3;
   }
}
