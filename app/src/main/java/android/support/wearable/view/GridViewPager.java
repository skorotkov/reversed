package android.support.wearable.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.bz;
import android.support.v4.view.cw;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.View.MeasureSpec;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import android.widget.Scroller;

@Deprecated
@TargetApi(20)
public class GridViewPager extends ViewGroup {
   private static final int[] a = new int[]{16842931};
   private static final Interpolator b = new af();
   private static final Interpolator c = new DecelerateInterpolator(2.5F);
   private boolean A;
   private final int B;
   private final int C;
   private float D;
   private float E;
   private float F;
   private float G;
   private int H;
   private int I;
   private VelocityTracker J;
   private final int K;
   private final int L;
   private final int M;
   private final int N;
   private boolean O;
   private boolean P;
   private aj Q;
   private ai R;
   private int S;
   private int T;
   private final SparseIntArray U;
   private View V;
   private final b W;
   private WindowInsets aa;
   private OnApplyWindowInsetsListener ab;
   private boolean ac;
   private aa ad;
   private boolean ae;
   private int d;
   private int e;
   private boolean f;
   private int g;
   private final Runnable h;
   private final Point i;
   private aa j;
   private final Point k;
   private Point l;
   private Parcelable m;
   private ClassLoader n;
   private final android.support.v4.g.t o;
   private final android.support.v4.g.t p;
   private final Rect q;
   private final Rect r;
   private final Scroller s;
   private ak t;
   private int u;
   private int v;
   private boolean w;
   private boolean x;
   private int y;
   private boolean z;

   public GridViewPager(Context var1) {
      this(var1, (AttributeSet)null, 0);
   }

   public GridViewPager(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public GridViewPager(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.f = true;
      this.g = 300;
      this.h = new ae(this);
      this.y = 1;
      this.I = -1;
      this.J = null;
      this.O = true;
      this.S = 0;
      ViewConfiguration var5 = ViewConfiguration.get(this.getContext());
      float var4 = var1.getResources().getDisplayMetrics().density;
      this.B = cw.a(var5);
      this.C = this.B * this.B;
      this.K = var5.getScaledMinimumFlingVelocity();
      this.L = (int)(40.0F * var4);
      this.M = (int)(200.0F * var4);
      this.N = (int)(2.0F * var4);
      this.k = new Point();
      this.o = new android.support.v4.g.t();
      this.p = new android.support.v4.g.t();
      this.q = new Rect();
      this.r = new Rect();
      this.s = new Scroller(var1, c, true);
      this.i = new Point();
      this.setOverScrollMode(1);
      this.U = new SparseIntArray();
      this.W = new b();
      this.W.a((View)this);
   }

   private float a(float var1) {
      int var2 = this.getContentWidth() + this.v;
      if (var2 == 0) {
         Log.e("GridViewPager", "getXIndex() called with zero width.");
         var1 = 0.0F;
      } else {
         var1 /= (float)var2;
      }

      return var1;
   }

   private static float a(float var0, float var1, float var2) {
      if (var0 >= var1) {
         if (var0 > var2) {
            var1 = var2;
         } else {
            var1 = var0;
         }
      }

      return var1;
   }

   private static float a(float var0, int var1) {
      if (var1 > 0) {
         var0 = Math.max(0.0F, Math.min(var0, (float)var1));
      } else {
         var0 = Math.min(0.0F, Math.max(var0, (float)var1));
      }

      return var0;
   }

   private int a(int var1) {
      return this.U.get(var1, 0);
   }

   private int a(int var1, int var2, float var3, int var4, int var5, int var6, int var7) {
      var1 = var6;
      if (Math.abs(var6) < this.M) {
         var1 = (int)Math.copySign((float)var6, (float)var7);
      }

      float var8 = 0.5F / Math.max(Math.abs(0.5F - var3), 0.001F);
      if (Math.abs(var7) > this.L && var8 * 100.0F + (float)Math.abs(var1) > (float)this.K) {
         if (var1 <= 0) {
            ++var2;
         }
      } else {
         var2 = Math.round((float)var2 + var3);
      }

      return b(var2, var4, var5);
   }

   private int a(View var1, int var2) {
      int var3 = 0;
      if (var1 instanceof h) {
         var3 = ((h)var1).a(var2);
      } else if (var1 instanceof ScrollView) {
         var3 = this.a((ScrollView)var1, var2);
      }

      return var3;
   }

   private int a(ScrollView var1, int var2) {
      byte var3 = 0;
      int var4 = var3;
      if (var1.getChildCount() > 0) {
         View var5 = var1.getChildAt(0);
         int var6 = var1.getHeight();
         int var7 = var5.getHeight();
         var4 = var3;
         if (var7 > var6) {
            if (var2 > 0) {
               var4 = Math.min(var7 - var6 - var1.getScrollY(), 0);
            } else {
               var4 = var3;
               if (var2 < 0) {
                  var4 = -var1.getScrollY();
               }
            }
         }
      }

      return var4;
   }

   private ag a(Point var1) {
      return (ag)this.o.get(var1);
   }

   private ag a(View var1) {
      int var2 = 0;

      ag var4;
      while(true) {
         if (var2 >= this.o.size()) {
            var4 = null;
            break;
         }

         ag var3 = (ag)this.o.c(var2);
         if (var3 != null && this.j.a(var1, var3.a)) {
            var4 = var3;
            break;
         }

         ++var2;
      }

      return var4;
   }

   private View a(ag var1) {
      View var5;
      if (var1.a != null) {
         int var2 = this.getChildCount();

         for(int var3 = 0; var3 < var2; ++var3) {
            View var4 = this.getChildAt(var3);
            if (this.j.a(var4, var1.a)) {
               var5 = var4;
               return var5;
            }
         }
      }

      var5 = null;
      return var5;
   }

   private void a(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      ag var18;
      if (var2 > 0 && var4 > 0) {
         int var9 = this.getPaddingLeft();
         int var10 = this.getPaddingRight();
         int var11 = this.getPaddingLeft();
         int var12 = this.getPaddingRight();
         int var13 = this.getPaddingTop();
         int var14 = this.getPaddingBottom();
         int var15 = this.getPaddingTop();
         int var16 = this.getPaddingBottom();
         float var17 = (float)this.a(this.k.y) / (float)(var2 - var11 - var12 + var6);
         var1 = (int)((float)(var1 - var9 - var10 + var5) * var17);
         var7 = (int)((float)this.getScrollY() / (float)(var4 - var15 - var16 + var8) * (float)(var3 - var13 - var14 + var7));
         this.scrollTo(var1, var7);
         if (!this.s.isFinished()) {
            var18 = this.a(this.k);
            var2 = this.c(var18.b);
            var8 = this.getPaddingLeft();
            var5 = this.d(var18.c);
            var3 = this.getPaddingTop();
            var6 = this.s.getDuration();
            var4 = this.s.timePassed();
            this.s.startScroll(var1, var7, var2 - var8, var5 - var3, var6 - var4);
         }
      } else {
         var18 = this.a(this.k);
         if (var18 != null) {
            var1 = this.c(var18.b) - this.getPaddingLeft();
            var2 = this.d(var18.c) - this.getPaddingTop();
            if (var1 != this.a(var18.c) || var2 != this.getScrollY()) {
               this.a(false);
               this.scrollTo(var1, var2);
            }
         }
      }

   }

   private void a(int var1, int var2, boolean var3, int var4, boolean var5) {
      ag var6 = this.f(var1, var2);
      int var7;
      int var8;
      if (var6 != null) {
         var7 = this.c(var6.b) - this.getPaddingLeft();
         var8 = this.d(var6.c) - this.getPaddingTop();
      } else {
         var8 = 0;
         var7 = 0;
      }

      this.j.f(var2, var1);
      if (var5) {
         if (this.Q != null) {
            this.Q.a(var2, var1);
         }

         if (this.W != null) {
            this.W.a(var2, var1);
         }
      }

      if (var3) {
         this.a(var7, var8, var4);
      } else {
         this.a(false);
         this.scrollTo(var7, var8);
         this.g(var7, var8);
      }

   }

   // $FF: synthetic method
   static void a(GridViewPager var0) {
      var0.e();
   }

   // $FF: synthetic method
   static void a(GridViewPager var0, int var1) {
      var0.setScrollState(var1);
   }

   private void a(aa var1, aa var2) {
      if (this.R != null) {
         this.R.a(var1, var2);
      }

      if (this.W != null) {
         this.W.a(var1, var2);
      }

   }

   private void a(MotionEvent var1) {
      int var2 = android.support.v4.view.bg.b(var1);
      if (android.support.v4.view.bg.a(var1, var2) == this.I) {
         byte var3;
         if (var2 == 0) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         this.D = android.support.v4.view.bg.b(var1, var3);
         this.E = android.support.v4.view.bg.c(var1, var3);
         this.I = android.support.v4.view.bg.a(var1, var3);
         if (this.J != null) {
            this.J.clear();
         }
      }

   }

   private void a(boolean var1) {
      boolean var2;
      if (this.S == 2) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2) {
         this.s.abortAnimation();
         int var3 = this.a(this.k.y);
         int var4 = this.getScrollY();
         int var5 = this.s.getCurrX();
         int var6 = this.s.getCurrY();
         if (var3 != var5 || var4 != var6) {
            this.scrollTo(var5, var6);
         }
      }

      this.V = null;
      this.x = false;
      if (var2) {
         if (var1) {
            bz.a(this, (Runnable)this.h);
         } else {
            this.h.run();
         }
      }

   }

