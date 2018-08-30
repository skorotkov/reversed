package android.support.wearable.view;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

@Deprecated
@TargetApi(20)
public class f extends ViewGroup {
   private boolean a;
   private boolean b;
   private float c;
   private int d;
   private final int e;
   private final Rect f;
   private int g;
   private boolean h;
   private int i;
   private final Rect j;
   private final Rect k;
   private boolean l;
   private final g m;

   public static int a(int var0, int var1, boolean var2) {
      int var3 = MeasureSpec.getMode(var1);
      int var4 = MeasureSpec.getSize(var1);
      var1 = var0;
      switch(var3) {
      case Integer.MIN_VALUE:
         var1 = var0;
         if (var2) {
            var1 = var4;
         }
      case 0:
         break;
      case 1073741824:
         var1 = var4;
         break;
      default:
         var1 = var0;
      }

      return var1;
   }

   public boolean a() {
      return this.b;
   }

   public void addView(View var1) {
      if (this.getChildCount() > 0) {
         throw new IllegalStateException("CardFrame can host only one direct child");
      } else {
         super.addView(var1);
      }
   }

   public void addView(View var1, int var2) {
      if (this.getChildCount() > 0) {
         throw new IllegalStateException("CardFrame can host only one direct child");
      } else {
         super.addView(var1, var2);
      }
   }

   public void addView(View var1, int var2, LayoutParams var3) {
      if (this.getChildCount() > 0) {
         throw new IllegalStateException("CardFrame can host only one direct child");
      } else {
         super.addView(var1, var2, var3);
      }
   }

   public void addView(View var1, LayoutParams var2) {
      if (this.getChildCount() > 0) {
         throw new IllegalStateException("CardFrame can host only one direct child");
      } else {
         super.addView(var1, var2);
      }
   }

   protected boolean drawChild(Canvas var1, View var2, long var3) {
      int var5;
      boolean var6;
      int var8;
      boolean var9;
      label36: {
         var5 = this.e;
         var6 = false;
         this.f.set(var2.getLeft(), var2.getTop(), var2.getRight(), var2.getBottom());
         int var7 = this.getPaddingTop() + this.getPaddingBottom();
         var8 = var2.getHeight();
         var9 = var6;
         if (this.a) {
            if (this.d == -1 && var8 + var7 > this.getHeight()) {
               this.f.top = this.getPaddingTop();
               var9 = true;
               var6 = false;
               break label36;
            }

            var9 = var6;
            if (this.d == 1) {
               var9 = var6;
               if (var7 + var8 > this.getHeight()) {
                  var9 = true;
                  this.f.bottom = this.getHeight() - this.getPaddingBottom();
               }
            }
         }

         boolean var11 = false;
         var6 = var9;
         var9 = var11;
      }

      var8 = var1.getSaveCount();
      var1.clipRect(this.f);
      if (var9) {
         var1.saveLayer((float)this.f.left, (float)this.f.top, (float)this.f.right, (float)(this.f.top + var5), (Paint)null, 4);
      }

      if (var6) {
         var1.saveLayer((float)this.f.left, (float)(this.f.bottom - var5), (float)this.f.right, (float)this.f.bottom, (Paint)null, 4);
      }

      boolean var10 = super.drawChild(var1, var2, var3);
      if (var9) {
         android.support.wearable.view.g.a(this.m).reset();
         android.support.wearable.view.g.a(this.m).setScale(1.0F, (float)var5);
         android.support.wearable.view.g.a(this.m).postTranslate((float)this.f.left, (float)this.f.top);
         android.support.wearable.view.g.b(this.m).setLocalMatrix(android.support.wearable.view.g.a(this.m));
         android.support.wearable.view.g.c(this.m).setShader(android.support.wearable.view.g.b(this.m));
         var1.drawRect((float)this.f.left, (float)this.f.top, (float)this.f.right, (float)(this.f.top + var5), android.support.wearable.view.g.c(this.m));
      }

      if (var6) {
         android.support.wearable.view.g.a(this.m).reset();
         android.support.wearable.view.g.a(this.m).setScale(1.0F, (float)var5);
         android.support.wearable.view.g.a(this.m).postRotate(180.0F);
         android.support.wearable.view.g.a(this.m).postTranslate((float)this.f.left, (float)this.f.bottom);
         android.support.wearable.view.g.b(this.m).setLocalMatrix(android.support.wearable.view.g.a(this.m));
         android.support.wearable.view.g.c(this.m).setShader(android.support.wearable.view.g.b(this.m));
         var1.drawRect((float)this.f.left, (float)(this.f.bottom - var5), (float)this.f.right, (float)this.f.bottom, android.support.wearable.view.g.c(this.m));
      }

      var1.restoreToCount(var8);
      return var10;
   }

   public int getContentPaddingBottom() {
      return this.k.bottom;
   }

   public int getContentPaddingLeft() {
      return this.k.left;
   }

   public int getContentPaddingRight() {
      return this.k.right;
   }

   public int getContentPaddingTop() {
      return this.k.top;
   }

   public int getExpansionDirection() {
      return this.d;
   }

   public float getExpansionFactor() {
      return this.c;
   }

