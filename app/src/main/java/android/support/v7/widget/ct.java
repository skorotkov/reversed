package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow.OnDismissListener;
import java.lang.reflect.Method;

public class ct implements android.support.v7.view.menu.ah {
   private static Method a;
   private static Method b;
   private static Method h;
   private OnItemSelectedListener A;
   private final cz B;
   private final cy C;
   private final cw D;
   private Runnable E;
   private final Rect F;
   private Rect G;
   private boolean H;
   bv c;
   int d;
   final da e;
   final Handler f;
   PopupWindow g;
   private Context i;
   private ListAdapter j;
   private int k;
   private int l;
   private int m;
   private int n;
   private int o;
   private boolean p;
   private boolean q;
   private int r;
   private boolean s;
   private boolean t;
   private View u;
   private int v;
   private DataSetObserver w;
   private View x;
   private Drawable y;
   private OnItemClickListener z;

   static {
      try {
         a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
      } catch (NoSuchMethodException var3) {
         Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
      }

      try {
         b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
      } catch (NoSuchMethodException var2) {
         Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
      }

      try {
         h = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
      } catch (NoSuchMethodException var1) {
         Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
      }

   }

   public ct(Context var1) {
      this(var1, (AttributeSet)null, android.support.v7.a.b.listPopupWindowStyle);
   }

   public ct(Context var1, AttributeSet var2, int var3) {
      this(var1, var2, var3, 0);
   }

   public ct(Context var1, AttributeSet var2, int var3, int var4) {
      this.k = -2;
      this.l = -2;
      this.o = 1002;
      this.q = true;
      this.r = 0;
      this.s = false;
      this.t = false;
      this.d = Integer.MAX_VALUE;
      this.v = 0;
      this.e = new da(this);
      this.B = new cz(this);
      this.C = new cy(this);
      this.D = new cw(this);
      this.F = new Rect();
      this.i = var1;
      this.f = new Handler(var1.getMainLooper());
      TypedArray var5 = var1.obtainStyledAttributes(var2, android.support.v7.a.k.ListPopupWindow, var3, var4);
      this.m = var5.getDimensionPixelOffset(android.support.v7.a.k.ListPopupWindow_android_dropDownHorizontalOffset, 0);
      this.n = var5.getDimensionPixelOffset(android.support.v7.a.k.ListPopupWindow_android_dropDownVerticalOffset, 0);
      if (this.n != 0) {
         this.p = true;
      }

      var5.recycle();
      if (VERSION.SDK_INT >= 11) {
         this.g = new ar(var1, var2, var3, var4);
      } else {
         this.g = new ar(var1, var2, var3);
      }

      this.g.setInputMethodMode(1);
   }

   private int a(View var1, int var2, boolean var3) {
      if (b != null) {
         label23: {
            int var4;
            try {
               var4 = (Integer)b.invoke(this.g, var1, var2, var3);
            } catch (Exception var6) {
               Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
               break label23;
            }

            var2 = var4;
            return var2;
         }
      }

      var2 = this.g.getMaxAvailableHeight(var1, var2);
      return var2;
   }

   private void b() {
      if (this.u != null) {
         ViewParent var1 = this.u.getParent();
         if (var1 instanceof ViewGroup) {
            ((ViewGroup)var1).removeView(this.u);
         }
      }

   }

   private void b(boolean var1) {
      if (a != null) {
         try {
            a.invoke(this.g, var1);
         } catch (Exception var3) {
            Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
         }
      }

   }

