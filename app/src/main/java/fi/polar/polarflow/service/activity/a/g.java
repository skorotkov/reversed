package fi.polar.polarflow.service.activity.a;

import fi.polar.polarflow.data.orm.RecoveryTimes;

class g {
   // $FF: synthetic method
   static RecoveryTimes a() {
      return d();
   }

   // $FF: synthetic method
   static void a(RecoveryTimes var0) {
      l(var0);
   }

   // $FF: synthetic method
   static int b(RecoveryTimes var0) {
      return g(var0);
   }

   // $FF: synthetic method
   static RecoveryTimes b() {
      return c();
   }

   // $FF: synthetic method
   static float c(RecoveryTimes var0) {
      return h(var0);
   }

   private static RecoveryTimes c() {
      RecoveryTimes var0 = RecoveryTimes.getRecoveryTimes();
      if (var0 == null) {
         fi.polar.polarflow.util.d.b(d.c(), "No RecoveryTimes object in database");
      }

      return var0;
   }

   // $FF: synthetic method
   static float d(RecoveryTimes var0) {
      return i(var0);
   }

   private static RecoveryTimes d() {
      RecoveryTimes var0 = new RecoveryTimes();
      var0.initializeAllFields();
      return var0;
   }

   // $FF: synthetic method
   static float e(RecoveryTimes var0) {
      return j(var0);
   }

   // $FF: synthetic method
   static float f(RecoveryTimes var0) {
      return k(var0);
   }

   private static int g(RecoveryTimes var0) {
      int var1;
      if (var0 != null && var0.getSteps() != -1) {
         var1 = var0.getSteps();
      } else {
         var1 = 0;
      }

      return var1;
   }

   private static float h(RecoveryTimes var0) {
      float var1;
      if (var0 != null && var0.getAccumulatedActivity() != -1.0F) {
         var1 = var0.getAccumulatedActivity();
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   private static float i(RecoveryTimes var0) {
      float var1;
      if (var0 != null && var0.getActivityCalories() != -1.0F) {
         var1 = var0.getActivityCalories();
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   private static float j(RecoveryTimes var0) {
      float var1;
      if (var0 != null && var0.getExerciseCalories() != -1.0F) {
         var1 = var0.getExerciseCalories();
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   private static float k(RecoveryTimes var0) {
      float var1;
      if (var0 != null && var0.getBmrCalories() != -1.0F) {
         var1 = var0.getBmrCalories();
      } else {
         var1 = 0.0F;
      }

      return var1;
   }

   private static void l(RecoveryTimes var0) {
      var0.setExerciseCalories(0.0F);
      var0.setActivityCalories(0.0F);
      var0.setBmrCalories(0.0F);
      var0.setSteps(0);
      var0.setAccumulatedActivity(0.0F);
   }
}
