package fi.polar.polarflow.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class k extends BroadcastReceiver {
   // $FF: synthetic field
   final SyncActivity a;

   k(SyncActivity var1) {
      this.a = var1;
   }

   public void onReceive(Context var1, Intent var2) {
      String var5 = var2.getAction();
      if ("fi.polar.polarflow.action.SYNC_STARTED".equals(var5)) {
         SyncActivity.a((SyncActivity)this.a, 1);
      } else if ("fi.polar.polarflow.action.SYNC_STOPPED".equals(var5)) {
         boolean var3 = var2.getBooleanExtra("fi.polar.polarflow.extra.SYNC_SUCCESSFUL", false);
         SyncActivity var6 = this.a;
         byte var4;
         if (var3) {
            var4 = 2;
         } else {
            var4 = 3;
         }

         SyncActivity.a((SyncActivity)var6, var4);
      } else if ("fi.polar.polarflow.service.bluetooth.action.HOST_CONNECT_FAILED".equals(var5)) {
         SyncActivity.e(this.a).removeCallbacks(SyncActivity.d(this.a));
         SyncActivity.f(this.a);
      }

   }
}
