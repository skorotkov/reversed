package android.support.v7.b.a;

import java.lang.reflect.Array;

final class d {
   // $FF: synthetic field
   static final boolean a;

   static {
      boolean var0;
      if (!d.class.desiredAssertionStatus()) {
         var0 = true;
      } else {
         var0 = false;
      }

      a = var0;
   }

   private d() {
   }

   public static int a(int var0) {
      if (var0 <= 4) {
         var0 = 8;
      } else {
         var0 *= 2;
      }

      return var0;
   }

   public static int[] a(int[] var0, int var1, int var2) {
      if (!a && var1 > var0.length) {
         throw new AssertionError();
      } else {
         int[] var3 = var0;
         if (var1 + 1 > var0.length) {
            var3 = new int[a(var1)];
            System.arraycopy(var0, 0, var3, 0, var1);
         }

         var3[var1] = var2;
         return var3;
      }
   }

   public static Object[] a(Object[] var0, int var1, Object var2) {
      if (!a && var1 > var0.length) {
         throw new AssertionError();
      } else {
         if (var1 + 1 > var0.length) {
            Object[] var3 = (Object[])Array.newInstance(var0.getClass().getComponentType(), a(var1));
            System.arraycopy(var0, 0, var3, 0, var1);
            var0 = var3;
         }

         var0[var1] = var2;
         return var0;
      }
   }
}
