package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.Rect;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class at extends Spinner implements android.support.v4.view.bt {
   private static final int[] d = new int[]{16843505};
   aw a;
   int b;
   final Rect c;
   private ai e;
   private Context f;
   private by g;
   private SpinnerAdapter h;
   private boolean i;

   public at(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, -1);
   }

   public at(Context var1, AttributeSet var2, int var3, int var4) {
      this(var1, var2, var3, var4, (Theme)null);
   }

   public at(Context param1, AttributeSet param2, int param3, int param4, Theme param5) {
      // $FF: Couldn't be decompiled
   }

   int a(SpinnerAdapter var1, Drawable var2) {
      int var3 = 0;
      if (var1 != null) {
         int var4 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
         int var5 = MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
         var3 = Math.max(0, this.getSelectedItemPosition());
         int var6 = Math.min(var1.getCount(), var3 + 15);
         int var7 = Math.max(0, var3 - (15 - (var6 - var3)));
         View var8 = null;
         var3 = 0;

         for(int var9 = 0; var7 < var6; ++var7) {
            int var10 = var1.getItemViewType(var7);
            if (var10 != var9) {
               var8 = null;
               var9 = var10;
            }

            var8 = var1.getView(var7, var8, this);
            if (var8.getLayoutParams() == null) {
               var8.setLayoutParams(new LayoutParams(-2, -2));
            }

            var8.measure(var4, var5);
            var3 = Math.max(var3, var8.getMeasuredWidth());
         }

         if (var2 != null) {
            var2.getPadding(this.c);
            var3 += this.c.left + this.c.right;
         }
      }

      return var3;
   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      if (this.e != null) {
         this.e.c();
      }

   }

   public int getDropDownHorizontalOffset() {
      int var1;
      if (this.a != null) {
         var1 = this.a.j();
      } else if (VERSION.SDK_INT >= 16) {
         var1 = super.getDropDownHorizontalOffset();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getDropDownVerticalOffset() {
      int var1;
      if (this.a != null) {
         var1 = this.a.k();
      } else if (VERSION.SDK_INT >= 16) {
         var1 = super.getDropDownVerticalOffset();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getDropDownWidth() {
      int var1;
      if (this.a != null) {
         var1 = this.b;
      } else if (VERSION.SDK_INT >= 16) {
         var1 = super.getDropDownWidth();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public Drawable getPopupBackground() {
      Drawable var1;
      if (this.a != null) {
         var1 = this.a.h();
      } else if (VERSION.SDK_INT >= 16) {
         var1 = super.getPopupBackground();
      } else {
         var1 = null;
      }

      return var1;
   }

   public Context getPopupContext() {
      Context var1;
      if (this.a != null) {
         var1 = this.f;
      } else if (VERSION.SDK_INT >= 23) {
         var1 = super.getPopupContext();
      } else {
         var1 = null;
      }

      return var1;
   }

   public CharSequence getPrompt() {
      CharSequence var1;
      if (this.a != null) {
         var1 = this.a.b();
      } else {
         var1 = super.getPrompt();
      }

      return var1;
   }

   public ColorStateList getSupportBackgroundTintList() {
      ColorStateList var1;
      if (this.e != null) {
         var1 = this.e.a();
      } else {
         var1 = null;
      }

      return var1;
   }

   public Mode getSupportBackgroundTintMode() {
      Mode var1;
      if (this.e != null) {
         var1 = this.e.b();
      } else {
         var1 = null;
      }

      return var1;
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      if (this.a != null && this.a.d()) {
         this.a.c();
      }

   }

   protected void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (this.a != null && MeasureSpec.getMode(var1) == Integer.MIN_VALUE) {
         this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), MeasureSpec.getSize(var1)), this.getMeasuredHeight());
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.g != null && this.g.onTouch(this, var1)) {
         var2 = true;
      } else {
         var2 = super.onTouchEvent(var1);
      }

      return var2;
   }

   public boolean performClick() {
      boolean var1;
      if (this.a != null) {
         if (!this.a.d()) {
            this.a.a();
         }

         var1 = true;
      } else {
         var1 = super.performClick();
      }

      return var1;
   }

   public void setAdapter(SpinnerAdapter var1) {
      if (!this.i) {
         this.h = var1;
      } else {
         super.setAdapter(var1);
         if (this.a != null) {
            Context var2;
            if (this.f == null) {
               var2 = this.getContext();
            } else {
               var2 = this.f;
            }

            this.a.a((ListAdapter)(new av(var1, var2.getTheme())));
         }
      }

   }

   public void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      if (this.e != null) {
         this.e.a(var1);
      }

   }

   public void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      if (this.e != null) {
         this.e.a(var1);
      }

   }

   public void setDropDownHorizontalOffset(int var1) {
      if (this.a != null) {
         this.a.c(var1);
      } else if (VERSION.SDK_INT >= 16) {
         super.setDropDownHorizontalOffset(var1);
      }

   }

   public void setDropDownVerticalOffset(int var1) {
      if (this.a != null) {
         this.a.d(var1);
      } else if (VERSION.SDK_INT >= 16) {
         super.setDropDownVerticalOffset(var1);
      }

   }

   public void setDropDownWidth(int var1) {
      if (this.a != null) {
         this.b = var1;
      } else if (VERSION.SDK_INT >= 16) {
         super.setDropDownWidth(var1);
      }

   }

   public void setPopupBackgroundDrawable(Drawable var1) {
      if (this.a != null) {
         this.a.a((Drawable)var1);
      } else if (VERSION.SDK_INT >= 16) {
         super.setPopupBackgroundDrawable(var1);
      }

   }

   public void setPopupBackgroundResource(int var1) {
      this.setPopupBackgroundDrawable(android.support.v7.b.a.b.b(this.getPopupContext(), var1));
   }

   public void setPrompt(CharSequence var1) {
      if (this.a != null) {
         this.a.a(var1);
      } else {
         super.setPrompt(var1);
      }

   }

   public void setSupportBackgroundTintList(ColorStateList var1) {
      if (this.e != null) {
         this.e.a(var1);
      }

   }

   public void setSupportBackgroundTintMode(Mode var1) {
      if (this.e != null) {
         this.e.a(var1);
      }

   }
}
