package fi.polar.polarflow.ui.exeview;

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
      if (this.a.d() && c.a(fi.polar.polarflow.ui.exeview.a.a(this.a), var2.getAction())) {
         fi.polar.polarflow.ui.exeview.a.b(this.a).put(var2.getAction(), var2);
      } else {
         this.a.a(var2);
      }

   }
}
