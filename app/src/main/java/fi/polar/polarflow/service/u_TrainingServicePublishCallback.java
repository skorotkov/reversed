package fi.polar.polarflow.service;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import fi.polar.polarflow.service.datalayer.at;
import java.util.Iterator;
import java.util.List;

class u_TrainingServicePublishCallback implements at {
   // $FF: synthetic field
   final Context a_context;
   // $FF: synthetic field
   final TrainingService b_trainingService;

   u_TrainingServicePublishCallback(TrainingService var1, Context var2) {
      this.b_trainingService = var1;
      this.a_context = var2;
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

      TrainingService.h(this.b_trainingService).a(this.a_context, true);
      if (var2) {
         TrainingService.h(this.b_trainingService).a(this.a_context);
      }

   }
}
