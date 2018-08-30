package fi.polar.polarflow.service.activity;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

class h implements fi.polar.polarflow.service.datalayer.at {
   // $FF: synthetic field
   final g a;

   h(g var1) {
      this.a = var1;
   }

   public void onFinished(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         Status var3 = (Status)var2.next();
         fi.polar.polarflow.util.d.c("ActivitySamplesEndMarkerTask", "onFinished(): " + var3);
      }

      g.a(this.a).countDown();
   }
}
