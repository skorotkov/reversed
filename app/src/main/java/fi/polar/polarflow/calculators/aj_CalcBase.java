package fi.polar.polarflow.calculators;

import java.util.ArrayList;
import java.util.List;

abstract class aj_CalcBase implements al_Calc, c {
   private static final String a = aj_CalcBase.class.getSimpleName();
   private final List b_sensorTypes;
   boolean c;
   private int d_notTrustedRangeStartIndex;
   private ai_Sample e_currentSample;

   aj_CalcBase(List var1) {
      if (var1 == null || ((List)var1).size() == 0) {
         fi.polar.polarflow.util.d.c(a, "", new IllegalArgumentException("sensorTypes must not be null or empty!"));
      }

      if (var1 == null) {
         var1 = new ArrayList();
      }

      this.b_sensorTypes = (List)var1;
      this.d_notTrustedRangeStartIndex = 0;
   }

   final void a_setCurrentSample(ai_Sample var1) {
      this.e_currentSample = var1;
   }

   final void b_handleSample(ai_Sample var1) {
      if (this.e_currentSample.n_isTrusted() != var1.n_isTrusted()) {
         if (var1.n_isTrusted()) {
            if (this instanceof ak) {  // true for q_ExerciseSampleHeartrateCalc and s_GpsDerivativesCalc
               ((ak)this).a_fillNotTrustedRange(this.d_notTrustedRangeStartIndex, this.e_currentSample.l_getSampleIndex());
            }

            this.d_notTrustedRangeStartIndex = -1;
         } else {
            this.d_notTrustedRangeStartIndex = var1.l_getSampleIndex();
         }
      }

      this.e_currentSample = var1;
      this.a_handleCurrentSample();
   }

   final void b(boolean var1) {
      this.c = var1;
   }

   final ai_Sample o_getCurrentSample() {
      return this.e_currentSample;
   }

   final int p_getNotTrustedRangeStartIndex() {
      return this.d_notTrustedRangeStartIndex;
   }
}
