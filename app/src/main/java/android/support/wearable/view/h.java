package android.support.wearable.view;

import android.annotation.TargetApi;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

@Deprecated
@TargetApi(20)
public class h extends FrameLayout {
   private f a;
   private boolean b;
   private final int c;

   private boolean a() {
      boolean var1;
      if (this.a == null) {
         Log.w("CardScrollView", "No CardFrame has been added.");
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public int a(int var1) {
      int var2 = 0;
      if (this.a()) {
         int var3 = this.getPaddingTop();
         int var4 = this.getPaddingBottom();
         LayoutParams var5 = (LayoutParams)this.a.getLayoutParams();
         int var6 = var5.topMargin;
         var6 = var5.bottomMargin + var6 + var4 + var3 + this.a.getMeasuredHeight();
         if (var6 > this.getMeasuredHeight()) {
            label36: {
               var2 = var6 - this.getMeasuredHeight();
               var6 = this.getScrollY();
               if (this.a.getExpansionDirection() == 1) {
                  if (var6 >= 0) {
                     if (var1 < 0) {
                        var1 = -var6;
                        break label36;
                     }

                     if (var1 > 0) {
                        var1 = Math.max(0, var2 - var6);
                        break label36;
                     }
                  }
               } else if (this.a.getExpansionDirection() == -1 && var6 <= 0) {
                  if (var1 > 0) {
                     var1 = -var6;
                     break label36;
                  }

                  if (var1 < 0) {
                     var1 = -(var2 + var6);
                     break label36;
                  }
               }

               var1 = 0;
            }

            if (Log.isLoggable("CardScrollView", 3)) {
               var2 = Math.max(0, var1);
               Log.d("CardScrollView", (new StringBuilder(42)).append("getVerticalScrollableDistance: ").append(var2).toString());
            }

            var2 = var1;
         }
      }

      return var2;
   }

   public void addView(View var1, int var2, android.view.ViewGroup.LayoutParams var3) {
      if (this.getChildCount() <= 0 && var1 instanceof f) {
         super.addView(var1, var2, var3);
         this.a = (f)var1;
      } else {
         throw new IllegalStateException("CardScrollView may contain only a single CardFrame.");
      }
   }

   public boolean canScrollHorizontally(int var1) {
      return false;
   }

   public int getCardGravity() {
      int var1;
      if (this.a()) {
         var1 = ((LayoutParams)this.a.getLayoutParams()).gravity;
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getExpansionDirection() {
      int var1;
      if (this.a()) {
         var1 = this.a.getExpansionDirection();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public float getExpansionFactor() {
      float var1;
      if (this.a()) {
         var1 = this.a.getExpansionFactor();
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   public WindowInsets onApplyWindowInsets(WindowInsets var1) {
      boolean var2 = var1.isRound();
      if (this.b != var2) {
         this.b = var2;
         LayoutParams var3 = (LayoutParams)this.a.getLayoutParams();
         var3.leftMargin = -this.c;
         var3.rightMargin = -this.c;
         var3.bottomMargin = -this.c;
         this.a.setLayoutParams(var3);
      }

      if (var1.getSystemWindowInsetBottom() > 0) {
         int var4 = var1.getSystemWindowInsetBottom();
         android.view.ViewGroup.LayoutParams var5 = this.getLayoutParams();
         if (var5 instanceof MarginLayoutParams) {
            ((MarginLayoutParams)var5).bottomMargin = var4;
         }
      }

      if (this.b && this.a != null) {
         this.a.onApplyWindowInsets(var1);
      }

      this.requestLayout();
      return var1;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.requestApplyInsets();
   }

   protected void onFinishInflate() {
      super.onFinishInflate();
      if (this.getChildCount() == 0 || !(this.getChildAt(0) instanceof f)) {
         Log.w("CardScrollView", "No CardFrame has been added!");
      }

   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      boolean var9 = true;
      if (this.a != null) {
         LayoutParams var6 = (LayoutParams)this.a.getLayoutParams();
         var4 = this.a.getMeasuredHeight();
         int var7 = this.a.getMeasuredWidth();
         int var8 = var5 - var3;
         if (this.getPaddingTop() + var4 + var6.topMargin <= var8) {
            if ((var6.gravity & 112) != 80) {
               var9 = false;
            }
         } else if (this.a.getExpansionDirection() != -1) {
            var9 = false;
         }

         var5 = this.getPaddingLeft() + var6.leftMargin;
         var3 = this.getPaddingTop();
         var3 += var6.topMargin;
         if (var9) {
            var2 = this.getPaddingBottom();
            var3 = var8 - (var6.bottomMargin + var2);
            var2 = var3 - var4;
         } else {
            var4 += var3;
            var2 = var3;
            var3 = var4;
         }

         this.a.layout(var5, var2, var7 + var5, var3);
      }

   }

   protected void onMeasure(int var1, int var2) {
      if (this.a != null) {
         MarginLayoutParams var3 = (MarginLayoutParams)this.a.getLayoutParams();
         int var4 = this.getPaddingLeft();
         int var5 = this.getPaddingRight();
         int var6 = this.getPaddingTop();
         int var7 = this.getPaddingBottom();
         int var8 = MeasureSpec.getSize(var2);
         int var9 = MeasureSpec.getSize(var1);
         int var10 = var3.leftMargin;
         int var11 = var3.rightMargin;
         int var12 = var3.topMargin;
         int var13 = var3.bottomMargin;
         var11 = MeasureSpec.makeMeasureSpec(var9 - (var4 + var5) - (var10 + var11), 1073741824);
         var8 = MeasureSpec.makeMeasureSpec(var8 - (var6 + var7) - (var13 + var12), Integer.MIN_VALUE);
         this.a.measure(var11, var8);
      }

      this.setMeasuredDimension(getDefaultSize(this.getSuggestedMinimumWidth(), var1), getDefaultSize(this.getSuggestedMinimumWidth(), var2));
   }

   public void setCardGravity(int var1) {
      if (Log.isLoggable("CardScrollView", 3)) {
         Log.d("CardScrollView", (new StringBuilder(27)).append("setCardGravity: ").append(var1).toString());
      }

      if (this.a()) {
         var1 &= 112;
         if (((LayoutParams)this.a.getLayoutParams()).gravity != var1) {
            this.a.setLayoutParams(new LayoutParams(-1, -2, var1));
            this.requestLayout();
         }
      }

   }

   public void setExpansionDirection(int var1) {
      if (Log.isLoggable("CardScrollView", 3)) {
         Log.d("CardScrollView", (new StringBuilder(34)).append("setExpansionDirection: ").append(var1).toString());
      }

      if (this.a() && var1 != this.a.getExpansionDirection()) {
         this.a.setExpansionDirection(var1);
         if (var1 == 1 && this.getScrollY() < 0) {
            this.scrollTo(0, 0);
         } else if (var1 == -1 && this.getScrollY() > 0) {
            this.scrollTo(0, 0);
         }

         this.requestLayout();
      }

   }

   public void setExpansionEnabled(boolean var1) {
      if (Log.isLoggable("CardScrollView", 3)) {
         Log.d("CardScrollView", (new StringBuilder(26)).append("setExpansionEnabled: ").append(var1).toString());
      }

      if (this.a() && var1 != this.a.a()) {
         this.a.setExpansionEnabled(var1);
         if (!var1) {
            this.scrollTo(0, 0);
         }
      }

   }

   public void setExpansionFactor(float var1) {
      if (Log.isLoggable("CardScrollView", 3)) {
         Log.d("CardScrollView", (new StringBuilder(35)).append("setExpansionFactor: ").append(var1).toString());
      }

      if (this.a()) {
         this.a.setExpansionFactor(var1);
      }

   }
}
