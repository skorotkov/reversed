package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

public class w implements q {
   private static final String a = w.class.getSimpleName();
   private u b = new u();

   public String a() {
      return "/\\S+";
   }

   public void a(Context var1, String var2, InputStream var3) {
      fi.polar.polarflow.util.d.e(a, "No receiver found for " + var2 + ", please implement dedicated receiver");

      try {
         byte[] var4 = fi.polar.polarflow.util.g.a(var3);
         s var6 = new s(0, var2, var4);
         this.b.a(var1).execute(new s[]{var6});
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.a(a, "", var5);
      }

   }

   public void a(String var1) {
   }
}
