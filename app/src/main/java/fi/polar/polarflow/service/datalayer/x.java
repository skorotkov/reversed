package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class x extends a {
   private static final String a = x.class.getSimpleName();

   public x(Context var1) {
      super(var1);
   }

   public void b(Channel var1) {
      fi.polar.polarflow.util.d.c(a, "onConnectedChannelEvent()");
      String var2 = this.a(var1.getPath());
      ArrayList var3 = new ArrayList();
      Status var4 = this.c().a(var2, 1, var3);
      if (var4.isSuccess()) {
         Iterator var6 = var3.iterator();

         while(var6.hasNext()) {
            Uri var5 = Uri.fromFile(new File((String)var6.next()));
            this.a().b(var5);
         }
      } else {
         fi.polar.polarflow.util.d.b(a, "Failed to delete (path=" + var2 + ")");
      }

      var1.close(this.b(), var4.getStatusCode()).await(10000L, TimeUnit.MILLISECONDS);
   }

   public String d() {
      return "/delete\\S+";
   }
}
