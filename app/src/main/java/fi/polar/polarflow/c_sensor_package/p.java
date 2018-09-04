package fi.polar.polarflow.c_sensor_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class p extends BroadcastReceiver {
   // $FF: synthetic field
   final o a;

   p(o var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      fi.polar.polarflow.util.d.c(o.f(), var2.getAction());
      if (var2.getAction().equals(o.a)) {
         o.a(this.a);
      } else if (var2.getAction().equals(o.b) && !this.a.e()) {
         o.a(this.a, (k)null);
      }

   }
}
