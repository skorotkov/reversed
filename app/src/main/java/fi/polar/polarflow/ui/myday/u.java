package fi.polar.polarflow.ui.myday;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExerciseTarget;
import fi.polar.polarflow.data.orm.ExerciseTargetInfo;
import fi.polar.polarflow.data.orm.InActivityTriggerInfo;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.SwimmingStatistics;
import fi.polar.polarflow.data.orm.TrainingSession;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import fi.polar.polarflow.ui.exeview.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.LocalDate;

public class u {
   private static int a(long var0) {
      int var2 = 0;
      SportProfile var3 = SportProfile.getSportProfileBySportId(var0, false);
      if (var3 != null) {
         var2 = var3.getSettings().getEnabledSensors();
      }

      return var2;
   }

   public static int a(List var0, Class var1) {
      int var2 = 0;

      while(true) {
         if (var2 >= var0.size()) {
            var2 = -1;
            break;
         }

         if (var1.isInstance(var0.get(var2))) {
            break;
         }

         ++var2;
      }

      return var2;
   }

   public static int a(List var0, String var1) {
      int var2;
      if (!TextUtils.isEmpty(var1)) {
         for(var2 = 0; var2 < var0.size(); ++var2) {
            if (var1.equals(((fi.polar.polarflow.ui.myday.item.c)var0.get(var2)).g())) {
               return var2;
            }
         }
      }

      var2 = -1;
      return var2;
   }

   private static Exercise a(TrainingSession var0, List var1) {
      Iterator var2 = var1.iterator();

      Exercise var3;
      while(true) {
         if (var2.hasNext()) {
            Exercise var4 = (Exercise)var2.next();
            if (!var0.getId().equals(var4.trainingSession.getId())) {
               continue;
            }

            var3 = var4;
            break;
         }

         var3 = null;
         break;
      }

      return var3;
   }

   private static fi.polar.polarflow.ui.myday.item.e a(TrainingSession var0, ExerciseTargetInfo var1, long var2) {
      float var4;
      if (var0.getDistance() != -1.0F) {
         var4 = var0.getDistance();
      } else {
         var4 = 0.0F;
      }

      long var5;
      if (var0.getDuration() != -1L) {
         var5 = var0.getDuration();
      } else {
         var5 = 0L;
      }

      int var7;
      if (var0.getCalories() != -1) {
         var7 = var0.getCalories();
      } else {
         var7 = 0;
      }

      int var8 = var1.getTargetType();
      int var9 = var1.getVolumeTargetType();
      fi.polar.polarflow.ui.myday.item.e var10 = new fi.polar.polarflow.ui.myday.item.e(var0.getStartTime());
      var10.d(var1.getName());
      var10.b(true);
      var10.a(var2);
      if (Sport.isSwimmingSport(var2)) {
         var10.d(fi.polar.polarflow.util.u.a().k());
      }

      a(var10, var8, var9, var4, var5, var7);
      return var10;
   }

   private static fi.polar.polarflow.ui.myday.item.e a(TrainingSessionTarget var0) {
      return a(new fi.polar.polarflow.ui.myday.item.e(var0.getStartTime()), var0);
   }

   public static fi.polar.polarflow.ui.myday.item.e a(fi.polar.polarflow.ui.myday.item.e var0, TrainingSessionTarget var1) {
      ExerciseTarget var2 = var1.getExerciseTarget();
      if (var2 != null) {
         var0 = a(var0, var1, var2, var2.getSportId(), var1.getStartTime(), var2.getVolumeTargetDistance(), var2.getVolumeTargetDuration(), var2.getVolumeTargetCalories());
      } else {
         var0 = null;
      }

      return var0;
   }

   private static fi.polar.polarflow.ui.myday.item.e a(fi.polar.polarflow.ui.myday.item.e var0, TrainingSessionTarget var1, ExerciseTarget var2, long var3, long var5, float var7, long var8, int var10) {
      if (var0 != null) {
         int var11 = var2.getTargetType();
         int var12 = var2.getVolumeTargetType();
         var0.d(var1.getName());
         var0.b(var1.getPath());
         var0.c(var1.getTrainingProgramId());
         var0.b(false);
         var0.a(var3);
         if (Sport.isSwimmingSport(var3)) {
            var0.d(fi.polar.polarflow.util.u.a().k());
         }

         a(var0, var11, var12, var7, var8, var10);
      }

      return var0;
   }

   static String a(List var0) {
      Iterator var1 = var0.iterator();
      String var3 = "";

      while(var1.hasNext()) {
         TrainingSession var2 = (TrainingSession)var1.next();
         String var4 = var3 + "'" + var2.getPath() + "00/" + "'";
         var3 = var4;
         if (var1.hasNext()) {
            var3 = var4 + ",";
         }
      }

      return var3;
   }

   public static List a() {
      ArrayList var0 = new ArrayList();
      List var1 = TrainingSession.getCurrentDayTrainings();
      if (!var1.isEmpty()) {
         String var2 = a(var1);
         if (!TextUtils.isEmpty(var2)) {
            List var3 = a(var2);
            List var10 = b(var2);
            Iterator var9 = var1.iterator();

            while(var9.hasNext()) {
               TrainingSession var4 = (TrainingSession)var9.next();
               Exercise var5 = a(var4, var3);
               if (var5 != null) {
                  long var6 = var5.getSport();
                  ExerciseTargetInfo var8 = b(var4, var10);
                  if (var8 == null) {
                     fi.polar.polarflow.ui.myday.item.j var12 = new fi.polar.polarflow.ui.myday.item.j(var4);
                     var12.a(var6);
                     var12.b(a(var12.e()));
                     if (Sport.isSwimmingSport(var6)) {
                        SwimmingStatistics var11 = SwimmingStatistics.findByPath(var5.getPath());
                        if (var11 == null) {
                           fi.polar.polarflow.util.d.f("Utils", "Could not find a swimming statistics that matches with path: " + var5.getPath());
                        } else {
                           var12.c(var11.getSwimmingPoolUnit());
                        }
                     }

                     var0.add(var12);
                  } else {
                     var0.add(a(var4, var8, var6));
                  }
               } else {
                  fi.polar.polarflow.util.d.e("MyDayTraining", "Training Session ID: " + var4.getId() + ", path: " + var4.getPath() + " has no exercise!");
               }
            }
         }
      }

      return var0;
   }

