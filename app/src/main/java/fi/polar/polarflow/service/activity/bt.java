package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class bt extends BroadcastReceiver {
   // $FF: synthetic field
   final bs a;

   bt(bs var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("android.intent.action.TIME_SET".equals(var2.getAction())) {
         bs.a(this.a);
      } else if ("android.intent.action.TIMEZONE_CHANGED".equals(var2.getAction())) {
         bs.b(this.a);
      }

   }
}
