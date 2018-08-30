package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;

public class AlertDialogLayout extends cl {
   public AlertDialogLayout(Context var1) {
      super(var1);
   }

   public AlertDialogLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   private void a(View var1, int var2, int var3, int var4, int var5) {
      var1.layout(var2, var3, var2 + var4, var3 + var5);
   }

   private static int c(View var0) {
      int var1 = android.support.v4.view.bz.o(var0);
      if (var1 <= 0) {
         if (var0 instanceof ViewGroup) {
            ViewGroup var2 = (ViewGroup)var0;
            if (var2.getChildCount() == 1) {
               var1 = c(var2.getChildAt(0));
               return var1;
            }
         }

         var1 = 0;
      }

      return var1;
   }

   private boolean c(int var1, int var2) {
      View var3 = null;
      View var4 = null;
      int var5 = this.getChildCount();
      int var6 = 0;
      View var7 = null;

      boolean var10;
      while(true) {
         int var9;
         if (var6 >= var5) {
            int var12 = MeasureSpec.getMode(var2);
            int var13 = MeasureSpec.getSize(var2);
            int var14 = MeasureSpec.getMode(var1);
            int var15 = 0;
            var6 = this.getPaddingTop();
            var6 += this.getPaddingBottom();
            var9 = var6;
            if (var3 != null) {
               var3.measure(var1, 0);
               var9 = var6 + var3.getMeasuredHeight();
               var15 = android.support.v4.view.bz.a(0, android.support.v4.view.bz.j(var3));
            }

            var6 = 0;
            int var16;
            if (var4 != null) {
               var4.measure(var1, 0);
               var6 = c(var4);
               var16 = var4.getMeasuredHeight();
               var9 += var6;
               var15 = android.support.v4.view.bz.a(var15, android.support.v4.view.bz.j(var4));
               var16 -= var6;
            } else {
               var16 = 0;
            }

            int var17;
            int var18;
            if (var7 != null) {
               if (var12 == 0) {
                  var17 = 0;
               } else {
                  var17 = MeasureSpec.makeMeasureSpec(Math.max(0, var13 - var9), var12);
               }

               var7.measure(var1, var17);
               var18 = var7.getMeasuredHeight();
               var9 += var18;
               var15 = android.support.v4.view.bz.a(var15, android.support.v4.view.bz.j(var7));
            } else {
               var18 = 0;
            }

            var13 -= var9;
            if (var4 != null) {
               int var19 = Math.min(var13, var16);
               var16 = var13;
               var17 = var6;
               if (var19 > 0) {
                  var16 = var13 - var19;
                  var17 = var6 + var19;
               }

               var4.measure(var1, MeasureSpec.makeMeasureSpec(var17, 1073741824));
               var17 = var4.getMeasuredHeight();
               var15 = android.support.v4.view.bz.a(var15, android.support.v4.view.bz.j(var4));
               var9 = var17 + (var9 - var6);
               var13 = var16;
               var6 = var15;
            } else {
               var6 = var15;
            }

            if (var7 != null && var13 > 0) {
               var7.measure(var1, MeasureSpec.makeMeasureSpec(var13 + var18, var12));
               var15 = var7.getMeasuredHeight();
               var6 = android.support.v4.view.bz.a(var6, android.support.v4.view.bz.j(var7));
               var15 += var9 - var18;
               var9 = var6;
               var6 = var15;
            } else {
               var15 = var6;
               var6 = var9;
               var9 = var15;
            }

            var17 = 0;

            for(var15 = 0; var15 < var5; var17 = var16) {
               var3 = this.getChildAt(var15);
               var16 = var17;
               if (var3.getVisibility() != 8) {
                  var16 = Math.max(var17, var3.getMeasuredWidth());
               }

               ++var15;
            }

            this.setMeasuredDimension(android.support.v4.view.bz.a(var17 + this.getPaddingLeft() + this.getPaddingRight(), var1, var9), android.support.v4.view.bz.a(var6, var2, 0));
            if (var14 != 1073741824) {
               this.d(var5, var2);
            }

            var10 = true;
            break;
         }

         View var8 = this.getChildAt(var6);
         if (var8.getVisibility() == 8) {
            var8 = var4;
            var4 = var3;
            var3 = var8;
         } else {
            var9 = var8.getId();
            if (var9 == android.support.v7.a.g.topPanel) {
               var3 = var4;
               var4 = var8;
            } else if (var9 == android.support.v7.a.g.buttonPanel) {
               var4 = var3;
               var3 = var8;
            } else {
               if (var9 != android.support.v7.a.g.contentPanel && var9 != android.support.v7.a.g.customPanel) {
                  var10 = false;
                  break;
               }

               if (var7 != null) {
                  var10 = false;
                  break;
               }

               View var11 = var3;
               var7 = var8;
               var3 = var4;
               var4 = var11;
            }
         }

         ++var6;
         var8 = var4;
         var4 = var3;
         var3 = var8;
      }

      return var10;
   }

   private void d(int var1, int var2) {
      int var3 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);

      for(int var4 = 0; var4 < var1; ++var4) {
         View var5 = this.getChildAt(var4);
         if (var5.getVisibility() != 8) {
            cm var6 = (cm)var5.getLayoutParams();
            if (var6.width == -1) {
               int var7 = var6.height;
               var6.height = var5.getMeasuredHeight();
               this.measureChildWithMargins(var5, var3, 0, var2, 0);
               var6.height = var7;
            }
         }
      }

   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var6 = this.getPaddingLeft();
      int var7 = var4 - var2;
      int var8 = this.getPaddingRight();
      int var9 = this.getPaddingRight();
      var2 = this.getMeasuredHeight();
      int var10 = this.getChildCount();
      int var11 = this.getGravity();
      switch(var11 & 112) {
      case 16:
         var4 = this.getPaddingTop();
         var2 = (var5 - var3 - var2) / 2 + var4;
         break;
      case 80:
         var2 = this.getPaddingTop() + var5 - var3 - var2;
         break;
      default:
         var2 = this.getPaddingTop();
      }

      Drawable var12 = this.getDividerDrawable();
      if (var12 == null) {
         var4 = 0;
      } else {
         var4 = var12.getIntrinsicHeight();
      }

      for(var5 = 0; var5 < var10; var2 = var3) {
         View var17 = this.getChildAt(var5);
         var3 = var2;
         if (var17 != null) {
            var3 = var2;
            if (var17.getVisibility() != 8) {
               int var13 = var17.getMeasuredWidth();
               int var14 = var17.getMeasuredHeight();
               cm var15 = (cm)var17.getLayoutParams();
               int var16 = var15.h;
               var3 = var16;
               if (var16 < 0) {
                  var3 = var11 & 8388615;
               }

               switch(android.support.v4.view.y.a(var3, android.support.v4.view.bz.g(this)) & 7) {
               case 1:
                  var3 = (var7 - var6 - var9 - var13) / 2 + var6 + var15.leftMargin - var15.rightMargin;
                  break;
               case 5:
                  var3 = var7 - var8 - var13 - var15.rightMargin;
                  break;
               default:
                  var3 = var6 + var15.leftMargin;
               }

               if (this.c(var5)) {
                  var2 += var4;
               }

               var2 += var15.topMargin;
               this.a(var17, var3, var2, var13, var14);
               var3 = var2 + var15.bottomMargin + var14;
            }
         }

         ++var5;
      }

   }

   protected void onMeasure(int var1, int var2) {
      if (!this.c(var1, var2)) {
         super.onMeasure(var1, var2);
      }

   }
}
