package android.support.v7.widget;

import android.view.View;

class bo extends bt {
   // $FF: synthetic field
   final ey a;
   // $FF: synthetic field
   final int b;
   // $FF: synthetic field
   final int c;
   // $FF: synthetic field
   final android.support.v4.view.dy d;
   // $FF: synthetic field
   final bi e;

   bo(bi var1, ey var2, int var3, int var4, android.support.v4.view.dy var5) {
      this.e = var1;
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public void a(View var1) {
      this.e.m(this.a);
   }

   public void b(View var1) {
      this.d.a((android.support.v4.view.em)null);
      this.e.j(this.a);
      this.e.e.remove(this.a);
      this.e.c();
   }

   public void c(View var1) {
      if (this.b != 0) {
         android.support.v4.view.bz.a(var1, 0.0F);
      }

      if (this.c != 0) {
         android.support.v4.view.bz.b(var1, 0.0F);
      }

   }
}
