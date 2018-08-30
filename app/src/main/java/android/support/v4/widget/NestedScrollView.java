package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.bg;
import android.support.v4.view.bm;
import android.support.v4.view.bn;
import android.support.v4.view.bo;
import android.support.v4.view.bp;
import android.support.v4.view.bs;
import android.support.v4.view.bu;
import android.support.v4.view.bz;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;

public class NestedScrollView extends FrameLayout implements bm, bo, bs {
   private static final t v = new t();
   private static final int[] w = new int[]{16843130};
   private u A;
   private long a;
   private final Rect b;
   private ah c;
   private i d;
   private i e;
   private int f;
   private boolean g;
   private boolean h;
   private View i;
   private boolean j;
   private VelocityTracker k;
   private boolean l;
   private boolean m;
   private int n;
   private int o;
   private int p;
   private int q;
   private final int[] r;
   private final int[] s;
   private int t;
   private v u;
   private final bp x;
   private final bn y;
   private float z;

   public NestedScrollView(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public NestedScrollView(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public NestedScrollView(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.b = new Rect();
      this.g = true;
      this.h = false;
      this.i = null;
      this.j = false;
      this.m = true;
      this.q = -1;
      this.r = new int[2];
      this.s = new int[2];
      this.a();
      TypedArray var4 = var1.obtainStyledAttributes(var2, w, var3, 0);
      this.setFillViewport(var4.getBoolean(0, false));
      var4.recycle();
      this.x = new bp(this);
      this.y = new bn(this);
      this.setNestedScrollingEnabled(true);
      bz.a(this, (android.support.v4.view.d)v);
   }

   private View a(boolean var1, int var2, int var3) {
      ArrayList var4 = this.getFocusables(2);
      View var5 = null;
      boolean var6 = false;
      int var7 = var4.size();

      View var9;
      for(int var8 = 0; var8 < var7; var5 = var9) {
         label58: {
            var9 = (View)var4.get(var8);
            int var10 = var9.getTop();
            int var11 = var9.getBottom();
            if (var2 < var11 && var10 < var3) {
               boolean var12;
               if (var2 < var10 && var11 < var3) {
                  var12 = true;
               } else {
                  var12 = false;
               }

               if (var5 == null) {
                  var6 = var12;
                  break label58;
               }

               boolean var13;
               if ((!var1 || var10 >= var5.getTop()) && (var1 || var11 <= var5.getBottom())) {
                  var13 = false;
               } else {
                  var13 = true;
               }

               if (var6) {
                  if (var12 && var13) {
                     break label58;
                  }
               } else {
                  if (var12) {
                     var6 = true;
                     break label58;
                  }

                  if (var13) {
                     break label58;
                  }
               }
            }

            var9 = var5;
         }

         ++var8;
      }

      return var5;
   }

   private void a() {
      this.c = ah.a(this.getContext(), (Interpolator)null);
      this.setFocusable(true);
      this.setDescendantFocusability(262144);
      this.setWillNotDraw(false);
      ViewConfiguration var1 = ViewConfiguration.get(this.getContext());
      this.n = var1.getScaledTouchSlop();
      this.o = var1.getScaledMinimumFlingVelocity();
      this.p = var1.getScaledMaximumFlingVelocity();
   }

   private void a(MotionEvent var1) {
      int var2 = (var1.getAction() & '\uff00') >> 8;
      if (var1.getPointerId(var2) == this.q) {
         byte var3;
         if (var2 == 0) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.f = (int)var1.getY(var3);
         this.q = var1.getPointerId(var3);
         if (this.k != null) {
            this.k.clear();
         }
      }

   }

   private boolean a(int var1, int var2, int var3) {
      boolean var4 = false;
      int var5 = this.getHeight();
      int var6 = this.getScrollY();
      var5 += var6;
      boolean var7;
      if (var1 == 33) {
         var7 = true;
      } else {
         var7 = false;
      }

      View var8 = this.a(var7, var2, var3);
      Object var9 = var8;
      if (var8 == null) {
         var9 = this;
      }

      if (var2 >= var6 && var3 <= var5) {
         var7 = var4;
      } else {
         if (var7) {
            var2 -= var6;
         } else {
            var2 = var3 - var5;
         }

         this.e(var2);
         var7 = true;
      }

      if (var9 != this.findFocus()) {
         ((View)var9).requestFocus(var1);
      }

      return var7;
   }

   private boolean a(Rect var1, boolean var2) {
      int var3 = this.a(var1);
      boolean var4;
      if (var3 != 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var4) {
         if (var2) {
            this.scrollBy(0, var3);
         } else {
            this.a(0, var3);
         }
      }

      return var4;
   }

   private boolean a(View var1) {
      boolean var2 = false;
      if (!this.a(var1, 0, this.getHeight())) {
         var2 = true;
      }

      return var2;
   }

   private boolean a(View var1, int var2, int var3) {
      var1.getDrawingRect(this.b);
      this.offsetDescendantRectToMyCoords(var1, this.b);
      boolean var4;
      if (this.b.bottom + var2 >= this.getScrollY() && this.b.top - var2 <= this.getScrollY() + var3) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   private static boolean a(View var0, View var1) {
      boolean var2 = true;
      if (var0 != var1) {
         ViewParent var3 = var0.getParent();
         if (var3 instanceof ViewGroup && a((View)var3, var1)) {
            var2 = true;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   private static int b(int var0, int var1, int var2) {
      int var3;
      if (var1 < var2 && var0 >= 0) {
         var3 = var0;
         if (var1 + var0 > var2) {
            var3 = var2 - var1;
         }
      } else {
         var3 = 0;
      }

      return var3;
   }

   private void b(View var1) {
      var1.getDrawingRect(this.b);
      this.offsetDescendantRectToMyCoords(var1, this.b);
      int var2 = this.a(this.b);
      if (var2 != 0) {
         this.scrollBy(0, var2);
      }

   }

   private boolean b() {
      boolean var1 = false;
      View var2 = this.getChildAt(0);
      boolean var3 = var1;
      if (var2 != null) {
         int var4 = var2.getHeight();
         var3 = var1;
         if (this.getHeight() < var4 + this.getPaddingTop() + this.getPaddingBottom()) {
            var3 = true;
         }
      }

      return var3;
   }

   private void c() {
      if (this.k == null) {
         this.k = VelocityTracker.obtain();
      } else {
         this.k.clear();
      }

   }

   private boolean c(int var1, int var2) {
      boolean var3 = false;
      boolean var4 = var3;
      if (this.getChildCount() > 0) {
         int var5 = this.getScrollY();
         View var6 = this.getChildAt(0);
         var4 = var3;
         if (var2 >= var6.getTop() - var5) {
            var4 = var3;
            if (var2 < var6.getBottom() - var5) {
               var4 = var3;
               if (var1 >= var6.getLeft()) {
                  var4 = var3;
                  if (var1 < var6.getRight()) {
                     var4 = true;
                  }
               }
            }
         }
      }

      return var4;
   }

   private void d() {
      if (this.k == null) {
         this.k = VelocityTracker.obtain();
      }

   }

   private void e() {
      if (this.k != null) {
         this.k.recycle();
         this.k = null;
      }

   }

   private void e(int var1) {
      if (var1 != 0) {
         if (this.m) {
            this.a(0, var1);
         } else {
            this.scrollBy(0, var1);
         }
      }

   }

   private void f() {
      this.j = false;
      this.e();
      this.stopNestedScroll();
      if (this.d != null) {
         this.d.c();
         this.e.c();
      }

   }

   private void f(int var1) {
      int var2 = this.getScrollY();
      boolean var3;
      if (var2 <= 0 && var1 <= 0 || var2 >= this.getScrollRange() && var1 >= 0) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (!this.dispatchNestedPreFling(0.0F, (float)var1)) {
         this.dispatchNestedFling(0.0F, (float)var1, var3);
         if (var3) {
            this.d(var1);
         }
      }

   }

   private void g() {
      if (this.getOverScrollMode() != 2) {
         if (this.d == null) {
            Context var1 = this.getContext();
            this.d = new i(var1);
            this.e = new i(var1);
         }
      } else {
         this.d = null;
         this.e = null;
      }

   }

   private float getVerticalScrollFactorCompat() {
      if (this.z == 0.0F) {
         TypedValue var1 = new TypedValue();
         Context var2 = this.getContext();
         if (!var2.getTheme().resolveAttribute(16842829, var1, true)) {
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
         }

         this.z = var1.getDimension(var2.getResources().getDisplayMetrics());
      }

      return this.z;
   }

   protected int a(Rect var1) {
      int var2 = 0;
      if (this.getChildCount() != 0) {
         int var3 = this.getHeight();
         var2 = this.getScrollY();
         int var4 = var2 + var3;
         int var5 = this.getVerticalFadingEdgeLength();
         int var6 = var2;
         if (var1.top > 0) {
            var6 = var2 + var5;
         }

         var2 = var4;
         if (var1.bottom < this.getChildAt(0).getHeight()) {
            var2 = var4 - var5;
         }

         if (var1.bottom > var2 && var1.top > var6) {
            if (var1.height() > var3) {
               var6 = var1.top - var6 + 0;
            } else {
               var6 = var1.bottom - var2 + 0;
            }

            var2 = Math.min(var6, this.getChildAt(0).getBottom() - var2);
         } else if (var1.top < var6 && var1.bottom < var2) {
            if (var1.height() > var3) {
               var2 = 0 - (var2 - var1.bottom);
            } else {
               var2 = 0 - (var6 - var1.top);
            }

            var2 = Math.max(var2, -this.getScrollY());
         } else {
            var2 = 0;
         }
      }

      return var2;
   }

   public final void a(int var1, int var2) {
      if (this.getChildCount() != 0) {
         if (AnimationUtils.currentAnimationTimeMillis() - this.a > 250L) {
            int var3 = this.getHeight();
            var1 = this.getPaddingBottom();
            int var4 = this.getPaddingTop();
            var3 = Math.max(0, this.getChildAt(0).getHeight() - (var3 - var1 - var4));
            var1 = this.getScrollY();
            var2 = Math.max(0, Math.min(var1 + var2, var3));
            this.c.a(this.getScrollX(), var1, 0, var2 - var1);
            bz.c(this);
         } else {
            if (!this.c.a()) {
               this.c.h();
            }

            this.scrollBy(var1, var2);
         }

         this.a = AnimationUtils.currentAnimationTimeMillis();
      }

   }

   public boolean a(int var1) {
      boolean var2;
      if (var1 == 130) {
         var2 = true;
      } else {
         var2 = false;
      }

      int var3 = this.getHeight();
      if (var2) {
         this.b.top = this.getScrollY() + var3;
         int var5 = this.getChildCount();
         if (var5 > 0) {
            View var4 = this.getChildAt(var5 - 1);
            if (this.b.top + var3 > var4.getBottom()) {
               this.b.top = var4.getBottom() - var3;
            }
         }
      } else {
         this.b.top = this.getScrollY() - var3;
         if (this.b.top < 0) {
            this.b.top = 0;
         }
      }

      this.b.bottom = this.b.top + var3;
      return this.a(var1, this.b.top, this.b.bottom);
   }

   boolean a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9) {
      int var10 = this.getOverScrollMode();
      boolean var11;
      if (this.computeHorizontalScrollRange() > this.computeHorizontalScrollExtent()) {
         var11 = true;
      } else {
         var11 = false;
      }

      boolean var12;
      if (this.computeVerticalScrollRange() > this.computeVerticalScrollExtent()) {
         var12 = true;
      } else {
         var12 = false;
      }

      if (var10 != 0 && (var10 != 1 || !var11)) {
         var11 = false;
      } else {
         var11 = true;
      }

      if (var10 != 0 && (var10 != 1 || !var12)) {
         var12 = false;
      } else {
         var12 = true;
      }

      var1 += var3;
      if (!var11) {
         var7 = 0;
      }

      var2 += var4;
      if (!var12) {
         var8 = 0;
      }

      var4 = -var7;
      var7 += var5;
      var3 = -var8;
      var5 = var8 + var6;
      if (var1 > var7) {
         var9 = true;
         var1 = var7;
      } else if (var1 < var4) {
         var9 = true;
         var1 = var4;
      } else {
         var9 = false;
      }

      boolean var13;
      if (var2 > var5) {
         var13 = true;
         var2 = var5;
      } else if (var2 < var3) {
         var13 = true;
         var2 = var3;
      } else {
         var13 = false;
      }

      if (var13) {
         this.c.a(var1, var2, 0, 0, 0, this.getScrollRange());
      }

      this.onOverScrolled(var1, var2, var9, var13);
      if (!var9 && !var13) {
         var9 = false;
      } else {
         var9 = true;
      }

      return var9;
   }

   public boolean a(KeyEvent var1) {
      short var2 = 33;
      boolean var3 = false;
      this.b.setEmpty();
      boolean var4;
      if (!this.b()) {
         var4 = var3;
         if (this.isFocused()) {
            var4 = var3;
            if (var1.getKeyCode() != 4) {
               View var5 = this.findFocus();
               View var6 = var5;
               if (var5 == this) {
                  var6 = null;
               }

               var6 = FocusFinder.getInstance().findNextFocus(this, var6, 130);
               if (var6 != null && var6 != this && var6.requestFocus(130)) {
                  var4 = true;
               } else {
                  var4 = false;
               }
            }
         }
      } else {
         var4 = var3;
         if (var1.getAction() == 0) {
            switch(var1.getKeyCode()) {
            case 19:
               if (!var1.isAltPressed()) {
                  var4 = this.c(33);
               } else {
                  var4 = this.b(33);
               }
               break;
            case 20:
               if (!var1.isAltPressed()) {
                  var4 = this.c(130);
               } else {
                  var4 = this.b(130);
               }
               break;
            case 62:
               if (!var1.isShiftPressed()) {
                  var2 = 130;
               }

               this.a(var2);
               var4 = var3;
               break;
            default:
               var4 = var3;
            }
         }
      }

      return var4;
   }

   public void addView(View var1) {
      if (this.getChildCount() > 0) {
         throw new IllegalStateException("ScrollView can host only one direct child");
      } else {
         super.addView(var1);
      }
   }

   public void addView(View var1, int var2) {
      if (this.getChildCount() > 0) {
         throw new IllegalStateException("ScrollView can host only one direct child");
      } else {
         super.addView(var1, var2);
      }
   }

   public void addView(View var1, int var2, LayoutParams var3) {
      if (this.getChildCount() > 0) {
         throw new IllegalStateException("ScrollView can host only one direct child");
      } else {
         super.addView(var1, var2, var3);
      }
   }

   public void addView(View var1, LayoutParams var2) {
      if (this.getChildCount() > 0) {
         throw new IllegalStateException("ScrollView can host only one direct child");
      } else {
         super.addView(var1, var2);
      }
   }

   public final void b(int var1, int var2) {
      this.a(var1 - this.getScrollX(), var2 - this.getScrollY());
   }

   public boolean b(int var1) {
      boolean var2;
      if (var1 == 130) {
         var2 = true;
      } else {
         var2 = false;
      }

      int var3 = this.getHeight();
      this.b.top = 0;
      this.b.bottom = var3;
      if (var2) {
         int var5 = this.getChildCount();
         if (var5 > 0) {
            View var4 = this.getChildAt(var5 - 1);
            this.b.bottom = var4.getBottom() + this.getPaddingBottom();
            this.b.top = this.b.bottom - var3;
         }
      }

      return this.a(var1, this.b.top, this.b.bottom);
   }

   public boolean c(int var1) {
      View var2 = this.findFocus();
      View var3 = var2;
      if (var2 == this) {
         var3 = null;
      }

      var2 = FocusFinder.getInstance().findNextFocus(this, var3, var1);
      int var4 = this.getMaxScrollAmount();
      boolean var5;
      if (var2 != null && this.a(var2, var4, this.getHeight())) {
         var2.getDrawingRect(this.b);
         this.offsetDescendantRectToMyCoords(var2, this.b);
         this.e(this.a(this.b));
         var2.requestFocus(var1);
      } else {
         int var6;
         if (var1 == 33 && this.getScrollY() < var4) {
            var6 = this.getScrollY();
         } else {
            var6 = var4;
            if (var1 == 130) {
               var6 = var4;
               if (this.getChildCount() > 0) {
                  int var7 = this.getChildAt(0).getBottom();
                  int var8 = this.getScrollY() + this.getHeight() - this.getPaddingBottom();
                  var6 = var4;
                  if (var7 - var8 < var4) {
                     var6 = var7 - var8;
                  }
               }
            }
         }

         if (var6 == 0) {
            var5 = false;
            return var5;
         }

         if (var1 != 130) {
            var6 = -var6;
         }

         this.e(var6);
      }

      if (var3 != null && var3.isFocused() && this.a(var3)) {
         var1 = this.getDescendantFocusability();
         this.setDescendantFocusability(131072);
         this.requestFocus();
         this.setDescendantFocusability(var1);
      }

      var5 = true;
      return var5;
   }

   public int computeHorizontalScrollExtent() {
      return super.computeHorizontalScrollExtent();
   }

   public int computeHorizontalScrollOffset() {
      return super.computeHorizontalScrollOffset();
   }

   public int computeHorizontalScrollRange() {
      return super.computeHorizontalScrollRange();
   }

   public void computeScroll() {
      if (this.c.g()) {
         int var1 = this.getScrollX();
         int var2 = this.getScrollY();
         int var3 = this.c.b();
         int var4 = this.c.c();
         if (var1 != var3 || var2 != var4) {
            int var5 = this.getScrollRange();
            int var6 = this.getOverScrollMode();
            boolean var7;
            if (var6 != 0 && (var6 != 1 || var5 <= 0)) {
               var7 = false;
            } else {
               var7 = true;
            }

            this.a(var3 - var1, var4 - var2, var1, var2, 0, var5, 0, 0, false);
            if (var7) {
               this.g();
               if (var4 <= 0 && var2 > 0) {
                  this.d.a((int)this.c.f());
               } else if (var4 >= var5 && var2 < var5) {
                  this.e.a((int)this.c.f());
               }
            }
         }
      }

   }

   public int computeVerticalScrollExtent() {
      return super.computeVerticalScrollExtent();
   }

   public int computeVerticalScrollOffset() {
      return Math.max(0, super.computeVerticalScrollOffset());
   }

   public int computeVerticalScrollRange() {
      int var1 = this.getChildCount();
      int var2 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
      if (var1 != 0) {
         var1 = this.getChildAt(0).getBottom();
         int var3 = this.getScrollY();
         int var4 = Math.max(0, var1 - var2);
         if (var3 < 0) {
            var2 = var1 - var3;
         } else {
            var2 = var1;
            if (var3 > var4) {
               var2 = var1 + (var3 - var4);
            }
         }
      }

      return var2;
   }

   public void d(int var1) {
      if (this.getChildCount() > 0) {
         int var2 = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
         int var3 = this.getChildAt(0).getHeight();
         this.c.a(this.getScrollX(), this.getScrollY(), 0, var1, 0, 0, 0, Math.max(0, var3 - var2), 0, var2 / 2);
         bz.c(this);
      }

   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      boolean var2;
      if (!super.dispatchKeyEvent(var1) && !this.a(var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public boolean dispatchNestedFling(float var1, float var2, boolean var3) {
      return this.y.a(var1, var2, var3);
   }

   public boolean dispatchNestedPreFling(float var1, float var2) {
      return this.y.a(var1, var2);
   }

   public boolean dispatchNestedPreScroll(int var1, int var2, int[] var3, int[] var4) {
      return this.y.a(var1, var2, var3, var4);
   }

   public boolean dispatchNestedScroll(int var1, int var2, int var3, int var4, int[] var5) {
      return this.y.a(var1, var2, var3, var4, var5);
   }

   public void draw(Canvas var1) {
      super.draw(var1);
      if (this.d != null) {
         int var2 = this.getScrollY();
         int var3;
         int var5;
         int var6;
         if (!this.d.a()) {
            var3 = var1.save();
            int var4 = this.getWidth();
            var5 = this.getPaddingLeft();
            var6 = this.getPaddingRight();
            var1.translate((float)this.getPaddingLeft(), (float)Math.min(0, var2));
            this.d.a(var4 - var5 - var6, this.getHeight());
            if (this.d.a(var1)) {
               bz.c(this);
            }

            var1.restoreToCount(var3);
         }

         if (!this.e.a()) {
            var6 = var1.save();
            var3 = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
            var5 = this.getHeight();
            var1.translate((float)(-var3 + this.getPaddingLeft()), (float)(Math.max(this.getScrollRange(), var2) + var5));
            var1.rotate(180.0F, (float)var3, 0.0F);
            this.e.a(var3, var5);
            if (this.e.a(var1)) {
               bz.c(this);
            }

            var1.restoreToCount(var6);
         }
      }

   }

   protected float getBottomFadingEdgeStrength() {
      float var1;
      if (this.getChildCount() == 0) {
         var1 = 0.0F;
      } else {
         int var2 = this.getVerticalFadingEdgeLength();
         int var3 = this.getHeight();
         int var4 = this.getPaddingBottom();
         var3 = this.getChildAt(0).getBottom() - this.getScrollY() - (var3 - var4);
         if (var3 < var2) {
            var1 = (float)var3 / (float)var2;
         } else {
            var1 = 1.0F;
         }
      }

      return var1;
   }

   public int getMaxScrollAmount() {
      return (int)(0.5F * (float)this.getHeight());
   }

   public int getNestedScrollAxes() {
      return this.x.a();
   }

   int getScrollRange() {
      int var1 = 0;
      if (this.getChildCount() > 0) {
         var1 = Math.max(0, this.getChildAt(0).getHeight() - (this.getHeight() - this.getPaddingBottom() - this.getPaddingTop()));
      }

      return var1;
   }

   protected float getTopFadingEdgeStrength() {
      float var1;
      if (this.getChildCount() == 0) {
         var1 = 0.0F;
      } else {
         int var2 = this.getVerticalFadingEdgeLength();
         int var3 = this.getScrollY();
         if (var3 < var2) {
            var1 = (float)var3 / (float)var2;
         } else {
            var1 = 1.0F;
         }
      }

      return var1;
   }

   public boolean hasNestedScrollingParent() {
      return this.y.b();
   }

   public boolean isNestedScrollingEnabled() {
      return this.y.a();
   }

   protected void measureChild(View var1, int var2, int var3) {
      LayoutParams var4 = var1.getLayoutParams();
      var1.measure(getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight(), var4.width), MeasureSpec.makeMeasureSpec(0, 0));
   }

   protected void measureChildWithMargins(View var1, int var2, int var3, int var4, int var5) {
      MarginLayoutParams var6 = (MarginLayoutParams)var1.getLayoutParams();
      var2 = getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var6.leftMargin + var6.rightMargin + var3, var6.width);
      var3 = var6.topMargin;
      var1.measure(var2, MeasureSpec.makeMeasureSpec(var6.bottomMargin + var3, 0));
   }

   public void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.h = false;
   }

   public boolean onGenericMotionEvent(MotionEvent var1) {
      boolean var2 = false;
      boolean var3 = var2;
      if ((var1.getSource() & 2) != 0) {
         switch(var1.getAction()) {
         case 8:
            var3 = var2;
            if (!this.j) {
               float var4 = bg.d(var1, 9);
               var3 = var2;
               if (var4 != 0.0F) {
                  int var5 = (int)(var4 * this.getVerticalScrollFactorCompat());
                  int var6 = this.getScrollRange();
                  int var7 = this.getScrollY();
                  int var8 = var7 - var5;
                  if (var8 < 0) {
                     var5 = 0;
                  } else {
                     var5 = var6;
                     if (var8 <= var6) {
                        var5 = var8;
                     }
                  }

                  var3 = var2;
                  if (var5 != var7) {
                     super.scrollTo(this.getScrollX(), var5);
                     var3 = true;
                  }
               }
            }
            break;
         default:
            var3 = var2;
         }
      }

      return var3;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2 = true;
      boolean var3 = false;
      int var4 = var1.getAction();
      if (var4 != 2 || !this.j) {
         switch(var4 & 255) {
         case 0:
            var4 = (int)var1.getY();
            if (!this.c((int)var1.getX(), var4)) {
               this.j = false;
               this.e();
            } else {
               this.f = var4;
               this.q = var1.getPointerId(0);
               this.c();
               this.k.addMovement(var1);
               this.c.g();
               var2 = var3;
               if (!this.c.a()) {
                  var2 = true;
               }

               this.j = var2;
               this.startNestedScroll(2);
            }
            break;
         case 1:
         case 3:
            this.j = false;
            this.q = -1;
            this.e();
            if (this.c.a(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
               bz.c(this);
            }

            this.stopNestedScroll();
            break;
         case 2:
            int var5 = this.q;
            if (var5 != -1) {
               var4 = var1.findPointerIndex(var5);
               if (var4 == -1) {
                  Log.e("NestedScrollView", "Invalid pointerId=" + var5 + " in onInterceptTouchEvent");
               } else {
                  var4 = (int)var1.getY(var4);
                  if (Math.abs(var4 - this.f) > this.n && (this.getNestedScrollAxes() & 2) == 0) {
                     this.j = true;
                     this.f = var4;
                     this.d();
                     this.k.addMovement(var1);
                     this.t = 0;
                     ViewParent var6 = this.getParent();
                     if (var6 != null) {
                        var6.requestDisallowInterceptTouchEvent(true);
                     }
                  }
               }
            }
         case 4:
         case 5:
         default:
            break;
         case 6:
            this.a(var1);
         }

         var2 = this.j;
      }

      return var2;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.g = false;
      if (this.i != null && a(this.i, this)) {
         this.b(this.i);
      }

      this.i = null;
      if (!this.h) {
         if (this.u != null) {
            this.scrollTo(this.getScrollX(), this.u.a);
            this.u = null;
         }

         if (this.getChildCount() > 0) {
            var2 = this.getChildAt(0).getMeasuredHeight();
         } else {
            var2 = 0;
         }

         var2 = Math.max(0, var2 - (var5 - var3 - this.getPaddingBottom() - this.getPaddingTop()));
         if (this.getScrollY() > var2) {
            this.scrollTo(this.getScrollX(), var2);
         } else if (this.getScrollY() < 0) {
            this.scrollTo(this.getScrollX(), 0);
         }
      }

      this.scrollTo(this.getScrollX(), this.getScrollY());
      this.h = true;
   }

   protected void onMeasure(int var1, int var2) {
      super.onMeasure(var1, var2);
      if (this.l && MeasureSpec.getMode(var2) != 0 && this.getChildCount() > 0) {
         View var3 = this.getChildAt(0);
         var2 = this.getMeasuredHeight();
         if (var3.getMeasuredHeight() < var2) {
            android.widget.FrameLayout.LayoutParams var4 = (android.widget.FrameLayout.LayoutParams)var3.getLayoutParams();
            var3.measure(getChildMeasureSpec(var1, this.getPaddingLeft() + this.getPaddingRight(), var4.width), MeasureSpec.makeMeasureSpec(var2 - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
         }
      }

   }

   public boolean onNestedFling(View var1, float var2, float var3, boolean var4) {
      if (!var4) {
         this.f((int)var3);
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   public boolean onNestedPreFling(View var1, float var2, float var3) {
      return this.dispatchNestedPreFling(var2, var3);
   }

   public void onNestedPreScroll(View var1, int var2, int var3, int[] var4) {
      this.dispatchNestedPreScroll(var2, var3, var4, (int[])null);
   }

   public void onNestedScroll(View var1, int var2, int var3, int var4, int var5) {
      var2 = this.getScrollY();
      this.scrollBy(0, var5);
      var2 = this.getScrollY() - var2;
      this.dispatchNestedScroll(0, var2, 0, var5 - var2, (int[])null);
   }

   public void onNestedScrollAccepted(View var1, View var2, int var3) {
      this.x.a(var1, var2, var3);
      this.startNestedScroll(2);
   }

   protected void onOverScrolled(int var1, int var2, boolean var3, boolean var4) {
      super.scrollTo(var1, var2);
   }

   protected boolean onRequestFocusInDescendants(int var1, Rect var2) {
      boolean var3 = false;
      int var4;
      if (var1 == 2) {
         var4 = 130;
      } else {
         var4 = var1;
         if (var1 == 1) {
            var4 = 33;
         }
      }

      View var5;
      if (var2 == null) {
         var5 = FocusFinder.getInstance().findNextFocus(this, (View)null, var4);
      } else {
         var5 = FocusFinder.getInstance().findNextFocusFromRect(this, var2, var4);
      }

      if (var5 != null && !this.a(var5)) {
         var3 = var5.requestFocus(var4, var2);
      }

      return var3;
   }

   protected void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof v)) {
         super.onRestoreInstanceState(var1);
      } else {
         v var2 = (v)var1;
         super.onRestoreInstanceState(var2.getSuperState());
         this.u = var2;
         this.requestLayout();
      }

   }

   protected Parcelable onSaveInstanceState() {
      v var1 = new v(super.onSaveInstanceState());
      var1.a = this.getScrollY();
      return var1;
   }

   protected void onScrollChanged(int var1, int var2, int var3, int var4) {
      super.onScrollChanged(var1, var2, var3, var4);
      if (this.A != null) {
         this.A.a(this, var1, var2, var3, var4);
      }

   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      View var5 = this.findFocus();
      if (var5 != null && this != var5 && this.a(var5, 0, var4)) {
         var5.getDrawingRect(this.b);
         this.offsetDescendantRectToMyCoords(var5, this.b);
         this.e(this.a(this.b));
      }

   }

   public boolean onStartNestedScroll(View var1, View var2, int var3) {
      boolean var4;
      if ((var3 & 2) != 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   public void onStopNestedScroll(View var1) {
      this.x.a(var1);
      this.stopNestedScroll();
   }

   public boolean onTouchEvent(MotionEvent var1) {
      this.d();
      MotionEvent var2 = MotionEvent.obtain(var1);
      int var3 = bg.a(var1);
      if (var3 == 0) {
         this.t = 0;
      }

      var2.offsetLocation(0.0F, (float)this.t);
      boolean var4;
      ViewParent var5;
      switch(var3) {
      case 0:
         if (this.getChildCount() == 0) {
            var4 = false;
            return var4;
         }

         if (!this.c.a()) {
            var4 = true;
         } else {
            var4 = false;
         }

         this.j = var4;
         if (var4) {
            var5 = this.getParent();
            if (var5 != null) {
               var5.requestDisallowInterceptTouchEvent(true);
            }
         }

         if (!this.c.a()) {
            this.c.h();
         }

         this.f = (int)var1.getY();
         this.q = var1.getPointerId(0);
         this.startNestedScroll(2);
         break;
      case 1:
         if (this.j) {
            VelocityTracker var11 = this.k;
            var11.computeCurrentVelocity(1000, (float)this.p);
            var3 = (int)bu.b(var11, this.q);
            if (Math.abs(var3) > this.o) {
               this.f(-var3);
            } else if (this.c.a(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
               bz.c(this);
            }
         }

         this.q = -1;
         this.f();
         break;
      case 2:
         int var6 = var1.findPointerIndex(this.q);
         if (var6 == -1) {
            Log.e("NestedScrollView", "Invalid pointerId=" + this.q + " in onTouchEvent");
         } else {
            int var7 = (int)var1.getY(var6);
            int var8 = this.f - var7;
            var3 = var8;
            if (this.dispatchNestedPreScroll(0, var8, this.s, this.r)) {
               var3 = var8 - this.s[1];
               var2.offsetLocation(0.0F, (float)this.r[1]);
               this.t += this.r[1];
            }

            if (!this.j && Math.abs(var3) > this.n) {
               var5 = this.getParent();
               if (var5 != null) {
                  var5.requestDisallowInterceptTouchEvent(true);
               }

               this.j = true;
               if (var3 > 0) {
                  var3 -= this.n;
               } else {
                  var3 += this.n;
               }
            }

            if (this.j) {
               this.f = var7 - this.r[1];
               int var9 = this.getScrollY();
               var7 = this.getScrollRange();
               var8 = this.getOverScrollMode();
               boolean var12;
               if (var8 != 0 && (var8 != 1 || var7 <= 0)) {
                  var12 = false;
               } else {
                  var12 = true;
               }

               if (this.a(0, var3, 0, this.getScrollY(), 0, var7, 0, 0, true) && !this.hasNestedScrollingParent()) {
                  this.k.clear();
               }

               int var10 = this.getScrollY() - var9;
               if (this.dispatchNestedScroll(0, var10, 0, var3 - var10, this.r)) {
                  this.f -= this.r[1];
                  var2.offsetLocation(0.0F, (float)this.r[1]);
                  this.t += this.r[1];
               } else if (var12) {
                  this.g();
                  var8 = var9 + var3;
                  if (var8 < 0) {
                     this.d.a((float)var3 / (float)this.getHeight(), var1.getX(var6) / (float)this.getWidth());
                     if (!this.e.a()) {
                        this.e.c();
                     }
                  } else if (var8 > var7) {
                     this.e.a((float)var3 / (float)this.getHeight(), 1.0F - var1.getX(var6) / (float)this.getWidth());
                     if (!this.d.a()) {
                        this.d.c();
                     }
                  }

                  if (this.d != null && (!this.d.a() || !this.e.a())) {
                     bz.c(this);
                  }
               }
            }
         }
         break;
      case 3:
         if (this.j && this.getChildCount() > 0 && this.c.a(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
            bz.c(this);
         }

         this.q = -1;
         this.f();
      case 4:
      default:
         break;
      case 5:
         var3 = bg.b(var1);
         this.f = (int)var1.getY(var3);
         this.q = var1.getPointerId(var3);
         break;
      case 6:
         this.a(var1);
         this.f = (int)var1.getY(var1.findPointerIndex(this.q));
      }

      if (this.k != null) {
         this.k.addMovement(var2);
      }

      var2.recycle();
      var4 = true;
      return var4;
   }

   public void requestChildFocus(View var1, View var2) {
      if (!this.g) {
         this.b(var2);
      } else {
         this.i = var2;
      }

      super.requestChildFocus(var1, var2);
   }

   public boolean requestChildRectangleOnScreen(View var1, Rect var2, boolean var3) {
      var2.offset(var1.getLeft() - var1.getScrollX(), var1.getTop() - var1.getScrollY());
      return this.a(var2, var3);
   }

   public void requestDisallowInterceptTouchEvent(boolean var1) {
      if (var1) {
         this.e();
      }

      super.requestDisallowInterceptTouchEvent(var1);
   }

   public void requestLayout() {
      this.g = true;
      super.requestLayout();
   }

   public void scrollTo(int var1, int var2) {
      if (this.getChildCount() > 0) {
         View var3 = this.getChildAt(0);
         var1 = b(var1, this.getWidth() - this.getPaddingRight() - this.getPaddingLeft(), var3.getWidth());
         var2 = b(var2, this.getHeight() - this.getPaddingBottom() - this.getPaddingTop(), var3.getHeight());
         if (var1 != this.getScrollX() || var2 != this.getScrollY()) {
            super.scrollTo(var1, var2);
         }
      }

   }

   public void setFillViewport(boolean var1) {
      if (var1 != this.l) {
         this.l = var1;
         this.requestLayout();
      }

   }

   public void setNestedScrollingEnabled(boolean var1) {
      this.y.a(var1);
   }

   public void setOnScrollChangeListener(u var1) {
      this.A = var1;
   }

   public void setSmoothScrollingEnabled(boolean var1) {
      this.m = var1;
   }

   public boolean shouldDelayChildPressedState() {
      return true;
   }

   public boolean startNestedScroll(int var1) {
      return this.y.a(var1);
   }

   public void stopNestedScroll() {
      this.y.c();
   }
}
