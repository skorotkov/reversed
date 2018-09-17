package fi.polar.polarflow.calculators;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class f extends BroadcastReceiver {
   // $FF: synthetic field
   final e_DurationLapCalc a;

   f(e_DurationLapCalc var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c("DurationLapCalc", "onReceive " + var3);
      if ("fi.polar.polarflow.action.AUTO_LAP_ALARM_TRIGGERED".equals(var3)) {
         e_DurationLapCalc.a(this.a).post(this.a.g());
      }

   }
}
