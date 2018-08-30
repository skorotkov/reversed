package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
   private int A;
   private int B;
   private boolean C;
   private boolean D;
   private final ArrayList E;
   private final ArrayList F;
   private final int[] G;
   private final v H;
   private gq I;
   private gl J;
   private android.support.v7.view.menu.ac K;
   private android.support.v7.view.menu.n L;
   private boolean M;
   private final Runnable N;
   ImageButton a;
   View b;
   int c;
   gn d;
   private ActionMenuView e;
   private TextView f;
   private TextView g;
   private ImageButton h;
   private ImageView i;
   private Drawable j;
   private CharSequence k;
   private Context l;
   private int m;
   private int n;
   private int o;
   private int p;
   private int q;
   private int r;
   private int s;
   private int t;
   private fc u;
   private int v;
   private int w;
   private int x;
   private CharSequence y;
   private CharSequence z;

   public Toolbar(Context var1) {
      this(var1, (AttributeSet)null);
   }

   public Toolbar(Context var1, AttributeSet var2) {
      this(var1, var2, android.support.v7.a.b.toolbarStyle);
   }

   public Toolbar(Context var1, AttributeSet var2, int var3) {
      super(var1, var2, var3);
      this.x = 8388627;
      this.E = new ArrayList();
      this.F = new ArrayList();
      this.G = new int[2];
      this.H = new gi(this);
      this.N = new gj(this);
      gh var7 = gh.a(this.getContext(), var2, android.support.v7.a.k.Toolbar, var3, 0);
      this.n = var7.g(android.support.v7.a.k.Toolbar_titleTextAppearance, 0);
      this.o = var7.g(android.support.v7.a.k.Toolbar_subtitleTextAppearance, 0);
      this.x = var7.c(android.support.v7.a.k.Toolbar_android_gravity, this.x);
      this.c = var7.c(android.support.v7.a.k.Toolbar_buttonGravity, 48);
      int var4 = var7.d(android.support.v7.a.k.Toolbar_titleMargin, 0);
      var3 = var4;
      if (var7.f(android.support.v7.a.k.Toolbar_titleMargins)) {
         var3 = var7.d(android.support.v7.a.k.Toolbar_titleMargins, var4);
      }

      this.t = var3;
      this.s = var3;
      this.r = var3;
      this.q = var3;
      var3 = var7.d(android.support.v7.a.k.Toolbar_titleMarginStart, -1);
      if (var3 >= 0) {
         this.q = var3;
      }

      var3 = var7.d(android.support.v7.a.k.Toolbar_titleMarginEnd, -1);
      if (var3 >= 0) {
         this.r = var3;
      }

      var3 = var7.d(android.support.v7.a.k.Toolbar_titleMarginTop, -1);
      if (var3 >= 0) {
         this.s = var3;
      }

      var3 = var7.d(android.support.v7.a.k.Toolbar_titleMarginBottom, -1);
      if (var3 >= 0) {
         this.t = var3;
      }

      this.p = var7.e(android.support.v7.a.k.Toolbar_maxButtonHeight, -1);
      int var5 = var7.d(android.support.v7.a.k.Toolbar_contentInsetStart, Integer.MIN_VALUE);
      var3 = var7.d(android.support.v7.a.k.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
      int var6 = var7.e(android.support.v7.a.k.Toolbar_contentInsetLeft, 0);
      var4 = var7.e(android.support.v7.a.k.Toolbar_contentInsetRight, 0);
      this.n();
      this.u.b(var6, var4);
      if (var5 != Integer.MIN_VALUE || var3 != Integer.MIN_VALUE) {
         this.u.a(var5, var3);
      }

      this.v = var7.d(android.support.v7.a.k.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
      this.w = var7.d(android.support.v7.a.k.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
      this.j = var7.a(android.support.v7.a.k.Toolbar_collapseIcon);
      this.k = var7.b(android.support.v7.a.k.Toolbar_collapseContentDescription);
      CharSequence var8 = var7.b(android.support.v7.a.k.Toolbar_title);
      if (!TextUtils.isEmpty(var8)) {
         this.setTitle(var8);
      }

      var8 = var7.b(android.support.v7.a.k.Toolbar_subtitle);
      if (!TextUtils.isEmpty(var8)) {
         this.setSubtitle(var8);
      }

      this.l = this.getContext();
      this.setPopupTheme(var7.g(android.support.v7.a.k.Toolbar_popupTheme, 0));
      Drawable var9 = var7.a(android.support.v7.a.k.Toolbar_navigationIcon);
      if (var9 != null) {
         this.setNavigationIcon(var9);
      }

      var8 = var7.b(android.support.v7.a.k.Toolbar_navigationContentDescription);
      if (!TextUtils.isEmpty(var8)) {
         this.setNavigationContentDescription(var8);
      }

      var9 = var7.a(android.support.v7.a.k.Toolbar_logo);
      if (var9 != null) {
         this.setLogo(var9);
      }

      var8 = var7.b(android.support.v7.a.k.Toolbar_logoDescription);
      if (!TextUtils.isEmpty(var8)) {
         this.setLogoDescription(var8);
      }

      if (var7.f(android.support.v7.a.k.Toolbar_titleTextColor)) {
         this.setTitleTextColor(var7.b(android.support.v7.a.k.Toolbar_titleTextColor, -1));
      }

      if (var7.f(android.support.v7.a.k.Toolbar_subtitleTextColor)) {
         this.setSubtitleTextColor(var7.b(android.support.v7.a.k.Toolbar_subtitleTextColor, -1));
      }

      var7.a();
   }

   private int a(int var1) {
      int var2 = var1 & 112;
      var1 = var2;
      switch(var2) {
      default:
         var1 = this.x & 112;
      case 16:
      case 48:
      case 80:
         return var1;
      }
   }

   private int a(View var1, int var2) {
      gm var3 = (gm)var1.getLayoutParams();
      int var4 = var1.getMeasuredHeight();
      if (var2 > 0) {
         var2 = (var4 - var2) / 2;
      } else {
         var2 = 0;
      }

      switch(this.a(var3.a)) {
      case 48:
         var2 = this.getPaddingTop() - var2;
         break;
      case 80:
         var2 = this.getHeight() - this.getPaddingBottom() - var4 - var3.bottomMargin - var2;
         break;
      default:
         int var5 = this.getPaddingTop();
         int var6 = this.getPaddingBottom();
         int var7 = this.getHeight();
         var2 = (var7 - var5 - var6 - var4) / 2;
         if (var2 < var3.topMargin) {
            var2 = var3.topMargin;
         } else {
            var4 = var7 - var6 - var4 - var2 - var5;
            if (var4 < var3.bottomMargin) {
               var2 = Math.max(0, var2 - (var3.bottomMargin - var4));
            }
         }

         var2 += var5;
      }

      return var2;
   }

   private int a(View var1, int var2, int var3, int var4, int var5, int[] var6) {
      MarginLayoutParams var7 = (MarginLayoutParams)var1.getLayoutParams();
      int var8 = var7.leftMargin - var6[0];
      int var9 = var7.rightMargin - var6[1];
      int var10 = Math.max(0, var8) + Math.max(0, var9);
      var6[0] = Math.max(0, -var8);
      var6[1] = Math.max(0, -var9);
      var1.measure(getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var10 + var3, var7.width), getChildMeasureSpec(var4, this.getPaddingTop() + this.getPaddingBottom() + var7.topMargin + var7.bottomMargin + var5, var7.height));
      return var1.getMeasuredWidth() + var10;
   }

   private int a(View var1, int var2, int[] var3, int var4) {
      gm var5 = (gm)var1.getLayoutParams();
      int var6 = var5.leftMargin - var3[0];
      var2 += Math.max(0, var6);
      var3[0] = Math.max(0, -var6);
      var4 = this.a(var1, var4);
      var6 = var1.getMeasuredWidth();
      var1.layout(var2, var4, var2 + var6, var1.getMeasuredHeight() + var4);
      return var5.rightMargin + var6 + var2;
   }

   private int a(List var1, int[] var2) {
      int var3 = var2[0];
      int var4 = var2[1];
      int var5 = var1.size();
      int var6 = 0;

      int var7;
      int var9;
      int var10;
      int var11;
      for(var7 = 0; var6 < var5; var7 += var11 + var9 + var10) {
         View var12 = (View)var1.get(var6);
         gm var8 = (gm)var12.getLayoutParams();
         var3 = var8.leftMargin - var3;
         var4 = var8.rightMargin - var4;
         var9 = Math.max(0, var3);
         var10 = Math.max(0, var4);
         var3 = Math.max(0, -var3);
         var4 = Math.max(0, -var4);
         var11 = var12.getMeasuredWidth();
         ++var6;
      }

      return var7;
   }

   private void a(View var1, int var2, int var3, int var4, int var5, int var6) {
      MarginLayoutParams var7 = (MarginLayoutParams)var1.getLayoutParams();
      int var8 = getChildMeasureSpec(var2, this.getPaddingLeft() + this.getPaddingRight() + var7.leftMargin + var7.rightMargin + var3, var7.width);
      var3 = getChildMeasureSpec(var4, this.getPaddingTop() + this.getPaddingBottom() + var7.topMargin + var7.bottomMargin + var5, var7.height);
      var4 = MeasureSpec.getMode(var3);
      var2 = var3;
      if (var4 != 1073741824) {
         var2 = var3;
         if (var6 >= 0) {
            var2 = var6;
            if (var4 != 0) {
               var2 = Math.min(MeasureSpec.getSize(var3), var6);
            }

            var2 = MeasureSpec.makeMeasureSpec(var2, 1073741824);
         }
      }

      var1.measure(var8, var2);
   }

   private void a(View var1, boolean var2) {
      LayoutParams var3 = var1.getLayoutParams();
      gm var4;
      if (var3 == null) {
         var4 = this.e();
      } else if (!this.checkLayoutParams(var3)) {
         var4 = this.a(var3);
      } else {
         var4 = (gm)var3;
      }

      var4.b = 1;
      if (var2 && this.b != null) {
         var1.setLayoutParams(var4);
         this.F.add(var1);
      } else {
         this.addView(var1, var4);
      }

   }

   private void a(List var1, int var2) {
      boolean var3 = true;
      byte var4 = 0;
      if (android.support.v4.view.bz.g(this) != 1) {
         var3 = false;
      }

      int var5 = this.getChildCount();
      int var6 = android.support.v4.view.y.a(var2, android.support.v4.view.bz.g(this));
      var1.clear();
      var2 = var4;
      if (var3) {
         for(var2 = var5 - 1; var2 >= 0; --var2) {
            View var9 = this.getChildAt(var2);
            gm var10 = (gm)var9.getLayoutParams();
            if (var10.b == 0 && this.a(var9) && this.b(var10.a) == var6) {
               var1.add(var9);
            }
         }
      } else {
         for(; var2 < var5; ++var2) {
            View var8 = this.getChildAt(var2);
            gm var7 = (gm)var8.getLayoutParams();
            if (var7.b == 0 && this.a(var8) && this.b(var7.a) == var6) {
               var1.add(var8);
            }
         }
      }

   }

   private boolean a(View var1) {
      boolean var2;
      if (var1 != null && var1.getParent() == this && var1.getVisibility() != 8) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private int b(int var1) {
      int var2 = android.support.v4.view.bz.g(this);
      int var3 = android.support.v4.view.y.a(var1, var2) & 7;
      var1 = var3;
      switch(var3) {
      case 2:
      case 4:
      default:
         if (var2 == 1) {
            var1 = 5;
         } else {
            var1 = 3;
         }
      case 1:
      case 3:
      case 5:
         return var1;
      }
   }

   private int b(View var1) {
      MarginLayoutParams var3 = (MarginLayoutParams)var1.getLayoutParams();
      int var2 = android.support.v4.view.at.a(var3);
      return android.support.v4.view.at.b(var3) + var2;
   }

   private int b(View var1, int var2, int[] var3, int var4) {
      gm var5 = (gm)var1.getLayoutParams();
      int var6 = var5.rightMargin - var3[1];
      var2 -= Math.max(0, var6);
      var3[1] = Math.max(0, -var6);
      var4 = this.a(var1, var4);
      var6 = var1.getMeasuredWidth();
      var1.layout(var2 - var6, var4, var2, var1.getMeasuredHeight() + var4);
      return var2 - (var5.leftMargin + var6);
   }

   private int c(View var1) {
      MarginLayoutParams var3 = (MarginLayoutParams)var1.getLayoutParams();
      int var2 = var3.topMargin;
      return var3.bottomMargin + var2;
   }

   private boolean d(View var1) {
      boolean var2;
      if (var1.getParent() != this && !this.F.contains(var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   private MenuInflater getMenuInflater() {
      return new android.support.v7.view.d(this.getContext());
   }

   private void h() {
      if (this.i == null) {
         this.i = new aq(this.getContext());
      }

   }

   private void i() {
      this.j();
      if (this.e.c() == null) {
         android.support.v7.view.menu.m var1 = (android.support.v7.view.menu.m)this.e.getMenu();
         if (this.J == null) {
            this.J = new gl(this);
         }

         this.e.setExpandedActionViewsExclusive(true);
         var1.a((android.support.v7.view.menu.ab)this.J, (Context)this.l);
      }

   }

   private void j() {
      if (this.e == null) {
         this.e = new ActionMenuView(this.getContext());
         this.e.setPopupTheme(this.m);
         this.e.setOnMenuItemClickListener(this.H);
         this.e.a(this.K, this.L);
         gm var1 = this.e();
         var1.a = 8388613 | this.c & 112;
         this.e.setLayoutParams(var1);
         this.a(this.e, false);
      }

   }

   private void k() {
      if (this.h == null) {
         this.h = new ao(this.getContext(), (AttributeSet)null, android.support.v7.a.b.toolbarNavigationButtonStyle);
         gm var1 = this.e();
         var1.a = 8388611 | this.c & 112;
         this.h.setLayoutParams(var1);
      }

   }

   private void l() {
      this.removeCallbacks(this.N);
      this.post(this.N);
   }

   private boolean m() {
      boolean var1 = false;
      boolean var2;
      if (!this.M) {
         var2 = var1;
      } else {
         int var3 = this.getChildCount();
         int var4 = 0;

         while(true) {
            if (var4 >= var3) {
               var2 = true;
               break;
            }

            View var5 = this.getChildAt(var4);
            if (this.a(var5) && var5.getMeasuredWidth() > 0) {
               var2 = var1;
               if (var5.getMeasuredHeight() > 0) {
                  break;
               }
            }

            ++var4;
         }
      }

      return var2;
   }

   private void n() {
      if (this.u == null) {
         this.u = new fc();
      }

   }

   public gm a(AttributeSet var1) {
      return new gm(this.getContext(), var1);
   }

   protected gm a(LayoutParams var1) {
      gm var2;
      if (var1 instanceof gm) {
         var2 = new gm((gm)var1);
      } else if (var1 instanceof android.support.v7.app.b) {
         var2 = new gm((android.support.v7.app.b)var1);
      } else if (var1 instanceof MarginLayoutParams) {
         var2 = new gm((MarginLayoutParams)var1);
      } else {
         var2 = new gm(var1);
      }

      return var2;
   }

   public void a(int var1, int var2) {
      this.n();
      this.u.a(var1, var2);
   }

   public void a(Context var1, int var2) {
      this.n = var2;
      if (this.f != null) {
         this.f.setTextAppearance(var1, var2);
      }

   }

   public boolean a() {
      boolean var1;
      if (this.e != null && this.e.e()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void b(Context var1, int var2) {
      this.o = var2;
      if (this.g != null) {
         this.g.setTextAppearance(var1, var2);
      }

   }

   public boolean b() {
      boolean var1;
      if (this.e != null && this.e.d()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void c() {
      android.support.v7.view.menu.p var1;
      if (this.J == null) {
         var1 = null;
      } else {
         var1 = this.J.b;
      }

      if (var1 != null) {
         var1.collapseActionView();
      }

   }

   protected boolean checkLayoutParams(LayoutParams var1) {
      boolean var2;
      if (super.checkLayoutParams(var1) && var1 instanceof gm) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   void d() {
      if (this.a == null) {
         this.a = new ao(this.getContext(), (AttributeSet)null, android.support.v7.a.b.toolbarNavigationButtonStyle);
         this.a.setImageDrawable(this.j);
         this.a.setContentDescription(this.k);
         gm var1 = this.e();
         var1.a = 8388611 | this.c & 112;
         var1.b = 2;
         this.a.setLayoutParams(var1);
         this.a.setOnClickListener(new gk(this));
      }

   }

   protected gm e() {
      return new gm(-2, -2);
   }

   void f() {
      for(int var1 = this.getChildCount() - 1; var1 >= 0; --var1) {
         View var2 = this.getChildAt(var1);
         if (((gm)var2.getLayoutParams()).b != 2 && var2 != this.e) {
            this.removeViewAt(var1);
            this.F.add(var2);
         }
      }

   }

   void g() {
      for(int var1 = this.F.size() - 1; var1 >= 0; --var1) {
         this.addView((View)this.F.get(var1));
      }

      this.F.clear();
   }

   // $FF: synthetic method
   protected LayoutParams generateDefaultLayoutParams() {
      return this.e();
   }

   // $FF: synthetic method
   public LayoutParams generateLayoutParams(AttributeSet var1) {
      return this.a(var1);
   }

   // $FF: synthetic method
   protected LayoutParams generateLayoutParams(LayoutParams var1) {
      return this.a(var1);
   }

   public int getContentInsetEnd() {
      int var1;
      if (this.u != null) {
         var1 = this.u.d();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getContentInsetEndWithActions() {
      int var1;
      if (this.w != Integer.MIN_VALUE) {
         var1 = this.w;
      } else {
         var1 = this.getContentInsetEnd();
      }

      return var1;
   }

   public int getContentInsetLeft() {
      int var1;
      if (this.u != null) {
         var1 = this.u.a();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getContentInsetRight() {
      int var1;
      if (this.u != null) {
         var1 = this.u.b();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getContentInsetStart() {
      int var1;
      if (this.u != null) {
         var1 = this.u.c();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public int getContentInsetStartWithNavigation() {
      int var1;
      if (this.v != Integer.MIN_VALUE) {
         var1 = this.v;
      } else {
         var1 = this.getContentInsetStart();
      }

      return var1;
   }

   public int getCurrentContentInsetEnd() {
      boolean var2;
      if (this.e != null) {
         android.support.v7.view.menu.m var1 = this.e.c();
         if (var1 != null && var1.hasVisibleItems()) {
            var2 = true;
         } else {
            var2 = false;
         }
      } else {
         var2 = false;
      }

      int var3;
      if (var2) {
         var3 = Math.max(this.getContentInsetEnd(), Math.max(this.w, 0));
      } else {
         var3 = this.getContentInsetEnd();
      }

      return var3;
   }

   public int getCurrentContentInsetLeft() {
      int var1;
      if (android.support.v4.view.bz.g(this) == 1) {
         var1 = this.getCurrentContentInsetEnd();
      } else {
         var1 = this.getCurrentContentInsetStart();
      }

      return var1;
   }

   public int getCurrentContentInsetRight() {
      int var1;
      if (android.support.v4.view.bz.g(this) == 1) {
         var1 = this.getCurrentContentInsetStart();
      } else {
         var1 = this.getCurrentContentInsetEnd();
      }

      return var1;
   }

   public int getCurrentContentInsetStart() {
      int var1;
      if (this.getNavigationIcon() != null) {
         var1 = Math.max(this.getContentInsetStart(), Math.max(this.v, 0));
      } else {
         var1 = this.getContentInsetStart();
      }

      return var1;
   }

   public Drawable getLogo() {
      Drawable var1;
      if (this.i != null) {
         var1 = this.i.getDrawable();
      } else {
         var1 = null;
      }

      return var1;
   }

   public CharSequence getLogoDescription() {
      CharSequence var1;
      if (this.i != null) {
         var1 = this.i.getContentDescription();
      } else {
         var1 = null;
      }

      return var1;
   }

   public Menu getMenu() {
      this.i();
      return this.e.getMenu();
   }

   public CharSequence getNavigationContentDescription() {
      CharSequence var1;
      if (this.h != null) {
         var1 = this.h.getContentDescription();
      } else {
         var1 = null;
      }

      return var1;
   }

   public Drawable getNavigationIcon() {
      Drawable var1;
      if (this.h != null) {
         var1 = this.h.getDrawable();
      } else {
         var1 = null;
      }

      return var1;
   }

   public Drawable getOverflowIcon() {
      this.i();
      return this.e.getOverflowIcon();
   }

   public int getPopupTheme() {
      return this.m;
   }

   public CharSequence getSubtitle() {
      return this.z;
   }

   public CharSequence getTitle() {
      return this.y;
   }

   public int getTitleMarginBottom() {
      return this.t;
   }

   public int getTitleMarginEnd() {
      return this.r;
   }

   public int getTitleMarginStart() {
      return this.q;
   }

   public int getTitleMarginTop() {
      return this.s;
   }

   public bh getWrapper() {
      if (this.I == null) {
         this.I = new gq(this, true);
      }

      return this.I;
   }

   protected void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.removeCallbacks(this.N);
   }

   public boolean onHoverEvent(MotionEvent var1) {
      int var2 = android.support.v4.view.bg.a(var1);
      if (var2 == 9) {
         this.D = false;
      }

      if (!this.D) {
         boolean var3 = super.onHoverEvent(var1);
         if (var2 == 9 && !var3) {
            this.D = true;
         }
      }

      if (var2 == 10 || var2 == 3) {
         this.D = false;
      }

      return true;
   }

   protected void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      boolean var6;
      if (android.support.v4.view.bz.g(this) == 1) {
         var6 = true;
      } else {
         var6 = false;
      }

      int var7 = this.getWidth();
      int var8 = this.getHeight();
      int var9 = this.getPaddingLeft();
      int var10 = this.getPaddingRight();
      int var11 = this.getPaddingTop();
      int var12 = this.getPaddingBottom();
      var2 = var7 - var10;
      int[] var13 = this.G;
      var13[1] = 0;
      var13[0] = 0;
      var4 = android.support.v4.view.bz.o(this);
      int var14;
      if (var4 >= 0) {
         var14 = Math.min(var4, var5 - var3);
      } else {
         var14 = 0;
      }

      if (this.a((View)this.h)) {
         if (var6) {
            var2 = this.b(this.h, var2, var13, var14);
            var3 = var9;
         } else {
            var3 = this.a(this.h, var9, var13, var14);
         }
      } else {
         var3 = var9;
      }

      var4 = var2;
      var5 = var3;
      if (this.a((View)this.a)) {
         if (var6) {
            var4 = this.b(this.a, var2, var13, var14);
            var5 = var3;
         } else {
            var5 = this.a(this.a, var3, var13, var14);
            var4 = var2;
         }
      }

      var2 = var4;
      var3 = var5;
      if (this.a((View)this.e)) {
         if (var6) {
            var3 = this.a(this.e, var5, var13, var14);
            var2 = var4;
         } else {
            var2 = this.b(this.e, var4, var13, var14);
            var3 = var5;
         }
      }

      var4 = this.getCurrentContentInsetLeft();
      var5 = this.getCurrentContentInsetRight();
      var13[0] = Math.max(0, var4 - var3);
      var13[1] = Math.max(0, var5 - (var7 - var10 - var2));
      var4 = Math.max(var3, var4);
      var5 = Math.min(var2, var7 - var10 - var5);
      var3 = var5;
      var2 = var4;
      if (this.a(this.b)) {
         if (var6) {
            var3 = this.b(this.b, var5, var13, var14);
            var2 = var4;
         } else {
            var2 = this.a(this.b, var4, var13, var14);
            var3 = var5;
         }
      }

      if (this.a((View)this.i)) {
         if (var6) {
            var3 = this.b(this.i, var3, var13, var14);
            var4 = var2;
         } else {
            var4 = this.a(this.i, var2, var13, var14);
         }
      } else {
         var4 = var2;
      }

      var1 = this.a((View)this.f);
      boolean var15 = this.a((View)this.g);
      var2 = 0;
      gm var16;
      if (var1) {
         var16 = (gm)this.f.getLayoutParams();
         var2 = var16.topMargin;
         var5 = this.f.getMeasuredHeight();
         var2 = 0 + var16.bottomMargin + var2 + var5;
      }

      int var18;
      if (var15) {
         var16 = (gm)this.g.getLayoutParams();
         int var17 = var16.topMargin;
         var5 = this.g.getMeasuredHeight();
         var18 = var16.bottomMargin + var17 + var5 + var2;
      } else {
         var18 = var2;
      }

      label189: {
         if (!var1) {
            var5 = var3;
            var2 = var4;
            if (!var15) {
               break label189;
            }
         }

         TextView var22;
         if (var1) {
            var22 = this.f;
         } else {
            var22 = this.g;
         }

         TextView var19;
         if (var15) {
            var19 = this.g;
         } else {
            var19 = this.f;
         }

         var16 = (gm)var22.getLayoutParams();
         gm var24 = (gm)var19.getLayoutParams();
         boolean var23;
         if ((!var1 || this.f.getMeasuredWidth() <= 0) && (!var15 || this.g.getMeasuredWidth() <= 0)) {
            var23 = false;
         } else {
            var23 = true;
         }

         switch(this.x & 112) {
         case 48:
            var2 = this.getPaddingTop();
            var2 = var16.topMargin + var2 + this.s;
            break;
         case 80:
            var2 = var8 - var12 - var24.bottomMargin - this.t - var18;
            break;
         default:
            var2 = (var8 - var11 - var12 - var18) / 2;
            if (var2 < var16.topMargin + this.s) {
               var2 = var16.topMargin + this.s;
            } else {
               var5 = var8 - var12 - var18 - var2 - var11;
               if (var5 < var16.bottomMargin + this.t) {
                  var2 = Math.max(0, var2 - (var24.bottomMargin + this.t - var5));
               }
            }

            var2 += var11;
         }

         int var20;
         if (var6) {
            if (var23) {
               var5 = this.q;
            } else {
               var5 = 0;
            }

            var5 -= var13[1];
            var3 -= Math.max(0, var5);
            var13[1] = Math.max(0, -var5);
            if (var1) {
               var16 = (gm)this.f.getLayoutParams();
               var5 = var3 - this.f.getMeasuredWidth();
               var18 = this.f.getMeasuredHeight() + var2;
               this.f.layout(var5, var2, var3, var18);
               var20 = this.r;
               var2 = var18 + var16.bottomMargin;
               var5 -= var20;
            } else {
               var5 = var3;
            }

            if (var15) {
               var16 = (gm)this.g.getLayoutParams();
               var18 = var16.topMargin + var2;
               var2 = this.g.getMeasuredWidth();
               var20 = this.g.getMeasuredHeight() + var18;
               this.g.layout(var3 - var2, var18, var3, var20);
               var2 = this.r;
               var20 = var16.bottomMargin;
               var2 = var3 - var2;
            } else {
               var2 = var3;
            }

            if (var23) {
               var2 = Math.min(var5, var2);
            } else {
               var2 = var3;
            }

            var5 = var2;
            var2 = var4;
         } else {
            if (var23) {
               var5 = this.q;
            } else {
               var5 = 0;
            }

            var5 -= var13[0];
            var4 += Math.max(0, var5);
            var13[0] = Math.max(0, -var5);
            if (var1) {
               var16 = (gm)this.f.getLayoutParams();
               var20 = this.f.getMeasuredWidth() + var4;
               var5 = this.f.getMeasuredHeight() + var2;
               this.f.layout(var4, var2, var20, var5);
               var18 = this.r;
               var2 = var16.bottomMargin;
               var20 += var18;
               var2 += var5;
            } else {
               var20 = var4;
            }

            if (var15) {
               var16 = (gm)this.g.getLayoutParams();
               var5 = var2 + var16.topMargin;
               var2 = this.g.getMeasuredWidth() + var4;
               var18 = this.g.getMeasuredHeight() + var5;
               this.g.layout(var4, var5, var2, var18);
               var18 = this.r;
               var5 = var16.bottomMargin;
               var18 += var2;
            } else {
               var18 = var4;
            }

            var5 = var3;
            var2 = var4;
            if (var23) {
               var2 = Math.max(var20, var18);
               var5 = var3;
            }
         }
      }

      this.a((List)this.E, 3);
      var4 = this.E.size();

      for(var3 = 0; var3 < var4; ++var3) {
         var2 = this.a((View)this.E.get(var3), var2, var13, var14);
      }

      this.a((List)this.E, 5);
      var4 = this.E.size();

      for(var3 = 0; var3 < var4; ++var3) {
         var5 = this.b((View)this.E.get(var3), var5, var13, var14);
      }

      this.a((List)this.E, 1);
      var4 = this.a(this.E, var13);
      var3 = (var7 - var9 - var10) / 2 + var9 - var4 / 2;
      var4 += var3;
      if (var3 >= var2) {
         var2 = var3;
         if (var4 > var5) {
            var2 = var3 - (var4 - var5);
         }
      }

      var5 = this.E.size();
      byte var21 = 0;
      var3 = var2;

      for(var2 = var21; var2 < var5; ++var2) {
         var3 = this.a((View)this.E.get(var2), var3, var13, var14);
      }

      this.E.clear();
   }

   protected void onMeasure(int var1, int var2) {
      int var3 = 0;
      int var4 = 0;
      int[] var5 = this.G;
      byte var6;
      byte var7;
      if (gx.a(this)) {
         var6 = 0;
         var7 = 1;
      } else {
         var6 = 1;
         var7 = 0;
      }

      int var8 = 0;
      if (this.a((View)this.h)) {
         this.a(this.h, var1, 0, var2, 0, this.p);
         var8 = this.h.getMeasuredWidth() + this.b(this.h);
         var3 = Math.max(0, this.h.getMeasuredHeight() + this.c(this.h));
         var4 = gx.a(0, android.support.v4.view.bz.j(this.h));
      }

      int var9 = var8;
      int var10 = var4;
      var8 = var3;
      if (this.a((View)this.a)) {
         this.a(this.a, var1, 0, var2, 0, this.p);
         var9 = this.a.getMeasuredWidth() + this.b(this.a);
         var8 = Math.max(var3, this.a.getMeasuredHeight() + this.c(this.a));
         var10 = gx.a(var4, android.support.v4.view.bz.j(this.a));
      }

      var4 = this.getCurrentContentInsetStart();
      int var11 = 0 + Math.max(var4, var9);
      var5[var7] = Math.max(0, var4 - var9);
      int var16 = 0;
      var3 = var10;
      var4 = var8;
      if (this.a((View)this.e)) {
         this.a(this.e, var1, var11, var2, 0, this.p);
         var16 = this.e.getMeasuredWidth() + this.b(this.e);
         var4 = Math.max(var8, this.e.getMeasuredHeight() + this.c(this.e));
         var3 = gx.a(var10, android.support.v4.view.bz.j(this.e));
      }

      var8 = this.getCurrentContentInsetEnd();
      var9 = var11 + Math.max(var8, var16);
      var5[var6] = Math.max(0, var8 - var16);
      var16 = var9;
      var8 = var3;
      var10 = var4;
      if (this.a(this.b)) {
         var16 = var9 + this.a(this.b, var1, var9, var2, 0, var5);
         var10 = Math.max(var4, this.b.getMeasuredHeight() + this.c(this.b));
         var8 = gx.a(var3, android.support.v4.view.bz.j(this.b));
      }

      var4 = var16;
      var3 = var8;
      int var15 = var10;
      if (this.a((View)this.i)) {
         var4 = var16 + this.a(this.i, var1, var16, var2, 0, var5);
         var15 = Math.max(var10, this.i.getMeasuredHeight() + this.c(this.i));
         var3 = gx.a(var8, android.support.v4.view.bz.j(this.i));
      }

      var9 = this.getChildCount();
      var7 = 0;
      var10 = var15;
      var8 = var3;
      var3 = var7;

      for(var16 = var4; var3 < var9; ++var3) {
         View var12 = this.getChildAt(var3);
         if (((gm)var12.getLayoutParams()).b == 0 && this.a(var12)) {
            var16 += this.a(var12, var1, var16, var2, 0, var5);
            var10 = Math.max(var10, var12.getMeasuredHeight() + this.c(var12));
            var8 = gx.a(var8, android.support.v4.view.bz.j(var12));
         }
      }

      var15 = 0;
      var3 = 0;
      int var13 = this.s + this.t;
      int var14 = this.q + this.r;
      var4 = var8;
      if (this.a((View)this.f)) {
         this.a(this.f, var1, var16 + var14, var2, var13, var5);
         var4 = this.f.getMeasuredWidth();
         var15 = this.b(this.f) + var4;
         var3 = this.f.getMeasuredHeight() + this.c(this.f);
         var4 = gx.a(var8, android.support.v4.view.bz.j(this.f));
      }

      var11 = var3;
      var9 = var15;
      var8 = var4;
      if (this.a((View)this.g)) {
         var9 = Math.max(var15, this.a(this.g, var1, var16 + var14, var2, var13 + var3, var5));
         var11 = var3 + this.g.getMeasuredHeight() + this.c(this.g);
         var8 = gx.a(var4, android.support.v4.view.bz.j(this.g));
      }

      var10 = Math.max(var10, var11);
      var11 = this.getPaddingLeft();
      var15 = this.getPaddingRight();
      var4 = this.getPaddingTop();
      var3 = this.getPaddingBottom();
      var15 = android.support.v4.view.bz.a(Math.max(var9 + var16 + var11 + var15, this.getSuggestedMinimumWidth()), var1, -16777216 & var8);
      var1 = android.support.v4.view.bz.a(Math.max(var10 + var4 + var3, this.getSuggestedMinimumHeight()), var2, var8 << 16);
      if (this.m()) {
         var1 = 0;
      }

      this.setMeasuredDimension(var15, var1);
   }

   protected void onRestoreInstanceState(Parcelable var1) {
      if (!(var1 instanceof go)) {
         super.onRestoreInstanceState(var1);
      } else {
         go var2 = (go)var1;
         super.onRestoreInstanceState(var2.a());
         android.support.v7.view.menu.m var3;
         if (this.e != null) {
            var3 = this.e.c();
         } else {
            var3 = null;
         }

         if (var2.b != 0 && this.J != null && var3 != null) {
            MenuItem var4 = var3.findItem(var2.b);
            if (var4 != null) {
               android.support.v4.view.ay.a(var4);
            }
         }

         if (var2.c) {
            this.l();
         }
      }

   }

   public void onRtlPropertiesChanged(int var1) {
      boolean var2 = true;
      if (VERSION.SDK_INT >= 17) {
         super.onRtlPropertiesChanged(var1);
      }

      this.n();
      fc var3 = this.u;
      if (var1 != 1) {
         var2 = false;
      }

      var3.a(var2);
   }

   protected Parcelable onSaveInstanceState() {
      go var1 = new go(super.onSaveInstanceState());
      if (this.J != null && this.J.b != null) {
         var1.b = this.J.b.getItemId();
      }

      var1.c = this.a();
      return var1;
   }

   public boolean onTouchEvent(MotionEvent var1) {
      int var2 = android.support.v4.view.bg.a(var1);
      if (var2 == 0) {
         this.C = false;
      }

      if (!this.C) {
         boolean var3 = super.onTouchEvent(var1);
         if (var2 == 0 && !var3) {
            this.C = true;
         }
      }

      if (var2 == 1 || var2 == 3) {
         this.C = false;
      }

      return true;
   }

   public void setCollapsible(boolean var1) {
      this.M = var1;
      this.requestLayout();
   }

   public void setContentInsetEndWithActions(int var1) {
      int var2 = var1;
      if (var1 < 0) {
         var2 = Integer.MIN_VALUE;
      }

      if (var2 != this.w) {
         this.w = var2;
         if (this.getNavigationIcon() != null) {
            this.requestLayout();
         }
      }

   }

   public void setContentInsetStartWithNavigation(int var1) {
      int var2 = var1;
      if (var1 < 0) {
         var2 = Integer.MIN_VALUE;
      }

      if (var2 != this.v) {
         this.v = var2;
         if (this.getNavigationIcon() != null) {
            this.requestLayout();
         }
      }

   }

   public void setLogo(int var1) {
      this.setLogo(android.support.v7.b.a.b.b(this.getContext(), var1));
   }

   public void setLogo(Drawable var1) {
      if (var1 != null) {
         this.h();
         if (!this.d(this.i)) {
            this.a(this.i, true);
         }
      } else if (this.i != null && this.d(this.i)) {
         this.removeView(this.i);
         this.F.remove(this.i);
      }

      if (this.i != null) {
         this.i.setImageDrawable(var1);
      }

   }

   public void setLogoDescription(int var1) {
      this.setLogoDescription(this.getContext().getText(var1));
   }

   public void setLogoDescription(CharSequence var1) {
      if (!TextUtils.isEmpty(var1)) {
         this.h();
      }

      if (this.i != null) {
         this.i.setContentDescription(var1);
      }

   }

   public void setNavigationContentDescription(int var1) {
      CharSequence var2;
      if (var1 != 0) {
         var2 = this.getContext().getText(var1);
      } else {
         var2 = null;
      }

      this.setNavigationContentDescription(var2);
   }

   public void setNavigationContentDescription(CharSequence var1) {
      if (!TextUtils.isEmpty(var1)) {
         this.k();
      }

      if (this.h != null) {
         this.h.setContentDescription(var1);
      }

   }

   public void setNavigationIcon(int var1) {
      this.setNavigationIcon(android.support.v7.b.a.b.b(this.getContext(), var1));
   }

   public void setNavigationIcon(Drawable var1) {
      if (var1 != null) {
         this.k();
         if (!this.d(this.h)) {
            this.a(this.h, true);
         }
      } else if (this.h != null && this.d(this.h)) {
         this.removeView(this.h);
         this.F.remove(this.h);
      }

      if (this.h != null) {
         this.h.setImageDrawable(var1);
      }

   }

   public void setNavigationOnClickListener(OnClickListener var1) {
      this.k();
      this.h.setOnClickListener(var1);
   }

   public void setOnMenuItemClickListener(gn var1) {
      this.d = var1;
   }

   public void setOverflowIcon(Drawable var1) {
      this.i();
      this.e.setOverflowIcon(var1);
   }

   public void setPopupTheme(int var1) {
      if (this.m != var1) {
         this.m = var1;
         if (var1 == 0) {
            this.l = this.getContext();
         } else {
            this.l = new ContextThemeWrapper(this.getContext(), var1);
         }
      }

   }

   public void setSubtitle(int var1) {
      this.setSubtitle(this.getContext().getText(var1));
   }

   public void setSubtitle(CharSequence var1) {
      if (!TextUtils.isEmpty(var1)) {
         if (this.g == null) {
            Context var2 = this.getContext();
            this.g = new bc(var2);
            this.g.setSingleLine();
            this.g.setEllipsize(TruncateAt.END);
            if (this.o != 0) {
               this.g.setTextAppearance(var2, this.o);
            }

            if (this.B != 0) {
               this.g.setTextColor(this.B);
            }
         }

         if (!this.d(this.g)) {
            this.a(this.g, true);
         }
      } else if (this.g != null && this.d(this.g)) {
         this.removeView(this.g);
         this.F.remove(this.g);
      }

      if (this.g != null) {
         this.g.setText(var1);
      }

      this.z = var1;
   }

   public void setSubtitleTextColor(int var1) {
      this.B = var1;
      if (this.g != null) {
         this.g.setTextColor(var1);
      }

   }

   public void setTitle(int var1) {
      this.setTitle(this.getContext().getText(var1));
   }

   public void setTitle(CharSequence var1) {
      if (!TextUtils.isEmpty(var1)) {
         if (this.f == null) {
            Context var2 = this.getContext();
            this.f = new bc(var2);
            this.f.setSingleLine();
            this.f.setEllipsize(TruncateAt.END);
            if (this.n != 0) {
               this.f.setTextAppearance(var2, this.n);
            }

            if (this.A != 0) {
               this.f.setTextColor(this.A);
            }
         }

         if (!this.d(this.f)) {
            this.a(this.f, true);
         }
      } else if (this.f != null && this.d(this.f)) {
         this.removeView(this.f);
         this.F.remove(this.f);
      }

      if (this.f != null) {
         this.f.setText(var1);
      }

      this.y = var1;
   }

   public void setTitleMarginBottom(int var1) {
      this.t = var1;
      this.requestLayout();
   }

   public void setTitleMarginEnd(int var1) {
      this.r = var1;
      this.requestLayout();
   }

   public void setTitleMarginStart(int var1) {
      this.q = var1;
      this.requestLayout();
   }

   public void setTitleMarginTop(int var1) {
      this.s = var1;
      this.requestLayout();
   }

   public void setTitleTextColor(int var1) {
      this.A = var1;
      if (this.f != null) {
         this.f.setTextColor(var1);
      }

   }
}
