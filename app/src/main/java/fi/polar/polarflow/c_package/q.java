package fi.polar.polarflow.c_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class q extends BroadcastReceiver {
   // $FF: synthetic field
   final o a;

   q(o var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      m var3 = (m)var2.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE");
      fi.polar.polarflow.util.d.c(o.f(), "mSensorStateReceiver: action= " + var2.getAction() + ", state=" + var3);
      if (o.b(this.a) != null) {
         o.b(this.a).a(var3);
      }

   }
}
