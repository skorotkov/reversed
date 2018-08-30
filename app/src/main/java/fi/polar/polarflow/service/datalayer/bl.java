package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.TrainingSessionTarget;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class bl implements q {
   private static final String a = bl.class.getSimpleName();

   public String a() {
      return "/U/0/([0-9]{8}/TST/\\S+|FAV/[0-9]{2}/)TST\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      try {
         String var4 = a;
         StringBuilder var5 = new StringBuilder();
         fi.polar.polarflow.util.d.c(var4, var5.append("onRemoteChanged(").append(var2).append(")").toString());
         TrainingSessionTarget var8 = new TrainingSessionTarget(var3);
         List var7 = TrainingSessionTarget.find(TrainingSessionTarget.class, "PATH=?", new String[]{v.a(var2)});
         if (!var7.isEmpty()) {
            ((TrainingSessionTarget)var7.get(0)).delete();
         }

         var8.setPath(v.a(var2));
         var8.save();
         var8.publish(var1);
      } catch (IOException var6) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var6);
      }

   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
      TrainingSessionTarget.deleteAll(TrainingSessionTarget.class, "PATH=?", v.a(var1));
   }
}
