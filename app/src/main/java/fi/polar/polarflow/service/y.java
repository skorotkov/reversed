package fi.polar.polarflow.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class y extends BroadcastReceiver {
   // $FF: synthetic field
   final w a;

   y(w var1) {
      this.a = var1;
   }

   private void onReceive__$prependPatch(Context var1, Intent var2) {
      String var3 = var2.getAction();
      this.a.playSound(var3);
   }

   private void onReceive__$prependSource(Context var1, Intent var2) {
      String var4 = var2.getAction();
      byte var3 = -1;
      switch(var4.hashCode()) {
      case -2007803415:
         if (var4.equals("ExercisePhaseCalc.ACTION_PHASE_FINISHED")) {
            var3 = 5;
         }
         break;
      case -1665453447:
         if (var4.equals("ExercisePhaseCalc.ACTION_BELOW_TARGET_ZONE")) {
            var3 = 3;
         }
         break;
      case -1392251851:
         if (var4.equals("ExerciseLapCalc.ACTION_MANUAL_LAP")) {
            var3 = 0;
         }
         break;
      case -1097613786:
         if (var4.equals("ExerciseVolumeTargetCalc.action.TARGET_REACHED")) {
            var3 = 7;
         }
         break;
      case 482871269:
         if (var4.equals("ExercisePhaseCalc.ACTION_ABOVE_TARGET_ZONE")) {
            var3 = 2;
         }
         break;
      case 562909274:
         if (var4.equals("ExercisePhaseCalc.ACTION_TARGET_ZONE_REACHED")) {
            var3 = 4;
         }
         break;
      case 1006492254:
         if (var4.equals("ExerciseLapCalc.ACTION_AUTO_LAP")) {
            var3 = 1;
         }
         break;
      case 2095097974:
         if (var4.equals("ExercisePhaseCalc.ACTION_PHASE_END_COUNTDOWN")) {
            var3 = 6;
         }
      }

      switch(var3) {
      case 0:
      case 1:
         w.a(this.a, 500L);
         break;
      case 2:
      case 3:
      case 4:
         w.a(this.a, var2.getAction());
         break;
      case 5:
         w.b(this.a, w.a(this.a).b());
         if (var2.getIntExtra("ExercisePhaseCalc.KEY_PHASE_GOAL", 0) == 2) {
            w.a(this.a, fi.polar.polarflow.util.b.e);
         } else {
            w.a(this.a, fi.polar.polarflow.util.b.g);
         }
         break;
      case 6:
         w.a(this.a, fi.polar.polarflow.util.b.f);
         break;
      case 7:
         w.a(this.a, fi.polar.polarflow.util.b.g);
      }

   }

   public void onReceive(Context var1, Intent var2) {
      this.onReceive__$prependPatch(var1, var2);
      this.onReceive__$prependSource(var1, var2);
   }
}