   private int f() {
      boolean var1 = true;
      boolean var3;
      int var7;
      int var8;
      LayoutParams var15;
      if (this.c == null) {
         Context var2 = this.i;
         this.E = new cu(this);
         if (!this.H) {
            var3 = true;
         } else {
            var3 = false;
         }

         this.c = this.a(var2, var3);
         if (this.y != null) {
            this.c.setSelector(this.y);
         }

         this.c.setAdapter(this.j);
         this.c.setOnItemClickListener(this.z);
         this.c.setFocusable(true);
         this.c.setFocusableInTouchMode(true);
         this.c.setOnItemSelectedListener(new cv(this));
         this.c.setOnScrollListener(this.C);
         if (this.A != null) {
            this.c.setOnItemSelectedListener(this.A);
         }

         bv var4 = this.c;
         View var5 = this.u;
         Object var11;
         if (var5 != null) {
            var11 = new LinearLayout(var2);
            ((LinearLayout)var11).setOrientation(1);
            LayoutParams var6 = new LayoutParams(-1, 0, 1.0F);
            switch(this.v) {
            case 0:
               ((LinearLayout)var11).addView(var5);
               ((LinearLayout)var11).addView(var4, var6);
               break;
            case 1:
               ((LinearLayout)var11).addView(var4, var6);
               ((LinearLayout)var11).addView(var5);
               break;
            default:
               Log.e("ListPopupWindow", "Invalid hint position " + this.v);
            }

            if (this.l >= 0) {
               var7 = this.l;
               var8 = Integer.MIN_VALUE;
            } else {
               var8 = 0;
               var7 = 0;
            }

            var5.measure(MeasureSpec.makeMeasureSpec(var7, var8), 0);
            var15 = (LayoutParams)var5.getLayoutParams();
            var7 = var5.getMeasuredHeight();
            var8 = var15.topMargin;
            var8 = var15.bottomMargin + var7 + var8;
         } else {
            var11 = var4;
            var8 = 0;
         }

         this.g.setContentView((View)var11);
      } else {
         ViewGroup var12 = (ViewGroup)this.g.getContentView();
         View var13 = this.u;
         if (var13 != null) {
            var15 = (LayoutParams)var13.getLayoutParams();
            var8 = var13.getMeasuredHeight();
            var7 = var15.topMargin;
            var8 = var15.bottomMargin + var8 + var7;
         } else {
            var8 = 0;
         }
      }

      Drawable var14 = this.g.getBackground();
      if (var14 != null) {
         var14.getPadding(this.F);
         var7 = this.F.top + this.F.bottom;
         if (!this.p) {
            this.n = -this.F.top;
         }
      } else {
         this.F.setEmpty();
         var7 = 0;
      }

      if (this.g.getInputMethodMode() == 2) {
         var3 = var1;
      } else {
         var3 = false;
      }

      int var9 = this.a(this.i(), this.n, var3);
      if (!this.s && this.k != -1) {
         int var10;
         int var10001;
         switch(this.l) {
         case -2:
            var10001 = this.F.left + this.F.right;
            var10 = MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - var10001, Integer.MIN_VALUE);
            break;
         case -1:
            var10001 = this.F.left + this.F.right;
            var10 = MeasureSpec.makeMeasureSpec(this.i.getResources().getDisplayMetrics().widthPixels - var10001, 1073741824);
            break;
         default:
            var10 = MeasureSpec.makeMeasureSpec(this.l, 1073741824);
         }

         var9 = this.c.a(var10, 0, -1, var9 - var8, -1);
         var10 = var8;
         if (var9 > 0) {
            var10 = var8 + this.c.getPaddingTop() + this.c.getPaddingBottom() + var7;
         }

         var8 = var9 + var10;
      } else {
         var8 = var9 + var7;
      }

