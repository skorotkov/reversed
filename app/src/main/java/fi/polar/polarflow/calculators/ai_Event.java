package fi.polar.polarflow.calculators;

abstract class ai_Event {
   private final int a;
   private final long b_sampleTimeFromBoot;
   private final boolean c_isTrusted;

   ai_Event(int var1, long var2) {
      this.a = var1;
      this.b_sampleTimeFromBoot = var2;
      this.c_isTrusted = false;
   }

   ai_Event(int var1, long var2, boolean var4) {
      this.a = var1;
      this.b_sampleTimeFromBoot = var2;
      this.c_isTrusted = var4;
   }

   final int l() {
      return this.a;
   }

   final long m_getSampleTimeFromBoot() {
      return this.b_sampleTimeFromBoot;
   }

   final boolean n_isTrusted() {
      return this.c_isTrusted;
   }
}
