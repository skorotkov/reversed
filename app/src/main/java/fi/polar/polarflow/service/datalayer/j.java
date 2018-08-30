package fi.polar.polarflow.service.datalayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import protocol.PftpResponse$PbPFtpBatteryStatusResult;
import protocol.PftpResponse$PbPFtpBatteryStatusResult$Builder;

public class j extends e {
   private static final String a = j.class.getSimpleName();

   private static int a(Intent var0) {
      int var1 = 0;
      if (var0 != null) {
         var1 = var0.getIntExtra("level", -1) * 100 / var0.getIntExtra("scale", 100);
      }

      return var1;
   }

   private static byte[] a(int var0, boolean var1) {
      PftpResponse$PbPFtpBatteryStatusResult$Builder var2 = PftpResponse$PbPFtpBatteryStatusResult.newBuilder();
      var2.setBatteryStatus(var0);
      var2.setCharging(var1);
      return var2.build().toByteArray();
   }

   private static boolean b(Intent var0) {
      boolean var1 = true;
      if (var0 != null) {
         if (2 != var0.getIntExtra("status", 1)) {
            var1 = false;
         }
      } else {
         var1 = false;
      }

      return var1;
   }

   public String a() {
      return "/MESSAGE/GET_BATTERY_STATUS";
   }

   protected void a(Context var1, byte[] var2) {
      Intent var5 = var1.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      int var3 = a(var5);
      boolean var4 = b(var5);
      fi.polar.polarflow.util.d.c(a, "Battery status: " + var3 + "%, charging=" + var4);
      this.b(var1, a(var3, var4));
   }
}
