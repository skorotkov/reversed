package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.ExercisePhaseStats;
import java.io.InputStream;

public class ac implements q {
   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+PHASES\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
   }

   public void a(String var1) {
      ExercisePhaseStats.deleteAll(ExercisePhaseStats.class, "PATH=?", v.a(var1));
   }
}
