package fi.polar.polarflow.service.datalayer;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class g implements Result {
   private static final String a = g.class.getSimpleName();
   private ExecutorService b = Executors.newSingleThreadExecutor();
   private Status c = new Status(0);

   protected abstract Object a();

   public Object a(long var1, TimeUnit var3) {
      Object var4 = null;
      h var5 = new h(this);
      Future var10 = this.b.submit(var5);

      Object var9;
      try {
         var9 = var10.get(var1, var3);
      } catch (InterruptedException var6) {
         fi.polar.polarflow.util.d.a(a, "", var6);
         this.c = new Status(14);
         var9 = var4;
      } catch (ExecutionException var7) {
         fi.polar.polarflow.util.d.a(a, "", var7);
         this.c = new Status(13);
         var9 = var4;
      } catch (TimeoutException var8) {
         fi.polar.polarflow.util.d.a(a, "", var8);
         this.c = new Status(15);
         var9 = var4;
      }

      return var9;
   }

   public Status getStatus() {
      return this.c;
   }
}
