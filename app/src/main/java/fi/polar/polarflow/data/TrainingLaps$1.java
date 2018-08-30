package fi.polar.polarflow.data;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.util.d;

class TrainingLaps$1 extends BroadcastReceiver {
   // $FF: synthetic field
   final TrainingLaps this$0;

   TrainingLaps$1(TrainingLaps var1) {
      this.this$0 = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      d.c("TrainingLaps", var3);
      if ("ExerciseLapCalc.ACTION_AUTO_LAP".equals(var3)) {
         TrainingLaps.access$000(this.this$0).add((Lap)var2.getParcelableExtra("ExerciseLapCalc.KEY_LAP"));
      } else if ("ExerciseLapCalc.ACTION_MANUAL_LAP".equals(var3)) {
         TrainingLaps.access$100(this.this$0).add((Lap)var2.getParcelableExtra("ExerciseLapCalc.KEY_LAP"));
      }

   }
}
