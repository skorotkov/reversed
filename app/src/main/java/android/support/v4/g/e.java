package android.support.v4.g;

class e {
   static final int[] a = new int[0];
   static final long[] b = new long[0];
   static final Object[] c = new Object[0];

   public static int a(int var0) {
      return c(var0 * 4) / 4;
   }

   static int a(int[] var0, int var1, int var2) {
      byte var3 = 0;
      int var4 = var1 - 1;
      var1 = var3;

      while(true) {
         if (var1 <= var4) {
            int var6 = var1 + var4 >>> 1;
            int var5 = var0[var6];
            if (var5 < var2) {
               var1 = var6 + 1;
               continue;
            }

            if (var5 > var2) {
               var4 = var6 - 1;
               continue;
            }

            var1 = var6;
            break;
         }

         var1 = ~var1;
         break;
      }

      return var1;
   }

   static int a(long[] var0, int var1, long var2) {
      byte var4 = 0;
      int var5 = var1 - 1;
      var1 = var4;

      while(true) {
         if (var1 <= var5) {
            int var8 = var1 + var5 >>> 1;
            long var6 = var0[var8];
            if (var6 < var2) {
               var1 = var8 + 1;
               continue;
            }

            if (var6 > var2) {
               var5 = var8 - 1;
               continue;
            }

            var1 = var8;
            break;
         }

         var1 = ~var1;
         break;
      }

      return var1;
   }

   public static boolean a(Object var0, Object var1) {
      boolean var2;
      if (var0 != var1 && (var0 == null || !var0.equals(var1))) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public static int b(int var0) {
      return c(var0 * 8) / 8;
   }

   public static int c(int var0) {
      int var1 = 4;

      int var2;
      while(true) {
         var2 = var0;
         if (var1 >= 32) {
            break;
         }

         if (var0 <= (1 << var1) - 12) {
            var2 = (1 << var1) - 12;
            break;
         }

         ++var1;
      }

      return var2;
   }
}
