package fi.polar.polarflow.service.activity.a;

import fi.polar.polarflow.data.orm.DailySummary;
import org.joda.time.LocalDate;

class e {
   // $FF: synthetic method
   static DailySummary a(LocalDate var0) {
      return b(var0);
   }

   // $FF: synthetic method
   static void a(DailySummary var0) {
      b(var0);
   }

   private static DailySummary b(LocalDate var0) {
      DailySummary var1 = DailySummary.getDailySummary(var0);
      DailySummary var2 = var1;
      if (var1 == null) {
         var2 = c(var0);
      }

      return var2;
   }

   private static void b(DailySummary var0) {
      var0.setSteps(0);
      var0.setActivityCalories(0);
      var0.setTrainingCalories(0);
      var0.setBmrCalories(0);
      var0.setActivityGoal(-1.0F);
      var0.setAchievedActivity(-1.0F);
      var0.setTimeToGoUp(-1L);
      var0.setTimeToGoWalk(-1L);
      var0.setTimeToGoJog(-1L);
      var0.setTimeNonWear(0L);
      var0.setTimeSleep(0L);
      var0.setTimeSedentary(0L);
      var0.setTimeLightActivity(0L);
      var0.setTimeContinuousModerate(0L);
      var0.setTimeIntermittentModerate(0L);
      var0.setTimeContinuousVigorous(0L);
      var0.setTimeIntermittentVigorous(0L);
      var0.setActivityDistance(0.0F);
   }

   private static DailySummary c(LocalDate var0) {
      DailySummary var1 = new DailySummary();
      var1.setDate(var0);
      b(var1);
      return var1;
   }
}
