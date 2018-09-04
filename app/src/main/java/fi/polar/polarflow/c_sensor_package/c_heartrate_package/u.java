package fi.polar.polarflow.c_sensor_package.c_heartrate_package;

import java.util.List;

import fi.polar.polarflow.c_sensor_package.b_PolarSensorEvent;

class u implements fi.polar.polarflow.c_sensor_package.j {
   // $FF: synthetic field
   final s a;

   u(s var1) {
      this.a = var1;
   }

   public void a(List var1) {
      b_PolarSensorEvent var2 = (b_PolarSensorEvent)var1.get(var1.size() - 1);
      s var3 = this.a;
      int var4;
      if (var2.a != null) {
         var4 = Math.round(var2.a[0]);
      } else {
         var4 = 0;
      }

      var3.a(var4);
      if (s.a(this.a) != null) {
         s.a(this.a).a(var1);
      }

   }
}
