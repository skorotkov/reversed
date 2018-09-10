package fi.polar.polarflow.c.a_accelerometer_package;

import java.util.List;

class c implements Runnable {
   // $FF: synthetic field
   final a_AccelerometerSensor a;
   private final List b;

   c(a_AccelerometerSensor var1, List var2) {
      this.a = var1;
      this.b = var2;
   }

   public void run() {
      this.a.a(this.b);
   }
}
