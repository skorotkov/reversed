package fi.polar.polarflow.ui.exewait;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class f extends BroadcastReceiver {
   // $FF: synthetic field
   final ExeWaitActivity a;

   f(ExeWaitActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("ExeViewActivity.action.ENTER_ANIMATION_COMPLETE".equals(var2.getAction())) {
         ExeWaitActivity.b(this.a, true);
         this.a.finishAffinity();
      }

   }
}
