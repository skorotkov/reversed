package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

public class dl extends ViewGroup implements android.support.v4.view.bm, android.support.v4.view.bs {
   static final Interpolator G;
   private static final int[] H = new int[]{16843830};
   private static final int[] I = new int[]{16842987};
   private static final boolean J;
   private static final boolean K;
   private static final boolean L;
   private static final Class[] M;
   static final boolean a;
   static final boolean b;
   static final boolean c;
   final ev A;
   boolean B;
   boolean C;
   boolean D;
   ez E;
   final List F;
   private final eo N;
   private ep O;
   private final Rect P;
   private final ArrayList Q;
   private ei R;
   private int S;
   private boolean T;
   private int U;
   private final AccessibilityManager V;
   private List W;
   private final int[] aA;
   private final int[] aB;
   private Runnable aC;
   private final gv aD;
   private int aa;
   private int ab;
   private android.support.v4.widget.i ac;
   private android.support.v4.widget.i ad;
   private android.support.v4.widget.i ae;
   private android.support.v4.widget.i af;
   private int ag;
   private int ah;
   private VelocityTracker ai;
   private int aj;
   private int ak;
   private int al;
   private int am;
   private int an;
   private eh ao;
   private final int ap;
   private final int aq;
   private float ar;
   private boolean as;
   private ej at;
   private List au;
   private dy av;
   private dv aw;
   private final int[] ax;
   private android.support.v4.view.bn ay;
   private final int[] az;
   final em d;
   ae e;
   bd f;
   final gt g;
   boolean h;
   final Runnable i;
   final Rect j;
   final RectF k;
   ds l;
   ec m;
   en n;
   final ArrayList o;
   boolean p;
   boolean q;
   boolean r;
   boolean s;
   boolean t;
   boolean u;
   boolean v;
   dw w;
   final ex x;
   cd y;
   cf z;

   static {
      boolean var0;
      if (VERSION.SDK_INT != 18 && VERSION.SDK_INT != 19 && VERSION.SDK_INT != 20) {
         var0 = false;
      } else {
         var0 = true;
      }

      a = var0;
      if (VERSION.SDK_INT >= 23) {
         var0 = true;
      } else {
         var0 = false;
      }

      b = var0;
      if (VERSION.SDK_INT >= 16) {
         var0 = true;
      } else {
         var0 = false;
      }

      c = var0;
      if (VERSION.SDK_INT >= 21) {
         var0 = true;
      } else {
         var0 = false;
      }

      J = var0;
      if (VERSION.SDK_INT <= 15) {
         var0 = true;
      } else {
         var0 = false;
      }

      K = var0;
      if (VERSION.SDK_INT <= 15) {
         var0 = true;
      } else {
         var0 = false;
      }

      L = var0;
      M = new Class[]{Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE};
      G = new doClass();
   }

