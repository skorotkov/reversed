package fi.polar.polarflow.ftu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class l extends BroadcastReceiver {
   // $FF: synthetic field
   final SignInActivity a;

   l(SignInActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c(SignInActivity.a(), "onReceive(action=" + var3 + ")");
      if ("fi.polar.polarflow.ACTION_FTU_STARTED".equals(var3)) {
         SignInActivity.e(this.a);
      } else if ("fi.polar.polarflow.action.INITIALIZED".equals(var3)) {
         fi.polar.polarflow.util.d.c(SignInActivity.a(), "onInitialized()");
         SignInActivity.a(this.a, n.c);
      }

   }
}
