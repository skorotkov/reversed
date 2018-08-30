package fi.polar.polarflow.service.activity;

import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

class c implements fi.polar.polarflow.service.datalayer.at {
   // $FF: synthetic field
   final b a;

   c(b var1) {
      this.a = var1;
   }

   public void onFinished(List var1) {
      boolean var2 = true;
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         boolean var3 = ((Status)var4.next()).isSuccess();
         var2 = var3;
         if (!var3) {
            var2 = var3;
            break;
         }
      }

      if (b.a(this.a) && var2) {
         b.c(this.a).a(b.b(this.a));
      }

   }
}
