package fi.polar.a.a;

public class e {
   public static void a(int var0, int[] var1) {
      if (var1 != null && var1.length == 1) {
         var1[0] = var0;
      } else {
         throw new IllegalArgumentException("error code array must have length of 1");
      }
   }
}
