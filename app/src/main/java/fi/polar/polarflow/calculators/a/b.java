package fi.polar.polarflow.calculators.a;

abstract class b extends a {
   private final int b;
   private final int c;
   private int d;
   private int e;
   private int f;
   private int g;

   public b(int var1, int var2) {
      this.b = var1;
      this.c = var2;
      this.c();
   }

   public void a(int var1) {
      int var2 = var1;
      if (var1 < this.b) {
         var2 = this.b;
      }

      var1 = var2;
      if (var2 > this.c) {
         var1 = this.c;
      }

      if (var1 < this.d) {
         this.d = var1;
      }

      if (var1 > this.e) {
         this.e = var1;
      }

      this.f += var1;
      ++this.a;
      this.g = var1;
   }

   public void c() {
      this.f = 0;
      this.a = 0;
      this.d = Integer.MAX_VALUE;
      this.e = -2147483647;
      this.g = -1;
   }

   public int d() {
      int var1;
      if (this.a == 0) {
         var1 = Integer.MAX_VALUE;
      } else {
         var1 = Math.round((float)(this.f / this.a));
      }

      return var1;
   }

   public int e() {
      int var1;
      if (this.e == -2147483647) {
         var1 = Integer.MIN_VALUE;
      } else {
         var1 = this.e;
      }

      return var1;
   }
}
