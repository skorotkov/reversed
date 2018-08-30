package fi.polar.polarflow.ftu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class f extends BroadcastReceiver {
   // $FF: synthetic field
   final GridAnimationActivity a;

   f(GridAnimationActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var3 = var2.getAction();
      fi.polar.polarflow.util.d.c(GridAnimationActivity.a(), "onReceive(action=" + var3 + ")");
      if ("fi.polar.polarflow.ACTION_FTU_SUCCEEDED".equals(var3) && GridAnimationActivity.f(this.a) == g.c) {
         GridAnimationActivity.g(this.a);
      } else if ("fi.polar.polarflow.ACTION_FTU_FAILED".equals(var3) && GridAnimationActivity.f(this.a) == g.c) {
         this.a.finish();
      }

   }
}
