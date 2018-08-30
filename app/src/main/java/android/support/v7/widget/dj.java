package android.support.v7.widget;

import android.view.View;

final class dj extends di {
   dj(ec var1) {
      super(var1, (dj)null);
   }

   public int a(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      return this.a.h(var1) - var2.leftMargin;
   }

   public void a(int var1) {
      this.a.j(var1);
   }

   public int b(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      int var3 = this.a.j(var1);
      return var2.rightMargin + var3;
   }

   public int c() {
      return this.a.D();
   }

   public int c(View var1) {
      this.a.a(var1, true, this.b);
      return this.b.right;
   }

   public int d() {
      return this.a.B() - this.a.F();
   }

   public int d(View var1) {
      this.a.a(var1, true, this.b);
      return this.b.left;
   }

   public int e() {
      return this.a.B();
   }

   public int e(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      int var3 = this.a.f(var1);
      int var4 = var2.leftMargin;
      return var2.rightMargin + var3 + var4;
   }

   public int f() {
      return this.a.B() - this.a.D() - this.a.F();
   }

   public int f(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      int var3 = this.a.g(var1);
      int var4 = var2.topMargin;
      return var2.bottomMargin + var3 + var4;
   }

   public int g() {
      return this.a.F();
   }

   public int h() {
      return this.a.z();
   }

   public int i() {
      return this.a.A();
   }
}
