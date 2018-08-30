package fi.polar.polarflow.calculators;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AlarmReceiver extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      if ("fi.polar.polarflow.action.CALCULATOR_ALARM".equals(var2.getAction()) && var2.hasExtra("fi.polar.polarflow.extra.LOCAL_ACTION") && var2.getStringExtra("fi.polar.polarflow.extra.LOCAL_ACTION") != null) {
         android.support.v4.c.g.a(var1).a(new Intent(var2.getStringExtra("fi.polar.polarflow.extra.LOCAL_ACTION")));
      }

   }
}
