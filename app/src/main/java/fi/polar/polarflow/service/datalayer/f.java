package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.ActivitySamples;
import java.io.InputStream;

public class f implements q {
   private static final String a = f.class.getSimpleName();

   public String a() {
      return "/U/0/[0-9]{8}/ACT/ASAMPL\\d+\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.e(a, "onRemoteChanged(" + var2 + ")");
   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
      ActivitySamples.deleteAll(ActivitySamples.class, "PATH=? and BASENAME=?", v.a(var1), v.c(v.b(var1)));
   }
}
