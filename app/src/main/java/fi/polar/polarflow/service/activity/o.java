package fi.polar.polarflow.service.activity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;

class o extends fi.polar.polarflow.c.d {
   // $FF: synthetic field
   final DailyActivityService a;

   o(DailyActivityService var1, Handler var2) {
      super(var2);
      this.a = var1;
   }

   protected Runnable b_get_reportCollectedEventsRunnable() {
      return DailyActivityService.j(this.a);
   }

   public void onAccuracyChanged(Sensor var1, int var2) {
   }

   public void onFlushCompleted(Sensor var1) {
      fi.polar.polarflow.util.d.c("DailyActivityService", "onFlushCompleted(sensorName=" + var1.getName() + ", sensorType=" + var1.getType() + ")");
   }

   public void onSensorChanged(SensorEvent var1) {
      al var2 = DailyActivityService.g(this.a);
      long var3 = var1.timestamp;
      boolean var5;
      if (var1.values[2] != 0.0F) {
         var5 = true;
      } else {
         var5 = false;
      }

      var2.a(var3, var5);
      DailyActivityService.i(this.a).add(new ao(var1));
      if (var1.values[3] != 0.0F) {
         DailyActivityService.i(this.a).add(new aq(var1.timestamp, (int)var1.values[4]));
      }

      super.onSensorChanged(var1);
   }
}
