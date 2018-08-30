package fi.polar.polarflow.ui.myday;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class w extends BroadcastReceiver {
   // $FF: synthetic field
   final WatchFaceMyDayActivity a;

   w(WatchFaceMyDayActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      WatchFaceMyDayActivity.a(this.a).a((Intent)var2);
   }
}
