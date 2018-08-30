package fi.polar.polarflow.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.service.PeriodicJobService;
import fi.polar.polarflow.ui.NotificationReceiver;
import java.util.TimeZone;
import org.joda.time.DateTimeZone;

public class TimeOrZoneChangedReceiver extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      d.c("TimeOrZoneChangedReceiver", var2.toString());
      if ("android.intent.action.TIMEZONE_CHANGED".equals(var2.getAction())) {
         DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getDefault()));
      }

      Context var3 = var1.getApplicationContext();
      j.a(var3, true);
      PeriodicJobService.a(var3);
      NotificationReceiver.a(var3);
      fi.polar.polarflow.service.d.a(var1).a(2);
   }
}
