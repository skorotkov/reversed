package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.DailySummary;
import java.io.InputStream;

public class n implements q {
   private static final String a = n.class.getSimpleName();

   public String a() {
      return "/U/0/[0-9]{8}/DSUM/DSUM\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.e(a, "onRemoteChanged(" + var2 + ")");
   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
      DailySummary.deleteAll(DailySummary.class, "PATH=?", new String[]{v.a(var1)});
   }
}
