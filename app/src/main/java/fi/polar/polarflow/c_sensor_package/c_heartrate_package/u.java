package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

import java.util.List;

import fi.polar.polarflow.c_sensor_package.b_PolarSensorEventBase;
import fi.polar.polarflow.c_sensor_package.j_PolarSensorEventListener;

class u implements j_PolarSensorEventListener {
   // $FF: synthetic field
   final s a;

   u(s var1) {
      this.a = var1;
   }

   public void a_onPolarSensorEvents(List var1) {
      b_PolarSensorEventBase var2 = (b_PolarSensorEventBase)var1.get(var1.size() - 1);
      s var3 = this.a;
      int var4;
      if (var2.a != null) {
         var4 = Math.round(var2.a[0]);
      } else {
         var4 = 0;
      }

      var3.a(var4);
      if (s.a(this.a) != null) {
         s.a(this.a).a_onPolarSensorEvents(var1);
      }

   }
}
