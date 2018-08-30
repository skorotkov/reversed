package android.support.percent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.bz;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class a {
   private final ViewGroup a;

   public a(ViewGroup var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("host must be non-null");
      } else {
         this.a = var1;
      }
   }

   public static b a(Context var0, AttributeSet var1) {
      Object var2 = null;
      b var3 = null;
      TypedArray var4 = var0.obtainStyledAttributes(var1, g.PercentLayout_Layout);
      float var5 = var4.getFraction(g.PercentLayout_Layout_layout_widthPercent, 1, 1, -1.0F);
      b var6 = (b)var2;
      if (var5 != -1.0F) {
         if (false) {
            var6 = var3;
         } else {
            var6 = new b();
         }

         var6.a = var5;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_heightPercent, 1, 1, -1.0F);
      b var7 = var6;
      if (var5 != -1.0F) {
         if (var6 == null) {
            var6 = new b();
         }

         var6.b = var5;
         var7 = var6;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_marginPercent, 1, 1, -1.0F);
      var3 = var7;
      if (var5 != -1.0F) {
         if (var7 == null) {
            var7 = new b();
         }

         var7.c = var5;
         var7.d = var5;
         var7.e = var5;
         var7.f = var5;
         var3 = var7;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_marginLeftPercent, 1, 1, -1.0F);
      var6 = var3;
      if (var5 != -1.0F) {
         if (var3 != null) {
            var6 = var3;
         } else {
            var6 = new b();
         }

         var6.c = var5;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_marginTopPercent, 1, 1, -1.0F);
      var7 = var6;
      if (var5 != -1.0F) {
         if (var6 == null) {
            var6 = new b();
         }

         var6.d = var5;
         var7 = var6;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_marginRightPercent, 1, 1, -1.0F);
      var3 = var7;
      if (var5 != -1.0F) {
         if (var7 == null) {
            var7 = new b();
         }

         var7.e = var5;
         var3 = var7;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_marginBottomPercent, 1, 1, -1.0F);
      var6 = var3;
      if (var5 != -1.0F) {
         if (var3 != null) {
            var6 = var3;
         } else {
            var6 = new b();
         }

         var6.f = var5;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_marginStartPercent, 1, 1, -1.0F);
      var7 = var6;
      if (var5 != -1.0F) {
         if (var6 == null) {
            var6 = new b();
         }

         var6.g = var5;
         var7 = var6;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_marginEndPercent, 1, 1, -1.0F);
      var6 = var7;
      if (var5 != -1.0F) {
         if (var7 != null) {
            var6 = var7;
         } else {
            var6 = new b();
         }

         var6.h = var5;
      }

      var5 = var4.getFraction(g.PercentLayout_Layout_layout_aspectRatio, 1, 1, -1.0F);
      var7 = var6;
      if (var5 != -1.0F) {
         if (var6 == null) {
            var6 = new b();
         }

         var6.i = var5;
         var7 = var6;
      }

      var4.recycle();
      return var7;
   }

   public static void a(LayoutParams var0, TypedArray var1, int var2, int var3) {
      var0.width = var1.getLayoutDimension(var2, 0);
      var0.height = var1.getLayoutDimension(var3, 0);
   }

   private static boolean a(View var0, b var1) {
      boolean var2;
      if ((bz.h(var0) & -16777216) == 16777216 && var1.a >= 0.0F && var1.j.width == -2) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private static boolean b(View var0, b var1) {
      boolean var2;
      if ((bz.i(var0) & -16777216) == 16777216 && var1.b >= 0.0F && var1.j.height == -2) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void a() {
      int var1 = this.a.getChildCount();

      for(int var2 = 0; var2 < var1; ++var2) {
         LayoutParams var3 = this.a.getChildAt(var2).getLayoutParams();
         if (var3 instanceof c) {
            b var4 = ((c)var3).a();
            if (var4 != null) {
               if (var3 instanceof MarginLayoutParams) {
                  var4.a((MarginLayoutParams)var3);
               } else {
                  var4.a(var3);
               }
            }
         }
      }

   }

   public void a(int var1, int var2) {
      int var3 = MeasureSpec.getSize(var1) - this.a.getPaddingLeft() - this.a.getPaddingRight();
      int var4 = MeasureSpec.getSize(var2) - this.a.getPaddingTop() - this.a.getPaddingBottom();
      var2 = this.a.getChildCount();

      for(var1 = 0; var1 < var2; ++var1) {
         View var5 = this.a.getChildAt(var1);
         LayoutParams var6 = var5.getLayoutParams();
         if (var6 instanceof c) {
            b var7 = ((c)var6).a();
            if (var7 != null) {
               if (var6 instanceof MarginLayoutParams) {
                  var7.a(var5, (MarginLayoutParams)var6, var3, var4);
               } else {
                  var7.a(var6, var3, var4);
               }
            }
         }
      }

   }

   public boolean b() {
      int var1 = this.a.getChildCount();
      int var2 = 0;

      boolean var3;
      boolean var6;
      for(var3 = false; var2 < var1; var3 = var6) {
         View var4 = this.a.getChildAt(var2);
         LayoutParams var5 = var4.getLayoutParams();
         var6 = var3;
         if (var5 instanceof c) {
            b var7 = ((c)var5).a();
            var6 = var3;
            if (var7 != null) {
               if (a(var4, var7)) {
                  var5.width = -2;
                  var3 = true;
               }

               if (b(var4, var7)) {
                  var5.height = -2;
                  var6 = true;
               } else {
                  var6 = var3;
               }
            }
         }

         ++var2;
      }

      return var3;
   }
}
