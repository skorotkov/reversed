package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.BleDevice;
import java.io.InputStream;

public class k implements q {
   private static final String a = k.class.getSimpleName();

   public String a() {
      return "/SYS/BT/\\d+/BTDEV\\.BPB";
   }

   public void a(Context param1, String param2, InputStream param3) {
      // $FF: Couldn't be decompiled
   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
      BleDevice.deleteAll(BleDevice.class, "PATH = ?", new String[]{v.a(var1)});
   }
}
