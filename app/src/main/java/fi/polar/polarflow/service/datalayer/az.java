package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.net.Uri;
import fi.polar.polarflow.data.orm.SportProfile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class az implements q {
   private static final String a = az.class.getSimpleName();
   private be b = new be();
   private o c;

   private o a(Context var1) {
      if (this.c == null) {
         this.c = new o(var1);
      }

      return this.c;
   }

   private void a(Context param1, SportProfile param2) {
      // $FF: Couldn't be decompiled
   }

   private static Uri b(String var0) {
      return Uri.fromFile(new File(var0));
   }

   public String a() {
      return "/U/0/SPROF/\\d+/PROFILE\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.c(a, "onRemoteChanged(" + var2 + ")");

      try {
         SportProfile var4 = new SportProfile(var3);
         SportProfile.deleteAll(SportProfile.class, "PATH=?", new String[]{v.a(var2)});
         var4.setPath(v.a(var2));
         var4.save();
         this.a(var1, var4);
         var4.publish(var1);
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.c(a, "Failed to parse received file: " + var2, var5);
      }

   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c(a, "onLocalDeleted(" + var1 + ")");
      SportProfile.deleteAll(SportProfile.class, "PATH=?", new String[]{v.a(var1)});
   }
}
