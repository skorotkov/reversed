package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window.Callback;

public class ActionBarOverlayLayout extends ViewGroup implements android.support.v4.view.bo {
   static final int[] e;
   private final Runnable A;
   private final android.support.v4.view.bp B;
   ActionBarContainer a;
   boolean b;
   android.support.v4.view.dy c;
   final android.support.v4.view.em d;
   private int f;
   private int g;
   private ContentFrameLayout h;
   private bh i;
   private Drawable j;
   private boolean k;
   private boolean l;
   private boolean m;
   private boolean n;
   private int o;
   private int p;
   private final Rect q;
   private final Rect r;
   private final Rect s;
   private final Rect t;
   private final Rect u;
   private final Rect v;
   private h w;
   private final int x;
   private android.support.v4.widget.ah y;
   private final Runnable z;

   static {
      e = new int[]{android.support.v7.a.b.actionBarSize, 16842841};
   }

   public ActionBarOverlayLayout(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public ActionBarOverlayLayout(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.g = 0;
      this.q = new Rect();
      this.r = new Rect();
      this.s = new Rect();
      this.t = new Rect();
      this.u = new Rect();
      this.v = new Rect();
      this.x = 600;
      this.d = new e(this);
      this.z = new f(this);
      this.A = new g(this);
      this.a(var1);
      this.B = new android.support.v4.view.bp(this);
   }

   private bh a(View var1) {
      bh var2;
      if (var1 instanceof bh) {
         var2 = (bh)var1;
      } else {
         if (!(var1 instanceof Toolbar)) {
            throw new IllegalStateException("Can't make a decor toolbar out of " + var1.getClass().getSimpleName());
         }

         var2 = ((Toolbar)var1).getWrapper();
      }

      return var2;
   }

   private void a(Context var1) {
      boolean var2 = true;
      TypedArray var3 = this.getContext().getTheme().obtainStyledAttributes(e);
      this.f = var3.getDimensionPixelSize(0, 0);
      this.j = var3.getDrawable(1);
      boolean var4;
      if (this.j == null) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.setWillNotDraw(var4);
      var3.recycle();
      if (var1.getApplicationInfo().targetSdkVersion < 19) {
         var4 = var2;
      } else {
         var4 = false;
      }

      this.k = var4;
      this.y = android.support.v4.widget.ah.a(var1);
   }

   private boolean a(float var1, float var2) {
      boolean var3 = false;
      this.y.a(0, 0, 0, (int)var2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
      if (this.y.e() > this.a.getHeight()) {
         var3 = true;
      }

      return var3;
   }

   private boolean a(View var1, Rect var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      boolean var7 = false;
      i var9 = (i)var1.getLayoutParams();
      boolean var8 = var7;
      if (var3) {
         var8 = var7;
         if (var9.leftMargin != var2.left) {
            var9.leftMargin = var2.left;
            var8 = true;
         }
      }

      var3 = var8;
      if (var4) {
         var3 = var8;
         if (var9.topMargin != var2.top) {
            var9.topMargin = var2.top;
            var3 = true;
         }
      }

      var4 = var3;
      if (var6) {
         var4 = var3;
         if (var9.rightMargin != var2.right) {
            var9.rightMargin = var2.right;
            var4 = true;
         }
      }

      if (var5 && var9.bottomMargin != var2.bottom) {
         var9.bottomMargin = var2.bottom;
         var3 = true;
      } else {
         var3 = var4;
      }

      return var3;
   }

   private void d() {
      this.c();
      this.postDelayed(this.z, 600L);
   }

   private void e() {
      this.c();
      this.postDelayed(this.A, 600L);
   }

   private void f() {
      this.c();
      this.z.run();
   }

   private void g() {
      this.c();
      this.A.run();
   }

   protected i a() {
      return new i(-1, -1);
   }

   public i a(AttributeSet var1) {
      return new i(this.getContext(), var1);
   }

   void b() {
      if (this.h == null) {
         this.h = (ContentFrameLayout)this.findViewById(android.support.v7.a.g.action_bar_activity_content);
         this.a = (ActionBarContainer)this.findViewById(android.support.v7.a.g.action_bar_container);
         this.i = this.a(this.findViewById(android.support.v7.a.g.action_bar));
      }

   }

   void c() {
      this.removeCallbacks(this.z);
      this.removeCallbacks(this.A);
      if (this.c != null) {
         this.c.a();
      }

   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      return var1 instanceof i;
   }

   public void draw(Canvas var1) {
      super.draw(var1);
      if (this.j != null && !this.k) {
         int var2;
         if (this.a.getVisibility() == 0) {
            var2 = (int)((float)this.a.getBottom() + android.support.v4.view.bz.l(this.a) + 0.5F);
         } else {
            var2 = 0;
         }

         this.j.setBounds(0, var2, this.getWidth(), this.j.getIntrinsicHeight() + var2);
         this.j.draw(var1);
      }

   }

   protected boolean fitSystemWindows(Rect var1) {
      this.b();
      if ((android.support.v4.view.bz.r(this) & 256) != 0) {
      }

      boolean var2 = this.a(this.a, var1, true, true, false, true);
      this.t.set(var1);
      gx.a(this, this.t, this.q);
      if (!this.r.equals(this.q)) {
         this.r.set(this.q);
         var2 = true;
      }

      if (var2) {
         this.requestLayout();
      }

      return true;
   }

   // $FF: synthetic method
   protected LayoutParams generateDefaultLayoutParams() {
      return this.a();
   }

   // $FF: synthetic method
   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return this.a(var1);
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return new i(var1);
   }

   public int getActionBarHideOffset() {
      int var1;
      if (this.a != null) {
         var1 = -((int)android.support.v4.view.bz.l(this.a));
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getNestedScrollAxes() {
      return this.B.a();
   }

   public CharSequence getTitle() {
      this.b();
      return this.i.a();
   }

   protected void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.a(this.getContext());
      android.support.v4.view.bz.s(this);
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.c();
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var4 = this.getChildCount();
      var5 = this.getPaddingLeft();
      this.getPaddingRight();
      var3 = this.getPaddingTop();
      this.getPaddingBottom();

      for(var2 = 0; var2 < var4; ++var2) {
         View var6 = this.getChildAt(var2);
         if (var6.getVisibility() != 8) {
            i var7 = (i)var6.getLayoutParams();
            int var8 = var6.getMeasuredWidth();
            int var9 = var6.getMeasuredHeight();
            int var10 = var7.leftMargin + var5;
            int var11 = var7.topMargin + var3;
            var6.layout(var10, var11, var8 + var10, var9 + var11);
         }
      }

   }

   protected void onMeasure(int var1, int var2) {
      this.b();
      this.measureChildWithMargins(this.a, var1, 0, var2, 0);
      i var3 = (i)this.a.getLayoutParams();
      int var4 = Math.max(0, this.a.getMeasuredWidth() + var3.leftMargin + var3.rightMargin);
      int var5 = this.a.getMeasuredHeight();
      int var6 = var3.topMargin;
      int var7 = Math.max(0, var3.bottomMargin + var5 + var6);
      int var8 = gx.a(0, android.support.v4.view.bz.j(this.a));
      boolean var11;
      if ((android.support.v4.view.bz.r(this) & 256) != 0) {
         var11 = true;
      } else {
         var11 = false;
      }

      int var9;
      if (var11) {
         var9 = this.f;
         var6 = var9;
         if (this.m) {
            var6 = var9;
            if (this.a.getTabContainer() != null) {
               var6 = var9 + this.f;
            }
         }
      } else if (this.a.getVisibility() != 8) {
         var6 = this.a.getMeasuredHeight();
      } else {
         var6 = 0;
      }

      this.s.set(this.q);
      this.u.set(this.t);
      Rect var10;
      if (!this.l && !var11) {
         var10 = this.s;
         var10.top += var6;
         var10 = this.s;
         var10.bottom += 0;
      } else {
         var10 = this.u;
         var10.top += var6;
         var10 = this.u;
         var10.bottom += 0;
      }

      this.a(this.h, this.s, true, true, true, true);
      if (!this.v.equals(this.u)) {
         this.v.set(this.u);
         this.h.a(this.u);
      }

      this.measureChildWithMargins(this.h, var1, 0, var2, 0);
      var3 = (i)this.h.getLayoutParams();
      var6 = Math.max(var4, this.h.getMeasuredWidth() + var3.leftMargin + var3.rightMargin);
      var9 = this.h.getMeasuredHeight();
      var5 = var3.topMargin;
      var9 = Math.max(var7, var3.bottomMargin + var9 + var5);
      var5 = gx.a(var8, android.support.v4.view.bz.j(this.h));
      var8 = this.getPaddingLeft();
      var7 = this.getPaddingRight();
      var9 = Math.max(var9 + this.getPaddingTop() + this.getPaddingBottom(), this.getSuggestedMinimumHeight());
      this.setMeasuredDimension(android.support.v4.view.bz.a(Math.max(var6 + var8 + var7, this.getSuggestedMinimumWidth()), var1, var5), android.support.v4.view.bz.a(var9, var2, var5 << 16));
   }

   public boolean onNestedFling(View var1, float var2, float var3, boolean var4) {
      boolean var5 = true;
      if (this.n && var4) {
         if (this.a(var2, var3)) {
            this.g();
         } else {
            this.f();
         }

         this.b = true;
         var4 = var5;
      } else {
         var4 = false;
      }

      return var4;
   }

   public boolean onNestedPreFling(View var1, float var2, float var3) {
      return false;
   }

   public void onNestedPreScroll(View var1, int var2, int var3, int[] var4) {
   }

   public void onNestedScroll(View var1, int var2, int var3, int var4, int var5) {
      this.o += var3;
      this.setActionBarHideOffset(this.o);
   }

   public void onNestedScrollAccepted(View var1, View var2, int var3) {
      this.B.a(var1, var2, var3);
      this.o = this.getActionBarHideOffset();
      this.c();
      if (this.w != null) {
         this.w.c();
      }

   }

   public boolean onStartNestedScroll(View var1, View var2, int var3) {
      boolean var4;
      if ((var3 & 2) != 0 && this.a.getVisibility() == 0) {
         var4 = this.n;
      } else {
         var4 = false;
      }

      return var4;
   }

   public void onStopNestedScroll(View var1) {
      if (this.n && !this.b) {
         if (this.o <= this.a.getHeight()) {
            this.d();
         } else {
            this.e();
         }
      }

      if (this.w != null) {
         this.w.d();
      }

   }

   public void onWindowSystemUiVisibilityChanged(int var1) {
      boolean var2 = true;
      if (VERSION.SDK_INT >= 16) {
         super.onWindowSystemUiVisibilityChanged(var1);
      }

      this.b();
      int var3 = this.p;
      this.p = var1;
      boolean var4;
      if ((var1 & 4) == 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      boolean var5;
      if ((var1 & 256) != 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (this.w != null) {
         h var6 = this.w;
         if (var5) {
            var2 = false;
         }

         var6.a(var2);
         if (!var4 && var5) {
            this.w.b();
         } else {
            this.w.a();
         }
      }

      if (((var3 ^ var1) & 256) != 0 && this.w != null) {
         android.support.v4.view.bz.s(this);
      }

   }

   protected void onWindowVisibilityChanged(int var1) {
      super.onWindowVisibilityChanged(var1);
      this.g = var1;
      if (this.w != null) {
         this.w.a(var1);
      }

   }

   public void setActionBarHideOffset(int var1) {
      this.c();
      var1 = Math.max(0, Math.min(var1, this.a.getHeight()));
      android.support.v4.view.bz.b(this.a, (float)(-var1));
   }

   public void setActionBarVisibilityCallback(h var1) {
      this.w = var1;
      if (this.getWindowToken() != null) {
         this.w.a(this.g);
         if (this.p != 0) {
            this.onWindowSystemUiVisibilityChanged(this.p);
            android.support.v4.view.bz.s(this);
         }
      }

   }

   public void setHasNonEmbeddedTabs(boolean var1) {
      this.m = var1;
   }

   public void setHideOnContentScrollEnabled(boolean var1) {
      if (var1 != this.n) {
         this.n = var1;
         if (!var1) {
            this.c();
            this.setActionBarHideOffset(0);
         }
      }

   }

   public void setIcon(int var1) {
      this.b();
      this.i.a(var1);
   }

   public void setIcon(Drawable var1) {
      this.b();
      this.i.a(var1);
   }

   public void setLogo(int var1) {
      this.b();
      this.i.b(var1);
   }

   public void setOverlayMode(boolean var1) {
      this.l = var1;
      if (var1 && this.getContext().getApplicationInfo().targetSdkVersion < 19) {
         var1 = true;
      } else {
         var1 = false;
      }

      this.k = var1;
   }

   public void setShowingForActionMode(boolean var1) {
   }

   public void setUiOptions(int var1) {
   }

   public void setWindowCallback(Callback var1) {
      this.b();
      this.i.a(var1);
   }

   public void setWindowTitle(CharSequence var1) {
      this.b();
      this.i.a(var1);
   }

   public boolean shouldDelayChildPressedState() {
      return false;
   }
}
