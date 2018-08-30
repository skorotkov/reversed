package fi.polar.polarflow.ftu;

import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.UserId;
import fi.polar.polarflow.service.TrainingService;
import fi.polar.polarflow.service.activity.DailyActivityService;
import fi.polar.polarflow.service.activity.SleepTrackingService;
import fi.polar.polarflow.util.r;
import fi.polar.polarflow.util.u;

public class o {
   private static fi.polar.polarflow.util.a a = new fi.polar.polarflow.util.a();

   public static void a(Context var0) {
      u.a().a(true);
      Intent var1 = new Intent();
      var1.setAction("fi.polar.polarflow.action.INITIALIZED");
      var0.sendBroadcast(var1);
   }

   public static void a(Context var0, boolean var1) {
      u.a().b(var1);
      if (var1) {
         TrainingService.a(var0.getApplicationContext());
         DailyActivityService.a(var0.getApplicationContext());
         SleepTrackingService.a(var0.getApplicationContext());
      } else {
         TrainingService.b(var0.getApplicationContext());
         DailyActivityService.b(var0.getApplicationContext());
         SleepTrackingService.b(var0.getApplicationContext());
      }

      Intent var2 = new Intent();
      var2.setAction("fi.polar.polarflow.action.PROVISIONING_STATUS");
      var2.putExtra("fi.polar.polarflow.extra.PROVISIONED", var1);
      var0.sendBroadcast(var2);
   }

   public static void a(boolean var0) {
      r.a.d(var0);
   }

   public static boolean a() {
      return r.a.c();
   }

   public static void b(boolean var0) {
      r.a.c(var0);
   }

   public static boolean b() {
      return r.a.d();
   }

   public static boolean c() {
      UserId var0 = UserId.getUserId();
      boolean var1;
      if (var0 != null && var0.getMasterIdentifier() != -1L && var0.getPasswordToken() != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }
}
