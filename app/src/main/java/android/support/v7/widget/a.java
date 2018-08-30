package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;

abstract class a extends ViewGroup {
   protected final b a;
   protected final Context b;
   protected ActionMenuView c;
   protected j d;
   protected int e;
   protected android.support.v4.view.dy f;
   private boolean g;
   private boolean h;

   a(Context var1) {
      this(var1, (AttributeSet)null);
   }

   a(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   a(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.a = new b(this);
      TypedValue var4 = new TypedValue();
      if (var1.getTheme().resolveAttribute(android.support.v7.a.b.actionBarPopupTheme, var4, true) && var4.resourceId != 0) {
         this.b = new ContextThemeWrapper(var1, var4.resourceId);
      } else {
         this.b = var1;
      }

   }

   protected static int a(int var0, int var1, boolean var2) {
      if (var2) {
         var0 -= var1;
      } else {
         var0 += var1;
      }

      return var0;
   }

   // $FF: synthetic method
   static void a(a var0, int var1) {
      var0.setVisibility(var1);
   }

   // $FF: synthetic method
   static void b(a var0, int var1) {
      var0.setVisibility(var1);
   }

   protected int a(View var1, int var2, int var3, int var4) {
      var1.measure(MeasureSpec.makeMeasureSpec(var2, Integer.MIN_VALUE), var3);
      return Math.max(0, var2 - var1.getMeasuredWidth() - var4);
   }

   protected int a(View var1, int var2, int var3, int var4, boolean var5) {
      int var6 = var1.getMeasuredWidth();
      int var7 = var1.getMeasuredHeight();
      var3 += (var4 - var7) / 2;
      if (var5) {
         var1.layout(var2 - var6, var3, var2, var7 + var3);
      } else {
         var1.layout(var2, var3, var2 + var6, var7 + var3);
      }

      var2 = var6;
      if (var5) {
         var2 = -var6;
      }

      return var2;
   }

   public int getAnimatedVisibility() {
      int var1;
      if (this.f != null) {
         var1 = this.a.a;
      } else {
         var1 = this.getVisibility();
      }

      return var1;
   }

   public int getContentHeight() {
      return this.e;
   }

   protected void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      TypedArray var2 = this.getContext().obtainStyledAttributes((AttributeSet)null, android.support.v7.a.k.ActionBar, android.support.v7.a.b.actionBarStyle, 0);
      this.setContentHeight(var2.getLayoutDimension(android.support.v7.a.k.ActionBar_height, 0));
      var2.recycle();
      if (this.d != null) {
         this.d.a(var1);
      }

   }

   public boolean onHoverEvent(MotionEvent var1) {
      int var2 = android.support.v4.view.bg.a(var1);
      if (var2 == 9) {
         this.h = false;
      }

      if (!this.h) {
         boolean var3 = super.onHoverEvent(var1);
         if (var2 == 9 && !var3) {
            this.h = true;
         }
      }

      if (var2 == 10 || var2 == 3) {
         this.h = false;
      }

      return true;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      int var2 = android.support.v4.view.bg.a(var1);
      if (var2 == 0) {
         this.g = false;
      }

      if (!this.g) {
         boolean var3 = super.onTouchEvent(var1);
         if (var2 == 0 && !var3) {
            this.g = true;
         }
      }

      if (var2 == 1 || var2 == 3) {
         this.g = false;
      }

      return true;
   }

   public void setContentHeight(int var1) {
      this.e = var1;
      this.requestLayout();
   }

   public void setVisibility(int var1) {
      if (var1 != this.getVisibility()) {
         if (this.f != null) {
            this.f.a();
         }

         super.setVisibility(var1);
      }

   }
}
