package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.Sport;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ba implements q {
   private static final String a = ba.class.getSimpleName();

   private static long b(String var0) {
      Matcher var3 = Pattern.compile("\\d+").matcher(var0);
      long var1;
      if (var3.find()) {
         var1 = Long.parseLong(var3.group());
      } else {
         var1 = 0L;
      }

      return var1;
   }

   public String a() {
      return "/SYS/SPORT/\\d+/SPORT\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.c(a, "onRemoteChanged(" + var2 + ")");

      try {
         Sport var4 = new Sport(var3);
         var4.save();
         var4.publish(var1);
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var5);
      }

   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
      Sport.deleteAll(Sport.class, "SPORT_ID=?", new String[]{String.valueOf(b(var1))});
   }
}