   private boolean a(float var1, float var2) {
      float var3 = this.D - var1;
      float var4 = this.E - var2;
      this.D = var1;
      this.E = var2;
      Rect var5 = this.q;
      int var6 = this.c(var5.left) - this.getPaddingLeft();
      int var7 = this.c(var5.right) - this.getPaddingLeft();
      int var8 = this.d(var5.top) - this.getPaddingTop();
      int var9 = this.d(var5.bottom) - this.getPaddingTop();
      float var10 = (float)this.a(this.k.y);
      var1 = (float)this.getScrollY();
      int var11;
      float var12;
      float var13;
      boolean var16;
      if (this.T == 1) {
         var11 = this.getContentHeight() + this.u;
         if (var4 < 0.0F) {
            var2 = -(var1 % (float)var11);
         } else {
            var2 = ((float)var11 - var1 % (float)var11) % (float)var11;
         }

         if (Math.abs(var2) <= Math.abs(var4)) {
            var1 += var2;
            var2 = var4 - var2;
            var16 = true;
         } else {
            var2 = var4;
            var16 = false;
         }

         var4 = var2;
         if (var16) {
            View var15 = this.a(this.h((int)var10, (int)var1));
            var4 = var2;
            if (var15 != null) {
               var12 = a(var2, this.a(var15, (int)Math.signum(var2)));
               var15.scrollBy(0, (int)var12);
               var4 = var2 - var12;
               this.E += var12 - (float)((int)var12);
            }
         }

         var13 = var1;
         var2 = var4;
      } else {
         var2 = var4;
         var13 = var1;
      }

      var11 = (int)((float)((int)var3) + var10);
      int var14 = (int)((float)((int)var2) + var13);
      if (var11 >= var6 && var11 <= var7 && var14 >= var8 && var14 <= var9) {
         var16 = false;
      } else {
         var16 = true;
      }

      label107: {
         var4 = var3;
         if (var16) {
            var14 = this.getOverScrollMode();
            if ((this.T != 0 || var6 >= var7) && (this.T != 1 || var8 >= var9)) {
               var16 = false;
            } else {
               var16 = true;
            }

            if (var14 != 0 && (!var16 || var14 != 1)) {
               var4 = a(var3, (float)var6 - var10, (float)var7 - var10);
               var1 = a(var2, (float)var8 - var13, (float)var9 - var13);
               break label107;
            }

            if (var10 > (float)var7) {
               var4 = var10 - (float)var7;
            } else if (var10 < (float)var6) {
               var4 = var10 - (float)var6;
            } else {
               var4 = 0.0F;
            }

            if (var13 > (float)var9) {
               var12 = var13 - (float)var9;
            } else if (var13 < (float)var8) {
               var12 = var13 - (float)var8;
            } else {
               var12 = 0.0F;
            }

            var1 = var3;
            if (Math.abs(var4) > 0.0F) {
               var1 = var3;
               if (Math.signum(var4) == Math.signum(var3)) {
                  var1 = var3 * b.getInterpolation(1.0F - Math.abs(var4) / (float)this.getContentWidth());
               }
            }

            var4 = var1;
            if (Math.abs(var12) > 0.0F) {
               var4 = var1;
               if (Math.signum(var12) == Math.signum(var2)) {
                  var2 = b.getInterpolation(1.0F - Math.abs(var12) / (float)this.getContentHeight()) * var2;
                  var4 = var1;
                  var1 = var2;
                  break label107;
               }
            }
         }

         var1 = var2;
      }

      var2 = var4 + var10;
      var1 += var13;
      this.D += var2 - (float)((int)var2);
      this.E += var1 - (float)((int)var1);
      this.scrollTo((int)var2, (int)var1);
      this.g((int)var2, (int)var1);
      return true;
   }

