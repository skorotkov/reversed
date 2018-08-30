package fi.polar.polarflow.c_package.b_package;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class k extends BroadcastReceiver {
   // $FF: synthetic field
   final j a;

   k(j var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(var2.getAction())) {
         int var3 = var2.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
         fi.polar.polarflow.util.d.c("BluetoothStatusHandler", "Bluetooth state changed to " + var3);
         if (j.a(this.a) != null) {
            if (var3 == 12) {
               j.a(this.a, true);
               j.a(this.a, 500L);
            } else {
               j.a(this.a, false);
               j.a(this.a, 0L);
            }
         }
      }

   }
}
