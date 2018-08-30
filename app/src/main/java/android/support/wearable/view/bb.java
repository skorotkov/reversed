package android.support.wearable.view;

import android.support.v7.widget.dl;
import android.support.v7.widget.ds;
import android.support.v7.widget.ec;
import android.support.v7.widget.ef;
import android.support.v7.widget.em;
import android.support.v7.widget.es;
import android.support.v7.widget.ev;
import android.view.View;
import java.util.Iterator;

class bb extends ec {
   // $FF: synthetic field
   final au a;
   private int b;
   private boolean c;
   private int d;
   private boolean e;
   private boolean f;
   private es g;
   private es h;

   private bb(au var1) {
      this.a = var1;
      this.e = true;
      this.f = false;
   }

   // $FF: synthetic method
   bb(au var1, av var2) {
      this(var1);
   }

   // $FF: synthetic method
   static int a(bb var0) {
      return var0.h();
   }

   private void a(int var1) {
      this.d = var1;
      Iterator var2 = au.d(this.a).iterator();

      while(var2.hasNext()) {
         ((bg)var2.next()).c(this.d);
      }

   }

   private void a(em var1, int var2) {
      int var3 = this.B();
      int var4 = this.F();
      View var5 = var1.c(this.g());
      this.b(var5, 0);
      this.q(var5);
      var5.layout(this.D(), this.E(), var3 - var4, var2);
   }

   private void b(em var1, ev var2, int var3, int var4) {
      this.a(var1);
      if (au.g(this.a) && var2.e() == 1) {
         this.a(var1, var3);
         this.f = true;
      } else {
         this.c(var1, var2, var3, var4);
         this.f = false;
      }

      if (this.y() > 0) {
         this.a.post(au.h(this.a));
      }

   }

   private void c(em var1, ev var2, int var3, int var4) {
      int var5 = this.D();
      int var6 = this.B();
      int var7 = this.F();
      int var8 = var2.e();
      byte var9 = 0;
      int var10 = var4;

      int var12;
      for(var4 = var9; this.g() + var4 < var8 && var10 < var3; var10 = var12) {
         View var11 = var1.c(this.g() + var4);
         this.b(var11, var4);
         this.p(var11);
         var12 = au.f(this.a) + var10;
         var11.layout(var5, var10, var6 - var7, var12);
         ++var4;
      }

   }

   private void d(em var1) {
      int var2 = this.y();
      int var3 = this.B();
      int var4 = this.C();
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;

      int var10;
      for(boolean var8 = false; var5 < var2; var5 = var10) {
         View var9 = this.i(var5);
         if (var9.hasFocus() || var9.getRight() >= 0 && var9.getLeft() <= var3 && var9.getBottom() >= 0 && var9.getTop() <= var4) {
            boolean var11 = var8;
            if (!var8) {
               var7 = var5;
               var11 = true;
            }

            var8 = var11;
            var6 = var7;
            var7 = var5;
         } else {
            var10 = var7;
            var7 = var6;
            var6 = var10;
         }

         var10 = var5 + 1;
         var5 = var6;
         var6 = var7;
         var7 = var5;
      }

      for(var5 = var2 - 1; var5 > var6; --var5) {
         this.a(var5, var1);
      }

      for(var5 = var7 - 1; var5 >= 0; --var5) {
         this.a(var5, var1);
      }

      if (this.y() == 0) {
         this.b = 0;
      } else if (var7 > 0) {
         this.c = true;
         this.b += var7;
      }

   }

   private void e(View var1, int var2) {
      ef var3 = (ef)var1.getLayoutParams();
      int var4 = a(this.B(), this.D() + this.F() + var3.leftMargin + var3.rightMargin, var3.width, this.d());
      int var5 = this.C();
      int var6 = this.E();
      int var7 = this.G();
      int var8 = var3.topMargin;
      var1.measure(var4, a(var5, var3.bottomMargin + var6 + var7 + var8, var2, this.e()));
   }

   private int h() {
      int var1 = this.y();
      int var2 = Integer.MAX_VALUE;
      int var3 = au.p(this.a);
      int var4 = 0;

      int var5;
      int var7;
      for(var5 = -1; var4 < var1; var5 = var7) {
         View var6 = this.a.getLayoutManager().i(var4);
         var7 = this.a.getTop();
         var7 = Math.abs(var3 - (au.p(var6) + var7));
         if (var7 < var2) {
            var2 = var4;
            var5 = var7;
         } else {
            var7 = var2;
            var2 = var5;
            var5 = var7;
         }

         ++var4;
         var7 = var2;
         var2 = var5;
      }

      if (var5 == -1) {
         throw new IllegalStateException("Can't find central view.");
      } else {
         return var5;
      }
   }

   private void p(View var1) {
      this.e(var1, this.C() / 3 + 1);
   }

   private void q(View var1) {
      this.e(var1, this.C());
   }

   public ef a() {
      return new ef(-1, -2);
   }

   public void a(dl var1, ev var2, int var3) {
      es var4 = this.g;
      es var5 = var4;
      if (var4 == null) {
         var5 = this.g(var1);
      }

      var5.d(var3);
      this.a(var5);
   }

   public void a(ds var1, ds var2) {
      this.w();
   }

