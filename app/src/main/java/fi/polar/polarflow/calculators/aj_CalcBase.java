package fi.polar.polarflow.calculators;

import java.util.ArrayList;
import java.util.List;

abstract class aj_CalcBase implements al_Calc, c {
   private static final String a = aj_CalcBase.class.getSimpleName();
   private final List b_sensorTypes;
   boolean c;
   private int d;
   private ai_Event e_currentEvent;

   aj_CalcBase(List var1) {
      if (var1 == null || ((List)var1).size() == 0) {
         fi.polar.polarflow.util.d.c(a, "", new IllegalArgumentException("sensorTypes must not be null or empty!"));
      }

      if (var1 == null) {
         var1 = new ArrayList();
      }

      this.b_sensorTypes = (List)var1;
      this.d = 0;
   }

   final void a_setCurrentEvent(ai_Event var1) {
      this.e_currentEvent = var1;
   }

   final void b_handleEvent(ai_Event var1) {
      if (this.e_currentEvent.n_isTrusted() != var1.n_isTrusted()) {
         if (var1.n_isTrusted()) {
            if (this instanceof ak) {  // true for q_ExerciseSampleHeartrateCalc and s_GpsDerivativesCalc
               ((ak)this).a(this.d, this.e_currentEvent.l());
            }

            this.d = -1;
         } else {
            this.d = var1.l();
         }
      }

      this.e_currentEvent = var1;
      this.a_handleCurrentEvent();
   }

   final void b(boolean var1) {
      this.c = var1;
   }

   final ai_Event o_getCurrentEvent() {
      return this.e_currentEvent;
   }

   final int p() {
      return this.d;
   }
}
