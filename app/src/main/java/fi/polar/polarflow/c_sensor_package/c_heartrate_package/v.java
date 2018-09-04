package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

import android.hardware.Sensor;
import android.os.Handler;

import fi.polar.polarflow.c_sensor_package.g_AndroidSensorEventListener;
import fi.polar.polarflow.c_sensor_package.j_PolarSensorEventListener;
import fi.polar.polarflow.c_sensor_package.m_SENSOR_STATE;

class v extends g_AndroidSensorEventListener {
   // $FF: synthetic field
   final s a;

   v(s var1, j_PolarSensorEventListener var2, Handler var3) {
      super(var2, var3);
      this.a = var1;
   }

   public void onAccuracyChanged(Sensor var1, int var2) {
      fi.polar.polarflow.util.d.c(s.p(), "onAccuracyChanged(" + (String)s.q().get(var2) + ")");
      if (var2 != 2 && var2 != 3 && var2 != 1 && var2 != 0) {
         s.b(this.a, m_SENSOR_STATE.c_SEARCHING);
      } else {
         s.a(this.a, m_SENSOR_STATE.d_READY);
      }

   }
}
