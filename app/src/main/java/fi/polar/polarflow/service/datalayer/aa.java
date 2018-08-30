package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.ExerciseAutoLaps;
import java.io.InputStream;

class aa implements q {
   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+ALAPS\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
   }

   public void a(String var1) {
      ExerciseAutoLaps.deleteAll(ExerciseAutoLaps.class, "PATH=?", v.a(var1));
   }
}
