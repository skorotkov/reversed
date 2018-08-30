package fi.polar.polarflow.ui;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import java.util.Iterator;

class m extends ResultCallbacks {
   // $FF: synthetic field
   final SyncActivity a;

   m(SyncActivity var1) {
      this.a = var1;
   }

   public void a(GetConnectedNodesResult var1) {
      fi.polar.polarflow.util.d.c(SyncActivity.a(), "getConnectedNodes(onSuccess)");
      Iterator var4 = var1.getNodes().iterator();

      boolean var3;
      while(true) {
         if (var4.hasNext()) {
            Node var2 = (Node)var4.next();
            if (!var2.isNearby()) {
               continue;
            }

            fi.polar.polarflow.util.d.c(SyncActivity.a(), "getConnectedNodes(node=" + var2.getDisplayName() + " [" + var2.getId() + "] is nearby)");
            var3 = true;
            break;
         }

         var3 = false;
         break;
      }

      SyncActivity var5 = this.a;
      byte var6;
      if (var3) {
         var6 = 5;
      } else {
         var6 = 4;
      }

      SyncActivity.a((SyncActivity)var5, var6);
   }

   public void onFailure(Status var1) {
      fi.polar.polarflow.util.d.e(SyncActivity.a(), "Failed to get connected nodes");
      SyncActivity.a((SyncActivity)this.a, 4);
   }

   // $FF: synthetic method
   public void onSuccess(Result var1) {
      this.a((GetConnectedNodesResult)var1);
   }
}