   private boolean a(KeyEvent var1) {
      boolean var2 = false;
      boolean var3 = var2;
      switch(var1.getKeyCode()) {
      case 19:
         var3 = this.k();
         break;
      case 20:
         var3 = this.l();
         break;
      case 21:
         var3 = this.i();
         break;
      case 22:
         var3 = this.j();
      case 61:
         break;
      case 62:
         this.a();
         var3 = true;
         break;
      default:
         var3 = var2;
      }

      return var3;
   }

   private float b(float var1) {
      int var2 = this.getContentHeight() + this.u;
      if (var2 == 0) {
         Log.e("GridViewPager", "getYIndex() called with zero height.");
         var1 = 0.0F;
      } else {
         var1 /= (float)var2;
      }

      return var1;
   }

   private static int b(int var0, int var1, int var2) {
      if (var0 >= var1) {
         if (var0 > var2) {
            var1 = var2;
         } else {
            var1 = var0;
         }
      }

      return var1;
   }

   private void b(int var1) {
      this.c(this.k.y, var1);
   }

   private void b(int var1, int var2) {
      this.U.put(var1, var2);
   }

   // $FF: synthetic method
   static void b(GridViewPager var0) {
      var0.c();
   }

   private void b(boolean var1) {
      ViewParent var2 = this.getParent();
      if (var2 != null) {
         var2.requestDisallowInterceptTouchEvent(var1);
      }

   }

   private boolean b(MotionEvent var1) {
      if (!this.z) {
         this.I = android.support.v4.view.bg.a(var1, 0);
         this.G = var1.getX();
         this.F = var1.getY();
         this.H = this.getScrollY();
         this.D = this.G;
         this.E = this.F;
         this.A = true;
         this.J = VelocityTracker.obtain();
         this.J.addMovement(var1);
         this.s.computeScrollOffset();
         if ((this.S != 2 && this.S != 3 || this.T != 0 || Math.abs(this.s.getFinalX() - this.s.getCurrX()) <= this.N) && (this.T != 1 || Math.abs(this.s.getFinalY() - this.s.getCurrY()) <= this.N)) {
            this.a(false);
            this.z = false;
         } else {
            this.s.abortAnimation();
            this.x = false;
            this.e();
            this.z = true;
            this.b(true);
            this.setScrollState(1);
         }
      }

      return false;
   }

   // $FF: synthetic method
   static int[] b() {
      return a;
   }

   private int c(int var1) {
      return (this.getContentWidth() + this.v) * var1 + this.getPaddingLeft();
   }

   private void c() {
      int var1 = this.j.a();
      this.d = var1;
      Point var2 = new Point(this.k);
      android.support.v4.g.t var3 = new android.support.v4.g.t();
      int var4 = this.o.size() - 1;

      boolean var5;
      boolean var9;
      for(var5 = false; var4 >= 0; var5 = var9) {
         Point var6 = (Point)this.o.b(var4);
         ag var7 = (ag)this.o.c(var4);
         Point var8 = this.j.a(var7.a);
         this.j.a(var7.a, var8);
         if (var8 == android.support.wearable.view.aa.c) {
            var3.put(var6, var7);
            var9 = var5;
         } else if (var8 == android.support.wearable.view.aa.b) {
            if (!var5) {
               this.j.b((ViewGroup)this);
               var9 = true;
            } else {
               var9 = var5;
            }

            this.j.a(this, var7.c, var7.b, var7.a);
            if (this.k.equals(var7.b, var7.c)) {
               var2.y = b(this.k.y, 0, Math.max(0, var1 - 1));
               if (var2.y < var1) {
                  var2.x = b(this.k.x, 0, this.j.a(var2.y) - 1);
               } else {
                  var2.x = 0;
               }
            }
         } else {
            var9 = var5;
            if (!var8.equals(var7.b, var7.c)) {
               if (this.k.equals(var7.b, var7.c)) {
                  var2.set(var8.x, var8.y);
               }

               var7.b = var8.x;
               var7.c = var8.y;
               var3.put(new Point(var8), var7);
               var9 = var5;
            }
         }

         --var4;
      }

      this.o.clear();
      this.o.a(var3);
      if (var5) {
         this.j.a((ViewGroup)this);
      }

      if (this.d > 0) {
         this.e = this.j.a(var2.y);
      } else {
         this.e = 0;
      }

      this.d();
      this.a(var2.y, var2.x, false, true);
      this.requestLayout();
   }

