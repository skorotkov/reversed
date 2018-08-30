package fi.polar.polarflow.ui;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Notification.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.text.format.DateFormat;
import fi.polar.polarflow.data.orm.ExerciseTarget;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.data.orm.UserId;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.Period;

public class NotificationReceiver extends BroadcastReceiver {
   private static String a;
   private static volatile List b;
   private NotificationManager c;
   private Random d;
   private fi.polar.polarflow.util.f e;

   public static Notification a(Context var0, boolean var1, long var2) {
      int var4;
      if (var1) {
         var4 = 2131231056;
      } else {
         var4 = 2131231057;
      }

      String var5 = var0.getString(var4);
      long var6;
      if (var2 > fi.polar.polarflow.ui.c.a) {
         var6 = fi.polar.polarflow.ui.c.a;
      } else {
         var6 = var2;
         if (var2 < 0L) {
            var6 = 0L;
         }
      }

      PendingIntent var8 = PendingIntent.getActivity(var0, 0, new Intent(var0, StartActivity.class), 0);
      Builder var9 = m(var0).setContentIntent(var8).setContentTitle(var5).setSmallIcon(2130837679).setCategory("service").setOngoing(true).setUsesChronometer(false);
      if (var1) {
         var9.setContentText(String.format(Locale.getDefault(), "%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(var6), TimeUnit.MILLISECONDS.toMinutes(var6) % 60L, TimeUnit.MILLISECONDS.toSeconds(var6) % 60L));
      } else {
         var9.setUsesChronometer(true).setWhen((new fi.polar.polarflow.util.aa()).a() - var6);
      }

      return var9.build();
   }

   private static List a() {
      // $FF: Couldn't be decompiled
   }

   public static void a(long var0) {
      if (!a().contains(var0)) {
         a().add(var0);
      }

   }

   public static void a(Context var0) {
      (new NotificationReceiver()).b(var0.getApplicationContext());
   }

   public static void a(Context var0, int var1) {
      NotificationReceiver var2 = new NotificationReceiver();
      switch(var1) {
      case 0:
         var2.j(var0);
         break;
      case 1:
         var2.k(var0);
         break;
      case 2:
         var2.l(var0);
         break;
      case 3:
         var2.d(var0, 3);
      case 4:
      case 5:
      case 6:
      default:
         break;
      case 7:
         var2.d(var0, 7);
      }

   }

   private void a(Context var1, int var2, int var3, fi.polar.polarflow.util.b.a var4) {
      Intent var5 = this.n(var1);
      var5.putExtra("MyDayFragment.extra.SCROLL_TO_MY_DAY_ITEM", var4.c());
      PendingIntent var7 = PendingIntent.getActivity(var1, 7, var5, 134217728);
      Builder var6 = m(var1).setSmallIcon(Icon.createWithBitmap(this.c().a(var1, var1.getString(2131231148), (float)var1.getResources().getDimensionPixelSize(2131362245), -1, 0.0F, 0.0F))).setContentIntent(var7).setContentTitle(String.format(var1.getString(2131231055), var2, var3)).setContentText(var1.getString(2131231054)).setWhen(var4.b.getMillis()).setAutoCancel(true);
      this.o(var1).notify(7, var6.build());
   }

   private void a(Context var1, Intent var2) {
      if (var2.getBooleanExtra("fi.polar.polarflow.extra.PROVISIONED", false)) {
         this.f(var1);
      } else {
         fi.polar.polarflow.util.d.c("NotificationReceiver", "FTU has failed, no notification shown");
      }

   }

   private void a(Context var1, TrainingSessionTarget var2) {
      if (var2 != null) {
         Intent var3 = this.n(var1);
         var3.putExtra(fi.polar.polarflow.ui.myday.item.e.c, var2.getPath());
         PendingIntent var4 = PendingIntent.getActivity(var1, (int)var2.getStartTime(), var3, 134217728);
         String var5 = this.a(var1, var2.getStartTime());
         String var7 = var2.getName();
         int var6;
         if ((new DateTime(var2.getStartTime())).getHourOfDay() < 2) {
            var6 = 2131231058;
         } else {
            var6 = 2131231059;
         }

         var5 = var1.getString(var6, new Object[]{var5});
         Builder var8 = m(var1).setContentIntent(var4).setContentTitle(var7).setSmallIcon(b(var2)).setContentText(var5).setVibrate(fi.polar.polarflow.util.b.j).setGroup("TARGET_NOTIFICATION_GROUP");
         this.o(var1).notify(var2.getPath(), 6, var8.build());
      }

   }

   private void a(Context var1, String var2) {
      this.o(var1).cancel(var2, 6);
   }

   private boolean a(TrainingSessionTarget var1) {
      boolean var2 = false;
      if ((new DateTime(var1.getStartTime())).isBefore(DateTime.now().withTimeAtStartOfDay())) {
         var2 = true;
      }

      return var2;
   }

   private static int b(TrainingSessionTarget var0) {
      int var1 = 2130837677;
      int var2 = var1;
      if (var0 != null) {
         ExerciseTarget var3 = var0.getExerciseTarget();
         var2 = var1;
         if (var3 != null) {
            if (var3.getTargetType() == 1) {
               switch(var3.getVolumeTargetType()) {
               case 0:
                  var2 = 2130837676;
                  break;
               case 1:
                  var2 = 2130837675;
                  break;
               case 2:
                  var2 = 2130837674;
                  break;
               default:
                  var2 = var1;
               }
            } else {
               var2 = var1;
               if (var3.getTargetType() == 2) {
                  var2 = 2130837678;
               }
            }
         }
      }

      return var2;
   }

   private Random b() {
      if (this.d == null) {
         this.d = new Random();
      }

      return this.d;
   }

   static void b(long var0) {
      Iterator var2 = a().iterator();

      while(var2.hasNext()) {
         if ((Long)var2.next() < var0) {
            var2.remove();
         }
      }

   }

   private void b(Context var1, int var2) {
      UserId var3 = UserId.getUserId();
      if (var3 != null && !TextUtils.isEmpty(var3.getFirstName())) {
         Builder var4 = m(var1).setSmallIcon(2130837671).setContentIntent(PendingIntent.getActivity(var1, 0, new Intent(), 0)).setAutoCancel(true).setContentText(String.format(this.c(var1, var2), var3.getFirstName()));
         this.o(var1).notify(5, var4.build());
      }

   }

   private void b(Context var1, Intent var2) {
      fi.polar.polarflow.service.activity.w var3 = (fi.polar.polarflow.service.activity.w)var2.getSerializableExtra("DailyActivityService.extra.INACTIVITY_STATUS");
      if (var3 == fi.polar.polarflow.service.activity.w.a) {
         this.e(var1);
      } else if (var3 == fi.polar.polarflow.service.activity.w.b || var3 == fi.polar.polarflow.service.activity.w.c) {
         this.k(var1);
      }

   }

   private fi.polar.polarflow.util.f c() {
      if (this.e == null) {
         this.e = new fi.polar.polarflow.util.f();
      }

      return this.e;
   }

   private String c(Context var1, int var2) {
      String var3;
      switch(var2 % 3) {
      case 0:
         var3 = var1.getString(2131231048);
         break;
      case 1:
         var3 = var1.getString(2131231049);
         break;
      case 2:
         var3 = var1.getString(2131231050);
         break;
      default:
         var3 = "";
      }

      return var3;
   }

   private void c(Context var1) {
      PhysData var2 = PhysData.getUserPhysData();
      if (var2 != null) {
         LocalDate var6 = var2.getBirthday();
         LocalDate var3 = new LocalDate();
         if (var6.getMonthOfYear() == var3.getMonthOfYear() && var6.getDayOfMonth() == var3.getDayOfMonth()) {
            this.b(var1, this.b().nextInt(3));
         } else {
            StatusBarNotification[] var7 = this.o(var1).getActiveNotifications();
            int var4 = var7.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               if (var7[var5].getId() == 5) {
                  this.d(var1, 5);
               }
            }
         }
      }

   }

   private void c(Context var1, Intent var2) {
      fi.polar.polarflow.util.b.a var3 = (fi.polar.polarflow.util.b.a)var2.getParcelableExtra("SleepTrackingService.extra.SLEEP_ANALYSIS");
      if (var3 != null) {
         Period var4 = new Period(fi.polar.polarflow.util.ab.a(TimeUnit.SECONDS.toMillis((long)var3.d)));
         this.a(var1, var4.getHours(), var4.getMinutes(), var3);
      }

   }

   public static boolean c(long var0) {
      return a().contains(var0);
   }

   private void d(Context var1) {
      boolean var2;
      if (fi.polar.polarflow.util.u.a().e() && (var1.getApplicationInfo().flags & 129) != 1) {
         var2 = false;
      } else {
         var2 = true;
      }

      if (!var2) {
         PendingIntent var3 = PendingIntent.getActivity(var1, 0, new Intent(var1, StartActivity.class), 0);
         Builder var4 = m(var1).setSmallIcon(2130837672).setContentIntent(var3).setAutoCancel(true).setContentText(var1.getString(2131231046));
         this.o(var1).notify(4, var4.build());
      }

   }

   private void d(Context var1, int var2) {
      this.o(var1).cancel(var2);
   }

   private void e(Context var1) {
      String var2 = var1.getString(2131231052);
      String var3 = var1.getString(2131231051);
      Builder var4 = m(var1).setContentIntent(PendingIntent.getActivity(var1, 0, new Intent(), 0)).setAutoCancel(true).setContentTitle(var2).setSmallIcon(2130837673).setContentText(var3).setVibrate(fi.polar.polarflow.util.b.i);
      this.o(var1).notify(1, var4.build());
   }

   private void f(Context var1) {
      String var2 = var1.getString(2131230981);
      String var3 = var1.getString(2131230986);
      PendingIntent var4 = PendingIntent.getActivity(var1, 0, new Intent(var1, StartActivity.class), 0);
      Builder var5 = m(var1).setSmallIcon(2130837672).setContentIntent(var4).setContentTitle(var2).setContentText(var3);
      this.o(var1).notify(3, var5.build());
   }

   private void g(Context var1) {
      int var2 = this.i(var1);
      DateTime var3 = DateTime.now();
      List var4 = fi.polar.polarflow.util.j.a(var3);
      boolean var5;
      if (var2 + this.a(var1, var4, var3) > 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      fi.polar.polarflow.util.j.a(var1, var4, var3, var5);
      b(var3.minusDays(1).getMillis());
   }

   private void h(Context var1) {
      StatusBarNotification[] var2 = this.o(var1).getActiveNotifications();
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         StatusBarNotification var5 = var2[var4];
         if (var5.getId() == 7 && SleepAnalysisResult.getRecordingDate(new DateTime(var5.getNotification().when)).isBefore((new fi.polar.polarflow.util.aa()).f())) {
            this.d(var1, 7);
         }
      }

   }

   private int i(Context var1) {
      int var2 = 0;
      StatusBarNotification[] var3 = this.o(var1).getActiveNotifications();
      int var4 = var3.length;

      int var7;
      for(int var5 = 0; var5 < var4; var2 = var7) {
         StatusBarNotification var6 = var3[var5];
         var7 = var2;
         if (var6.getId() == 6) {
            label25: {
               ++var2;
               String var9 = var6.getTag();
               TrainingSessionTarget var8 = TrainingSessionTarget.getTrainingTargetForPath(var9);
               if (var8 != null) {
                  var7 = var2;
                  if (!this.a(var8)) {
                     break label25;
                  }
               }

               fi.polar.polarflow.util.d.c("NotificationReceiver", "handleTargetNotification() - Dismiss target notification: " + var9);
               this.o(var1).cancel(var9, 6);
               var7 = var2 - 1;
            }
         }

         ++var5;
      }

      return var2;
   }

   private void j(Context var1) {
      this.o(var1).cancelAll();
   }

   private void k(Context var1) {
      this.d(var1, 1);
   }

   private void l(Context var1) {
      this.d(var1, 2);
   }

   private static Builder m(Context var0) {
      return (new Builder(var0)).setSmallIcon(2130837725).setLargeIcon(BitmapFactory.decodeResource(var0.getResources(), 2130837725)).setLocalOnly(true).setOnlyAlertOnce(true);
   }

   private Intent n(Context var1) {
      Intent var2 = new Intent(var1, StartActivity.class);
      var2.addFlags(67174400);
      return var2;
   }

   private NotificationManager o(Context var1) {
      NotificationManager var2;
      if (this.c != null) {
         var2 = this.c;
      } else {
         var2 = (NotificationManager)var1.getSystemService("notification");
      }

      return var2;
   }

   int a(Context var1, List var2, DateTime var3) {
      Iterator var7 = var2.iterator();

      int var4;
      int var6;
      for(var4 = 0; var7.hasNext(); var4 = var6) {
         TrainingSessionTarget var5 = (TrainingSessionTarget)var7.next();
         if (var5.getStartTime() > var3.plusHours(2).getMillis()) {
            break;
         }

         var6 = var4;
         if (!c(var5.getStartTime())) {
            var6 = var4;
            if (!TextUtils.equals(var5.getPath(), a)) {
               fi.polar.polarflow.util.d.c("NotificationReceiver", "handleTargetNotification() - Display target notification: " + var5.getPath());
               this.a(var1, var5);
               var6 = var4 + 1;
            }

            a(var5.getStartTime());
         }
      }

      return var4;
   }

   String a(Context var1, long var2) {
      String var4;
      if (DateFormat.is24HourFormat(var1)) {
         var4 = "HH:mm";
      } else {
         var4 = "h:mm a";
      }

      return DateFormat.format(var4, var2).toString();
   }

   void b(Context var1) {
      this.c(var1);
      this.h(var1);
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c("NotificationReceiver", "onReceive: " + var3);
      var1 = var1.getApplicationContext();
      if ("DailyActivityService.action.USER_INACTIVITY_STATUS".equals(var3)) {
         this.b(var1, var2);
      } else if ("TrainingService.action.TRAINING_STARTED".equals(var3)) {
         String var4 = var2.getStringExtra("TrainingService.extra.TRAINING_TARGET_PATH");
         a = var4;
         if (var4 != null) {
            this.a(var1, var4);
         }
      } else if ("fi.polar.polarflow.action.PROVISIONING_STATUS".equals(var3)) {
         this.a(var1, var2);
      } else if ("fi.polar.polarflow.action.APP_UPDATED".equals(var3)) {
         this.d(var1);
      } else if (!"fi.polar.polarflow.action.TARGET_NOTIFICATION".equals(var3) && !"SyncJournalingService.action.JOURNALING_COMPLETED".equals(var3)) {
         if ("SleepTrackingService.action.SLEEP_ANALYSIS_RESULT".equals(var3)) {
            this.c(var1, var2);
         }
      } else if (fi.polar.polarflow.util.u.a().e()) {
         this.g(var1);
      }

   }
}
