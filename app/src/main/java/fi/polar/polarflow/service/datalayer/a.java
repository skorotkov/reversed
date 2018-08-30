package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.wearable.Channel;
import com.google.android.gms.wearable.Wearable;
import java.util.concurrent.TimeUnit;

public abstract class a implements l {
   private static final String a = a.class.getSimpleName();
   private GoogleApiClient b;
   private bc c;
   private be d;

   protected a(Context var1) {
      this.b = (new Builder(var1)).addApi(Wearable.API).build();
      this.c = new bc(var1);
      this.d = new be();
   }

   protected be a() {
      return this.d;
   }

   protected String a(String var1) {
      return v.e(var1);
   }

   public void a(Channel var1) {
      fi.polar.polarflow.util.d.c(a, "onChannelEvent(path=" + var1.getPath() + ")");
      ConnectionResult var2 = this.b.blockingConnect(10000L, TimeUnit.MILLISECONDS);
      if (var2.isSuccess()) {
         this.b(var1);
         this.b.disconnect();
         fi.polar.polarflow.util.d.c(a, "Disconnected from googleApiClient");
      } else {
         fi.polar.polarflow.util.d.b(a, "Failed to connect GoogleApiClient(result=" + var2 + ")");
      }

   }

   protected GoogleApiClient b() {
      return this.b;
   }

   abstract void b(Channel var1);

   protected bc c() {
      return this.c;
   }
}
