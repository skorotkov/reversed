package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.SwimmingSamples;
import java.io.InputStream;

public class bb implements q {
   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+SWIMSAMP\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
   }

   public void a(String var1) {
      SwimmingSamples.deleteAll(SwimmingSamples.class, "PATH=?", new String[]{v.a(var1)});
   }
}
