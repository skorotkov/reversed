package fi.polar.polarflow.service.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.SportProfile;
import java.util.concurrent.TimeUnit;

class q extends BroadcastReceiver {
   // $FF: synthetic field
   final DailyActivityService a;

   q(DailyActivityService var1) {
      this.a = var1;
   }

   private long a(Intent var1) {
      long var2 = -1L;
      if (!"TrainingService.action.TRAINING_STOPPED".equals(var1.getAction())) {
         var2 = var1.getLongExtra(SportProfile.KEY_SPORT_ID, -1L);
      }

      return var2;
   }

   private boolean a(long var1) {
      boolean var3 = true;
      SportProfile var4;
      if (var1 != -1L) {
         var4 = SportProfile.getSportProfileBySportId(var1);
      } else {
         var4 = null;
      }

      if (var4 == null || !var4.getSettings().isSensorEnabled(1)) {
         var3 = false;
      }

      return var3;
   }

   private ar b(Intent var1) {
      long var2 = this.a(var1);
      return new ar(TimeUnit.MILLISECONDS.toNanos(var1.getLongExtra("TrainingService.key.TIMESTAMP", 0L)), var2, "TrainingService.action.TRAINING_PAUSED".equals(var1.getAction()), this.a(var2));
   }

   public void onReceive(Context var1, Intent var2) {
      String var8 = var2.getAction();
      byte var3 = -1;
      switch(var8.hashCode()) {
      case -459962514:
         if (var8.equals("TrainingService.action.TRAINING_PAUSED")) {
            var3 = 1;
         }
         break;
      case 513808247:
         if (var8.equals("TrainingService.action.TRAINING_RESUMED")) {
            var3 = 2;
         }
         break;
      case 641398072:
         if (var8.equals("ExerciseSampleHeartrateCalc.ACTION_HR_AVG_DATA")) {
            var3 = 4;
         }
         break;
      case 1568028613:
         if (var8.equals("fi.polar.polarflow.action.FLUSH_LOGS")) {
            var3 = 6;
         }
         break;
      case 1645850864:
         if (var8.equals("SyncJournalingService.action.JOURNALING_COMPLETED")) {
            var3 = 5;
         }
         break;
      case 1814043169:
         if (var8.equals("TrainingService.action.TRAINING_STARTED")) {
            var3 = 0;
         }
         break;
      case 1826909037:
         if (var8.equals("TrainingService.action.TRAINING_STOPPED")) {
            var3 = 3;
         }
      }

      switch(var3) {
      case 0:
         DailyActivityService.l(this.a).add(this.b(var2));
         DailyActivityService.b(this.a).a(this.a(var2));
         DailyActivityService.e(this.a).a();
         DailyActivityService.m(this.a).a();
         DailyActivityService.a(this.a, new ad(DailyActivityService.m(this.a)));
         DailyActivityService.a(this.a, new bv(DailyActivityService.n(this.a).getSportFactor()));
         break;
      case 1:
         DailyActivityService.l(this.a).add(this.b(var2));
         this.a.b.a(DailyActivityService.f(this.a));
         break;
      case 2:
         DailyActivityService.l(this.a).add(this.b(var2));
         break;
      case 3:
         DailyActivityService.l(this.a).add(this.b(var2));
         DailyActivityService.b(this.a).a(-1L);
         DailyActivityService.e(this.a).a();
         DailyActivityService.a(this.a, (bv)null);
         DailyActivityService.a(this.a, (ad)null);
         this.a.c.a("DailyActivityService.action.TRAINING_LOAD_DATA");
         break;
      case 4:
         long var4 = var2.getLongExtra("ExerciseSampleHeartrateCalcKEY_TIMESTAMP", 0L);
         float var6 = var2.getFloatExtra("ExerciseSampleHeartrateCalcKEY_HR_AVG_10S", 0.0F);
         float var7 = var2.getFloatExtra("ExerciseSampleHeartrateCalcKEY_HR_AVG_30S", 0.0F);
         DailyActivityService.o(this.a).add(new an(var4, var6, var7));
         if (!DailyActivityService.i(this.a).isEmpty()) {
            DailyActivityService.p(this.a).removeCallbacks(DailyActivityService.j(this.a));
            DailyActivityService.p(this.a).post(DailyActivityService.j(this.a));
         }
         break;
      case 5:
         DailyActivityService.b(this.a, var2.getIntExtra("SyncJournalingService.extra.NUM_OF_ENTRIES", 0));
         break;
      case 6:
         fi.polar.polarflow.b_package.c var9 = DailyActivityService.a(this.a, TimeUnit.MILLISECONDS.toNanos(DailyActivityService.k(this.a).b()));
         if (var9 != null) {
            var9.a();
         }
      }

   }
}
