package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import fi.polar.polarflow.data.orm.Identifier;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class al implements q {
   public String a() {
      return "/U/0/([0-9]{8}/(ACT|E|SLEEP|TST)/([0-9]{6}/)?|FAV/[0-9]{2}/)ID\\.BPB";
   }

   public void a(Context var1, String var2, InputStream var3) {
      try {
         StringBuilder var4 = new StringBuilder();
         fi.polar.polarflow.util.d.c("IdentifierReceiver", var4.append("onRemoteChanged(").append(var2).append(")").toString());
         Identifier var7 = new Identifier(var3);
         List var6 = Identifier.find(Identifier.class, "PATH=?", new String[]{v.a(var2)});
         if (!var6.isEmpty()) {
            ((Identifier)var6.get(0)).delete();
         }

         var7.setPath(v.a(var2));
         var7.save();
         var7.publish(var1);
      } catch (IOException var5) {
         fi.polar.polarflow.util.d.c("IdentifierReceiver", "Failed to parse received file: " + var2, var5);
      }

   }

   public void a(String var1) {
      fi.polar.polarflow.util.d.c("IdentifierReceiver", "onLocalDeleted(" + var1 + ")");
      Identifier.deleteAll(Identifier.class, "PATH=?", new String[]{v.a(var1)});
   }
}
