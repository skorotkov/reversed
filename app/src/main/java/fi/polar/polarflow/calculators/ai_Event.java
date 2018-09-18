package fi.polar.polarflow.calculators;

abstract class ai_Event {
   private final int a;
   private final long b;
   private final boolean c_isTrusted;

   ai_Event(int var1, long var2) {
      this.a = var1;
      this.b = var2;
      this.c_isTrusted = false;
   }

   ai_Event(int var1, long var2, boolean var4) {
      this.a = var1;
      this.b = var2;
      this.c_isTrusted = var4;
   }

   final int l() {
      return this.a;
   }

   final long m() {
      return this.b;
   }

   final boolean n_isTrusted() {
      return this.c_isTrusted;
   }
}
