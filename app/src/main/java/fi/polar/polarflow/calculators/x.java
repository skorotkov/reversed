package fi.polar.polarflow.calculators;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class x extends BroadcastReceiver {
   // $FF: synthetic field
   final w a;

   x(w var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      if ("DailyActivityService.action.TRAINING_LOAD_DATA".equals(var3)) {
         w.a(this.a, var2.getIntExtra("DailyActivityService.extra.TOTAL_CALORIES", 0));
      } else if ("fi.polar.polarflow.ACTION_LOCATION_DATA".equals(var3)) {
         w.a(this.a, var2.getFloatExtra("fi.polar.polarflow.KEY_SENSOR_LOCATION_DISTANCE_VALUE", 0.0F));
      } else if ("fi.polar.polarflow.action.VOLUME_TARGET_ALARM_TRIGGERED".equals(var3)) {
         w.a(this.a);
         w.b(this.a);
      } else if ("SwimmingMetricsProvider.ACTION_POOL_SWIMMING_OUTPUT_DATA".equals(var3)) {
         w.a(this.a, var2.getFloatExtra("SwimmingMetricsProvider.KEY_POOL_SWIMMING_DISTANCE", 0.0F));
      }

   }
}
