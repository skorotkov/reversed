package fi.polar.polarflow.ftu;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import fi.polar.polarflow.service.datalayer.at;
import java.util.List;

class m implements at {
   // $FF: synthetic field
   final Context a;
   // $FF: synthetic field
   final SignInActivity b;

   m(SignInActivity var1, Context var2) {
      this.b = var1;
      this.a = var2;
   }

   public void onFinished(List var1) {
      if (var1.size() > 0) {
         fi.polar.polarflow.util.d.c(SignInActivity.a(), "OnFinished, statuses: " + var1.size() + " isSuccess: " + ((Status)var1.get(0)).isSuccess());
      } else {
         fi.polar.polarflow.util.d.c(SignInActivity.a(), "OnFinished, NO statuses");
         fi.polar.polarflow.ui.o.a(this.a, "Failed");
      }

   }
}
