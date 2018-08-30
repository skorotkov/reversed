package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

class ae implements dh {
   final ArrayList a;
   final ArrayList b;
   final af c;
   Runnable d;
   final boolean e;
   final dg f;
   private android.support.v4.g.r g;
   private int h;

   ae(af var1) {
      this(var1, false);
   }

   ae(af var1, boolean var2) {
      this.g = new android.support.v4.g.s(30);
      this.a = new ArrayList();
      this.b = new ArrayList();
      this.h = 0;
      this.c = var1;
      this.e = var2;
      this.f = new dg(this);
   }

   private void b(ag var1) {
      this.g(var1);
   }

   private void c(ag var1) {
      int var2 = var1.b;
      int var3 = var1.b + var1.d;
      byte var4 = -1;
      int var5 = var1.b;

      int var6;
      int var11;
      for(var6 = 0; var5 < var3; var5 = var11 + 1) {
         boolean var7;
         if (this.c.a(var5) == null && !this.d(var5)) {
            boolean var10;
            if (var4 == 1) {
               this.g(this.a(2, var2, var6, (Object)null));
               var10 = true;
            } else {
               var10 = false;
            }

            byte var8 = 0;
            var7 = var10;
            var4 = var8;
         } else {
            if (var4 == 0) {
               this.e(this.a(2, var2, var6, (Object)null));
               var7 = true;
            } else {
               var7 = false;
            }

            var4 = 1;
         }

         if (var7) {
            var11 = var5 - var6;
            var5 = var3 - var6;
            var3 = 1;
         } else {
            ++var6;
            var11 = var5;
            var5 = var3;
            var3 = var6;
         }

         var6 = var3;
         var3 = var5;
      }

      ag var9 = var1;
      if (var6 != var1.d) {
         this.a(var1);
         var9 = this.a(2, var2, var6, (Object)null);
      }

      if (var4 == 0) {
         this.e(var9);
      } else {
         this.g(var9);
      }

   }

   private int d(int var1, int var2) {
      ag var4;
      int var6;
      for(int var3 = this.b.size() - 1; var3 >= 0; var1 = var6) {
         var4 = (ag)this.b.get(var3);
         if (var4.a == 8) {
            int var5;
            if (var4.b < var4.d) {
               var5 = var4.b;
               var6 = var4.d;
            } else {
               var5 = var4.d;
               var6 = var4.b;
            }

            if (var1 >= var5 && var1 <= var6) {
               if (var5 == var4.b) {
                  if (var2 == 1) {
                     ++var4.d;
                  } else if (var2 == 2) {
                     --var4.d;
                  }

                  ++var1;
               } else {
                  if (var2 == 1) {
                     ++var4.b;
                  } else if (var2 == 2) {
                     --var4.b;
                  }

                  --var1;
               }
            } else if (var1 < var4.b) {
               if (var2 == 1) {
                  ++var4.b;
                  ++var4.d;
               } else if (var2 == 2) {
                  --var4.b;
                  --var4.d;
               }
            }

            var6 = var1;
         } else if (var4.b <= var1) {
            if (var4.a == 1) {
               var6 = var1 - var4.d;
            } else {
               var6 = var1;
               if (var4.a == 2) {
                  var6 = var1 + var4.d;
               }
            }
         } else if (var2 == 1) {
            ++var4.b;
            var6 = var1;
         } else {
            var6 = var1;
            if (var2 == 2) {
               --var4.b;
               var6 = var1;
            }
         }

         --var3;
      }

      for(var2 = this.b.size() - 1; var2 >= 0; --var2) {
         var4 = (ag)this.b.get(var2);
         if (var4.a == 8) {
            if (var4.d == var4.b || var4.d < 0) {
               this.b.remove(var2);
               this.a(var4);
            }
         } else if (var4.d <= 0) {
            this.b.remove(var2);
            this.a(var4);
         }
      }

      return var1;
   }

   private void d(ag var1) {
      int var2 = var1.b;
      int var3 = var1.b;
      int var4 = var1.d;
      int var5 = var1.b;
      byte var6 = -1;

      int var7;
      int var9;
      for(var7 = 0; var5 < var3 + var4; var5 = var9) {
         int var8;
         byte var11;
         if (this.c.a(var5) == null && !this.d(var5)) {
            var9 = var7;
            var8 = var2;
            if (var6 == 1) {
               this.g(this.a(4, var2, var7, var1.c));
               var9 = 0;
               var8 = var5;
            }

            var7 = var8;
            var8 = var9;
            var11 = 0;
         } else {
            var8 = var7;
            var9 = var2;
            if (var6 == 0) {
               this.e(this.a(4, var2, var7, var1.c));
               var8 = 0;
               var9 = var5;
            }

            var7 = var9;
            var11 = 1;
         }

         var9 = var5 + 1;
         ++var8;
         var5 = var7;
         var6 = var11;
         var7 = var8;
         var2 = var5;
      }

      ag var10 = var1;
      if (var7 != var1.d) {
         Object var12 = var1.c;
         this.a(var1);
         var10 = this.a(4, var2, var7, var12);
      }

      if (var6 == 0) {
         this.e(var10);
      } else {
         this.g(var10);
      }

   }

