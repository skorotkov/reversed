package fi.polar.polarflow.service.datalayer;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

public class ao extends g {
   private final InputStream a;
   private fi.polar.polarflow.util.h b;

   public ao(InputStream var1) {
      this.a = var1;
      this.b = new fi.polar.polarflow.util.h();
   }

   // $FF: synthetic method
   protected Object a() {
      return this.b();
   }

   protected byte[] b() {
      Object var10;
      try {
         var10 = this.b.a(this.a);
      } catch (IOException var8) {
         ExecutionException var1 = new ExecutionException(var8);
         throw var1;
      } finally {
         try {
            this.a.close();
         } catch (IOException var7) {
            var10 = var7;
         }

      }

      return (byte[])var10;
   }
}
