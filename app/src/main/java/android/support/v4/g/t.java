package android.support.v4.g;

public class t {
   static Object[] b;
   static int c;
   static Object[] d;
   static int e;
   int[] f;
   Object[] g;
   int h;

   public t() {
      this.f = android.support.v4.g.e.a;
      this.g = android.support.v4.g.e.c;
      this.h = 0;
   }

   public t(int var1) {
      if (var1 == 0) {
         this.f = android.support.v4.g.e.a;
         this.g = android.support.v4.g.e.c;
      } else {
         this.e(var1);
      }

      this.h = 0;
   }

   private static void a(int[] param0, Object[] param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private void e(int param1) {
      // $FF: Couldn't be decompiled
   }

   int a() {
      int var1 = this.h;
      int var2;
      if (var1 == 0) {
         var2 = -1;
      } else {
         int var3 = android.support.v4.g.e.a(this.f, var1, 0);
         var2 = var3;
         if (var3 >= 0) {
            var2 = var3;
            if (this.g[var3 << 1] != null) {
               int var4;
               for(var4 = var3 + 1; var4 < var1 && this.f[var4] == 0; ++var4) {
                  if (this.g[var4 << 1] == null) {
                     var2 = var4;
                     return var2;
                  }
               }

               --var3;

               while(var3 >= 0 && this.f[var3] == 0) {
                  var2 = var3;
                  if (this.g[var3 << 1] == null) {
                     return var2;
                  }

                  --var3;
               }

               var2 = ~var4;
            }
         }
      }

      return var2;
   }

   public int a(Object var1) {
      int var2;
      if (var1 == null) {
         var2 = this.a();
      } else {
         var2 = this.a(var1, var1.hashCode());
      }

      return var2;
   }

   int a(Object var1, int var2) {
      int var3 = this.h;
      int var4;
      if (var3 == 0) {
         var4 = -1;
      } else {
         int var5 = android.support.v4.g.e.a(this.f, var3, var2);
         var4 = var5;
         if (var5 >= 0) {
            var4 = var5;
            if (!var1.equals(this.g[var5 << 1])) {
               int var6;
               for(var6 = var5 + 1; var6 < var3 && this.f[var6] == var2; ++var6) {
                  if (var1.equals(this.g[var6 << 1])) {
                     var4 = var6;
                     return var4;
                  }
               }

               --var5;

               while(var5 >= 0 && this.f[var5] == var2) {
                  var4 = var5;
                  if (var1.equals(this.g[var5 << 1])) {
                     return var4;
                  }

                  --var5;
               }

               var4 = ~var6;
            }
         }
      }

      return var4;
   }

   public Object a(int var1, Object var2) {
      var1 = (var1 << 1) + 1;
      Object var3 = this.g[var1];
      this.g[var1] = var2;
      return var3;
   }

   public void a(int var1) {
      if (this.f.length < var1) {
         int[] var2 = this.f;
         Object[] var3 = this.g;
         this.e(var1);
         if (this.h > 0) {
            System.arraycopy(var2, 0, this.f, 0, this.h);
            System.arraycopy(var3, 0, this.g, 0, this.h << 1);
         }

         a(var2, var3, this.h);
      }

   }

   public void a(t var1) {
      int var2 = 0;
      int var3 = var1.h;
      this.a(this.h + var3);
      if (this.h == 0) {
         if (var3 > 0) {
            System.arraycopy(var1.f, 0, this.f, 0, var3);
            System.arraycopy(var1.g, 0, this.g, 0, var3 << 1);
            this.h = var3;
         }
      } else {
         while(var2 < var3) {
            this.put(var1.b(var2), var1.c(var2));
            ++var2;
         }
      }

   }

   int b(Object var1) {
      int var2 = 1;
      byte var3 = 1;
      int var4 = this.h * 2;
      Object[] var5 = this.g;
      if (var1 == null) {
         for(var2 = var3; var2 < var4; var2 += 2) {
            if (var5[var2] == null) {
               var2 >>= 1;
               return var2;
            }
         }
      } else {
         while(var2 < var4) {
            if (var1.equals(var5[var2])) {
               var2 >>= 1;
               return var2;
            }

            var2 += 2;
         }
      }

      var2 = -1;
      return var2;
   }

   public Object b(int var1) {
      return this.g[var1 << 1];
   }

   public Object c(int var1) {
      return this.g[(var1 << 1) + 1];
   }

   public void clear() {
      if (this.h != 0) {
         a(this.f, this.g, this.h);
         this.f = android.support.v4.g.e.a;
         this.g = android.support.v4.g.e.c;
         this.h = 0;
      }

   }

   public boolean containsKey(Object var1) {
      boolean var2;
      if (this.a(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean containsValue(Object var1) {
      boolean var2;
      if (this.b(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public Object d(int var1) {
      int var2 = 8;
      Object var3 = this.g[(var1 << 1) + 1];
      if (this.h <= 1) {
         a(this.f, this.g, this.h);
         this.f = android.support.v4.g.e.a;
         this.g = android.support.v4.g.e.c;
         this.h = 0;
      } else if (this.f.length > 8 && this.h < this.f.length / 3) {
         if (this.h > 8) {
            var2 = this.h + (this.h >> 1);
         }

         int[] var4 = this.f;
         Object[] var5 = this.g;
         this.e(var2);
         --this.h;
         if (var1 > 0) {
            System.arraycopy(var4, 0, this.f, 0, var1);
            System.arraycopy(var5, 0, this.g, 0, var1 << 1);
         }

         if (var1 < this.h) {
            System.arraycopy(var4, var1 + 1, this.f, var1, this.h - var1);
            System.arraycopy(var5, var1 + 1 << 1, this.g, var1 << 1, this.h - var1 << 1);
         }
      } else {
         --this.h;
         if (var1 < this.h) {
            System.arraycopy(this.f, var1 + 1, this.f, var1, this.h - var1);
            System.arraycopy(this.g, var1 + 1 << 1, this.g, var1 << 1, this.h - var1 << 1);
         }

         this.g[this.h << 1] = null;
         this.g[(this.h << 1) + 1] = null;
      }

      return var3;
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public Object get(Object var1) {
      int var2 = this.a(var1);
      if (var2 >= 0) {
         var1 = this.g[(var2 << 1) + 1];
      } else {
         var1 = null;
      }

      return var1;
   }

   public int hashCode() {
      int[] var1 = this.f;
      Object[] var2 = this.g;
      int var3 = this.h;
      int var4 = 1;
      int var5 = 0;

      int var6;
      for(var6 = 0; var5 < var3; var4 += 2) {
         Object var7 = var2[var4];
         int var8 = var1[var5];
         int var9;
         if (var7 == null) {
            var9 = 0;
         } else {
            var9 = var7.hashCode();
         }

         var6 += var9 ^ var8;
         ++var5;
      }

      return var6;
   }

   public boolean isEmpty() {
      boolean var1;
      if (this.h <= 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public Object put(Object var1, Object var2) {
      byte var3 = 8;
      int var4;
      int var5;
      if (var1 == null) {
         var4 = this.a();
         var5 = 0;
      } else {
         var5 = var1.hashCode();
         var4 = this.a(var1, var5);
      }

      if (var4 >= 0) {
         var4 = (var4 << 1) + 1;
         var1 = this.g[var4];
         this.g[var4] = var2;
      } else {
         int var6 = ~var4;
         if (this.h >= this.f.length) {
            if (this.h >= 8) {
               var4 = this.h + (this.h >> 1);
            } else {
               var4 = var3;
               if (this.h < 4) {
                  var4 = 4;
               }
            }

            int[] var7 = this.f;
            Object[] var8 = this.g;
            this.e(var4);
            if (this.f.length > 0) {
               System.arraycopy(var7, 0, this.f, 0, var7.length);
               System.arraycopy(var8, 0, this.g, 0, var8.length);
            }

            a(var7, var8, this.h);
         }

         if (var6 < this.h) {
            System.arraycopy(this.f, var6, this.f, var6 + 1, this.h - var6);
            System.arraycopy(this.g, var6 << 1, this.g, var6 + 1 << 1, this.h - var6 << 1);
         }

         this.f[var6] = var5;
         this.g[var6 << 1] = var1;
         this.g[(var6 << 1) + 1] = var2;
         ++this.h;
         var1 = null;
      }

      return var1;
   }

   public Object remove(Object var1) {
      int var2 = this.a(var1);
      if (var2 >= 0) {
         var1 = this.d(var2);
      } else {
         var1 = null;
      }

      return var1;
   }

   public int size() {
      return this.h;
   }

   public String toString() {
      String var1;
      if (this.isEmpty()) {
         var1 = "{}";
      } else {
         StringBuilder var4 = new StringBuilder(this.h * 28);
         var4.append('{');

         for(int var2 = 0; var2 < this.h; ++var2) {
            if (var2 > 0) {
               var4.append(", ");
            }

            Object var3 = this.b(var2);
            if (var3 != this) {
               var4.append(var3);
            } else {
               var4.append("(this Map)");
            }

            var4.append('=');
            var3 = this.c(var2);
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
