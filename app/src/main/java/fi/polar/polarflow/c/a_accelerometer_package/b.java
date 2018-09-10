package fi.polar.polarflow.c.a_accelerometer_package;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import fi.polar.polarflow.c.b_PolarSensorEventBase;

class b implements SensorEventListener {
   // $FF: synthetic field
   final a_AccelerometerSensor a;

   b(a_AccelerometerSensor var1) {
      this.a = var1;
   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onSensorChanged(SensorEvent var1) {
      if (a_AccelerometerSensor.a(this.a) == 0L || var1.timestamp - a_AccelerometerSensor.a(this.a) >= a_AccelerometerSensor.b(this.a)) {
         a_AccelerometerSensor.a(this.a, var1.timestamp);
         float var2 = var1.values[1];
         float var3 = -var1.values[0];
         float var4 = var1.values[2];
         long var5 = var1.timestamp;
         int var7 = var1.accuracy;
         b_PolarSensorEventBase var8 = new b_PolarSensorEventBase(new float[]{var2, var3, var4}, var5, var7);
         a_AccelerometerSensor.c(this.a).a(var8);
         if (a_AccelerometerSensor.d(this.a) == 0L) {
            a_AccelerometerSensor.b(this.a, a_AccelerometerSensor.a(this.a));
         }

         if (var1.timestamp - a_AccelerometerSensor.d(this.a) >= a_AccelerometerSensor.e(this.a)) {
            this.a.k();
            a_AccelerometerSensor.b(this.a, var1.timestamp);
         }
      }

   }
}
