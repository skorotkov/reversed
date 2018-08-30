package fi.polar.polarflow.ui.myheartrate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class e extends BroadcastReceiver {
   // $FF: synthetic field
   final MyHeartRateActivity a;

   e(MyHeartRateActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("fi.polar.polarflow.ACTION_HR_DATA".equals(var2.getAction())) {
         MyHeartRateActivity.a(this.a, var2);
      }

   }
}
