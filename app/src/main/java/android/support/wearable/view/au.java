package android.support.wearable.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.Animator.AnimatorListener;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.dl;
import android.support.v7.widget.ds;
import android.support.v7.widget.es;
import android.support.v7.widget.ey;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
@TargetApi(20)
public class au extends dl {
   private final int H;
   private final int I;
   private boolean J;
   private boolean K;
   private boolean L;
   private int M;
   private int N;
   private ba O;
   private Animator P;
   private int Q;
   private final bh R;
   private final List S;
   private final List T;
   private bf U;
   private boolean V;
   private float W;
   private float aa;
   private float ab;
   private final int ac;
   private boolean ad;
   private int ae;
   private Scroller af;
   private final float[] ag;
   private boolean ah;
   private int ai;
   private int aj;
   private final int[] ak;
   private View al;
   private final Runnable am;
   private final Runnable an;
   private final Runnable ao;
   private final be ap;

   public au(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public au(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public au(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.K = true;
      this.L = true;
      this.R = new bh();
      this.S = new ArrayList();
      this.T = new ArrayList();
      this.ae = 0;
      this.ag = new float[2];
      this.ai = -1;
      this.aj = -1;
      this.ak = new int[2];
      this.al = null;
      this.am = new av(this);
      this.an = new aw(this);
      this.ao = new ax(this);
      this.ap = new be((av)null);
      this.setHasFixedSize(true);
      this.setOverScrollMode(2);
      this.setLayoutManager(new bb(this, (av)null));
      this.setOnScrollListener(new ay(this));
      ViewConfiguration var4 = ViewConfiguration.get(var1);
      this.ac = var4.getScaledTouchSlop();
      this.H = var4.getScaledMinimumFlingVelocity();
      this.I = var4.getScaledMaximumFlingVelocity();
   }

   private void B() {
      if (this.al != null) {
         this.al.setPressed(false);
         this.al = null;
      }

      Handler var1 = this.getHandler();
      if (var1 != null) {
         var1.removeCallbacks(this.am);
      }

   }

   private boolean C() {
      boolean var1 = true;
      boolean var2;
      if (this.isEnabled() && this.getVisibility() == 0 && this.getChildCount() >= 1) {
         View var3 = this.getChildAt(this.D());
         bj var4 = this.o(var3);
         var2 = var1;
         if (!var3.performClick()) {
            if (this.O != null) {
               this.O.a(var4);
               var2 = var1;
            } else {
               var2 = false;
            }
         }
      } else {
         var2 = false;
      }

      return var2;
   }

   private int D() {
      int var1 = this.getChildCount();
      int var2 = Integer.MAX_VALUE;
      int var3 = q(this);
      int var4 = 0;

      int var5;
      int var7;
      for(var5 = -1; var4 < var1; var5 = var7) {
         View var6 = this.getChildAt(var4);
         var7 = this.getTop();
         var7 = Math.abs(var3 - (q(var6) + var7));
         if (var7 < var2) {
            var2 = var4;
            var5 = var7;
         } else {
            var7 = var2;
            var2 = var5;
            var5 = var7;
         }

         ++var4;
         var7 = var2;
         var2 = var5;
      }

      if (var5 == -1) {
         throw new IllegalStateException("Can't find central view.");
      } else {
         return var5;
      }
   }

   private boolean E() {
      boolean var1 = false;
      boolean var2 = var1;
      if (this.getChildCount() > 0) {
         var2 = var1;
         if (this.ab <= (float)this.getCentralViewTop()) {
            var2 = var1;
            if (this.getChildAt(0).getTop() >= this.getTopViewMaxTop()) {
               var2 = var1;
               if (this.U != null) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   // $FF: synthetic method
   static int a(au var0) {
      return var0.D();
   }

   // $FF: synthetic method
   static View a(au var0, View var1) {
      var0.al = var1;
      return var1;
   }

   private void a(int var1, long var2, long var4, AnimatorListener var6) {
      this.a((List)null, var1, var2, var4, var6);
   }

   // $FF: synthetic method
   static void a(au var0, int var1) {
      var0.j(var1);
   }

   // $FF: synthetic method
   static void a(au var0, MotionEvent var1, int var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(au var0, boolean var1) {
      var0.b(var1);
   }

   private void a(MotionEvent var1, int var2) {
      if (this.K && var1 != null && this.b(var1)) {
         Handler var3 = this.getHandler();
         if (var3 != null) {
            var3.postDelayed(this.an, (long)ViewConfiguration.getTapTimeout());
         }
      } else if (var2 == 0) {
         if (this.E()) {
            this.U.a();
         } else {
            this.A();
         }
      }

   }

   private void a(List var1, int var2, long var3, long var5, AnimatorListener var7) {
      if (this.P != null) {
         this.P.cancel();
      }

      this.Q = 0;
      ObjectAnimator var8 = ObjectAnimator.ofInt(this, this.R, new int[]{0, -var2});
      if (var1 != null) {
         var1.add(var8);
         AnimatorSet var9 = new AnimatorSet();
         var9.playTogether(var1);
         this.P = var9;
      } else {
         this.P = var8;
      }

      this.P.setDuration(var3);
      if (var7 != null) {
         this.P.addListener(var7);
      }

      if (var5 > 0L) {
         this.P.setStartDelay(var5);
      }

      this.P.start();
   }

   private void a(float[] var1) {
      int[] var2 = this.ak;
      this.ak[1] = 0;
      var2[0] = 0;
      this.getLocationOnScreen(this.ak);
      int var3 = this.ak[1];
      int var4 = this.getHeight();
      var1[0] = (float)var3 + (float)var4 * 0.33F;
      var1[1] = (float)var3 + (float)var4 * 0.66999996F;
   }

   private boolean a(MotionEvent var1) {
      boolean var2;
      if (this.ah) {
         var2 = this.ad;
      } else {
         float var3 = Math.abs(this.W - var1.getX());
         float var4 = Math.abs(this.aa - var1.getY());
         if (var3 * var3 + var4 * var4 > (float)(this.ac * this.ac)) {
            if (var3 > var4) {
               this.ad = false;
            }

            this.ah = true;
         }

         var2 = this.ad;
      }

      return var2;
   }

   // $FF: synthetic method
   static View b(au var0) {
      return var0.al;
   }

   // $FF: synthetic method
   static void b(au var0, int var1) {
      var0.setScrollVertically(var1);
   }

   private void b(boolean var1) {
      bb var2 = (bb)this.getLayoutManager();
      int var3 = var2.y();
      if (var3 != 0) {
         int var4 = bb.a(var2);

         int var5;
         for(var5 = 0; var5 < var3; ++var5) {
            bj var6 = this.o(var2.i(var5));
            boolean var7;
            if (var5 == var4) {
               var7 = true;
            } else {
               var7 = false;
            }

            var6.a(var7, var1);
         }

         var4 = this.o(this.getChildAt(var4)).d();
         if (var4 != this.ai) {
            var5 = this.getBaseline();
            if (this.aj != var5) {
               this.aj = var5;
               this.requestLayout();
            }

            Iterator var8 = this.S.iterator();

            while(var8.hasNext()) {
               ((bg)var8.next()).a(var4);
            }

            var8 = this.T.iterator();

            while(var8.hasNext()) {
               ((bd)var8.next()).a(var4);
            }

            this.ai = var4;
         }
      }

   }

   // $FF: synthetic method
   static boolean b(au var0, boolean var1) {
      var0.K = var1;
      return var1;
   }

   private boolean b(MotionEvent var1) {
      boolean var2 = false;
      if (this.isEnabled()) {
         float var3 = var1.getX();
         float var4 = var1.getY();
         int var5 = this.D();
         View var6 = this.a(var3, var4);
         if (var6 != null) {
            bj var7 = this.o(var6);
            this.a(this.ag);
            if (var5 == 0 && var1.getRawY() <= this.ag[0] && this.O != null) {
               this.O.a();
            } else if (this.O != null) {
               this.O.a(var7);
            }

            var2 = true;
         }
      }

      return var2;
   }

   // $FF: synthetic method
   static void c(au var0) {
      var0.B();
   }

   private void c(MotionEvent var1) {
      if (this.K) {
         this.M = (int)var1.getX();
         this.N = (int)var1.getY();
         float var2 = var1.getRawY();
         this.a(this.ag);
         if (var2 > this.ag[0] && var2 < this.ag[1] && this.getChildAt(this.D()) instanceof bc) {
            Handler var3 = this.getHandler();
            if (var3 != null) {
               var3.removeCallbacks(this.an);
               var3.postDelayed(this.am, (long)ViewConfiguration.getTapTimeout());
            }
         }
      }

   }

   // $FF: synthetic method
   static List d(au var0) {
      return var0.S;
   }

   // $FF: synthetic method
   static int e(au var0) {
      return var0.ae;
   }

   // $FF: synthetic method
   static int f(au var0) {
      return var0.getItemHeight();
   }

   // $FF: synthetic method
   static boolean g(au var0) {
      return var0.J;
   }

   private int getAdjustedHeight() {
      return r(this);
   }

   private int getItemHeight() {
      return this.getAdjustedHeight() / 3 + 1;
   }

   private int getTopViewMaxTop() {
      return this.getHeight() / 2;
   }

   // $FF: synthetic method
   static Runnable h(au var0) {
      return var0.ao;
   }

   // $FF: synthetic method
   static bf i(au var0) {
      return var0.U;
   }

   // $FF: synthetic method
   static int j(au var0) {
      return var0.getTopViewMaxTop();
   }

   private void j(int var1) {
      Iterator var2 = this.S.iterator();

      while(var2.hasNext()) {
         ((bg)var2.next()).b(var1);
      }

      this.b(true);
   }

   // $FF: synthetic method
   static int k(au var0) {
      return var0.Q;
   }

   // $FF: synthetic method
   static int p(View var0) {
      return q(var0);
   }

   private static int q(View var0) {
      return var0.getTop() + var0.getPaddingTop() + r(var0) / 2;
   }

   private static int r(View var0) {
      return var0.getHeight() - var0.getPaddingBottom() - var0.getPaddingTop();
   }

   private void setScrollVertically(int var1) {
      this.scrollBy(0, var1 - this.Q);
      this.Q = var1;
   }

   public void A() {
      if (this.getChildCount() != 0) {
         View var1 = this.getChildAt(this.D());
         this.a(this.getCentralViewTop() - var1.getTop(), 150L, 0L, new az(this));
      }

   }

   public void a(int var1, es var2) {
      bb var3 = (bb)this.getLayoutManager();
      var3.b(var2);
      this.c(var1);
      var3.f();
   }

   public void a(bd var1) {
      this.T.add(var1);
   }

   public void a(bg var1) {
      this.S.add(var1);
   }

   // $FF: synthetic method
   public ey b(View var1) {
      return this.o(var1);
   }

   public boolean b(int var1, int var2) {
      boolean var3 = false;
      if (this.getChildCount() != 0) {
         int var4 = this.f(this.getChildAt(this.D()));
         if ((var4 != 0 || var2 >= 0) && (var4 != this.getAdapter().a() - 1 || var2 <= 0)) {
            if (Math.abs(var2) >= this.H) {
               int var5 = Math.max(Math.min(var2, this.I), -this.I);
               if (this.af == null) {
                  this.af = new Scroller(this.getContext(), (Interpolator)null, true);
               }

               this.af.fling(0, 0, 0, var5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
               var2 = this.af.getFinalY() / (this.getPaddingTop() + this.getAdjustedHeight() / 2);
               var1 = var2;
               if (var2 == 0) {
                  if (var5 > 0) {
                     var1 = 1;
                  } else {
                     var1 = -1;
                  }
               }

               this.c(Math.max(0, Math.min(this.getAdapter().a() - 1, var1 + var4)));
               var3 = true;
            }
         } else {
            var3 = super.b(var1, var2);
         }
      }

      return var3;
   }

   public int getBaseline() {
      int var1;
      if (this.getChildCount() == 0) {
         var1 = super.getBaseline();
      } else {
         var1 = this.getChildAt(this.D()).getBaseline();
         if (var1 == -1) {
            var1 = super.getBaseline();
         } else {
            var1 += this.getCentralViewTop();
         }
      }

      return var1;
   }

   public int getCentralViewTop() {
      return this.getPaddingTop() + this.getItemHeight();
   }

   public boolean getMaximizeSingleItem() {
      return this.J;
   }

   public bj o(View var1) {
      return (bj)super.b(var1);
   }

   protected void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.ap.a(this);
   }

   protected void onDetachedFromWindow() {
      this.ap.a((au)null);
      super.onDetachedFromWindow();
   }

   public boolean onGenericMotionEvent(MotionEvent var1) {
      boolean var2;
      if (android.support.wearable.a.a.a(var1) && var1.getAction() == 8) {
         this.scrollBy(0, Math.round(-android.support.wearable.a.a.b(var1) * android.support.wearable.a.a.a(this.getContext())));
         var2 = true;
      } else {
         var2 = super.onGenericMotionEvent(var1);
      }

      return var2;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2;
      if (!this.isEnabled()) {
         var2 = false;
      } else {
         if (this.V && this.getChildCount() > 0) {
            int var3 = var1.getActionMasked();
            if (var3 == 0) {
               this.W = var1.getX();
               this.aa = var1.getY();
               float var4;
               if (this.getChildCount() > 0) {
                  var4 = (float)this.getChildAt(0).getTop();
               } else {
                  var4 = 0.0F;
               }

               this.ab = var4;
               this.ad = true;
               this.ah = false;
            } else if (var3 == 2 && this.ad) {
               this.a(var1);
            }

            if (this.getParent() != null) {
               this.getParent().requestDisallowInterceptTouchEvent(this.ad);
            }
         }

         var2 = super.onInterceptTouchEvent(var1);
      }

      return var2;
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3 = true;
      if (this.L) {
         switch(var1) {
         case 260:
            this.b(0, -this.H);
            return var3;
         case 261:
            this.b(0, this.H);
            return var3;
         case 262:
            var3 = this.C();
            return var3;
         case 263:
            var3 = false;
            return var3;
         }
      }

      var3 = super.onKeyDown(var1, var2);
      return var3;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      if (!this.isEnabled()) {
         var2 = false;
      } else {
         int var3 = this.getScrollState();
         boolean var4 = super.onTouchEvent(var1);
         var2 = var4;
         if (this.getChildCount() > 0) {
            int var5 = var1.getActionMasked();
            if (var5 == 0) {
               this.c(var1);
               var2 = var4;
            } else if (var5 == 1) {
               this.a(var1, var3);
               var2 = var4;
               if (this.getParent() != null) {
                  this.getParent().requestDisallowInterceptTouchEvent(false);
                  var2 = var4;
               }
            } else if (var5 == 2) {
               if (Math.abs(this.M - (int)var1.getX()) >= this.ac || Math.abs(this.N - (int)var1.getY()) >= this.ac) {
                  this.B();
                  this.K = false;
               }

               var4 |= this.a(var1);
               var2 = var4;
               if (this.getParent() != null) {
                  this.getParent().requestDisallowInterceptTouchEvent(this.ad);
                  var2 = var4;
               }
            } else {
               var2 = var4;
               if (var5 == 3) {
                  if (this.getParent() != null) {
                     this.getParent().requestDisallowInterceptTouchEvent(false);
                  }

                  this.K = true;
                  var2 = var4;
               }
            }
         }
      }

      return var2;
   }

   public void setAdapter(ds var1) {
      this.ap.a(var1);
      super.setAdapter(var1);
   }

   public void setClickListener(ba var1) {
      this.O = var1;
   }

   public void setEnableGestureNavigation(boolean var1) {
      this.L = var1;
   }

   public void setGreedyTouchMode(boolean var1) {
      this.V = var1;
   }

   public void setInitialOffset(int var1) {
      this.ae = var1;
   }

   public void setMaximizeSingleItem(boolean var1) {
      this.J = var1;
   }

   public void setOverScrollListener(bf var1) {
      this.U = var1;
   }
}