   private void c(int var1, int var2) {
      if (this.a(var1) != var2) {
         int var3 = this.getChildCount();
         int var4 = this.a(var1);

         for(int var5 = 0; var5 < var3; ++var5) {
            View var6 = this.getChildAt(var5);
            ag var7 = this.a(var6);
            if (var7 != null && var7.c == var1) {
               var6.offsetLeftAndRight(-(var2 - var4));
               this.postInvalidateOnAnimation();
            }
         }

         this.b(var1, var2);
      }

   }

   private static boolean c(int var0, int var1, int var2) {
      boolean var3;
      if (var0 >= var1 && var0 <= var2) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   private boolean c(MotionEvent var1) {
      int var2 = this.I;
      boolean var3;
      if (var2 == -1) {
         var3 = false;
      } else {
         var2 = var1.findPointerIndex(var2);
         if (var2 == -1) {
            var3 = this.z;
         } else {
            float var4 = android.support.v4.view.bg.b(var1, var2);
            float var5 = android.support.v4.view.bg.c(var1, var2);
            float var6 = var4 - this.D;
            float var7 = Math.abs(var6);
            float var8 = var5 - this.E;
            float var9 = Math.abs(var8);
            if (this.z) {
            }

            if (!this.z && var7 * var7 + var9 * var9 > (float)this.C) {
               this.z = true;
               this.b(true);
               this.setScrollState(1);
               if (var9 >= var7) {
                  this.T = 1;
               } else {
                  this.T = 0;
               }

               if (var9 > 0.0F && var7 > 0.0F) {
                  double var10 = Math.hypot((double)var7, (double)var9);
                  var10 = Math.acos((double)var7 / var10);
                  var7 = (float)(Math.sin(var10) * (double)this.B);
                  var9 = (float)(Math.cos(var10) * (double)this.B);
               } else if (var9 == 0.0F) {
                  var9 = (float)this.B;
                  var7 = 0.0F;
               } else {
                  var9 = 0.0F;
                  var7 = (float)this.B;
               }

               if (var6 > 0.0F) {
                  var9 += this.D;
               } else {
                  var9 = this.D - var9;
               }

               this.D = var9;
               if (var8 > 0.0F) {
                  var7 += this.E;
               } else {
                  var7 = this.E - var7;
               }

               this.E = var7;
            }

            if (this.z) {
               if (this.T == 0) {
                  var7 = var4;
               } else {
                  var7 = this.D;
               }

               if (this.T == 1) {
                  var9 = var5;
               } else {
                  var9 = this.E;
               }

               if (this.a(var7, var9)) {
                  bz.c(this);
               }
            }

            this.J.addMovement(var1);
            var3 = this.z;
         }
      }

      return var3;
   }

   private int d(int var1) {
      return (this.getContentHeight() + this.u) * var1 + this.getPaddingTop();
   }

   private ag d(int var1, int var2) {
      Point var3 = new Point(var1, var2);
      ag var4 = (ag)this.p.remove(var3);
      ag var5 = var4;
      if (var4 == null) {
         var5 = new ag();
         var5.a = this.j.b(this, var2, var1);
         var5.b = var1;
         var5.c = var2;
      }

      var3.set(var1, var2);
      var5.b = var1;
      var5.c = var2;
      this.o.put(var3, var5);
      return var5;
   }

   private void d() {
      if (this.R != null) {
         this.R.a();
      }

      if (this.W != null) {
         this.W.a();
      }

   }

   private boolean d(MotionEvent var1) {
      if (this.z && this.d != 0) {
         VelocityTracker var2 = this.J;
         var2.addMovement(var1);
         var2.computeCurrentVelocity(1000);
         int var3 = var1.findPointerIndex(this.I);
         int var4 = this.k.x;
         int var5 = this.k.y;
         ag var6 = this.g();
         int var7;
         float var8;
         switch(this.T) {
         case 0:
            var7 = (int)(var1.getRawX() - this.G);
            var3 = (int)var2.getXVelocity(this.I);
            var4 = var6.b;
            var8 = this.a((float)(this.a(var6.c) - this.c(var6.b)));
            var7 = this.a(this.k.x, var4, var8, this.q.left, this.q.right, var3, var7);
            var4 = var5;
            var5 = var7;
            break;
         case 1:
            var1.getX(var3);
            int var9 = this.H;
            int var10 = this.getScrollY();
            var3 = (int)var2.getYVelocity(this.I);
            var7 = var6.c;
            var8 = this.b((float)(this.getScrollY() - this.d(var6.c)));
            if (var8 == 0.0F) {
               View var11 = this.a(this.g());
               var7 = this.a(var11, -var3);
               if (var7 != 0) {
                  this.V = var11;
                  if (Math.abs(var3) >= Math.abs(this.K)) {
                     this.a(0, var7, 0, -var3);
                     this.h();
                  }
               }

               var7 = var5;
               var5 = var4;
               var4 = var7;
            } else {
               var7 = this.a(this.k.y, var7, var8, this.q.top, this.q.bottom, var3, var9 - var10);
               var5 = var4;
               var4 = var7;
            }
            break;
         default:
            var3 = 0;
            var7 = var5;
            var5 = var4;
            var4 = var7;
         }

         if (this.S != 3) {
            this.x = true;
            if (var4 != this.k.y) {
               var5 = this.j.e(var4, this.k.x);
            }

            this.a(var4, var5, true, true, var3);
         }

         this.I = -1;
         this.h();
      } else {
         this.I = -1;
         this.h();
      }

      return false;
   }

   private static String e(int var0) {
      StringBuilder var1 = new StringBuilder((var0 * 2 + 3) * 2);

      for(int var2 = 0; var2 < var0 * 2 + 3; ++var2) {
         var1.append(' ').append(' ');
      }

      return var1.toString();
   }

   private void e() {
      if (this.j != null && this.j.a() > 0) {
         this.e(this.k.x, this.k.y);
      }

   }

   private void e(int var1, int var2) {
      Point var3 = new Point();
      if (this.k.x != var1 || this.k.y != var2) {
         var3.set(this.k.x, this.k.y);
         this.k.set(var1, var2);
      }

      if (!this.x && this.getWindowToken() != null) {
         this.j.b((ViewGroup)this);
         this.r.setEmpty();
         int var4 = this.j.a();
         if (this.d != var4) {
            throw new IllegalStateException("Adapter row count changed without a call to notifyDataSetChanged()");
         }

         int var5 = this.j.a(var2);
         if (var5 < 1) {
            throw new IllegalStateException("All rows must have at least 1 column");
         }

         this.d = var4;
         this.e = var5;
         int var6 = Math.max(1, this.y);
         int var7 = Math.max(0, var2 - var6);
         var4 = Math.min(var4 - 1, var2 + var6);
         int var8 = Math.max(0, var1 - var6);
         var6 = Math.min(var5 - 1, var1 + var6);

         for(var5 = this.o.size() - 1; var5 >= 0; --var5) {
            ag var9 = (ag)this.o.c(var5);
            if (var9.c == var2) {
               if (var9.b >= var8 && var9.b <= var6) {
                  continue;
               }
            } else {
               int var10 = this.j.e(var9.c, this.k.x);
               if (var9.b == var10 && var9.c >= var7 && var9.c <= var4) {
                  continue;
               }
            }

            var3 = (Point)this.o.b(var5);
            this.o.d(var5);
            var3.set(var9.b, var9.c);
            this.p.put(var3, var9);
         }

         this.i.y = var2;

         for(this.i.x = var8; this.i.x <= var6; ++var3.x) {
            if (!this.o.containsKey(this.i)) {
               this.d(this.i.x, this.i.y);
            }

            var3 = this.i;
         }

         for(this.i.y = var7; this.i.y <= var4; ++var3.y) {
            this.i.x = this.j.e(this.i.y, var1);
            if (!this.o.containsKey(this.i)) {
               this.d(this.i.x, this.i.y);
            }

            if (this.i.y != this.k.y) {
               this.b(this.i.y, this.c(this.i.x) - this.getPaddingLeft());
            }

            var3 = this.i;
         }

         for(var1 = this.p.size() - 1; var1 >= 0; --var1) {
            ag var11 = (ag)this.p.d(var1);
            this.j.a(this, var11.c, var11.b, var11.a);
         }

         this.p.clear();
         this.j.a((ViewGroup)this);
         this.q.set(var8, var7, var6, var4);
         this.r.set(this.c(var8) - this.getPaddingLeft(), this.d(var7) - this.getPaddingTop(), this.c(var6 + 1) - this.getPaddingRight(), this.d(var4 + 1) + this.getPaddingBottom());
         if (this.ac) {
            this.ac = false;
            this.a(this.ad, this.j);
            this.ad = null;
         }

         if (this.ae) {
            this.ae = false;
            this.d();
         }
      }

   }

   private ag f(int var1, int var2) {
      this.i.set(var1, var2);
      return (ag)this.o.get(this.i);
   }

   private void f() {
      this.cancelPendingInputEvents();
      long var1 = SystemClock.uptimeMillis();
      MotionEvent var3 = MotionEvent.obtain(var1, var1, 3, 0.0F, 0.0F, 0);
      var3.setSource(4098);
      this.dispatchTouchEvent(var3);
      var3.recycle();
   }

   private ag g() {
      return this.h(this.a((int)this.b((float)this.getScrollY())), this.getScrollY());
   }

   private boolean g(int var1, int var2) {
      boolean var3 = false;
      if (this.o.size() == 0) {
         this.P = false;
         this.a(0, 0, 0.0F, 0.0F, 0, 0);
         if (!this.P) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
         }
      } else {
         ag var4 = this.g();
         int var5 = this.c(var4.b);
         int var6 = this.d(var4.c);
         var1 = this.getPaddingLeft() + var1 - var5;
         var2 = this.getPaddingTop() + var2 - var6;
         float var7 = this.a((float)var1);
         float var8 = this.b((float)var2);
         this.P = false;
         this.a(var4.b, var4.c, var7, var8, var1, var2);
         if (!this.P) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
         }

         var3 = true;
      }

