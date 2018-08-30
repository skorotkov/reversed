package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class fu {
   int[] a;
   List b;

   private void c(int var1, int var2) {
      if (this.b != null) {
         for(int var3 = this.b.size() - 1; var3 >= 0; --var3) {
            fv var4 = (fv)this.b.get(var3);
            if (var4.a >= var1) {
               if (var4.a < var1 + var2) {
                  this.b.remove(var3);
               } else {
                  var4.a -= var2;
               }
            }
         }
      }

   }

   private void d(int var1, int var2) {
      if (this.b != null) {
         for(int var3 = this.b.size() - 1; var3 >= 0; --var3) {
            fv var4 = (fv)this.b.get(var3);
            if (var4.a >= var1) {
               var4.a += var2;
            }
         }
      }

   }

   private int g(int var1) {
      if (this.b == null) {
         var1 = -1;
      } else {
         fv var2 = this.f(var1);
         if (var2 != null) {
            this.b.remove(var2);
         }

         int var3 = this.b.size();
         int var4 = 0;

         while(true) {
            if (var4 >= var3) {
               var4 = -1;
               break;
            }

            if (((fv)this.b.get(var4)).a >= var1) {
               break;
            }

            ++var4;
         }

         if (var4 != -1) {
            var2 = (fv)this.b.get(var4);
            this.b.remove(var4);
            var1 = var2.a;
         } else {
            var1 = -1;
         }
      }

      return var1;
   }

   int a(int var1) {
      if (this.b != null) {
         for(int var2 = this.b.size() - 1; var2 >= 0; --var2) {
            if (((fv)this.b.get(var2)).a >= var1) {
               this.b.remove(var2);
            }
         }
      }

      return this.b(var1);
   }

   public fv a(int var1, int var2, int var3, boolean var4) {
      fv var5;
      if (this.b == null) {
         var5 = null;
      } else {
         int var6 = this.b.size();
         int var7 = 0;

         while(true) {
            if (var7 >= var6) {
               var5 = null;
               break;
            }

            fv var8 = (fv)this.b.get(var7);
            if (var8.a >= var2) {
               var5 = null;
               break;
            }

            if (var8.a >= var1) {
               var5 = var8;
               if (var3 == 0) {
                  break;
               }

               var5 = var8;
               if (var8.b == var3) {
                  break;
               }

               if (var4) {
                  var5 = var8;
                  if (var8.d) {
                     break;
                  }
               }
            }

            ++var7;
         }
      }

      return var5;
   }

   void a() {
      if (this.a != null) {
         Arrays.fill(this.a, -1);
      }

      this.b = null;
   }

   void a(int var1, int var2) {
      if (this.a != null && var1 < this.a.length) {
         this.e(var1 + var2);
         System.arraycopy(this.a, var1 + var2, this.a, var1, this.a.length - var1 - var2);
         Arrays.fill(this.a, this.a.length - var2, this.a.length, -1);
         this.c(var1, var2);
      }

   }

   void a(int var1, fz var2) {
      this.e(var1);
      this.a[var1] = var2.e;
   }

   public void a(fv var1) {
      if (this.b == null) {
         this.b = new ArrayList();
      }

      int var2 = this.b.size();
      int var3 = 0;

      while(true) {
         if (var3 >= var2) {
            this.b.add(var1);
            break;
         }

         fv var4 = (fv)this.b.get(var3);
         if (var4.a == var1.a) {
            this.b.remove(var3);
         }

         if (var4.a >= var1.a) {
            this.b.add(var3, var1);
            break;
         }

         ++var3;
      }

   }

   int b(int var1) {
      int var2 = -1;
      if (this.a != null && var1 < this.a.length) {
         var2 = this.g(var1);
         if (var2 == -1) {
            Arrays.fill(this.a, var1, this.a.length, -1);
            var2 = this.a.length;
         } else {
            Arrays.fill(this.a, var1, var2 + 1, -1);
            ++var2;
         }
      }

      return var2;
   }

   void b(int var1, int var2) {
      if (this.a != null && var1 < this.a.length) {
         this.e(var1 + var2);
         System.arraycopy(this.a, var1, this.a, var1 + var2, this.a.length - var1 - var2);
         Arrays.fill(this.a, var1, var1 + var2, -1);
         this.d(var1, var2);
      }

   }

   int c(int var1) {
      if (this.a != null && var1 < this.a.length) {
         var1 = this.a[var1];
      } else {
         var1 = -1;
      }

      return var1;
   }

   int d(int var1) {
      int var2;
      for(var2 = this.a.length; var2 <= var1; var2 *= 2) {
      }

      return var2;
   }

   void e(int var1) {
      if (this.a == null) {
         this.a = new int[Math.max(var1, 10) + 1];
         Arrays.fill(this.a, -1);
      } else if (var1 >= this.a.length) {
         int[] var2 = this.a;
         this.a = new int[this.d(var1)];
         System.arraycopy(var2, 0, this.a, 0, var2.length);
         Arrays.fill(this.a, var2.length, this.a.length, -1);
      }

   }

   public fv f(int var1) {
      fv var2;
      if (this.b == null) {
         var2 = null;
      } else {
         int var3 = this.b.size() - 1;

         while(true) {
            if (var3 < 0) {
               var2 = null;
               break;
            }

            fv var4 = (fv)this.b.get(var3);
            var2 = var4;
            if (var4.a == var1) {
               break;
            }

            --var3;
         }
      }

      return var2;
   }
}
