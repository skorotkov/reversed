package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout extends LinearLayout {
   private boolean a;
   private int b = -1;

   public ButtonBarLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      boolean var3;
      if (android.support.v4.c.a.a.a(this.getResources()) >= 320) {
         var3 = true;
      } else {
         var3 = false;
      }

      TypedArray var4 = var1.obtainStyledAttributes(var2, android.support.v7.a.k.ButtonBarLayout);
      this.a = var4.getBoolean(android.support.v7.a.k.ButtonBarLayout_allowStacking, var3);
      var4.recycle();
   }

   private int a(int var1) {
      int var2 = this.getChildCount();

      while(true) {
         if (var1 >= var2) {
            var1 = -1;
            break;
         }

         if (this.getChildAt(var1).getVisibility() == 0) {
            break;
         }

         ++var1;
      }

      return var1;
   }

   private boolean a() {
      boolean var1 = true;
      if (this.getOrientation() != 1) {
         var1 = false;
      }

      return var1;
   }

   private void setStacked(boolean var1) {
      byte var2;
      if (var1) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      this.setOrientation(var2);
      if (var1) {
         var2 = 5;
      } else {
         var2 = 80;
      }

      this.setGravity(var2);
      View var3 = this.findViewById(android.support.v7.a.g.spacer);
      if (var3 != null) {
         if (var1) {
            var2 = 8;
         } else {
            var2 = 4;
         }

         var3.setVisibility(var2);
      }

      for(int var4 = this.getChildCount() - 2; var4 >= 0; --var4) {
         this.bringChildToFront(this.getChildAt(var4));
      }

   }

   protected void onMeasure(int var1, int var2) {
      int var3 = MeasureSpec.getSize(var1);
      if (this.a) {
         if (var3 > this.b && this.a()) {
            this.setStacked(false);
         }

         this.b = var3;
      }

      int var4;
      boolean var5;
      if (!this.a() && MeasureSpec.getMode(var1) == 1073741824) {
         var4 = MeasureSpec.makeMeasureSpec(var3, Integer.MIN_VALUE);
         var5 = true;
      } else {
         var4 = var1;
         var5 = false;
      }

      super.onMeasure(var4, var2);
      boolean var6 = var5;
      if (this.a) {
         var6 = var5;
         if (!this.a()) {
            boolean var10;
            if (VERSION.SDK_INT >= 11) {
               if ((android.support.v4.view.bz.h(this) & -16777216) == 16777216) {
                  var10 = true;
               } else {
                  var10 = false;
               }
            } else {
               int var9 = this.getChildCount();
               var4 = 0;

               int var12;
               for(var12 = 0; var4 < var9; ++var4) {
                  var12 += this.getChildAt(var4).getMeasuredWidth();
               }

               if (this.getPaddingLeft() + var12 + this.getPaddingRight() > var3) {
                  var10 = true;
               } else {
                  var10 = false;
               }
            }

            var6 = var5;
            if (var10) {
               this.setStacked(true);
               var6 = true;
            }
         }
      }

      if (var6) {
         super.onMeasure(var1, var2);
      }

      var1 = this.a(0);
      if (var1 >= 0) {
         View var7 = this.getChildAt(var1);
         LayoutParams var8 = (LayoutParams)var7.getLayoutParams();
         var2 = this.getPaddingTop();
         int var11 = var7.getMeasuredHeight();
         var4 = var8.topMargin;
         var2 = var8.bottomMargin + var11 + var2 + var4 + 0;
         if (this.a()) {
            var4 = this.a(var1 + 1);
            var1 = var2;
            if (var4 >= 0) {
               var1 = (int)((float)var2 + (float)this.getChildAt(var4).getPaddingTop() + 16.0F * this.getResources().getDisplayMetrics().density);
            }
         } else {
            var1 = var2 + this.getPaddingBottom();
         }
      } else {
         var1 = 0;
      }

      if (android.support.v4.view.bz.o(this) != var1) {
         this.setMinimumHeight(var1);
      }

   }

   public void setAllowStacking(boolean var1) {
      if (this.a != var1) {
         this.a = var1;
         if (!this.a && this.getOrientation() == 1) {
            this.setStacked(false);
         }

         this.requestLayout();
      }

   }
}
