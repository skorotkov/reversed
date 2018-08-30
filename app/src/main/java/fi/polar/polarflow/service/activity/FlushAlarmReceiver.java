package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class FlushAlarmReceiver extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      if (var2.getAction() != null && var2.getAction().equals("fi.polar.polarflow.action.FLUSH_SENSOR_ALARM")) {
         android.support.v4.c.g.a(var1).a(new Intent("fi.polar.polarflow.action.FLUSH_SENSOR_ALARM"));
      }

   }
}
