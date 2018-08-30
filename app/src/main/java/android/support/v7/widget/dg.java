package android.support.v7.widget;

import java.util.List;

class dg {
   final dh a;

   public dg(dh var1) {
      this.a = var1;
   }

   private void a(List var1, int var2, int var3) {
      ag var4 = (ag)var1.get(var2);
      ag var5 = (ag)var1.get(var3);
      switch(var5.a) {
      case 1:
         this.c(var1, var2, var4, var3, var5);
         break;
      case 2:
         this.a(var1, var2, var4, var3, var5);
      case 3:
      default:
         break;
      case 4:
         this.b(var1, var2, var4, var3, var5);
      }

   }

   private int b(List var1) {
      boolean var2 = false;
      int var3 = var1.size() - 1;

      while(true) {
         if (var3 < 0) {
            var3 = -1;
            break;
         }

         if (((ag)var1.get(var3)).a == 8) {
            if (var2) {
               break;
            }
         } else {
            var2 = true;
         }

         --var3;
      }

      return var3;
   }

   private void c(List var1, int var2, ag var3, int var4, ag var5) {
      byte var6 = 0;
      if (var3.d < var5.b) {
         var6 = -1;
      }

      int var7 = var6;
      if (var3.b < var5.b) {
         var7 = var6 + 1;
      }

      if (var5.b <= var3.b) {
         var3.b += var5.d;
      }

      if (var5.b <= var3.d) {
         var3.d += var5.d;
      }

      var5.b += var7;
      var1.set(var2, var5);
      var1.set(var4, var3);
   }

   void a(List var1) {
      while(true) {
         int var2 = this.b(var1);
         if (var2 == -1) {
            return;
         }

         this.a(var1, var2, var2 + 1);
      }
   }

   void a(List var1, int var2, ag var3, int var4, ag var5) {
      boolean var6 = false;
      boolean var7;
      if (var3.b < var3.d) {
         if (var5.b == var3.b && var5.d == var3.d - var3.b) {
            var7 = true;
         } else {
            var7 = false;
         }
      } else if (var5.b == var3.d + 1 && var5.d == var3.b - var3.d) {
         var6 = true;
         var7 = true;
      } else {
         var7 = false;
         var6 = true;
      }

      if (var3.d < var5.b) {
         --var5.b;
      } else if (var3.d < var5.b + var5.d) {
         --var5.d;
         var3.a = 2;
         var3.d = 1;
         if (var5.d == 0) {
            var1.remove(var4);
            this.a.a(var5);
         }

         return;
      }

      ag var8;
      if (var3.b <= var5.b) {
         ++var5.b;
         var8 = null;
      } else if (var3.b < var5.b + var5.d) {
         int var9 = var5.b;
         int var10 = var5.d;
         int var11 = var3.b;
         var8 = this.a.a(2, var3.b + 1, var9 + var10 - var11, (Object)null);
         var5.d = var3.b - var5.b;
      } else {
         var8 = null;
      }

      if (var7) {
         var1.set(var2, var5);
         var1.remove(var4);
         this.a.a(var3);
      } else {
         if (var6) {
            if (var8 != null) {
               if (var3.b > var8.b) {
                  var3.b -= var8.d;
               }

               if (var3.d > var8.b) {
                  var3.d -= var8.d;
               }
            }

            if (var3.b > var5.b) {
               var3.b -= var5.d;
            }

            if (var3.d > var5.b) {
               var3.d -= var5.d;
            }
         } else {
            if (var8 != null) {
               if (var3.b >= var8.b) {
                  var3.b -= var8.d;
               }

               if (var3.d >= var8.b) {
                  var3.d -= var8.d;
               }
            }

            if (var3.b >= var5.b) {
               var3.b -= var5.d;
            }

            if (var3.d >= var5.b) {
               var3.d -= var5.d;
            }
         }

         var1.set(var2, var5);
         if (var3.b != var3.d) {
            var1.set(var4, var3);
         } else {
            var1.remove(var4);
         }

         if (var8 != null) {
            var1.add(var2, var8);
         }
      }

   }

   void b(List var1, int var2, ag var3, int var4, ag var5) {
      ag var6 = null;
      ag var7;
      if (var3.d < var5.b) {
         --var5.b;
         var7 = null;
      } else if (var3.d < var5.b + var5.d) {
         --var5.d;
         var7 = this.a.a(4, var3.b, 1, var5.c);
      } else {
         var7 = null;
      }

      if (var3.b <= var5.b) {
         ++var5.b;
      } else if (var3.b < var5.b + var5.d) {
         int var8 = var5.b + var5.d - var3.b;
         var6 = this.a.a(4, var3.b + 1, var8, var5.c);
         var5.d -= var8;
      }

      var1.set(var4, var3);
      if (var5.d > 0) {
         var1.set(var2, var5);
      } else {
         var1.remove(var2);
         this.a.a(var5);
      }

      if (var7 != null) {
         var1.add(var2, var7);
      }

      if (var6 != null) {
         var1.add(var2, var6);
      }

   }
}
