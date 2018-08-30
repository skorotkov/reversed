package android.support.v7.widget;

class eo extends du {
   // $FF: synthetic field
   final dl a;

   eo(dl var1) {
      this.a = var1;
   }

   public void a() {
      this.a.a((String)null);
      this.a.A.e = true;
      this.a.u();
      if (!this.a.e.d()) {
         this.a.requestLayout();
      }

   }

   public void a(int var1, int var2, Object var3) {
      this.a.a((String)null);
      if (this.a.e.a(var1, var2, var3)) {
         this.b();
      }

   }

   void b() {
      if (dl.c && this.a.q && this.a.p) {
         android.support.v4.view.bz.a(this.a, (Runnable)this.a.i);
      } else {
         this.a.u = true;
         this.a.requestLayout();
      }

   }

   public void b(int var1, int var2) {
      this.a.a((String)null);
      if (this.a.e.b(var1, var2)) {
         this.b();
      }

   }

   public void c(int var1, int var2) {
      this.a.a((String)null);
      if (this.a.e.c(var1, var2)) {
         this.b();
      }

   }
}
