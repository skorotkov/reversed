package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.bz;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow.OnDismissListener;

public class z {
   private final Context a;
   private final m b;
   private final boolean c;
   private final int d;
   private final int e;
   private View f;
   private int g;
   private boolean h;
   private ac i;
   private y j;
   private OnDismissListener k;
   private final OnDismissListener l;

   public z(Context var1, m var2, View var3, boolean var4, int var5) {
      this(var1, var2, var3, var4, var5, 0);
   }

   public z(Context var1, m var2, View var3, boolean var4, int var5, int var6) {
      this.g = 8388611;
      this.l = new aa(this);
      this.a = var1;
      this.b = var2;
      this.f = var3;
      this.c = var4;
      this.d = var5;
      this.e = var6;
   }

   private void a(int var1, int var2, boolean var3, boolean var4) {
      y var5 = this.b();
      var5.c(var4);
      if (var3) {
         int var6 = var1;
         if ((android.support.v4.view.y.a(this.g, bz.g(this.f)) & 7) == 5) {
            var6 = var1 - this.f.getWidth();
         }

         var5.b(var6);
         var5.c(var2);
         var1 = (int)(this.a.getResources().getDisplayMetrics().density * 48.0F / 2.0F);
         var5.a(new Rect(var6 - var1, var2 - var1, var6 + var1, var1 + var2));
      }

      var5.a();
   }

   private y g() {
      Display var1 = ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay();
      Point var2 = new Point();
      if (VERSION.SDK_INT >= 17) {
         var1.getRealSize(var2);
      } else if (VERSION.SDK_INT >= 13) {
         var1.getSize(var2);
      } else {
         var2.set(var1.getWidth(), var1.getHeight());
      }

      boolean var3;
      if (Math.min(var2.x, var2.y) >= this.a.getResources().getDimensionPixelSize(android.support.v7.a.e.abc_cascading_menus_min_smallest_width)) {
         var3 = true;
      } else {
         var3 = false;
      }

      Object var4;
      if (var3) {
         var4 = new g(this.a, this.f, this.d, this.e, this.c);
      } else {
         var4 = new ai(this.a, this.b, this.f, this.d, this.e, this.c);
      }

      ((y)var4).a(this.b);
      ((y)var4).a(this.l);
      ((y)var4).a(this.f);
      ((y)var4).a((ac)this.i);
      ((y)var4).a(this.h);
      ((y)var4).a(this.g);
      return (y)var4;
   }

   public void a() {
      if (!this.c()) {
         throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
      }
   }

   public void a(int var1) {
      this.g = var1;
   }

   public void a(ac var1) {
      this.i = var1;
      if (this.j != null) {
         this.j.a((ac)var1);
      }

   }

   public void a(View var1) {
      this.f = var1;
   }

   public void a(OnDismissListener var1) {
      this.k = var1;
   }

   public void a(boolean var1) {
      this.h = var1;
      if (this.j != null) {
         this.j.a(var1);
      }

   }

   public boolean a(int var1, int var2) {
      boolean var3 = true;
      if (!this.f()) {
         if (this.f == null) {
            var3 = false;
         } else {
            this.a(var1, var2, true, true);
         }
      }

      return var3;
   }

   public y b() {
      if (this.j == null) {
         this.j = this.g();
      }

      return this.j;
   }

   public boolean c() {
      boolean var1 = true;
      if (!this.f()) {
         if (this.f == null) {
            var1 = false;
         } else {
            this.a(0, 0, false, false);
         }
      }

      return var1;
   }

   public void d() {
      if (this.f()) {
         this.j.c();
      }

   }

   protected void e() {
      this.j = null;
      if (this.k != null) {
         this.k.onDismiss();
      }

   }

   public boolean f() {
      boolean var1;
      if (this.j != null && this.j.d()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
