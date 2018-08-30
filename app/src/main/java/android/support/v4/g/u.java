package android.support.v4.g;

public class u implements Cloneable {
   private static final Object a = new Object();
   private boolean b;
   private int[] c;
   private Object[] d;
   private int e;

   public u() {
      this(10);
   }

   public u(int var1) {
      this.b = false;
      if (var1 == 0) {
         this.c = android.support.v4.g.e.a;
         this.d = android.support.v4.g.e.c;
      } else {
         var1 = android.support.v4.g.e.a(var1);
         this.c = new int[var1];
         this.d = new Object[var1];
      }

      this.e = 0;
   }

   private void d() {
      int var1 = this.e;
      int[] var2 = this.c;
      Object[] var3 = this.d;
      int var4 = 0;

      int var5;
      int var7;
      for(var5 = 0; var4 < var1; var5 = var7) {
         Object var6 = var3[var4];
         var7 = var5;
         if (var6 != a) {
            if (var4 != var5) {
               var2[var5] = var2[var4];
               var3[var5] = var6;
               var3[var4] = null;
            }

            var7 = var5 + 1;
         }

         ++var4;
      }

      this.b = false;
      this.e = var5;
   }

   public u a() {
      u var1;
      try {
         var1 = (u)super.clone();
      } catch (CloneNotSupportedException var4) {
         var1 = null;
         return var1;
      }

      try {
         var1.c = (int[])this.c.clone();
         var1.d = (Object[])this.d.clone();
      } catch (CloneNotSupportedException var3) {
      }

      return var1;
   }

   public Object a(int var1) {
      return this.a(var1, (Object)null);
   }

   public Object a(int var1, Object var2) {
      var1 = android.support.v4.g.e.a(this.c, this.e, var1);
      Object var3 = var2;
      if (var1 >= 0) {
         if (this.d[var1] == a) {
            var3 = var2;
         } else {
            var3 = this.d[var1];
         }
      }

      return var3;
   }

   public int b() {
      if (this.b) {
         this.d();
      }

      return this.e;
   }

   public void b(int var1) {
      var1 = android.support.v4.g.e.a(this.c, this.e, var1);
      if (var1 >= 0 && this.d[var1] != a) {
         this.d[var1] = a;
         this.b = true;
      }

   }

   public void b(int var1, Object var2) {
      int var3 = android.support.v4.g.e.a(this.c, this.e, var1);
      if (var3 >= 0) {
         this.d[var3] = var2;
      } else {
         int var4 = ~var3;
         if (var4 < this.e && this.d[var4] == a) {
            this.c[var4] = var1;
            this.d[var4] = var2;
         } else {
            var3 = var4;
            if (this.b) {
               var3 = var4;
               if (this.e >= this.c.length) {
                  this.d();
                  var3 = ~android.support.v4.g.e.a(this.c, this.e, var1);
               }
            }

            if (this.e >= this.c.length) {
               var4 = android.support.v4.g.e.a(this.e + 1);
               int[] var5 = new int[var4];
               Object[] var6 = new Object[var4];
               System.arraycopy(this.c, 0, var5, 0, this.c.length);
               System.arraycopy(this.d, 0, var6, 0, this.d.length);
               this.c = var5;
               this.d = var6;
            }

            if (this.e - var3 != 0) {
               System.arraycopy(this.c, var3, this.c, var3 + 1, this.e - var3);
               System.arraycopy(this.d, var3, this.d, var3 + 1, this.e - var3);
            }

            this.c[var3] = var1;
            this.d[var3] = var2;
            ++this.e;
         }
      }

   }

   public void c() {
      int var1 = this.e;
      Object[] var2 = this.d;

      for(int var3 = 0; var3 < var1; ++var3) {
         var2[var3] = null;
      }

      this.e = 0;
      this.b = false;
   }

   public void c(int var1) {
      this.b(var1);
   }

   public void c(int var1, Object var2) {
      if (this.e != 0 && var1 <= this.c[this.e - 1]) {
         this.b(var1, var2);
      } else {
         if (this.b && this.e >= this.c.length) {
            this.d();
         }

         int var3 = this.e;
         if (var3 >= this.c.length) {
            int var4 = android.support.v4.g.e.a(var3 + 1);
            int[] var5 = new int[var4];
            Object[] var6 = new Object[var4];
            System.arraycopy(this.c, 0, var5, 0, this.c.length);
            System.arraycopy(this.d, 0, var6, 0, this.d.length);
            this.c = var5;
            this.d = var6;
         }

         this.c[var3] = var1;
         this.d[var3] = var2;
         this.e = var3 + 1;
      }

   }

   // $FF: synthetic method
   public Object clone() {
      return this.a();
   }

   public int d(int var1) {
      if (this.b) {
         this.d();
      }

      return this.c[var1];
   }

   public Object e(int var1) {
      if (this.b) {
         this.d();
      }

      return this.d[var1];
   }

   public int f(int var1) {
      if (this.b) {
         this.d();
      }

      return android.support.v4.g.e.a(this.c, this.e, var1);
   }

   public String toString() {
      String var1;
      if (this.b() <= 0) {
         var1 = "{}";
      } else {
         StringBuilder var4 = new StringBuilder(this.e * 28);
         var4.append('{');

         for(int var2 = 0; var2 < this.e; ++var2) {
            if (var2 > 0) {
               var4.append(", ");
            }

            var4.append(this.d(var2));
            var4.append('=');
            Object var3 = this.e(var2);
            if (var3 != this) {
               var4.append(var3);
            } else {
               var4.append("(this Map)");
            }
         }

         var4.append('}');
         var1 = var4.toString();
      }

      return var1;
   }
}
