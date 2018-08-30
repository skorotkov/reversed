package fi.polar.polarflow.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class b extends BroadcastReceiver {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      if ("android.intent.action.BATTERY_CHANGED".equals(var2.getAction())) {
         boolean var3 = fi.polar.polarflow.service.a.a(this.a);
         fi.polar.polarflow.service.a.a(this.a, fi.polar.polarflow.service.a.a(var2));
         if (fi.polar.polarflow.service.a.a(this.a) && !var3) {
            this.a.e();
         }

         var3 = fi.polar.polarflow.service.a.b(this.a);
         fi.polar.polarflow.service.a.b(this.a, fi.polar.polarflow.service.a.b(var2));
         if (var3 != fi.polar.polarflow.service.a.b(this.a)) {
            if (fi.polar.polarflow.service.a.b(this.a)) {
               this.a.f();
            } else {
               this.a.g();
            }
         }
      }

   }
}
