package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.de;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow.OnDismissListener;

final class ai extends y implements ab, OnKeyListener, OnItemClickListener, OnDismissListener {
   final de a;
   View b;
   private final Context c;
   private final m d;
   private final l e;
   private final boolean f;
   private final int g;
   private final int h;
   private final int i;
   private final OnGlobalLayoutListener j = new aj(this);
   private OnDismissListener k;
   private View l;
   private ac m;
   private ViewTreeObserver n;
   private boolean o;
   private boolean p;
   private int q;
   private int r = 0;
   private boolean s;

   public ai(Context var1, m var2, View var3, int var4, int var5, boolean var6) {
      this.c = var1;
      this.d = var2;
      this.f = var6;
      this.e = new l(var2, LayoutInflater.from(var1), this.f);
      this.h = var4;
      this.i = var5;
      Resources var7 = var1.getResources();
      this.g = Math.max(var7.getDisplayMetrics().widthPixels / 2, var7.getDimensionPixelSize(android.support.v7.a.e.abc_config_prefDialogWidth));
      this.l = var3;
      this.a = new de(this.c, (AttributeSet)null, this.h, this.i);
      var2.a((ab)this, (Context)var1);
   }

   private boolean h() {
      boolean var1 = true;
      if (!this.d()) {
         if (!this.o && this.l != null) {
            this.b = this.l;
            this.a.a((OnDismissListener)this);
            this.a.a((OnItemClickListener)this);
            this.a.a(true);
            View var2 = this.b;
            boolean var3;
            if (this.n == null) {
               var3 = true;
            } else {
               var3 = false;
            }

            this.n = var2.getViewTreeObserver();
            if (var3) {
               this.n.addOnGlobalLayoutListener(this.j);
            }

            this.a.b(var2);
            this.a.e(this.r);
            if (!this.p) {
               this.q = a(this.e, (ViewGroup)null, this.c, this.g);
               this.p = true;
            }

            this.a.g(this.q);
            this.a.h(2);
            this.a.a((Rect)this.g());
            this.a.a();
            ListView var4 = this.a.e();
            var4.setOnKeyListener(this);
            if (this.s && this.d.l() != null) {
               FrameLayout var6 = (FrameLayout)LayoutInflater.from(this.c).inflate(android.support.v7.a.h.abc_popup_menu_header_item_layout, var4, false);
               TextView var5 = (TextView)var6.findViewById(16908310);
               if (var5 != null) {
                  var5.setText(this.d.l());
               }

               var6.setEnabled(false);
               var4.addHeaderView(var6, (Object)null, false);
            }

            this.a.a((ListAdapter)this.e);
            this.a.a();
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public void a() {
      if (!this.h()) {
         throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
      }
   }

   public void a(int var1) {
      this.r = var1;
   }

   public void a(ac var1) {
      this.m = var1;
   }

   public void a(m var1) {
   }

   public void a(m var1, boolean var2) {
      if (var1 == this.d) {
         this.c();
         if (this.m != null) {
            this.m.a(var1, var2);
         }
      }

   }

   public void a(View var1) {
      this.l = var1;
   }

   public void a(OnDismissListener var1) {
      this.k = var1;
   }

   public void a(boolean var1) {
      this.e.a(var1);
   }

   public boolean a(ak var1) {
      boolean var3;
      if (var1.hasVisibleItems()) {
         z var2 = new z(this.c, var1, this.b, this.f, this.h, this.i);
         var2.a(this.m);
         var2.a(y.b(var1));
         var2.a(this.k);
         this.k = null;
         this.d.a(false);
         if (var2.a(this.a.j(), this.a.k())) {
            if (this.m != null) {
               this.m.a(var1);
            }

            var3 = true;
            return var3;
         }
      }

      var3 = false;
      return var3;
   }

   public void b(int var1) {
      this.a.c(var1);
   }

   public void b(boolean var1) {
      this.p = false;
      if (this.e != null) {
         this.e.notifyDataSetChanged();
      }

   }

   public boolean b() {
      return false;
   }

   public void c() {
      if (this.d()) {
         this.a.c();
      }

   }

   public void c(int var1) {
      this.a.d(var1);
   }

   public void c(boolean var1) {
      this.s = var1;
   }

   public boolean d() {
      boolean var1;
      if (!this.o && this.a.d()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public ListView e() {
      return this.a.e();
   }

   public void onDismiss() {
      this.o = true;
      this.d.close();
      if (this.n != null) {
         if (!this.n.isAlive()) {
            this.n = this.b.getViewTreeObserver();
         }

         this.n.removeGlobalOnLayoutListener(this.j);
         this.n = null;
      }

      if (this.k != null) {
         this.k.onDismiss();
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
