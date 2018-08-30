package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
   static final int[] a = new int[]{16842931};
   private static final dq aj = new dq();
   private static final Comparator e = new dc();
   private static final Interpolator f = new dd();
   private int A = 1;
   private boolean B;
   private boolean C;
   private int D;
   private int E;
   private int F;
   private float G;
   private float H;
   private float I;
   private float J;
   private int K = -1;
   private VelocityTracker L;
   private int M;
   private int N;
   private int O;
   private int P;
   private boolean Q;
   private android.support.v4.widget.i R;
   private android.support.v4.widget.i S;
   private boolean T = true;
   private boolean U = false;
   private boolean V;
   private int W;
   private List aa;
   private dl ab;
   private dl ac;
   private List ad;
   private dm ae;
   private int af;
   private Method ag;
   private int ah;
   private ArrayList ai;
   private final Runnable ak = new de(this);
   private int al = 0;
   br b;
   int c;
   private int d;
   private final ArrayList g = new ArrayList();
   private final dh h = new dh();
   private final Rect i = new Rect();
   private int j = -1;
   private Parcelable k = null;
   private ClassLoader l = null;
   private Scroller m;
   private boolean n;
   private dn o;
   private int p;
   private Drawable q;
   private int r;
   private int s;
   private float t = -3.4028235E38F;
   private float u = Float.MAX_VALUE;
   private int v;
   private int w;
   private boolean x;
   private boolean y;
   private boolean z;

   public ViewPager(Context var1) {
      super(var1);
      this.a();
   }

   public ViewPager(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.a();
   }

   private int a(int var1, float var2, int var3, int var4) {
      if (Math.abs(var4) > this.O && Math.abs(var3) > this.M) {
         if (var3 <= 0) {
            ++var1;
         }
      } else {
         float var7;
         if (var1 >= this.c) {
            var7 = 0.4F;
         } else {
            var7 = 0.6F;
         }

         var1 += (int)(var7 + var2);
      }

      var3 = var1;
      if (this.g.size() > 0) {
         dh var5 = (dh)this.g.get(0);
         dh var6 = (dh)this.g.get(this.g.size() - 1);
         var3 = Math.max(var5.b, Math.min(var1, var6.b));
      }

      return var3;
   }

   private Rect a(Rect var1, View var2) {
      if (var1 == null) {
         var1 = new Rect();
      }

      if (var2 == null) {
         var1.set(0, 0, 0, 0);
      } else {
         var1.left = var2.getLeft();
         var1.right = var2.getRight();
         var1.top = var2.getTop();
         var1.bottom = var2.getBottom();

         ViewGroup var4;
         for(ViewParent var3 = var2.getParent(); var3 instanceof ViewGroup && var3 != this; var3 = var4.getParent()) {
            var4 = (ViewGroup)var3;
            var1.left += var4.getLeft();
            var1.right += var4.getRight();
            var1.top += var4.getTop();
            var1.bottom += var4.getBottom();
         }
      }

      return var1;
   }

   private void a(int var1, int var2, int var3, int var4) {
      float var9;
      if (var2 > 0 && !this.g.isEmpty()) {
         if (!this.m.isFinished()) {
            this.m.setFinalX(this.getCurrentItem() * this.getClientWidth());
         } else {
            int var5 = this.getPaddingLeft();
            int var6 = this.getPaddingRight();
            int var7 = this.getPaddingLeft();
            int var8 = this.getPaddingRight();
            var9 = (float)this.getScrollX() / (float)(var2 - var7 - var8 + var4);
            this.scrollTo((int)((float)(var1 - var5 - var6 + var3) * var9), this.getScrollY());
         }
      } else {
         dh var10 = this.b(this.c);
         if (var10 != null) {
            var9 = Math.min(var10.e, this.u);
         } else {
            var9 = 0.0F;
         }

         var1 = (int)(var9 * (float)(var1 - this.getPaddingLeft() - this.getPaddingRight()));
         if (var1 != this.getScrollX()) {
            this.a(false);
            this.scrollTo(var1, this.getScrollY());
         }
      }

   }

   private void a(int var1, boolean var2, int var3, boolean var4) {
      dh var5 = this.b(var1);
      int var7;
      if (var5 != null) {
         float var6 = (float)this.getClientWidth();
         var7 = (int)(Math.max(this.t, Math.min(var5.e, this.u)) * var6);
      } else {
         var7 = 0;
      }

      if (var2) {
         this.a(var7, 0, var3);
         if (var4) {
            this.e(var1);
         }
      } else {
         if (var4) {
            this.e(var1);
         }

         this.a(false);
         this.scrollTo(var7, 0);
         this.d(var7);
      }

   }

   private void a(dh var1, int var2, dh var3) {
      int var4 = this.b.a();
      int var5 = this.getClientWidth();
      float var6;
      if (var5 > 0) {
         var6 = (float)this.p / (float)var5;
      } else {
         var6 = 0.0F;
      }

      float var7;
      int var8;
      int var9;
      float var10;
      if (var3 != null) {
         var5 = var3.b;
         if (var5 < var1.b) {
            var7 = var3.e + var3.d + var6;
            ++var5;

            for(var8 = 0; var5 <= var1.b && var8 < this.g.size(); var5 = var9 + 1) {
               var3 = (dh)this.g.get(var8);

               while(true) {
                  var9 = var5;
                  var10 = var7;
                  if (var5 <= var3.b) {
                     break;
                  }

                  var9 = var5;
                  var10 = var7;
                  if (var8 >= this.g.size() - 1) {
                     break;
                  }

                  ++var8;
                  var3 = (dh)this.g.get(var8);
               }

               while(var9 < var3.b) {
                  var10 += this.b.a(var9) + var6;
                  ++var9;
               }

               var3.e = var10;
               var7 = var10 + var3.d + var6;
            }
         } else if (var5 > var1.b) {
            var8 = this.g.size() - 1;
            var7 = var3.e;
            --var5;

            while(var5 >= var1.b && var8 >= 0) {
               var3 = (dh)this.g.get(var8);

               while(true) {
                  var9 = var5;
                  var10 = var7;
                  if (var5 >= var3.b) {
                     break;
                  }

                  var9 = var5;
                  var10 = var7;
                  if (var8 <= 0) {
                     break;
                  }

                  --var8;
                  var3 = (dh)this.g.get(var8);
               }

               while(var9 > var3.b) {
                  var10 -= this.b.a(var9) + var6;
                  --var9;
               }

               var7 = var10 - (var3.d + var6);
               var3.e = var7;
               var5 = var9 - 1;
            }
         }
      }

      var9 = this.g.size();
      var10 = var1.e;
      var5 = var1.b - 1;
      if (var1.b == 0) {
         var7 = var1.e;
      } else {
         var7 = -3.4028235E38F;
      }

      this.t = var7;
      if (var1.b == var4 - 1) {
         var7 = var1.e + var1.d - 1.0F;
      } else {
         var7 = Float.MAX_VALUE;
      }

      this.u = var7;
      var8 = var2 - 1;

      for(var7 = var10; var8 >= 0; --var8) {
         for(var3 = (dh)this.g.get(var8); var5 > var3.b; --var5) {
            var7 -= this.b.a(var5) + var6;
         }

         var7 -= var3.d + var6;
         var3.e = var7;
         if (var3.b == 0) {
            this.t = var7;
         }

         --var5;
      }

      var7 = var1.e + var1.d + var6;
      var8 = var1.b + 1;
      var5 = var2 + 1;

      for(var2 = var8; var5 < var9; ++var5) {
         for(var1 = (dh)this.g.get(var5); var2 < var1.b; ++var2) {
            var7 += this.b.a(var2) + var6;
         }

         if (var1.b == var4 - 1) {
            this.u = var1.d + var7 - 1.0F;
         }

         var1.e = var7;
         var7 += var1.d + var6;
         ++var2;
      }

      this.U = false;
   }

   private void a(MotionEvent var1) {
      int var2 = bg.b(var1);
      if (var1.getPointerId(var2) == this.K) {
         byte var3;
         if (var2 == 0) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.G = var1.getX(var3);
         this.K = var1.getPointerId(var3);
         if (this.L != null) {
            this.L.clear();
         }
      }

   }

   private void a(boolean var1) {
      boolean var2;
      if (this.al == 2) {
         var2 = true;
      } else {
         var2 = false;
      }

      boolean var3;
      if (var2) {
         this.setScrollingCacheEnabled(false);
         if (!this.m.isFinished()) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (var3) {
            this.m.abortAnimation();
            int var9 = this.getScrollX();
            int var4 = this.getScrollY();
            int var5 = this.m.getCurrX();
            int var6 = this.m.getCurrY();
            if (var9 != var5 || var4 != var6) {
               this.scrollTo(var5, var6);
               if (var5 != var9) {
                  this.d(var5);
               }
            }
         }
      }

      this.z = false;
      byte var10 = 0;
      var3 = var2;

      for(int var8 = var10; var8 < this.g.size(); ++var8) {
         dh var7 = (dh)this.g.get(var8);
         if (var7.c) {
            var7.c = false;
            var3 = true;
         }
      }

      if (var3) {
         if (var1) {
            bz.a(this, (Runnable)this.ak);
         } else {
            this.ak.run();
         }
      }

   }

   private boolean a(float var1, float var2) {
      boolean var3;
      if ((var1 >= (float)this.E || var2 <= 0.0F) && (var1 <= (float)(this.getWidth() - this.E) || var2 >= 0.0F)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   private void b(int var1, float var2, int var3) {
      if (this.ab != null) {
         this.ab.a(var1, var2, var3);
      }

      if (this.aa != null) {
         int var4 = this.aa.size();

         for(int var5 = 0; var5 < var4; ++var5) {
            dl var6 = (dl)this.aa.get(var5);
            if (var6 != null) {
               var6.a(var1, var2, var3);
            }
         }
      }

      if (this.ac != null) {
         this.ac.a(var1, var2, var3);
      }

   }

   private void b(boolean var1) {
      int var2 = this.getChildCount();

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4;
         if (var1) {
            var4 = this.af;
         } else {
            var4 = 0;
         }

         bz.a(this.getChildAt(var3), var4, (Paint)null);
      }

   }

   private boolean b(float var1) {
      boolean var2 = true;
      boolean var3 = false;
      boolean var4 = false;
      float var5 = this.G;
      this.G = var1;
      float var6 = (float)this.getScrollX() + (var5 - var1);
      int var7 = this.getClientWidth();
      var1 = (float)var7 * this.t;
      float var8 = (float)var7;
      var5 = this.u;
      dh var9 = (dh)this.g.get(0);
      dh var10 = (dh)this.g.get(this.g.size() - 1);
      boolean var11;
      if (var9.b != 0) {
         var1 = var9.e * (float)var7;
         var11 = false;
      } else {
         var11 = true;
      }

      if (var10.b != this.b.a() - 1) {
         var5 = var10.e * (float)var7;
         var2 = false;
      } else {
         var5 = var8 * var5;
      }

      if (var6 < var1) {
         var5 = var1;
         if (var11) {
            var4 = this.R.a(Math.abs(var1 - var6) / (float)var7);
            var5 = var1;
         }
      } else if (var6 > var5) {
         var4 = var3;
         if (var2) {
            var4 = this.S.a(Math.abs(var6 - var5) / (float)var7);
         }
      } else {
         var5 = var6;
      }

      this.G += var5 - (float)((int)var5);
      this.scrollTo((int)var5, this.getScrollY());
      this.d((int)var5);
      return var4;
   }

   private void c(boolean var1) {
      ViewParent var2 = this.getParent();
      if (var2 != null) {
         var2.requestDisallowInterceptTouchEvent(var1);
      }

   }

   private static boolean c(View var0) {
      boolean var1;
      if (var0.getClass().getAnnotation(dg.class) != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean d(int var1) {
      boolean var2 = false;
      if (this.g.size() == 0) {
         if (!this.T) {
            this.V = false;
            this.a(0, 0.0F, 0);
            if (!this.V) {
               throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
         }
      } else {
         dh var3 = this.i();
         int var4 = this.getClientWidth();
         int var5 = this.p;
         float var6 = (float)this.p / (float)var4;
         int var7 = var3.b;
         var6 = ((float)var1 / (float)var4 - var3.e) / (var3.d + var6);
         var1 = (int)((float)(var5 + var4) * var6);
         this.V = false;
         this.a(var7, var6, var1);
         if (!this.V) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
         }

         var2 = true;
      }

      return var2;
   }

   private void e(int var1) {
      if (this.ab != null) {
         this.ab.a(var1);
      }

      if (this.aa != null) {
         int var2 = this.aa.size();

         for(int var3 = 0; var3 < var2; ++var3) {
            dl var4 = (dl)this.aa.get(var3);
            if (var4 != null) {
               var4.a(var1);
            }
         }
      }

      if (this.ac != null) {
         this.ac.a(var1);
      }

   }

   private void f() {
      int var2;
      for(int var1 = 0; var1 < this.getChildCount(); var1 = var2 + 1) {
         var2 = var1;
         if (!((di)this.getChildAt(var1).getLayoutParams()).a) {
            this.removeViewAt(var1);
            var2 = var1 - 1;
         }
      }

   }

   private void f(int var1) {
      if (this.ab != null) {
         this.ab.b(var1);
      }

      if (this.aa != null) {
         int var2 = this.aa.size();

         for(int var3 = 0; var3 < var2; ++var3) {
            dl var4 = (dl)this.aa.get(var3);
            if (var4 != null) {
               var4.b(var1);
            }
         }
      }

      if (this.ac != null) {
         this.ac.b(var1);
      }

   }

   private void g() {
      if (this.ah != 0) {
         if (this.ai == null) {
            this.ai = new ArrayList();
         } else {
            this.ai.clear();
         }

         int var1 = this.getChildCount();

         for(int var2 = 0; var2 < var1; ++var2) {
            View var3 = this.getChildAt(var2);
            this.ai.add(var3);
         }

         Collections.sort(this.ai, aj);
      }

   }

   private int getClientWidth() {
      return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
   }

   private boolean h() {
      this.K = -1;
      this.j();
      return this.R.c() | this.S.c();
   }

   private dh i() {
      int var1 = this.getClientWidth();
      float var2;
      if (var1 > 0) {
         var2 = (float)this.getScrollX() / (float)var1;
      } else {
         var2 = 0.0F;
      }

      float var3;
      if (var1 > 0) {
         var3 = (float)this.p / (float)var1;
      } else {
         var3 = 0.0F;
      }

      float var4 = 0.0F;
      float var5 = 0.0F;
      int var6 = -1;
      var1 = 0;
      boolean var7 = true;
      dh var8 = null;

      dh var9;
      while(true) {
         var9 = var8;
         if (var1 >= this.g.size()) {
            break;
         }

         dh var10 = (dh)this.g.get(var1);
         if (!var7 && var10.b != var6 + 1) {
            var10 = this.h;
            var10.e = var4 + var5 + var3;
            var10.b = var6 + 1;
            var10.d = this.b.a(var10.b);
            --var1;
         }

         var5 = var10.e;
         var4 = var10.d;
         if (!var7) {
            var9 = var8;
            if (var2 < var5) {
               break;
            }
         }

         if (var2 < var4 + var5 + var3 || var1 == this.g.size() - 1) {
            var9 = var10;
            break;
         }

         var6 = var10.b;
         var4 = var10.d;
         var7 = false;
         ++var1;
         var8 = var10;
      }

      return var9;
   }

   private void j() {
      this.B = false;
      this.C = false;
      if (this.L != null) {
         this.L.recycle();
         this.L = null;
      }

   }

   private void setScrollingCacheEnabled(boolean var1) {
      if (this.y != var1) {
         this.y = var1;
      }

   }

   float a(float var1) {
      return (float)Math.sin((double)((float)((double)(var1 - 0.5F) * 0.4712389167638204D)));
   }

   dh a(int var1, int var2) {
      dh var3 = new dh();
      var3.b = var1;
      var3.a = this.b.a((ViewGroup)this, var1);
      var3.d = this.b.a(var1);
      if (var2 >= 0 && var2 < this.g.size()) {
         this.g.add(var2, var3);
      } else {
         this.g.add(var3);
      }

      return var3;
   }

   dh a(View var1) {
      int var2 = 0;

      dh var4;
      while(true) {
         if (var2 >= this.g.size()) {
            var4 = null;
            break;
         }

         dh var3 = (dh)this.g.get(var2);
         if (this.b.a(var1, var3.a)) {
            var4 = var3;
            break;
         }

         ++var2;
      }

      return var4;
   }

   void a() {
      this.setWillNotDraw(false);
      this.setDescendantFocusability(262144);
      this.setFocusable(true);
      Context var1 = this.getContext();
      this.m = new Scroller(var1, f);
      ViewConfiguration var2 = ViewConfiguration.get(var1);
      float var3 = var1.getResources().getDisplayMetrics().density;
      this.F = var2.getScaledPagingTouchSlop();
      this.M = (int)(400.0F * var3);
      this.N = var2.getScaledMaximumFlingVelocity();
      this.R = new android.support.v4.widget.i(var1);
      this.S = new android.support.v4.widget.i(var1);
      this.O = (int)(25.0F * var3);
      this.P = (int)(2.0F * var3);
      this.D = (int)(16.0F * var3);
      bz.a(this, (d)(new dj(this)));
      if (bz.d(this) == 0) {
         bz.c(this, 1);
      }

      bz.a(this, (bq)(new df(this)));
   }

   void a(int var1) {
      dh var2;
      if (this.c != var1) {
         var2 = this.b(this.c);
         this.c = var1;
      } else {
         var2 = null;
      }

      if (this.b == null) {
         this.g();
      } else if (this.z) {
         this.g();
      } else if (this.getWindowToken() != null) {
         this.b.a((ViewGroup)this);
         var1 = this.A;
         int var3 = Math.max(0, this.c - var1);
         int var4 = this.b.a();
         int var5 = Math.min(var4 - 1, var1 + this.c);
         if (var4 != this.d) {
            String var23;
            try {
               var23 = this.getResources().getResourceName(this.getId());
            } catch (NotFoundException var17) {
               var23 = Integer.toHexString(this.getId());
            }

            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.d + ", found: " + var4 + " Pager id: " + var23 + " Pager class: " + this.getClass() + " Problematic adapter: " + this.b.getClass());
         }

         dh var6;
         label211: {
            for(var1 = 0; var1 < this.g.size(); ++var1) {
               var6 = (dh)this.g.get(var1);
               if (var6.b >= this.c) {
                  if (var6.b == this.c) {
                     break label211;
                  }
                  break;
               }
            }

            var6 = null;
         }

         dh var7;
         if (var6 == null && var4 > 0) {
            var7 = this.a(this.c, var1);
         } else {
            var7 = var6;
         }

         int var11;
         if (var7 != null) {
            int var8 = var1 - 1;
            if (var8 >= 0) {
               var6 = (dh)this.g.get(var8);
            } else {
               var6 = null;
            }

            int var9 = this.getClientWidth();
            float var10;
            if (var9 <= 0) {
               var10 = 0.0F;
            } else {
               var10 = 2.0F - var7.d + (float)this.getPaddingLeft() / (float)var9;
            }

            var11 = this.c;
            float var12 = 0.0F;
            int var13 = var11 - 1;
            int var14 = var1;

            float var16;
            for(dh var15 = var6; var13 >= 0; var14 = var11) {
               if (var12 >= var10 && var13 < var3) {
                  if (var15 == null) {
                     break;
                  }

                  var6 = var15;
                  var1 = var8;
                  var16 = var12;
                  var11 = var14;
                  if (var13 == var15.b) {
                     var6 = var15;
                     var1 = var8;
                     var16 = var12;
                     var11 = var14;
                     if (!var15.c) {
                        this.g.remove(var8);
                        this.b.a((ViewGroup)this, var13, var15.a);
                        var1 = var8 - 1;
                        var11 = var14 - 1;
                        if (var1 >= 0) {
                           var6 = (dh)this.g.get(var1);
                           var16 = var12;
                        } else {
                           var6 = null;
                           var16 = var12;
                        }
                     }
                  }
               } else if (var15 != null && var13 == var15.b) {
                  var16 = var12 + var15.d;
                  var1 = var8 - 1;
                  if (var1 >= 0) {
                     var6 = (dh)this.g.get(var1);
                     var11 = var14;
                  } else {
                     var6 = null;
                     var11 = var14;
                  }
               } else {
                  var16 = var12 + this.a(var13, var8 + 1).d;
                  var11 = var14 + 1;
                  if (var8 >= 0) {
                     var6 = (dh)this.g.get(var8);
                     var1 = var8;
                  } else {
                     var6 = null;
                     var1 = var8;
                  }
               }

               --var13;
               var15 = var6;
               var8 = var1;
               var12 = var16;
            }

            var16 = var7.d;
            var1 = var14 + 1;
            if (var16 < 2.0F) {
               if (var1 < this.g.size()) {
                  var6 = (dh)this.g.get(var1);
               } else {
                  var6 = null;
               }

               if (var9 <= 0) {
                  var10 = 0.0F;
               } else {
                  var10 = (float)this.getPaddingRight() / (float)var9 + 2.0F;
               }

               var11 = this.c;
               ++var11;

               for(; var11 < var4; ++var11) {
                  if (var16 >= var10 && var11 > var5) {
                     if (var6 == null) {
                        break;
                     }

                     if (var11 == var6.b && !var6.c) {
                        this.g.remove(var1);
                        this.b.a((ViewGroup)this, var11, var6.a);
                        if (var1 < this.g.size()) {
                           var6 = (dh)this.g.get(var1);
                        } else {
                           var6 = null;
                        }
                     }
                  } else if (var6 != null && var11 == var6.b) {
                     var12 = var6.d;
                     ++var1;
                     if (var1 < this.g.size()) {
                        var6 = (dh)this.g.get(var1);
                     } else {
                        var6 = null;
                     }

                     var16 += var12;
                  } else {
                     var6 = this.a(var11, var1);
                     ++var1;
                     var12 = var6.d;
                     if (var1 < this.g.size()) {
                        var6 = (dh)this.g.get(var1);
                     } else {
                        var6 = null;
                     }

                     var16 += var12;
                  }
               }
            }

            this.a(var7, var14, var2);
         }

         br var18 = this.b;
         var1 = this.c;
         Object var20;
         if (var7 != null) {
            var20 = var7.a;
         } else {
            var20 = null;
         }

         var18.b((ViewGroup)this, var1, var20);
         this.b.b((ViewGroup)this);
         var11 = this.getChildCount();

         for(var1 = 0; var1 < var11; ++var1) {
            View var19 = this.getChildAt(var1);
            di var21 = (di)var19.getLayoutParams();
            var21.f = var1;
            if (!var21.a && var21.c == 0.0F) {
               var2 = this.a(var19);
               if (var2 != null) {
                  var21.c = var2.d;
                  var21.e = var2.b;
               }
            }
         }

         this.g();
         if (this.hasFocus()) {
            View var22 = this.findFocus();
            if (var22 != null) {
               var6 = this.b(var22);
            } else {
               var6 = null;
            }

            if (var6 == null || var6.b != this.c) {
               for(var1 = 0; var1 < this.getChildCount(); ++var1) {
                  var22 = this.getChildAt(var1);
                  var2 = this.a(var22);
                  if (var2 != null && var2.b == this.c && var22.requestFocus(2)) {
                     break;
                  }
               }
            }
         }
      }

   }

   protected void a(int var1, float var2, int var3) {
      int var5;
      View var10;
      if (this.W > 0) {
         int var4 = this.getScrollX();
         var5 = this.getPaddingLeft();
         int var6 = this.getPaddingRight();
         int var7 = this.getWidth();
         int var8 = this.getChildCount();

         int var13;
         for(int var9 = 0; var9 < var8; var6 = var13) {
            var10 = this.getChildAt(var9);
            di var11 = (di)var10.getLayoutParams();
            int var12;
            if (!var11.a) {
               var12 = var5;
               var13 = var6;
            } else {
               int var14;
               switch(var11.b & 7) {
               case 1:
                  var12 = Math.max((var7 - var10.getMeasuredWidth()) / 2, var5);
                  var13 = var5;
                  var5 = var6;
                  var6 = var13;
                  break;
               case 2:
               case 4:
               default:
                  var12 = var5;
                  var13 = var5;
                  var5 = var6;
                  var6 = var13;
                  break;
               case 3:
                  var12 = var10.getWidth();
                  var13 = var12 + var5;
                  var12 = var5;
                  var5 = var6;
                  var6 = var13;
                  break;
               case 5:
                  var12 = var7 - var6 - var10.getMeasuredWidth();
                  var14 = var10.getMeasuredWidth();
                  var13 = var5;
                  var5 = var6 + var14;
                  var6 = var13;
               }

               var14 = var12 + var4 - var10.getLeft();
               var13 = var5;
               var12 = var6;
               if (var14 != 0) {
                  var10.offsetLeftAndRight(var14);
                  var13 = var5;
                  var12 = var6;
               }
            }

            ++var9;
            var5 = var12;
         }
      }

      this.b(var1, var2, var3);
      if (this.ae != null) {
         var3 = this.getScrollX();
         var5 = this.getChildCount();

         for(var1 = 0; var1 < var5; ++var1) {
            var10 = this.getChildAt(var1);
            if (!((di)var10.getLayoutParams()).a) {
               var2 = (float)(var10.getLeft() - var3) / (float)this.getClientWidth();
               this.ae.a(var10, var2);
            }
         }
      }

      this.V = true;
   }

   void a(int var1, int var2, int var3) {
      if (this.getChildCount() == 0) {
         this.setScrollingCacheEnabled(false);
      } else {
         boolean var4;
         if (this.m != null && !this.m.isFinished()) {
            var4 = true;
         } else {
            var4 = false;
         }

         int var11;
         if (var4) {
            if (this.n) {
               var11 = this.m.getCurrX();
            } else {
               var11 = this.m.getStartX();
            }

            this.m.abortAnimation();
            this.setScrollingCacheEnabled(false);
         } else {
            var11 = this.getScrollX();
         }

         int var5 = this.getScrollY();
         int var6 = var1 - var11;
         var2 -= var5;
         if (var6 == 0 && var2 == 0) {
            this.a(false);
            this.c();
            this.setScrollState(0);
         } else {
            this.setScrollingCacheEnabled(true);
            this.setScrollState(2);
            var1 = this.getClientWidth();
            int var7 = var1 / 2;
            float var8 = Math.min(1.0F, (float)Math.abs(var6) * 1.0F / (float)var1);
            float var9 = (float)var7;
            float var10 = (float)var7;
            var8 = this.a(var8);
            var3 = Math.abs(var3);
            if (var3 > 0) {
               var1 = Math.round(1000.0F * Math.abs((var10 * var8 + var9) / (float)var3)) * 4;
            } else {
               var10 = (float)var1;
               var9 = this.b.a(this.c);
               var1 = (int)(((float)Math.abs(var6) / (var10 * var9 + (float)this.p) + 1.0F) * 100.0F);
            }

            var1 = Math.min(var1, 600);
            this.n = false;
            this.m.startScroll(var11, var5, var6, var2, var1);
            bz.c(this);
         }
      }

   }

   public void a(int var1, boolean var2) {
      this.z = false;
      this.a(var1, var2, false);
   }

   void a(int var1, boolean var2, boolean var3) {
      this.a(var1, var2, var3, 0);
   }

   void a(int var1, boolean var2, boolean var3, int var4) {
      boolean var5 = false;
      if (this.b != null && this.b.a() > 0) {
         if (!var3 && this.c == var1 && this.g.size() != 0) {
            this.setScrollingCacheEnabled(false);
         } else {
            int var6;
            if (var1 < 0) {
               var6 = 0;
            } else {
               var6 = var1;
               if (var1 >= this.b.a()) {
                  var6 = this.b.a() - 1;
               }
            }

            var1 = this.A;
            if (var6 > this.c + var1 || var6 < this.c - var1) {
               for(var1 = 0; var1 < this.g.size(); ++var1) {
                  ((dh)this.g.get(var1)).c = true;
               }
            }

            var3 = var5;
            if (this.c != var6) {
               var3 = true;
            }

            if (this.T) {
               this.c = var6;
               if (var3) {
                  this.e(var6);
               }

               this.requestLayout();
            } else {
               this.a(var6);
               this.a(var6, var2, var4, var3);
            }
         }
      } else {
         this.setScrollingCacheEnabled(false);
      }

   }

   public void a(dl var1) {
      if (this.aa == null) {
         this.aa = new ArrayList();
      }

      this.aa.add(var1);
   }

   public boolean a(KeyEvent var1) {
      boolean var2 = false;
      boolean var3 = var2;
      if (var1.getAction() == 0) {
         switch(var1.getKeyCode()) {
         case 21:
            var3 = this.c(17);
            break;
         case 22:
            var3 = this.c(66);
            break;
         case 61:
            var3 = var2;
            if (VERSION.SDK_INT >= 11) {
               if (android.support.v4.view.ad.a(var1)) {
                  var3 = this.c(2);
               } else {
                  var3 = var2;
                  if (android.support.v4.view.ad.a(var1, 1)) {
                     var3 = this.c(1);
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

   protected boolean a(View var1, boolean var2, int var3, int var4, int var5) {
      boolean var6 = true;
      if (var1 instanceof ViewGroup) {
         ViewGroup var7 = (ViewGroup)var1;
         int var8 = var1.getScrollX();
         int var9 = var1.getScrollY();

         for(int var10 = var7.getChildCount() - 1; var10 >= 0; --var10) {
            View var11 = var7.getChildAt(var10);
            if (var4 + var8 >= var11.getLeft() && var4 + var8 < var11.getRight() && var5 + var9 >= var11.getTop() && var5 + var9 < var11.getBottom() && this.a(var11, true, var3, var4 + var8 - var11.getLeft(), var5 + var9 - var11.getTop())) {
               var2 = var6;
               return var2;
            }
         }
      }

      if (var2) {
         var2 = var6;
         if (bz.a(var1, -var3)) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public void addFocusables(ArrayList var1, int var2, int var3) {
      int var4 = var1.size();
      int var5 = this.getDescendantFocusability();
      if (var5 != 393216) {
         for(int var6 = 0; var6 < this.getChildCount(); ++var6) {
            View var7 = this.getChildAt(var6);
            if (var7.getVisibility() == 0) {
               dh var8 = this.a(var7);
               if (var8 != null && var8.b == this.c) {
                  var7.addFocusables(var1, var2, var3);
               }
            }
         }
      }

      if ((var5 != 262144 || var4 == var1.size()) && this.isFocusable() && ((var3 & 1) != 1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) && var1 != null) {
         var1.add(this);
      }

   }

   public void addTouchables(ArrayList var1) {
      for(int var2 = 0; var2 < this.getChildCount(); ++var2) {
         View var3 = this.getChildAt(var2);
         if (var3.getVisibility() == 0) {
            dh var4 = this.a(var3);
            if (var4 != null && var4.b == this.c) {
               var3.addTouchables(var1);
            }
         }
      }

   }

   public void addView(View var1, int var2, LayoutParams var3) {
      if (!this.checkLayoutParams(var3)) {
         var3 = this.generateLayoutParams(var3);
      }

      di var4 = (di)var3;
      var4.a |= c(var1);
      if (this.x) {
         if (var4 != null && var4.a) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
         }

         var4.d = true;
         this.addViewInLayout(var1, var2, var3);
      } else {
         super.addView(var1, var2, var3);
      }

   }

   dh b(int var1) {
      int var2 = 0;

      dh var3;
      while(true) {
         if (var2 >= this.g.size()) {
            var3 = null;
            break;
         }

         var3 = (dh)this.g.get(var2);
         if (var3.b == var1) {
            break;
         }

         ++var2;
      }

      return var3;
   }

   dh b(View var1) {
      while(true) {
         ViewParent var2 = var1.getParent();
         dh var3;
         if (var2 != this) {
            if (var2 != null && var2 instanceof View) {
               var1 = (View)var2;
               continue;
            }

            var3 = null;
         } else {
            var3 = this.a(var1);
         }

         return var3;
      }
   }

   void b() {
      int var1 = this.b.a();
      this.d = var1;
      boolean var2;
      if (this.g.size() < this.A * 2 + 1 && this.g.size() < var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      int var3 = this.c;
      boolean var4 = false;
      byte var5 = 0;
      boolean var6 = var2;
      int var9 = var3;
      boolean var10 = var4;

      int var11;
      for(var11 = var5; var11 < this.g.size(); var6 = var4) {
         dh var7 = (dh)this.g.get(var11);
         int var12 = this.b.a(var7.a);
         int var14;
         if (var12 == -1) {
            var4 = var6;
            var3 = var9;
            var2 = var10;
            var14 = var11;
         } else {
            boolean var13;
            if (var12 == -2) {
               this.g.remove(var11);
               var14 = var11 - 1;
               var4 = var10;
               if (!var10) {
                  this.b.a((ViewGroup)this);
                  var4 = true;
               }

               this.b.a((ViewGroup)this, var7.b, var7.a);
               if (this.c == var7.b) {
                  var3 = Math.max(0, Math.min(this.c, var1 - 1));
                  var2 = var4;
                  var4 = true;
               } else {
                  var3 = var9;
                  var13 = true;
                  var2 = var4;
                  var4 = var13;
               }
            } else if (var7.b != var12) {
               if (var7.b == this.c) {
                  var9 = var12;
               }

               var7.b = var12;
               var14 = var11;
               var3 = var9;
               var13 = true;
               var2 = var10;
               var4 = var13;
            } else {
               var14 = var11;
               var2 = var10;
               var3 = var9;
               var4 = var6;
            }
         }

         var11 = var14 + 1;
         var10 = var2;
         var9 = var3;
      }

      if (var10) {
         this.b.b((ViewGroup)this);
      }

      Collections.sort(this.g, e);
      if (var6) {
         var11 = this.getChildCount();

         for(var3 = 0; var3 < var11; ++var3) {
            di var15 = (di)this.getChildAt(var3).getLayoutParams();
            if (!var15.a) {
               var15.c = 0.0F;
            }
         }

         this.a(var9, false, true);
         this.requestLayout();
      }

   }

   void c() {
      this.a(this.c);
   }

   public boolean c(int var1) {
      View var2 = this.findFocus();
      View var3;
      if (var2 == this) {
         var3 = null;
      } else {
         label86: {
            if (var2 != null) {
               ViewParent var8 = var2.getParent();

               boolean var4;
               while(true) {
                  if (!(var8 instanceof ViewGroup)) {
                     var4 = false;
                     break;
                  }

                  if (var8 == this) {
                     var4 = true;
                     break;
                  }

                  var8 = var8.getParent();
               }

               if (!var4) {
                  StringBuilder var7 = new StringBuilder();
                  var7.append(var2.getClass().getSimpleName());

                  for(var8 = var2.getParent(); var8 instanceof ViewGroup; var8 = var8.getParent()) {
                     var7.append(" => ").append(var8.getClass().getSimpleName());
                  }

                  Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + var7.toString());
                  var3 = null;
                  break label86;
               }
            }

            var3 = var2;
         }
      }

      boolean var6;
      label95: {
         var2 = FocusFinder.getInstance().findNextFocus(this, var3, var1);
         if (var2 != null && var2 != var3) {
            int var5;
            int var9;
            if (var1 == 17) {
               var9 = this.a(this.i, var2).left;
               var5 = this.a(this.i, var3).left;
               if (var3 != null && var9 >= var5) {
                  var6 = this.d();
               } else {
                  var6 = var2.requestFocus();
               }
               break label95;
            }

            if (var1 == 66) {
               var9 = this.a(this.i, var2).left;
               var5 = this.a(this.i, var3).left;
               if (var3 != null && var9 <= var5) {
                  var6 = this.e();
               } else {
                  var6 = var2.requestFocus();
               }
               break label95;
            }
         } else {
            if (var1 == 17 || var1 == 1) {
               var6 = this.d();
               break label95;
            }

            if (var1 == 66 || var1 == 2) {
               var6 = this.e();
               break label95;
            }
         }

         var6 = false;
      }

      if (var6) {
         this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(var1));
      }

      return var6;
   }

   public boolean canScrollHorizontally(int var1) {
      boolean var2 = true;
      boolean var3 = true;
      boolean var4 = false;
      if (this.b == null) {
         var3 = var4;
      } else {
         int var5 = this.getClientWidth();
         int var6 = this.getScrollX();
         if (var1 < 0) {
            if (var6 <= (int)((float)var5 * this.t)) {
               var3 = false;
            }
         } else {
            var3 = var4;
            if (var1 > 0) {
               if (var6 < (int)((float)var5 * this.u)) {
                  var3 = var2;
               } else {
                  var3 = false;
               }
            }
         }
      }

      return var3;
   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      boolean var2;
      if (var1 instanceof di && super.checkLayoutParams(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void computeScroll() {
      this.n = true;
      if (!this.m.isFinished() && this.m.computeScrollOffset()) {
         int var1 = this.getScrollX();
         int var2 = this.getScrollY();
         int var3 = this.m.getCurrX();
         int var4 = this.m.getCurrY();
         if (var1 != var3 || var2 != var4) {
            this.scrollTo(var3, var4);
            if (!this.d(var3)) {
               this.m.abortAnimation();
               this.scrollTo(0, var4);
            }
         }

         bz.c(this);
      } else {
         this.a(true);
      }

   }

   boolean d() {
      boolean var1 = true;
      if (this.c > 0) {
         this.a(this.c - 1, true);
      } else {
         var1 = false;
      }

      return var1;
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

   public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
      boolean var2 = false;
      boolean var3;
      if (var1.getEventType() == 4096) {
         var3 = super.dispatchPopulateAccessibilityEvent(var1);
      } else {
         int var4 = this.getChildCount();
         int var5 = 0;

         while(true) {
            var3 = var2;
            if (var5 >= var4) {
               break;
            }

            View var6 = this.getChildAt(var5);
            if (var6.getVisibility() == 0) {
               dh var7 = this.a(var6);
               if (var7 != null && var7.b == this.c && var6.dispatchPopulateAccessibilityEvent(var1)) {
                  var3 = true;
                  break;
               }
            }

            ++var5;
         }
      }

      return var3;
   }

   public void draw(Canvas var1) {
      super.draw(var1);
      boolean var2 = false;
      boolean var3 = false;
      int var4 = this.getOverScrollMode();
      if (var4 != 0 && (var4 != 1 || this.b == null || this.b.a() <= 1)) {
         this.R.b();
         this.S.b();
      } else {
         int var8;
         if (!this.R.a()) {
            var8 = var1.save();
            int var9 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
            var4 = this.getWidth();
            var1.rotate(270.0F);
            var1.translate((float)(-var9 + this.getPaddingTop()), this.t * (float)var4);
            this.R.a(var9, var4);
            var3 = false | this.R.a(var1);
            var1.restoreToCount(var8);
         }

         var2 = var3;
         if (!this.S.a()) {
            var4 = var1.save();
            var8 = this.getWidth();
            int var5 = this.getHeight();
            int var6 = this.getPaddingTop();
            int var7 = this.getPaddingBottom();
            var1.rotate(90.0F);
            var1.translate((float)(-this.getPaddingTop()), -(this.u + 1.0F) * (float)var8);
            this.S.a(var5 - var6 - var7, var8);
            var2 = var3 | this.S.a(var1);
            var1.restoreToCount(var4);
         }
      }

      if (var2) {
         bz.c(this);
      }

   }

   protected void drawableStateChanged() {
      super.drawableStateChanged();
      Drawable var1 = this.q;
      if (var1 != null && var1.isStateful()) {
         var1.setState(this.getDrawableState());
      }

   }

   boolean e() {
      boolean var1 = true;
      if (this.b != null && this.c < this.b.a() - 1) {
         this.a(this.c + 1, true);
      } else {
         var1 = false;
      }

      return var1;
   }

   protected LayoutParams generateDefaultLayoutParams() {
      return new di();
   }

   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return new di(this.getContext(), var1);
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return this.generateDefaultLayoutParams();
   }

   public br getAdapter() {
      return this.b;
   }

   protected int getChildDrawingOrder(int var1, int var2) {
      int var3 = var2;
      if (this.ah == 2) {
         var3 = var1 - 1 - var2;
      }

      return ((di)((View)this.ai.get(var3)).getLayoutParams()).f;
   }

   public int getCurrentItem() {
      return this.c;
   }

   public int getOffscreenPageLimit() {
      return this.A;
   }

   public int getPageMargin() {
      return this.p;
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.T = true;
   }

   protected void onDetachedFromWindow() {
      this.removeCallbacks(this.ak);
      if (this.m != null && !this.m.isFinished()) {
         this.m.abortAnimation();
      }

      super.onDetachedFromWindow();
   }

   protected void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.p > 0 && this.q != null && this.g.size() > 0 && this.b != null) {
         int var2 = this.getScrollX();
         int var3 = this.getWidth();
         float var4 = (float)this.p / (float)var3;
         dh var5 = (dh)this.g.get(0);
         float var6 = var5.e;
         int var7 = this.g.size();
         int var8 = var5.b;
         int var9 = ((dh)this.g.get(var7 - 1)).b;

         for(int var10 = 0; var8 < var9; ++var8) {
            while(var8 > var5.b && var10 < var7) {
               ArrayList var13 = this.g;
               ++var10;
               var5 = (dh)var13.get(var10);
            }

            float var11;
            if (var8 == var5.b) {
               var11 = (var5.e + var5.d) * (float)var3;
               var6 = var5.e + var5.d + var4;
            } else {
               float var12 = this.b.a(var8);
               var11 = (var6 + var12) * (float)var3;
               var6 += var12 + var4;
            }

            if ((float)this.p + var11 > (float)var2) {
               this.q.setBounds(Math.round(var11), this.r, Math.round((float)this.p + var11), this.s);
               this.q.draw(var1);
            }

            if (var11 > (float)(var2 + var3)) {
               break;
            }
         }
      }

   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2 = false;
      int var3 = var1.getAction() & 255;
      boolean var4;
      if (var3 != 3 && var3 != 1) {
         if (var3 != 0) {
            if (this.B) {
               var4 = true;
               return var4;
            }

            var4 = var2;
            if (this.C) {
               return var4;
            }
         }

         float var6;
         switch(var3) {
         case 0:
            var6 = var1.getX();
            this.I = var6;
            this.G = var6;
            var6 = var1.getY();
            this.J = var6;
            this.H = var6;
            this.K = var1.getPointerId(0);
            this.C = false;
            this.n = true;
            this.m.computeScrollOffset();
            if (this.al == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.P) {
               this.m.abortAnimation();
               this.z = false;
               this.c();
               this.B = true;
               this.c(true);
               this.setScrollState(1);
            } else {
               this.a(false);
               this.B = false;
            }
            break;
         case 2:
            var3 = this.K;
            if (var3 != -1) {
               var3 = var1.findPointerIndex(var3);
               float var5 = var1.getX(var3);
               var6 = var5 - this.G;
               float var7 = Math.abs(var6);
               float var8 = var1.getY(var3);
               float var9 = Math.abs(var8 - this.J);
               if (var6 != 0.0F && !this.a(this.G, var6) && this.a(this, false, (int)var6, (int)var5, (int)var8)) {
                  this.G = var5;
                  this.H = var8;
                  this.C = true;
                  var4 = var2;
                  return var4;
               }

               if (var7 > (float)this.F && 0.5F * var7 > var9) {
                  this.B = true;
                  this.c(true);
                  this.setScrollState(1);
                  if (var6 > 0.0F) {
                     var6 = this.I + (float)this.F;
                  } else {
                     var6 = this.I - (float)this.F;
                  }

                  this.G = var6;
                  this.H = var8;
                  this.setScrollingCacheEnabled(true);
               } else if (var9 > (float)this.F) {
                  this.C = true;
               }

               if (this.B && this.b(var5)) {
                  bz.c(this);
               }
            }
            break;
         case 6:
            this.a(var1);
         }

         if (this.L == null) {
            this.L = VelocityTracker.obtain();
         }

         this.L.addMovement(var1);
         var4 = this.B;
      } else {
         this.h();
         var4 = var2;
      }

      return var4;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      int var6 = this.getChildCount();
      int var7 = var4 - var2;
      int var8 = var5 - var3;
      var3 = this.getPaddingLeft();
      var2 = this.getPaddingTop();
      int var9 = this.getPaddingRight();
      var4 = this.getPaddingBottom();
      int var10 = this.getScrollX();
      int var11 = 0;

      View var13;
      int var16;
      for(int var12 = 0; var12 < var6; var3 = var16) {
         label53: {
            var13 = this.getChildAt(var12);
            if (var13.getVisibility() != 8) {
               di var14 = (di)var13.getLayoutParams();
               if (var14.a) {
                  var5 = var14.b;
                  int var15 = var14.b;
                  switch(var5 & 7) {
                  case 1:
                     var5 = Math.max((var7 - var13.getMeasuredWidth()) / 2, var3);
                     var16 = var3;
                     break;
                  case 2:
                  case 4:
                  default:
                     var5 = var3;
                     var16 = var3;
                     break;
                  case 3:
                     var16 = var13.getMeasuredWidth();
                     var5 = var3;
                     var16 += var3;
                     break;
                  case 5:
                     var5 = var13.getMeasuredWidth();
                     var16 = var9 + var13.getMeasuredWidth();
                     var5 = var7 - var9 - var5;
                     var9 = var16;
                     var16 = var3;
                  }

                  switch(var15 & 112) {
                  case 16:
                     var15 = Math.max((var8 - var13.getMeasuredHeight()) / 2, var2);
                     var3 = var2;
                     var2 = var4;
                     var4 = var15;
                     break;
                  case 48:
                     var15 = var13.getMeasuredHeight();
                     var3 = var4;
                     var15 += var2;
                     var4 = var2;
                     var2 = var3;
                     var3 = var15;
                     break;
                  case 80:
                     var15 = var8 - var4 - var13.getMeasuredHeight();
                     int var17 = var13.getMeasuredHeight();
                     var3 = var2;
                     var2 = var4 + var17;
                     var4 = var15;
                     break;
                  default:
                     var15 = var2;
                     var3 = var2;
                     var2 = var4;
                     var4 = var15;
                  }

                  var5 += var10;
                  var13.layout(var5, var4, var13.getMeasuredWidth() + var5, var13.getMeasuredHeight() + var4);
                  ++var11;
                  var5 = var9;
                  var4 = var16;
                  var9 = var2;
                  var2 = var11;
                  break label53;
               }
            }

            var5 = var11;
            var11 = var2;
            var16 = var3;
            var2 = var5;
            var5 = var9;
            var9 = var4;
            var3 = var11;
            var4 = var16;
         }

         ++var12;
         var16 = var4;
         var11 = var2;
         var2 = var3;
         var4 = var9;
         var9 = var5;
      }

      var9 = var7 - var3 - var9;

      for(var5 = 0; var5 < var6; ++var5) {
         var13 = this.getChildAt(var5);
         if (var13.getVisibility() != 8) {
            di var18 = (di)var13.getLayoutParams();
            if (!var18.a) {
               dh var20 = this.a(var13);
               if (var20 != null) {
                  float var19 = (float)var9;
                  var16 = (int)(var20.e * var19) + var3;
                  if (var18.d) {
                     var18.d = false;
                     var19 = (float)var9;
                     var13.measure(MeasureSpec.makeMeasureSpec((int)(var18.c * var19), 1073741824), MeasureSpec.makeMeasureSpec(var8 - var2 - var4, 1073741824));
                  }

                  var13.layout(var16, var2, var13.getMeasuredWidth() + var16, var13.getMeasuredHeight() + var2);
               }
            }
         }
      }

      this.r = var2;
      this.s = var8 - var4;
      this.W = var11;
      if (this.T) {
         this.a(this.c, false, 0, false);
      }

      this.T = false;
   }

   protected void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(getDefaultSize(0, var1), getDefaultSize(0, var2));
      var1 = this.getMeasuredWidth();
      this.E = Math.min(var1 / 10, this.D);
      var1 = var1 - this.getPaddingLeft() - this.getPaddingRight();
      var2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
      int var3 = this.getChildCount();

      View var5;
      int var6;
      int var7;
      di var8;
      for(int var4 = 0; var4 < var3; var2 = var7) {
         var5 = this.getChildAt(var4);
         var6 = var1;
         var7 = var2;
         if (var5.getVisibility() != 8) {
            var8 = (di)var5.getLayoutParams();
            var6 = var1;
            var7 = var2;
            if (var8 != null) {
               var6 = var1;
               var7 = var2;
               if (var8.a) {
                  var6 = var8.b & 7;
                  int var9 = var8.b & 112;
                  int var10 = Integer.MIN_VALUE;
                  var7 = Integer.MIN_VALUE;
                  boolean var15;
                  if (var9 != 48 && var9 != 80) {
                     var15 = false;
                  } else {
                     var15 = true;
                  }

                  boolean var11;
                  if (var6 != 3 && var6 != 5) {
                     var11 = false;
                  } else {
                     var11 = true;
                  }

                  if (var15) {
                     var6 = 1073741824;
                  } else {
                     var6 = var10;
                     if (var11) {
                        var7 = 1073741824;
                        var6 = var10;
                     }
                  }

                  if (var8.width != -2) {
                     var10 = 1073741824;
                     if (var8.width != -1) {
                        var6 = var8.width;
                     } else {
                        var6 = var1;
                     }
                  } else {
                     var10 = var6;
                     var6 = var1;
                  }

                  int var12;
                  label72: {
                     if (var8.height != -2) {
                        var12 = 1073741824;
                        var7 = var12;
                        if (var8.height != -1) {
                           int var13 = var8.height;
                           var7 = var12;
                           var12 = var13;
                           break label72;
                        }
                     }

                     var12 = var2;
                  }

                  var5.measure(MeasureSpec.makeMeasureSpec(var6, var10), MeasureSpec.makeMeasureSpec(var12, var7));
                  if (var15) {
                     var7 = var2 - var5.getMeasuredHeight();
                     var6 = var1;
                  } else {
                     var6 = var1;
                     var7 = var2;
                     if (var11) {
                        var6 = var1 - var5.getMeasuredWidth();
                        var7 = var2;
                     }
                  }
               }
            }
         }

         ++var4;
         var1 = var6;
      }

      this.v = MeasureSpec.makeMeasureSpec(var1, 1073741824);
      this.w = MeasureSpec.makeMeasureSpec(var2, 1073741824);
      this.x = true;
      this.c();
      this.x = false;
      var6 = this.getChildCount();

      for(var2 = 0; var2 < var6; ++var2) {
         var5 = this.getChildAt(var2);
         if (var5.getVisibility() != 8) {
            var8 = (di)var5.getLayoutParams();
            if (var8 == null || !var8.a) {
               float var14 = (float)var1;
               var5.measure(MeasureSpec.makeMeasureSpec((int)(var8.c * var14), 1073741824), this.w);
            }
         }
      }

   }

   protected boolean onRequestFocusInDescendants(int var1, Rect var2) {
      boolean var3 = true;
      byte var4 = -1;
      int var5 = this.getChildCount();
      int var6;
      if ((var1 & 2) != 0) {
         var4 = 1;
         var6 = 0;
      } else {
         var6 = var5 - 1;
         var5 = -1;
      }

      while(true) {
         if (var6 == var5) {
            var3 = false;
            break;
         }

         View var7 = this.getChildAt(var6);
         if (var7.getVisibility() == 0) {
            dh var8 = this.a(var7);
            if (var8 != null && var8.b == this.c && var7.requestFocus(var1, var2)) {
               break;
            }
         }

         var6 += var4;
      }

      return var3;
   }

   public void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof doClass)) {
         super.onRestoreInstanceState(var1);
      } else {
         doClass var2 = (doClass)var1;
         super.onRestoreInstanceState(var2.a());
         if (this.b != null) {
            this.b.a(var2.c, var2.d);
            this.a(var2.b, false, true);
         } else {
            this.j = var2.b;
            this.k = var2.c;
            this.l = var2.d;
         }
      }

   }

   public Parcelable onSaveInstanceState() {
      doClass var1 = new doClass(super.onSaveInstanceState());
      var1.b = this.c;
      if (this.b != null) {
         var1.c = this.b.b();
      }

      return var1;
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if (var1 != var3) {
         this.a(var1, var3, this.p, this.p);
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2 = false;
      boolean var3;
      if (this.Q) {
         var3 = true;
      } else if (var1.getAction() == 0 && var1.getEdgeFlags() != 0) {
         var3 = false;
      } else if (this.b != null && this.b.a() != 0) {
         if (this.L == null) {
            this.L = VelocityTracker.obtain();
         }

         this.L.addMovement(var1);
         var3 = var2;
         float var4;
         int var5;
         switch(var1.getAction() & 255) {
         case 0:
            this.m.abortAnimation();
            this.z = false;
            this.c();
            var4 = var1.getX();
            this.I = var4;
            this.G = var4;
            var4 = var1.getY();
            this.J = var4;
            this.H = var4;
            this.K = var1.getPointerId(0);
            var3 = var2;
            break;
         case 1:
            var3 = var2;
            if (this.B) {
               VelocityTracker var12 = this.L;
               var12.computeCurrentVelocity(1000, (float)this.N);
               int var10 = (int)bu.a(var12, this.K);
               this.z = true;
               int var11 = this.getClientWidth();
               var5 = this.getScrollX();
               dh var13 = this.i();
               var4 = (float)this.p / (float)var11;
               this.a(this.a(var13.b, ((float)var5 / (float)var11 - var13.e) / (var13.d + var4), var10, (int)(var1.getX(var1.findPointerIndex(this.K)) - this.I)), true, true, var10);
               var3 = this.h();
            }
            break;
         case 2:
            if (!this.B) {
               var5 = var1.findPointerIndex(this.K);
               if (var5 == -1) {
                  var3 = this.h();
                  break;
               }

               float var6 = var1.getX(var5);
               var4 = Math.abs(var6 - this.G);
               float var7 = var1.getY(var5);
               float var8 = Math.abs(var7 - this.H);
               if (var4 > (float)this.F && var4 > var8) {
                  this.B = true;
                  this.c(true);
                  if (var6 - this.I > 0.0F) {
                     var4 = this.I + (float)this.F;
                  } else {
                     var4 = this.I - (float)this.F;
                  }

                  this.G = var4;
                  this.H = var7;
                  this.setScrollState(1);
                  this.setScrollingCacheEnabled(true);
                  ViewParent var9 = this.getParent();
                  if (var9 != null) {
                     var9.requestDisallowInterceptTouchEvent(true);
                  }
               }
            }

            var3 = var2;
            if (this.B) {
               var3 = false | this.b(var1.getX(var1.findPointerIndex(this.K)));
            }
            break;
         case 3:
            var3 = var2;
            if (this.B) {
               this.a(this.c, true, 0, false);
               var3 = this.h();
            }
         case 4:
            break;
         case 5:
            var5 = bg.b(var1);
            this.G = var1.getX(var5);
            this.K = var1.getPointerId(var5);
            var3 = var2;
            break;
         case 6:
            this.a(var1);
            this.G = var1.getX(var1.findPointerIndex(this.K));
            var3 = var2;
            break;
         default:
            var3 = var2;
         }

         if (var3) {
            bz.c(this);
         }

         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public void removeView(View var1) {
      if (this.x) {
         this.removeViewInLayout(var1);
      } else {
         super.removeView(var1);
      }

   }

   public void setAdapter(br var1) {
      byte var2 = 0;
      int var3;
      if (this.b != null) {
         this.b.a((DataSetObserver)null);
         this.b.a((ViewGroup)this);

         for(var3 = 0; var3 < this.g.size(); ++var3) {
            dh var4 = (dh)this.g.get(var3);
            this.b.a((ViewGroup)this, var4.b, var4.a);
         }

         this.b.b((ViewGroup)this);
         this.g.clear();
         this.f();
         this.c = 0;
         this.scrollTo(0, 0);
      }

      br var7 = this.b;
      this.b = var1;
      this.d = 0;
      if (this.b != null) {
         if (this.o == null) {
            this.o = new dn(this);
         }

         this.b.a((DataSetObserver)this.o);
         this.z = false;
         boolean var5 = this.T;
         this.T = true;
         this.d = this.b.a();
         if (this.j >= 0) {
            this.b.a(this.k, this.l);
            this.a(this.j, false, true);
            this.j = -1;
            this.k = null;
            this.l = null;
         } else if (!var5) {
            this.c();
         } else {
            this.requestLayout();
         }
      }

      if (this.ad != null && !this.ad.isEmpty()) {
         int var6 = this.ad.size();

         for(var3 = var2; var3 < var6; ++var3) {
            ((dk)this.ad.get(var3)).a(this, var7, var1);
         }
      }

   }

   void setChildrenDrawingOrderEnabledCompat(boolean var1) {
      if (VERSION.SDK_INT >= 7) {
         if (this.ag == null) {
            try {
               this.ag = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException var4) {
               Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", var4);
            }
         }

         try {
            this.ag.invoke(this, var1);
         } catch (Exception var3) {
            Log.e("ViewPager", "Error changing children drawing order", var3);
         }
      }

   }

   public void setCurrentItem(int var1) {
      this.z = false;
      boolean var2;
      if (!this.T) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.a(var1, var2, false);
   }

   public void setOffscreenPageLimit(int var1) {
      int var2 = var1;
      if (var1 < 1) {
         Log.w("ViewPager", "Requested offscreen page limit " + var1 + " too small; defaulting to " + 1);
         var2 = 1;
      }

      if (var2 != this.A) {
         this.A = var2;
         this.c();
      }

   }

   @Deprecated
   public void setOnPageChangeListener(dl var1) {
      this.ab = var1;
   }

   public void setPageMargin(int var1) {
      int var2 = this.p;
      this.p = var1;
      int var3 = this.getWidth();
      this.a(var3, var3, var1, var2);
      this.requestLayout();
   }

   public void setPageMarginDrawable(int var1) {
      this.setPageMarginDrawable(android.support.v4.c.a.a(this.getContext(), var1));
   }

   public void setPageMarginDrawable(Drawable var1) {
      this.q = var1;
      if (var1 != null) {
         this.refreshDrawableState();
      }

      boolean var2;
      if (var1 == null) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.setWillNotDraw(var2);
      this.invalidate();
   }

   void setScrollState(int var1) {
      if (this.al != var1) {
         this.al = var1;
         if (this.ae != null) {
            boolean var2;
            if (var1 != 0) {
               var2 = true;
            } else {
               var2 = false;
            }

            this.b(var2);
         }

         this.f(var1);
      }

   }

   protected boolean verifyDrawable(Drawable var1) {
      boolean var2;
      if (!super.verifyDrawable(var1) && var1 != this.q) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }
}
