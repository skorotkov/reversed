package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExerciseStatistics;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ah implements q {
   private static final String a = ah.class.getSimpleName();

   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+STATS\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.c(a, "onRemoteChanged(" + var2 + ")");

      try {
         ExerciseStatistics var4 = new ExerciseStatistics(var3);
         List var6 = ExerciseStatistics.find(ExerciseStatistics.class, "PATH=?", new String[]{v.a(var2)});
         if (var6.isEmpty()) {
            var4.setPath(v.a(var2));
            var6 = Exercise.find(Exercise.class, "PATH=?", new String[]{v.a(var2)});
            if (!var6.isEmpty()) {
               var4.setExercise((Exercise)var6.get(0));
            }

            var4.save();
            var4.publish(var1);
         } else {
            ExerciseStatistics var7 = (ExerciseStatistics)var6.get(0);
            var7.merge(var4);
            var7.save();
            var7.publish(var1);
         }
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var5);
      }

   }

   public void a(String var1) {
      ExerciseStatistics.deleteAllByPath(v.a(var1));
   }
}
