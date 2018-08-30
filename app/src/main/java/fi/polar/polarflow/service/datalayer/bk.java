package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.Exercise;
import fi.polar.polarflow.data.orm.TrainingSession;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

public class bk implements q {
   private static final String a = bk.class.getSimpleName();

   private void a(TrainingSession var1) {
      List var2 = Exercise.find(Exercise.class, "PATH LIKE ?", new String[]{var1.getPath() + "%"});
      var1.setExerciseCount(var2.size());
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         Exercise var4 = (Exercise)var3.next();
         var4.trainingSession = var1;
         var4.save();
      }

   }

   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+TSESS\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      try {
         String var4 = a;
         StringBuilder var5 = new StringBuilder();
         fi.polar.polarflow.util.d.c(var4, var5.append("onRemoteChanged(").append(var2).append(")").toString());
         TrainingSession var9 = new TrainingSession(var3);
         List var7 = TrainingSession.find(TrainingSession.class, "PATH=?", new String[]{v.a(var2)});
         if (var7.isEmpty()) {
            var9.setPath(v.a(var2));
            var9.save();
            this.a(var9);
            var9.publish(var1);
         } else {
            TrainingSession var8 = (TrainingSession)var7.get(0);
            var8.merge(var9);
            var8.save();
            var8.publish(var1);
         }
      } catch (IOException var6) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var6);
      }

   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
      TrainingSession.deleteAll(TrainingSession.class, "PATH=?", new String[]{v.a(var1)});
   }
}
