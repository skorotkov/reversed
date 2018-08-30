package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class ec {
   private boolean a = true;
   private boolean b = true;
   private int c;
   private int d;
   private int e;
   private int f;
   bd p;
   dl q;
   es r;
   boolean s = false;
   boolean t = false;
   boolean u = false;
   int v;
   boolean w;

   public static int a(int var0, int var1, int var2) {
      int var3 = MeasureSpec.getMode(var0);
      int var4 = MeasureSpec.getSize(var0);
      var0 = var4;
      switch(var3) {
      case Integer.MIN_VALUE:
         var0 = Math.min(var4, Math.max(var1, var2));
      case 1073741824:
         break;
      default:
         var0 = Math.max(var1, var2);
      }

      return var0;
   }

   public static int a(int var0, int var1, int var2, int var3, boolean var4) {
      byte var5 = 0;
      byte var6 = 0;
      int var7 = Math.max(0, var0 - var2);
      if (var4) {
         if (var3 >= 0) {
            var0 = 1073741824;
            var2 = var3;
            return MeasureSpec.makeMeasureSpec(var2, var0);
         }

         if (var3 == -1) {
            switch(var1) {
            case Integer.MIN_VALUE:
            case 1073741824:
               var0 = var7;
               break;
            case 0:
               var1 = 0;
               var0 = var5;
               break;
            default:
               var1 = 0;
               var0 = var5;
            }

            var2 = var0;
            var0 = var1;
            return MeasureSpec.makeMeasureSpec(var2, var0);
         }

         if (var3 == -2) {
            var2 = 0;
            var0 = var6;
            return MeasureSpec.makeMeasureSpec(var2, var0);
         }
      } else {
         if (var3 >= 0) {
            var0 = 1073741824;
            var2 = var3;
            return MeasureSpec.makeMeasureSpec(var2, var0);
         }

         if (var3 == -1) {
            var0 = var1;
            var2 = var7;
            return MeasureSpec.makeMeasureSpec(var2, var0);
         }

         if (var3 == -2) {
            if (var1 != Integer.MIN_VALUE) {
               var0 = var6;
               var2 = var7;
               if (var1 != 1073741824) {
                  return MeasureSpec.makeMeasureSpec(var2, var0);
               }
            }

            var0 = Integer.MIN_VALUE;
            var2 = var7;
            return MeasureSpec.makeMeasureSpec(var2, var0);
         }
      }

      var2 = 0;
      var0 = var6;
      return MeasureSpec.makeMeasureSpec(var2, var0);
   }

   @Deprecated
   public static int a(int var0, int var1, int var2, boolean var3) {
      int var4 = 1073741824;
      int var5 = Math.max(0, var0 - var1);
      if (var3) {
         if (var2 >= 0) {
            var0 = var2;
            var1 = var4;
         } else {
            var1 = 0;
            var0 = 0;
         }
      } else {
         var1 = var4;
         var0 = var2;
         if (var2 < 0) {
            if (var2 == -1) {
               var0 = var5;
               var1 = var4;
            } else if (var2 == -2) {
               var1 = Integer.MIN_VALUE;
               var0 = var5;
            } else {
               var1 = 0;
               var0 = 0;
            }
         }
      }

      return MeasureSpec.makeMeasureSpec(var0, var1);
   }

   public static ee a(Context var0, AttributeSet var1, int var2, int var3) {
      ee var4 = new ee();
      TypedArray var5 = var0.obtainStyledAttributes(var1, android.support.v7.d.b.RecyclerView, var2, var3);
      var4.a = var5.getInt(android.support.v7.d.b.RecyclerView_android_orientation, 1);
      var4.b = var5.getInt(android.support.v7.d.b.RecyclerView_spanCount, 1);
      var4.c = var5.getBoolean(android.support.v7.d.b.RecyclerView_reverseLayout, false);
      var4.d = var5.getBoolean(android.support.v7.d.b.RecyclerView_stackFromEnd, false);
      var5.recycle();
      return var4;
   }

   private void a(int var1, View var2) {
      this.p.e(var1);
   }

   // $FF: synthetic method
   static void a(ec var0, es var1) {
      var0.b(var1);
   }

   private void a(em var1, int var2, View var3) {
      ey var4 = dl.e(var3);
      if (!var4.c()) {
         if (var4.o() && !var4.r() && !this.q.l.b()) {
            this.g(var2);
            var1.b(var4);
         } else {
            this.h(var2);
            var1.c(var3);
            this.q.g.h(var4);
         }
      }

   }

   private void a(View var1, int var2, boolean var3) {
      ey var4 = dl.e(var1);
      if (!var3 && !var4.r()) {
         this.q.g.f(var4);
      } else {
         this.q.g.e(var4);
      }

      ef var5 = (ef)var1.getLayoutParams();
      if (!var4.l() && !var4.j()) {
         if (var1.getParent() == this.q) {
            int var6 = this.p.b(var1);
            int var7 = var2;
            if (var2 == -1) {
               var7 = this.p.b();
            }

            if (var6 == -1) {
               throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.q.indexOfChild(var1));
            }

            if (var6 != var7) {
               this.q.m.d(var6, var7);
            }
         } else {
            this.p.a(var1, var2, false);
            var5.e = true;
            if (this.r != null && this.r.h()) {
               this.r.b(var1);
            }
         }
      } else {
         if (var4.j()) {
            var4.k();
         } else {
            var4.m();
         }

         this.p.a(var1, var2, var1.getLayoutParams(), false);
      }

      if (var5.f) {
         var4.a.invalidate();
         var5.f = false;
      }

   }

   private void b(es var1) {
      if (this.r == var1) {
         this.r = null;
      }

   }

   private static boolean b(int var0, int var1, int var2) {
      boolean var3 = true;
      int var4 = MeasureSpec.getMode(var1);
      var1 = MeasureSpec.getSize(var1);
      boolean var5;
      if (var2 > 0 && var0 != var2) {
         var5 = false;
      } else {
         var5 = var3;
         switch(var4) {
         case Integer.MIN_VALUE:
            var5 = var3;
            if (var1 < var0) {
               var5 = false;
            }
         case 0:
            break;
         case 1073741824:
            var5 = var3;
            if (var1 != var0) {
               var5 = false;
            }
            break;
         default:
            var5 = false;
         }
      }

      return var5;
   }

   public int A() {
      return this.d;
   }

   public int B() {
      return this.e;
   }

   public int C() {
      return this.f;
   }

   public int D() {
      int var1;
      if (this.q != null) {
         var1 = this.q.getPaddingLeft();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int E() {
      int var1;
      if (this.q != null) {
         var1 = this.q.getPaddingTop();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int F() {
      int var1;
      if (this.q != null) {
         var1 = this.q.getPaddingRight();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int G() {
      int var1;
      if (this.q != null) {
         var1 = this.q.getPaddingBottom();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public View H() {
      Object var1 = null;
      View var2;
      if (this.q == null) {
         var2 = (View)var1;
      } else {
         View var3 = this.q.getFocusedChild();
         var2 = (View)var1;
         if (var3 != null) {
            var2 = (View)var1;
            if (!this.p.c(var3)) {
               var2 = var3;
            }
         }
      }

      return var2;
   }

   public int I() {
      ds var1;
      if (this.q != null) {
         var1 = this.q.getAdapter();
      } else {
         var1 = null;
      }

      int var2;
      if (var1 != null) {
         var2 = var1.a();
      } else {
         var2 = 0;
      }

      return var2;
   }

   public int J() {
      return android.support.v4.view.bz.n(this.q);
   }

   public int K() {
      return android.support.v4.view.bz.o(this.q);
   }

   void L() {
      if (this.r != null) {
         this.r.f();
      }

   }

   public void M() {
      this.s = true;
   }

   boolean N() {
      boolean var1 = false;
      int var2 = this.y();
      int var3 = 0;

      boolean var4;
      while(true) {
         var4 = var1;
         if (var3 >= var2) {
            break;
         }

         LayoutParams var5 = this.i(var3).getLayoutParams();
         if (var5.width < 0 && var5.height < 0) {
            var4 = true;
            break;
         }

         ++var3;
      }

      return var4;
   }

   public int a(int var1, em var2, ev var3) {
      return 0;
   }

   public int a(em var1, ev var2) {
      byte var3 = 1;
      int var4 = var3;
      if (this.q != null) {
         if (this.q.l == null) {
            var4 = var3;
         } else {
            var4 = var3;
            if (this.e()) {
               var4 = this.q.l.a();
            }
         }
      }

      return var4;
   }

   public abstract ef a();

   public ef a(Context var1, AttributeSet var2) {
      return new ef(var1, var2);
   }

   public ef a(LayoutParams var1) {
      ef var2;
      if (var1 instanceof ef) {
         var2 = new ef((ef)var1);
      } else if (var1 instanceof MarginLayoutParams) {
         var2 = new ef((MarginLayoutParams)var1);
      } else {
         var2 = new ef(var1);
      }

      return var2;
   }

   public View a(View var1, int var2, em var3, ev var4) {
      return null;
   }

   public void a(int var1, int var2, ev var3, ed var4) {
   }

   public void a(int var1, ed var2) {
   }

   public void a(int var1, em var2) {
      View var3 = this.i(var1);
      this.g(var1);
      var2.a(var3);
   }

   public void a(Rect var1, int var2, int var3) {
      int var4 = var1.width();
      int var5 = this.D();
      int var6 = this.F();
      int var7 = var1.height();
      int var8 = this.E();
      int var9 = this.G();
      this.e(a(var2, var4 + var5 + var6, this.J()), a(var3, var7 + var8 + var9, this.K()));
   }

   public void a(Parcelable var1) {
   }

   void a(android.support.v4.view.a.h var1) {
      this.a(this.q.d, this.q.A, var1);
   }

   public void a(dl var1) {
   }

   public void a(dl var1, int var2, int var3) {
   }

   public void a(dl var1, int var2, int var3, int var4) {
   }

   public void a(dl var1, int var2, int var3, Object var4) {
      this.c(var1, var2, var3);
   }

   public void a(dl var1, em var2) {
      this.e(var1);
   }

   public void a(dl var1, ev var2, int var3) {
      Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
   }

   public void a(ds var1, ds var2) {
   }

   public void a(em var1) {
      for(int var2 = this.y() - 1; var2 >= 0; --var2) {
         this.a(var1, var2, this.i(var2));
      }

   }

   public void a(em var1, ev var2, int var3, int var4) {
      this.q.e(var3, var4);
   }

   public void a(em var1, ev var2, android.support.v4.view.a.h var3) {
      if (android.support.v4.view.bz.b(this.q, -1) || android.support.v4.view.bz.a(this.q, -1)) {
         var3.a(8192);
         var3.a(true);
      }

      if (android.support.v4.view.bz.b(this.q, 1) || android.support.v4.view.bz.a(this.q, 1)) {
         var3.a(4096);
         var3.a(true);
      }

      var3.a((Object)android.support.v4.view.a.t.a(this.a(var1, var2), this.b(var1, var2), this.e(var1, var2), this.d(var1, var2)));
   }

   public void a(em var1, ev var2, View var3, android.support.v4.view.a.h var4) {
      int var5;
      if (this.e()) {
         var5 = this.d(var3);
      } else {
         var5 = 0;
      }

      int var6;
      if (this.d()) {
         var6 = this.d(var3);
      } else {
         var6 = 0;
      }

      var4.b((Object)android.support.v4.view.a.u.a(var5, 1, var6, 1, false, false));
   }

   public void a(em var1, ev var2, AccessibilityEvent var3) {
      boolean var4 = true;
      android.support.v4.view.a.am var6 = android.support.v4.view.a.a.a(var3);
      if (this.q != null && var6 != null) {
         boolean var5 = var4;
         if (!android.support.v4.view.bz.b(this.q, 1)) {
            var5 = var4;
            if (!android.support.v4.view.bz.b(this.q, -1)) {
               var5 = var4;
               if (!android.support.v4.view.bz.a(this.q, -1)) {
                  if (android.support.v4.view.bz.a(this.q, 1)) {
                     var5 = var4;
                  } else {
                     var5 = false;
                  }
               }
            }
         }

         var6.a(var5);
         if (this.q.l != null) {
            var6.a(this.q.l.a());
         }
      }

   }

   public void a(es var1) {
      if (this.r != null && var1 != this.r && this.r.h()) {
         this.r.f();
      }

      this.r = var1;
      this.r.a(this.q, this);
   }

   public void a(ev var1) {
   }

   public void a(View var1) {
      this.a(var1, -1);
   }

   public void a(View var1, int var2) {
      this.a(var1, var2, true);
   }

   public void a(View var1, int var2, int var3) {
      ef var4 = (ef)var1.getLayoutParams();
      Rect var5 = this.q.k(var1);
      int var6 = var5.left;
      int var7 = var5.right;
      int var8 = var5.top;
      int var9 = var5.bottom;
      var2 = a(this.B(), this.z(), var6 + var7 + var2 + this.D() + this.F() + var4.leftMargin + var4.rightMargin, var4.width, this.d());
      var3 = a(this.C(), this.A(), var9 + var8 + var3 + this.E() + this.G() + var4.topMargin + var4.bottomMargin, var4.height, this.e());
      if (this.b(var1, var2, var3, var4)) {
         var1.measure(var2, var3);
      }

   }

   public void a(View var1, int var2, int var3, int var4, int var5) {
      ef var6 = (ef)var1.getLayoutParams();
      Rect var7 = var6.d;
      var1.layout(var7.left + var2 + var6.leftMargin, var7.top + var3 + var6.topMargin, var4 - var7.right - var6.rightMargin, var5 - var7.bottom - var6.bottomMargin);
   }

   public void a(View var1, int var2, ef var3) {
      ey var4 = dl.e(var1);
      if (var4.r()) {
         this.q.g.e(var4);
      } else {
         this.q.g.f(var4);
      }

      this.p.a(var1, var2, var3, var4.r());
   }

   public void a(View var1, Rect var2) {
      dl.a(var1, var2);
   }

   void a(View var1, android.support.v4.view.a.h var2) {
      ey var3 = dl.e(var1);
      if (var3 != null && !var3.r() && !this.p.c(var3.a)) {
         this.a(this.q.d, this.q.A, var1, var2);
      }

   }

   public void a(View var1, em var2) {
      this.c(var1);
      var2.a(var1);
   }

   public void a(View var1, boolean var2, Rect var3) {
      if (var2) {
         Rect var4 = ((ef)var1.getLayoutParams()).d;
         int var5 = -var4.left;
         int var6 = -var4.top;
         int var7 = var1.getWidth();
         int var8 = var4.right;
         int var9 = var1.getHeight();
         var3.set(var5, var6, var7 + var8, var4.bottom + var9);
      } else {
         var3.set(0, 0, var1.getWidth(), var1.getHeight());
      }

      if (this.q != null) {
         Matrix var11 = android.support.v4.view.bz.m(var1);
         if (var11 != null && !var11.isIdentity()) {
            RectF var10 = this.q.k;
            var10.set(var3);
            var11.mapRect(var10);
            var3.set((int)Math.floor((double)var10.left), (int)Math.floor((double)var10.top), (int)Math.ceil((double)var10.right), (int)Math.ceil((double)var10.bottom));
         }
      }

      var3.offset(var1.getLeft(), var1.getTop());
   }

   public void a(AccessibilityEvent var1) {
      this.a(this.q.d, this.q.A, var1);
   }

   public void a(String var1) {
      if (this.q != null) {
         this.q.a(var1);
      }

   }

   boolean a(int var1, Bundle var2) {
      return this.a(this.q.d, this.q.A, var1, var2);
   }

   public boolean a(dl var1, ev var2, View var3, View var4) {
      return this.a(var1, var3, var4);
   }

   public boolean a(dl var1, View var2, Rect var3, boolean var4) {
      int var5 = this.D();
      int var6 = this.E();
      int var7 = this.B() - this.F();
      int var8 = this.C();
      int var9 = this.G();
      int var10 = var2.getLeft() + var3.left - var2.getScrollX();
      int var11 = var2.getTop() + var3.top - var2.getScrollY();
      int var12 = var10 + var3.width();
      int var13 = var3.height();
      int var14 = Math.min(0, var10 - var5);
      int var15 = Math.min(0, var11 - var6);
      int var16 = Math.max(0, var12 - var7);
      var9 = Math.max(0, var11 + var13 - (var8 - var9));
      if (this.v() == 1) {
         if (var16 != 0) {
            var14 = var16;
         } else {
            var14 = Math.max(var14, var12 - var7);
         }
      } else if (var14 == 0) {
         var14 = Math.min(var10 - var5, var16);
      }

      if (var15 == 0) {
         var15 = Math.min(var11 - var6, var9);
      }

      if (var14 == 0 && var15 == 0) {
         var4 = false;
      } else {
         if (var4) {
            var1.scrollBy(var14, var15);
         } else {
            var1.a(var14, var15);
         }

         var4 = true;
      }

      return var4;
   }

   @Deprecated
   public boolean a(dl var1, View var2, View var3) {
      boolean var4;
      if (!this.u() && !var1.o()) {
         var4 = false;
      } else {
         var4 = true;
      }

      return var4;
   }

   public boolean a(dl var1, ArrayList var2, int var3, int var4) {
      return false;
   }

   public boolean a(ef var1) {
      boolean var2;
      if (var1 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public boolean a(em var1, ev var2, int var3, Bundle var4) {
      boolean var5 = false;
      if (this.q != null) {
         int var6;
         label34: {
            int var7;
            switch(var3) {
            case 4096:
               if (android.support.v4.view.bz.b(this.q, 1)) {
                  var3 = this.C() - this.E() - this.G();
               } else {
                  var3 = 0;
               }

               var6 = var3;
               if (android.support.v4.view.bz.a(this.q, 1)) {
                  int var8 = this.B();
                  int var9 = this.D();
                  var7 = this.F();
                  var6 = var3;
                  var3 = var8 - var9 - var7;
                  break label34;
               }
               break;
            case 8192:
               if (android.support.v4.view.bz.b(this.q, -1)) {
                  var3 = -(this.C() - this.E() - this.G());
               } else {
                  var3 = 0;
               }

               var6 = var3;
               if (android.support.v4.view.bz.a(this.q, -1)) {
                  var7 = -(this.B() - this.D() - this.F());
                  var6 = var3;
                  var3 = var7;
                  break label34;
               }
               break;
            default:
               var3 = 0;
               var6 = 0;
               break label34;
            }

            var3 = 0;
         }

         if (var6 != 0 || var3 != 0) {
            this.q.scrollBy(var3, var6);
            var5 = true;
         }
      }

      return var5;
   }

   public boolean a(em var1, ev var2, View var3, int var4, Bundle var5) {
      return false;
   }

   boolean a(View var1, int var2, int var3, ef var4) {
      boolean var5;
      if (this.a && b(var1.getMeasuredWidth(), var2, var4.width) && b(var1.getMeasuredHeight(), var3, var4.height)) {
         var5 = false;
      } else {
         var5 = true;
      }

      return var5;
   }

   boolean a(View var1, int var2, Bundle var3) {
      return this.a(this.q.d, this.q.A, var1, var2, var3);
   }

   public boolean a(Runnable var1) {
      boolean var2;
      if (this.q != null) {
         var2 = this.q.removeCallbacks(var1);
      } else {
         var2 = false;
      }

      return var2;
   }

   public int b(int var1, em var2, ev var3) {
      return 0;
   }

   public int b(em var1, ev var2) {
      byte var3 = 1;
      int var4 = var3;
      if (this.q != null) {
         if (this.q.l == null) {
            var4 = var3;
         } else {
            var4 = var3;
            if (this.d()) {
               var4 = this.q.l.a();
            }
         }
      }

      return var4;
   }

   void b(int var1, int var2) {
      this.e = MeasureSpec.getSize(var1);
      this.c = MeasureSpec.getMode(var1);
      if (this.c == 0 && !dl.b) {
         this.e = 0;
      }

      this.f = MeasureSpec.getSize(var2);
      this.d = MeasureSpec.getMode(var2);
      if (this.d == 0 && !dl.b) {
         this.f = 0;
      }

   }

   void b(dl var1) {
      if (var1 == null) {
         this.q = null;
         this.p = null;
         this.e = 0;
         this.f = 0;
      } else {
         this.q = var1;
         this.p = var1.f;
         this.e = var1.getWidth();
         this.f = var1.getHeight();
      }

      this.c = 1073741824;
      this.d = 1073741824;
   }

   public void b(dl var1, int var2, int var3) {
   }

   void b(dl var1, em var2) {
      this.t = false;
      this.a(var1, var2);
   }

   void b(em var1) {
      int var2 = var1.e();

      for(int var3 = var2 - 1; var3 >= 0; --var3) {
         View var4 = var1.e(var3);
         ey var5 = dl.e(var4);
         if (!var5.c()) {
            var5.a(false);
            if (var5.s()) {
               this.q.removeDetachedView(var4, false);
            }

            if (this.q.w != null) {
               this.q.w.d(var5);
            }

            var5.a(true);
            var1.b(var4);
         }
      }

      var1.f();
      if (var2 > 0) {
         this.q.invalidate();
      }

   }

   public void b(View var1) {
      this.b(var1, -1);
   }

   public void b(View var1, int var2) {
      this.a(var1, var2, false);
   }

   public void b(View var1, Rect var2) {
      if (this.q == null) {
         var2.set(0, 0, 0, 0);
      } else {
         var2.set(this.q.k(var1));
      }

   }

   public boolean b() {
      return false;
   }

   boolean b(View var1, int var2, int var3, ef var4) {
      boolean var5;
      if (!var1.isLayoutRequested() && this.a && b(var1.getWidth(), var2, var4.width) && b(var1.getHeight(), var3, var4.height)) {
         var5 = false;
      } else {
         var5 = true;
      }

      return var5;
   }

   public int c(ev var1) {
      return 0;
   }

   public Parcelable c() {
      return null;
   }

   public View c(int var1) {
      int var2 = this.y();
      int var3 = 0;

      View var6;
      while(true) {
         if (var3 >= var2) {
            var6 = null;
            break;
         }

         View var4 = this.i(var3);
         ey var5 = dl.e(var4);
         if (var5 != null && var5.e() == var1 && !var5.c()) {
            var6 = var4;
            if (this.q.A.a()) {
               break;
            }

            if (!var5.r()) {
               var6 = var4;
               break;
            }
         }

         ++var3;
      }

      return var6;
   }

   void c(int var1, int var2) {
      int var3 = Integer.MAX_VALUE;
      int var4 = Integer.MIN_VALUE;
      int var5 = this.y();
      if (var5 == 0) {
         this.q.e(var1, var2);
      } else {
         int var6 = 0;
         int var7 = Integer.MIN_VALUE;

         int var8;
         int var14;
         for(var8 = Integer.MAX_VALUE; var6 < var5; var4 = var14) {
            View var9 = this.i(var6);
            Rect var10 = this.q.j;
            this.a(var9, var10);
            int var11 = var8;
            if (var10.left < var8) {
               var11 = var10.left;
            }

            int var12 = var7;
            if (var10.right > var7) {
               var12 = var10.right;
            }

            int var13 = var3;
            if (var10.top < var3) {
               var13 = var10.top;
            }

            var14 = var4;
            if (var10.bottom > var4) {
               var14 = var10.bottom;
            }

            ++var6;
            var8 = var11;
            var7 = var12;
            var3 = var13;
         }

         this.q.j.set(var8, var3, var7, var4);
         this.a(this.q.j, var1, var2);
      }

   }

   void c(dl var1) {
      this.t = true;
      this.d(var1);
   }

   public void c(dl var1, int var2, int var3) {
   }

   public void c(em var1) {
      for(int var2 = this.y() - 1; var2 >= 0; --var2) {
         if (!dl.e(this.i(var2)).c()) {
            this.a(var2, var1);
         }
      }

   }

   public void c(em var1, ev var2) {
      Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
   }

   public void c(View var1) {
      this.p.a(var1);
   }

   public void c(View var1, int var2) {
      this.a(var1, var2, (ef)var1.getLayoutParams());
   }

   public void c(boolean var1) {
      this.u = var1;
   }

   public int d(em var1, ev var2) {
      return 0;
   }

   public int d(ev var1) {
      return 0;
   }

   public int d(View var1) {
      return ((ef)var1.getLayoutParams()).f();
   }

   public View d(View var1, int var2) {
      return null;
   }

   public void d(int var1, int var2) {
      View var3 = this.i(var1);
      if (var3 == null) {
         throw new IllegalArgumentException("Cannot move a child from non-existing index:" + var1);
      } else {
         this.h(var1);
         this.c(var3, var2);
      }
   }

   public void d(dl var1) {
   }

   public final void d(boolean var1) {
      if (var1 != this.b) {
         this.b = var1;
         this.v = 0;
         if (this.q != null) {
            this.q.d.b();
         }
      }

   }

   public boolean d() {
      return false;
   }

   public int e(ev var1) {
      return 0;
   }

   public View e(View var1) {
      Object var2 = null;
      if (this.q == null) {
         var1 = (View)var2;
      } else {
         View var3 = this.q.c(var1);
         var1 = (View)var2;
         if (var3 != null) {
            var1 = (View)var2;
            if (!this.p.c(var3)) {
               var1 = var3;
            }
         }
      }

      return var1;
   }

   public void e(int var1) {
   }

   public void e(int var1, int var2) {
      dl.a(this.q, var1, var2);
   }

   @Deprecated
   public void e(dl var1) {
   }

   public boolean e() {
      return false;
   }

   public boolean e(em var1, ev var2) {
      return false;
   }

   public int f(ev var1) {
      return 0;
   }

   public int f(View var1) {
      Rect var2 = ((ef)var1.getLayoutParams()).d;
      int var3 = var1.getMeasuredWidth();
      int var4 = var2.left;
      return var2.right + var3 + var4;
   }

   void f(dl var1) {
      this.b(MeasureSpec.makeMeasureSpec(var1.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(var1.getHeight(), 1073741824));
   }

   public int g(ev var1) {
      return 0;
   }

   public int g(View var1) {
      Rect var2 = ((ef)var1.getLayoutParams()).d;
      int var3 = var1.getMeasuredHeight();
      int var4 = var2.top;
      return var2.bottom + var3 + var4;
   }

   public void g(int var1) {
      if (this.i(var1) != null) {
         this.p.a(var1);
      }

   }

   public int h(ev var1) {
      return 0;
   }

   public int h(View var1) {
      return var1.getLeft() - this.n(var1);
   }

   public void h(int var1) {
      this.a(var1, this.i(var1));
   }

   public int i(View var1) {
      return var1.getTop() - this.l(var1);
   }

   public View i(int var1) {
      View var2;
      if (this.p != null) {
         var2 = this.p.b(var1);
      } else {
         var2 = null;
      }

      return var2;
   }

   public int j(View var1) {
      return var1.getRight() + this.o(var1);
   }

   public void j(int var1) {
      if (this.q != null) {
         this.q.g(var1);
      }

   }

   public int k(View var1) {
      return var1.getBottom() + this.m(var1);
   }

   public void k(int var1) {
      if (this.q != null) {
         this.q.f(var1);
      }

   }

   boolean k() {
      return false;
   }

   public int l(View var1) {
      return ((ef)var1.getLayoutParams()).d.top;
   }

   public void l(int var1) {
   }

   public int m(View var1) {
      return ((ef)var1.getLayoutParams()).d.bottom;
   }

   public int n(View var1) {
      return ((ef)var1.getLayoutParams()).d.left;
   }

   public int o(View var1) {
      return ((ef)var1.getLayoutParams()).d.right;
   }

   public void p() {
      if (this.q != null) {
         this.q.requestLayout();
      }

   }

   public boolean q() {
      return this.u;
   }

   public final boolean r() {
      return this.b;
   }

   public boolean s() {
      return this.t;
   }

   public boolean t() {
      boolean var1;
      if (this.q != null && this.q.h) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean u() {
      boolean var1;
      if (this.r != null && this.r.h()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public int v() {
      return android.support.v4.view.bz.g(this.q);
   }

   public void w() {
      for(int var1 = this.y() - 1; var1 >= 0; --var1) {
         this.p.a(var1);
      }

   }

   public int x() {
      return -1;
   }

   public int y() {
      int var1;
      if (this.p != null) {
         var1 = this.p.b();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int z() {
      return this.c;
   }
}
