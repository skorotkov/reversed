package android.support.v7.widget;

import java.util.Arrays;

class cf implements ed {
   int a;
   int b;
   int[] c;
   int d;

   void a() {
      if (this.c != null) {
         Arrays.fill(this.c, -1);
      }

   }

   void a(int var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   void a(dl var1, boolean var2) {
      this.d = 0;
      if (this.c != null) {
         Arrays.fill(this.c, -1);
      }

      ec var3 = var1.m;
      if (var1.l != null && var3 != null && var3.r()) {
         if (var2) {
            if (!var1.e.d()) {
               var3.a(var1.l.a(), (ed)this);
            }
         } else if (!var1.w()) {
            var3.a(this.a, this.b, var1.A, this);
         }

         if (this.d > var3.v) {
            var3.v = this.d;
            var3.w = var2;
            var1.d.b();
         }
      }

   }

   boolean a(int var1) {
      boolean var2 = false;
      boolean var3 = var2;
      if (this.c != null) {
         int var4 = this.d;
         int var5 = 0;

         while(true) {
            var3 = var2;
            if (var5 >= var4 * 2) {
               break;
            }

            if (this.c[var5] == var1) {
               var3 = true;
               break;
            }

            var5 += 2;
         }
      }

      return var3;
   }

   public void b(int var1, int var2) {
      if (var2 < 0) {
         throw new IllegalArgumentException("Pixel distance must be non-negative");
      } else {
         int var3 = this.d * 2;
         if (this.c == null) {
            this.c = new int[4];
            Arrays.fill(this.c, -1);
         } else if (var3 >= this.c.length) {
            int[] var4 = this.c;
            this.c = new int[var3 * 2];
            System.arraycopy(var4, 0, this.c, 0, var4.length);
         }

         this.c[var3] = var1;
         this.c[var3 + 1] = var2;
         ++this.d;
      }
   }
}
