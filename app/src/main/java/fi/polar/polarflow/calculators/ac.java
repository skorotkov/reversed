package fi.polar.polarflow.calculators;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class ac extends BroadcastReceiver {
   // $FF: synthetic field
   final ab_ManualLapCalc a;

   ac(ab_ManualLapCalc var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("fi.polar.polarflow.action.ADD_MANUAL_LAP".equals(var2.getAction())) {
         ab_ManualLapCalc.a(this.a).post(this.a.f());
      }

   }
}
