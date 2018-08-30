package android.support.v7.widget;

class be {
   long a = 0L;
   be b;

   private void b() {
      if (this.b == null) {
         this.b = new be();
      }

   }

   void a() {
      this.a = 0L;
      if (this.b != null) {
         this.b.a();
      }

   }

   void a(int var1) {
      if (var1 >= 64) {
         this.b();
         this.b.a(var1 - 64);
      } else {
         this.a |= 1L << var1;
      }

   }

   void a(int var1, boolean var2) {
      if (var1 >= 64) {
         this.b();
         this.b.a(var1 - 64, var2);
      } else {
         boolean var3;
         if ((this.a & Long.MIN_VALUE) != 0L) {
            var3 = true;
         } else {
            var3 = false;
         }

         long var4 = (1L << var1) - 1L;
         long var6 = this.a;
         this.a = (~var4 & this.a) << 1 | var6 & var4;
         if (var2) {
            this.a(var1);
         } else {
            this.b(var1);
         }

         if (var3 || this.b != null) {
            this.b();
            this.b.a(0, var3);
         }
      }

   }

   void b(int var1) {
      if (var1 >= 64) {
         if (this.b != null) {
            this.b.b(var1 - 64);
         }
      } else {
         this.a &= ~(1L << var1);
      }

   }

   boolean c(int var1) {
      boolean var2;
      if (var1 >= 64) {
         this.b();
         var2 = this.b.c(var1 - 64);
      } else if ((this.a & 1L << var1) != 0L) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   boolean d(int var1) {
      boolean var2;
      if (var1 >= 64) {
         this.b();
         var2 = this.b.d(var1 - 64);
      } else {
         long var3 = 1L << var1;
         boolean var5;
         if ((this.a & var3) != 0L) {
            var5 = true;
         } else {
            var5 = false;
         }

         this.a &= ~var3;
         --var3;
         long var6 = this.a;
         this.a = Long.rotateRight(~var3 & this.a, 1) | var6 & var3;
         var2 = var5;
         if (this.b != null) {
            if (this.b.c(0)) {
               this.a(63);
            }

            this.b.d(0);
            var2 = var5;
         }
      }

      return var2;
   }

   int e(int var1) {
      if (this.b == null) {
         if (var1 >= 64) {
            var1 = Long.bitCount(this.a);
         } else {
            var1 = Long.bitCount(this.a & (1L << var1) - 1L);
         }
      } else if (var1 < 64) {
         var1 = Long.bitCount(this.a & (1L << var1) - 1L);
      } else {
         var1 = this.b.e(var1 - 64) + Long.bitCount(this.a);
      }

      return var1;
   }

   public String toString() {
      String var1;
      if (this.b == null) {
         var1 = Long.toBinaryString(this.a);
      } else {
         var1 = this.b.toString() + "xx" + Long.toBinaryString(this.a);
      }

      return var1;
   }
}
