package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends ec implements eu {
   private cp a;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private boolean f;
   private final co g;
   private int h;
   int i;
   di j;
   boolean k;
   int l;
   int m;
   cq n;
   final cn o;

   public LinearLayoutManager(Context var1) {
      this(var1, 1, false);
   }

   public LinearLayoutManager(Context var1, int var2, boolean var3) {
      this.c = false;
      this.k = false;
      this.d = false;
      this.e = true;
      this.l = -1;
      this.m = Integer.MIN_VALUE;
      this.n = null;
      this.o = new cn(this);
      this.g = new co();
      this.h = 2;
      this.b(var2);
      this.b(var3);
      this.c(true);
   }

   public LinearLayoutManager(Context var1, AttributeSet var2, int var3, int var4) {
      this.c = false;
      this.k = false;
      this.d = false;
      this.e = true;
      this.l = -1;
      this.m = Integer.MIN_VALUE;
      this.n = null;
      this.o = new cn(this);
      this.g = new co();
      this.h = 2;
      ee var5 = a(var1, var2, var3, var4);
      this.b(var5.a);
      this.b(var5.c);
      this.a(var5.d);
      this.c(true);
   }

   private void O() {
      boolean var1 = true;
      if (this.i != 1 && this.g()) {
         if (this.c) {
            var1 = false;
         }

         this.k = var1;
      } else {
         this.k = this.c;
      }

   }

   private View P() {
      int var1;
      if (this.k) {
         var1 = this.y() - 1;
      } else {
         var1 = 0;
      }

      return this.i(var1);
   }

   private View Q() {
      int var1;
      if (this.k) {
         var1 = 0;
      } else {
         var1 = this.y() - 1;
      }

      return this.i(var1);
   }

   private int a(int var1, em var2, ev var3, boolean var4) {
      int var5 = this.j.d() - var1;
      if (var5 > 0) {
         int var6 = -this.c(-var5, var2, var3);
         var5 = var6;
         if (var4) {
            var1 = this.j.d() - (var1 + var6);
            var5 = var6;
            if (var1 > 0) {
               this.j.a(var1);
               var5 = var6 + var1;
            }
         }
      } else {
         var5 = 0;
      }

      return var5;
   }

   private View a(boolean var1, boolean var2) {
      View var3;
      if (this.k) {
         var3 = this.a(this.y() - 1, -1, var1, var2);
      } else {
         var3 = this.a(0, this.y(), var1, var2);
      }

      return var3;
   }

   private void a(int var1, int var2) {
      this.a.c = this.j.d() - var2;
      cp var3 = this.a;
      byte var4;
      if (this.k) {
         var4 = -1;
      } else {
         var4 = 1;
      }

      var3.e = var4;
      this.a.d = var1;
      this.a.f = 1;
      this.a.b = var2;
      this.a.g = Integer.MIN_VALUE;
   }

   private void a(int var1, int var2, boolean var3, ev var4) {
      byte var5 = -1;
      byte var6 = 1;
      this.a.l = this.j();
      this.a.h = this.b(var4);
      this.a.f = var1;
      cp var7;
      byte var8;
      cp var9;
      View var10;
      if (var1 == 1) {
         var9 = this.a;
         var9.h += this.j.g();
         var10 = this.Q();
         var7 = this.a;
         if (this.k) {
            var8 = var5;
         } else {
            var8 = 1;
         }

         var7.e = var8;
         this.a.d = this.d(var10) + this.a.e;
         this.a.b = this.j.b(var10);
         var1 = this.j.b(var10) - this.j.d();
      } else {
         var10 = this.P();
         var7 = this.a;
         var7.h += this.j.c();
         var7 = this.a;
         if (this.k) {
            var8 = var6;
         } else {
            var8 = -1;
         }

         var7.e = var8;
         this.a.d = this.d(var10) + this.a.e;
         this.a.b = this.j.a(var10);
         var1 = -this.j.a(var10) + this.j.c();
      }

      this.a.c = var2;
      if (var3) {
         var9 = this.a;
         var9.c -= var1;
      }

      this.a.g = var1;
   }

   private void a(cn var1) {
      this.a(var1.a, var1.b);
   }

   private void a(em var1, int var2) {
      if (var2 >= 0) {
         int var3 = this.y();
         int var4;
         View var5;
         if (this.k) {
            for(var4 = var3 - 1; var4 >= 0; --var4) {
               var5 = this.i(var4);
               if (this.j.b(var5) > var2 || this.j.c(var5) > var2) {
                  this.a(var1, var3 - 1, var4);
                  break;
               }
            }
         } else {
            for(var4 = 0; var4 < var3; ++var4) {
               var5 = this.i(var4);
               if (this.j.b(var5) > var2 || this.j.c(var5) > var2) {
                  this.a(var1, 0, var4);
                  break;
               }
            }
         }
      }

   }

   private void a(em var1, int var2, int var3) {
      if (var2 != var3) {
         int var4 = var2;
         if (var3 > var2) {
            --var3;

            while(var3 >= var2) {
               this.a(var3, var1);
               --var3;
            }
         } else {
            while(var4 > var3) {
               this.a(var4, var1);
               --var4;
            }
         }
      }

   }

   private void a(em var1, cp var2) {
      if (var2.a && !var2.l) {
         if (var2.f == -1) {
            this.b(var1, var2.g);
         } else {
            this.a(var1, var2.g);
         }
      }

   }

   private void a(em var1, ev var2, cn var3) {
      if (!this.a(var2, var3) && !this.b(var1, var2, var3)) {
         var3.b();
         int var4;
         if (this.d) {
            var4 = var2.e() - 1;
         } else {
            var4 = 0;
         }

         var3.a = var4;
      }

   }

   private boolean a(ev var1, cn var2) {
      boolean var3 = false;
      boolean var4 = true;
      boolean var5;
      if (!var1.a() && this.l != -1) {
         if (this.l >= 0 && this.l < var1.e()) {
            var2.a = this.l;
            if (this.n != null && this.n.a()) {
               var2.c = this.n.c;
               if (var2.c) {
                  var2.b = this.j.d() - this.n.b;
                  var5 = var4;
               } else {
                  var2.b = this.j.c() + this.n.b;
                  var5 = var4;
               }
            } else if (this.m == Integer.MIN_VALUE) {
               View var7 = this.c(this.l);
               int var6;
               if (var7 != null) {
                  if (this.j.e(var7) > this.j.f()) {
                     var2.b();
                     var5 = var4;
                  } else if (this.j.a(var7) - this.j.c() < 0) {
                     var2.b = this.j.c();
                     var2.c = false;
                     var5 = var4;
                  } else if (this.j.d() - this.j.b(var7) < 0) {
                     var2.b = this.j.d();
                     var2.c = true;
                     var5 = var4;
                  } else {
                     if (var2.c) {
                        var6 = this.j.b(var7) + this.j.b();
                     } else {
                        var6 = this.j.a(var7);
                     }

                     var2.b = var6;
                     var5 = var4;
                  }
               } else {
                  if (this.y() > 0) {
                     var6 = this.d(this.i(0));
                     if (this.l < var6) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     if (var5 == this.k) {
                        var3 = true;
                     }

                     var2.c = var3;
                  }

                  var2.b();
                  var5 = var4;
               }
            } else {
               var2.c = this.k;
               if (this.k) {
                  var2.b = this.j.d() - this.m;
                  var5 = var4;
               } else {
                  var2.b = this.j.c() + this.m;
                  var5 = var4;
               }
            }
         } else {
            this.l = -1;
            this.m = Integer.MIN_VALUE;
            var5 = false;
         }
      } else {
         var5 = false;
      }

      return var5;
   }

   private int b(int var1, em var2, ev var3, boolean var4) {
      int var5 = var1 - this.j.c();
      if (var5 > 0) {
         int var6 = -this.c(var5, var2, var3);
         var5 = var6;
         if (var4) {
            var1 = var1 + var6 - this.j.c();
            var5 = var6;
            if (var1 > 0) {
               this.j.a(-var1);
               var5 = var6 - var1;
            }
         }
      } else {
         var5 = 0;
      }

      return var5;
   }

   private View b(boolean var1, boolean var2) {
      View var3;
      if (this.k) {
         var3 = this.a(0, this.y(), var1, var2);
      } else {
         var3 = this.a(this.y() - 1, -1, var1, var2);
      }

      return var3;
   }

   private void b(cn var1) {
      this.f(var1.a, var1.b);
   }

   private void b(em var1, int var2) {
      int var3 = this.y();
      if (var2 >= 0) {
         int var4 = this.j.e() - var2;
         View var5;
         if (this.k) {
            for(var2 = 0; var2 < var3; ++var2) {
               var5 = this.i(var2);
               if (this.j.a(var5) < var4 || this.j.d(var5) < var4) {
                  this.a(var1, 0, var2);
                  break;
               }
            }
         } else {
            for(var2 = var3 - 1; var2 >= 0; --var2) {
               var5 = this.i(var2);
               if (this.j.a(var5) < var4 || this.j.d(var5) < var4) {
                  this.a(var1, var3 - 1, var2);
                  break;
               }
            }
         }
      }

   }

   private void b(em var1, ev var2, int var3, int var4) {
      if (var2.b() && this.y() != 0 && !var2.a() && this.b()) {
         int var5 = 0;
         int var6 = 0;
         List var7 = var1.c();
         int var8 = var7.size();
         int var9 = this.d(this.i(0));

         int var12;
         for(int var10 = 0; var10 < var8; var10 = var12) {
            ey var11 = (ey)var7.get(var10);
            if (var11.r()) {
               var12 = var6;
               var6 = var5;
               var5 = var12;
            } else {
               boolean var13;
               if (var11.e() < var9) {
                  var13 = true;
               } else {
                  var13 = false;
               }

               byte var14;
               if (var13 != this.k) {
                  var14 = -1;
               } else {
                  var14 = 1;
               }

               if (var14 == -1) {
                  var12 = this.j.e(var11.a) + var5;
                  var5 = var6;
                  var6 = var12;
               } else {
                  var12 = this.j.e(var11.a) + var6;
                  var6 = var5;
                  var5 = var12;
               }
            }

            var12 = var10 + 1;
            var10 = var6;
            var6 = var5;
            var5 = var10;
         }

         this.a.k = var7;
         if (var5 > 0) {
            this.f(this.d(this.P()), var3);
            this.a.h = var5;
            this.a.c = 0;
            this.a.a();
            this.a(var1, this.a, var2, false);
         }

         if (var6 > 0) {
            this.a(this.d(this.Q()), var4);
            this.a.h = var6;
            this.a.c = 0;
            this.a.a();
            this.a(var1, this.a, var2, false);
         }

         this.a.k = null;
      }

   }

   private boolean b(em var1, ev var2, cn var3) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6;
      if (this.y() == 0) {
         var6 = var5;
      } else {
         View var7 = this.H();
         if (var7 != null && var3.a(var7, var2)) {
            var3.a(var7);
            var6 = true;
         } else {
            var6 = var5;
            if (this.b == this.d) {
               View var8;
               if (var3.c) {
                  var8 = this.f(var1, var2);
               } else {
                  var8 = this.g(var1, var2);
               }

               var6 = var5;
               if (var8 != null) {
                  var3.b(var8);
                  if (!var2.a() && this.b()) {
                     if (this.j.a(var8) >= this.j.d() || this.j.b(var8) < this.j.c()) {
                        var4 = true;
                     }

                     if (var4) {
                        int var9;
                        if (var3.c) {
                           var9 = this.j.d();
                        } else {
                           var9 = this.j.c();
                        }

                        var3.b = var9;
                     }
                  }

                  var6 = true;
               }
            }
         }
      }

      return var6;
   }

   private View f(em var1, ev var2) {
      View var3;
      if (this.k) {
         var3 = this.h(var1, var2);
      } else {
         var3 = this.i(var1, var2);
      }

      return var3;
   }

   private void f(int var1, int var2) {
      this.a.c = var2 - this.j.c();
      this.a.d = var1;
      cp var3 = this.a;
      byte var4;
      if (this.k) {
         var4 = 1;
      } else {
         var4 = -1;
      }

      var3.e = var4;
      this.a.f = -1;
      this.a.b = var2;
      this.a.g = Integer.MIN_VALUE;
   }

   private View g(em var1, ev var2) {
      View var3;
      if (this.k) {
         var3 = this.i(var1, var2);
      } else {
         var3 = this.h(var1, var2);
      }

      return var3;
   }

   private View h(em var1, ev var2) {
      return this.a(var1, var2, 0, this.y(), var2.e());
   }

   private int i(ev var1) {
      boolean var2 = false;
      int var3 = 0;
      if (this.y() != 0) {
         this.h();
         di var4 = this.j;
         boolean var5;
         if (!this.e) {
            var5 = true;
         } else {
            var5 = false;
         }

         View var6 = this.a(var5, true);
         var5 = var2;
         if (!this.e) {
            var5 = true;
         }

         var3 = fd.a(var1, var4, var6, this.b(var5, true), this, this.e, this.k);
      }

      return var3;
   }

   private View i(em var1, ev var2) {
      return this.a(var1, var2, this.y() - 1, -1, var2.e());
   }

   private int j(ev var1) {
      boolean var2 = false;
      int var3 = 0;
      if (this.y() != 0) {
         this.h();
         di var4 = this.j;
         boolean var5;
         if (!this.e) {
            var5 = true;
         } else {
            var5 = false;
         }

         View var6 = this.a(var5, true);
         var5 = var2;
         if (!this.e) {
            var5 = true;
         }

         var3 = fd.a(var1, var4, var6, this.b(var5, true), this, this.e);
      }

      return var3;
   }

   private int k(ev var1) {
      boolean var2 = false;
      int var3 = 0;
      if (this.y() != 0) {
         this.h();
         di var4 = this.j;
         boolean var5;
         if (!this.e) {
            var5 = true;
         } else {
            var5 = false;
         }

         View var6 = this.a(var5, true);
         var5 = var2;
         if (!this.e) {
            var5 = true;
         }

         var3 = fd.b(var1, var4, var6, this.b(var5, true), this, this.e);
      }

      return var3;
   }

   public int a(int var1, em var2, ev var3) {
      if (this.i == 1) {
         var1 = 0;
      } else {
         var1 = this.c(var1, var2, var3);
      }

      return var1;
   }

   int a(em var1, cp var2, ev var3, boolean var4) {
      int var5 = var2.c;
      if (var2.g != Integer.MIN_VALUE) {
         if (var2.c < 0) {
            var2.g += var2.c;
         }

         this.a(var1, var2);
      }

      int var6 = var2.c + var2.h;
      co var7 = this.g;

      while((var2.l || var6 > 0) && var2.a(var3)) {
         var7.a();
         this.a(var1, var3, var2, var7);
         if (var7.b) {
            break;
         }

         int var8;
         label44: {
            var2.b += var7.a * var2.f;
            if (var7.c && this.a.k == null) {
               var8 = var6;
               if (var3.a()) {
                  break label44;
               }
            }

            var2.c -= var7.a;
            var8 = var6 - var7.a;
         }

         if (var2.g != Integer.MIN_VALUE) {
            var2.g += var7.a;
            if (var2.c < 0) {
               var2.g += var2.c;
            }

            this.a(var1, var2);
         }

         var6 = var8;
         if (var4) {
            var6 = var8;
            if (var7.d) {
               break;
            }
         }
      }

      return var5 - var2.c;
   }

   public ef a() {
      return new ef(-2, -2);
   }

   View a(int var1, int var2, boolean var3, boolean var4) {
      this.h();
      int var5 = this.j.c();
      int var6 = this.j.d();
      byte var7;
      if (var2 > var1) {
         var7 = 1;
      } else {
         var7 = -1;
      }

      View var8 = null;

      View var12;
      while(true) {
         if (var1 == var2) {
            var12 = var8;
            break;
         }

         View var9 = this.i(var1);
         int var10 = this.j.a(var9);
         int var11 = this.j.b(var9);
         if (var10 < var6 && var11 > var5) {
            var12 = var9;
            if (!var3) {
               break;
            }

            if (var10 >= var5 && var11 <= var6) {
               var12 = var9;
               break;
            }

            if (var4 && var8 == null) {
               var8 = var9;
            }
         }

         var1 += var7;
      }

      return var12;
   }

   View a(em var1, ev var2, int var3, int var4, int var5) {
      View var13 = null;
      this.h();
      int var6 = this.j.c();
      int var7 = this.j.d();
      byte var8;
      if (var4 > var3) {
         var8 = 1;
      } else {
         var8 = -1;
      }

      View var12 = null;

      View var11;
      while(true) {
         if (var3 == var4) {
            if (var13 == null) {
               var13 = var12;
            }

            var11 = var13;
            break;
         }

         View var9 = this.i(var3);
         int var10 = this.d(var9);
         if (var10 >= 0 && var10 < var5) {
            if (((ef)var9.getLayoutParams()).d()) {
               if (var12 == null) {
                  var12 = var9;
               }
            } else {
               if (this.j.a(var9) < var7) {
                  var11 = var9;
                  if (this.j.b(var9) >= var6) {
                     break;
                  }
               }

               if (var13 == null) {
                  var13 = var9;
               }
            }
         }

         var3 += var8;
      }

      return var11;
   }

   public View a(View var1, int var2, em var3, ev var4) {
      Object var5 = null;
      this.O();
      View var6;
      if (this.y() == 0) {
         var6 = (View)var5;
      } else {
         var2 = this.f(var2);
         var6 = (View)var5;
         if (var2 != Integer.MIN_VALUE) {
            this.h();
            View var7;
            if (var2 == -1) {
               var7 = this.g(var3, var4);
            } else {
               var7 = this.f(var3, var4);
            }

            var6 = (View)var5;
            if (var7 != null) {
               this.h();
               this.a(var2, (int)(0.33333334F * (float)this.j.f()), false, var4);
               this.a.g = Integer.MIN_VALUE;
               this.a.a = false;
               this.a(var3, this.a, var4, true);
               if (var2 == -1) {
                  var1 = this.P();
               } else {
                  var1 = this.Q();
               }

               var6 = (View)var5;
               if (var1 != var7) {
                  var6 = (View)var5;
                  if (var1.isFocusable()) {
                     var6 = var1;
                  }
               }
            }
         }
      }

      return var6;
   }

   public void a(int var1, int var2, ev var3, ed var4) {
      if (this.i != 0) {
         var1 = var2;
      }

      if (this.y() != 0 && var1 != 0) {
         byte var5;
         if (var1 > 0) {
            var5 = 1;
         } else {
            var5 = -1;
         }

         this.a(var5, Math.abs(var1), true, var3);
         this.a(var3, this.a, var4);
      }

   }

   public void a(int var1, ed var2) {
      boolean var3;
      int var4;
      if (this.n != null && this.n.a()) {
         var3 = this.n.c;
         var4 = this.n.a;
      } else {
         this.O();
         var3 = this.k;
         if (this.l == -1) {
            if (var3) {
               var4 = var1 - 1;
            } else {
               var4 = 0;
            }
         } else {
            var4 = this.l;
         }
      }

      byte var5;
      if (var3) {
         var5 = -1;
      } else {
         var5 = 1;
      }

      for(int var6 = 0; var6 < this.h && var4 >= 0 && var4 < var1; ++var6) {
         var2.b(var4, 0);
         var4 += var5;
      }

   }

   public void a(Parcelable var1) {
      if (var1 instanceof cq) {
         this.n = (cq)var1;
         this.p();
      }

   }

   public void a(dl var1, em var2) {
      super.a(var1, var2);
      if (this.f) {
         this.c(var2);
         var2.a();
      }

   }

   public void a(dl var1, ev var2, int var3) {
      cs var4 = new cs(var1.getContext());
      var4.d(var3);
      this.a((es)var4);
   }

   void a(em var1, ev var2, cn var3, int var4) {
   }

   void a(em var1, ev var2, cp var3, co var4) {
      View var11 = var3.a(var1);
      if (var11 == null) {
         var4.b = true;
      } else {
         ef var12 = (ef)var11.getLayoutParams();
         boolean var5;
         boolean var6;
         if (var3.k == null) {
            var5 = this.k;
            if (var3.f == -1) {
               var6 = true;
            } else {
               var6 = false;
            }

            if (var5 == var6) {
               this.b((View)var11);
            } else {
               this.b(var11, 0);
            }
         } else {
            var5 = this.k;
            if (var3.f == -1) {
               var6 = true;
            } else {
               var6 = false;
            }

            if (var5 == var6) {
               this.a((View)var11);
            } else {
               this.a(var11, 0);
            }
         }

         this.a(var11, 0, 0);
         var4.a = this.j.e(var11);
         int var7;
         int var8;
         int var9;
         int var10;
         if (this.i == 1) {
            if (this.g()) {
               var7 = this.B() - this.F();
               var8 = var7 - this.j.f(var11);
            } else {
               var8 = this.D();
               var7 = this.j.f(var11) + var8;
            }

            if (var3.f == -1) {
               var9 = var3.b;
               var10 = var3.b - var4.a;
            } else {
               var10 = var3.b;
               var9 = var3.b;
               var9 += var4.a;
            }
         } else {
            var10 = this.E();
            var9 = var10 + this.j.f(var11);
            if (var3.f == -1) {
               var7 = var3.b;
               var8 = var3.b - var4.a;
            } else {
               var8 = var3.b;
               var7 = var3.b + var4.a;
            }
         }

         this.a(var11, var8, var10, var7, var9);
         if (var12.d() || var12.e()) {
            var4.c = true;
         }

         var4.d = var11.isFocusable();
      }

   }

   public void a(ev var1) {
      super.a(var1);
      this.n = null;
      this.l = -1;
      this.m = Integer.MIN_VALUE;
      this.o.a();
   }

   void a(ev var1, cp var2, ed var3) {
      int var4 = var2.d;
      if (var4 >= 0 && var4 < var1.e()) {
         var3.b(var4, var2.g);
      }

   }

   public void a(AccessibilityEvent var1) {
      super.a(var1);
      if (this.y() > 0) {
         android.support.v4.view.a_package.am var2 = android.support.v4.view.a.a.a(var1);
         var2.b(this.l());
         var2.c(this.n());
      }

   }

   public void a(String var1) {
      if (this.n == null) {
         super.a(var1);
      }

   }

   public void a(boolean var1) {
      this.a((String)null);
      if (this.d != var1) {
         this.d = var1;
         this.p();
      }

   }

   public int b(int var1, em var2, ev var3) {
      if (this.i == 0) {
         var1 = 0;
      } else {
         var1 = this.c(var1, var2, var3);
      }

      return var1;
   }

   protected int b(ev var1) {
      int var2;
      if (var1.d()) {
         var2 = this.j.f();
      } else {
         var2 = 0;
      }

      return var2;
   }

   public void b(int var1) {
      if (var1 != 0 && var1 != 1) {
         throw new IllegalArgumentException("invalid orientation:" + var1);
      } else {
         this.a((String)null);
         if (var1 != this.i) {
            this.i = var1;
            this.j = null;
            this.p();
         }

      }
   }

   public void b(boolean var1) {
      this.a((String)null);
      if (var1 != this.c) {
         this.c = var1;
         this.p();
      }

   }

   public boolean b() {
      boolean var1;
      if (this.n == null && this.b == this.d) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   int c(int var1, em var2, ev var3) {
      if (this.y() != 0 && var1 != 0) {
         this.a.a = true;
         this.h();
         byte var4;
         if (var1 > 0) {
            var4 = 1;
         } else {
            var4 = -1;
         }

         int var5 = Math.abs(var1);
         this.a(var4, var5, true, var3);
         int var6 = this.a.g + this.a(var2, this.a, var3, false);
         if (var6 < 0) {
            var1 = 0;
         } else {
            if (var5 > var6) {
               var1 = var4 * var6;
            }

            this.j.a(-var1);
            this.a.j = var1;
         }
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int c(ev var1) {
      return this.i(var1);
   }

   public Parcelable c() {
      cq var1;
      if (this.n != null) {
         var1 = new cq(this.n);
      } else {
         var1 = new cq();
         if (this.y() > 0) {
            this.h();
            boolean var2 = this.b ^ this.k;
            var1.c = var2;
            View var3;
            if (var2) {
               var3 = this.Q();
               var1.b = this.j.d() - this.j.b(var3);
               var1.a = this.d(var3);
            } else {
               var3 = this.P();
               var1.a = this.d(var3);
               var1.b = this.j.a(var3) - this.j.c();
            }
         } else {
            var1.b();
         }
      }

      return var1;
   }

   public View c(int var1) {
      int var2 = this.y();
      View var3;
      if (var2 == 0) {
         var3 = null;
      } else {
         int var4 = var1 - this.d(this.i(0));
         if (var4 >= 0 && var4 < var2) {
            View var5 = this.i(var4);
            var3 = var5;
            if (this.d(var5) == var1) {
               return var3;
            }
         }

         var3 = super.c(var1);
      }

      return var3;
   }

   public void c(em var1, ev var2) {
      byte var3 = -1;
      if ((this.n != null || this.l != -1) && var2.e() == 0) {
         this.c(var1);
      } else {
         if (this.n != null && this.n.a()) {
            this.l = this.n.a;
         }

         this.h();
         this.a.a = false;
         this.O();
         if (!this.o.d || this.l != -1 || this.n != null) {
            this.o.a();
            this.o.c = this.k ^ this.d;
            this.a(var1, var2, this.o);
            this.o.d = true;
         }

         int var4 = this.b(var2);
         int var5;
         if (this.a.j >= 0) {
            var5 = 0;
         } else {
            var5 = var4;
            var4 = 0;
         }

         int var6 = var5 + this.j.c();
         int var7 = var4 + this.j.g();
         var4 = var7;
         var5 = var6;
         if (var2.a()) {
            var4 = var7;
            var5 = var6;
            if (this.l != -1) {
               var4 = var7;
               var5 = var6;
               if (this.m != Integer.MIN_VALUE) {
                  View var8 = this.c(this.l);
                  var4 = var7;
                  var5 = var6;
                  if (var8 != null) {
                     if (this.k) {
                        var4 = this.j.d() - this.j.b(var8) - this.m;
                     } else {
                        var4 = this.j.a(var8);
                        var5 = this.j.c();
                        var4 = this.m - (var4 - var5);
                     }

                     if (var4 > 0) {
                        var5 = var6 + var4;
                        var4 = var7;
                     } else {
                        var4 = var7 - var4;
                        var5 = var6;
                     }
                  }
               }
            }
         }

         if (this.o.c) {
            if (this.k) {
               var3 = 1;
            }
         } else if (!this.k) {
            var3 = 1;
         }

         this.a(var1, var2, this.o, var3);
         this.a((em)var1);
         this.a.l = this.j();
         this.a.i = var2.a();
         int var9;
         cp var10;
         if (this.o.c) {
            this.b(this.o);
            this.a.h = var5;
            this.a(var1, this.a, var2, false);
            var6 = this.a.b;
            var7 = this.a.d;
            var5 = var4;
            if (this.a.c > 0) {
               var5 = var4 + this.a.c;
            }

            this.a(this.o);
            this.a.h = var5;
            var10 = this.a;
            var10.d += this.a.e;
            this.a(var1, this.a, var2, false);
            var9 = this.a.b;
            if (this.a.c > 0) {
               var4 = this.a.c;
               this.f(var7, var6);
               this.a.h = var4;
               this.a(var1, this.a, var2, false);
               var4 = this.a.b;
            } else {
               var4 = var6;
            }

            var5 = var4;
            var4 = var9;
         } else {
            this.a(this.o);
            this.a.h = var4;
            this.a(var1, this.a, var2, false);
            var9 = this.a.b;
            var7 = this.a.d;
            var4 = var5;
            if (this.a.c > 0) {
               var4 = var5 + this.a.c;
            }

            this.b(this.o);
            this.a.h = var4;
            var10 = this.a;
            var10.d += this.a.e;
            this.a(var1, this.a, var2, false);
            var6 = this.a.b;
            var4 = var9;
            var5 = var6;
            if (this.a.c > 0) {
               var4 = this.a.c;
               this.a(var7, var9);
               this.a.h = var4;
               this.a(var1, this.a, var2, false);
               var4 = this.a.b;
               var5 = var6;
            }
         }

         var9 = var4;
         var6 = var5;
         if (this.y() > 0) {
            if (this.k ^ this.d) {
               var9 = this.a(var4, var1, var2, true);
               var6 = var5 + var9;
               var5 = this.b(var6, var1, var2, false);
               var6 += var5;
               var9 = var4 + var9 + var5;
            } else {
               var9 = this.b(var5, var1, var2, true);
               var7 = var4 + var9;
               var4 = this.a(var7, var1, var2, false);
               var6 = var5 + var9 + var4;
               var9 = var7 + var4;
            }
         }

         this.b(var1, var2, var6, var9);
         if (!var2.a()) {
            this.j.a();
         } else {
            this.o.a();
         }

         this.b = this.d;
      }

   }

   public int d(ev var1) {
      return this.i(var1);
   }

   public PointF d(int var1) {
      byte var2 = 1;
      boolean var3 = false;
      PointF var4;
      if (this.y() == 0) {
         var4 = null;
      } else {
         if (var1 < this.d(this.i(0))) {
            var3 = true;
         }

         byte var5 = var2;
         if (var3 != this.k) {
            var5 = -1;
         }

         if (this.i == 0) {
            var4 = new PointF((float)var5, 0.0F);
         } else {
            var4 = new PointF(0.0F, (float)var5);
         }
      }

      return var4;
   }

   public boolean d() {
      boolean var1;
      if (this.i == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int e(ev var1) {
      return this.j(var1);
   }

   public void e(int var1) {
      this.l = var1;
      this.m = Integer.MIN_VALUE;
      if (this.n != null) {
         this.n.b();
      }

      this.p();
   }

   public boolean e() {
      boolean var1 = true;
      if (this.i != 1) {
         var1 = false;
      }

      return var1;
   }

   public int f() {
      return this.i;
   }

   int f(int var1) {
      byte var2 = -1;
      int var3 = Integer.MIN_VALUE;
      byte var4 = 1;
      switch(var1) {
      case 1:
         var1 = var2;
         if (this.i != 1) {
            var1 = var2;
            if (this.g()) {
               var1 = 1;
            }
         }
         break;
      case 2:
         if (this.i == 1) {
            var1 = 1;
         } else {
            var1 = var2;
            if (!this.g()) {
               var1 = 1;
            }
         }
         break;
      case 17:
         var1 = var2;
         if (this.i != 0) {
            var1 = Integer.MIN_VALUE;
         }
         break;
      case 33:
         var1 = var2;
         if (this.i != 1) {
            var1 = Integer.MIN_VALUE;
         }
         break;
      case 66:
         if (this.i == 0) {
            var1 = var4;
         } else {
            var1 = Integer.MIN_VALUE;
         }
         break;
      case 130:
         var1 = var3;
         if (this.i == 1) {
            var1 = 1;
         }
         break;
      default:
         var1 = Integer.MIN_VALUE;
      }

      return var1;
   }

   public int f(ev var1) {
      return this.j(var1);
   }

   public int g(ev var1) {
      return this.k(var1);
   }

   protected boolean g() {
      boolean var1 = true;
      if (this.v() != 1) {
         var1 = false;
      }

      return var1;
   }

   public int h(ev var1) {
      return this.k(var1);
   }

   void h() {
      if (this.a == null) {
         this.a = this.i();
      }

      if (this.j == null) {
         this.j = di.a(this, this.i);
      }

   }

   cp i() {
      return new cp();
   }

   boolean j() {
      boolean var1;
      if (this.j.h() == 0 && this.j.e() == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   boolean k() {
      boolean var1;
      if (this.A() != 1073741824 && this.z() != 1073741824 && this.N()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int l() {
      View var1 = this.a(0, this.y(), false, true);
      int var2;
      if (var1 == null) {
         var2 = -1;
      } else {
         var2 = this.d(var1);
      }

      return var2;
   }

   public int m() {
      View var1 = this.a(0, this.y(), true, false);
      int var2;
      if (var1 == null) {
         var2 = -1;
      } else {
         var2 = this.d(var1);
      }

      return var2;
   }

   public int n() {
      int var1 = -1;
      View var2 = this.a(this.y() - 1, -1, false, true);
      if (var2 != null) {
         var1 = this.d(var2);
      }

      return var1;
   }

   public int o() {
      int var1 = -1;
      View var2 = this.a(this.y() - 1, -1, true, false);
      if (var2 != null) {
         var1 = this.d(var2);
      }

      return var1;
   }
}
