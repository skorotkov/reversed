package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.UserId;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class bo implements q {
   private static final String a = bo.class.getSimpleName();

   public String a() {
      return "/U/0/USERID\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.c(a, "onRemoteChanged(" + var2 + ")");

      try {
         UserId var4 = new UserId(var3);
         List var6 = UserId.listAll(UserId.class);
         if (var6.size() == 0) {
            var4.setPath(v.a(var2));
            var4.save();
            var4.publish(var1);
         } else {
            UserId var7 = (UserId)var6.get(0);
            var7.merge(var4);
            var7.save();
            var7.publish(var1);
         }
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var5);
      }

   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
   }
}
