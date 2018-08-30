package android.support.v7.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

public class fe extends HorizontalScrollView implements OnItemSelectedListener {
   private static final Interpolator j = new DecelerateInterpolator();
   Runnable a;
   cl b;
   int c;
   int d;
   private fh e;
   private Spinner f;
   private boolean g;
   private int h;
   private int i;

   private boolean a() {
      boolean var1;
      if (this.f != null && this.f.getParent() == this) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void b() {
      if (!this.a()) {
         if (this.f == null) {
            this.f = this.d();
         }

         this.removeView(this.b);
         this.addView(this.f, new LayoutParams(-2, -1));
         if (this.f.getAdapter() == null) {
            this.f.setAdapter(new fg(this));
         }

         if (this.a != null) {
            this.removeCallbacks(this.a);
            this.a = null;
         }

         this.f.setSelection(this.i);
      }

   }

   private boolean c() {
      if (this.a()) {
         this.removeView(this.f);
         this.addView(this.b, new LayoutParams(-2, -1));
         this.setTabSelected(this.f.getSelectedItemPosition());
      }

      return false;
   }

   private Spinner d() {
      at var1 = new at(this.getContext(), (AttributeSet)null, android.support.v7.a.b.actionDropDownStyle);
      var1.setLayoutParams(new cm(-2, -1));
      var1.setOnItemSelectedListener(this);
      return var1;
   }

   fi a(android.support.v7.app.c var1, boolean var2) {
      fi var3 = new fi(this, this.getContext(), var1, var2);
      if (var2) {
         var3.setBackgroundDrawable((Drawable)null);
         var3.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, this.h));
      } else {
         var3.setFocusable(true);
         if (this.e == null) {
            this.e = new fh(this);
         }

         var3.setOnClickListener(this.e);
      }

      return var3;
   }

   public void a(int var1) {
      View var2 = this.b.getChildAt(var1);
      if (this.a != null) {
         this.removeCallbacks(this.a);
      }

      this.a = new ff(this, var2);
      this.post(this.a);
   }

   public void onAttachedToWindow() {
      super.onAttachedToWindow();
      if (this.a != null) {
         this.post(this.a);
      }

   }

   protected void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      android.support.v7.view.a var2 = android.support.v7.view.a.a(this.getContext());
      this.setContentHeight(var2.e());
      this.d = var2.f();
   }

   public void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      if (this.a != null) {
         this.removeCallbacks(this.a);
      }

   }

   public void onItemSelected(AdapterView var1, View var2, int var3, long var4) {
      ((fi)var2).b().d();
   }

   public void onMeasure(int var1, int var2) {
      boolean var6 = true;
      int var3 = MeasureSpec.getMode(var1);
      boolean var4;
      if (var3 == 1073741824) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.setFillViewport(var4);
      int var5 = this.b.getChildCount();
      if (var5 <= 1 || var3 != 1073741824 && var3 != Integer.MIN_VALUE) {
         this.c = -1;
      } else {
         if (var5 > 2) {
            this.c = (int)((float)MeasureSpec.getSize(var1) * 0.4F);
         } else {
            this.c = MeasureSpec.getSize(var1) / 2;
         }

         this.c = Math.min(this.c, this.d);
      }

      var5 = MeasureSpec.makeMeasureSpec(this.h, 1073741824);
      if (var4 || !this.g) {
         var6 = false;
      }

      if (var6) {
         this.b.measure(0, var5);
         if (this.b.getMeasuredWidth() > MeasureSpec.getSize(var1)) {
            this.b();
         } else {
            this.c();
         }
      } else {
         this.c();
      }

      var2 = this.getMeasuredWidth();
      super.onMeasure(var1, var5);
      var1 = this.getMeasuredWidth();
      if (var4 && var2 != var1) {
         this.setTabSelected(this.i);
      }

   }

   public void onNothingSelected(AdapterView var1) {
   }

   public void setAllowCollapse(boolean var1) {
      this.g = var1;
   }

   public void setContentHeight(int var1) {
      this.h = var1;
      this.requestLayout();
   }

   public void setTabSelected(int var1) {
      this.i = var1;
      int var2 = this.b.getChildCount();

      for(int var3 = 0; var3 < var2; ++var3) {
         View var4 = this.b.getChildAt(var3);
         boolean var5;
         if (var3 == var1) {
            var5 = true;
         } else {
            var5 = false;
         }

         var4.setSelected(var5);
         if (var5) {
            this.a(var1);
         }
      }

      if (this.f != null && var1 >= 0) {
         this.f.setSelection(var1);
      }

   }
}