   private boolean d(int var1) {
      int var2 = this.b.size();
      int var3 = 0;

      boolean var5;
      while(true) {
         if (var3 >= var2) {
            var5 = false;
            break;
         }

         ag var4 = (ag)this.b.get(var3);
         if (var4.a == 8) {
            if (this.a(var4.d, var3 + 1) == var1) {
               var5 = true;
               break;
            }
         } else if (var4.a == 1) {
            int var6 = var4.b;
            int var7 = var4.d;

            for(int var8 = var4.b; var8 < var6 + var7; ++var8) {
               if (this.a(var8, var3 + 1) == var1) {
                  var5 = true;
                  return var5;
               }
            }
         }

         ++var3;
      }

      return var5;
   }

   private void e(ag var1) {
      if (var1.a != 1 && var1.a != 8) {
         int var2 = this.d(var1.b, var1.a);
         int var3 = var1.b;
         byte var4;
         switch(var1.a) {
         case 2:
            var4 = 0;
            break;
         case 3:
         default:
            throw new IllegalArgumentException("op should be remove or update." + var1);
         case 4:
            var4 = 1;
         }

         int var5 = 1;

         int var12;
         for(int var6 = 1; var6 < var1.d; var5 = var12) {
            int var7 = this.d(var1.b + var4 * var6, var1.a);
            boolean var8;
            switch(var1.a) {
            case 2:
               if (var7 == var2) {
                  var8 = true;
               } else {
                  var8 = false;
               }
               break;
            case 3:
            default:
               var8 = false;
               break;
            case 4:
               if (var7 == var2 + 1) {
                  var8 = true;
               } else {
                  var8 = false;
               }
            }

            if (var8) {
               var12 = var5 + 1;
            } else {
               ag var9 = this.a(var1.a, var2, var5, var1.c);
               this.a(var9, var3);
               this.a(var9);
               var12 = var3;
               if (var1.a == 4) {
                  var12 = var3 + var5;
               }

               byte var10 = 1;
               var2 = var7;
               var3 = var12;
               var12 = var10;
            }

            ++var6;
         }

         Object var11 = var1.c;
         this.a(var1);
         if (var5 > 0) {
            var1 = this.a(var1.a, var2, var5, var11);
            this.a(var1, var3);
            this.a(var1);
         }

      } else {
         throw new IllegalArgumentException("should not dispatch add or move for pre layout");
      }
   }

   private void f(ag var1) {
      this.g(var1);
   }

   private void g(ag var1) {
      this.b.add(var1);
      switch(var1.a) {
      case 1:
         this.c.c(var1.b, var1.d);
         break;
      case 2:
         this.c.b(var1.b, var1.d);
         break;
      case 3:
      case 5:
      case 6:
      case 7:
      default:
         throw new IllegalArgumentException("Unknown update op type for " + var1);
      case 4:
         this.c.a(var1.b, var1.d, var1.c);
         break;
      case 8:
         this.c.d(var1.b, var1.d);
      }

   }

   int a(int var1, int var2) {
      int var3 = this.b.size();
      int var4 = var2;
      var2 = var1;

      while(true) {
         var1 = var2;
         if (var4 >= var3) {
            break;
         }

         ag var5 = (ag)this.b.get(var4);
         if (var5.a == 8) {
            if (var5.b == var2) {
               var1 = var5.d;
            } else {
               int var6 = var2;
               if (var5.b < var2) {
                  var6 = var2 - 1;
               }

               var1 = var6;
               if (var5.d <= var6) {
                  var1 = var6 + 1;
               }
            }
         } else {
            var1 = var2;
            if (var5.b <= var2) {
               if (var5.a == 2) {
                  if (var2 < var5.b + var5.d) {
                     var1 = -1;
                     break;
                  }

                  var1 = var2 - var5.d;
               } else {
                  var1 = var2;
                  if (var5.a == 1) {
                     var1 = var2 + var5.d;
                  }
               }
            }
         }

         ++var4;
         var2 = var1;
      }

      return var1;
   }

