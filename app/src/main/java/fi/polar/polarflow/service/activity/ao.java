package fi.polar.polarflow.service.activity;

import android.hardware.SensorEvent;

class ao extends am {
   public final float a;
   public final boolean c;

   public ao(SensorEvent var1) {
      boolean var2 = true;
      super(var1.timestamp);
      this.a = var1.values[0];
      if (var1.values[1] == 0.0F) {
         var2 = false;
      }

      this.c = var2;
   }
}