   public int b(int var1, em var2, ev var3) {
      int var4 = 0;
      if (this.y() != 0) {
         int var5 = this.D();
         int var6 = this.B() - this.F();
         View var7;
         int var8;
         int var9;
         if (var1 < 0) {
            for(var4 = 0; var4 > var1; var4 = var9) {
               var7 = this.i(0);
               if (this.g() <= 0) {
                  this.c = false;
                  if (au.i(this.a) != null) {
                     var9 = this.C();
                  } else {
                     var9 = au.j(this.a);
                  }

                  var1 = Math.min(-var1 + var4, var9 - var7.getTop());
                  var4 -= var1;
                  this.k(var1);
                  break;
               }

               var8 = Math.min(var4 - var1, Math.max(-var7.getTop(), 0));
               var9 = var4 - var8;
               this.k(var8);
               var4 = var9;
               if (this.g() <= 0) {
                  break;
               }

               var4 = var9;
               if (var9 <= var1) {
                  break;
               }

               --this.b;
               View var10 = var2.c(this.g());
               this.b(var10, 0);
               this.p(var10);
               var4 = var7.getTop();
               var10.layout(var5, var4 - au.f(this.a), var6, var4);
            }
         } else if (var1 > 0) {
            var8 = this.C();
            var9 = 0;

            while(true) {
               var4 = var9;
               if (var9 >= var1) {
                  break;
               }

               var7 = this.i(this.y() - 1);
               if (var3.e() <= this.b + this.y()) {
                  var1 = Math.max(-var1 + var9, this.C() / 2 - var7.getBottom());
                  var4 = var9 - var1;
                  this.k(var1);
                  break;
               }

               var4 = -Math.min(var1 - var9, Math.max(var7.getBottom() - var8, 0));
               var9 -= var4;
               this.k(var4);
               var4 = var9;
               if (var9 >= var1) {
                  break;
               }

               var7 = var2.c(this.b + this.y());
               var4 = this.i(this.y() - 1).getBottom();
               this.b(var7);
               this.p(var7);
               var7.layout(var5, var4, var6, au.f(this.a) + var4);
            }
         } else {
            var4 = 0;
         }

         this.d(var2);
         this.a(this.d + var4);
      }

      return var4;
   }

   public void b(es var1) {
      this.g = var1;
   }

   public void c(em var1, ev var2) {
      int var3 = this.C();
      int var4 = this.G();
      int var5 = this.a.getCentralViewTop();
      int var6 = au.e(this.a) + var5;
      int var8;
      if (this.e && this.y() > 0) {
         int var7 = this.h();
         var8 = this.d(this.i(var7));
         var5 = var8;
         int var9 = var7;
         int var11;
         if (var8 == -1) {
            int var10 = this.y();
            var11 = 0;

            while(true) {
               if (var7 + var11 >= var10) {
                  var5 = var8;
                  var9 = var7;
                  if (var7 - var11 < 0) {
                     break;
                  }
               }

               View var12 = this.i(var7 + var11);
               if (var12 != null) {
                  var5 = this.d(var12);
                  var8 = var5;
                  if (var5 != -1) {
                     var9 = var7 + var11;
                     break;
                  }
               }

               var12 = this.i(var7 - var11);
               if (var12 != null) {
                  var5 = this.d(var12);
                  var8 = var5;
                  if (var5 != -1) {
                     var9 = var7 - var11;
                     break;
                  }
               }

               ++var11;
            }
         }

         if (var5 == -1) {
            var8 = this.i(0).getTop();
            var9 = var2.e();

            while(true) {
               var5 = var8;
               if (this.b < var9) {
                  break;
               }

               var5 = var8;
               if (this.b <= 0) {
                  break;
               }

               --this.b;
            }
         } else {
            var11 = var5;
            var8 = var6;
            if (!this.f) {
               var8 = this.i(var9).getTop();
               var11 = var5;
            }

            while(var8 > this.E() && var11 > 0) {
               --var11;
               var8 -= au.f(this.a);
            }

            var5 = var8;
            if (var11 == 0) {
               var5 = var8;
               if (var8 > this.a.getCentralViewTop()) {
                  var5 = this.a.getCentralViewTop();
               }
            }

            this.b = var11;
         }
      } else {
         var5 = var6;
         if (this.c) {
            var5 = this.a.getCentralViewTop() - au.f(this.a);
         }
      }

      this.b(var1, var2, var3 - var4, var5);
      if (this.y() == 0) {
         this.a(0);
      } else {
         View var13 = this.i(this.h());
         var5 = var13.getTop();
         var8 = this.a.getCentralViewTop();
         this.a(this.d(var13) * au.f(this.a) + (var5 - var8));
      }

      this.e = true;
      this.c = false;
   }

   public void e(int var1) {
      this.e = false;
      if (var1 > 0) {
         this.b = var1 - 1;
         this.c = true;
      } else {
         this.b = var1;
         this.c = false;
      }

      this.p();
   }

   public boolean e() {
      boolean var1 = true;
      boolean var2 = var1;
      if (this.I() == 1) {
         if (!this.f) {
            var2 = var1;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public void f() {
      this.g = null;
   }

   public int g() {
      return this.b;
   }

   public es g(dl var1) {
      if (this.h == null) {
         this.h = new bi(var1.getContext(), this);
      }

      return this.h;
   }
}
