package fi.polar.polarflow.ui.exewait;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class d extends BroadcastReceiver {
   // $FF: synthetic field
   final ExeWaitActivity a;

   d(ExeWaitActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var4 = var2.getAction();
      fi.polar.polarflow.util.d.c("ExeWaitActivity", var4);
      byte var3 = -1;
      switch(var4.hashCode()) {
      case -560907693:
         if (var4.equals("ExeWaitActivity.ACTION_COLUMN_PEEK")) {
            var3 = 3;
         }
         break;
      case -392338330:
         if (var4.equals("SyncJournalingService.action.JOURNALING_STARTED")) {
            var3 = 4;
         }
         break;
      case 690421316:
         if (var4.equals("fi.polar.polarflow.SENSOR_LOCATION_STATE_CHANGED")) {
            var3 = 1;
         }
         break;
      case 1460958790:
         if (var4.equals("ExeWaitActivity.ACTION_ENABLE_TARGET_MODE")) {
            var3 = 2;
         }
         break;
      case 1645850864:
         if (var4.equals("SyncJournalingService.action.JOURNALING_COMPLETED")) {
            var3 = 5;
         }
         break;
      case 1961201775:
         if (var4.equals("fi.polar.polarflow.ACTION_SENSOR_PAIRING_CONFIRMATION_NEEDED")) {
            var3 = 0;
         }
      }

      switch(var3) {
      case 0:
         ExeWaitActivity.a(this.a, var2.getStringExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_ADDRESS"));
         ExeWaitActivity.b(this.a, var2.getStringExtra("fi.polar.polarflow.KEY_BLUETOOTH_DEVICE_NAME"));
         break;
      case 1:
         if ((fi.polar.polarflow.c.m)var2.getSerializableExtra("fi.polar.polarflow.SENSOR_STATE") == fi.polar.polarflow.c.m.d && !ExeWaitActivity.a(this.a)) {
            fi.polar.polarflow.ui.o.a(this.a.getApplicationContext(), fi.polar.polarflow.util.b.a);
            ExeWaitActivity.a(this.a, true);
         }
         break;
      case 2:
         var4 = var2.getStringExtra(fi.polar.polarflow.ui.myday.item.e.c);
         if (var4 != null) {
            ExeWaitActivity.b(this.a).a(var4);
            ExeWaitActivity.c(this.a);
         }
         break;
      case 3:
         ExeWaitActivity.d(this.a).c();
         break;
      case 4:
         ExeWaitActivity.e(this.a);
         break;
      case 5:
         if (var2.getIntExtra("SyncJournalingService.extra.NUM_OF_ENTRIES", 0) > 0) {
            if (ExeWaitActivity.b(this.a).a()) {
               ExeWaitActivity.f(this.a);
            } else {
               ExeWaitActivity.g(this.a);
            }

            ExeWaitActivity.h(this.a);
         }
      }

   }
}
