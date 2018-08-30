package fi.polar.polarflow.service.provider;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.ui.myday.WatchFaceMyDayActivity;
import fi.polar.polarflow.util.d;
import fi.polar.polarflow.util.u;

public class ComplicationActionReceiver extends BroadcastReceiver {
   private static void a(Context var0) {
      var0 = var0.getApplicationContext();
      var0.startActivity(new Intent(var0, WatchFaceMyDayActivity.class));
   }

   public void onReceive(Context var1, Intent var2) {
      if ("fi.polar.polarflow.action.COMPLICATION_TAP".equals(var2.getAction())) {
         int var3 = var2.getIntExtra("fi.polar.polarflow.extra.COMPLICATION_ID", -1);
         switch(var3) {
         case 0:
            if (u.a().e()) {
               a(var1);
            } else {
               d.e("ComplicationActionReceiver", "Tap action received while non provisioned");
            }
            break;
         default:
            d.e("ComplicationActionReceiver", "Unrecognized complication id received(id=" + var3 + ")");
         }
      }

   }
}
