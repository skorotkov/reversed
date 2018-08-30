package fi.polar.polarflow.service.activity;

import android.content.Context;
import fi.polar.polarflow.data.orm.ActivitySamples;
import fi.polar.polarflow.data.orm.Identifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class g implements Runnable {
   private final Context a;
   private final CountDownLatch b;
   private fi.polar.polarflow.service.datalayer.u c;
   private final fi.polar.polarflow.service.datalayer.at d = new h(this);

   public g(Context var1) {
      this.a = var1;
      this.b = new CountDownLatch(1);
      this.c = new fi.polar.polarflow.service.datalayer.u();
   }

   private static Set a() {
      HashSet var0 = new HashSet();
      Iterator var1 = Identifier.findActivityIdentifiers().iterator();

      while(var1.hasNext()) {
         var0.add(((Identifier)var1.next()).getPath());
      }

      return var0;
   }

   // $FF: synthetic method
   static CountDownLatch a(g var0) {
      return var0.b;
   }

   public void run() {
      ArrayList var1 = new ArrayList();
      Set var2 = a();
      Iterator var3 = ActivitySamples.findNotClosed().iterator();

      while(var3.hasNext()) {
         ActivitySamples var4 = (ActivitySamples)var3.next();
         String var5 = var4.getPath() + var4.getFilename();
         if (var2.contains(var4.getPath())) {
            fi.polar.polarflow.util.d.c("ActivitySamplesEndMarkerTask", var5 + ": set as closed (found ID.BPB)");
            var4.setClosed(true);
            var4.save();
         } else {
            boolean var6 = var4.addEndingActivityInfoAndSportInfo();
            var4.setClosed(true);
            var4.save();
            if (var6) {
               fi.polar.polarflow.util.d.c("ActivitySamplesEndMarkerTask", var5 + ": ending markers added, set as closed");
               var1.add(var4.createDataLayerRequest());
            } else {
               fi.polar.polarflow.util.d.c("ActivitySamplesEndMarkerTask", var5 + ": set as closed");
            }
         }
      }

      if (!var1.isEmpty()) {
         fi.polar.polarflow.service.datalayer.t var8 = this.c.a(this.a);
         var8.a((fi.polar.polarflow.service.datalayer.at)this.d);
         var8.execute(var1.toArray(new fi.polar.polarflow.service.datalayer.s[var1.size()]));

         try {
            if (!this.b.await(10L, TimeUnit.SECONDS)) {
               fi.polar.polarflow.util.d.e("ActivitySamplesEndMarkerTask", "Timeout occurred when waiting for DataLayerTask to finish");
            }
         } catch (InterruptedException var7) {
            fi.polar.polarflow.util.d.b("ActivitySamplesEndMarkerTask", "Interrupted when waiting for DataLayerTask to finish", var7);
         }
      }

   }
}
