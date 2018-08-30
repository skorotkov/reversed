package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class av extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      if ("android.intent.action.ACTION_SHUTDOWN".equals(var2.getAction())) {
         SleepTrackingService.b(var1);
      }

   }
}