   public ag a(int var1, int var2, int var3, Object var4) {
      ag var5 = (ag)this.g.a();
      ag var6;
      if (var5 == null) {
         var6 = new ag(var1, var2, var3, var4);
      } else {
         var5.a = var1;
         var5.b = var2;
         var5.d = var3;
         var5.c = var4;
         var6 = var5;
      }

      return var6;
   }

   void a() {
      this.a((List)this.a);
      this.a((List)this.b);
      this.h = 0;
   }

   public void a(ag var1) {
      if (!this.e) {
         var1.c = null;
         this.g.a(var1);
      }

   }

   void a(ag var1, int var2) {
      this.c.a(var1);
      switch(var1.a) {
      case 2:
         this.c.a(var2, var1.d);
         break;
      case 3:
      default:
         throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
      case 4:
         this.c.a(var2, var1.d, var1.c);
      }

   }

   void a(List var1) {
      int var2 = var1.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.a((ag)var1.get(var3));
      }

      var1.clear();
   }

   boolean a(int var1) {
      boolean var2;
      if ((this.h & var1) != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   boolean a(int var1, int var2, Object var3) {
      boolean var4 = false;
      boolean var5 = true;
      if (var2 < 1) {
         var5 = var4;
      } else {
         this.a.add(this.a(4, var1, var2, var3));
         this.h |= 4;
         if (this.a.size() != 1) {
            var5 = false;
         }
      }

      return var5;
   }

   int b(int var1) {
      return this.a(var1, 0);
   }

   void b() {
      this.f.a(this.a);
      int var1 = this.a.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         ag var3 = (ag)this.a.get(var2);
         switch(var3.a) {
         case 1:
            this.f(var3);
            break;
         case 2:
            this.c(var3);
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 4:
            this.d(var3);
            break;
         case 8:
            this.b(var3);
         }

         if (this.d != null) {
            this.d.run();
         }
      }

      this.a.clear();
   }

   boolean b(int var1, int var2) {
      boolean var3 = false;
      boolean var4 = true;
      if (var2 >= 1) {
         this.a.add(this.a(1, var1, var2, (Object)null));
         this.h |= 1;
         if (this.a.size() == 1) {
            var3 = var4;
         } else {
            var3 = false;
         }
      }

      return var3;
   }

   public int c(int var1) {
      int var2 = this.a.size();
      int var3 = 0;
      int var4 = var1;

      while(true) {
         var1 = var4;
         if (var3 >= var2) {
            return var1;
         }

         ag var5 = (ag)this.a.get(var3);
         switch(var5.a) {
         case 1:
            var1 = var4;
            if (var5.b <= var4) {
               var1 = var4 + var5.d;
            }
            break;
         case 2:
            var1 = var4;
            if (var5.b <= var4) {
               if (var5.b + var5.d > var4) {
                  var1 = -1;
                  return var1;
               }

               var1 = var4 - var5.d;
            }
            break;
         case 8:
            if (var5.b == var4) {
               var1 = var5.d;
            } else {
               int var6 = var4;
               if (var5.b < var4) {
                  var6 = var4 - 1;
               }

               var1 = var6;
               if (var5.d <= var6) {
                  var1 = var6 + 1;
               }
            }
            break;
         default:
            var1 = var4;
         }

         ++var3;
         var4 = var1;
      }
   }

   void c() {
      int var1 = this.b.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         this.c.b((ag)this.b.get(var2));
      }

      this.a((List)this.b);
      this.h = 0;
   }

   boolean c(int var1, int var2) {
      boolean var3 = false;
      boolean var4 = true;
      if (var2 < 1) {
         var4 = var3;
      } else {
         this.a.add(this.a(2, var1, var2, (Object)null));
         this.h |= 2;
         if (this.a.size() != 1) {
            var4 = false;
         }
      }

      return var4;
   }

   boolean d() {
      boolean var1;
      if (this.a.size() > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   void e() {
      this.c();
      int var1 = this.a.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         ag var3 = (ag)this.a.get(var2);
         switch(var3.a) {
         case 1:
            this.c.b(var3);
            this.c.c(var3.b, var3.d);
            break;
         case 2:
            this.c.b(var3);
            this.c.a(var3.b, var3.d);
         case 3:
         case 5:
         case 6:
         case 7:
         default:
            break;
         case 4:
            this.c.b(var3);
            this.c.a(var3.b, var3.d, var3.c);
            break;
         case 8:
            this.c.b(var3);
            this.c.d(var3.b, var3.d);
         }

         if (this.d != null) {
            this.d.run();
         }
      }

      this.a((List)this.a);
      this.h = 0;
   }

   boolean f() {
      boolean var1;
      if (!this.b.isEmpty() && !this.a.isEmpty()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
