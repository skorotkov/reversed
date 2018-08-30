package fi.polar.polarflow.service.activity;

import java.util.ArrayList;
import java.util.List;

class ac {
   public static int a(List var0, long var1) {
      int var3 = -1;

      for(int var4 = 0; var4 < var0.size() && ((am)var0.get(var4)).b <= var1; var3 = var4++) {
      }

      return var3;
   }

   public static int a(List var0, long var1, long var3) {
      long var5 = Long.MAX_VALUE;
      int var7 = -1;

      int var13;
      for(int var8 = 0; var8 < var0.size(); var7 = var13) {
         long var9 = Math.abs(((am)var0.get(var8)).b - var1);
         long var11 = var5;
         var13 = var7;
         if (var9 < var5) {
            if (var9 <= var3) {
               var7 = var8;
            }

            var11 = var9;
            var13 = var7;
         }

         ++var8;
         var5 = var11;
      }

      return var7;
   }

   public static long a(List var0) {
      long var1;
      if (var0.isEmpty()) {
         var1 = 0L;
      } else {
         var1 = ((am)var0.get(0)).b;
      }

      return var1;
   }

   public static void a(List var0, int var1) {
      while(var0.size() > 0 && var1 > 0) {
         var0.remove(0);
         --var1;
      }

   }

   public static long b(List var0) {
      long var1;
      if (var0.isEmpty()) {
         var1 = 0L;
      } else {
         var1 = ((am)var0.get(var0.size() - 1)).b;
      }

      return var1;
   }

   public static am b(List var0, long var1) {
      int var3 = a(var0, var1);
      am var4;
      if (var3 >= 0) {
         var4 = (am)var0.get(var3);
      } else {
         var4 = null;
      }

      return var4;
   }

   public static am b(List var0, long var1, long var3) {
      int var5 = a(var0, var1, var3);
      am var6;
      if (var5 >= 0) {
         var6 = (am)var0.get(var5);
      } else {
         var6 = null;
      }

      return var6;
   }

   public static List c(List var0, long var1, long var3) {
      ArrayList var5 = new ArrayList();

      while(var0.size() > 0 && ((am)var0.get(0)).b + var3 < var1) {
         var5.add(var0.remove(0));
      }

      return var5;
   }
}
