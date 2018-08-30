package fi.polar.polarflow.service.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class f extends BroadcastReceiver {
   // $FF: synthetic field
   final BluetoothAdaptationService a;

   f(BluetoothAdaptationService var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c(BluetoothAdaptationService.a(), "onReceive(" + var3 + ")");
      if ("com.polar.pftp.ACTION_CONNECTED".equals(var3)) {
         fi.polar.polarflow.util.d.c(BluetoothAdaptationService.a(), "onReceive(Host connected)");
         if (!BluetoothAdaptationService.a(this.a).isHeld()) {
            BluetoothAdaptationService.a(this.a).acquire(900000L);
         } else {
            fi.polar.polarflow.util.d.e(BluetoothAdaptationService.a(), "onReceive(Host connected, wakeLock already held");
         }

         if (BluetoothAdaptationService.b(this.a) == h.c) {
            BluetoothAdaptationService.c(this.a).a(true);
         }
      } else if ("com.polar.pftp.ACTION_CONNECTION_FAILED".equals(var3)) {
         fi.polar.polarflow.util.d.e(BluetoothAdaptationService.a(), "onReceive(Connection failed)");
         if (BluetoothAdaptationService.d(this.a) < BluetoothAdaptationService.e(this.a)) {
            BluetoothAdaptationService.f(this.a);
            BluetoothAdaptationService.g(this.a);
         } else {
            BluetoothAdaptationService.h(this.a).a(new Intent("fi.polar.polarflow.service.bluetooth.action.HOST_CONNECT_FAILED"));
            this.a.stopSelf();
         }
      } else if ("com.polar.pftp.ACTION_DISCONNECTED".equals(var3)) {
         fi.polar.polarflow.util.d.c(BluetoothAdaptationService.a(), "onReceive(Host disconnected)");
         if (BluetoothAdaptationService.b(this.a) == h.c) {
            BluetoothAdaptationService.c(this.a).a(false);
         }

         this.a.stopSelf();
      }

   }
}
