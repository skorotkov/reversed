package fi.polar.polarflow.ui.exeview.target;

import android.content.Context;
import android.util.SparseIntArray;
import android.widget.TextView;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.ExercisePhase;
import fi.polar.polarflow.data.orm.ExerciseTarget;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class k {
   private static final SparseIntArray a = new l(4);

   public static float a(TextView... var0) {
      int var1 = var0.length;
      float var2 = 0.0F;

      for(int var3 = 0; var3 < var1; ++var3) {
         TextView var4 = var0[var3];
         var2 += var4.getPaint().measureText((String)var4.getText());
      }

      return var2;
   }

   public static int a(int var0) {
      int var1 = 2131362186;
      if (var0 < 9) {
         var1 = 2131362183;
      } else if (var0 < 12) {
         var1 = 2131362184;
      } else if (var0 < 16) {
         var1 = 2131362185;
      }

      return var1;
   }

   public static int a(Context var0, int var1) {
      int var2 = a.get(var1);
      var1 = var2;
      if (var2 == 0) {
         var1 = 2131362194;
      }

      return (int)var0.getResources().getDimension(var1);
   }

   public static int a(Training var0) {
      int var1 = Integer.MAX_VALUE;
      ExerciseTarget var2 = var0.getTrainingSessionTarget().getExerciseTarget();
      if (var2 != null) {
         var1 = var2.getVolumeTargetType();
      }

      return var1;
   }

   public static fi.polar.polarflow.ui.exeview.target.a_package.n a(Training var0, h var1, List var2, int var3) {
      fi.polar.polarflow.ui.exeview.target.a_package.p var4 = new fi.polar.polarflow.ui.exeview.target.a_package.p();
      var4.a(var1);
      var4.a(var2, var3);
      var4.a(var0);
      return var4.a();
   }

   public static String a(Training var0, ExercisePhase var1) {
      int var2 = 0;
      String var6;
      if (var1 != null) {
         List var3 = var0.getPhaseExecutionList();

         int var4;
         int var5;
         for(var4 = 0; var2 < var0.getTrainingPhase().getNumber(); var4 = var5) {
            var5 = var4;
            if (var3.get(var2) == var1) {
               var5 = var4 + 1;
            }

            ++var2;
         }

         var6 = var4 + "/" + var1.getTotalExecutionCount();
      } else {
         var6 = null;
      }

      return var6;
   }

   public static String a(String var0, String var1, int var2) {
      if (var1 != null) {
         String var3 = " " + var1;
         var1 = var0;
         if (var0.length() + var3.length() > var2) {
            var1 = var0.substring(0, var2 - var3.length() - 1) + "…";
         }

         var0 = var1 + var3;
      }

      return var0;
   }

   public static List a(Training var0, ExerciseTarget var1, ExercisePhase var2) {
      ArrayList var3 = new ArrayList();
      Object var4 = null;
      int var5 = var1.getTargetType();
      Object var6;
      List var7;
      if (var5 == 1) {
         switch(var1.getVolumeTargetType()) {
         case 0:
            var3.add(h.b);
            var7 = (List)var4;
            break;
         case 1:
            var3.add(h.a);
            var7 = (List)var4;
            break;
         case 2:
            var3.add(h.c);
            var7 = (List)var4;
            break;
         default:
            var7 = (List)var4;
         }
      } else {
         if (var5 != 2) {
            var6 = new ArrayList();
            return (List)var6;
         }

         if (var2 != null) {
            if (var2.getGoalType() == 1) {
               var3.add(h.d);
            } else if (var2.getGoalType() == 2) {
               var3.add(h.e);
            }
         }

         var3.add(h.f);
         var7 = var0.getPhaseExecutionList();

         for(var5 = 0; var5 < var7.size(); ++var5) {
            var3.add(h.g);
         }
      }

      var6 = a(var0, (List)var3, (List)var7);
      return (List)var6;
   }

   private static List a(Training var0, List var1, List var2) {
      ArrayList var3 = new ArrayList();
      Iterator var4 = var1.iterator();

      int var6;
      for(int var5 = 0; var4.hasNext(); var5 = var6) {
         h var7 = (h)var4.next();
         var6 = var5;
         if (var7 == h.g) {
            var6 = var5 + 1;
         }

         var3.add(a(var0, var7, var2, var6));
      }

      return var3;
   }

   public static void a() {
      Training.getInstance().setExerciseTargetReached(true);
   }

   public static int b(Training var0) {
      int var1;
      label26: {
         var1 = 100;
         TrainingSessionTarget var2 = var0.getTrainingSessionTarget();
         if (var2 != null) {
            ExerciseTarget var4 = var2.getExerciseTarget();
            switch(a(var0)) {
            case 0:
               if (var4.getVolumeTargetDuration() > 0L) {
                  var1 = (int)(100L * var0.getDurationMs() / var4.getVolumeTargetDuration());
               }
               break label26;
            case 1:
               if (var4.getVolumeTargetDistance() > 0.0F) {
                  var1 = (int)(100.0F * var0.getTotalDistance() / var4.getVolumeTargetDistance());
               }
               break label26;
            case 2:
               if (var4.getVolumeTargetCalories() > 0) {
                  var1 = var0.getCalories() * 100 / var4.getVolumeTargetCalories();
               }
               break label26;
            default:
               fi.polar.polarflow.util.d.b("TargetUtils", "Invalid volume target type!");
            }
         } else {
            fi.polar.polarflow.util.d.b("TargetUtils", "Training session target was null");
         }

         var1 = -1;
      }

      int var3 = var1;
      if (var1 < 0) {
         var3 = 0;
      }

      return var3;
   }

   public static int b(Training var0, ExercisePhase var1) {
      int var2 = 0;
      int var5;
      if (var1 != null) {
         List var3 = var0.getPhaseExecutionList();
         int var4 = 0;

         while(true) {
            var5 = var4;
            if (var2 >= var0.getTrainingPhase().getNumber()) {
               break;
            }

            var5 = var4;
            if (var3.get(var2) == var1) {
               var5 = var4 + 1;
            }

            ++var2;
            var4 = var5;
         }
      } else {
         var5 = 0;
      }

      return var5;
   }
}
