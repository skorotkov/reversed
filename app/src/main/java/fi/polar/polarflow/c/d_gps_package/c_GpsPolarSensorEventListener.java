package fi.polar.polarflow.c.d_gps_package;

import java.util.List;

import fi.polar.polarflow.c.j_PolarSensorEventListener;

class c_GpsPolarSensorEventListener implements j_PolarSensorEventListener {
   // $FF: synthetic field
   final b_GpsLocationProvider a_gpsLocationProvider;

   c_GpsPolarSensorEventListener(b_GpsLocationProvider var1) {
      this.a_gpsLocationProvider = var1;
   }

   public void a_onPolarSensorEvents(List var1) {
      if (b_GpsLocationProvider.a_getPolarSensorListener(this.a_gpsLocationProvider) != null) {
         b_GpsLocationProvider.a_getPolarSensorListener(this.a_gpsLocationProvider).a_onPolarSensorEvents(var1);
      }
   }
}
