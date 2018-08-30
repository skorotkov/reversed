package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.ExerciseSamples;
import java.io.InputStream;

public class af implements q {
   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+SAMPLES\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
   }

   public void a(String var1) {
      ExerciseSamples.deleteAll(ExerciseSamples.class, "PATH=?", new String[]{v.a(var1)});
   }
}
