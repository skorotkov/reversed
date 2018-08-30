package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.SyncInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class bd implements q {
   private static final String a = bd.class.getSimpleName();

   public String a() {
      return "/SYNCINFO\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.c(a, "onRemoteChanged(" + var2 + ")");

      try {
         List var4 = SyncInfo.listAll(SyncInfo.class);
         SyncInfo var5 = new SyncInfo(var3);
         if (var4.size() == 0) {
            var5.save();
            var5.publish(var1);
         } else {
            SyncInfo var7 = (SyncInfo)var4.get(0);
            var7.merge(var5);
            var7.save();
            var7.publish(var1);
         }
      } catch (IOException var6) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var6);
      }

   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted: " + var1);
   }
}
