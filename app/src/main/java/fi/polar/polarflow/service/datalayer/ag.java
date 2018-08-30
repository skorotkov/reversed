package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.Sport;
import java.io.IOException;
import java.io.InputStream;

public class ag extends ba {
   private static final String a = ag.class.getSimpleName();

   public String a() {
      return "/U/0/[0-9]{8}/E/\\S+SPORT\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      try {
         Sport var4 = new Sport(var3);
         if (Sport.find(Sport.class, "SPORT_ID=?", new String[]{String.valueOf(var4.getSportId())}).isEmpty()) {
            var4.save();
         }

         var4.publish(var1, var2);
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var5);
      }

   }

   public void a(String var1) {
   }
}
