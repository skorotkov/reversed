package fi.polar.polarflow.c.d_gps_package;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;

import fi.polar.polarflow.c.b_PolarSensorEventBase;
import fi.polar.polarflow.c.g_AndroidSensorEventListener;
import fi.polar.polarflow.c.j_PolarSensorEventListener;

class d_GpsAndroidSensorEventListener extends g_AndroidSensorEventListener {
   // $FF: synthetic field
   final b_GpsLocationProvider a_gpsLocationProvider;

   d_GpsAndroidSensorEventListener(b_GpsLocationProvider var1, j_PolarSensorEventListener var2, Handler var3) {
      super(var2, var3);
      this.a_gpsLocationProvider = var1;
   }

   public void a(b_PolarSensorEventBase var1) {
      if (b_GpsLocationProvider.b(this.a_gpsLocationProvider)) {
         super.a(var1);
      }

   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onSensorChanged(SensorEvent var1) {
   }
}
