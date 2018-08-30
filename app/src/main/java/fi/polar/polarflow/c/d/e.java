package fi.polar.polarflow.c.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class e extends BroadcastReceiver {
   // $FF: synthetic field
   final b a;

   e(b var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(var2.getAction())) {
         boolean var3 = b.c(this.a).a();
         fi.polar.polarflow.util.d.c(b.s(), "onReceive: ACTION_POWER_SAVE_MODE_CHANGED, enabled= " + var3);
         if (var3) {
            this.a.t = b.d(this.a).b();
            this.a.u = false;
            b.e(this.a).a((fi.polar.polarflow.c.b)this.a.k());
            i.c(b.f(this.a));
         } else {
            i.b(b.f(this.a));
         }
      }

   }
}
