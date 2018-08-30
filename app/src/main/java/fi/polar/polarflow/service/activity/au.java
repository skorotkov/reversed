package fi.polar.polarflow.service.activity;

import android.hardware.Sensor;

public class au {
   private final Sensor a;

   public au(Sensor var1) {
      this.a = var1;
   }

   public Sensor a() {
      return this.a;
   }

   public int b() {
      return this.a.getFifoMaxEventCount();
   }
}
