package android.support.v4.g;

public class h implements Cloneable {
   private static final Object a = new Object();
   private boolean b;
   private long[] c;
   private Object[] d;
   private int e;

   public h() {
      this(10);
   }

   public h(int var1) {
      this.b = false;
      if (var1 == 0) {
         this.c = android.support.v4.g.e.b;
         this.d = android.support.v4.g.e.c;
      } else {
         var1 = android.support.v4.g.e.b(var1);
         this.c = new long[var1];
         this.d = new Object[var1];
      }

      this.e = 0;
   }

   private void d() {
      int var1 = this.e;
      long[] var2 = this.c;
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

   public h a() {
      h var1;
      try {
         var1 = (h)super.clone();
      } catch (CloneNotSupportedException var4) {
         var1 = null;
         return var1;
      }

      try {
         var1.c = (long[])this.c.clone();
         var1.d = (Object[])this.d.clone();
      } catch (CloneNotSupportedException var3) {
      }

      return var1;
   }

   public Object a(long var1) {
      return this.a(var1, (Object)null);
   }

   public Object a(long var1, Object var3) {
      int var4 = android.support.v4.g.e.a(this.c, this.e, var1);
      Object var5 = var3;
      if (var4 >= 0) {
         if (this.d[var4] == a) {
            var5 = var3;
         } else {
            var5 = this.d[var4];
         }
      }

      return var5;
   }

   public void a(int var1) {
      if (this.d[var1] != a) {
         this.d[var1] = a;
         this.b = true;
      }

   }

   public int b() {
      if (this.b) {
         this.d();
      }

      return this.e;
   }

   public long b(int var1) {
      if (this.b) {
         this.d();
      }

      return this.c[var1];
   }

   public void b(long var1) {
      int var3 = android.support.v4.g.e.a(this.c, this.e, var1);
      if (var3 >= 0 && this.d[var3] != a) {
         this.d[var3] = a;
         this.b = true;
      }

   }

   public void b(long var1, Object var3) {
      int var4 = android.support.v4.g.e.a(this.c, this.e, var1);
      if (var4 >= 0) {
         this.d[var4] = var3;
      } else {
         int var5 = ~var4;
         if (var5 < this.e && this.d[var5] == a) {
            this.c[var5] = var1;
            this.d[var5] = var3;
         } else {
            var4 = var5;
            if (this.b) {
               var4 = var5;
               if (this.e >= this.c.length) {
                  this.d();
                  var4 = ~android.support.v4.g.e.a(this.c, this.e, var1);
               }
            }

            if (this.e >= this.c.length) {
               var5 = android.support.v4.g.e.b(this.e + 1);
               long[] var6 = new long[var5];
               Object[] var7 = new Object[var5];
               System.arraycopy(this.c, 0, var6, 0, this.c.length);
               System.arraycopy(this.d, 0, var7, 0, this.d.length);
               this.c = var6;
               this.d = var7;
            }

            if (this.e - var4 != 0) {
               System.arraycopy(this.c, var4, this.c, var4 + 1, this.e - var4);
               System.arraycopy(this.d, var4, this.d, var4 + 1, this.e - var4);
            }

            this.c[var4] = var1;
            this.d[var4] = var3;
            ++this.e;
         }
      }

   }

   public Object c(int var1) {
      if (this.b) {
         this.d();
      }

      return this.d[var1];
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

   // $FF: synthetic method
   public Object clone() {
      return this.a();
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

            var4.append(this.b(var2));
            var4.append('=');
            Object var3 = this.c(var2);
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
