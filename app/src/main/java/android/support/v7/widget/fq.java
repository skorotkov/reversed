package android.support.v7.widget;

import android.view.View;

public abstract class fq extends dw {
   boolean h = true;

   public final void a(ey var1, boolean var2) {
      this.d(var1, var2);
      this.f(var1);
   }

   public void a(boolean var1) {
      this.h = var1;
   }

   public abstract boolean a(ey var1);

   public abstract boolean a(ey var1, int var2, int var3, int var4, int var5);

   public boolean a(ey var1, dz var2, dz var3) {
      int var4 = var2.a;
      int var5 = var2.b;
      View var9 = var1.a;
      int var6;
      if (var3 == null) {
         var6 = var9.getLeft();
      } else {
         var6 = var3.a;
      }

      int var7;
      if (var3 == null) {
         var7 = var9.getTop();
      } else {
         var7 = var3.b;
      }

      boolean var8;
      if (var1.r() || var4 == var6 && var5 == var7) {
         var8 = this.a(var1);
      } else {
         var9.layout(var6, var7, var9.getWidth() + var6, var9.getHeight() + var7);
         var8 = this.a(var1, var4, var5, var6, var7);
      }

      return var8;
   }

   public abstract boolean a(ey var1, ey var2, int var3, int var4, int var5, int var6);

   public boolean a(ey var1, ey var2, dz var3, dz var4) {
      int var5 = var3.a;
      int var6 = var3.b;
      int var7;
      int var8;
      if (var2.c()) {
         var7 = var3.a;
         var8 = var3.b;
      } else {
         var7 = var4.a;
         var8 = var4.b;
      }

      return this.a(var1, var2, var5, var6, var7, var8);
   }

   public final void b(ey var1, boolean var2) {
      this.c(var1, var2);
   }

   public abstract boolean b(ey var1);

   public boolean b(ey var1, dz var2, dz var3) {
      boolean var4;
      if (var2 == null || var2.a == var3.a && var2.b == var3.b) {
         var4 = this.b(var1);
      } else {
         var4 = this.a(var1, var2.a, var2.b, var3.a, var3.b);
      }

      return var4;
   }

   public void c(ey var1, boolean var2) {
   }

   public boolean c(ey var1, dz var2, dz var3) {
      boolean var4;
      if (var2.a == var3.a && var2.b == var3.b) {
         this.j(var1);
         var4 = false;
      } else {
         var4 = this.a(var1, var2.a, var2.b, var3.a, var3.b);
      }

      return var4;
   }

   public void d(ey var1, boolean var2) {
   }

   public boolean h(ey var1) {
      boolean var2;
      if (this.h && !var1.o()) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public final void i(ey var1) {
      this.p(var1);
      this.f(var1);
   }

   public final void j(ey var1) {
      this.t(var1);
      this.f(var1);
   }

   public final void k(ey var1) {
      this.r(var1);
      this.f(var1);
   }

   public final void l(ey var1) {
      this.o(var1);
   }

   public final void m(ey var1) {
      this.s(var1);
   }

   public final void n(ey var1) {
      this.q(var1);
   }

   public void o(ey var1) {
   }

   public void p(ey var1) {
   }

   public void q(ey var1) {
   }

   public void r(ey var1) {
   }

   public void s(ey var1) {
   }

   public void t(ey var1) {
   }
}
