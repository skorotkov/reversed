package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

class j extends android.support.v7.view.menu.d implements android.support.v4.view.r {
   private l A;
   n g;
   p h;
   k i;
   m j;
   final q k = new q(this);
   int l;
   private Drawable m;
   private boolean n;
   private boolean o;
   private boolean p;
   private int q;
   private int r;
   private int s;
   private boolean t;
   private boolean u;
   private boolean v;
   private boolean w;
   private int x;
   private final SparseBooleanArray y = new SparseBooleanArray();
   private View z;

   public j(Context var1) {
      super(var1, android.support.v7.a.h.abc_action_menu_layout, android.support.v7.a.h.abc_action_menu_item_layout);
   }

   // $FF: synthetic method
   static android.support.v7.view.menu.m a(j var0) {
      return var0.c;
   }

   private View a(MenuItem var1) {
      ViewGroup var2 = (ViewGroup)this.f;
      View var3;
      if (var2 == null) {
         var3 = null;
      } else {
         int var4 = var2.getChildCount();
         int var5 = 0;

         while(true) {
            if (var5 >= var4) {
               var3 = null;
               break;
            }

            View var6 = var2.getChildAt(var5);
            if (var6 instanceof android.support.v7.view.menu.ae) {
               var3 = var6;
               if (((android.support.v7.view.menu.ae)var6).getItemData() == var1) {
                  break;
               }
            }

            ++var5;
         }
      }

      return var3;
   }

