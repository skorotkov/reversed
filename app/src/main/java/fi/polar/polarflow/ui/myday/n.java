package fi.polar.polarflow.ui.myday;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import fi.polar.polarflow.service.datalayer.at;
import java.util.List;

class n implements at {
   // $FF: synthetic field
   final l a;

   n(l var1) {
      this.a = var1;
   }

   public void onFinished(List var1) {
      if (var1.size() > 0) {
         fi.polar.polarflow.util.d.c(l.b(), "OnFinished, statuses: " + var1.size() + " isSuccess: " + ((Status)var1.get(0)).isSuccess());
      } else {
         fi.polar.polarflow.util.d.c(l.b(), "OnFinished, NO statuses");
         fi.polar.polarflow.ui.o.a((Context)this.a.getActivity(), (String)"Failed");
      }

   }
}
