package fi.polar.polarflow.calculators;

abstract class ai_Sample {
   private final int a_sampleIndex;
   private final long b_sampleTimeFromBoot;
   private final boolean c_isTrusted;

   ai_Sample(int var1, long var2) {
      this.a_sampleIndex = var1;
      this.b_sampleTimeFromBoot = var2;
      this.c_isTrusted = false;
   }

   ai_Sample(int var1, long var2, boolean var4) {
      this.a_sampleIndex = var1;
      this.b_sampleTimeFromBoot = var2;
      this.c_isTrusted = var4;
   }

   final int l_getSampleIndex() {
      return this.a_sampleIndex;
   }

   final long m_getSampleTimeFromBoot() {
      return this.b_sampleTimeFromBoot;
   }

   final boolean n_isTrusted() {
      return this.c_isTrusted;
   }
}
