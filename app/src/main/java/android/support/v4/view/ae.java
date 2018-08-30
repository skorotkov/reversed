package android.support.v4.view;

class ae implements ag {
   private static int a(int var0, int var1, int var2, int var3, int var4) {
      boolean var5 = true;
      boolean var6;
      if ((var1 & var2) != 0) {
         var6 = true;
      } else {
         var6 = false;
      }

      var4 |= var3;
      boolean var7;
      if ((var1 & var4) != 0) {
         var7 = var5;
      } else {
         var7 = false;
      }

      if (var6) {
         if (var7) {
            throw new IllegalArgumentException("bad arguments");
         }

         var1 = var0 & ~var4;
      } else {
         var1 = var0;
         if (var7) {
            var1 = var0 & ~var2;
         }
      }

      return var1;
   }

   public int a(int var1) {
      if ((var1 & 192) != 0) {
         var1 |= 1;
      }

      int var2 = var1;
      if ((var1 & 48) != 0) {
         var2 = var1 | 2;
      }

      return var2 & 247;
   }

   public boolean a(int var1, int var2) {
      boolean var3 = true;
      if (a(a(this.a(var1) & 247, var2, 1, 64, 128), var2, 2, 16, 32) != var2) {
         var3 = false;
      }

      return var3;
   }

   public boolean b(int var1) {
      boolean var2;
      if ((this.a(var1) & 247) == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }
}