   public WindowInsets onApplyWindowInsets(WindowInsets var1) {
      boolean var2 = var1.isRound();
      if (var2 != this.h) {
         this.h = var2;
         this.requestLayout();
      }

      if (var1.getSystemWindowInsetBottom() > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2 != this.l) {
         this.l = var2;
         this.requestLayout();
      }

      return var1.consumeSystemWindowInsets();
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.requestApplyInsets();
   }

   public void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      super.onInitializeAccessibilityEvent(var1);
      var1.setClassName(f.class.getName());
   }

   public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      var1.setClassName(f.class.getName());
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if (this.getChildCount() != 0) {
         View var6 = this.getChildAt(0);
         var3 = var5 - var3;
         var4 = this.getPaddingLeft();
         var2 = this.j.left;
         var5 = this.k.left + var4 + var2;
         var4 = var6.getMeasuredWidth();
         if (this.d == -1) {
            var2 = var3 - (var6.getMeasuredHeight() + this.getPaddingBottom() + this.j.bottom + this.k.bottom);
         } else {
            var3 = this.getPaddingTop();
            var2 = this.j.top;
            var2 = this.k.top + var3 + var2;
            var3 = var6.getMeasuredHeight() + var2;
         }

         var6.layout(var5, var2, var5 + var4, var3);
      }

   }

   protected void onMeasure(int var1, int var2) {
      boolean var3 = true;
      int var4 = MeasureSpec.getSize(var1);
      int var5 = MeasureSpec.getSize(var2);
      int var7;
      int var8;
      int var9;
      if (this.h) {
         MarginLayoutParams var6 = (MarginLayoutParams)this.getLayoutParams();
         this.j.setEmpty();
         if (var6.leftMargin < 0) {
            var7 = -var6.leftMargin;
            var4 -= var7;
         } else {
            var7 = 0;
         }

         if (var6.rightMargin < 0) {
            var8 = -var6.rightMargin;
            var4 -= var8;
         } else {
            var8 = 0;
         }

         if (var6.bottomMargin < 0) {
            var9 = -var6.bottomMargin;
            var5 -= var9;
         } else {
            var9 = 0;
         }

         this.i = (int)((float)Math.max(var4, var5) * 0.146467F);
         this.j.left = this.i - (this.getPaddingLeft() - var7);
         this.j.right = this.i - (this.getPaddingRight() - var8);
         if (!this.l) {
            this.j.bottom = this.i - (this.getPaddingBottom() - var9);
         }
      }

      var8 = a(this.getSuggestedMinimumWidth(), var1, true);
      var1 = a(this.getSuggestedMinimumHeight(), var2, false);
      if (this.getChildCount() == 0) {
         this.setMeasuredDimension(var8, var1);
      } else {
         View var17 = this.getChildAt(0);
         var1 = MeasureSpec.getSize(var2);
         var2 = MeasureSpec.getMode(var2);
         this.a = this.b;
         boolean var16;
         if (var2 != 0 && var1 != 0) {
            if (var2 == 1073741824) {
               Log.w("CardFrame", "height measure spec passed with mode EXACT");
               this.a = false;
               this.g = var1;
               var7 = this.g;
               var2 = 1073741824;
               var4 = var7;
               var16 = false;
            } else {
               this.g = var1;
               var2 = this.g;
               var1 = var2;
               if (this.a) {
                  var1 = (int)((float)var2 * this.c);
               }

               if (this.d == -1) {
                  var2 = 0;
                  var4 = 0;
                  var7 = var1;
                  var16 = false;
               } else {
                  var2 = Integer.MIN_VALUE;
                  var4 = this.getPaddingBottom() + var1;
                  var7 = var1;
                  var16 = false;
               }
            }
         } else {
            Log.w("CardFrame", "height measure spec passed with mode UNSPECIFIED, or zero height.");
            this.a = false;
            this.g = 0;
            var16 = true;
            var2 = 0;
            var4 = 0;
            var7 = 0;
         }

         int var10 = this.getPaddingLeft();
         int var11 = this.getPaddingRight();
         int var12 = this.k.left;
         int var13 = this.k.right;
         var9 = this.j.left;
         int var14 = this.j.right;
         var5 = this.getPaddingTop() + this.getPaddingBottom() + this.k.top + this.k.bottom + this.j.top + this.j.bottom;
         var9 = MeasureSpec.makeMeasureSpec(var8 - (var10 + var11 + var12 + var13 + var9 + var14), 1073741824);
         var2 = MeasureSpec.makeMeasureSpec(var4 - var5, var2);
         var17.measure(getChildMeasureSpec(var9, 0, var17.getLayoutParams().width), var2);
         if (var16) {
            var1 = var17.getMeasuredHeight() + var5;
         } else {
            var2 = Math.min(var7, var17.getMeasuredHeight() + var5);
            boolean var15 = this.a;
            if (var17.getMeasuredHeight() > var2 - var5) {
               var16 = var3;
            } else {
               var16 = false;
            }

            this.a = var15 & var16;
            var1 = var2;
         }

         this.setMeasuredDimension(var8, var1);
      }

   }

   public void setExpansionDirection(int var1) {
      this.d = var1;
      this.requestLayout();
      this.invalidate();
   }

   public void setExpansionEnabled(boolean var1) {
      this.b = var1;
      this.requestLayout();
      this.invalidate();
   }

   public void setExpansionFactor(float var1) {
      this.c = var1;
      this.requestLayout();
      this.invalidate();
   }

   public boolean shouldDelayChildPressedState() {
      return false;
   }
}
