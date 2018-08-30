package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.BitSet;

public class StaggeredGridLayoutManager extends ec implements eu {
   private final Rect A;
   private final fs B;
   private boolean C;
   private boolean D;
   private int[] E;
   private final Runnable F;
   fz[] a;
   di b;
   di c;
   boolean d;
   boolean e;
   int f;
   int g;
   fu h;
   private int i;
   private int j;
   private int k;
   private final ck l;
   private BitSet m;
   private int n;
   private boolean o;
   private boolean x;
   private fx y;
   private int z;

   public StaggeredGridLayoutManager(int var1, int var2) {
      boolean var3 = true;
      super();
      this.i = -1;
      this.d = false;
      this.e = false;
      this.f = -1;
      this.g = Integer.MIN_VALUE;
      this.h = new fu();
      this.n = 2;
      this.A = new Rect();
      this.B = new fs(this);
      this.C = false;
      this.D = true;
      this.F = new fr(this);
      this.j = var2;
      this.a(var1);
      if (this.n == 0) {
         var3 = false;
      }

      this.c(var3);
      this.l = new ck();
      this.O();
   }

   public StaggeredGridLayoutManager(Context var1, AttributeSet var2, int var3, int var4) {
      boolean var5 = true;
      super();
      this.i = -1;
      this.d = false;
      this.e = false;
      this.f = -1;
      this.g = Integer.MIN_VALUE;
      this.h = new fu();
      this.n = 2;
      this.A = new Rect();
      this.B = new fs(this);
      this.C = false;
      this.D = true;
      this.F = new fr(this);
      ee var6 = a(var1, var2, var3, var4);
      this.b(var6.a);
      this.a(var6.b);
      this.a(var6.c);
      if (this.n == 0) {
         var5 = false;
      }

      this.c(var5);
      this.l = new ck();
      this.O();
   }

   private void O() {
      this.b = di.a(this, this.j);
      this.c = di.a(this, 1 - this.j);
   }

   private void P() {
      boolean var1 = true;
      if (this.j != 1 && this.i()) {
         if (this.d) {
            var1 = false;
         }

         this.e = var1;
      } else {
         this.e = this.d;
      }

   }