   // $FF: synthetic method
   static android.support.v7.view.menu.m b(j var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static android.support.v7.view.menu.ad c(j var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static android.support.v7.view.menu.m d(j var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static android.support.v7.view.menu.m e(j var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static android.support.v7.view.menu.ad f(j var0) {
      return var0.f;
   }

   public View a(android.support.v7.view.menu.p var1, View var2, ViewGroup var3) {
      View var4 = var1.getActionView();
      if (var4 == null || var1.n()) {
         var4 = super.a(var1, var2, var3);
      }

      byte var5;
      if (var1.isActionViewExpanded()) {
         var5 = 8;
      } else {
         var5 = 0;
      }

      var4.setVisibility(var5);
      ActionMenuView var6 = (ActionMenuView)var3;
      LayoutParams var7 = var4.getLayoutParams();
      if (!var6.checkLayoutParams(var7)) {
         var4.setLayoutParams(var6.a(var7));
      }

      return var4;
   }

   public void a(Context var1, android.support.v7.view.menu.m var2) {
      super.a(var1, var2);
      Resources var6 = var1.getResources();
      android.support.v7.view.a var5 = android.support.v7.view.a.a(var1);
      if (!this.p) {
         this.o = var5.b();
      }

      if (!this.v) {
         this.q = var5.c();
      }

      if (!this.t) {
         this.s = var5.a();
      }

      int var3 = this.q;
      if (this.o) {
         if (this.g == null) {
            this.g = new n(this, this.a);
            if (this.n) {
               this.g.setImageDrawable(this.m);
               this.m = null;
               this.n = false;
            }

            int var4 = MeasureSpec.makeMeasureSpec(0, 0);
            this.g.measure(var4, var4);
         }

         var3 -= this.g.getMeasuredWidth();
      } else {
         this.g = null;
      }

      this.r = var3;
      this.x = (int)(56.0F * var6.getDisplayMetrics().density);
      this.z = null;
   }

   public void a(Configuration var1) {
      if (!this.t) {
         this.s = android.support.v7.view.a.a(this.b).a();
      }

      if (this.c != null) {
         this.c.b(true);
      }

   }

   public void a(Drawable var1) {
      if (this.g != null) {
         this.g.setImageDrawable(var1);
      } else {
         this.n = true;
         this.m = var1;
      }

   }

   public void a(android.support.v7.view.menu.m var1, boolean var2) {
      this.f();
      super.a(var1, var2);
   }

   public void a(android.support.v7.view.menu.p var1, android.support.v7.view.menu.ae var2) {
      var2.a(var1, 0);
      ActionMenuView var3 = (ActionMenuView)this.f;
      ActionMenuItemView var4 = (ActionMenuItemView)var2;
      var4.setItemInvoker(var3);
      if (this.A == null) {
         this.A = new l(this);
      }

      var4.setPopupCallback(this.A);
   }

   public void a(ActionMenuView var1) {
      this.f = var1;
      var1.a(this.c);
   }

   public void a(boolean var1) {
      if (var1) {
         super.a((android.support.v7.view.menu.ak)null);
      } else if (this.c != null) {
         this.c.a(false);
      }

   }

   public boolean a(int var1, android.support.v7.view.menu.p var2) {
      return var2.j();
   }

   public boolean a(android.support.v7.view.menu.ak var1) {
      boolean var2 = false;
      if (var1.hasVisibleItems()) {
         android.support.v7.view.menu.ak var3;
         for(var3 = var1; var3.p() != this.c; var3 = (android.support.v7.view.menu.ak)var3.p()) {
         }

         View var4 = this.a(var3.getItem());
         if (var4 != null) {
            this.l = var1.getItem().getItemId();
            int var5 = var1.size();
            int var6 = 0;

            while(true) {
               if (var6 >= var5) {
                  var2 = false;
                  break;
               }

               MenuItem var7 = var1.getItem(var6);
               if (var7.isVisible() && var7.getIcon() != null) {
                  var2 = true;
                  break;
               }

               ++var6;
            }

            this.i = new k(this, this.b, var1, var4);
            this.i.a(var2);
            this.i.a();
            super.a(var1);
            var2 = true;
         }
      }

      return var2;
   }

   public boolean a(ViewGroup var1, int var2) {
      boolean var3;
      if (var1.getChildAt(var2) == this.g) {
         var3 = false;
      } else {
         var3 = super.a(var1, var2);
      }

      return var3;
   }

   public void b(boolean var1) {
      boolean var2 = true;
      boolean var3 = false;
      ViewGroup var4 = (ViewGroup)((View)this.f).getParent();
      if (var4 != null) {
         android.support.v7.f.a.a(var4);
      }

      super.b(var1);
      ((View)this.f).requestLayout();
      int var7;
      if (this.c != null) {
         ArrayList var5 = this.c.j();
         int var6 = var5.size();

         for(var7 = 0; var7 < var6; ++var7) {
            android.support.v4.view.q var8 = ((android.support.v7.view.menu.p)var5.get(var7)).a();
            if (var8 != null) {
               var8.a((android.support.v4.view.r)this);
            }
         }
      }

      ArrayList var9;
      if (this.c != null) {
         var9 = this.c.k();
      } else {
         var9 = null;
      }

      boolean var11 = var3;
      if (this.o) {
         var11 = var3;
         if (var9 != null) {
            var7 = var9.size();
            if (var7 == 1) {
               if (!((android.support.v7.view.menu.p)var9.get(0)).isActionViewExpanded()) {
                  var11 = true;
               } else {
                  var11 = false;
               }
            } else if (var7 > 0) {
               var11 = var2;
            } else {
               var11 = false;
            }
         }
      }

      if (var11) {
         if (this.g == null) {
            this.g = new n(this, this.a);
         }

         var4 = (ViewGroup)this.g.getParent();
         if (var4 != this.f) {
            if (var4 != null) {
               var4.removeView(this.g);
            }

            ActionMenuView var10 = (ActionMenuView)this.f;
            var10.addView(this.g, var10.b());
         }
      } else if (this.g != null && this.g.getParent() == this.f) {
         ((ViewGroup)this.f).removeView(this.g);
      }

      ((ActionMenuView)this.f).setOverflowReserved(this.o);
   }

   public boolean b() {
      ArrayList var1;
      int var2;
      if (this.c != null) {
         var1 = this.c.h();
         var2 = var1.size();
      } else {
         var2 = 0;
         var1 = null;
      }

      int var3 = this.s;
      int var4 = this.r;
      int var5 = MeasureSpec.makeMeasureSpec(0, 0);
      ViewGroup var6 = (ViewGroup)this.f;
      int var7 = 0;
      int var8 = 0;
      boolean var9 = false;

      int var10;
      for(var10 = 0; var10 < var2; ++var10) {
         android.support.v7.view.menu.p var11 = (android.support.v7.view.menu.p)var1.get(var10);
         if (var11.l()) {
            ++var7;
         } else if (var11.k()) {
            ++var8;
         } else {
            var9 = true;
         }

         if (this.w && var11.isActionViewExpanded()) {
            var3 = 0;
         }
      }

      var10 = var3;
      if (this.o) {
         label163: {
            if (!var9) {
               var10 = var3;
               if (var7 + var8 <= var3) {
                  break label163;
               }
            }

            var10 = var3 - 1;
         }
      }

      var10 -= var7;
      SparseBooleanArray var21 = this.y;
      var21.clear();
      var3 = 0;
      int var12;
      if (this.u) {
         var3 = var4 / this.x;
         var8 = this.x;
         var7 = this.x;
         var12 = var4 % var8 / var3 + var7;
      } else {
         var12 = 0;
      }

      int var13 = 0;
      byte var19 = 0;
      var7 = var3;
      var3 = var10;
      var8 = var4;

      for(var10 = var19; var13 < var2; var13 = var4) {
         android.support.v7.view.menu.p var14 = (android.support.v7.view.menu.p)var1.get(var13);
         View var15;
         int var20;
         if (var14.l()) {
            var15 = this.a(var14, this.z, var6);
            if (this.z == null) {
               this.z = var15;
            }

            if (this.u) {
               var20 = var7 - ActionMenuView.a(var15, var12, var7, var5, 0);
            } else {
               var15.measure(var5, var5);
               var20 = var7;
            }

            var7 = var15.getMeasuredWidth();
            if (var10 == 0) {
               var10 = var7;
            }

            var4 = var14.getGroupId();
            if (var4 != 0) {
               var21.put(var4, true);
            }

            var14.d(true);
            var8 -= var7;
            var7 = var3;
            var3 = var8;
         } else if (!var14.k()) {
            var14.d(false);
            var20 = var8;
            var8 = var3;
            var3 = var20;
            var20 = var7;
            var7 = var8;
         } else {
            int var16 = var14.getGroupId();
            boolean var17 = var21.get(var16);
            boolean var18;
            if (var3 <= 0 && !var17 || var8 <= 0 || this.u && var7 <= 0) {
               var18 = false;
            } else {
               var18 = true;
            }

            if (var18) {
               var15 = this.a(var14, this.z, var6);
               if (this.z == null) {
                  this.z = var15;
               }

               if (this.u) {
                  var20 = ActionMenuView.a(var15, var12, var7, var5, 0);
                  if (var20 == 0) {
                     var18 = false;
                  }

                  var7 -= var20;
               } else {
                  var15.measure(var5, var5);
               }

               var20 = var15.getMeasuredWidth();
               var4 = var8 - var20;
               var8 = var10;
               if (var10 == 0) {
                  var8 = var20;
               }

               boolean var22;
               if (this.u) {
                  if (var4 >= 0) {
                     var22 = true;
                  } else {
                     var22 = false;
                  }

                  var18 &= var22;
                  var20 = var8;
                  var10 = var7;
                  var8 = var4;
                  var7 = var20;
               } else {
                  if (var4 + var8 > 0) {
                     var22 = true;
                  } else {
                     var22 = false;
                  }

                  var18 &= var22;
                  var10 = var7;
                  var7 = var8;
                  var8 = var4;
               }
            } else {
               var20 = var10;
               var10 = var7;
               var7 = var20;
            }

            if (var18 && var16 != 0) {
               var21.put(var16, true);
            } else if (var17) {
               var21.put(var16, false);

               for(var4 = 0; var4 < var13; var3 = var20) {
                  android.support.v7.view.menu.p var23 = (android.support.v7.view.menu.p)var1.get(var4);
                  var20 = var3;
                  if (var23.getGroupId() == var16) {
                     var20 = var3;
                     if (var23.j()) {
                        var20 = var3 + 1;
                     }

                     var23.d(false);
                  }

                  ++var4;
               }
            }

            var20 = var3;
            if (var18) {
               var20 = var3 - 1;
            }

            var14.d(var18);
            var3 = var8;
            var8 = var20;
            var20 = var10;
            var10 = var7;
            var7 = var8;
         }

         var4 = var13 + 1;
         var13 = var7;
         var7 = var20;
         var8 = var3;
         var3 = var13;
      }

      return true;
   }

   public Drawable c() {
      Drawable var1;
      if (this.g != null) {
         var1 = this.g.getDrawable();
      } else if (this.n) {
         var1 = this.m;
      } else {
         var1 = null;
      }

      return var1;
   }

   public void c(boolean var1) {
      this.o = var1;
      this.p = true;
   }

   public void d(boolean var1) {
      this.w = var1;
   }

   public boolean d() {
      boolean var1 = true;
      if (this.o && !this.h() && this.c != null && this.f != null && this.j == null && !this.c.k().isEmpty()) {
         this.j = new m(this, new p(this, this.b, this.c, this.g, true));
         ((View)this.f).post(this.j);
         super.a((android.support.v7.view.menu.ak)null);
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean e() {
      boolean var1;
      if (this.j != null && this.f != null) {
         ((View)this.f).removeCallbacks(this.j);
         this.j = null;
         var1 = true;
      } else {
         p var2 = this.h;
         if (var2 != null) {
            var2.d();
            var1 = true;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public boolean f() {
      return this.e() | this.g();
   }

   public boolean g() {
      boolean var1;
      if (this.i != null) {
         this.i.d();
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean h() {
      boolean var1;
      if (this.h != null && this.h.f()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
