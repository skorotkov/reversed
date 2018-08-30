package fi.polar.polarflow.service.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import fi.polar.polarflow.service.datalayer.am;
import fi.polar.polarflow.util.u;
import fi.polar.polarflow.util.y;

public class BluetoothSyncReceiver extends BroadcastReceiver {
   private static final String a = BluetoothSyncReceiver.class.getSimpleName();

   private void a(Context var1) {
      String var2 = u.a().c();
      if (TextUtils.isEmpty(var2)) {
         var1.startService(BluetoothAdaptationService.a(var1, 900000));
      } else if (a()) {
         var1.startService(BluetoothAdaptationService.a(var1, var2, 3));
      }

   }

   private static boolean a() {
      return fi.polar.polarflow.util.r.a.b();
   }

   private void b(Context var1) {
      (new am()).a(var1, "/MESSAGE/INITIALIZE", (byte[])null, (String)null);
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c(a, "onReceive: " + var3);
      if (!y.f(var1)) {
         if ("fi.polar.polarflow.action.TRIGGER_SYNC".equals(var3)) {
            this.a(var1);
         } else if ("fi.polar.polarflow.action.CANCEL_SYNC".equals(var3)) {
            var1.startService(BluetoothAdaptationService.a(var1));
         } else if ("fi.polar.polarflow.action.ACTION_WEAR_CONNECTED".equals(var3)) {
            if (y.g(var1)) {
               this.a(var1);
            }
         } else if ("fi.polar.polarflow.action.ACTION_WEAR_DISCONNECTED".equals(var3)) {
            var1.startService(BluetoothAdaptationService.a(var1));
         } else if ("fi.polar.polarflow.service.bluetooth.action.HOST_FOUND".equals(var3)) {
            String var4 = var2.getStringExtra("fi.polar.polarflow.service.bluetooth.extra.HOST_ADDRESS");
            u.a().a(var4);
            if (!u.a().d()) {
               this.b(var1);
            } else if (a()) {
               var1.startService(BluetoothAdaptationService.a(var1, var4, 3));
            }
         }
      }

   }
}
