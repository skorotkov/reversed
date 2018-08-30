package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.service.PresyncService;

public class bg implements aq {
   private static final String a = bg.class.getSimpleName();

   public String a() {
      return "/MESSAGE/SYNC_REQUEST";
   }

   public void a(Context var1, String var2, byte[] var3, String var4) {
      fi.polar.polarflow.util.d.c(a, "onReceive(sourceNodeId=" + var4 + ")");
      var1.startService(PresyncService.a(var1, var4));
   }
}
