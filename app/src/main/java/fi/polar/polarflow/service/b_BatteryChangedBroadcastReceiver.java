package fi.polar.polarflow.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class b_BatteryChangedBroadcastReceiver extends BroadcastReceiver {
   // $FF: synthetic field
   final a_BatteryManager a_batteryManager;

   b_BatteryChangedBroadcastReceiver(a_BatteryManager var1) {
      this.a_batteryManager = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("android.intent.action.BATTERY_CHANGED".equals(var2.getAction())) {
         boolean var3 = a_BatteryManager.a_isBatteryLow(this.a_batteryManager);
         a_BatteryManager.a_setIsBatteryLow(this.a_batteryManager, a_BatteryManager.a_isBatteryLow(var2));
         if (a_BatteryManager.a_isBatteryLow(this.a_batteryManager) && !var3) {
            this.a_batteryManager.e_notifyBatteryLow();
         }

         var3 = a_BatteryManager.b_isBatterySafeForOperations(this.a_batteryManager);
         a_BatteryManager.b_setIsBatterySafeForOperations(this.a_batteryManager, a_BatteryManager.b_isBatterySafeForOperations(var2));
         if (var3 != a_BatteryManager.b_isBatterySafeForOperations(this.a_batteryManager)) {
            if (a_BatteryManager.b_isBatterySafeForOperations(this.a_batteryManager)) {
               this.a_batteryManager.f_notifyBatterySafeForOperations();
            } else {
               this.a_batteryManager.g_notifyBatteryNotSafeForOperations();
            }
         }
      }

   }
}
