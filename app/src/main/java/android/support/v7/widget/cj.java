package android.support.v7.widget;

import android.util.SparseIntArray;

public abstract class cj {
   final SparseIntArray a = new SparseIntArray();
   private boolean b = false;

   public abstract int a(int var1);

   public int a(int var1, int var2) {
      byte var3 = 0;
      int var4 = this.a(var1);
      if (var4 == var2) {
         var1 = var3;
      } else {
         int var5;
         int var6;
         label28: {
            if (this.b && this.a.size() > 0) {
               var5 = this.b(var1);
               if (var5 >= 0) {
                  var6 = this.a.get(var5) + this.a(var5);
                  ++var5;
                  break label28;
               }
            }

            var5 = 0;
         }

         for(var6 = 0; var5 < var1; ++var5) {
            int var7 = this.a(var5);
            int var8 = var6 + var7;
            if (var8 == var2) {
               var6 = 0;
            } else {
               var6 = var7;
               if (var8 <= var2) {
                  var6 = var8;
               }
            }
         }

         var1 = var3;
         if (var6 + var4 <= var2) {
            var1 = var6;
         }
      }

      return var1;
   }

   public void a() {
      this.a.clear();
   }

   int b(int var1) {
      int var2 = 0;
      int var3 = this.a.size() - 1;

      while(var2 <= var3) {
         int var4 = var2 + var3 >>> 1;
         if (this.a.keyAt(var4) < var1) {
            var2 = var4 + 1;
         } else {
            var3 = var4 - 1;
         }
      }

      var1 = var2 - 1;
      if (var1 >= 0 && var1 < this.a.size()) {
         var1 = this.a.keyAt(var1);
      } else {
         var1 = -1;
      }

      return var1;
   }

   int b(int var1, int var2) {
      int var3;
      if (!this.b) {
         var3 = this.a(var1, var2);
      } else {
         int var4 = this.a.get(var1, -1);
         var3 = var4;
         if (var4 == -1) {
            var3 = this.a(var1, var2);
            this.a.put(var1, var3);
         }
      }

      return var3;
   }

   public int c(int var1, int var2) {
      int var3 = this.a(var1);
      int var4 = 0;
      int var5 = 0;

      int var6;
      int var7;
      for(var6 = 0; var4 < var1; var4 = var7) {
         var7 = this.a(var4);
         var6 += var7;
         if (var6 == var2) {
            var6 = var5 + 1;
            var5 = 0;
         } else if (var6 > var2) {
            var6 = var5 + 1;
            var5 = var7;
         } else {
            var7 = var6;
            var6 = var5;
            var5 = var7;
         }

         var7 = var4 + 1;
         var4 = var5;
         var5 = var6;
         var6 = var4;
      }

      var1 = var5;
      if (var6 + var3 > var2) {
         var1 = var5 + 1;
      }

      return var1;
   }
}
