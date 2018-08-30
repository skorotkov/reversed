package fi.polar.polarflow.ui.myday;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class i extends BroadcastReceiver {
   // $FF: synthetic field
   final h a;

   i(h var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      h.a(this.a, var2);
   }
}
