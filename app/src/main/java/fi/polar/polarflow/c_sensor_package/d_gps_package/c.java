package fi.polar.polarflow.c_sensor_package.d_gps_package;

import java.util.List;

import fi.polar.polarflow.c_sensor_package.j_PolarSensorEventListener;

class c implements j_PolarSensorEventListener {
   // $FF: synthetic field
   final b_GpsLocationProvider a;

   c(b_GpsLocationProvider var1) {
      this.a = var1;
   }

   public void a_onPolarSensorEvents(List var1) {
      if (b_GpsLocationProvider.a(this.a) != null) {
         b_GpsLocationProvider.a(this.a).a_onPolarSensorEvents(var1);
      }

   }
}
