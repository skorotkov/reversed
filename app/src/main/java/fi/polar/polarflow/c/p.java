package fi.polar.polarflow.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class p extends BroadcastReceiver {
   // $FF: synthetic field
   final o_SessionSensors a;

   p(o_SessionSensors var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      fi.polar.polarflow.util.d.c(o_SessionSensors.f(), var2.getAction());
      if (var2.getAction().equals(o_SessionSensors.a)) {
         o_SessionSensors.a(this.a);
      } else if (var2.getAction().equals(o_SessionSensors.b) && !this.a.e()) {
         o_SessionSensors.a(this.a, (k)null);
      }

   }
}
