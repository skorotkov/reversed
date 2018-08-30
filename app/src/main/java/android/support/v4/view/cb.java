package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import java.util.WeakHashMap;

class cb implements cm {
   WeakHashMap a = null;

   private boolean a(bs var1, int var2) {
      boolean var3 = true;
      int var4 = var1.computeHorizontalScrollOffset();
      int var5 = var1.computeHorizontalScrollRange() - var1.computeHorizontalScrollExtent();
      if (var5 == 0) {
         var3 = false;
      } else if (var2 < 0) {
         if (var4 <= 0) {
            var3 = false;
         }
      } else if (var4 >= var5 - 1) {
         var3 = false;
      }

      return var3;
   }

   private boolean b(bs var1, int var2) {
      boolean var3 = true;
      int var4 = var1.computeVerticalScrollOffset();
      int var5 = var1.computeVerticalScrollRange() - var1.computeVerticalScrollExtent();
      if (var5 == 0) {
         var3 = false;
      } else if (var2 < 0) {
         if (var4 <= 0) {
            var3 = false;
         }
      } else if (var4 >= var5 - 1) {
         var3 = false;
      }

      return var3;
   }

   public int a(int var1, int var2) {
      return var1 | var2;
   }

   public int a(int var1, int var2, int var3) {
      return View.resolveSize(var1, var2);
   }

   long a() {
      return 10L;
   }

   public eo a(View var1, eo var2) {
      return var2;
   }

   public void a(View var1, float var2) {
   }

   public void a(View var1, int var2, Paint var3) {
   }

   public void a(View var1, ColorStateList var2) {
      cn.a(var1, var2);
   }

   public void a(View var1, Mode var2) {
      cn.a(var1, var2);
   }

   public void a(View var1, Drawable var2) {
      var1.setBackgroundDrawable(var2);
   }

   public void a(View var1, bq var2) {
   }

   public void a(View var1, d var2) {
   }

   public void a(View var1, Runnable var2) {
      var1.postDelayed(var2, this.a());
   }

   public void a(View var1, Runnable var2, long var3) {
      var1.postDelayed(var2, this.a() + var3);
   }

   public void a(View var1, boolean var2) {
   }

   public boolean a(View var1) {
      return false;
   }

   public boolean a(View var1, int var2) {
      boolean var3;
      if (var1 instanceof bs && this.a((bs)var1, var2)) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public eo b(View var1, eo var2) {
      return var2;
   }

   public void b(View var1, float var2) {
   }

   public void b(View var1, boolean var2) {
   }

   public boolean b(View var1) {
      return false;
   }

   public boolean b(View var1, int var2) {
      boolean var3;
      if (var1 instanceof bs && this.b((bs)var1, var2)) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public void c(View var1) {
      var1.invalidate();
   }

   public void c(View var1, float var2) {
   }

   public void c(View var1, int var2) {
   }

   public int d(View var1) {
      return 0;
   }

   public float e(View var1) {
      return 1.0F;
   }

   public int f(View var1) {
      return 0;
   }

   public int g(View var1) {
      return 0;
   }

   public int h(View var1) {
      return var1.getMeasuredWidth();
   }

   public int i(View var1) {
      return var1.getMeasuredHeight();
   }

   public int j(View var1) {
      return 0;
   }

   public boolean k(View var1) {
      return true;
   }

   public float l(View var1) {
      return 0.0F;
   }

   public float m(View var1) {
      return 0.0F;
   }

   public Matrix n(View var1) {
      return null;
   }

   public int o(View var1) {
      return cn.c(var1);
   }

   public int p(View var1) {
      return cn.d(var1);
   }

   public dy q(View var1) {
      return new dy(var1);
   }

   public String r(View var1) {
      return null;
   }

   public int s(View var1) {
      return 0;
   }

   public void t(View var1) {
   }

   public void u(View var1) {
   }

   public ColorStateList v(View var1) {
      return cn.a(var1);
   }

   public Mode w(View var1) {
      return cn.b(var1);
   }

   public void x(View var1) {
      if (var1 instanceof bm) {
         ((bm)var1).stopNestedScroll();
      }

   }

   public boolean y(View var1) {
      return cn.e(var1);
   }

   public Display z(View var1) {
      return cn.f(var1);
   }
}
