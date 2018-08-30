package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.ExerciseStatistics;
import fi.polar.polarflow.data.orm.TrainingSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class ad implements q {
   private static final String a = ad.class.getSimpleName();

   private void a(Exercise var1) {
      List var2 = TrainingSession.find(TrainingSession.class, "PATH=?", new String[]{v.d(var1.getPath())});
      if (!var2.isEmpty()) {
         var1.trainingSession = (TrainingSession)var2.get(0);
         var1.save();
      }

      Iterator var3 = ExerciseStatistics.find(ExerciseStatistics.class, "PATH=?", new String[]{var1.getPath()}).iterator();

      while(var3.hasNext()) {
         ExerciseStatistics var4 = (ExerciseStatistics)var3.next();
         var4.setExercise(var1);
         var4.save();
      }

   }

   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+BASE\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.c(a, "onRemoteChanged(" + var2 + ")");

      try {
         Exercise var4 = new Exercise(var3);
         List var6 = Exercise.find(Exercise.class, "PATH=?", new String[]{v.a(var2)});
         if (var6.isEmpty()) {
            var4.setPath(v.a(var2));
            var4.save();
            this.a(var4);
            var4.publish(var1);
         } else {
            Exercise var7 = (Exercise)var6.get(0);
            var7.merge(var4);
            var7.save();
            var7.publish(var1);
         }
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var5);
      }

   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
      Exercise.deleteAll(Exercise.class, "PATH=?", new String[]{v.a(var1)});
   }
}