      return var3;
   }

   private int getContentHeight() {
      return this.getMeasuredHeight() - (this.getPaddingTop() + this.getPaddingBottom());
   }

   private int getContentWidth() {
      return this.getMeasuredWidth() - (this.getPaddingLeft() + this.getPaddingRight());
   }

   private ag h(int var1, int var2) {
      var2 = (int)this.b((float)var2);
      var1 = (int)this.a((float)var1);
      ag var3 = this.f(var1, var2);
      ag var4 = var3;
      if (var3 == null) {
         var4 = new ag();
         var4.b = var1;
         var4.c = var2;
      }

      return var4;
   }

   private void h() {
      this.z = false;
      this.A = false;
      if (this.J != null) {
         this.J.recycle();
         this.J = null;
      }

   }

   private boolean i() {
      boolean var1 = true;
      if (this.k.x > 0) {
         this.a(this.k.x - 1, this.k.y, true);
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean i(int var1, int var2) {
      boolean var3 = false;
      boolean var4 = var3;
      if (c(var2, 0, this.d - 1)) {
         var4 = var3;
         if (c(var1, 0, this.j.a(var2) - 1)) {
            var4 = true;
         }
      }

      return var4;
   }

   private boolean j() {
      boolean var1 = true;
      if (this.j != null && this.k.x < this.j.a(this.k.y) - 1) {
         this.a(this.k.x + 1, this.k.y, true);
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean k() {
      boolean var1 = true;
      if (this.k.y > 0) {
         this.a(this.k.x, this.k.y - 1, true);
      } else {
         var1 = false;
      }

      return var1;
   }

   private boolean l() {
      boolean var1 = true;
      if (this.j != null && this.k.y < this.j.a() - 1) {
         this.a(this.k.x, this.k.y + 1, true);
      } else {
         var1 = false;
      }

      return var1;
   }

   private void setScrollState(int var1) {
      if (this.S != var1) {
         this.S = var1;
         if (this.Q != null) {
            this.Q.a(var1);
         }

         if (this.W != null) {
            this.W.a(var1);
         }
      }

   }

   public void a() {
      this.debug(0);
   }

   public void a(int var1, int var2) {
      this.x = false;
      boolean var3;
      if (!this.O) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.a(var1, var2, var3, false);
   }

   public void a(int var1, int var2, float var3, float var4, int var5, int var6) {
      this.P = true;
      if (this.Q != null) {
         this.Q.a(var2, var1, var4, var3, var6, var5);
      }

      if (this.W != null) {
         this.W.a(var2, var1, var4, var3, var6, var5);
      }

   }

   void a(int var1, int var2, int var3) {
      if (this.getChildCount() != 0) {
         var3 = this.a(this.k.y);
         int var4 = this.getScrollY();
         var1 -= var3;
         int var5 = var2 - var4;
         if (var1 == 0 && var5 == 0) {
            this.a(false);
            this.e();
            this.setScrollState(0);
         } else {
            this.setScrollState(2);
            var2 = this.g;
            this.s.startScroll(var3, var4, var1, var5, var2);
            bz.c(this);
         }
      }

   }

   void a(int var1, int var2, int var3, int var4) {
      if (this.V != null) {
         if (var3 == 0 && var4 == 0) {
            this.a(false);
            this.setScrollState(0);
         } else {
            int var5 = this.V.getScrollX();
            int var6 = this.V.getScrollY();
            this.setScrollState(3);
            int var7;
            if (var3 > 0) {
               var1 += var5;
               var7 = var5;
            } else {
               var7 = var5 + var1;
               var1 = var5;
            }

            int var8;
            int var9;
            if (var4 > 0) {
               var8 = var6 + var2;
               var9 = var6;
            } else {
               var9 = var6 + var2;
               var8 = var6;
            }

            this.s.fling(var5, var6, var3, var4, var7, var1, var9, var8);
            bz.c(this);
         }
      }

   }

   public void a(int var1, int var2, boolean var3) {
      this.x = false;
      this.a(var1, var2, var3, false);
   }

   void a(int var1, int var2, boolean var3, boolean var4) {
      this.a(var1, var2, var3, var4, 0);
   }

   void a(int var1, int var2, boolean var3, boolean var4, int var5) {
      boolean var6 = true;
      if (this.j != null && this.j.a() > 0 && (var4 || !this.k.equals(var2, var1) || this.o.size() == 0)) {
         var1 = b(var1, 0, this.j.a() - 1);
         var2 = b(var2, 0, this.j.a(var1) - 1);
         if (var2 != this.k.x) {
            this.T = 0;
            var4 = var6;
         } else if (var1 != this.k.y) {
            this.T = 1;
            var4 = var6;
         } else {
            var4 = false;
         }

         if (this.O) {
            this.k.set(0, 0);
            this.j.f(var1, var2);
            if (var4) {
               if (this.Q != null) {
                  this.Q.a(var1, var2);
               }

               if (this.W != null) {
                  this.W.a(var1, var2);
               }
            }

            this.requestLayout();
         } else {
            this.e(var2, var1);
            this.a(var2, var1, var3, var5, var4);
         }
      }

   }

   public void a(View var1, ah var2) {
      int var3 = 0;
      int var4 = this.getContentWidth();
      int var5 = this.getContentHeight();
      int var6;
      if (var2.width == -2) {
         var6 = 0;
      } else {
         var6 = 1073741824;
      }

      if (var2.height != -2) {
         var3 = 1073741824;
      }

      var6 = MeasureSpec.makeMeasureSpec(var4, var6);
      var3 = MeasureSpec.makeMeasureSpec(var5, var3);
      var1.measure(getChildMeasureSpec(var6, var2.leftMargin + var2.rightMargin, var2.width), getChildMeasureSpec(var3, var2.topMargin + var2.bottomMargin, var2.height));
   }

   public void addView(View var1, int var2, LayoutParams var3) {
      this.a(var1);
      if (!this.checkLayoutParams(var3)) {
         var3 = this.generateLayoutParams(var3);
      }

      ah var4 = (ah)var3;
      if (this.w) {
         var4.b = true;
         this.addViewInLayout(var1, var2, var3);
      } else {
         super.addView(var1, var2, var3);
      }

      if (this.aa != null) {
         var1.onApplyWindowInsets(this.aa);
      }

   }

   public boolean canScrollHorizontally(int var1) {
      boolean var2 = true;
      if (this.getVisibility() == 0 && this.j != null && !this.o.isEmpty()) {
         int var3 = this.a(this.k.y);
         int var4 = this.e;
         if (var1 > 0) {
            if (var3 + this.getPaddingLeft() >= this.c(var4 - 1)) {
               var2 = false;
            }
         } else if (var3 <= 0) {
            var2 = false;
         }
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean canScrollVertically(int var1) {
      boolean var2 = true;
      if (this.getVisibility() == 0 && this.j != null && !this.o.isEmpty()) {
         int var3 = this.getScrollY();
         int var4 = this.d;
         if (var1 > 0) {
            if (var3 + this.getPaddingTop() >= this.d(var4 - 1)) {
               var2 = false;
            }
         } else if (var3 <= 0) {
            var2 = false;
         }
      } else {
         var2 = false;
      }

      return var2;
   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      boolean var2;
      if (var1 instanceof ah && super.checkLayoutParams(var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void computeScroll() {
      if (!this.s.isFinished() && this.s.computeScrollOffset()) {
         int var1;
         int var2;
         if (this.S == 3) {
            if (this.V == null) {
               this.s.abortAnimation();
            } else {
               var1 = this.s.getCurrX();
               var2 = this.s.getCurrY();
               this.V.scrollTo(var1, var2);
            }
         } else {
            var2 = this.a(this.k.y);
            int var3 = this.getScrollY();
            int var4 = this.s.getCurrX();
            var1 = this.s.getCurrY();
            if (var2 != var4 || var3 != var1) {
               this.scrollTo(var4, var1);
               if (!this.g(var4, var1)) {
                  this.s.abortAnimation();
                  this.scrollTo(0, 0);
               }
            }
         }

         bz.c(this);
      } else {
         this.a(true);
      }

   }

   protected void debug(int var1) {
      super.debug(var1);
      String var2 = String.valueOf(e(var1));
      String var3 = String.valueOf(this.k);
      Log.d("View", (new StringBuilder(String.valueOf(var2).length() + 11 + String.valueOf(var3).length())).append(var2).append("mCurItem={").append(var3).append("}").toString());
      var3 = String.valueOf(e(var1));
      var2 = String.valueOf(this.j);
      Log.d("View", (new StringBuilder(String.valueOf(var3).length() + 11 + String.valueOf(var2).length())).append(var3).append("mAdapter={").append(var2).append("}").toString());
      var3 = String.valueOf(e(var1));
      int var4 = this.d;
      Log.d("View", (new StringBuilder(String.valueOf(var3).length() + 21)).append(var3).append("mRowCount=").append(var4).toString());
      var3 = String.valueOf(e(var1));
      var4 = this.e;
      Log.d("View", (new StringBuilder(String.valueOf(var3).length() + 31)).append(var3).append("mCurrentColumnCount=").append(var4).toString());
      int var5 = this.o.size();
      if (var5 != 0) {
         Log.d("View", String.valueOf(e(var1)).concat("mItems={"));
      }

      for(var4 = 0; var4 < var5; ++var4) {
         var2 = String.valueOf(e(var1 + 1));
         var3 = String.valueOf(this.o.b(var4));
         String var6 = String.valueOf(this.o.c(var4));
         Log.d("View", (new StringBuilder(String.valueOf(var2).length() + 4 + String.valueOf(var3).length() + String.valueOf(var6).length())).append(var2).append(var3).append(" => ").append(var6).toString());
      }

      if (var5 != 0) {
         Log.d("View", String.valueOf(e(var1)).concat("}"));
      }

   }

   public WindowInsets dispatchApplyWindowInsets(WindowInsets var1) {
      WindowInsets var2 = this.onApplyWindowInsets(var1);
      if (this.ab != null) {
         this.ab.onApplyWindowInsets(this, var2);
      }

      var1 = var2;
      if (this.f) {
         var1 = var2.consumeSystemWindowInsets();
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

   protected LayoutParams generateDefaultLayoutParams() {
      return new ah();
   }

   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return new ah(this.getContext(), var1);
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return this.generateDefaultLayoutParams();
   }

   public aa getAdapter() {
      return this.j;
   }

   public Point getCurrentItem() {
      return new Point(this.k);
   }

   public int getOffscreenPageCount() {
      return this.y;
   }

   public int getPageColumnMargin() {
      return this.v;
   }

   public int getPageRowMargin() {
      return this.u;
   }

   public WindowInsets onApplyWindowInsets(WindowInsets var1) {
      int var2 = this.getChildCount();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.getChildAt(var3).dispatchApplyWindowInsets(var1);
      }

      this.aa = var1;
      return var1;
   }

   public void onAttachedToWindow() {
      super.onAttachedToWindow();
      this.O = true;
      this.getParent().requestFitSystemWindows();
   }

   protected void onDetachedFromWindow() {
      this.removeCallbacks(this.h);
      super.onDetachedFromWindow();
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2 = true;
      int var3 = var1.getAction() & 255;
      if (var3 != 3 && var3 != 1) {
         if (var3 != 0) {
            if (this.z) {
               return var2;
            }

            if (!this.A) {
               var2 = false;
               return var2;
            }
         }

         switch(var3) {
         case 0:
            this.b(var1);
            break;
         case 2:
            this.c(var1);
            break;
         case 6:
            this.a(var1);
         }

         var2 = this.z;
      } else {
         this.z = false;
         this.A = false;
         this.I = -1;
         if (this.J != null) {
            this.J.recycle();
            this.J = null;
         }

         var2 = false;
      }

      return var2;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      var3 = this.getChildCount();

      for(var2 = 0; var2 < var3; ++var2) {
         View var6 = this.getChildAt(var2);
         ah var7 = (ah)var6.getLayoutParams();
         String var8;
         if (var7 == null) {
            var8 = String.valueOf(var6);
            Log.w("GridViewPager", (new StringBuilder(String.valueOf(var8).length() + 34)).append("Got null layout params for child: ").append(var8).toString());
         } else {
            ag var9 = this.a(var6);
            if (var9 == null) {
               var8 = String.valueOf(var6);
               Log.w("GridViewPager", (new StringBuilder(String.valueOf(var8).length() + 44)).append("Unknown child view, not claimed by adapter: ").append(var8).toString());
            } else {
               if (var7.b) {
                  var7.b = false;
                  this.a(var6, var7);
               }

               var4 = this.c(var9.b);
               var5 = this.d(var9.c);
               var4 = var4 - this.a(var9.c) + var7.leftMargin;
               var5 += var7.topMargin;
               var6.layout(var4, var5, var6.getMeasuredWidth() + var4, var6.getMeasuredHeight() + var5);
            }
         }
      }

      if (this.O && !this.o.isEmpty()) {
         this.a(this.k.x, this.k.y, false, 0, false);
      }

      this.O = false;
   }

   protected void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(getDefaultSize(0, var1), getDefaultSize(0, var2));
      this.w = true;
      this.e();
      this.w = false;
      var2 = this.getChildCount();

      for(var1 = 0; var1 < var2; ++var1) {
         View var3 = this.getChildAt(var1);
         if (var3.getVisibility() != 8) {
            ah var4 = (ah)var3.getLayoutParams();
            if (var4 != null) {
               this.a(var3, var4);
            }
         }
      }

   }

   public void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof GridViewPager$SavedState)) {
         super.onRestoreInstanceState(var1);
      } else {
         GridViewPager$SavedState var2 = (GridViewPager$SavedState)var1;
         super.onRestoreInstanceState(var2.getSuperState());
         if (this.i(var2.a, var2.b)) {
            this.l = new Point(var2.a, var2.b);
         } else {
            this.k.set(0, 0);
            this.scrollTo(0, 0);
         }
      }

   }

   public Parcelable onSaveInstanceState() {
      GridViewPager$SavedState var1 = new GridViewPager$SavedState(super.onSaveInstanceState());
      var1.a = this.k.x;
      var1.b = this.k.y;
      return var1;
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if (!this.o.isEmpty()) {
         this.a(var1, var3, var2, var4, this.v, this.v, this.u, this.u);
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2;
      if (this.j == null) {
         var2 = false;
      } else {
         int var3 = var1.getAction();
         switch(var3 & 255) {
         case 0:
            this.b(var1);
            break;
         case 1:
         case 3:
            this.d(var1);
            break;
         case 2:
            this.c(var1);
            break;
         case 4:
         case 5:
         default:
            Log.e("GridViewPager", (new StringBuilder(32)).append("Unknown action type: ").append(var3).toString());
            break;
         case 6:
            this.a(var1);
         }

         var2 = true;
      }

      return var2;
   }

   public void removeView(View var1) {
      this.a(var1);
      if (this.w) {
         this.removeViewInLayout(var1);
      } else {
         super.removeView(var1);
      }

   }

   public void requestFitSystemWindows() {
   }

   public void scrollTo(int var1, int var2) {
      int var3 = var1;
      if (this.S == 2) {
         var3 = var1;
         if (this.T == 1) {
            var3 = this.a(this.k.y);
         }
      }

      super.scrollTo(0, var2);
      this.b(var3);
   }

   public void setAdapter(aa var1) {
      if (this.j != null) {
         this.j.b((DataSetObserver)this.t);
         this.j.a((ad)null);
         this.j.b((ViewGroup)this);

         for(int var2 = 0; var2 < this.o.size(); ++var2) {
            ag var3 = (ag)this.o.c(var2);
            this.j.a(this, var3.c, var3.b, var3.a);
         }

         this.j.a((ViewGroup)this);
         this.o.clear();
         this.removeAllViews();
         this.scrollTo(0, 0);
         this.U.clear();
      }

      aa var5 = this.j;
      this.k.set(0, 0);
      this.j = var1;
      this.d = 0;
      this.e = 0;
      if (this.j != null) {
         if (this.t == null) {
            this.t = new ak(this, (ae)null);
         }

         this.j.a((DataSetObserver)this.t);
         this.j.a((ad)this.W);
         this.x = false;
         boolean var4 = this.O;
         this.O = true;
         this.d = this.j.a();
         if (this.d > 0) {
            this.k.set(0, 0);
            this.e = this.j.a(this.k.y);
         }

         if (this.l != null) {
            this.j.a(this.m, this.n);
            this.a(this.l.y, this.l.x, false, true);
            this.l = null;
            this.m = null;
            this.n = null;
         } else if (!var4) {
            this.e();
         } else {
            this.requestLayout();
         }
      } else if (this.z) {
         this.f();
      }

      if (var5 != var1) {
         if (var1 == null) {
            this.ac = false;
            this.a(var5, var1);
            this.ad = null;
         } else {
            this.ac = true;
            this.ad = var5;
         }
      } else {
         this.ac = false;
         this.ad = null;
      }

   }

   public void setConsumeWindowInsets(boolean var1) {
      this.f = var1;
   }

   public void setOffscreenPageCount(int var1) {
      int var2 = var1;
      if (var1 < 1) {
         Log.w("GridViewPager", (new StringBuilder(79)).append("Requested offscreen page limit ").append(var1).append(" too small; defaulting to ").append(1).toString());
         var2 = 1;
      }

      if (var2 != this.y) {
         this.y = var2;
         this.e();
      }

   }

   public void setOnAdapterChangeListener(ai var1) {
      this.R = var1;
      if (var1 != null && this.j != null && !this.ac) {
         var1.a((aa)null, this.j);
      }

   }

   public void setOnApplyWindowInsetsListener(OnApplyWindowInsetsListener var1) {
      this.ab = var1;
   }

   public void setOnPageChangeListener(aj var1) {
      this.Q = var1;
   }

   public void setSlideAnimationDuration(int var1) {
      this.g = var1;
   }
}
