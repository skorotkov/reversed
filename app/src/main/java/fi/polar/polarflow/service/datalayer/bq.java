package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.Zones;
import java.io.InputStream;

public class bq implements q {
   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+ZONES\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
   }

   public void a(String var1) {
      Zones.deleteAll(Zones.class, "PATH=?", new String[]{v.a(var1)});
   }
}
