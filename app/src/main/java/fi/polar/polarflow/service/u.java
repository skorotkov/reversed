package fi.polar.polarflow.service;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import fi.polar.polarflow.service.datalayer.at;
import java.util.Iterator;
import java.util.List;

class u implements at {
   // $FF: synthetic field
   final Context a;
   // $FF: synthetic field
   final TrainingService b;

   u(TrainingService var1, Context var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onFinished(List var1) {
      fi.polar.polarflow.util.d.c("TrainingService", "onFinished()");
      Iterator var4 = var1.iterator();
      boolean var2 = true;

      while(var4.hasNext()) {
         boolean var3 = ((Status)var4.next()).isSuccess();
         var2 = var3;
         if (!var3) {
            var2 = var3;
            break;
         }
      }

      TrainingService.h(this.b).a(this.a, true);
      if (var2) {
         TrainingService.h(this.b).a(this.a);
      }

   }
}
