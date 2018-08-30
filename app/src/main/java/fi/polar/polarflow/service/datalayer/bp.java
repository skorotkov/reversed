package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class bp extends b {
   private static final String a = bp.class.getSimpleName();
   private List b = new CopyOnWriteArrayList();

   protected bp(Context var1) {
      super(var1);
      this.b.add(new bn());
   }

   private r b(String var1) {
      Iterator var2 = this.b.iterator();

      r var4;
      while(true) {
         if (var2.hasNext()) {
            r var3 = (r)var2.next();
            if (!var1.matches(var3.a())) {
               continue;
            }

            var4 = var3;
            break;
         }

         var4 = null;
         break;
      }

      return var4;
   }

   protected int a(String var1, byte[] var2) {
      Status var4;
      if (var2 != null && var2.length > 0) {
         Status var6 = this.c().a(var1, var2);
         if (var6.isSuccess()) {
            r var3 = this.b(var1);
            if (var3 != null) {
               var3.a(this.b().getContext(), var1);
            }

            Uri var5 = Uri.fromFile(new File(var1));
            this.a().a(var5);
            var4 = var6;
         } else {
            fi.polar.polarflow.util.d.b(a, "Failed to write data to storage(status=" + var6 + ")");
            var4 = var6;
         }
      } else {
         fi.polar.polarflow.util.d.b(a, "Empty or null data received");
         var4 = new Status(13);
      }

      return var4.getStatusCode();
   }

   public String d() {
      return "/write\\S+";
   }
}
