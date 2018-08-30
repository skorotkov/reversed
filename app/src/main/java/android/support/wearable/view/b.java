package android.support.wearable.view;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;

@Deprecated
@TargetApi(20)
class b implements ad, ai, aj {
   private aa a;
   private e b;
   private final Point c;
   private final Point d;
   private final android.support.v4.g.i e;
   private final android.support.v4.g.i f;
   private final at g;
   private final at h;
   private final s i;
   private final Point j;
   private final Point k;
   private final Point l;
   private float m;
   private float n;
   private float o;
   private float p;
   private int q;
   private int r;
   private float s;
   private float t;
   private int u;
   private int v;
   private boolean w;

   public b() {
      this.b = android.support.wearable.view.e.e;
      this.c = new Point();
      this.d = new Point();
      this.e = new c(this, 3);
      this.f = new d(this, 5);
      this.g = new at();
      this.h = new at();
      this.i = new s();
      this.j = new Point();
      this.k = new Point();
      this.l = new Point();
      this.i.setFilterBitmap(true);
      this.h.setFilterBitmap(true);
      this.g.setFilterBitmap(true);
   }

   private static int a(Point var0) {
      return b(var0.x, var0.y);
   }

   private Drawable a(Point var1, float var2, float var3) {
      Drawable var4 = (Drawable)this.f.get(a(var1));
      this.l.set(var1.x, var1.y);
      Drawable var5;
      if (var4 == aa.a) {
         var4 = (Drawable)this.e.get(var1.y);
         this.u = this.a.a(var1.y) + 2;
         this.s = (float)(var1.x + 1);
         var5 = var4;
      } else {
         this.u = 3;
         this.s = 1.0F;
         var5 = var4;
      }

      this.v = 3;
      this.t = 1.0F;
      this.g.a(var5);
      this.g.a(this.u, this.v);
      this.g.a(this.s + var2, this.t + var3);
      this.i.b(this.g);
      return var5;
   }

   // $FF: synthetic method
   static aa a(b var0) {
      return var0.a;
   }

   private void a(Point var1, Point var2, e var3, float var4, float var5) {
      if (this.a != null && this.a.a() > 0) {
         Drawable var6 = this.a(var1, var4, var5);
         boolean var7;
         if ((float)var1.x + var4 >= 0.0F && (float)var1.y + var5 >= 0.0F && (float)var2.x + var4 <= (float)(this.a.a(var1.y) - 1) && (float)var2.y + var5 <= (float)(this.a.a() - 1)) {
            var7 = false;
         } else {
            var7 = true;
         }

         if (this.b != android.support.wearable.view.e.e && !var7) {
            this.a(var1, var2, var3, var4, var5, var6);
         } else {
            this.w = false;
            this.h.a((Drawable)null);
            this.i.a(0.0F);
         }
      } else {
         this.w = false;
         this.g.a((Drawable)null);
         this.h.a((Drawable)null);
      }

   }

   private void a(Point var1, Point var2, e var3, float var4, float var5, Drawable var6) {
      int var7 = var2.y;
      byte var8;
      if (var3 == android.support.wearable.view.e.d) {
         var8 = 1;
      } else {
         var8 = 0;
      }

      int var9 = var7 + var8;
      var7 = var2.x;
      if (var3 == android.support.wearable.view.e.c) {
         var8 = 1;
      } else {
         var8 = 0;
      }

      int var12;
      if (var9 != this.c.y) {
         var12 = this.a.e(var9, var1.x);
      } else {
         var12 = var8 + var7;
      }

      Drawable var10 = (Drawable)this.f.get(b(var12, var9));
      this.k.set(var12, var9);
      boolean var11;
      if (var10 == aa.a) {
         var10 = (Drawable)this.e.get(var9);
         var11 = true;
      } else {
         var11 = false;
      }

      if (var6 == var10) {
         this.w = false;
         this.h.a((Drawable)null);
         this.i.a((Drawable)null);
         this.i.a(0.0F);
      } else {
         if (var11) {
            var7 = x.a(var9, 0, this.a.a() - 1);
            this.q = this.a.a(var7) + 2;
            if (var3.b()) {
               this.o = (float)(var1.x + 1);
            } else {
               this.o = (float)(var12 + 1);
            }
         } else {
            this.q = 3;
            this.o = (float)(1 - android.support.wearable.view.e.a(var3));
         }

         this.r = 3;
         this.p = (float)(1 - android.support.wearable.view.e.b(var3));
         this.w = true;
         this.h.a(var10);
         this.h.a(this.q, this.r);
         this.h.a(this.o + var4, this.p + var5);
         this.i.a(this.h);
      }

   }

   // $FF: synthetic method
   static int b(int var0) {
      return d(var0);
   }

   private static int b(int var0, int var1) {
      return var1 << 16 | '\uffff' & var0;
   }

   private void b() {
      this.b = android.support.wearable.view.e.e;
      this.f.evictAll();
      this.e.evictAll();
      this.h.a((Drawable)null);
      this.g.a((Drawable)null);
   }

   // $FF: synthetic method
   static int c(int var0) {
      return e(var0);
   }

   private static int d(int var0) {
      return '\uffff' & var0;
   }

   private static int e(int var0) {
      return var0 >>> 16;
   }

   public void a() {
      this.b();
   }

   public void a(int var1) {
      if (var1 == 0) {
         this.b = android.support.wearable.view.e.e;
      }

   }

   public void a(int var1, int var2) {
      this.d.set(var2, var1);
   }

   public void a(int var1, int var2, float var3, float var4, int var5, int var6) {
      float var7 = 0.0F;
      float var8 = 0.0F;
      if (this.b != android.support.wearable.view.e.e && this.c.equals(this.d) && this.j.equals(var2, var1)) {
         if (this.b.a()) {
            var7 = (float)x.a(var1 - this.c.y, -1, 0);
            var4 = 0.0F;
            var7 += var3;
            var3 = var4;
            var4 = var7;
         } else {
            var3 = (float)x.a(var2 - this.c.x, -1, 0) + var4;
            var4 = var7;
         }
      } else {
         this.j.set(var2, var1);
         this.c.set(this.d.x, this.d.y);
         var7 = (float)x.a(var1 - this.c.y, -1, 0) + var3;
         var3 = var8;
         if (var7 == 0.0F) {
            var3 = (float)x.a(var2 - this.c.x, -1, 0) + var4;
         }

         this.b = android.support.wearable.view.e.a(var3, var7);
         this.a(this.c, this.j, this.b, var3, var7);
         var4 = var7;
      }

      this.n = var3;
      this.m = var4;
      this.g.a(this.s + var3, this.t + var4);
      if (this.w) {
         if (this.b.a()) {
            var7 = Math.abs(var4);
         } else {
            var7 = Math.abs(var3);
         }

         this.i.a(var7);
         this.h.a(var3 + this.o, this.p + var4);
      }

   }

   public void a(aa var1, aa var2) {
      this.b();
      this.d.set(0, 0);
      this.c.set(0, 0);
      this.a = var2;
   }

   public void a(View var1) {
      var1.setBackground(this.i);
   }
}
