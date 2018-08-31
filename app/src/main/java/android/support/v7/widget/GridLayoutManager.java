package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
   boolean a = false;
   int b = -1;
   int[] c;
   View[] d;
   final SparseIntArray e = new SparseIntArray();
   final SparseIntArray f = new SparseIntArray();
   cj g = new ch();
   final Rect h = new Rect();

   public GridLayoutManager(Context var1, int var2) {
      super(var1);
      this.a(var2);
   }

   public GridLayoutManager(Context var1, int var2, int var3, boolean var4) {
      super(var1, var3, var4);
      this.a(var2);
   }

   public GridLayoutManager(Context var1, AttributeSet var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.a(a(var1, var2, var3, var4).b);
   }

   private void O() {
      this.e.clear();
      this.f.clear();
   }

   private void P() {
      int var1 = this.y();

      for(int var2 = 0; var2 < var1; ++var2) {
         ci var3 = (ci)this.i(var2).getLayoutParams();
         int var4 = var3.f();
         this.e.put(var4, var3.b());
         this.f.put(var4, var3.a());
      }

   }

   private void Q() {
      int var1;
      if (this.f() == 1) {
         var1 = this.B() - this.F() - this.D();
      } else {
         var1 = this.C() - this.G() - this.E();
      }

      this.m(var1);
   }

   private void R() {
      if (this.d == null || this.d.length != this.b) {
         this.d = new View[this.b];
      }

   }

   private int a(em var1, ev var2, int var3) {
      if (!var2.a()) {
         var3 = this.g.c(var3, this.b);
      } else {
         int var4 = var1.b(var3);
         if (var4 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + var3);
            var3 = 0;
         } else {
            var3 = this.g.c(var4, this.b);
         }
      }

      return var3;
   }

   private void a(float var1, int var2) {
      this.m(Math.max(Math.round((float)this.b * var1), var2));
   }

   private void a(em var1, ev var2, int var3, int var4, boolean var5) {
      byte var6;
      if (var5) {
         var6 = 1;
         byte var7 = 0;
         var4 = var3;
         var3 = var7;
      } else {
         var4 = -1;
         --var3;
         var6 = -1;
      }

      byte var8 = 0;
      int var11 = var3;

      for(var3 = var8; var11 != var4; var11 += var6) {
         View var9 = this.d[var11];
         ci var10 = (ci)var9.getLayoutParams();
         var10.b = this.c(var1, var2, this.d(var9));
         var10.a = var3;
         var3 += var10.b;
      }

   }

   private void a(View var1, int var2, int var3, boolean var4) {
      ef var5 = (ef)var1.getLayoutParams();
      if (var4) {
         var4 = this.a(var1, var2, var3, var5);
      } else {
         var4 = this.b(var1, var2, var3, var5);
      }

      if (var4) {
         var1.measure(var2, var3);
      }

   }

   private void a(View var1, int var2, boolean var3) {
      ci var4 = (ci)var1.getLayoutParams();
      Rect var5 = var4.d;
      int var6 = var5.top + var5.bottom + var4.topMargin + var4.bottomMargin;
      int var7 = var5.left;
      int var8 = var5.right;
      int var9 = var4.leftMargin;
      var8 = var4.rightMargin + var8 + var7 + var9;
      var7 = this.a(var4.a, var4.b);
      if (this.i == 1) {
         var8 = a(var7, var2, var8, var4.width, false);
         var2 = a(this.j.f(), this.A(), var6, var4.height, true);
      } else {
         var2 = a(var7, var2, var6, var4.height, false);
         var8 = a(this.j.f(), this.z(), var8, var4.width, true);
      }

      this.a(var1, var8, var2, var3);
   }

   static int[] a(int[] var0, int var1, int var2) {
      byte var3;
      int[] var4;
      label29: {
         var3 = 0;
         if (var0 != null && var0.length == var1 + 1) {
            var4 = var0;
            if (var0[var0.length - 1] == var2) {
               break label29;
            }
         }

         var4 = new int[var1 + 1];
      }

      var4[0] = 0;
      int var5 = var2 / var1;
      int var6 = var2 % var1;
      int var7 = 1;
      int var8 = 0;

      for(var2 = var3; var7 <= var1; ++var7) {
         var2 += var6;
         int var9;
         if (var2 > 0 && var1 - var2 < var6) {
            var9 = var5 + 1;
            var2 -= var1;
         } else {
            var9 = var5;
         }

         var8 += var9;
         var4[var7] = var8;
      }

      return var4;
   }

   private int b(em var1, ev var2, int var3) {
      int var4;
      if (!var2.a()) {
         var4 = this.g.b(var3, this.b);
      } else {
         int var5 = this.f.get(var3, -1);
         var4 = var5;
         if (var5 == -1) {
            var4 = var1.b(var3);
            if (var4 == -1) {
               Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + var3);
               var4 = 0;
            } else {
               var4 = this.g.b(var4, this.b);
            }
         }
      }

      return var4;
   }

   private void b(em var1, ev var2, cn var3, int var4) {
      boolean var5 = true;
      if (var4 != 1) {
         var5 = false;
      }

      var4 = this.b(var1, var2, var3.a);
      if (var5) {
         while(var4 > 0 && var3.a > 0) {
            --var3.a;
            var4 = this.b(var1, var2, var3.a);
         }
      } else {
         int var6 = var2.e();
         int var7 = var3.a;
         int var8 = var4;

         for(var4 = var7; var4 < var6 - 1; var8 = var7) {
            var7 = this.b(var1, var2, var4 + 1);
            if (var7 <= var8) {
               break;
            }

            ++var4;
         }

         var3.a = var4;
      }

   }

   private int c(em var1, ev var2, int var3) {
      int var4;
      if (!var2.a()) {
         var4 = this.g.a(var3);
      } else {
         int var5 = this.e.get(var3, -1);
         var4 = var5;
         if (var5 == -1) {
            var4 = var1.b(var3);
            if (var4 == -1) {
               Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + var3);
               var4 = 1;
            } else {
               var4 = this.g.a(var4);
            }
         }
      }

      return var4;
   }

   private void m(int var1) {
      this.c = a(this.c, this.b, var1);
   }

   int a(int var1, int var2) {
      if (this.i == 1 && this.g()) {
         var1 = this.c[this.b - var1] - this.c[this.b - var1 - var2];
      } else {
         var1 = this.c[var1 + var2] - this.c[var1];
      }

      return var1;
   }

   public int a(int var1, em var2, ev var3) {
      this.Q();
      this.R();
      return super.a(var1, var2, var3);
   }

   public int a(em var1, ev var2) {
      int var3;
      if (this.i == 0) {
         var3 = this.b;
      } else if (var2.e() < 1) {
         var3 = 0;
      } else {
         var3 = this.a(var1, var2, var2.e() - 1) + 1;
      }

      return var3;
   }

   public ef a() {
      ci var1;
      if (this.i == 0) {
         var1 = new ci(-2, -1);
      } else {
         var1 = new ci(-1, -2);
      }

      return var1;
   }

   public ef a(Context var1, AttributeSet var2) {
      return new ci(var1, var2);
   }

   public ef a(LayoutParams var1) {
      ci var2;
      if (var1 instanceof MarginLayoutParams) {
         var2 = new ci((MarginLayoutParams)var1);
      } else {
         var2 = new ci(var1);
      }

      return var2;
   }

   View a(em var1, ev var2, int var3, int var4, int var5) {
      View var6 = null;
      this.h();
      int var7 = this.j.c();
      int var8 = this.j.d();
      byte var9;
      if (var4 > var3) {
         var9 = 1;
      } else {
         var9 = -1;
      }

      View var10 = null;

      View var13;
      while(true) {
         if (var3 == var4) {
            if (var6 == null) {
               var6 = var10;
            }

            var13 = var6;
            break;
         }

         View var11;
         label43: {
            var11 = this.i(var3);
            int var12 = this.d(var11);
            if (var12 >= 0 && var12 < var5) {
               if (this.b(var1, var2, var12) != 0) {
                  var11 = var6;
                  var6 = var10;
                  var10 = var11;
                  break label43;
               }

               if (((ef)var11.getLayoutParams()).d()) {
                  if (var10 == null) {
                     var10 = var6;
                     var6 = var11;
                     break label43;
                  }
               } else {
                  if (this.j.a(var11) < var8) {
                     var13 = var11;
                     if (this.j.b(var11) >= var7) {
                        break;
                     }
                  }

                  if (var6 == null) {
                     var6 = var10;
                     var10 = var11;
                     break label43;
                  }
               }
            }

            var11 = var6;
            var6 = var10;
            var10 = var11;
         }

         var3 += var9;
         var11 = var6;
         var6 = var10;
         var10 = var11;
      }

      return var13;
   }

   public View a(View var1, int var2, em var3, ev var4) {
      View var5 = this.e(var1);
      View var21;
      if (var5 == null) {
         var21 = null;
      } else {
         ci var6 = (ci)var5.getLayoutParams();
         int var7 = var6.a;
         int var8 = var6.a + var6.b;
         if (super.a(var1, var2, var3, var4) == null) {
            var21 = null;
         } else {
            boolean var9;
            if (this.f(var2) == 1) {
               var9 = true;
            } else {
               var9 = false;
            }

            boolean var20;
            if (var9 != this.k) {
               var20 = true;
            } else {
               var20 = false;
            }

            byte var10;
            int var11;
            if (var20) {
               var2 = this.y() - 1;
               var10 = -1;
               var11 = -1;
            } else {
               var11 = this.y();
               var2 = 0;
               var10 = 1;
            }

            boolean var12;
            if (this.i == 1 && this.g()) {
               var12 = true;
            } else {
               var12 = false;
            }

            var1 = null;
            byte var13 = -1;
            int var14 = 0;
            int var15 = var2;

            int var23;
            for(var2 = var13; var15 != var11; var2 = var23) {
               View var22 = this.i(var15);
               if (var22 == var5) {
                  break;
               }

               if (!var22.isFocusable()) {
                  var23 = var14;
                  var14 = var2;
                  var2 = var23;
               } else {
                  var6 = (ci)var22.getLayoutParams();
                  int var16 = var6.a;
                  int var17 = var6.a + var6.b;
                  if (var16 == var7) {
                     var21 = var22;
                     if (var17 == var8) {
                        return var21;
                     }
                  }

                  boolean var18 = false;
                  boolean var24;
                  if (var1 == null) {
                     var24 = true;
                  } else {
                     var23 = Math.max(var16, var7);
                     int var19 = Math.min(var17, var8) - var23;
                     if (var19 > var14) {
                        var24 = true;
                     } else {
                        var24 = var18;
                        if (var19 == var14) {
                           boolean var25;
                           if (var16 > var2) {
                              var25 = true;
                           } else {
                              var25 = false;
                           }

                           var24 = var18;
                           if (var12 == var25) {
                              var24 = true;
                           }
                        }
                     }
                  }

                  if (var24) {
                     var14 = var6.a;
                     var2 = Math.min(var17, var8) - Math.max(var16, var7);
                     var1 = var22;
                  } else {
                     var23 = var2;
                     var2 = var14;
                     var14 = var23;
                  }
               }

               var15 += var10;
               var23 = var14;
               var14 = var2;
            }

            var21 = var1;
         }
      }

      return var21;
   }

   public void a(int var1) {
      if (var1 != this.b) {
         this.a = true;
         if (var1 < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + var1);
         }

         this.b = var1;
         this.g.a();
         this.p();
      }

   }

   public void a(Rect var1, int var2, int var3) {
      if (this.c == null) {
         super.a(var1, var2, var3);
      }

      int var4 = this.D();
      var4 += this.F();
      int var5 = this.E() + this.G();
      if (this.i == 1) {
         var3 = a(var3, var5 + var1.height(), this.K());
         var2 = a(var2, var4 + this.c[this.c.length - 1], this.J());
      } else {
         var2 = a(var2, var4 + var1.width(), this.J());
         var3 = a(var3, var5 + this.c[this.c.length - 1], this.K());
      }

      this.e(var2, var3);
   }

   public void a(dl var1) {
      this.g.a();
   }

   public void a(dl var1, int var2, int var3) {
      this.g.a();
   }

   public void a(dl var1, int var2, int var3, int var4) {
      this.g.a();
   }

   public void a(dl var1, int var2, int var3, Object var4) {
      this.g.a();
   }

   void a(em var1, ev var2, cn var3, int var4) {
      super.a(var1, var2, var3, var4);
      this.Q();
      if (var2.e() > 0 && !var2.a()) {
         this.b(var1, var2, var3, var4);
      }

      this.R();
   }

   void a(em var1, ev var2, cp var3, co var4) {
      int var5 = this.j.i();
      boolean var6;
      if (var5 != 1073741824) {
         var6 = true;
      } else {
         var6 = false;
      }

      int var7;
      if (this.y() > 0) {
         var7 = this.c[this.b];
      } else {
         var7 = 0;
      }

      if (var6) {
         this.Q();
      }

      boolean var8;
      if (var3.e == 1) {
         var8 = true;
      } else {
         var8 = false;
      }

      byte var9 = 0;
      byte var10 = 0;
      int var11 = this.b;
      int var12 = var9;
      int var13 = var10;
      if (!var8) {
         var11 = this.b(var1, var2, var3.d) + this.c(var1, var2, var3.d);
         var13 = var10;
         var12 = var9;
      }

      View var14;
      int var23;
      int var24;
      while(var12 < this.b && var3.a(var2) && var11 > 0) {
         var23 = var3.d;
         var24 = this.c(var1, var2, var23);
         if (var24 > this.b) {
            throw new IllegalArgumentException("Item at position " + var23 + " requires " + var24 + " spans but GridLayoutManager has only " + this.b + " spans.");
         }

         var11 -= var24;
         if (var11 < 0) {
            break;
         }

         var14 = var3.a(var1);
         if (var14 == null) {
            break;
         }

         var13 += var24;
         this.d[var12] = var14;
         ++var12;
      }

      if (var12 == 0) {
         var4.b = true;
      } else {
         this.a(var1, var2, var12, var13, var8);
         var13 = 0;
         float var15 = 0.0F;

         View var17;
         ci var19;
         for(var11 = 0; var13 < var12; var11 = var24) {
            var17 = this.d[var13];
            if (var3.k == null) {
               if (var8) {
                  this.b(var17);
               } else {
                  this.b(var17, 0);
               }
            } else if (var8) {
               this.a((View)var17);
            } else {
               this.a(var17, 0);
            }

            this.b(var17, this.h);
            this.a(var17, var5, false);
            var23 = this.j.e(var17);
            var24 = var11;
            if (var23 > var11) {
               var24 = var23;
            }

            var19 = (ci)var17.getLayoutParams();
            float var16 = (float)this.j.f(var17) * 1.0F / (float)var19.b;
            if (var16 > var15) {
               var15 = var16;
            }

            ++var13;
         }

         var13 = var11;
         int var22;
         if (var6) {
            this.a(var15, var7);
            var11 = 0;
            var22 = 0;

            while(true) {
               var13 = var11;
               if (var22 >= var12) {
                  break;
               }

               var17 = this.d[var22];
               this.a(var17, 1073741824, true);
               var13 = this.j.e(var17);
               if (var13 > var11) {
                  var11 = var13;
               }

               ++var22;
            }
         }

         for(var11 = 0; var11 < var12; ++var11) {
            var14 = this.d[var11];
            if (this.j.e(var14) != var13) {
               var19 = (ci)var14.getLayoutParams();
               Rect var18 = var19.d;
               var7 = var18.top + var18.bottom + var19.topMargin + var19.bottomMargin;
               var22 = var18.left;
               var22 = var18.right + var22 + var19.leftMargin + var19.rightMargin;
               var24 = this.a(var19.a, var19.b);
               if (this.i == 1) {
                  var22 = a(var24, 1073741824, var22, var19.width, false);
                  var7 = MeasureSpec.makeMeasureSpec(var13 - var7, 1073741824);
               } else {
                  var22 = MeasureSpec.makeMeasureSpec(var13 - var22, 1073741824);
                  var7 = a(var24, 1073741824, var7, var19.height, false);
               }

               this.a(var14, var22, var7, true);
            }
         }

         var4.a = var13;
         var7 = 0;
         if (this.i == 1) {
            if (var3.f == -1) {
               var7 = var3.b;
               var11 = var7 - var13;
               var22 = 0;
               var13 = 0;
            } else {
               var11 = var3.b;
               var7 = var11 + var13;
               var22 = 0;
               var13 = 0;
            }
         } else if (var3.f == -1) {
            var11 = var3.b;
            var22 = var11;
            var13 = var11 - var13;
            var11 = 0;
         } else {
            var24 = var3.b;
            var22 = var13 + var24;
            var11 = 0;
            var13 = var24;
         }

         var24 = var7;
         var7 = var13;
         var9 = 0;
         var13 = var24;
         var24 = var11;
         var11 = var7;

         for(var7 = var9; var7 < var12; ++var7) {
            View var21 = this.d[var7];
            ci var20 = (ci)var21.getLayoutParams();
            if (this.i == 1) {
               if (this.g()) {
                  var22 = this.D() + this.c[this.b - var20.a];
                  var11 = var22 - this.j.f(var21);
               } else {
                  var11 = this.D() + this.c[var20.a];
                  var22 = var11 + this.j.f(var21);
               }
            } else {
               var24 = this.E() + this.c[var20.a];
               var13 = var24 + this.j.f(var21);
            }

            this.a(var21, var11, var24, var22, var13);
            if (var20.d() || var20.e()) {
               var4.c = true;
            }

            var4.d |= var21.isFocusable();
         }

         Arrays.fill(this.d, (Object)null);
      }

   }

   public void a(em var1, ev var2, View var3, android.support.v4.view.a_package.h var4) {
      LayoutParams var5 = var3.getLayoutParams();
      if (!(var5 instanceof ci)) {
         super.a((View)var3, (android.support.v4.view.a_package.h)var4);
      } else {
         ci var10 = (ci)var5;
         int var6 = this.a(var1, var2, var10.f());
         int var7;
         int var8;
         boolean var9;
         if (this.i == 0) {
            var7 = var10.a();
            var8 = var10.b();
            if (this.b > 1 && var10.b() == this.b) {
               var9 = true;
            } else {
               var9 = false;
            }

            var4.b((Object)android.support.v4.view.a.u.a(var7, var8, var6, 1, var9, false));
         } else {
            var7 = var10.a();
            var8 = var10.b();
            if (this.b > 1 && var10.b() == this.b) {
               var9 = true;
            } else {
               var9 = false;
            }

            var4.b((Object)android.support.v4.view.a.u.a(var6, 1, var7, var8, var9, false));
         }
      }

   }

   public void a(ev var1) {
      super.a(var1);
      this.a = false;
   }

   void a(ev var1, cp var2, ed var3) {
      int var4 = this.b;

      for(int var5 = 0; var5 < this.b && var2.a(var1) && var4 > 0; ++var5) {
         int var6 = var2.d;
         var3.b(var6, var2.g);
         var4 -= this.g.a(var6);
         var2.d += var2.e;
      }

   }

   public void a(boolean var1) {
      if (var1) {
         throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
      } else {
         super.a(false);
      }
   }

   public boolean a(ef var1) {
      return var1 instanceof ci;
   }

   public int b(int var1, em var2, ev var3) {
      this.Q();
      this.R();
      return super.b(var1, var2, var3);
   }

   public int b(em var1, ev var2) {
      int var3;
      if (this.i == 1) {
         var3 = this.b;
      } else if (var2.e() < 1) {
         var3 = 0;
      } else {
         var3 = this.a(var1, var2, var2.e() - 1) + 1;
      }

      return var3;
   }

   public void b(dl var1, int var2, int var3) {
      this.g.a();
   }

   public boolean b() {
      boolean var1;
      if (this.n == null && !this.a) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void c(em var1, ev var2) {
      if (var2.a()) {
         this.P();
      }

      super.c(var1, var2);
      this.O();
   }
}
