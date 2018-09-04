package fi.polar.polarflow.c_sensor_package.d_gps_package;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;

import fi.polar.polarflow.c_sensor_package.b_PolarSensorEvent;
import fi.polar.polarflow.c_sensor_package.g_PolarSensorEventListener;

class d extends g_PolarSensorEventListener {
   // $FF: synthetic field
   final b_GpsLocationProvider a;

   d(b_GpsLocationProvider var1, fi.polar.polarflow.c_sensor_package.j var2, Handler var3) {
      super(var2, var3);
      this.a = var1;
   }

   public void a(b_PolarSensorEvent var1) {
      if (b_GpsLocationProvider.b(this.a)) {
         super.a(var1);
      }

   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onSensorChanged(SensorEvent var1) {
   }
}
