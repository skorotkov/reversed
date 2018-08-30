package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v4.view.bz;
import android.support.v7.widget.dd;
import android.support.v7.widget.de;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class g extends y implements ab, OnKeyListener, OnDismissListener {
   final Handler a;
   final List b = new ArrayList();
   View c;
   boolean d;
   private final Context e;
   private final int f;
   private final int g;
   private final int h;
   private final boolean i;
   private final List j = new LinkedList();
   private final OnGlobalLayoutListener k = new h(this);
   private final dd l = new i(this);
   private int m = 0;
   private int n = 0;
   private View o;
   private int p;
   private boolean q;
   private boolean r;
   private int s;
   private int t;
   private boolean u;
   private boolean v;
   private ac w;
   private ViewTreeObserver x;
   private OnDismissListener y;

   public g(Context var1, View var2, int var3, int var4, boolean var5) {
      this.e = var1;
      this.o = var2;
      this.g = var3;
      this.h = var4;
      this.i = var5;
      this.u = false;
      this.p = this.i();
      Resources var6 = var1.getResources();
      this.f = Math.max(var6.getDisplayMetrics().widthPixels / 2, var6.getDimensionPixelSize(android.support.v7.a.e.abc_config_prefDialogWidth));
      this.a = new Handler();
   }

   private MenuItem a(m var1, m var2) {
      int var3 = var1.size();
      int var4 = 0;

      MenuItem var6;
      while(true) {
         if (var4 >= var3) {
            var6 = null;
            break;
         }

         MenuItem var5 = var1.getItem(var4);
         if (var5.hasSubMenu() && var2 == var5.getSubMenu()) {
            var6 = var5;
            break;
         }

         ++var4;
      }

      return var6;
   }

   private View a(k var1, m var2) {
      int var3 = 0;
      MenuItem var10 = this.a(var1.b, var2);
      View var7;
      if (var10 == null) {
         var7 = null;
      } else {
         ListView var4 = var1.a();
         ListAdapter var8 = var4.getAdapter();
         int var5;
         l var11;
         if (var8 instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter var9 = (HeaderViewListAdapter)var8;
            var5 = var9.getHeadersCount();
            var11 = (l)var9.getWrappedAdapter();
         } else {
            var11 = (l)var8;
            var5 = 0;
         }

         int var6 = var11.getCount();

         while(true) {
            if (var3 >= var6) {
               var3 = -1;
               break;
            }

            if (var10 == var11.a(var3)) {
               break;
            }

            ++var3;
         }

         if (var3 == -1) {
            var7 = null;
         } else {
            var3 = var3 + var5 - var4.getFirstVisiblePosition();
            if (var3 >= 0 && var3 < var4.getChildCount()) {
               var7 = var4.getChildAt(var3);
            } else {
               var7 = null;
            }
         }
      }

      return var7;
   }

   private void c(m var1) {
      LayoutInflater var2 = LayoutInflater.from(this.e);
      l var3 = new l(var1, var2, this.i);
      if (!this.d() && this.u) {
         var3.a(true);
      } else if (this.d()) {
         var3.a(android.support.v7.view.menu.y.b(var1));
      }

      int var4 = a(var3, (ViewGroup)null, this.e, this.f);
      de var5 = this.h();
      var5.a((ListAdapter)var3);
      var5.g(var4);
      var5.e(this.n);
      View var6;
      k var13;
      if (this.b.size() > 0) {
         var13 = (k)this.b.get(this.b.size() - 1);
         var6 = this.a(var13, var1);
      } else {
         var6 = null;
         var13 = null;
      }

      if (var6 != null) {
         var5.b(false);
         var5.a((Object)null);
         int var7 = this.d(var4);
         boolean var8;
         if (var7 == 1) {
            var8 = true;
         } else {
            var8 = false;
         }

         this.p = var7;
         int[] var9 = new int[2];
         var6.getLocationInWindow(var9);
         int var10 = var13.a.j() + var9[0];
         var7 = var13.a.k();
         int var11 = var9[1];
         int var17;
         if ((this.n & 5) == 5) {
            if (var8) {
               var17 = var10 + var4;
            } else {
               var17 = var10 - var6.getWidth();
            }
         } else if (var8) {
            var17 = var6.getWidth() + var10;
         } else {
            var17 = var10 - var4;
         }

         var5.c(var17);
         var5.d(var11 + var7);
      } else {
         if (this.q) {
            var5.c(this.s);
         }

         if (this.r) {
            var5.d(this.t);
         }

         var5.a((Rect)this.g());
      }

      k var15 = new k(var5, var1, this.p);
      this.b.add(var15);
      var5.a();
      if (var13 == null && this.v && var1.l() != null) {
         ListView var14 = var5.e();
         FrameLayout var16 = (FrameLayout)var2.inflate(android.support.v7.a.h.abc_popup_menu_header_item_layout, var14, false);
         TextView var12 = (TextView)var16.findViewById(16908310);
         var16.setEnabled(false);
         var12.setText(var1.l());
         var14.addHeaderView(var16, (Object)null, false);
         var5.a();
      }

   }

   private int d(int var1) {
      ListView var2 = ((k)this.b.get(this.b.size() - 1)).a();
      int[] var3 = new int[2];
      var2.getLocationOnScreen(var3);
      Rect var4 = new Rect();
      this.c.getWindowVisibleDisplayFrame(var4);
      byte var6;
      if (this.p == 1) {
         int var5 = var3[0];
         if (var2.getWidth() + var5 + var1 > var4.right) {
            var6 = 0;
         } else {
            var6 = 1;
         }
      } else if (var3[0] - var1 < 0) {
         var6 = 1;
      } else {
         var6 = 0;
      }

      return var6;
   }

   private int d(m var1) {
      int var2 = 0;
      int var3 = this.b.size();

      while(true) {
         if (var2 >= var3) {
            var2 = -1;
            break;
         }

         if (var1 == ((k)this.b.get(var2)).b) {
            break;
         }

         ++var2;
      }

      return var2;
   }

   private de h() {
      de var1 = new de(this.e, (AttributeSet)null, this.g, this.h);
      var1.a(this.l);
      var1.a((OnItemClickListener)this);
      var1.a((OnDismissListener)this);
      var1.b(this.o);
      var1.e(this.n);
      var1.a(true);
      return var1;
   }

   private int i() {
      byte var1 = 1;
      if (bz.g(this.o) == 1) {
         var1 = 0;
      }

      return var1;
   }

   public void a() {
      if (!this.d()) {
         Iterator var1 = this.j.iterator();

         while(var1.hasNext()) {
            this.c((m)var1.next());
         }

         this.j.clear();
         this.c = this.o;
         if (this.c != null) {
            boolean var2;
            if (this.x == null) {
               var2 = true;
            } else {
               var2 = false;
            }

            this.x = this.c.getViewTreeObserver();
            if (var2) {
               this.x.addOnGlobalLayoutListener(this.k);
            }
         }
      }

   }

   public void a(int var1) {
      if (this.m != var1) {
         this.m = var1;
         this.n = android.support.v4.view.y.a(var1, bz.g(this.o));
      }

   }

   public void a(ac var1) {
      this.w = var1;
   }

   public void a(m var1) {
      var1.a((ab)this, (Context)this.e);
      if (this.d()) {
         this.c(var1);
      } else {
         this.j.add(var1);
      }

   }

   public void a(m var1, boolean var2) {
      int var3 = this.d(var1);
      if (var3 >= 0) {
         int var4 = var3 + 1;
         if (var4 < this.b.size()) {
            ((k)this.b.get(var4)).b.a(false);
         }

         k var5 = (k)this.b.remove(var3);
         var5.b.a((ab)this);
         if (this.d) {
            var5.a.b((Object)null);
            var5.a.b(0);
         }

         var5.a.c();
         var4 = this.b.size();
         if (var4 > 0) {
            this.p = ((k)this.b.get(var4 - 1)).c;
         } else {
            this.p = this.i();
         }

         if (var4 == 0) {
            this.c();
            if (this.w != null) {
               this.w.a(var1, true);
            }

            if (this.x != null) {
               if (this.x.isAlive()) {
                  this.x.removeGlobalOnLayoutListener(this.k);
               }

               this.x = null;
            }

            this.y.onDismiss();
         } else if (var2) {
            ((k)this.b.get(0)).b.a(false);
         }
      }

   }

   public void a(View var1) {
      if (this.o != var1) {
         this.o = var1;
         this.n = android.support.v4.view.y.a(this.m, bz.g(this.o));
      }

   }

   public void a(OnDismissListener var1) {
      this.y = var1;
   }

   public void a(boolean var1) {
      this.u = var1;
   }

   public boolean a(ak var1) {
      Iterator var2 = this.b.iterator();

      boolean var4;
      while(true) {
         if (var2.hasNext()) {
            k var3 = (k)var2.next();
            if (var1 != var3.b) {
               continue;
            }

            var3.a().requestFocus();
            var4 = true;
            break;
         }

         if (var1.hasVisibleItems()) {
            this.a((m)var1);
            if (this.w != null) {
               this.w.a(var1);
            }

            var4 = true;
         } else {
            var4 = false;
         }
         break;
      }

      return var4;
   }

   public void b(int var1) {
      this.q = true;
      this.s = var1;
   }

   public void b(boolean var1) {
      Iterator var2 = this.b.iterator();

      while(var2.hasNext()) {
         a((ListAdapter)((k)var2.next()).a().getAdapter()).notifyDataSetChanged();
      }

   }

   public boolean b() {
      return false;
   }

   public void c() {
      int var1 = this.b.size();
      if (var1 > 0) {
         k[] var2 = (k[])this.b.toArray(new k[var1]);
         --var1;

         for(; var1 >= 0; --var1) {
            k var3 = var2[var1];
            if (var3.a.d()) {
               var3.a.c();
            }
         }
      }

   }

   public void c(int var1) {
      this.r = true;
      this.t = var1;
   }

   public void c(boolean var1) {
      this.v = var1;
   }

   public boolean d() {
      boolean var1;
      if (this.b.size() > 0 && ((k)this.b.get(0)).a.d()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public ListView e() {
      ListView var1;
      if (this.b.isEmpty()) {
         var1 = null;
      } else {
         var1 = ((k)this.b.get(this.b.size() - 1)).a();
      }

      return var1;
   }

   protected boolean f() {
      return false;
   }

   public void onDismiss() {
      int var1 = this.b.size();
      int var2 = 0;

      k var3;
      while(true) {
         if (var2 >= var1) {
            var3 = null;
            break;
         }

         var3 = (k)this.b.get(var2);
         if (!var3.a.d()) {
            break;
         }

         ++var2;
      }

      if (var3 != null) {
         var3.b.a(false);
      }

   }

   public boolean onKey(View var1, int var2, KeyEvent var3) {
      boolean var4 = true;
      if (var3.getAction() == 1 && var2 == 82) {
         this.c();
      } else {
         var4 = false;
      }

      return var4;
   }
}
