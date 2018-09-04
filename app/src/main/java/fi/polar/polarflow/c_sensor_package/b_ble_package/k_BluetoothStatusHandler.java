package fi.polar.polarflow.c_sensor_package.b_ble_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class k_BluetoothStatusHandler extends BroadcastReceiver {
   // $FF: synthetic field
   final j_BluetoothStatusHandler a;

   k_BluetoothStatusHandler(j_BluetoothStatusHandler var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(var2.getAction())) {
         int var3 = var2.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
         fi.polar.polarflow.util.d.c("BluetoothStatusHandler", "Bluetooth state changed to " + var3);
         if (j_BluetoothStatusHandler.a(this.a) != null) {
            if (var3 == 12) {
               j_BluetoothStatusHandler.a(this.a, true);
               j_BluetoothStatusHandler.a(this.a, 500L);
            } else {
               j_BluetoothStatusHandler.a(this.a, false);
               j_BluetoothStatusHandler.a(this.a, 0L);
            }
         }
      }

   }
}
