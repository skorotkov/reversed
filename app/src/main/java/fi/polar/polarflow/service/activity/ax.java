package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class ax extends BroadcastReceiver {
   // $FF: synthetic field
   final aw a;

   ax(aw var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      fi.polar.polarflow.util.d.c(aw.a(this.a), "onReceive(): " + var2.getAction());
      if ("android.os.action.DEVICE_IDLE_MODE_CHANGED".equals(var2.getAction())) {
         if (this.a.m()) {
            aw.b(this.a);
         } else {
            aw.c(this.a);
         }
      }

   }
}