      return var8;
   }

   bv a(Context var1, boolean var2) {
      return new bv(var1, var2);
   }

   public void a() {
      boolean var1 = true;
      boolean var2 = false;
      byte var3 = -1;
      int var4 = this.f();
      boolean var5 = this.n();
      android.support.v4.widget.x.a(this.g, this.o);
      int var6;
      PopupWindow var7;
      if (this.g.isShowing()) {
         if (this.l == -1) {
            var6 = -1;
         } else if (this.l == -2) {
            var6 = this.i().getWidth();
         } else {
            var6 = this.l;
         }

         if (this.k == -1) {
            if (!var5) {
               var4 = -1;
            }

            byte var8;
            if (var5) {
               var7 = this.g;
               if (this.l == -1) {
                  var8 = -1;
               } else {
                  var8 = 0;
               }

               var7.setWidth(var8);
               this.g.setHeight(0);
            } else {
               var7 = this.g;
               if (this.l == -1) {
                  var8 = -1;
               } else {
                  var8 = 0;
               }

               var7.setWidth(var8);
               this.g.setHeight(-1);
            }
         } else if (this.k != -2) {
            var4 = this.k;
         }

         var7 = this.g;
         var1 = var2;
         if (!this.t) {
            var1 = var2;
            if (!this.s) {
               var1 = true;
            }
         }

         var7.setOutsideTouchable(var1);
         var7 = this.g;
         View var9 = this.i();
         int var10 = this.m;
         int var11 = this.n;
         int var13 = var6;
         if (var6 < 0) {
            var13 = -1;
         }

         if (var4 < 0) {
            var4 = var3;
         }

         var7.update(var9, var10, var11, var13, var4);
      } else {
         if (this.l == -1) {
            var6 = -1;
         } else if (this.l == -2) {
            var6 = this.i().getWidth();
         } else {
            var6 = this.l;
         }

         if (this.k == -1) {
            var4 = -1;
         } else if (this.k != -2) {
            var4 = this.k;
         }

         this.g.setWidth(var6);
         this.g.setHeight(var4);
         this.b(true);
         var7 = this.g;
         if (this.t || this.s) {
            var1 = false;
         }

         var7.setOutsideTouchable(var1);
         this.g.setTouchInterceptor(this.B);
         if (h != null) {
            try {
               h.invoke(this.g, this.G);
            } catch (Exception var12) {
               Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", var12);
            }
         }

         android.support.v4.widget.x.a(this.g, this.i(), this.m, this.n, this.r);
         this.c.setSelection(-1);
         if (!this.H || this.c.isInTouchMode()) {
            this.m();
         }

         if (!this.H) {
            this.f.post(this.D);
         }
      }

   }

   public void a(int var1) {
      this.v = var1;
   }

   public void a(Rect var1) {
      this.G = var1;
   }

   public void a(Drawable var1) {
      this.g.setBackgroundDrawable(var1);
   }

   public void a(OnItemClickListener var1) {
      this.z = var1;
   }

   public void a(ListAdapter var1) {
      if (this.w == null) {
         this.w = new cx(this);
      } else if (this.j != null) {
         this.j.unregisterDataSetObserver(this.w);
      }

      this.j = var1;
      if (this.j != null) {
         var1.registerDataSetObserver(this.w);
      }

      if (this.c != null) {
         this.c.setAdapter(this.j);
      }

   }

   public void a(OnDismissListener var1) {
      this.g.setOnDismissListener(var1);
   }

   public void a(boolean var1) {
      this.H = var1;
      this.g.setFocusable(var1);
   }

   public void b(int var1) {
      this.g.setAnimationStyle(var1);
   }

   public void b(View var1) {
      this.x = var1;
   }

   public void c() {
      this.g.dismiss();
      this.b();
      this.g.setContentView((View)null);
      this.c = null;
      this.f.removeCallbacks(this.e);
   }

   public void c(int var1) {
      this.m = var1;
   }

   public void d(int var1) {
      this.n = var1;
      this.p = true;
   }

   public boolean d() {
      return this.g.isShowing();
   }

   public ListView e() {
      return this.c;
   }

   public void e(int var1) {
      this.r = var1;
   }

   public void f(int var1) {
      this.l = var1;
   }

   public void g(int var1) {
      Drawable var2 = this.g.getBackground();
      if (var2 != null) {
         var2.getPadding(this.F);
         this.l = this.F.left + this.F.right + var1;
      } else {
         this.f(var1);
      }

   }

   public boolean g() {
      return this.H;
   }

   public Drawable h() {
      return this.g.getBackground();
   }

   public void h(int var1) {
      this.g.setInputMethodMode(var1);
   }

   public View i() {
      return this.x;
   }

   public void i(int var1) {
      bv var2 = this.c;
      if (this.d() && var2 != null) {
         var2.setListSelectionHidden(false);
         var2.setSelection(var1);
         if (VERSION.SDK_INT >= 11 && var2.getChoiceMode() != 0) {
            var2.setItemChecked(var1, true);
         }
      }

   }

   public int j() {
      return this.m;
   }

   public int k() {
      int var1;
      if (!this.p) {
         var1 = 0;
      } else {
         var1 = this.n;
      }

      return var1;
   }

   public int l() {
      return this.l;
   }

   public void m() {
      bv var1 = this.c;
      if (var1 != null) {
         var1.setListSelectionHidden(true);
         var1.requestLayout();
      }

   }

   public boolean n() {
      boolean var1;
      if (this.g.getInputMethodMode() == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
