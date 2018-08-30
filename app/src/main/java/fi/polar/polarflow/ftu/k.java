package fi.polar.polarflow.ftu;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;

class k extends ResultCallbacks {
   // $FF: synthetic field
   final SignInActivity a;

   k(SignInActivity var1) {
      this.a = var1;
   }

   public void a(GetCapabilityResult var1) {
      if (var1.getStatus().isSuccess()) {
         SignInActivity var2 = this.a;
         n var3;
         if (!var1.getCapability().getNodes().isEmpty()) {
            var3 = n.c;
         } else {
            var3 = n.b;
         }

         SignInActivity.a(var2, var3);
      }

   }

   public void onFailure(Status var1) {
      fi.polar.polarflow.util.d.e(SignInActivity.a(), "Cannot determine mobile host capability(status=" + var1 + ")");
   }

   // $FF: synthetic method
   public void onSuccess(Result var1) {
      this.a((GetCapabilityResult)var1);
   }
}
