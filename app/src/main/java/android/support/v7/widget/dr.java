package android.support.v7.widget;

class dr implements af {
   // $FF: synthetic field
   final dl a;

   dr(dl var1) {
      this.a = var1;
   }

   public ey a(int var1) {
      ey var2 = null;
      ey var3 = this.a.a(var1, true);
      if (var3 != null && !this.a.f.c(var3.a)) {
         var2 = var3;
      }

      return var2;
   }

   public void a(int var1, int var2) {
      this.a.a(var1, var2, true);
      this.a.B = true;
      ev var3 = this.a.A;
      var3.b += var2;
   }

   public void a(int var1, int var2, Object var3) {
      this.a.a(var1, var2, var3);
      this.a.C = true;
   }

   public void a(ag var1) {
      this.c(var1);
   }

   public void b(int var1, int var2) {
      this.a.a(var1, var2, false);
      this.a.B = true;
   }

   public void b(ag var1) {
      this.c(var1);
   }

   public void c(int var1, int var2) {
      this.a.g(var1, var2);
      this.a.B = true;
   }

   void c(ag var1) {
      switch(var1.a) {
      case 1:
         this.a.m.a(this.a, var1.b, var1.d);
         break;
      case 2:
         this.a.m.b(this.a, var1.b, var1.d);
      case 3:
      case 5:
      case 6:
      case 7:
      default:
         break;
      case 4:
         this.a.m.a(this.a, var1.b, var1.d, var1.c);
         break;
      case 8:
         this.a.m.a(this.a, var1.b, var1.d, 1);
      }

   }

   public void d(int var1, int var2) {
      this.a.f(var1, var2);
      this.a.B = true;
   }
}
