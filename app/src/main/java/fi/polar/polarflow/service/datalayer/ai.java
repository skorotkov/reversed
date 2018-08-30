package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.ExerciseTargetInfo;
import java.io.InputStream;

public class ai implements q {
   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+TARGET\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
   }

   public void a(String var1) {
      ExerciseTargetInfo.deleteAll(ExerciseTargetInfo.class, "PATH=?", new String[]{v.a(var1)});
   }
}
