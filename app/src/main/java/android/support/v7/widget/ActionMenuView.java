package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends cl implements android.support.v7.view.menu.ad, android.support.v7.view.menu.o {
   android.support.v7.view.menu.n a;
   v b;
   private android.support.v7.view.menu.m c;
   private Context d;
   private int e;
   private boolean f;
   private j g;
   private android.support.v7.view.menu.ac h;
   private boolean i;
   private int j;
   private int k;
   private int l;

   public ActionMenuView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionMenuView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setBaselineAligned(false);
      float var3 = var1.getResources().getDisplayMetrics().density;
      this.k = (int)(56.0F * var3);
      this.l = (int)(var3 * 4.0F);
      this.d = var1;
      this.e = 0;
   }

   static int a(View var0, int var1, int var2, int var3, int var4) {
      boolean var5 = false;
      t var6 = (t)var0.getLayoutParams();
      int var7 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(var3) - var4, MeasureSpec.getMode(var3));
      ActionMenuItemView var8;
      if (var0 instanceof ActionMenuItemView) {
         var8 = (ActionMenuItemView)var0;
      } else {
         var8 = null;
      }

      boolean var11;
      if (var8 != null && var8.b()) {
         var11 = true;
      } else {
         var11 = false;
      }

      if (var2 > 0 && (!var11 || var2 >= 2)) {
         var0.measure(MeasureSpec.makeMeasureSpec(var1 * var2, Integer.MIN_VALUE), var7);
         int var9 = var0.getMeasuredWidth();
         var3 = var9 / var1;
         var2 = var3;
         if (var9 % var1 != 0) {
            var2 = var3 + 1;
         }

         var3 = var2;
         if (var11) {
            var3 = var2;
            if (var2 < 2) {
               var3 = 2;
            }
         }
      } else {
         var3 = 0;
      }

      boolean var10 = var5;
      if (!var6.a) {
         var10 = var5;
         if (var11) {
            var10 = true;
         }
      }

      var6.d = var10;
      var6.b = var3;
      var0.measure(MeasureSpec.makeMeasureSpec(var3 * var1, 1073741824), var7);
      return var3;
   }

   private void c(int var1, int var2) {
      int var3 = MeasureSpec.getMode(var2);
      int var4 = MeasureSpec.getSize(var1);
      int var5 = MeasureSpec.getSize(var2);
      int var6 = this.getPaddingLeft();
      var1 = this.getPaddingRight();
      int var7 = this.getPaddingTop() + this.getPaddingBottom();
      int var8 = getChildMeasureSpec(var2, var7, -2);
      int var9 = var4 - (var6 + var1);
      var1 = var9 / this.k;
      var2 = this.k;
      if (var1 == 0) {
         this.setMeasuredDimension(var9, 0);
      } else {
         int var10 = this.k + var9 % var2 / var1;
         var4 = 0;
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         boolean var14 = false;
         long var15 = 0L;
         int var17 = this.getChildCount();

         int var18;
         View var19;
         t var21;
         int var22;
         long var24;
         boolean var30;
         for(var18 = 0; var18 < var17; var4 = var6) {
            var19 = this.getChildAt(var18);
            if (var19.getVisibility() == 8) {
               var6 = var4;
               var2 = var11;
               var4 = var1;
               var1 = var13;
            } else {
               boolean var20 = var19 instanceof ActionMenuItemView;
               ++var13;
               if (var20) {
                  var19.setPadding(this.l, 0, this.l, 0);
               }

               var21 = (t)var19.getLayoutParams();
               var21.f = false;
               var21.c = 0;
               var21.b = 0;
               var21.d = false;
               var21.leftMargin = 0;
               var21.rightMargin = 0;
               if (var20 && ((ActionMenuItemView)var19).b()) {
                  var20 = true;
               } else {
                  var20 = false;
               }

               var21.e = var20;
               if (var21.a) {
                  var2 = 1;
               } else {
                  var2 = var1;
               }

               var22 = a(var19, var10, var2, var8, var7);
               var11 = Math.max(var11, var22);
               if (var21.d) {
                  var2 = var12 + 1;
               } else {
                  var2 = var12;
               }

               if (var21.a) {
                  var30 = true;
               } else {
                  var30 = var14;
               }

               int var23 = var1 - var22;
               var4 = Math.max(var4, var19.getMeasuredHeight());
               if (var22 == 1) {
                  var24 = (long)(1 << var18);
                  var12 = var2;
                  var15 |= var24;
                  var2 = var11;
                  var1 = var13;
                  var14 = var30;
                  var6 = var4;
                  var4 = var23;
               } else {
                  var1 = var13;
                  var12 = var2;
                  var2 = var11;
                  var14 = var30;
                  var6 = var4;
                  var4 = var23;
               }
            }

            ++var18;
            var13 = var1;
            var1 = var4;
            var11 = var2;
         }

         boolean var34;
         if (var14 && var13 == 2) {
            var34 = true;
         } else {
            var34 = false;
         }

         var30 = false;

         for(var18 = var1; var12 > 0 && var18 > 0; var18 = var2) {
            var1 = Integer.MAX_VALUE;
            var24 = 0L;
            var2 = 0;

            for(var7 = 0; var7 < var17; var7 = var22) {
               var21 = (t)this.getChildAt(var7).getLayoutParams();
               if (!var21.d) {
                  var22 = var2;
                  var2 = var1;
                  var1 = var22;
               } else if (var21.b < var1) {
                  var2 = var21.b;
                  var24 = (long)(1 << var7);
                  var1 = 1;
               } else if (var21.b == var1) {
                  var24 |= (long)(1 << var7);
                  var22 = var2 + 1;
                  var2 = var1;
                  var1 = var22;
               } else {
                  var22 = var1;
                  var1 = var2;
                  var2 = var22;
               }

               var22 = var7 + 1;
               var7 = var2;
               var2 = var1;
               var1 = var7;
            }

            var15 |= var24;
            if (var2 > var18) {
               break;
            }

            var6 = 0;

            for(var2 = var18; var6 < var17; ++var6) {
               var19 = this.getChildAt(var6);
               var21 = (t)var19.getLayoutParams();
               if (((long)(1 << var6) & var24) == 0L) {
                  if (var21.b == var1 + 1) {
                     var15 |= (long)(1 << var6);
                  }
               } else {
                  if (var34 && var21.e && var2 == 1) {
                     var19.setPadding(this.l + var10, 0, this.l, 0);
                  }

                  ++var21.b;
                  var21.f = true;
                  --var2;
               }
            }

            var30 = true;
         }

         boolean var29;
         if (!var14 && var13 == 1) {
            var29 = true;
         } else {
            var29 = false;
         }

         if (var18 <= 0 || var15 == 0L || var18 >= var13 - 1 && !var29 && var11 <= 1) {
            var14 = var30;
         } else {
            float var26 = (float)Long.bitCount(var15);
            float var27 = var26;
            if (!var29) {
               float var28 = var26;
               if ((1L & var15) != 0L) {
                  var28 = var26;
                  if (!((t)this.getChildAt(0).getLayoutParams()).e) {
                     var28 = var26 - 0.5F;
                  }
               }

               var27 = var28;
               if (((long)(1 << var17 - 1) & var15) != 0L) {
                  var27 = var28;
                  if (!((t)this.getChildAt(var17 - 1).getLayoutParams()).e) {
                     var27 = var28 - 0.5F;
                  }
               }
            }

            if (var27 > 0.0F) {
               var2 = (int)((float)(var18 * var10) / var27);
            } else {
               var2 = 0;
            }

            byte var31 = 0;
            var29 = var30;
            var6 = var31;

            while(true) {
               var14 = var29;
               if (var6 >= var17) {
                  break;
               }

               if (((long)(1 << var6) & var15) != 0L) {
                  View var33 = this.getChildAt(var6);
                  t var32 = (t)var33.getLayoutParams();
                  if (var33 instanceof ActionMenuItemView) {
                     var32.c = var2;
                     var32.f = true;
                     if (var6 == 0 && !var32.e) {
                        var32.leftMargin = -var2 / 2;
                     }

                     var29 = true;
                  } else if (var32.a) {
                     var32.c = var2;
                     var32.f = true;
                     var32.rightMargin = -var2 / 2;
                     var29 = true;
                  } else {
                     if (var6 != 0) {
                        var32.leftMargin = var2 / 2;
                     }

                     if (var6 != var17 - 1) {
                        var32.rightMargin = var2 / 2;
                     }
                  }
               }

               ++var6;
            }
         }

         if (var14) {
            for(var1 = 0; var1 < var17; ++var1) {
               var19 = this.getChildAt(var1);
               var21 = (t)var19.getLayoutParams();
               if (var21.f) {
                  var2 = var21.b;
                  var19.measure(MeasureSpec.makeMeasureSpec(var21.c + var2 * var10, 1073741824), var8);
               }
            }
         }

         if (var3 == 1073741824) {
            var4 = var5;
         }

         this.setMeasuredDimension(var9, var4);
      }

   }

   protected t a() {
      t var1 = new t(-2, -2);
      var1.h = 16;
      return var1;
   }

   public t a(AttributeSet var1) {
      return new t(this.getContext(), var1);
   }

   protected t a(LayoutParams var1) {
      t var2;
      if (var1 != null) {
         t var3;
         if (var1 instanceof t) {
            var3 = new t((t)var1);
         } else {
            var3 = new t(var1);
         }

         var2 = var3;
         if (var3.h <= 0) {
            var3.h = 16;
            var2 = var3;
         }
      } else {
         var2 = this.a();
      }

      return var2;
   }

   public void a(android.support.v7.view.menu.ac var1, android.support.v7.view.menu.n var2) {
      this.h = var1;
      this.a = var2;
   }

   public void a(android.support.v7.view.menu.m var1) {
      this.c = var1;
   }

   protected boolean a(int var1) {
      boolean var2 = false;
      boolean var3;
      if (var1 == 0) {
         var3 = false;
      } else {
         View var4 = this.getChildAt(var1 - 1);
         View var5 = this.getChildAt(var1);
         var3 = var2;
         if (var1 < this.getChildCount()) {
            var3 = var2;
            if (var4 instanceof r) {
               var3 = false | ((r)var4).d();
            }
         }

         if (var1 > 0 && var5 instanceof r) {
            var3 |= ((r)var5).c();
         }
      }

      return var3;
   }

   public boolean a(android.support.v7.view.menu.p var1) {
      return this.c.a((MenuItem)var1, 0);
   }

   // $FF: synthetic method
   public cm b(AttributeSet var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   protected cm b(LayoutParams var1) {
      return this.a(var1);
   }

   public t b() {
      t var1 = this.a();
      var1.a = true;
      return var1;
   }

   public android.support.v7.view.menu.m c() {
      return this.c;
   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      boolean var2;
      if (var1 != null && var1 instanceof t) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean d() {
      boolean var1;
      if (this.g != null && this.g.d()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
      return false;
   }

   public boolean e() {
      boolean var1;
      if (this.g != null && this.g.h()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void f() {
      if (this.g != null) {
         this.g.f();
      }

   }

   // $FF: synthetic method
   protected cm g() {
      return this.a();
   }

   // $FF: synthetic method
   protected LayoutParams generateDefaultLayoutParams() {
      return this.a();
   }

   // $FF: synthetic method
   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return this.a(var1);
   }

   public Menu getMenu() {
      if (this.c == null) {
         Context var1 = this.getContext();
         this.c = new android.support.v7.view.menu.m(var1);
         this.c.a((android.support.v7.view.menu.n)(new u(this)));
         this.g = new j(var1);
         this.g.c(true);
         j var2 = this.g;
         Object var3;
         if (this.h != null) {
            var3 = this.h;
         } else {
            var3 = new s(this);
         }

         var2.a((android.support.v7.view.menu.ac)var3);
         this.c.a((android.support.v7.view.menu.ab)this.g, (Context)this.d);
         this.g.a(this);
      }

      return this.c;
   }

   public Drawable getOverflowIcon() {
      this.getMenu();
      return this.g.c();
   }

   public int getPopupTheme() {
      return this.e;
   }

   public int getWindowAnimations() {
      return 0;
   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      if (this.g != null) {
         this.g.b(false);
         if (this.g.h()) {
            this.g.e();
            this.g.d();
         }
      }

   }

   public void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.f();
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if (!this.i) {
         super.onLayout(var1, var2, var3, var4, var5);
      } else {
         int var6 = this.getChildCount();
         int var7 = (var5 - var3) / 2;
         int var8 = this.getDividerWidth();
         var5 = 0;
         var3 = 0;
         int var9 = var4 - var2 - this.getPaddingRight() - this.getPaddingLeft();
         boolean var10 = false;
         var1 = gx.a(this);

         View var12;
         t var14;
         int var20;
         int var22;
         for(int var11 = 0; var11 < var6; var11 = var22) {
            var12 = this.getChildAt(var11);
            boolean var19;
            if (var12.getVisibility() == 8) {
               var20 = var3;
               var3 = var9;
               var9 = var5;
               var5 = var3;
               var19 = var10;
            } else {
               var14 = (t)var12.getLayoutParams();
               int var16;
               if (var14.a) {
                  var22 = var12.getMeasuredWidth();
                  var20 = var22;
                  if (this.a(var11)) {
                     var20 = var22 + var8;
                  }

                  int var15 = var12.getMeasuredHeight();
                  if (var1) {
                     var22 = this.getPaddingLeft();
                     var16 = var14.leftMargin + var22;
                     var22 = var16 + var20;
                  } else {
                     var22 = this.getWidth() - this.getPaddingRight() - var14.rightMargin;
                     var16 = var22 - var20;
                  }

                  int var17 = var7 - var15 / 2;
                  var12.layout(var16, var17, var22, var15 + var17);
                  var22 = var9 - var20;
                  boolean var24 = true;
                  var20 = var3;
                  var9 = var5;
                  var19 = var24;
                  var5 = var22;
               } else {
                  var16 = var12.getMeasuredWidth() + var14.leftMargin + var14.rightMargin;
                  var22 = var5 + var16;
                  var5 = var22;
                  if (this.a(var11)) {
                     var5 = var22 + var8;
                  }

                  var16 = var9 - var16;
                  var22 = var3 + 1;
                  var9 = var5;
                  var19 = var10;
                  var5 = var16;
                  var20 = var22;
               }
            }

            var22 = var11 + 1;
            var11 = var9;
            var9 = var5;
            var10 = var19;
            var3 = var20;
            var5 = var11;
         }

         if (var6 == 1 && !var10) {
            var12 = this.getChildAt(0);
            var5 = var12.getMeasuredWidth();
            var3 = var12.getMeasuredHeight();
            var2 = (var4 - var2) / 2 - var5 / 2;
            var4 = var7 - var3 / 2;
            var12.layout(var2, var4, var5 + var2, var3 + var4);
         } else {
            byte var18;
            if (var10) {
               var18 = 0;
            } else {
               var18 = 1;
            }

            var2 = var3 - var18;
            if (var2 > 0) {
               var2 = var9 / var2;
            } else {
               var2 = 0;
            }

            var4 = Math.max(0, var2);
            if (var1) {
               var2 = this.getWidth() - this.getPaddingRight();

               for(var3 = 0; var3 < var6; ++var3) {
                  var12 = this.getChildAt(var3);
                  var14 = (t)var12.getLayoutParams();
                  if (var12.getVisibility() != 8 && !var14.a) {
                     var2 -= var14.rightMargin;
                     var20 = var12.getMeasuredWidth();
                     var9 = var12.getMeasuredHeight();
                     var5 = var7 - var9 / 2;
                     var12.layout(var2 - var20, var5, var2, var9 + var5);
                     var2 -= var14.leftMargin + var20 + var4;
                  }
               }
            } else {
               var2 = this.getPaddingLeft();

               for(var3 = 0; var3 < var6; ++var3) {
                  View var23 = this.getChildAt(var3);
                  t var21 = (t)var23.getLayoutParams();
                  if (var23.getVisibility() != 8 && !var21.a) {
                     var2 += var21.leftMargin;
                     var5 = var23.getMeasuredWidth();
                     var20 = var23.getMeasuredHeight();
                     var9 = var7 - var20 / 2;
                     var23.layout(var2, var9, var2 + var5, var20 + var9);
                     var2 += var21.rightMargin + var5 + var4;
                  }
               }
            }
         }
      }

   }

   protected void onMeasure(int var1, int var2) {
      boolean var3 = this.i;
      boolean var4;
      if (MeasureSpec.getMode(var1) == 1073741824) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.i = var4;
      if (var3 != this.i) {
         this.j = 0;
      }

      int var5 = MeasureSpec.getSize(var1);
      if (this.i && this.c != null && var5 != this.j) {
         this.j = var5;
         this.c.b(true);
      }

      int var6 = this.getChildCount();
      if (this.i && var6 > 0) {
         this.c(var1, var2);
      } else {
         for(var5 = 0; var5 < var6; ++var5) {
            t var7 = (t)this.getChildAt(var5).getLayoutParams();
            var7.rightMargin = 0;
            var7.leftMargin = 0;
         }

         super.onMeasure(var1, var2);
      }

   }

   public void setExpandedActionViewsExclusive(boolean var1) {
      this.g.d(var1);
   }

   public void setOnMenuItemClickListener(v var1) {
      this.b = var1;
   }

   public void setOverflowIcon(Drawable var1) {
      this.getMenu();
      this.g.a(var1);
   }

   public void setOverflowReserved(boolean var1) {
      this.f = var1;
   }

   public void setPopupTheme(int var1) {
      if (this.e != var1) {
         this.e = var1;
         if (var1 == 0) {
            this.d = this.getContext();
         } else {
            this.d = new ContextThemeWrapper(this.getContext(), var1);
         }
      }

   }

   public void setPresenter(j var1) {
      this.g = var1;
      this.g.a(this);
   }
}
