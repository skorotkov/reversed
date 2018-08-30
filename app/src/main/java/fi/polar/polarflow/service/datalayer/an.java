package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.List;

class an implements at {
   // $FF: synthetic field
   final Context a;
   // $FF: synthetic field
   final am b;

   an(am var1, Context var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onFinished(List var1) {
      boolean var2 = true;
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         Status var4 = (Status)var3.next();
         var2 = var4.isSuccess();
         if (!var2) {
            fi.polar.polarflow.util.d.b(am.b(), "Initialization failed (status=" + var4 + ")");
            break;
         }
      }

      am.a(false);
      fi.polar.polarflow.util.u.a().a(var2);
      if (var2) {
         fi.polar.polarflow.ftu.o.a(this.a);
         am.a(this.b, this.a);
      }

   }
}
