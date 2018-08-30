package fi.polar.polarflow.ftu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.ui.NotificationReceiver;

public class ApplicationReplacedReceiver extends BroadcastReceiver {
   private static final String a = ApplicationReplacedReceiver.class.getSimpleName();

   public void onReceive(Context var1, Intent var2) {
      fi.polar.polarflow.util.d.c(a, "onReceive() - Action: " + var2.getAction());
      if ("android.intent.action.MY_PACKAGE_REPLACED".equals(var2.getAction())) {
         var2 = new Intent("fi.polar.polarflow.action.APP_UPDATED");
         var2.setClass(var1.getApplicationContext(), NotificationReceiver.class);
         var1.getApplicationContext().sendBroadcast(var2);
      }

   }
}
