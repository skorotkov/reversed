package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.ExerciseManualLaps;
import java.io.InputStream;

class ab implements q {
   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+LAPS\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
   }

   public void a(String var1) {
      ExerciseManualLaps.deleteAll(ExerciseManualLaps.class, "PATH=?", v.a(var1));
   }
}