   private void Q() {
      if (this.c.h() != 1073741824) {
         float var1 = 0.0F;
         int var2 = this.y();

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            View var4 = this.i(var3);
            float var5 = (float)this.c.e(var4);
            if (var5 >= var1) {
               if (((ft)var4.getLayoutParams()).a()) {
                  var5 = 1.0F * var5 / (float)this.i;
               }

               var1 = Math.max(var1, var5);
            }
         }

         int var6 = this.k;
         int var7 = Math.round((float)this.i * var1);
         var3 = var7;
         if (this.c.h() == Integer.MIN_VALUE) {
            var3 = Math.min(var7, this.c.f());
         }

         this.f(var3);
         if (this.k != var6) {
            for(var3 = 0; var3 < var2; ++var3) {
               View var8 = this.i(var3);
               ft var10 = (ft)var8.getLayoutParams();
               if (!var10.b) {
                  if (this.i() && this.j == 1) {
                     var8.offsetLeftAndRight(-(this.i - 1 - var10.a.e) * this.k - -(this.i - 1 - var10.a.e) * var6);
                  } else {
                     var7 = var10.a.e * this.k;
                     int var9 = var10.a.e * var6;
                     if (this.j == 1) {
                        var8.offsetLeftAndRight(var7 - var9);
                     } else {
                        var8.offsetTopAndBottom(var7 - var9);
                     }
                  }
               }
            }
         }
      }

   }

   private int a(em var1, ck var2, ev var3) {
      this.m.set(0, this.i, true);
      int var4;
      if (this.l.i) {
         if (var2.e == 1) {
            var4 = Integer.MAX_VALUE;
         } else {
            var4 = Integer.MIN_VALUE;
         }
      } else if (var2.e == 1) {
         var4 = var2.g + var2.b;
      } else {
         var4 = var2.f - var2.b;
      }

      this.a(var2.e, var4);
      int var5;
      if (this.e) {
         var5 = this.b.d();
      } else {
         var5 = this.b.c();
      }

      boolean var6;
      for(var6 = false; var2.a(var3) && (this.l.i || !this.m.isEmpty()); var6 = true) {
         View var7 = var2.a(var1);
         ft var8 = (ft)var7.getLayoutParams();
         int var9 = var8.f();
         int var15 = this.h.c(var9);
         boolean var10;
         if (var15 == -1) {
            var10 = true;
         } else {
            var10 = false;
         }

         fz var11;
         if (var10) {
            if (var8.b) {
               var11 = this.a[0];
            } else {
               var11 = this.a(var2);
            }

            this.h.a(var9, var11);
         } else {
            var11 = this.a[var15];
         }

         var8.a = var11;
         if (var2.e == 1) {
            this.b(var7);
         } else {
            this.b(var7, 0);
         }

         this.a(var7, var8, false);
         int var12;
         fv var13;
         int var14;
         if (var2.e == 1) {
            if (var8.b) {
               var15 = this.r(var5);
            } else {
               var15 = var11.b(var5);
            }

            var12 = var15 + this.b.e(var7);
            if (var10 && var8.b) {
               var13 = this.n(var15);
               var13.b = -1;
               var13.a = var9;
               this.h.a(var13);
               var14 = var15;
            } else {
               var14 = var15;
            }
         } else {
            if (var8.b) {
               var15 = this.q(var5);
            } else {
               var15 = var11.a(var5);
            }

            var14 = var15 - this.b.e(var7);
            if (var10 && var8.b) {
               var13 = this.o(var15);
               var13.b = 1;
               var13.a = var9;
               this.h.a(var13);
            }

            var12 = var15;
         }

         if (var8.b && var2.d == -1) {
            if (var10) {
               this.C = true;
            } else {
               if (var2.e == 1) {
                  if (!this.l()) {
                     var6 = true;
                  } else {
                     var6 = false;
                  }
               } else if (!this.m()) {
                  var6 = true;
               } else {
                  var6 = false;
               }

               if (var6) {
                  var13 = this.h.f(var9);
                  if (var13 != null) {
                     var13.d = true;
                  }

                  this.C = true;
               }
            }
         }

         this.a(var7, var8, var2);
         int var16;
         if (this.i() && this.j == 1) {
            if (var8.b) {
               var15 = this.c.d();
            } else {
               var15 = this.c.d() - (this.i - 1 - var11.e) * this.k;
            }

            var16 = var15 - this.c.e(var7);
         } else {
            if (var8.b) {
               var15 = this.c.c();
            } else {
               var15 = var11.e * this.k + this.c.c();
            }

            var9 = var15 + this.c.e(var7);
            var16 = var15;
            var15 = var9;
         }

         if (this.j == 1) {
            this.a(var7, var16, var14, var15, var12);
         } else {
            this.a(var7, var14, var16, var12, var15);
         }

         if (var8.b) {
            this.a(this.l.e, var4);
         } else {
            this.a(var11, this.l.e, var4);
         }

         this.a(var1, this.l);
         if (this.l.h && var7.isFocusable()) {
            if (var8.b) {
               this.m.clear();
            } else {
               this.m.set(var11.e, false);
            }
         }
      }

      if (!var6) {
         this.a(var1, this.l);
      }

      if (this.l.e == -1) {
         var4 = this.q(this.b.c());
         var4 = this.b.c() - var4;
      } else {
         var4 = this.r(this.b.d()) - this.b.d();
      }

      if (var4 > 0) {
         var4 = Math.min(var2.b, var4);
      } else {
         var4 = 0;
      }

      return var4;
   }

   private fz a(ck var1) {
      Object var2 = null;
      fz var3 = null;
      byte var4 = -1;
      int var5;
      int var6;
      if (this.t(var1.e)) {
         var5 = this.i - 1;
         var6 = -1;
      } else {
         var6 = this.i;
         var5 = 0;
         var4 = 1;
      }

      int var7;
      int var8;
      int var9;
      fz var10;
      if (var1.e == 1) {
         var7 = this.b.c();
         var8 = Integer.MAX_VALUE;
         var9 = var5;
         var10 = var3;
         var5 = var8;

         while(true) {
            var3 = var10;
            if (var9 == var6) {
               break;
            }

            var3 = this.a[var9];
            var8 = var3.b(var7);
            if (var8 < var5) {
               var10 = var3;
               var5 = var8;
            }

            var9 += var4;
         }
      } else {
         var7 = this.b.d();
         var8 = Integer.MIN_VALUE;
         var9 = var5;
         var10 = (fz)var2;
         var5 = var8;

         while(true) {
            var3 = var10;
            if (var9 == var6) {
               break;
            }

            var3 = this.a[var9];
            var8 = var3.a(var7);
            if (var8 > var5) {
               var10 = var3;
               var5 = var8;
            }

            var9 += var4;
         }
      }

      return var3;
   }

   private void a(int var1, int var2) {
      for(int var3 = 0; var3 < this.i; ++var3) {
         if (!this.a[var3].a.isEmpty()) {
            this.a(this.a[var3], var1, var2);
         }
      }

   }

   private void a(em var1, int var2) {
      View var3;
      for(; this.y() > 0; this.a((View)var3, (em)var1)) {
         var3 = this.i(0);
         if (this.b.b(var3) > var2 || this.b.c(var3) > var2) {
            break;
         }

         ft var4 = (ft)var3.getLayoutParams();
         if (!var4.b) {
            if (var4.a.a.size() == 1) {
               break;
            }

            var4.a.h();
         } else {
            int var5;
            for(var5 = 0; var5 < this.i; ++var5) {
               if (this.a[var5].a.size() == 1) {
                  return;
               }
            }

            for(var5 = 0; var5 < this.i; ++var5) {
               this.a[var5].h();
            }
         }
      }

   }

   private void a(em var1, ck var2) {
      if (var2.a && !var2.i) {
         if (var2.b == 0) {
            if (var2.e == -1) {
               this.b(var1, var2.g);
            } else {
               this.a(var1, var2.f);
            }
         } else {
            int var3;
            if (var2.e == -1) {
               var3 = var2.f - this.p(var2.f);
               if (var3 < 0) {
                  var3 = var2.g;
               } else {
                  var3 = var2.g - Math.min(var3, var2.b);
               }

               this.b(var1, var3);
            } else {
               int var4 = this.s(var2.g) - var2.g;
               if (var4 < 0) {
                  var3 = var2.f;
               } else {
                  var3 = var2.f;
                  var3 += Math.min(var4, var2.b);
               }

               this.a(var1, var3);
            }
         }
      }

   }

   private void a(em var1, ev var2, boolean var3) {
      fs var4 = this.B;
      if ((this.y != null || this.f != -1) && var2.e() == 0) {
         this.c(var1);
         var4.a();
      } else {
         boolean var5;
         if (var4.e && this.f == -1 && this.y == null) {
            var5 = false;
         } else {
            var5 = true;
         }

         if (var5) {
            var4.a();
            if (this.y != null) {
               this.a(var4);
            } else {
               this.P();
               var4.c = this.e;
            }

            this.a(var2, var4);
            var4.e = true;
         }

         if (this.y == null && this.f == -1 && (var4.c != this.o || this.i() != this.x)) {
            this.h.a();
            var4.d = true;
         }

         if (this.y() > 0 && (this.y == null || this.y.c < 1)) {
            int var7;
            if (var4.d) {
               for(var7 = 0; var7 < this.i; ++var7) {
                  this.a[var7].e();
                  if (var4.b != Integer.MIN_VALUE) {
                     this.a[var7].c(var4.b);
                  }
               }
            } else if (!var5 && this.B.f != null) {
               for(var7 = 0; var7 < this.i; ++var7) {
                  fz var6 = this.a[var7];
                  var6.e();
                  var6.c(this.B.f[var7]);
               }
            } else {
               for(var7 = 0; var7 < this.i; ++var7) {
                  this.a[var7].a(this.e, var4.b);
               }

               this.B.a(this.a);
            }
         }

         this.a((em)var1);
         this.l.a = false;
         this.C = false;
         this.f(this.c.f());
         this.b(var4.a, var2);
         if (var4.c) {
            this.m(-1);
            this.a(var1, this.l, var2);
            this.m(1);
            this.l.c = var4.a + this.l.d;
            this.a(var1, this.l, var2);
         } else {
            this.m(1);
            this.a(var1, this.l, var2);
            this.m(-1);
            this.l.c = var4.a + this.l.d;
            this.a(var1, this.l, var2);
         }

         this.Q();
         if (this.y() > 0) {
            if (this.e) {
               this.b(var1, var2, true);
               this.c(var1, var2, false);
            } else {
               this.c(var1, var2, true);
               this.b(var1, var2, false);
            }
         }

         label93: {
            if (var3 && !var2.a()) {
               if (this.n != 0 && this.y() > 0 && (this.C || this.g() != null)) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (var5) {
                  this.a((Runnable)this.F);
                  if (this.f()) {
                     var5 = true;
                     break label93;
                  }
               }
            }

            var5 = false;
         }

         if (var2.a()) {
            this.B.a();
         }

         this.o = var4.c;
         this.x = this.i();
         if (var5) {
            this.B.a();
            this.a(var1, var2, false);
         }
      }

   }

   private void a(fs var1) {
      if (this.y.c > 0) {
         if (this.y.c == this.i) {
            for(int var2 = 0; var2 < this.i; ++var2) {
               this.a[var2].e();
               int var3 = this.y.d[var2];
               int var4 = var3;
               if (var3 != Integer.MIN_VALUE) {
                  if (this.y.i) {
                     var4 = var3 + this.b.d();
                  } else {
                     var4 = var3 + this.b.c();
                  }
               }

               this.a[var2].c(var4);
            }
         } else {
            this.y.a();
            this.y.a = this.y.b;
         }
      }

      this.x = this.y.j;
      this.a(this.y.h);
      this.P();
      if (this.y.a != -1) {
         this.f = this.y.a;
         var1.c = this.y.i;
      } else {
         var1.c = this.e;
      }

      if (this.y.e > 1) {
         this.h.a = this.y.f;
         this.h.b = this.y.g;
      }

   }

   private void a(fz var1, int var2, int var3) {
      int var4 = var1.i();
      if (var2 == -1) {
         if (var4 + var1.b() <= var3) {
            this.m.set(var1.e, false);
         }
      } else if (var1.d() - var4 >= var3) {
         this.m.set(var1.e, false);
      }

   }

   private void a(View var1, int var2, int var3, boolean var4) {
      this.b((View)var1, (Rect)this.A);
      ft var5 = (ft)var1.getLayoutParams();
      var2 = this.b(var2, var5.leftMargin + this.A.left, var5.rightMargin + this.A.right);
      var3 = this.b(var3, var5.topMargin + this.A.top, var5.bottomMargin + this.A.bottom);
      if (var4) {
         var4 = this.a(var1, var2, var3, var5);
      } else {
         var4 = this.b(var1, var2, var3, var5);
      }

      if (var4) {
         var1.measure(var2, var3);
      }

   }

   private void a(View var1, ft var2, ck var3) {
      if (var3.e == 1) {
         if (var2.b) {
            this.p(var1);
         } else {
            var2.a.b(var1);
         }
      } else if (var2.b) {
         this.q(var1);
      } else {
         var2.a.a(var1);
      }

   }

   private void a(View var1, ft var2, boolean var3) {
      if (var2.b) {
         if (this.j == 1) {
            this.a(var1, this.z, a(this.C(), this.A(), 0, var2.height, true), var3);
         } else {
            this.a(var1, a(this.B(), this.z(), 0, var2.width, true), this.z, var3);
         }
      } else if (this.j == 1) {
         this.a(var1, a(this.k, this.z(), 0, var2.width, false), a(this.C(), this.A(), 0, var2.height, true), var3);
      } else {
         this.a(var1, a(this.B(), this.z(), 0, var2.width, true), a(this.k, this.A(), 0, var2.height, false), var3);
      }

   }

   private boolean a(fz var1) {
      boolean var2 = true;
      if (this.e) {
         if (var1.d() < this.b.d()) {
            if (!var1.c((View)var1.a.get(var1.a.size() - 1)).b) {
               var2 = true;
            } else {
               var2 = false;
            }

            return var2;
         }
      } else if (var1.b() > this.b.c()) {
         if (var1.c((View)var1.a.get(0)).b) {
            var2 = false;
         }

         return var2;
      }

      var2 = false;
      return var2;
   }

   private int b(int var1, int var2, int var3) {
      int var4;
      if (var2 == 0 && var3 == 0) {
         var4 = var1;
      } else {
         int var5 = MeasureSpec.getMode(var1);
         if (var5 != Integer.MIN_VALUE) {
            var4 = var1;
            if (var5 != 1073741824) {
               return var4;
            }
         }

         var4 = MeasureSpec.makeMeasureSpec(Math.max(0, MeasureSpec.getSize(var1) - var2 - var3), var5);
      }

      return var4;
   }

   private int b(ev var1) {
      boolean var2 = true;
      int var3 = 0;
      if (this.y() != 0) {
         di var4 = this.b;
         boolean var5;
         if (!this.D) {
            var5 = true;
         } else {
            var5 = false;
         }

         View var6 = this.b(var5);
         if (!this.D) {
            var5 = var2;
         } else {
            var5 = false;
         }

         var3 = fd.a(var1, var4, var6, this.e(var5), this, this.D, this.e);
      }

      return var3;
   }

   private void b(int var1, ev var2) {
      boolean var3;
      int var4;
      boolean var6;
      label31: {
         var3 = false;
         this.l.b = 0;
         this.l.c = var1;
         if (this.u()) {
            var4 = var2.c();
            if (var4 != -1) {
               boolean var5 = this.e;
               if (var4 < var1) {
                  var6 = true;
               } else {
                  var6 = false;
               }

               if (var5 == var6) {
                  var1 = this.b.f();
                  var4 = 0;
               } else {
                  var4 = this.b.f();
                  var1 = 0;
               }
               break label31;
            }
         }

         var1 = 0;
         var4 = 0;
      }

      if (this.t()) {
         this.l.f = this.b.c() - var4;
         this.l.g = var1 + this.b.d();
      } else {
         this.l.g = var1 + this.b.e();
         this.l.f = -var4;
      }

      this.l.h = false;
      this.l.a = true;
      ck var7 = this.l;
      var6 = var3;
      if (this.b.h() == 0) {
         var6 = var3;
         if (this.b.e() == 0) {
            var6 = true;
         }
      }

      var7.i = var6;
   }

   private void b(em var1, int var2) {
      for(int var3 = this.y() - 1; var3 >= 0; --var3) {
         View var4 = this.i(var3);
         if (this.b.a(var4) < var2 || this.b.d(var4) < var2) {
            break;
         }

         ft var5 = (ft)var4.getLayoutParams();
         if (var5.b) {
            int var6;
            for(var6 = 0; var6 < this.i; ++var6) {
               if (this.a[var6].a.size() == 1) {
                  return;
               }
            }

            for(var6 = 0; var6 < this.i; ++var6) {
               this.a[var6].g();
            }
         } else {
            if (var5.a.a.size() == 1) {
               break;
            }

            var5.a.g();
         }

         this.a((View)var4, (em)var1);
      }

   }

   private void b(em var1, ev var2, boolean var3) {
      int var4 = this.r(Integer.MIN_VALUE);
      if (var4 != Integer.MIN_VALUE) {
         var4 = this.b.d() - var4;
         if (var4 > 0) {
            var4 -= -this.c(-var4, var1, var2);
            if (var3 && var4 > 0) {
               this.b.a(var4);
            }
         }
      }

   }

   private void c(int var1, int var2, int var3) {
      int var4;
      if (this.e) {
         var4 = this.n();
      } else {
         var4 = this.o();
      }

      int var5;
      int var6;
      if (var3 == 8) {
         if (var1 < var2) {
            var5 = var2 + 1;
            var6 = var1;
         } else {
            var5 = var1 + 1;
            var6 = var2;
         }
      } else {
         var5 = var1 + var2;
         var6 = var1;
      }

      this.h.b(var6);
      switch(var3) {
      case 1:
         this.h.b(var1, var2);
         break;
      case 2:
         this.h.a(var1, var2);
         break;
      case 8:
         this.h.a(var1, 1);
         this.h.b(var2, 1);
      }

      if (var5 > var4) {
         if (this.e) {
            var1 = this.o();
         } else {
            var1 = this.n();
         }

         if (var6 <= var1) {
            this.p();
         }
      }

   }

   private void c(em var1, ev var2, boolean var3) {
      int var4 = this.q(Integer.MAX_VALUE);
      if (var4 != Integer.MAX_VALUE) {
         var4 -= this.b.c();
         if (var4 > 0) {
            var4 -= this.c(var4, var1, var2);
            if (var3 && var4 > 0) {
               this.b.a(-var4);
            }
         }
      }

   }

   private boolean c(ev var1, fs var2) {
      int var3;
      if (this.o) {
         var3 = this.w(var1.e());
      } else {
         var3 = this.v(var1.e());
      }

      var2.a = var3;
      var2.b = Integer.MIN_VALUE;
      return true;
   }

   private int i(ev var1) {
      boolean var2 = true;
      int var3 = 0;
      if (this.y() != 0) {
         di var4 = this.b;
         boolean var5;
         if (!this.D) {
            var5 = true;
         } else {
            var5 = false;
         }

         View var6 = this.b(var5);
         if (!this.D) {
            var5 = var2;
         } else {
            var5 = false;
         }

         var3 = fd.a(var1, var4, var6, this.e(var5), this, this.D);
      }

      return var3;
   }

   private int j(ev var1) {
      boolean var2 = true;
      int var3 = 0;
      if (this.y() != 0) {
         di var4 = this.b;
         boolean var5;
         if (!this.D) {
            var5 = true;
         } else {
            var5 = false;
         }

         View var6 = this.b(var5);
         if (!this.D) {
            var5 = var2;
         } else {
            var5 = false;
         }

         var3 = fd.b(var1, var4, var6, this.e(var5), this, this.D);
      }

      return var3;
   }

   private void m(int var1) {
      byte var2 = 1;
      this.l.e = var1;
      ck var3 = this.l;
      boolean var4 = this.e;
      boolean var5;
      if (var1 == -1) {
         var5 = true;
      } else {
         var5 = false;
      }

      byte var6;
      if (var4 == var5) {
         var6 = var2;
      } else {
         var6 = -1;
      }

      var3.d = var6;
   }

   private fv n(int var1) {
      fv var2 = new fv();
      var2.c = new int[this.i];

      for(int var3 = 0; var3 < this.i; ++var3) {
         var2.c[var3] = var1 - this.a[var3].b(var1);
      }

      return var2;
   }

   private fv o(int var1) {
      fv var2 = new fv();
      var2.c = new int[this.i];

      for(int var3 = 0; var3 < this.i; ++var3) {
         var2.c[var3] = this.a[var3].a(var1) - var1;
      }

      return var2;
   }

   private int p(int var1) {
      int var2 = this.a[0].a(var1);

      int var5;
      for(int var3 = 1; var3 < this.i; var2 = var5) {
         int var4 = this.a[var3].a(var1);
         var5 = var2;
         if (var4 > var2) {
            var5 = var4;
         }

         ++var3;
      }

      return var2;
   }

   private void p(View var1) {
      for(int var2 = this.i - 1; var2 >= 0; --var2) {
         this.a[var2].b(var1);
      }

   }

   private int q(int var1) {
      int var2 = this.a[0].a(var1);

      int var5;
      for(int var3 = 1; var3 < this.i; var2 = var5) {
         int var4 = this.a[var3].a(var1);
         var5 = var2;
         if (var4 < var2) {
            var5 = var4;
         }

         ++var3;
      }

      return var2;
   }

   private void q(View var1) {
      for(int var2 = this.i - 1; var2 >= 0; --var2) {
         this.a[var2].a(var1);
      }

   }

   private int r(int var1) {
      int var2 = this.a[0].b(var1);

      int var5;
      for(int var3 = 1; var3 < this.i; var2 = var5) {
         int var4 = this.a[var3].b(var1);
         var5 = var2;
         if (var4 > var2) {
            var5 = var4;
         }

         ++var3;
      }

      return var2;
   }

   private int s(int var1) {
      int var2 = this.a[0].b(var1);

      int var5;
      for(int var3 = 1; var3 < this.i; var2 = var5) {
         int var4 = this.a[var3].b(var1);
         var5 = var2;
         if (var4 < var2) {
            var5 = var4;
         }

         ++var3;
      }

      return var2;
   }

   private boolean t(int var1) {
      boolean var2 = true;
      boolean var3;
      if (this.j == 0) {
         if (var1 == -1) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3 != this.e) {
            var3 = var2;
         } else {
            var3 = false;
         }
      } else {
         if (var1 == -1) {
            var3 = true;
         } else {
            var3 = false;
         }

         boolean var4;
         if (var3 == this.e) {
            var4 = true;
         } else {
            var4 = false;
         }

         var3 = var2;
         if (var4 != this.i()) {
            var3 = false;
         }
      }

      return var3;
   }

   private int u(int var1) {
      byte var2 = -1;
      byte var3 = 1;
      byte var5;
      if (this.y() == 0) {
         if (this.e) {
            var5 = var3;
         } else {
            var5 = -1;
         }
      } else {
         boolean var4;
         if (var1 < this.o()) {
            var4 = true;
         } else {
            var4 = false;
         }

         if (var4 != this.e) {
            var5 = var2;
         } else {
            var5 = 1;
         }
      }

      return var5;
   }

   private int v(int var1) {
      int var2 = this.y();
      int var3 = 0;

      while(true) {
         if (var3 >= var2) {
            var1 = 0;
            break;
         }

         int var4 = this.d(this.i(var3));
         if (var4 >= 0 && var4 < var1) {
            var1 = var4;
            break;
         }

         ++var3;
      }

      return var1;
   }

   private int w(int var1) {
      int var2 = this.y() - 1;

      while(true) {
         if (var2 < 0) {
            var1 = 0;
            break;
         }

         int var3 = this.d(this.i(var2));
         if (var3 >= 0 && var3 < var1) {
            var1 = var3;
            break;
         }

         --var2;
      }

      return var1;
   }

   private int x(int var1) {
      byte var2 = -1;
      int var3 = Integer.MIN_VALUE;
      byte var4 = 1;
      switch(var1) {
      case 1:
         var1 = var2;
         if (this.j != 1) {
            var1 = var2;
            if (this.i()) {
               var1 = 1;
            }
         }
         break;
      case 2:
         if (this.j == 1) {
            var1 = 1;
         } else {
            var1 = var2;
            if (!this.i()) {
               var1 = 1;
            }
         }
         break;
      case 17:
         var1 = var2;
         if (this.j != 0) {
            var1 = Integer.MIN_VALUE;
         }
         break;
      case 33:
         var1 = var2;
         if (this.j != 1) {
            var1 = Integer.MIN_VALUE;
         }
         break;
      case 66:
         if (this.j == 0) {
            var1 = var4;
         } else {
            var1 = Integer.MIN_VALUE;
         }
         break;
      case 130:
         var1 = var3;
         if (this.j == 1) {
            var1 = 1;
         }
         break;
      default:
         var1 = Integer.MIN_VALUE;
      }

      return var1;
   }

   public int a(int var1, em var2, ev var3) {
      return this.c(var1, var2, var3);
   }

   public int a(em var1, ev var2) {
      int var3;
      if (this.j == 0) {
         var3 = this.i;
      } else {
         var3 = super.a(var1, var2);
      }

      return var3;
   }

   public ef a() {
      ft var1;
      if (this.j == 0) {
         var1 = new ft(-2, -1);
      } else {
         var1 = new ft(-1, -2);
      }

      return var1;
   }

   public ef a(Context var1, AttributeSet var2) {
      return new ft(var1, var2);
   }

   public ef a(LayoutParams var1) {
      ft var2;
      if (var1 instanceof MarginLayoutParams) {
         var2 = new ft((MarginLayoutParams)var1);
      } else {
         var2 = new ft(var1);
      }

      return var2;
   }

   public View a(View var1, int var2, em var3, ev var4) {
      int var5 = 0;
      if (this.y() == 0) {
         var1 = null;
      } else {
         View var6 = this.e(var1);
         if (var6 == null) {
            var1 = null;
         } else {
            this.P();
            int var7 = this.x(var2);
            if (var7 == Integer.MIN_VALUE) {
               var1 = null;
            } else {
               ft var9 = (ft)var6.getLayoutParams();
               boolean var8 = var9.b;
               fz var10 = var9.a;
               if (var7 == 1) {
                  var2 = this.n();
               } else {
                  var2 = this.o();
               }

               this.b(var2, var4);
               this.m(var7);
               this.l.c = this.l.d + var2;
               this.l.b = (int)(0.33333334F * (float)this.b.f());
               this.l.h = true;
               this.l.a = false;
               this.a(var3, this.l, var4);
               this.o = this.e;
               if (!var8) {
                  var1 = var10.a(var2, var7);
                  if (var1 != null && var1 != var6) {
                     return var1;
                  }
               }

               if (this.t(var7)) {
                  for(var5 = this.i - 1; var5 >= 0; --var5) {
                     var1 = this.a[var5].a(var2, var7);
                     if (var1 != null && var1 != var6) {
                        return var1;
                     }
                  }
               } else {
                  while(var5 < this.i) {
                     var1 = this.a[var5].a(var2, var7);
                     if (var1 != null && var1 != var6) {
                        return var1;
                     }

                     ++var5;
                  }
               }

               var1 = null;
            }
         }
      }

      return var1;
   }

   public void a(int var1) {
      this.a((String)null);
      if (var1 != this.i) {
         this.h();
         this.i = var1;
         this.m = new BitSet(this.i);
         this.a = new fz[this.i];

         for(var1 = 0; var1 < this.i; ++var1) {
            this.a[var1] = new fz(this, var1);
         }

         this.p();
      }

   }

   public void a(int var1, int var2, ev var3, ed var4) {
      byte var5 = 0;
      if (this.j != 0) {
         var1 = var2;
      }

      if (this.y() != 0 && var1 != 0) {
         this.a(var1, var3);
         if (this.E == null || this.E.length < this.i) {
            this.E = new int[this.i];
         }

         var2 = 0;

         int var7;
         for(var1 = 0; var2 < this.i; var1 = var7) {
            int var6;
            if (this.l.d == -1) {
               var6 = this.l.f - this.a[var2].a(this.l.f);
            } else {
               var6 = this.a[var2].b(this.l.g) - this.l.g;
            }

            var7 = var1;
            if (var6 >= 0) {
               this.E[var1] = var6;
               var7 = var1 + 1;
            }

            ++var2;
         }

         Arrays.sort(this.E, 0, var1);

         for(var2 = var5; var2 < var1 && this.l.a(var3); ++var2) {
            var4.b(this.l.c, this.E[var2]);
            ck var8 = this.l;
            var8.c += this.l.d;
         }
      }

   }

   void a(int var1, ev var2) {
      int var3;
      byte var4;
      if (var1 > 0) {
         var3 = this.n();
         var4 = 1;
      } else {
         var4 = -1;
         var3 = this.o();
      }

      this.l.a = true;
      this.b(var3, var2);
      this.m(var4);
      this.l.c = this.l.d + var3;
      this.l.b = Math.abs(var1);
   }

   public void a(Rect var1, int var2, int var3) {
      int var4 = this.D();
      int var5 = this.F() + var4;
      int var6 = this.E() + this.G();
      if (this.j == 1) {
         var4 = a(var3, var6 + var1.height(), this.K());
         var3 = a(var2, var5 + this.k * this.i, this.J());
         var2 = var4;
      } else {
         var4 = a(var2, var5 + var1.width(), this.J());
         var2 = a(var3, var6 + this.k * this.i, this.K());
         var3 = var4;
      }

      this.e(var3, var2);
   }

   public void a(Parcelable var1) {
      if (var1 instanceof fx) {
         this.y = (fx)var1;
         this.p();
      }

   }

   public void a(dl var1) {
      this.h.a();
      this.p();
   }

   public void a(dl var1, int var2, int var3) {
      this.c(var2, var3, 1);
   }

   public void a(dl var1, int var2, int var3, int var4) {
      this.c(var2, var3, 8);
   }

   public void a(dl var1, int var2, int var3, Object var4) {
      this.c(var2, var3, 4);
   }

   public void a(dl var1, em var2) {
      this.a((Runnable)this.F);

      for(int var3 = 0; var3 < this.i; ++var3) {
         this.a[var3].e();
      }

      var1.requestLayout();
   }

   public void a(dl var1, ev var2, int var3) {
      cs var4 = new cs(var1.getContext());
      var4.d(var3);
      this.a((es)var4);
   }

   public void a(em var1, ev var2, View var3, android.support.v4.view.a.h var4) {
      LayoutParams var7 = var3.getLayoutParams();
      if (!(var7 instanceof ft)) {
         super.a(var3, var4);
      } else {
         ft var8 = (ft)var7;
         int var5;
         int var6;
         if (this.j == 0) {
            var5 = var8.b();
            if (var8.b) {
               var6 = this.i;
            } else {
               var6 = 1;
            }

            var4.b((Object)android.support.v4.view.a.u.a(var5, var6, -1, -1, var8.b, false));
         } else {
            var5 = var8.b();
            if (var8.b) {
               var6 = this.i;
            } else {
               var6 = 1;
            }

            var4.b((Object)android.support.v4.view.a.u.a(-1, -1, var5, var6, var8.b, false));
         }
      }

   }

   public void a(ev var1) {
      super.a(var1);
      this.f = -1;
      this.g = Integer.MIN_VALUE;
      this.y = null;
      this.B.a();
   }

   void a(ev var1, fs var2) {
      if (!this.b(var1, var2) && !this.c(var1, var2)) {
         var2.b();
         var2.a = 0;
      }

   }

   public void a(AccessibilityEvent var1) {
      super.a(var1);
      if (this.y() > 0) {
         android.support.v4.view.a.am var6 = android.support.v4.view.a.a.a(var1);
         View var2 = this.b(false);
         View var3 = this.e(false);
         if (var2 != null && var3 != null) {
            int var4 = this.d(var2);
            int var5 = this.d(var3);
            if (var4 < var5) {
               var6.b(var4);
               var6.c(var5);
            } else {
               var6.b(var5);
               var6.c(var4);
            }
         }
      }

   }

   public void a(String var1) {
      if (this.y == null) {
         super.a(var1);
      }

   }

   public void a(boolean var1) {
      this.a((String)null);
      if (this.y != null && this.y.h != var1) {
         this.y.h = var1;
      }

      this.d = var1;
      this.p();
   }

   public boolean a(ef var1) {
      return var1 instanceof ft;
   }

   public int b(int var1, em var2, ev var3) {
      return this.c(var1, var2, var3);
   }

   public int b(em var1, ev var2) {
      int var3;
      if (this.j == 1) {
         var3 = this.i;
      } else {
         var3 = super.b(var1, var2);
      }

      return var3;
   }

   View b(boolean var1) {
      int var2 = this.b.c();
      int var3 = this.b.d();
      int var4 = this.y();
      int var5 = 0;
      View var6 = null;

      View var9;
      while(true) {
         if (var5 >= var4) {
            var9 = var6;
            break;
         }

         View var7 = this.i(var5);
         int var8 = this.b.a(var7);
         var9 = var6;
         if (this.b.b(var7) > var2) {
            if (var8 >= var3) {
               var9 = var6;
            } else {
               var9 = var7;
               if (var8 >= var2) {
                  break;
               }

               if (!var1) {
                  var9 = var7;
                  break;
               }

               var9 = var6;
               if (var6 == null) {
                  var9 = var7;
               }
            }
         }

         ++var5;
         var6 = var9;
      }

      return var9;
   }

   public void b(int var1) {
      if (var1 != 0 && var1 != 1) {
         throw new IllegalArgumentException("invalid orientation.");
      } else {
         this.a((String)null);
         if (var1 != this.j) {
            this.j = var1;
            di var2 = this.b;
            this.b = this.c;
            this.c = var2;
            this.p();
         }

      }
   }

   public void b(dl var1, int var2, int var3) {
      this.c(var2, var3, 2);
   }

   public boolean b() {
      boolean var1;
      if (this.y == null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean b(ev var1, fs var2) {
      boolean var3 = false;
      boolean var4 = true;
      if (!var1.a() && this.f != -1) {
         if (this.f >= 0 && this.f < var1.e()) {
            if (this.y != null && this.y.a != -1 && this.y.c >= 1) {
               var2.b = Integer.MIN_VALUE;
               var2.a = this.f;
               var3 = var4;
            } else {
               View var6 = this.c(this.f);
               if (var6 != null) {
                  int var5;
                  if (this.e) {
                     var5 = this.n();
                  } else {
                     var5 = this.o();
                  }

                  var2.a = var5;
                  if (this.g != Integer.MIN_VALUE) {
                     if (var2.c) {
                        var2.b = this.b.d() - this.g - this.b.b(var6);
                        var3 = var4;
                     } else {
                        var2.b = this.b.c() + this.g - this.b.a(var6);
                        var3 = var4;
                     }
                  } else if (this.b.e(var6) > this.b.f()) {
                     if (var2.c) {
                        var5 = this.b.d();
                     } else {
                        var5 = this.b.c();
                     }

                     var2.b = var5;
                     var3 = var4;
                  } else {
                     var5 = this.b.a(var6) - this.b.c();
                     if (var5 < 0) {
                        var2.b = -var5;
                        var3 = var4;
                     } else {
                        var5 = this.b.d() - this.b.b(var6);
                        if (var5 < 0) {
                           var2.b = var5;
                           var3 = var4;
                        } else {
                           var2.b = Integer.MIN_VALUE;
                           var3 = var4;
                        }
                     }
                  }
               } else {
                  var2.a = this.f;
                  if (this.g == Integer.MIN_VALUE) {
                     if (this.u(var2.a) == 1) {
                        var3 = true;
                     }

                     var2.c = var3;
                     var2.b();
                  } else {
                     var2.a(this.g);
                  }

                  var2.d = true;
                  var3 = var4;
               }
            }
         } else {
            this.f = -1;
            this.g = Integer.MIN_VALUE;
            var3 = false;
         }
      } else {
         var3 = false;
      }

      return var3;
   }

   int c(int var1, em var2, ev var3) {
      if (this.y() != 0 && var1 != 0) {
         this.a(var1, var3);
         int var4 = this.a(var2, this.l, var3);
         if (this.l.b >= var4) {
            if (var1 < 0) {
               var1 = -var4;
            } else {
               var1 = var4;
            }
         }

         this.b.a(-var1);
         this.o = this.e;
         this.l.b = 0;
         this.a(var2, this.l);
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int c(ev var1) {
      return this.b(var1);
   }

   public Parcelable c() {
      fx var1;
      if (this.y != null) {
         var1 = new fx(this.y);
      } else {
         var1 = new fx();
         var1.h = this.d;
         var1.i = this.o;
         var1.j = this.x;
         if (this.h != null && this.h.a != null) {
            var1.f = this.h.a;
            var1.e = var1.f.length;
            var1.g = this.h.b;
         } else {
            var1.e = 0;
         }

         if (this.y() > 0) {
            int var2;
            if (this.o) {
               var2 = this.n();
            } else {
               var2 = this.o();
            }

            var1.a = var2;
            var1.b = this.j();
            var1.c = this.i;
            var1.d = new int[this.i];

            for(int var3 = 0; var3 < this.i; ++var3) {
               int var4;
               if (this.o) {
                  var4 = this.a[var3].b(Integer.MIN_VALUE);
                  var2 = var4;
                  if (var4 != Integer.MIN_VALUE) {
                     var2 = var4 - this.b.d();
                  }
               } else {
                  var4 = this.a[var3].a(Integer.MIN_VALUE);
                  var2 = var4;
                  if (var4 != Integer.MIN_VALUE) {
                     var2 = var4 - this.b.c();
                  }
               }

               var1.d[var3] = var2;
            }
         } else {
            var1.a = -1;
            var1.b = -1;
            var1.c = 0;
         }
      }

      return var1;
   }

   public void c(em var1, ev var2) {
      this.a(var1, var2, true);
   }

   public int d(ev var1) {
      return this.b(var1);
   }

   public PointF d(int var1) {
      var1 = this.u(var1);
      PointF var2 = new PointF();
      if (var1 == 0) {
         var2 = null;
      } else if (this.j == 0) {
         var2.x = (float)var1;
         var2.y = 0.0F;
      } else {
         var2.x = 0.0F;
         var2.y = (float)var1;
      }

      return var2;
   }

   public boolean d() {
      boolean var1;
      if (this.j == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int e(ev var1) {
      return this.i(var1);
   }

   View e(boolean var1) {
      int var2 = this.b.c();
      int var3 = this.b.d();
      int var4 = this.y() - 1;
      View var5 = null;

      View var9;
      while(true) {
         if (var4 < 0) {
            var9 = var5;
            break;
         }

         View var6 = this.i(var4);
         int var7 = this.b.a(var6);
         int var8 = this.b.b(var6);
         var9 = var5;
         if (var8 > var2) {
            if (var7 >= var3) {
               var9 = var5;
            } else {
               var9 = var6;
               if (var8 <= var3) {
                  break;
               }

               if (!var1) {
                  var9 = var6;
                  break;
               }

               var9 = var5;
               if (var5 == null) {
                  var9 = var6;
               }
            }
         }

         --var4;
         var5 = var9;
      }

      return var9;
   }

   public void e(int var1) {
      if (this.y != null && this.y.a != var1) {
         this.y.b();
      }

      this.f = var1;
      this.g = Integer.MIN_VALUE;
      this.p();
   }

   public boolean e() {
      boolean var1 = true;
      if (this.j != 1) {
         var1 = false;
      }

      return var1;
   }

   public int f(ev var1) {
      return this.i(var1);
   }

   void f(int var1) {
      this.k = var1 / this.i;
      this.z = MeasureSpec.makeMeasureSpec(var1, this.c.h());
   }

   boolean f() {
      boolean var1 = true;
      if (this.y() != 0 && this.n != 0 && this.s()) {
         int var2;
         int var3;
         if (this.e) {
            var2 = this.n();
            var3 = this.o();
         } else {
            var2 = this.o();
            var3 = this.n();
         }

         if (var2 == 0 && this.g() != null) {
            this.h.a();
            this.M();
            this.p();
         } else if (!this.C) {
            var1 = false;
         } else {
            byte var4;
            if (this.e) {
               var4 = -1;
            } else {
               var4 = 1;
            }

            fv var5 = this.h.a(var2, var3 + 1, var4, true);
            if (var5 == null) {
               this.C = false;
               this.h.a(var3 + 1);
               var1 = false;
            } else {
               fv var6 = this.h.a(var2, var5.a, var4 * -1, true);
               if (var6 == null) {
                  this.h.a(var5.a);
               } else {
                  this.h.a(var6.a + 1);
               }

               this.M();
               this.p();
            }
         }
      } else {
         var1 = false;
      }

      return var1;
   }

   public int g(ev var1) {
      return this.j(var1);
   }

   View g() {
      int var1 = this.y() - 1;
      BitSet var2 = new BitSet(this.i);
      var2.set(0, this.i, true);
      byte var3;
      if (this.j == 1 && this.i()) {
         var3 = 1;
      } else {
         var3 = -1;
      }

      int var4;
      if (this.e) {
         var4 = -1;
      } else {
         var4 = var1 + 1;
         var1 = 0;
      }

      byte var5;
      if (var1 < var4) {
         var5 = 1;
      } else {
         var5 = -1;
      }

      int var6 = var1;

      View var7;
      while(true) {
         if (var6 == var4) {
            var7 = null;
            break;
         }

         var7 = this.i(var6);
         ft var8 = (ft)var7.getLayoutParams();
         if (var2.get(var8.a.e)) {
            if (this.a(var8.a)) {
               break;
            }

            var2.clear(var8.a.e);
         }

         if (!var8.b && var6 + var5 != var4) {
            View var9;
            boolean var11;
            label65: {
               var9 = this.i(var6 + var5);
               int var10;
               if (this.e) {
                  var10 = this.b.b(var7);
                  var1 = this.b.b(var9);
                  if (var10 < var1) {
                     break;
                  }

                  if (var10 == var1) {
                     var11 = true;
                     break label65;
                  }
               } else {
                  var10 = this.b.a(var7);
                  var1 = this.b.a(var9);
                  if (var10 > var1) {
                     break;
                  }

                  if (var10 == var1) {
                     var11 = true;
                     break label65;
                  }
               }

               var11 = false;
            }

            if (var11) {
               ft var12 = (ft)var9.getLayoutParams();
               if (var8.a.e - var12.a.e < 0) {
                  var11 = true;
               } else {
                  var11 = false;
               }

               boolean var13;
               if (var3 < 0) {
                  var13 = true;
               } else {
                  var13 = false;
               }

               if (var11 != var13) {
                  break;
               }
            }
         }

         var6 += var5;
      }

      return var7;
   }

   public int h(ev var1) {
      return this.j(var1);
   }

   public void h() {
      this.h.a();
      this.p();
   }

   boolean i() {
      boolean var1 = true;
      if (this.v() != 1) {
         var1 = false;
      }

      return var1;
   }

   int j() {
      View var1;
      if (this.e) {
         var1 = this.e(true);
      } else {
         var1 = this.b(true);
      }

      int var2;
      if (var1 == null) {
         var2 = -1;
      } else {
         var2 = this.d(var1);
      }

      return var2;
   }

   public void j(int var1) {
      super.j(var1);

      for(int var2 = 0; var2 < this.i; ++var2) {
         this.a[var2].d(var1);
      }

   }

   public void k(int var1) {
      super.k(var1);

      for(int var2 = 0; var2 < this.i; ++var2) {
         this.a[var2].d(var1);
      }

   }

   public void l(int var1) {
      if (var1 == 0) {
         this.f();
      }

   }

   boolean l() {
      boolean var1 = true;
      int var2 = this.a[0].b(Integer.MIN_VALUE);
      int var3 = 1;

      boolean var4;
      while(true) {
         var4 = var1;
         if (var3 >= this.i) {
            break;
         }

         if (this.a[var3].b(Integer.MIN_VALUE) != var2) {
            var4 = false;
            break;
         }

         ++var3;
      }

      return var4;
   }

   boolean m() {
      boolean var1 = true;
      int var2 = this.a[0].a(Integer.MIN_VALUE);
      int var3 = 1;

      boolean var4;
      while(true) {
         var4 = var1;
         if (var3 >= this.i) {
            break;
         }

         if (this.a[var3].a(Integer.MIN_VALUE) != var2) {
            var4 = false;
            break;
         }

         ++var3;
      }

      return var4;
   }

   int n() {
      int var1 = this.y();
      if (var1 == 0) {
         var1 = 0;
      } else {
         var1 = this.d(this.i(var1 - 1));
      }

      return var1;
   }

   int o() {
      int var1 = 0;
      if (this.y() != 0) {
         var1 = this.d(this.i(0));
      }

      return var1;
   }
}
