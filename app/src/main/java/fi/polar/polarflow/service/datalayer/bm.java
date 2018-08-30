package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.UserDeviceSettings;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class bm implements q {
   private static final String a = bm.class.getSimpleName();

   public String a() {
      return "/U/0/S/UDEVSET\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.c(a, "onRemoteChanged(" + var2 + ")");

      try {
         UserDeviceSettings var4 = new UserDeviceSettings(var3);
         List var6 = UserDeviceSettings.listAll(UserDeviceSettings.class);
         if (var6.size() == 0) {
            var4.setPath(v.a(var2));
            var4.save();
            var4.publish(var1);
         } else {
            UserDeviceSettings var7 = (UserDeviceSettings)var6.get(0);
            var7.merge(var4);
            var7.save();
            var7.publish(var1);
         }
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var5);
      }

   }

   public void a(String var1) {
      UserDeviceSettings.deleteAll(UserDeviceSettings.class, "PATH=?", new String[]{v.a(var1)});
   }
}
