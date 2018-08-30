package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.Channel.GetInputStreamResult;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

abstract class b extends a {
   private static final String a = b.class.getSimpleName();
   private i b = new i();

   b(Context var1) {
      super(var1);
   }

   protected abstract int a(String var1, byte[] var2);

   void b(Channel var1) {
      GetInputStreamResult var2 = (GetInputStreamResult)var1.getInputStream(this.b()).await(10000L, TimeUnit.MILLISECONDS);
      Status var7;
      if (var2.getStatus().isSuccess()) {
         InputStream var3 = var2.getInputStream();
         if (var3 != null) {
            ao var6 = this.b.a(var3);
            byte[] var4 = (byte[])var6.a(2L, TimeUnit.MINUTES);
            var7 = var6.getStatus();
            if (var7.isSuccess()) {
               var7 = new Status(this.a(this.a(var1.getPath()), var4));
            }
         } else {
            var7 = new Status(13);
         }
      } else {
         var7 = var2.getStatus();
      }

      var2.release();
      if (!var7.isSuccess()) {
         Status var5 = (Status)var1.close(this.b(), var7.getStatusCode()).await(10000L, TimeUnit.MILLISECONDS);
         fi.polar.polarflow.util.d.c(a, "Channel closed(reasonStatus=" + var7 + ", closeStatus=" + var5 + ")");
      }

   }
}