   public dl(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public dl(Context var1, AttributeSet var2) {
      this(var1, var2, 0);
   }

   public dl(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      boolean var4 = true;
      this.N = new eo(this);
      this.d = new em(this);
      this.g = new gt();
      this.i = new dm(this);
      this.j = new Rect();
      this.P = new Rect();
      this.k = new RectF();
      this.o = new ArrayList();
      this.Q = new ArrayList();
      this.S = 0;
      this.v = false;
      this.aa = 0;
      this.ab = 0;
      this.w = new bi();
      this.ag = 0;
      this.ah = -1;
      this.ar = Float.MIN_VALUE;
      this.as = true;
      this.x = new ex(this);
      cf var5;
      if (J) {
         var5 = new cf();
      } else {
         var5 = null;
      }

      this.z = var5;
      this.A = new ev();
      this.B = false;
      this.C = false;
      this.av = new ea(this);
      this.D = false;
      this.ax = new int[2];
      this.az = new int[2];
      this.aA = new int[2];
      this.aB = new int[2];
      this.F = new ArrayList();
      this.aC = new dn(this);
      this.aD = new dp(this);
      TypedArray var9;
      if (var2 != null) {
         var9 = var1.obtainStyledAttributes(var2, I, var3, 0);
         this.h = var9.getBoolean(0, true);
         var9.recycle();
      } else {
         this.h = true;
      }

      this.setScrollContainer(true);
      this.setFocusableInTouchMode(true);
      ViewConfiguration var10 = ViewConfiguration.get(var1);
      this.an = var10.getScaledTouchSlop();
      this.ap = var10.getScaledMinimumFlingVelocity();
      this.aq = var10.getScaledMaximumFlingVelocity();
      boolean var6;
      if (this.getOverScrollMode() == 2) {
         var6 = true;
      } else {
         var6 = false;
      }

      this.setWillNotDraw(var6);
      this.w.a(this.av);
      this.a();
      this.A();
      if (android.support.v4.view.bz.d(this) == 0) {
         android.support.v4.view.bz.c(this, 1);
      }

      this.V = (AccessibilityManager)this.getContext().getSystemService("accessibility");
      this.setAccessibilityDelegateCompat(new ez(this));
      if (var2 != null) {
         var9 = var1.obtainStyledAttributes(var2, android.support.v7.d.b.RecyclerView, var3, 0);
         String var7 = var9.getString(android.support.v7.d.b.RecyclerView_layoutManager);
         if (var9.getInt(android.support.v7.d.b.RecyclerView_android_descendantFocusability, -1) == -1) {
            this.setDescendantFocusability(262144);
         }

         var9.recycle();
         this.a(var1, var7, var2, var3, 0);
         var6 = var4;
         if (VERSION.SDK_INT >= 21) {
            TypedArray var8 = var1.obtainStyledAttributes(var2, H, var3, 0);
            var6 = var8.getBoolean(0, true);
            var8.recycle();
         }
      } else {
         this.setDescendantFocusability(ViewGroup.FOCUS_AFTER_DESCENDANTS);
         var6 = var4;
      }

      this.setNestedScrollingEnabled(var6);
   }

   private void A() {
      this.f = new bd(new dq(this));
   }

   private boolean B() {
      boolean var1 = false;
      int var2 = this.f.b();
      int var3 = 0;

      boolean var4;
      while(true) {
         var4 = var1;
         if (var3 >= var2) {
            break;
         }

         ey var5 = e(this.f.b(var3));
         if (var5 != null && !var5.c() && var5.y()) {
            var4 = true;
            break;
         }

         ++var3;
      }

      return var4;
   }

   private void C() {
      this.x.b();
      if (this.m != null) {
         this.m.L();
      }

   }

   private void D() {
      boolean var1 = false;
      if (this.ac != null) {
         var1 = this.ac.c();
      }

      boolean var2 = var1;
      if (this.ad != null) {
         var2 = var1 | this.ad.c();
      }

      var1 = var2;
      if (this.ae != null) {
         var1 = var2 | this.ae.c();
      }

      var2 = var1;
      if (this.af != null) {
         var2 = var1 | this.af.c();
      }

      if (var2) {
         android.support.v4.view.bz.c(this);
      }

   }

   private void E() {
      if (this.ai != null) {
         this.ai.clear();
      }

      this.stopNestedScroll();
      this.D();
   }

   private void F() {
      this.E();
      this.setScrollState(0);
   }

   private void G() {
      int var1 = this.U;
      this.U = 0;
      if (var1 != 0 && this.n()) {
         AccessibilityEvent var2 = AccessibilityEvent.obtain();
         var2.setEventType(2048);
         android.support.v4.view.a.a.a(var2, var1);
         this.sendAccessibilityEventUnchecked(var2);
      }

   }

   private boolean H() {
      boolean var1;
      if (this.w != null && this.m.b()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   private void I() {
      boolean var1 = true;
      if (this.v) {
         this.e.a();
         this.m.a(this);
      }

      if (this.H()) {
         this.e.b();
      } else {
         this.e.e();
      }

      boolean var2;
      if (!this.B && !this.C) {
         var2 = false;
      } else {
         var2 = true;
      }

      ev var3 = this.A;
      boolean var4;
      if (this.r && this.w != null && (this.v || var2 || this.m.s) && (!this.v || this.l.b())) {
         var4 = true;
      } else {
         var4 = false;
      }

      var3.i = var4;
      var3 = this.A;
      if (this.A.i && var2 && !this.v && this.H()) {
         var4 = var1;
      } else {
         var4 = false;
      }

      var3.j = var4;
   }

   private void J() {
      View var1;
      if (this.as && this.hasFocus() && this.l != null) {
         var1 = this.getFocusedChild();
      } else {
         var1 = null;
      }

      ey var6;
      if (var1 == null) {
         var6 = null;
      } else {
         var6 = this.d(var1);
      }

      if (var6 == null) {
         this.K();
      } else {
         ev var2 = this.A;
         long var3;
         if (this.l.b()) {
            var3 = var6.h();
         } else {
            var3 = -1L;
         }

         var2.l = var3;
         var2 = this.A;
         int var5;
         if (this.v) {
            var5 = -1;
         } else if (var6.r()) {
            var5 = var6.d;
         } else {
            var5 = var6.f();
         }

         var2.k = var5;
         this.A.m = this.o(var6.a);
      }

   }

   private void K() {
      this.A.l = -1L;
      this.A.k = -1;
      this.A.m = -1;
   }

   private View L() {
      int var1;
      if (this.A.k != -1) {
         var1 = this.A.k;
      } else {
         var1 = 0;
      }

      int var2 = this.A.e();
      int var3 = var1;

      View var5;
      while(true) {
         ey var4;
         if (var3 < var2) {
            var4 = this.e(var3);
            if (var4 != null) {
               if (var4.a.hasFocusable()) {
                  var5 = var4.a;
                  break;
               }

               ++var3;
               continue;
            }
         }

         for(var1 = Math.min(var2, var1) - 1; var1 >= 0; --var1) {
            var4 = this.e(var1);
            if (var4 == null) {
               var5 = null;
               return var5;
            }

            if (var4.a.hasFocusable()) {
               var5 = var4.a;
               return var5;
            }
         }

         var5 = null;
         break;
      }

      return var5;
   }

   private void M() {
      View var1 = null;
      if (this.as && this.l != null && this.hasFocus() && this.getDescendantFocusability() != 393216 && (this.getDescendantFocusability() != 131072 || !this.isFocused())) {
         View var2;
         if (!this.isFocused()) {
            var2 = this.getFocusedChild();
            if (L && (var2.getParent() == null || !var2.hasFocus())) {
               if (this.f.b() == 0) {
                  this.requestFocus();
                  return;
               }
            } else if (!this.f.c(var2)) {
               return;
            }
         }

         ey var3;
         if (this.A.l != -1L && this.l.b()) {
            var3 = this.a(this.A.l);
         } else {
            var3 = null;
         }

         if (var3 != null && !this.f.c(var3.a) && var3.a.hasFocusable()) {
            var2 = var3.a;
         } else {
            var2 = var1;
            if (this.f.b() > 0) {
               var2 = this.L();
            }
         }

         if (var2 != null) {
            if ((long)this.A.m != -1L) {
               var1 = var2.findViewById(this.A.m);
               if (var1 != null && var1.isFocusable()) {
                  var2 = var1;
               }
            }

            var2.requestFocus();
         }
      }

   }

   private void N() {
      boolean var1 = true;
      this.A.a(1);
      this.A.h = false;
      this.d();
      this.g.a();
      this.l();
      this.I();
      this.J();
      ev var2 = this.A;
      if (!this.A.i || !this.C) {
         var1 = false;
      }

      var2.g = var1;
      this.C = false;
      this.B = false;
      this.A.f = this.A.j;
      this.A.d = this.l.a();
      this.a(this.ax);
      int var3;
      int var4;
      if (this.A.i) {
         var3 = this.f.b();

         for(var4 = 0; var4 < var3; ++var4) {
            ey var9 = e(this.f.b(var4));
            if (!var9.c() && (!var9.o() || this.l.b())) {
               dz var5 = this.w.a(this.A, var9, dw.e(var9), var9.v());
               this.g.a(var9, var5);
               if (this.A.g && var9.y() && !var9.r() && !var9.c() && !var9.o()) {
                  long var6 = this.a(var9);
                  this.g.a(var6, var9);
               }
            }
         }
      }

      if (this.A.j) {
         this.s();
         var1 = this.A.e;
         this.A.e = false;
         this.m.c(this.d, this.A);
         this.A.e = var1;

         for(var4 = 0; var4 < this.f.b(); ++var4) {
            ey var11 = e(this.f.b(var4));
            if (!var11.c() && !this.g.d(var11)) {
               int var8 = dw.e(var11);
               var1 = var11.a(8192);
               var3 = var8;
               if (!var1) {
                  var3 = var8 | 4096;
               }

               dz var10 = this.w.a(this.A, var11, var3, var11.v());
               if (var1) {
                  this.a(var11, var10);
               } else {
                  this.g.b(var11, var10);
               }
            }
         }

         this.t();
      } else {
         this.t();
      }

      this.m();
      this.a(false);
      this.A.c = 2;
   }

   private void O() {
      this.d();
      this.l();
      this.A.a(6);
      this.e.e();
      this.A.d = this.l.a();
      this.A.b = 0;
      this.A.f = false;
      this.m.c(this.d, this.A);
      this.A.e = false;
      this.O = null;
      ev var1 = this.A;
      boolean var2;
      if (this.A.i && this.w != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      var1.i = var2;
      this.A.c = 4;
      this.m();
      this.a(false);
   }

   private void P() {
      this.A.a(4);
      this.d();
      this.l();
      this.A.c = 1;
      if (this.A.i) {
         for(int var1 = this.f.b() - 1; var1 >= 0; --var1) {
            ey var2 = e(this.f.b(var1));
            if (!var2.c()) {
               long var3 = this.a(var2);
               dz var5 = this.w.a(this.A, var2);
               ey var6 = this.g.a(var3);
               if (var6 != null && !var6.c()) {
                  boolean var7 = this.g.a(var6);
                  boolean var8 = this.g.a(var2);
                  if (var7 && var6 == var2) {
                     this.g.c(var2, var5);
                  } else {
                     dz var9 = this.g.b(var6);
                     this.g.c(var2, var5);
                     var5 = this.g.c(var2);
                     if (var9 == null) {
                        this.a(var3, var2, var6);
                     } else {
                        this.a(var6, var2, var9, var5, var7, var8);
                     }
                  }
               } else {
                  this.g.c(var2, var5);
               }
            }
         }

         this.g.a(this.aD);
      }

      this.m.b(this.d);
      this.A.a = this.A.d;
      this.v = false;
      this.A.i = false;
      this.A.j = false;
      this.m.s = false;
      if (this.d.b != null) {
         this.d.b.clear();
      }

      if (this.m.w) {
         this.m.v = 0;
         this.m.w = false;
         this.d.b();
      }

      this.m.a(this.A);
      this.m();
      this.a(false);
      this.g.a();
      if (this.j(this.ax[0], this.ax[1])) {
         this.i(0, 0);
      }

      this.M();
      this.K();
   }

   private String a(Context var1, String var2) {
      String var3;
      if (var2.charAt(0) == '.') {
         var3 = var1.getPackageName() + var2;
      } else {
         var3 = var2;
         if (!var2.contains(".")) {
            var3 = dl.class.getPackage().getName() + '.' + var2;
         }
      }

      return var3;
   }

   private void a(float var1, float var2, float var3, float var4) {
      boolean var5 = true;
      boolean var6 = false;
      boolean var7;
      if (var2 < 0.0F) {
         this.g();
         var7 = var6;
         if (this.ac.a(-var2 / (float)this.getWidth(), 1.0F - var3 / (float)this.getHeight())) {
            var7 = true;
         }
      } else {
         var7 = var6;
         if (var2 > 0.0F) {
            this.h();
            var7 = var6;
            if (this.ae.a(var2 / (float)this.getWidth(), var3 / (float)this.getHeight())) {
               var7 = true;
            }
         }
      }

      label35: {
         if (var4 < 0.0F) {
            this.i();
            if (this.ad.a(-var4 / (float)this.getHeight(), var1 / (float)this.getWidth())) {
               break label35;
            }
         } else if (var4 > 0.0F) {
            this.j();
            if (this.af.a(var4 / (float)this.getHeight(), 1.0F - var1 / (float)this.getWidth())) {
               break label35;
            }
         }

         var5 = var7;
      }

      if (var5 || var2 != 0.0F || var4 != 0.0F) {
         android.support.v4.view.bz.c(this);
      }

   }

   private void a(long var1, ey var3, ey var4) {
      int var5 = this.f.b();

      for(int var6 = 0; var6 < var5; ++var6) {
         ey var7 = e(this.f.b(var6));
         if (var7 != var3 && this.a(var7) == var1) {
            if (this.l != null && this.l.b()) {
               throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + var7 + " \n View Holder 2:" + var3);
            }

            throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + var7 + " \n View Holder 2:" + var3);
         }
      }

      Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + var4 + " cannot be found but it is necessary for " + var3);
   }

   private void a(Context param1, String param2, AttributeSet param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static void a(dl var0, int var1) {
      var0.detachViewFromParent(var1);
   }

   // $FF: synthetic method
   static void a(dl var0, int var1, int var2) {
      var0.setMeasuredDimension(var1, var2);
   }

   // $FF: synthetic method
   static void a(dl var0, View var1, int var2, LayoutParams var3) {
      var0.attachViewToParent(var1, var2, var3);
   }

   private void a(ds var1, boolean var2, boolean var3) {
      if (this.l != null) {
         this.l.b((du)this.N);
         this.l.b(this);
      }

      if (!var2 || var3) {
         this.b();
      }

      this.e.a();
      ds var4 = this.l;
      this.l = var1;
      if (var1 != null) {
         var1.a((du)this.N);
         var1.a(this);
      }

      if (this.m != null) {
         this.m.a(var4, this.l);
      }

      this.d.a(var4, this.l, var2);
      this.A.e = true;
      this.v();
   }

   private void a(ey var1, ey var2, dz var3, dz var4, boolean var5, boolean var6) {
      var1.a(false);
      if (var5) {
         this.e(var1);
      }

      if (var1 != var2) {
         if (var6) {
            this.e(var2);
         }

         var1.h = var2;
         this.e(var1);
         this.d.c(var1);
         var2.a(false);
         var2.i = var1;
      }

      if (this.w.a(var1, var2, var3, var4)) {
         this.p();
      }

   }

   static void a(View var0, Rect var1) {
      ef var2 = (ef)var0.getLayoutParams();
      Rect var3 = var2.d;
      int var4 = var0.getLeft();
      int var5 = var3.left;
      int var6 = var2.leftMargin;
      int var7 = var0.getTop();
      int var8 = var3.top;
      int var9 = var2.topMargin;
      int var10 = var0.getRight();
      int var11 = var3.right;
      int var12 = var2.rightMargin;
      int var13 = var0.getBottom();
      int var14 = var3.bottom;
      var1.set(var4 - var5 - var6, var7 - var8 - var9, var10 + var11 + var12, var2.bottomMargin + var14 + var13);
   }

   private void a(int[] var1) {
      int var2 = this.f.b();
      if (var2 == 0) {
         var1[0] = -1;
         var1[1] = -1;
      } else {
         int var3 = Integer.MAX_VALUE;
         int var4 = Integer.MIN_VALUE;

         for(int var5 = 0; var5 < var2; ++var5) {
            ey var6 = e(this.f.b(var5));
            if (!var6.c()) {
               int var7 = var6.e();
               int var8 = var3;
               if (var7 < var3) {
                  var8 = var7;
               }

               if (var7 > var4) {
                  var4 = var7;
                  var3 = var8;
               } else {
                  var3 = var8;
               }
            }
         }

         var1[0] = var3;
         var1[1] = var4;
      }

   }

   // $FF: synthetic method
   static boolean a(dl var0) {
      return var0.awakenScrollBars();
   }

   private boolean a(MotionEvent var1) {
      int var2 = var1.getAction();
      if (var2 == 3 || var2 == 0) {
         this.R = null;
      }

      int var3 = this.Q.size();
      int var4 = 0;

      boolean var6;
      while(true) {
         if (var4 >= var3) {
            var6 = false;
            break;
         }

         ei var5 = (ei)this.Q.get(var4);
         if (var5.a(this, var1) && var2 != 3) {
            this.R = var5;
            var6 = true;
            break;
         }

         ++var4;
      }

      return var6;
   }

   private boolean a(View var1, View var2, int var3) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = var5;
      if (var2 != null) {
         if (var2 == this) {
            var6 = var5;
         } else if (var1 == null) {
            var6 = true;
         } else if (var3 != 2 && var3 != 1) {
            var6 = this.b(var1, var2, var3);
         } else {
            boolean var7;
            if (this.m.v() == 1) {
               var7 = true;
            } else {
               var7 = false;
            }

            if (var3 == 2) {
               var4 = true;
            }

            byte var8;
            if (var4 ^ var7) {
               var8 = 66;
            } else {
               var8 = 17;
            }

            if (this.b(var1, var2, var8)) {
               var6 = true;
            } else if (var3 == 2) {
               var6 = this.b(var1, var2, 130);
            } else {
               var6 = this.b(var1, var2, 33);
            }
         }
      }

      return var6;
   }

   private boolean b(MotionEvent var1) {
      int var2 = var1.getAction();
      boolean var5;
      if (this.R != null) {
         if (var2 != 0) {
            this.R.b(this, var1);
            if (var2 == 3 || var2 == 1) {
               this.R = null;
            }

            var5 = true;
            return var5;
         }

         this.R = null;
      }

      if (var2 != 0) {
         int var3 = this.Q.size();

         for(var2 = 0; var2 < var3; ++var2) {
            ei var4 = (ei)this.Q.get(var2);
            if (var4.a(this, var1)) {
               this.R = var4;
               var5 = true;
               return var5;
            }
         }
      }

      var5 = false;
      return var5;
   }

   private boolean b(View var1, View var2, int var3) {
      boolean var4 = true;
      this.j.set(0, 0, var1.getWidth(), var1.getHeight());
      this.P.set(0, 0, var2.getWidth(), var2.getHeight());
      this.offsetDescendantRectToMyCoords(var1, this.j);
      this.offsetDescendantRectToMyCoords(var2, this.P);
      switch(var3) {
      case 17:
         if (this.j.right <= this.P.right && this.j.left < this.P.right || this.j.left <= this.P.left) {
            var4 = false;
         }
         break;
      case 33:
         if (this.j.bottom <= this.P.bottom && this.j.top < this.P.bottom || this.j.top <= this.P.top) {
            var4 = false;
         }
         break;
      case 66:
         if (this.j.left >= this.P.left && this.j.right > this.P.left || this.j.right >= this.P.right) {
            var4 = false;
         }
         break;
      case 130:
         if (this.j.top >= this.P.top && this.j.bottom > this.P.top || this.j.bottom >= this.P.bottom) {
            var4 = false;
         }
         break;
      default:
         throw new IllegalArgumentException("direction must be absolute. received:" + var3);
      }

      return var4;
   }

   static void c(ey var0) {
      if (var0.b != null) {
         View var1 = (View)var0.b.get();

         while(true) {
            if (var1 == null) {
               var0.b = null;
               break;
            }

            if (var1 == var0.a) {
               break;
            }

            ViewParent var2 = var1.getParent();
            if (var2 instanceof View) {
               var1 = (View)var2;
            } else {
               var1 = null;
            }
         }
      }

   }

   private void c(MotionEvent var1) {
      int var2 = android.support.v4.view.bg.b(var1);
      if (var1.getPointerId(var2) == this.ah) {
         byte var4;
         if (var2 == 0) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         this.ah = var1.getPointerId(var4);
         int var3 = (int)(var1.getX(var4) + 0.5F);
         this.al = var3;
         this.aj = var3;
         var2 = (int)(var1.getY(var4) + 0.5F);
         this.am = var2;
         this.ak = var2;
      }

   }

   static ey e(View var0) {
      ey var1;
      if (var0 == null) {
         var1 = null;
      } else {
         var1 = ((ef)var0.getLayoutParams()).c;
      }

      return var1;
   }

   private void e(ey var1) {
      View var2 = var1.a;
      boolean var3;
      if (var2.getParent() == this) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.d.c(this.b(var2));
      if (var1.s()) {
         this.f.a(var2, -1, var2.getLayoutParams(), true);
      } else if (!var3) {
         this.f.a(var2, true);
      } else {
         this.f.d(var2);
      }

   }

   private float getScrollFactor() {
      float var2;
      if (this.ar == Float.MIN_VALUE) {
         TypedValue var1 = new TypedValue();
         if (!this.getContext().getTheme().resolveAttribute(16842829, var1, true)) {
            var2 = 0.0F;
            return var2;
         }

         this.ar = var1.getDimension(this.getContext().getResources().getDisplayMetrics());
      }

      var2 = this.ar;
      return var2;
   }

   private android.support.v4.view.bn getScrollingChildHelper() {
      if (this.ay == null) {
         this.ay = new android.support.v4.view.bn(this);
      }

      return this.ay;
   }

   private boolean j(int var1, int var2) {
      boolean var3 = false;
      this.a(this.ax);
      if (this.ax[0] != var1 || this.ax[1] != var2) {
         var3 = true;
      }

      return var3;
   }

   static dl l(View var0) {
      dl var4;
      if (!(var0 instanceof ViewGroup)) {
         var4 = null;
      } else if (var0 instanceof dl) {
         var4 = (dl)var0;
      } else {
         ViewGroup var1 = (ViewGroup)var0;
         int var2 = var1.getChildCount();
         int var3 = 0;

         while(true) {
            if (var3 >= var2) {
               var4 = null;
               break;
            }

            var4 = l(var1.getChildAt(var3));
            if (var4 != null) {
               break;
            }

            ++var3;
         }
      }

      return var4;
   }

   private int o(View var1) {
      int var2 = var1.getId();

      while(!var1.isFocused() && var1 instanceof ViewGroup && var1.hasFocus()) {
         var1 = ((ViewGroup)var1).getFocusedChild();
         if (var1.getId() != -1) {
            var2 = var1.getId();
         }
      }

      return var2;
   }

   // $FF: synthetic method
   static boolean z() {
      return J;
   }

   long a(ey var1) {
      long var2;
      if (this.l.b()) {
         var2 = var1.h();
      } else {
         var2 = (long)var1.c;
      }

      return var2;
   }

   ey a(int var1, boolean var2) {
      int var3 = this.f.c();
      int var4 = 0;

      ey var5;
      ey var7;
      for(var5 = null; var4 < var3; var5 = var7) {
         ey var6 = e(this.f.d(var4));
         var7 = var5;
         if (var6 != null) {
            var7 = var5;
            if (!var6.r()) {
               label34: {
                  if (var2) {
                     if (var6.c != var1) {
                        var7 = var5;
                        break label34;
                     }
                  } else {
                     var7 = var5;
                     if (var6.e() != var1) {
                        break label34;
                     }
                  }

                  var5 = var6;
                  if (!this.f.c(var6.a)) {
                     break;
                  }

                  var7 = var6;
               }
            }
         }

         ++var4;
      }

      return var5;
   }

   public ey a(long var1) {
      ey var3 = null;
      ey var4 = var3;
      if (this.l != null) {
         if (!this.l.b()) {
            var4 = var3;
         } else {
            int var5 = this.f.c();
            int var6 = 0;

            for(var4 = null; var6 < var5; ++var6) {
               var3 = e(this.f.d(var6));
               if (var3 != null && !var3.r() && var3.h() == var1) {
                  var4 = var3;
                  if (!this.f.c(var3.a)) {
                     break;
                  }

                  var4 = var3;
               }
            }
         }
      }

      return var4;
   }

   public View a(float var1, float var2) {
      int var3 = this.f.b() - 1;

      View var4;
      while(true) {
         if (var3 < 0) {
            var4 = null;
            break;
         }

         var4 = this.f.b(var3);
         float var5 = android.support.v4.view.bz.k(var4);
         float var6 = android.support.v4.view.bz.l(var4);
         if (var1 >= (float)var4.getLeft() + var5 && var1 <= var5 + (float)var4.getRight() && var2 >= (float)var4.getTop() + var6 && var2 <= (float)var4.getBottom() + var6) {
            break;
         }

         --var3;
      }

      return var4;
   }

   void a() {
      this.e = new ae(new dr(this));
   }

   public void a(int var1, int var2) {
      this.a(var1, var2, (Interpolator)null);
   }

   public void a(int var1, int var2, Interpolator var3) {
      byte var4 = 0;
      if (this.m == null) {
         Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      } else if (!this.t) {
         if (!this.m.d()) {
            var1 = 0;
         }

         if (!this.m.e()) {
            var2 = var4;
         }

         if (var1 != 0 || var2 != 0) {
            this.x.a(var1, var2, var3);
         }
      }

   }

   void a(int var1, int var2, Object var3) {
      int var4 = this.f.c();

      for(int var5 = 0; var5 < var4; ++var5) {
         View var6 = this.f.d(var5);
         ey var7 = e(var6);
         if (var7 != null && !var7.c() && var7.c >= var1 && var7.c < var1 + var2) {
            var7.b(2);
            var7.a(var3);
            ((ef)var6.getLayoutParams()).e = true;
         }
      }

      this.d.c(var1, var2);
   }

   void a(int var1, int var2, boolean var3) {
      int var4 = this.f.c();

      for(int var5 = 0; var5 < var4; ++var5) {
         ey var6 = e(this.f.d(var5));
         if (var6 != null && !var6.c()) {
            if (var6.c >= var1 + var2) {
               var6.a(-var2, var3);
               this.A.e = true;
            } else if (var6.c >= var1) {
               var6.a(var1 - 1, -var2, var3);
               this.A.e = true;
            }
         }
      }

      this.d.a(var1, var2, var3);
      this.requestLayout();
   }

   public void a(eb var1) {
      this.a((eb)var1, -1);
   }

   public void a(eb var1, int var2) {
      if (this.m != null) {
         this.m.a("Cannot add item decoration during a scroll  or layout");
      }

      if (this.o.isEmpty()) {
         this.setWillNotDraw(false);
      }

      if (var2 < 0) {
         this.o.add(var1);
      } else {
         this.o.add(var2, var1);
      }

      this.r();
      this.requestLayout();
   }

   public void a(ei var1) {
      this.Q.add(var1);
   }

   public void a(ej var1) {
      if (this.au == null) {
         this.au = new ArrayList();
      }

      this.au.add(var1);
   }

   void a(ey var1, dz var2) {
      var1.a(0, 8192);
      if (this.A.g && var1.y() && !var1.r() && !var1.c()) {
         long var3 = this.a(var1);
         this.g.a(var3, var1);
      }

      this.g.a(var1, var2);
   }

   void a(ey var1, dz var2, dz var3) {
      var1.a(false);
      if (this.w.b(var1, var2, var3)) {
         this.p();
      }

   }

   void a(String var1) {
      if (this.o()) {
         if (var1 == null) {
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
         } else {
            throw new IllegalStateException(var1);
         }
      } else {
         if (this.ab > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks might be run during a measure & layout pass where you cannot change the RecyclerView data. Any method call that might change the structure of the RecyclerView or the adapter contents should be postponed to the next frame.", new IllegalStateException(""));
         }

      }
   }

   void a(boolean var1) {
      if (this.S < 1) {
         this.S = 1;
      }

      if (!var1) {
         this.s = false;
      }

      if (this.S == 1) {
         if (var1 && this.s && !this.t && this.m != null && this.l != null) {
            this.q();
         }

         if (!this.t) {
            this.s = false;
         }
      }

      --this.S;
   }

   boolean a(int var1, int var2, MotionEvent var3) {
      boolean var4 = false;
      this.c();
      int var5;
      int var6;
      int var7;
      int var8;
      if (this.l != null) {
         this.d();
         this.l();
         android.support.v4.f.i.a("RV Scroll");
         if (var1 != 0) {
            var5 = this.m.a(var1, this.d, this.A);
            var6 = var1 - var5;
         } else {
            var5 = 0;
            var6 = 0;
         }

         if (var2 != 0) {
            var7 = this.m.b(var2, this.d, this.A);
            var8 = var2 - var7;
         } else {
            var7 = 0;
            var8 = 0;
         }

         android.support.v4.f.i.a();
         this.x();
         this.m();
         this.a(false);
      } else {
         var7 = 0;
         var5 = 0;
         var8 = 0;
         var6 = 0;
      }

      if (!this.o.isEmpty()) {
         this.invalidate();
      }

      if (this.dispatchNestedScroll(var5, var7, var6, var8, this.az)) {
         this.al -= this.az[0];
         this.am -= this.az[1];
         if (var3 != null) {
            var3.offsetLocation((float)this.az[0], (float)this.az[1]);
         }

         int[] var9 = this.aB;
         var9[0] += this.az[0];
         var9 = this.aB;
         var9[1] += this.az[1];
      } else if (this.getOverScrollMode() != 2) {
         if (var3 != null) {
            this.a(var3.getX(), (float)var6, var3.getY(), (float)var8);
         }

         this.c(var1, var2);
      }

      if (var5 != 0 || var7 != 0) {
         this.i(var5, var7);
      }

      if (!this.awakenScrollBars()) {
         this.invalidate();
      }

      if (var5 != 0 || var7 != 0) {
         var4 = true;
      }

      return var4;
   }

   boolean a(ey var1, int var2) {
      boolean var3;
      if (this.o()) {
         var1.l = var2;
         this.F.add(var1);
         var3 = false;
      } else {
         android.support.v4.view.bz.c(var1.a, var2);
         var3 = true;
      }

      return var3;
   }

   boolean a(View var1) {
      this.d();
      boolean var2 = this.f.f(var1);
      if (var2) {
         ey var4 = e(var1);
         this.d.c(var4);
         this.d.b(var4);
      }

      boolean var3;
      if (!var2) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.a(var3);
      return var2;
   }

   boolean a(AccessibilityEvent var1) {
      boolean var2 = false;
      byte var3 = 0;
      if (this.o()) {
         int var4;
         if (var1 != null) {
            var4 = android.support.v4.view.a.a.b(var1);
         } else {
            var4 = 0;
         }

         if (var4 == 0) {
            var4 = var3;
         }

         this.U |= var4;
         var2 = true;
      }

      return var2;
   }

   public void a_(int var1) {
      if (!this.t) {
         this.f();
         if (this.m == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
         } else {
            this.m.e(var1);
            this.awakenScrollBars();
         }
      }

   }

   public void addFocusables(ArrayList var1, int var2, int var3) {
      if (this.m == null || !this.m.a(this, var1, var2, var3)) {
         super.addFocusables(var1, var2, var3);
      }

   }

   public ey b(View var1) {
      ViewParent var2 = var1.getParent();
      if (var2 != null && var2 != this) {
         throw new IllegalArgumentException("View " + var1 + " is not a direct child of " + this);
      } else {
         return e(var1);
      }
   }

   void b() {
      if (this.w != null) {
         this.w.d();
      }

      if (this.m != null) {
         this.m.c(this.d);
         this.m.b(this.d);
      }

      this.d.a();
   }

   void b(int var1) {
      if (this.m != null) {
         this.m.e(var1);
         this.awakenScrollBars();
      }

   }

   void b(ey var1, dz var2, dz var3) {
      this.e(var1);
      var1.a(false);
      if (this.w.a(var1, var2, var3)) {
         this.p();
      }

   }

   public boolean b(int var1, int var2) {
      boolean var3 = false;
      boolean var4;
      if (this.m == null) {
         Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
         var4 = var3;
      } else {
         var4 = var3;
         if (!this.t) {
            boolean var5;
            boolean var6;
            int var7;
            label49: {
               var5 = this.m.d();
               var6 = this.m.e();
               if (var5) {
                  var7 = var1;
                  if (Math.abs(var1) >= this.ap) {
                     break label49;
                  }
               }

               var7 = 0;
            }

            label44: {
               if (var6) {
                  var1 = var2;
                  if (Math.abs(var2) >= this.ap) {
                     break label44;
                  }
               }

               var1 = 0;
            }

            if (var7 == 0) {
               var4 = var3;
               if (var1 == 0) {
                  return var4;
               }
            }

            var4 = var3;
            if (!this.dispatchNestedPreFling((float)var7, (float)var1)) {
               if (!var5 && !var6) {
                  var5 = false;
               } else {
                  var5 = true;
               }

               this.dispatchNestedFling((float)var7, (float)var1, var5);
               if (this.ao != null && this.ao.a(var7, var1)) {
                  var4 = true;
               } else {
                  var4 = var3;
                  if (var5) {
                     var2 = Math.max(-this.aq, Math.min(var7, this.aq));
                     var1 = Math.max(-this.aq, Math.min(var1, this.aq));
                     this.x.a(var2, var1);
                     var4 = true;
                  }
               }
            }
         }
      }

      return var4;
   }

   boolean b(ey var1) {
      boolean var2;
      if (this.w != null && !this.w.a(var1, var1.v())) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public View c(View var1) {
      ViewParent var2;
      for(var2 = var1.getParent(); var2 != null && var2 != this && var2 instanceof View; var2 = var1.getParent()) {
         var1 = (View)var2;
      }

      if (var2 != this) {
         var1 = null;
      }

      return var1;
   }

   void c() {
      if (this.r && !this.v) {
         if (this.e.d()) {
            if (this.e.a(4) && !this.e.a(11)) {
               android.support.v4.f.i.a("RV PartialInvalidate");
               this.d();
               this.l();
               this.e.b();
               if (!this.s) {
                  if (this.B()) {
                     this.q();
                  } else {
                     this.e.c();
                  }
               }

               this.a(true);
               this.m();
               android.support.v4.f.i.a();
            } else if (this.e.d()) {
               android.support.v4.f.i.a("RV FullInvalidate");
               this.q();
               android.support.v4.f.i.a();
            }
         }
      } else {
         android.support.v4.f.i.a("RV FullInvalidate");
         this.q();
         android.support.v4.f.i.a();
      }

   }

   public void c(int var1) {
      if (!this.t) {
         if (this.m == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
         } else {
            this.m.a(this, this.A, var1);
         }
      }

   }

   void c(int var1, int var2) {
      boolean var3 = false;
      boolean var4 = var3;
      if (this.ac != null) {
         var4 = var3;
         if (!this.ac.a()) {
            var4 = var3;
            if (var1 > 0) {
               var4 = this.ac.c();
            }
         }
      }

      var3 = var4;
      if (this.ae != null) {
         var3 = var4;
         if (!this.ae.a()) {
            var3 = var4;
            if (var1 < 0) {
               var3 = var4 | this.ae.c();
            }
         }
      }

      var4 = var3;
      if (this.ad != null) {
         var4 = var3;
         if (!this.ad.a()) {
            var4 = var3;
            if (var2 > 0) {
               var4 = var3 | this.ad.c();
            }
         }
      }

      var3 = var4;
      if (this.af != null) {
         var3 = var4;
         if (!this.af.a()) {
            var3 = var4;
            if (var2 < 0) {
               var3 = var4 | this.af.c();
            }
         }
      }

      if (var3) {
         android.support.v4.view.bz.c(this);
      }

   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      boolean var2;
      if (var1 instanceof ef && this.m.a((ef)var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public int computeHorizontalScrollExtent() {
      int var1 = 0;
      if (this.m != null && this.m.d()) {
         var1 = this.m.e(this.A);
      }

      return var1;
   }

   public int computeHorizontalScrollOffset() {
      int var1 = 0;
      if (this.m != null && this.m.d()) {
         var1 = this.m.c(this.A);
      }

      return var1;
   }

   public int computeHorizontalScrollRange() {
      int var1 = 0;
      if (this.m != null && this.m.d()) {
         var1 = this.m.g(this.A);
      }

      return var1;
   }

   public int computeVerticalScrollExtent() {
      int var1 = 0;
      if (this.m != null && this.m.e()) {
         var1 = this.m.f(this.A);
      }

      return var1;
   }

   public int computeVerticalScrollOffset() {
      int var1 = 0;
      if (this.m != null && this.m.e()) {
         var1 = this.m.d(this.A);
      }

      return var1;
   }

   public int computeVerticalScrollRange() {
      int var1 = 0;
      if (this.m != null && this.m.e()) {
         var1 = this.m.h(this.A);
      }

      return var1;
   }

   int d(ey var1) {
      int var2;
      if (!var1.a(524) && var1.q()) {
         var2 = this.e.c(var1.c);
      } else {
         var2 = -1;
      }

      return var2;
   }

   public ey d(int var1) {
      return this.a(var1, false);
   }

   public ey d(View var1) {
      var1 = this.c(var1);
      ey var2;
      if (var1 == null) {
         var2 = null;
      } else {
         var2 = this.b(var1);
      }

      return var2;
   }

   void d() {
      ++this.S;
      if (this.S == 1 && !this.t) {
         this.s = false;
      }

   }

   void d(int var1, int var2) {
      if (var1 < 0) {
         this.g();
         this.ac.a(-var1);
      } else if (var1 > 0) {
         this.h();
         this.ae.a(var1);
      }

      if (var2 < 0) {
         this.i();
         this.ad.a(-var2);
      } else if (var2 > 0) {
         this.j();
         this.af.a(var2);
      }

      if (var1 != 0 || var2 != 0) {
         android.support.v4.view.bz.c(this);
      }

   }

   public boolean dispatchNestedFling(float var1, float var2, boolean var3) {
      return this.getScrollingChildHelper().a(var1, var2, var3);
   }

   public boolean dispatchNestedPreFling(float var1, float var2) {
      return this.getScrollingChildHelper().a(var1, var2);
   }

   public boolean dispatchNestedPreScroll(int var1, int var2, int[] var3, int[] var4) {
      return this.getScrollingChildHelper().a(var1, var2, var3, var4);
   }

   public boolean dispatchNestedScroll(int var1, int var2, int var3, int var4, int[] var5) {
      return this.getScrollingChildHelper().a(var1, var2, var3, var4, var5);
   }

   protected void dispatchRestoreInstanceState(SparseArray var1) {
      this.dispatchThawSelfOnly(var1);
   }

   protected void dispatchSaveInstanceState(SparseArray var1) {
      this.dispatchFreezeSelfOnly(var1);
   }

   public void draw(Canvas var1) {
      boolean var2 = true;
      boolean var3 = false;
      super.draw(var1);
      int var4 = this.o.size();

      int var5;
      for(var5 = 0; var5 < var4; ++var5) {
         ((eb)this.o.get(var5)).b(var1, this, this.A);
      }

      int var6;
      boolean var8;
      if (this.ac != null && !this.ac.a()) {
         var6 = var1.save();
         if (this.h) {
            var5 = this.getPaddingBottom();
         } else {
            var5 = 0;
         }

         var1.rotate(270.0F);
         var1.translate((float)(var5 + -this.getHeight()), 0.0F);
         if (this.ac != null && this.ac.a(var1)) {
            var8 = true;
         } else {
            var8 = false;
         }

         var1.restoreToCount(var6);
      } else {
         var8 = false;
      }

      boolean var9 = var8;
      if (this.ad != null) {
         var9 = var8;
         if (!this.ad.a()) {
            var6 = var1.save();
            if (this.h) {
               var1.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
            }

            if (this.ad != null && this.ad.a(var1)) {
               var9 = true;
            } else {
               var9 = false;
            }

            var9 |= var8;
            var1.restoreToCount(var6);
         }
      }

      var8 = var9;
      if (this.ae != null) {
         var8 = var9;
         if (!this.ae.a()) {
            var6 = var1.save();
            int var7 = this.getWidth();
            if (this.h) {
               var4 = this.getPaddingTop();
            } else {
               var4 = 0;
            }

            var1.rotate(90.0F);
            var1.translate((float)(-var4), (float)(-var7));
            if (this.ae != null && this.ae.a(var1)) {
               var8 = true;
            } else {
               var8 = false;
            }

            var8 |= var9;
            var1.restoreToCount(var6);
         }
      }

      var9 = var8;
      if (this.af != null) {
         var9 = var8;
         if (!this.af.a()) {
            var6 = var1.save();
            var1.rotate(180.0F);
            if (this.h) {
               var1.translate((float)(-this.getWidth() + this.getPaddingRight()), (float)(-this.getHeight() + this.getPaddingBottom()));
            } else {
               var1.translate((float)(-this.getWidth()), (float)(-this.getHeight()));
            }

            var9 = var3;
            if (this.af != null) {
               var9 = var3;
               if (this.af.a(var1)) {
                  var9 = true;
               }
            }

            var9 |= var8;
            var1.restoreToCount(var6);
         }
      }

      if (!var9 && this.w != null && this.o.size() > 0 && this.w.b()) {
         var9 = var2;
      }

      if (var9) {
         android.support.v4.view.bz.c(this);
      }

   }

   public boolean drawChild(Canvas var1, View var2, long var3) {
      return super.drawChild(var1, var2, var3);
   }

   public ey e(int var1) {
      ey var2 = null;
      if (!this.v) {
         int var3 = this.f.c();
         int var4 = 0;

         for(var2 = null; var4 < var3; ++var4) {
            ey var5 = e(this.f.d(var4));
            if (var5 != null && !var5.r() && this.d(var5) == var1) {
               var2 = var5;
               if (!this.f.c(var5.a)) {
                  break;
               }

               var2 = var5;
            }
         }
      }

      return var2;
   }

   void e(int var1, int var2) {
      this.setMeasuredDimension(ec.a(var1, this.getPaddingLeft() + this.getPaddingRight(), android.support.v4.view.bz.n(this)), ec.a(var2, this.getPaddingTop() + this.getPaddingBottom(), android.support.v4.view.bz.o(this)));
   }

   public boolean e() {
      return this.t;
   }

   @Deprecated
   public int f(View var1) {
      return this.g(var1);
   }

   public void f() {
      this.setScrollState(0);
      this.C();
   }

   public void f(int var1) {
      int var2 = this.f.b();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.f.b(var3).offsetTopAndBottom(var1);
      }

   }

   void f(int var1, int var2) {
      int var3 = this.f.c();
      byte var4;
      int var5;
      int var6;
      if (var1 < var2) {
         var4 = -1;
         var5 = var2;
         var6 = var1;
      } else {
         var4 = 1;
         var5 = var1;
         var6 = var2;
      }

      for(int var7 = 0; var7 < var3; ++var7) {
         ey var8 = e(this.f.d(var7));
         if (var8 != null && var8.c >= var6 && var8.c <= var5) {
            if (var8.c == var1) {
               var8.a(var2 - var1, false);
            } else {
               var8.a(var4, false);
            }

            this.A.e = true;
         }
      }

      this.d.a(var1, var2);
      this.requestLayout();
   }

   public View focusSearch(View var1, int var2) {
      boolean var3 = true;
      View var4 = this.m.d(var1, var2);
      if (var4 == null) {
         boolean var5;
         if (this.l != null && this.m != null && !this.o() && !this.t) {
            var5 = true;
         } else {
            var5 = false;
         }

         FocusFinder var8 = FocusFinder.getInstance();
         View var7;
         if (!var5 || var2 != 2 && var2 != 1) {
            var7 = var8.findNextFocus(this, var1, var2);
            if (var7 == null && var5) {
               this.c();
               if (this.c(var1) == null) {
                  var4 = null;
                  return var4;
               }

               this.d();
               var7 = this.m.a(var1, var2, this.d, this.A);
               this.a(false);
            }
         } else {
            if (this.m.e()) {
               short var6;
               if (var2 == 2) {
                  var6 = 130;
               } else {
                  var6 = 33;
               }

               if (var8.findNextFocus(this, var1, var6) == null) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               if (K) {
                  var2 = var6;
               }
            } else {
               var5 = false;
            }

            if (!var5 && this.m.d()) {
               if (this.m.v() == 1) {
                  var5 = true;
               } else {
                  var5 = false;
               }

               boolean var9;
               if (var2 == 2) {
                  var9 = true;
               } else {
                  var9 = false;
               }

               byte var10;
               if (var9 ^ var5) {
                  var10 = 66;
               } else {
                  var10 = 17;
               }

               if (var8.findNextFocus(this, var1, var10) == null) {
                  var9 = var3;
               } else {
                  var9 = false;
               }

               var3 = var9;
               if (K) {
                  var2 = var10;
                  var3 = var9;
               }
            } else {
               var3 = var5;
            }

            if (var3) {
               this.c();
               if (this.c(var1) == null) {
                  var4 = null;
                  return var4;
               }

               this.d();
               this.m.a(var1, var2, this.d, this.A);
               this.a(false);
            }

            var7 = var8.findNextFocus(this, var1, var2);
         }

         var4 = var7;
         if (!this.a(var1, var7, var2)) {
            var4 = super.focusSearch(var1, var2);
         }
      }

      return var4;
   }

   public int g(View var1) {
      ey var3 = e(var1);
      int var2;
      if (var3 != null) {
         var2 = var3.f();
      } else {
         var2 = -1;
      }

      return var2;
   }

   void g() {
      if (this.ac == null) {
         this.ac = new android.support.v4.widget.i(this.getContext());
         if (this.h) {
            this.ac.a(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
         } else {
            this.ac.a(this.getMeasuredHeight(), this.getMeasuredWidth());
         }
      }

   }

   public void g(int var1) {
      int var2 = this.f.b();

      for(int var3 = 0; var3 < var2; ++var3) {
         this.f.b(var3).offsetLeftAndRight(var1);
      }

   }

   void g(int var1, int var2) {
      int var3 = this.f.c();

      for(int var4 = 0; var4 < var3; ++var4) {
         ey var5 = e(this.f.d(var4));
         if (var5 != null && !var5.c() && var5.c >= var1) {
            var5.a(var2, false);
            this.A.e = true;
         }
      }

      this.d.b(var1, var2);
      this.requestLayout();
   }

   protected LayoutParams generateDefaultLayoutParams() {
      if (this.m == null) {
         throw new IllegalStateException("RecyclerView has no LayoutManager");
      } else {
         return this.m.a();
      }
   }

   public LayoutParams generateLayoutParams(AttributeSet var1) {
      if (this.m == null) {
         throw new IllegalStateException("RecyclerView has no LayoutManager");
      } else {
         return this.m.a(this.getContext(), var1);
      }
   }

   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      if (this.m == null) {
         throw new IllegalStateException("RecyclerView has no LayoutManager");
      } else {
         return this.m.a(var1);
      }
   }

   public ds getAdapter() {
      return this.l;
   }

   public int getBaseline() {
      int var1;
      if (this.m != null) {
         var1 = this.m.x();
      } else {
         var1 = super.getBaseline();
      }

      return var1;
   }

   protected int getChildDrawingOrder(int var1, int var2) {
      if (this.aw == null) {
         var1 = super.getChildDrawingOrder(var1, var2);
      } else {
         var1 = this.aw.a(var1, var2);
      }

      return var1;
   }

   public boolean getClipToPadding() {
      return this.h;
   }

   public ez getCompatAccessibilityDelegate() {
      return this.E;
   }

   public dw getItemAnimator() {
      return this.w;
   }

   public ec getLayoutManager() {
      return this.m;
   }

   public int getMaxFlingVelocity() {
      return this.aq;
   }

   public int getMinFlingVelocity() {
      return this.ap;
   }

   long getNanoTime() {
      long var1;
      if (J) {
         var1 = System.nanoTime();
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public eh getOnFlingListener() {
      return this.ao;
   }

   public boolean getPreserveFocusAfterLayout() {
      return this.as;
   }

   public ek getRecycledViewPool() {
      return this.d.g();
   }

   public int getScrollState() {
      return this.ag;
   }

   public int h(View var1) {
      ey var3 = e(var1);
      int var2;
      if (var3 != null) {
         var2 = var3.e();
      } else {
         var2 = -1;
      }

      return var2;
   }

   void h() {
      if (this.ae == null) {
         this.ae = new android.support.v4.widget.i(this.getContext());
         if (this.h) {
            this.ae.a(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight());
         } else {
            this.ae.a(this.getMeasuredHeight(), this.getMeasuredWidth());
         }
      }

   }

   public void h(int var1) {
   }

   public void h(int var1, int var2) {
   }

   public boolean hasNestedScrollingParent() {
      return this.getScrollingChildHelper().b();
   }

   void i() {
      if (this.ad == null) {
         this.ad = new android.support.v4.widget.i(this.getContext());
         if (this.h) {
            this.ad.a(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
         } else {
            this.ad.a(this.getMeasuredWidth(), this.getMeasuredHeight());
         }
      }

   }

   void i(int var1) {
      if (this.m != null) {
         this.m.l(var1);
      }

      this.h(var1);
      if (this.at != null) {
         this.at.a(this, var1);
      }

      if (this.au != null) {
         for(int var2 = this.au.size() - 1; var2 >= 0; --var2) {
            ((ej)this.au.get(var2)).a(this, var1);
         }
      }

   }

   void i(int var1, int var2) {
      ++this.ab;
      int var3 = this.getScrollX();
      int var4 = this.getScrollY();
      this.onScrollChanged(var3, var4, var3, var4);
      this.h(var1, var2);
      if (this.at != null) {
         this.at.a(this, var1, var2);
      }

      if (this.au != null) {
         for(var4 = this.au.size() - 1; var4 >= 0; --var4) {
            ((ej)this.au.get(var4)).a(this, var1, var2);
         }
      }

      --this.ab;
   }

   public void i(View var1) {
   }

   public boolean isAttachedToWindow() {
      return this.p;
   }

   public boolean isNestedScrollingEnabled() {
      return this.getScrollingChildHelper().a();
   }

   void j() {
      if (this.af == null) {
         this.af = new android.support.v4.widget.i(this.getContext());
         if (this.h) {
            this.af.a(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom());
         } else {
            this.af.a(this.getMeasuredWidth(), this.getMeasuredHeight());
         }
      }

   }

   public void j(View var1) {
   }

   Rect k(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      Rect var6;
      if (!var2.e) {
         var6 = var2.d;
      } else if (this.A.a() && (var2.e() || var2.c())) {
         var6 = var2.d;
      } else {
         Rect var3 = var2.d;
         var3.set(0, 0, 0, 0);
         int var4 = this.o.size();

         for(int var5 = 0; var5 < var4; ++var5) {
            this.j.set(0, 0, 0, 0);
            ((eb)this.o.get(var5)).a(this.j, var1, this, this.A);
            var3.left += this.j.left;
            var3.top += this.j.top;
            var3.right += this.j.right;
            var3.bottom += this.j.bottom;
         }

         var2.e = false;
         var6 = var3;
      }

      return var6;
   }

   void k() {
      this.af = null;
      this.ad = null;
      this.ae = null;
      this.ac = null;
   }

   void l() {
      ++this.aa;
   }

   void m() {
      --this.aa;
      if (this.aa < 1) {
         this.aa = 0;
         this.G();
         this.y();
      }

   }

   void m(View var1) {
      ey var2 = e(var1);
      this.j(var1);
      if (this.l != null && var2 != null) {
         this.l.d(var2);
      }

      if (this.W != null) {
         for(int var3 = this.W.size() - 1; var3 >= 0; --var3) {
            ((eg)this.W.get(var3)).b(var1);
         }
      }

   }

   void n(View var1) {
      ey var2 = e(var1);
      this.i(var1);
      if (this.l != null && var2 != null) {
         this.l.c(var2);
      }

      if (this.W != null) {
         for(int var3 = this.W.size() - 1; var3 >= 0; --var3) {
            ((eg)this.W.get(var3)).a(var1);
         }
      }

   }

   boolean n() {
      boolean var1;
      if (this.V != null && this.V.isEnabled()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean o() {
      boolean var1;
      if (this.aa > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   protected void onAttachedToWindow() {
      boolean var1 = true;
      super.onAttachedToWindow();
      this.aa = 0;
      this.p = true;
      if (!this.r || this.isLayoutRequested()) {
         var1 = false;
      }

      this.r = var1;
      if (this.m != null) {
         this.m.c(this);
      }

      this.D = false;
      if (J) {
         this.y = (cd)cd.a.get();
         if (this.y == null) {
            float var3;
            label25: {
               this.y = new cd();
               Display var2 = android.support.v4.view.bz.z(this);
               if (!this.isInEditMode() && var2 != null) {
                  var3 = var2.getRefreshRate();
                  if (var3 >= 30.0F) {
                     break label25;
                  }
               }

               var3 = 60.0F;
            }

            this.y.d = (long)(1.0E9F / var3);
            cd.a.set(this.y);
         }

         this.y.a(this);
      }

   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      if (this.w != null) {
         this.w.d();
      }

      this.f();
      this.p = false;
      if (this.m != null) {
         this.m.b(this, this.d);
      }

      this.F.clear();
      this.removeCallbacks(this.aC);
      this.g.b();
      if (J) {
         this.y.b(this);
         this.y = null;
      }

   }

   public void onDraw(Canvas var1) {
      super.onDraw(var1);
      int var2 = this.o.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         ((eb)this.o.get(var3)).a(var1, this, this.A);
      }

   }

   public boolean onGenericMotionEvent(MotionEvent var1) {
      if (this.m != null && !this.t && (var1.getSource() & 2) != 0 && var1.getAction() == 8) {
         float var2;
         if (this.m.e()) {
            var2 = -android.support.v4.view.bg.d(var1, 9);
         } else {
            var2 = 0.0F;
         }

         float var3;
         if (this.m.d()) {
            var3 = android.support.v4.view.bg.d(var1, 10);
         } else {
            var3 = 0.0F;
         }

         if (var2 != 0.0F || var3 != 0.0F) {
            float var4 = this.getScrollFactor();
            this.a((int)(var3 * var4), (int)(var2 * var4), var1);
         }
      }

      return false;
   }

   public boolean onInterceptTouchEvent(MotionEvent var1) {
      byte var2 = -1;
      boolean var3 = false;
      boolean var4 = true;
      boolean var5;
      if (this.t) {
         var5 = var3;
      } else if (this.a(var1)) {
         this.F();
         var5 = true;
      } else {
         var5 = var3;
         if (this.m != null) {
            var5 = this.m.d();
            boolean var6 = this.m.e();
            if (this.ai == null) {
               this.ai = VelocityTracker.obtain();
            }

            this.ai.addMovement(var1);
            int var7 = android.support.v4.view.bg.a(var1);
            int var8 = android.support.v4.view.bg.b(var1);
            switch(var7) {
            case 0:
               if (this.T) {
                  this.T = false;
               }

               this.ah = var1.getPointerId(0);
               var8 = (int)(var1.getX() + 0.5F);
               this.al = var8;
               this.aj = var8;
               var8 = (int)(var1.getY() + 0.5F);
               this.am = var8;
               this.ak = var8;
               if (this.ag == 2) {
                  this.getParent().requestDisallowInterceptTouchEvent(true);
                  this.setScrollState(1);
               }

               int[] var11 = this.aB;
               this.aB[1] = 0;
               var11[0] = 0;
               byte var15;
               if (var5) {
                  var15 = 1;
               } else {
                  var15 = 0;
               }

               var7 = var15;
               if (var6) {
                  var7 = var15 | 2;
               }

               this.startNestedScroll(var7);
               break;
            case 1:
               this.ai.clear();
               this.stopNestedScroll();
               break;
            case 2:
               var7 = var1.findPointerIndex(this.ah);
               if (var7 < 0) {
                  Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ah + " not found. Did any MotionEvents get skipped?");
                  var5 = var3;
                  return var5;
               }

               var8 = (int)(var1.getX(var7) + 0.5F);
               var7 = (int)(var1.getY(var7) + 0.5F);
               if (this.ag != 1) {
                  var8 -= this.aj;
                  int var9 = var7 - this.ak;
                  int var10;
                  boolean var13;
                  byte var14;
                  if (var5 && Math.abs(var8) > this.an) {
                     var10 = this.aj;
                     var7 = this.an;
                     if (var8 < 0) {
                        var14 = -1;
                     } else {
                        var14 = 1;
                     }

                     this.al = var14 * var7 + var10;
                     var13 = true;
                  } else {
                     var13 = false;
                  }

                  boolean var12 = var13;
                  if (var6) {
                     var12 = var13;
                     if (Math.abs(var9) > this.an) {
                        var7 = this.ak;
                        var10 = this.an;
                        if (var9 < 0) {
                           var14 = var2;
                        } else {
                           var14 = 1;
                        }

                        this.am = var7 + var14 * var10;
                        var12 = true;
                     }
                  }

                  if (var12) {
                     this.setScrollState(1);
                  }
               }
               break;
            case 3:
               this.F();
            case 4:
            default:
               break;
            case 5:
               this.ah = var1.getPointerId(var8);
               var7 = (int)(var1.getX(var8) + 0.5F);
               this.al = var7;
               this.aj = var7;
               var8 = (int)(var1.getY(var8) + 0.5F);
               this.am = var8;
               this.ak = var8;
               break;
            case 6:
               this.c(var1);
            }

            if (this.ag == 1) {
               var5 = var4;
            } else {
               var5 = false;
            }
         }
      }

      return var5;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      android.support.v4.f.i.a("RV OnLayout");
      this.q();
      android.support.v4.f.i.a();
      this.r = true;
   }

   protected void onMeasure(int var1, int var2) {
      boolean var3 = false;
      if (this.m == null) {
         this.e(var1, var2);
      } else if (this.m.u) {
         int var4 = MeasureSpec.getMode(var1);
         int var5 = MeasureSpec.getMode(var2);
         boolean var6 = var3;
         if (var4 == 1073741824) {
            var6 = var3;
            if (var5 == 1073741824) {
               var6 = true;
            }
         }

         this.m.a(this.d, this.A, var1, var2);
         if (!var6 && this.l != null) {
            if (this.A.c == 1) {
               this.N();
            }

            this.m.b(var1, var2);
            this.A.h = true;
            this.O();
            this.m.c(var1, var2);
            if (this.m.k()) {
               this.m.b(MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824));
               this.A.h = true;
               this.O();
               this.m.c(var1, var2);
            }
         }
      } else if (this.q) {
         this.m.a(this.d, this.A, var1, var2);
      } else {
         if (this.u) {
            this.d();
            this.l();
            this.I();
            this.m();
            if (this.A.j) {
               this.A.f = true;
            } else {
               this.e.e();
               this.A.f = false;
            }

            this.u = false;
            this.a(false);
         }

         if (this.l != null) {
            this.A.d = this.l.a();
         } else {
            this.A.d = 0;
         }

         this.d();
         this.m.a(this.d, this.A, var1, var2);
         this.a(false);
         this.A.f = false;
      }

   }

   protected boolean onRequestFocusInDescendants(int var1, Rect var2) {
      boolean var3;
      if (this.o()) {
         var3 = false;
      } else {
         var3 = super.onRequestFocusInDescendants(var1, var2);
      }

      return var3;
   }

   protected void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof ep)) {
         super.onRestoreInstanceState(var1);
      } else {
         this.O = (ep)var1;
         super.onRestoreInstanceState(this.O.a());
         if (this.m != null && this.O.b != null) {
            this.m.a(this.O.b);
         }
      }

   }

   protected Parcelable onSaveInstanceState() {
      ep var1 = new ep(super.onSaveInstanceState());
      if (this.O != null) {
         var1.a(this.O);
      } else if (this.m != null) {
         var1.b = this.m.c();
      } else {
         var1.b = null;
      }

      return var1;
   }

   protected void onSizeChanged(int var1, int var2, int var3, int var4) {
      super.onSizeChanged(var1, var2, var3, var4);
      if (var1 != var3 || var2 != var4) {
         this.k();
      }

   }

   public boolean onTouchEvent(MotionEvent var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = var3;
      if (!this.t) {
         if (this.T) {
            var4 = var3;
         } else if (this.b(var1)) {
            this.F();
            var4 = true;
         } else {
            var4 = var3;
            if (this.m != null) {
               boolean var5 = this.m.d();
               var4 = this.m.e();
               if (this.ai == null) {
                  this.ai = VelocityTracker.obtain();
               }

               MotionEvent var6 = MotionEvent.obtain(var1);
               int var7 = android.support.v4.view.bg.a(var1);
               int var8 = android.support.v4.view.bg.b(var1);
               if (var7 == 0) {
                  int[] var9 = this.aB;
                  this.aB[1] = 0;
                  var9[0] = 0;
               }

               var6.offsetLocation((float)this.aB[0], (float)this.aB[1]);
               boolean var10 = var2;
               int var20;
               switch(var7) {
               case 0:
                  this.ah = var1.getPointerId(0);
                  var20 = (int)(var1.getX() + 0.5F);
                  this.al = var20;
                  this.aj = var20;
                  var20 = (int)(var1.getY() + 0.5F);
                  this.am = var20;
                  this.ak = var20;
                  byte var21;
                  if (var5) {
                     var21 = 1;
                  } else {
                     var21 = 0;
                  }

                  var8 = var21;
                  if (var4) {
                     var8 = var21 | 2;
                  }

                  this.startNestedScroll(var8);
                  var10 = var2;
                  break;
               case 1:
                  this.ai.addMovement(var6);
                  this.ai.computeCurrentVelocity(1000, (float)this.aq);
                  float var16;
                  if (var5) {
                     var16 = -android.support.v4.view.bu.a(this.ai, this.ah);
                  } else {
                     var16 = 0.0F;
                  }

                  float var17;
                  if (var4) {
                     var17 = -android.support.v4.view.bu.b(this.ai, this.ah);
                  } else {
                     var17 = 0.0F;
                  }

                  if (var16 == 0.0F && var17 == 0.0F || !this.b((int)var16, (int)var17)) {
                     this.setScrollState(0);
                  }

                  this.E();
                  var10 = true;
                  break;
               case 2:
                  var20 = var1.findPointerIndex(this.ah);
                  if (var20 < 0) {
                     Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.ah + " not found. Did any MotionEvents get skipped?");
                     var4 = var3;
                     return var4;
                  }

                  int var11 = (int)(var1.getX(var20) + 0.5F);
                  int var12 = (int)(var1.getY(var20) + 0.5F);
                  int var13 = this.al - var11;
                  var7 = this.am - var12;
                  var20 = var7;
                  var8 = var13;
                  if (this.dispatchNestedPreScroll(var13, var7, this.aA, this.az)) {
                     var8 = var13 - this.aA[0];
                     var20 = var7 - this.aA[1];
                     var6.offsetLocation((float)this.az[0], (float)this.az[1]);
                     int[] var18 = this.aB;
                     var18[0] += this.az[0];
                     var18 = this.aB;
                     var18[1] += this.az[1];
                  }

                  var7 = var20;
                  var13 = var8;
                  if (this.ag != 1) {
                     boolean var19;
                     if (var5 && Math.abs(var8) > this.an) {
                        if (var8 > 0) {
                           var8 -= this.an;
                        } else {
                           var8 += this.an;
                        }

                        var19 = true;
                     } else {
                        var19 = false;
                     }

                     int var14 = var20;
                     boolean var15 = var19;
                     if (var4) {
                        var14 = var20;
                        var15 = var19;
                        if (Math.abs(var20) > this.an) {
                           if (var20 > 0) {
                              var14 = var20 - this.an;
                           } else {
                              var14 = var20 + this.an;
                           }

                           var15 = true;
                        }
                     }

                     var7 = var14;
                     var13 = var8;
                     if (var15) {
                        this.setScrollState(1);
                        var13 = var8;
                        var7 = var14;
                     }
                  }

                  var10 = var2;
                  if (this.ag == 1) {
                     this.al = var11 - this.az[0];
                     this.am = var12 - this.az[1];
                     if (var5) {
                        var20 = var13;
                     } else {
                        var20 = 0;
                     }

                     if (var4) {
                        var8 = var7;
                     } else {
                        var8 = 0;
                     }

                     if (this.a(var20, var8, var6)) {
                        this.getParent().requestDisallowInterceptTouchEvent(true);
                     }

                     var10 = var2;
                     if (this.y != null) {
                        if (var13 == 0) {
                           var10 = var2;
                           if (var7 == 0) {
                              break;
                           }
                        }

                        this.y.a(this, var13, var7);
                        var10 = var2;
                     }
                  }
                  break;
               case 3:
                  this.F();
                  var10 = var2;
               case 4:
                  break;
               case 5:
                  this.ah = var1.getPointerId(var8);
                  var20 = (int)(var1.getX(var8) + 0.5F);
                  this.al = var20;
                  this.aj = var20;
                  var20 = (int)(var1.getY(var8) + 0.5F);
                  this.am = var20;
                  this.ak = var20;
                  var10 = var2;
                  break;
               case 6:
                  this.c(var1);
                  var10 = var2;
                  break;
               default:
                  var10 = var2;
               }

               if (!var10) {
                  this.ai.addMovement(var6);
               }

               var6.recycle();
               var4 = true;
            }
         }
      }

      return var4;
   }

   void p() {
      if (!this.D && this.p) {
         android.support.v4.view.bz.a(this, (Runnable)this.aC);
         this.D = true;
      }

   }

   void q() {
      if (this.l == null) {
         Log.e("RecyclerView", "No adapter attached; skipping layout");
      } else if (this.m == null) {
         Log.e("RecyclerView", "No layout manager attached; skipping layout");
      } else {
         this.A.h = false;
         if (this.A.c == 1) {
            this.N();
            this.m.f(this);
            this.O();
         } else if (!this.e.f() && this.m.B() == this.getWidth() && this.m.C() == this.getHeight()) {
            this.m.f(this);
         } else {
            this.m.f(this);
            this.O();
         }

         this.P();
      }

   }

   void r() {
      int var1 = this.f.c();

      for(int var2 = 0; var2 < var1; ++var2) {
         ((ef)this.f.d(var2).getLayoutParams()).e = true;
      }

      this.d.k();
   }

   protected void removeDetachedView(View var1, boolean var2) {
      ey var3 = e(var1);
      if (var3 != null) {
         if (var3.s()) {
            var3.n();
         } else if (!var3.c()) {
            throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + var3);
         }
      }

      this.m(var1);
      super.removeDetachedView(var1, var2);
   }

   public void requestChildFocus(View var1, View var2) {
      if (!this.m.a(this, this.A, var1, var2) && var2 != null) {
         this.j.set(0, 0, var2.getWidth(), var2.getHeight());
         LayoutParams var3 = var2.getLayoutParams();
         Rect var8;
         if (var3 instanceof ef) {
            ef var7 = (ef)var3;
            if (!var7.e) {
               var8 = var7.d;
               Rect var4 = this.j;
               var4.left -= var8.left;
               var4 = this.j;
               var4.right += var8.right;
               var4 = this.j;
               var4.top -= var8.top;
               var4 = this.j;
               int var5 = var4.bottom;
               var4.bottom = var8.bottom + var5;
            }
         }

         this.offsetDescendantRectToMyCoords(var2, this.j);
         this.offsetRectIntoDescendantCoords(var1, this.j);
         var8 = this.j;
         boolean var6;
         if (!this.r) {
            var6 = true;
         } else {
            var6 = false;
         }

         this.requestChildRectangleOnScreen(var1, var8, var6);
      }

      super.requestChildFocus(var1, var2);
   }

   public boolean requestChildRectangleOnScreen(View var1, Rect var2, boolean var3) {
      return this.m.a(this, var1, var2, var3);
   }

   public void requestDisallowInterceptTouchEvent(boolean var1) {
      int var2 = this.Q.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         ((ei)this.Q.get(var3)).a(var1);
      }

      super.requestDisallowInterceptTouchEvent(var1);
   }

   public void requestLayout() {
      if (this.S == 0 && !this.t) {
         super.requestLayout();
      } else {
         this.s = true;
      }

   }

   void s() {
      int var1 = this.f.c();

      for(int var2 = 0; var2 < var1; ++var2) {
         ey var3 = e(this.f.d(var2));
         if (!var3.c()) {
            var3.b();
         }
      }

   }

   public void scrollBy(int var1, int var2) {
      if (this.m == null) {
         Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      } else if (!this.t) {
         boolean var3 = this.m.d();
         boolean var4 = this.m.e();
         if (var3 || var4) {
            if (!var3) {
               var1 = 0;
            }

            if (!var4) {
               var2 = 0;
            }

            this.a(var1, var2, (MotionEvent)null);
         }
      }

   }

   public void scrollTo(int var1, int var2) {
      Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
   }

   public void sendAccessibilityEventUnchecked(AccessibilityEvent var1) {
      if (!this.a(var1)) {
         super.sendAccessibilityEventUnchecked(var1);
      }

   }

   public void setAccessibilityDelegateCompat(ez var1) {
      this.E = var1;
      android.support.v4.view.bz.a(this, (android.support.v4.view.d)this.E);
   }

   public void setAdapter(ds var1) {
      this.setLayoutFrozen(false);
      this.a(var1, false, true);
      this.requestLayout();
   }

   public void setChildDrawingOrderCallback(dv var1) {
      if (var1 != this.aw) {
         this.aw = var1;
         boolean var2;
         if (this.aw != null) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.setChildrenDrawingOrderEnabled(var2);
      }

   }

   public void setClipToPadding(boolean var1) {
      if (var1 != this.h) {
         this.k();
      }

      this.h = var1;
      super.setClipToPadding(var1);
      if (this.r) {
         this.requestLayout();
      }

   }

   public void setHasFixedSize(boolean var1) {
      this.q = var1;
   }

   public void setItemAnimator(dw var1) {
      if (this.w != null) {
         this.w.d();
         this.w.a((dy)null);
      }

      this.w = var1;
      if (this.w != null) {
         this.w.a(this.av);
      }

   }

   public void setItemViewCacheSize(int var1) {
      this.d.a(var1);
   }

   public void setLayoutFrozen(boolean var1) {
      if (var1 != this.t) {
         this.a("Do not setLayoutFrozen in layout or scroll");
         if (!var1) {
            this.t = false;
            if (this.s && this.m != null && this.l != null) {
               this.requestLayout();
            }

            this.s = false;
         } else {
            long var2 = SystemClock.uptimeMillis();
            this.onTouchEvent(MotionEvent.obtain(var2, var2, 3, 0.0F, 0.0F, 0));
            this.t = true;
            this.T = true;
            this.f();
         }
      }

   }

   public void setLayoutManager(ec var1) {
      if (var1 != this.m) {
         this.f();
         if (this.m != null) {
            if (this.w != null) {
               this.w.d();
            }

            this.m.c(this.d);
            this.m.b(this.d);
            this.d.a();
            if (this.p) {
               this.m.b(this, this.d);
            }

            this.m.b((dl)null);
            this.m = null;
         } else {
            this.d.a();
         }

         this.f.a();
         this.m = var1;
         if (var1 != null) {
            if (var1.q != null) {
               throw new IllegalArgumentException("LayoutManager " + var1 + " is already attached to a RecyclerView: " + var1.q);
            }

            this.m.b(this);
            if (this.p) {
               this.m.c(this);
            }
         }

         this.d.b();
         this.requestLayout();
      }

   }

   public void setNestedScrollingEnabled(boolean var1) {
      this.getScrollingChildHelper().a(var1);
   }

   public void setOnFlingListener(eh var1) {
      this.ao = var1;
   }

   @Deprecated
   public void setOnScrollListener(ej var1) {
      this.at = var1;
   }

   public void setPreserveFocusAfterLayout(boolean var1) {
      this.as = var1;
   }

   public void setRecycledViewPool(ek var1) {
      this.d.a(var1);
   }

   public void setRecyclerListener(en var1) {
      this.n = var1;
   }

   void setScrollState(int var1) {
      if (var1 != this.ag) {
         this.ag = var1;
         if (var1 != 2) {
            this.C();
         }

         this.i(var1);
      }

   }

   public void setScrollingTouchSlop(int var1) {
      ViewConfiguration var2 = ViewConfiguration.get(this.getContext());
      switch(var1) {
      case 1:
         this.an = var2.getScaledPagingTouchSlop();
         break;
      default:
         Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + var1 + "; using default value");
      case 0:
         this.an = var2.getScaledTouchSlop();
      }

   }

   public void setViewCacheExtension(ew var1) {
      this.d.a(var1);
   }

   public boolean startNestedScroll(int var1) {
      return this.getScrollingChildHelper().a(var1);
   }

   public void stopNestedScroll() {
      this.getScrollingChildHelper().c();
   }

   void t() {
      int var1 = this.f.c();

      for(int var2 = 0; var2 < var1; ++var2) {
         ey var3 = e(this.f.d(var2));
         if (!var3.c()) {
            var3.a();
         }
      }

      this.d.j();
   }

   void u() {
      if (!this.v) {
         this.v = true;
         int var1 = this.f.c();

         for(int var2 = 0; var2 < var1; ++var2) {
            ey var3 = e(this.f.d(var2));
            if (var3 != null && !var3.c()) {
               var3.b(512);
            }
         }

         this.d.h();
         this.v();
      }

   }

   void v() {
      int var1 = this.f.c();

      for(int var2 = 0; var2 < var1; ++var2) {
         ey var3 = e(this.f.d(var2));
         if (var3 != null && !var3.c()) {
            var3.b(6);
         }
      }

      this.r();
      this.d.i();
   }

   public boolean w() {
      boolean var1;
      if (this.r && !this.v && !this.e.d()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   void x() {
      int var1 = this.f.b();

      for(int var2 = 0; var2 < var1; ++var2) {
         View var3 = this.f.b(var2);
         ey var4 = this.b(var3);
         if (var4 != null && var4.i != null) {
            View var7 = var4.i.a;
            int var5 = var3.getLeft();
            int var6 = var3.getTop();
            if (var5 != var7.getLeft() || var6 != var7.getTop()) {
               var7.layout(var5, var6, var7.getWidth() + var5, var7.getHeight() + var6);
            }
         }
      }

   }

   void y() {
      for(int var1 = this.F.size() - 1; var1 >= 0; --var1) {
         ey var2 = (ey)this.F.get(var1);
         if (var2.a.getParent() == this && !var2.c()) {
            int var3 = var2.l;
            if (var3 != -1) {
               android.support.v4.view.bz.c(var2.a, var3);
               var2.l = -1;
            }
         }
      }

      this.F.clear();
   }
}
