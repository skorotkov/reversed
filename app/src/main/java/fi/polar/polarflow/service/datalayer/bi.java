package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;

public class bi implements aq {
   private static final String a = bi.class.getSimpleName();

   public String a() {
      return "/MESSAGE/SYNC_STOP_NOTIFICATION";
   }

   public void a(Context var1, String var2, byte[] var3, String var4) {
      boolean var5;
      if (var3 != null && var3.length > 0) {
         var5 = Arrays.equals(var3, v.a(true));
      } else {
         fi.polar.polarflow.util.d.b(a, "No payload");
         var5 = false;
      }

      fi.polar.polarflow.util.y.a(var1, var5);
      if (var5) {
         fi.polar.polarflow.util.u.a().a(System.currentTimeMillis());
      }

      var1.startService(new Intent(var1, SyncJournalingService.class));
   }
}
