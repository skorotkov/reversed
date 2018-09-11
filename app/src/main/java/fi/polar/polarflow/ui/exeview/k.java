package fi.polar.polarflow.ui.exeview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.data.Lap;
import java.util.List;

class k extends BroadcastReceiver {
   // $FF: synthetic field
   final ExeViewActivity a;

   k(ExeViewActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      byte var3;
      label70: {
         String var5 = var2.getAction();
         fi.polar.polarflow.util.d.c("ExeViewActivity", var5);
         switch(var5.hashCode()) {
         case -2007803415:
            if (var5.equals("ExercisePhaseCalc.ACTION_PHASE_FINISHED")) {
               var3 = 6;
               break label70;
            }
            break;
         case -1392251851:
            if (var5.equals("ExerciseLapCalc.ACTION_MANUAL_LAP")) {
               var3 = 1;
               break label70;
            }
            break;
         case -1097613786:
            if (var5.equals("ExerciseVolumeTargetCalc.action.TARGET_REACHED")) {
               var3 = 5;
               break label70;
            }
            break;
         case -459962514:
            if (var5.equals("TrainingService.action.TRAINING_PAUSED")) {
               var3 = 3;
               break label70;
            }
            break;
         case 9393966:
            if (var5.equals("ExercisePhaseCalc.ACTION_PHASE_ABOUT_TO_FINISH")) {
               var3 = 7;
               break label70;
            }
            break;
         case 513808247:
            if (var5.equals("TrainingService.action.TRAINING_RESUMED")) {
               var3 = 4;
               break label70;
            }
            break;
         case 690421316:
            if (var5.equals("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED")) {
               var3 = 8;
               break label70;
            }
            break;
         case 1006492254:
            if (var5.equals("ExerciseLapCalc.ACTION_AUTO_LAP")) {
               var3 = 0;
               break label70;
            }
            break;
         case 1826909037:
            if (var5.equals("TrainingService.action.TRAINING_STOPPED")) {
               var3 = 2;
               break label70;
            }
         }

         var3 = -1;
      }

      int var9;
      switch(var3) {
      case 0:
         if (var2.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1) != -1 && !ExeViewActivity.a(this.a)) {
            Lap var7 = (Lap)var2.getParcelableExtra("ExerciseLapCalc.KEY_LAP");
            ExeViewActivity.a(this.a, var7, ExeViewActivity.b(this.a).b(ak.e) - ExeViewActivity.b(this.a).b(ExeViewActivity.b(this.a).e()), this.a.b());
         }
         break;
      case 1:
         var9 = var2.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", -1);
         if (var9 != -1 && !ExeViewActivity.a(this.a)) {
            Lap var8 = (Lap)var2.getParcelableExtra("ExerciseLapCalc.KEY_LAP");
            if (var9 == 1) {
               List var6 = ExeViewActivity.a(this.a, false);
               ExeViewActivity.a(this.a, var8, var6.indexOf(ak.d) - var6.indexOf(ExeViewActivity.b(this.a).e()));
               ExeViewActivity.b(this.a).a(var6);
            } else {
               ExeViewActivity.a(this.a, var8, ExeViewActivity.b(this.a).b(ak.d) - ExeViewActivity.b(this.a).b(ExeViewActivity.b(this.a).e()));
            }
         }
         break;
      case 2:
         ExeViewActivity.c(this.a);
         break;
      case 3:
         ExeViewActivity.d(this.a).setCurrentItem(ak.a);
         ExeViewActivity.e(this.a);
         fi.polar.polarflow.ui.o.a(this.a.getApplicationContext());
         break;
      case 4:
         ExeViewActivity.f(this.a);
         break;
      case 5:
         ExeViewActivity.b(this.a, var2.getBooleanExtra("ExerciseVolumeTargetCalc.key.TARGET_DOUBLED", false));
         break;
      case 6:
         var9 = var2.getIntExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", -1);
         if (ExeViewActivity.g(this.a).getExercisePhase(var9) == null) {
            ExeViewActivity.h(this.a);
         }
         break;
      case 7:
         var9 = var2.getIntExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", -1);
         boolean var4 = var2.getBooleanExtra("ExercisePhaseCalc.KEY_PHASE_SKIPPED", false);
         ExeViewActivity.a(this.a, var9, var4);
         break;
      case 8:
         if (((m_SENSOR_STATE)var2.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE")).equals(m_SENSOR_STATE.a_DISABLED)) {
            if (ExeViewActivity.i(this.a).a_isPowerSaveMode()) {
               ExeViewActivity.j(this.a);
            }
         } else {
            ExeViewActivity.k(this.a);
         }
      }

   }
}
