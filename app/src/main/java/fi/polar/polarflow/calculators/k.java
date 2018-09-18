package fi.polar.polarflow.calculators;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class k extends BroadcastReceiver {
   // $FF: synthetic field
   final j_ExercisePhaseCalc a;

   k(j_ExercisePhaseCalc var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "onReceive " + var3);
      if ("ExercisePhaseCalc.ACTION_START_PHASE".equals(var3)) {
         if (!j_ExercisePhaseCalc.a(this.a)) {
            j_ExercisePhaseCalc.b(this.a);
         } else {
            j_ExercisePhaseCalc.d(this.a).post(j_ExercisePhaseCalc.c(this.a));
            j_ExercisePhaseCalc.a(this.a, true);
         }
      } else if ("ExercisePhaseCalc.ACTION_SKIP_TO_NEXT_PHASE".equals(var3)) {
         if (j_ExercisePhaseCalc.e(this.a) != null && j_ExercisePhaseCalc.f(this.a) == var2.getIntExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", -1)) {
            j_ExercisePhaseCalc.g(this.a);
         }
      } else if ("fi.polar.polarflow.action.ZONE_ALARM_TRIGGERED".equals(var3)) {
         j_ExercisePhaseCalc.a(this.a, j_ExercisePhaseCalc.h(this.a), j_ExercisePhaseCalc.i(this.a));
      } else if ("fi.polar.polarflow.action.PHASE_FINISH_ALARM_TRIGGERED".equals(var3)) {
         j_ExercisePhaseCalc.d(this.a).post(j_ExercisePhaseCalc.c(this.a));
      } else if ("fi.polar.polarflow.action.PRE_PHASE_FINISH_ALARM_TRIGGERED".equals(var3)) {
         this.a.a_broadcastPhaseAboutToFinish(false);
      } else if ("fi.polar.polarflow.action.PHASE_END_COUNTDOWN_ALARM_TRIGGERED".equals(var3)) {
         this.a.k_broadcastPhaseEndCountdown();
      }

   }
}
