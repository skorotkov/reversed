package fi.polar.polarflow.calculators;

abstract class ai {
   private final int a;
   private final long b;
   private final boolean c;

   ai(int var1, long var2) {
      this.a = var1;
      this.b = var2;
      this.c = false;
   }

   ai(int var1, long var2, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c = var4;
   }

   final int l() {
      return this.a;
   }

   final long m() {
      return this.b;
   }

   final boolean n() {
      return this.c;
   }
}
