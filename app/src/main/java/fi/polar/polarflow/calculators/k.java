package fi.polar.polarflow.calculators;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class k extends BroadcastReceiver {
   // $FF: synthetic field
   final j a;

   k(j var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "onReceive " + var3);
      if ("ExercisePhaseCalc.ACTION_START_PHASE".equals(var3)) {
         if (!j.a(this.a)) {
            j.b(this.a);
         } else {
            j.d(this.a).post(j.c(this.a));
            j.a(this.a, true);
         }
      } else if ("ExercisePhaseCalc.ACTION_SKIP_TO_NEXT_PHASE".equals(var3)) {
         if (j.e(this.a) != null && j.f(this.a) == var2.getIntExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", -1)) {
            j.g(this.a);
         }
      } else if ("fi.polar.polarflow.action.ZONE_ALARM_TRIGGERED".equals(var3)) {
         j.a(this.a, j.h(this.a), j.i(this.a));
      } else if ("fi.polar.polarflow.action.PHASE_FINISH_ALARM_TRIGGERED".equals(var3)) {
         j.d(this.a).post(j.c(this.a));
      } else if ("fi.polar.polarflow.action.PRE_PHASE_FINISH_ALARM_TRIGGERED".equals(var3)) {
         this.a.a(false);
      } else if ("fi.polar.polarflow.action.PHASE_END_COUNTDOWN_ALARM_TRIGGERED".equals(var3)) {
         this.a.k();
      }

   }
}
