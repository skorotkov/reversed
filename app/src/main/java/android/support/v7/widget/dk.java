package android.support.v7.widget;

import android.view.View;

final class dk extends di {
   dk(ec var1) {
      super(var1, (dj)null);
   }

   public int a(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      return this.a.i(var1) - var2.topMargin;
   }

   public void a(int var1) {
      this.a.k(var1);
   }

   public int b(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      int var3 = this.a.k(var1);
      return var2.bottomMargin + var3;
   }

   public int c() {
      return this.a.E();
   }

   public int c(View var1) {
      this.a.a(var1, true, this.b);
      return this.b.bottom;
   }

   public int d() {
      return this.a.C() - this.a.G();
   }

   public int d(View var1) {
      this.a.a(var1, true, this.b);
      return this.b.top;
   }

   public int e() {
      return this.a.C();
   }

   public int e(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      int var3 = this.a.g(var1);
      int var4 = var2.topMargin;
      return var2.bottomMargin + var3 + var4;
   }

   public int f() {
      return this.a.C() - this.a.E() - this.a.G();
   }

   public int f(View var1) {
      ef var2 = (ef)var1.getLayoutParams();
      int var3 = this.a.f(var1);
      int var4 = var2.leftMargin;
      return var2.rightMargin + var3 + var4;
   }

   public int g() {
      return this.a.G();
   }

   public int h() {
      return this.a.A();
   }

   public int i() {
      return this.a.z();
   }
}
