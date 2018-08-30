package fi.polar.polarflow.util;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.NotificationReceiver;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

public class j {
   static long a(List var0, DateTime var1) {
      List var2 = var0;
      if (var0 == null) {
         var2 = a(var1);
      }

      Iterator var8 = var2.iterator();

      long var5;
      while(true) {
         if (var8.hasNext()) {
            TrainingSessionTarget var7 = (TrainingSessionTarget)var8.next();
            d.c("NotificationUtils", "getNextTargetAlarmTime() - " + var7.getStartTime() + " isDisplayedTargetNotification " + NotificationReceiver.c(var7.getStartTime()));
            if (NotificationReceiver.c(var7.getStartTime())) {
               continue;
            }

            long var3 = (new DateTime(var7.getStartTime())).minusHours(2).getMillis();
            var5 = var3;
            if ((new DateTime(var3)).isBefore(var1)) {
               var5 = var1.getMillis();
            }
            break;
         }

         var5 = -1L;
         break;
      }

      return var5;
   }

   public static List a(DateTime var0) {
      List var1 = TrainingSessionTarget.getTrainingTargetsForPeriod(var0.getMillis(), var0.plusDays(14).getMillis(), false);
      d.c("NotificationUtils", "getFutureTrainingTargets() - Found " + var1.size() + " future targets");
      return var1;
   }

   public static void a(Context var0) {
      ((AlarmManager)var0.getSystemService("alarm")).cancel(b(var0));
   }

   static void a(Context var0, long var1, AlarmManager var3) {
      if (var3 == null) {
         var3 = (AlarmManager)var0.getSystemService("alarm");
      }

      var3.cancel(b(var0));
      if (var1 > 0L) {
         d.c("NotificationUtils", "Set next target notification check " + (var1 - System.currentTimeMillis()) / 1000L + " seconds from now");
         var3.setExact(0, var1, b(var0));
      }

   }

   public static void a(Context var0, List var1, DateTime var2, boolean var3) {
      a(var0, var1, var2, var3, (AlarmManager)null);
   }

   static void a(Context var0, List var1, DateTime var2, boolean var3, AlarmManager var4) {
      long var5 = a(var1, var2);
      long var7 = var2.plusDays(1).withTimeAtStartOfDay().getMillis();
      if (var5 > 0L) {
         if (var5 < var7 || !var3) {
            var7 = var5;
         }
      } else if (!var3) {
         var7 = -1L;
      }

      a(var0, var7, var4);
   }

   public static void a(Context var0, boolean var1) {
      a(var0, (List)null, DateTime.now(), var1, (AlarmManager)null);
   }

   private static PendingIntent b(Context var0) {
      return PendingIntent.getBroadcast(var0.getApplicationContext(), 0, new Intent("fi.polar.polarflow.action.TARGET_NOTIFICATION"), 0);
   }
}