   static List a(String var0) {
      return Exercise.findWithQuery(Exercise.class, "SELECT * FROM EXERCISE WHERE PATH IN (" + var0 + ")", new String[0]);
   }

   public static void a(Context var0, long var1) {
      Intent var3 = new Intent(var0, SummaryActivity.class);
      var3.putExtra(SummaryActivity.a, var1);
      a(var0, var3, 1);
   }

   public static void a(Context var0, Intent var1, int var2) {
      if (var0 instanceof MyDayGridPagerActivity) {
         ((Activity)var0).startActivityForResult(var1, var2);
      } else {
         var0.startActivity(var1);
      }

   }

   private static void a(fi.polar.polarflow.ui.myday.item.e var0, int var1, int var2, float var3, long var4, int var6) {
      var0.b(var1);
      if (var1 == 1) {
         var0.c(var2);
         switch(var2) {
         case 0:
            var0.b(var4);
            break;
         case 1:
            var0.a(var3);
            break;
         case 2:
            var0.a(var6);
         }
      } else if (var1 == 0 || var1 == 2) {
         var0.b(var4);
      }

   }

   private static ExerciseTargetInfo b(TrainingSession var0, List var1) {
      Iterator var2 = var1.iterator();

      ExerciseTargetInfo var3;
      while(true) {
         if (var2.hasNext()) {
            ExerciseTargetInfo var4 = (ExerciseTargetInfo)var2.next();
            if (!var4.getPath().equals(var0.getPath() + "00/")) {
               continue;
            }

            var3 = var4;
            break;
         }

         var3 = null;
         break;
      }

      return var3;
   }

   public static fi.polar.polarflow.ui.myday.item.c b(List var0, Class var1) {
      int var2 = a(var0, var1);
      fi.polar.polarflow.ui.myday.item.c var3;
      if (var2 != -1) {
         var3 = (fi.polar.polarflow.ui.myday.item.c)var1.cast(var0.get(var2));
      } else {
         var3 = null;
      }

      return var3;
   }

   public static fi.polar.polarflow.ui.myday.item.c b(List var0, String var1) {
      int var2 = a(var0, var1);
      fi.polar.polarflow.ui.myday.item.c var3;
      if (var2 != -1) {
         var3 = (fi.polar.polarflow.ui.myday.item.c)var0.get(var2);
      } else {
         var3 = null;
      }

      return var3;
   }

   public static List b() {
      ArrayList var0 = new ArrayList();
      Iterator var1 = TrainingSessionTarget.getCurrentDayTrainingTargets(false).iterator();

      while(var1.hasNext()) {
         TrainingSessionTarget var2 = (TrainingSessionTarget)var1.next();
         fi.polar.polarflow.ui.myday.item.e var3 = a(var2);
         if (var3 != null) {
            var0.add(var3);
         } else {
            fi.polar.polarflow.util.d.e("MyDayTrainingTarget", "Training session target ID: " + var2.getId() + ", path: " + var2.getPath() + " has no exercise target!");
         }
      }

      return var0;
   }

   static List b(String var0) {
      return ExerciseTargetInfo.findWithQuery(ExerciseTargetInfo.class, "SELECT * FROM EXERCISE_TARGET_INFO WHERE PATH IN (" + var0 + ")", new String[0]);
   }

   public static List c() {
      fi.polar.polarflow.util.b.d var0 = new fi.polar.polarflow.util.b.d(PhysData.getUserPhysData());
      ArrayList var1 = new ArrayList();
      Iterator var2 = SleepAnalysisResult.findCurrentDayResults().iterator();

      while(var2.hasNext()) {
         SleepAnalysisResult var3 = (SleepAnalysisResult)var2.next();
         fi.polar.polarflow.util.b.a var4 = var0.a(var3);
         if (var4 != null) {
            LocalDate var5 = SleepAnalysisResult.getRecordingDate(var3.getEndTime());
            var1.add(new fi.polar.polarflow.ui.myday.item.g(var4, var3.getPath(), var5));
            var1.add(new fi.polar.polarflow.ui.myday.item.sleeprating.a(var4.b.getMillis(), var3.getPath(), var5, var3.getUserSleepRating()));
         }
      }

      return var1;
   }

   public static List c(List var0, String var1) {
      ArrayList var2 = new ArrayList();
      if (!TextUtils.isEmpty(var1)) {
         Iterator var4 = var0.iterator();

         while(var4.hasNext()) {
            fi.polar.polarflow.ui.myday.item.c var3 = (fi.polar.polarflow.ui.myday.item.c)var4.next();
            if (var1.equals(var3.g())) {
               var2.add(var3);
            }
         }
      }

      return var2;
   }

   public static fi.polar.polarflow.ui.myday.item.a d() {
      List var0 = InActivityTriggerInfo.getCurrentDayInactivityTriggerInfos();
      fi.polar.polarflow.ui.myday.item.a var1 = new fi.polar.polarflow.ui.myday.item.a();
      var1.a(var0.size());
      return var1;
   }
}
