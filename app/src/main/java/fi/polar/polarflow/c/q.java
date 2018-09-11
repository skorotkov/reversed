package fi.polar.polarflow.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class q extends BroadcastReceiver {
   // $FF: synthetic field
   final o_SessionSensors a;

   q(o_SessionSensors var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      m_SENSOR_STATE var3 = (m_SENSOR_STATE)var2.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE");
      fi.polar.polarflow.util.d.c(o_SessionSensors.f(), "mSensorStateReceiver: action= " + var2.getAction() + ", state=" + var3);
      if (o_SessionSensors.b(this.a) != null) {
         o_SessionSensors.b(this.a).a(var3);
      }

   }
}
