package fi.polar.polarflow.service.datalayer;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.wearable.MessageApi;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.Wearable;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class as extends c {
   private static final String a = as.class.getSimpleName();
   private GoogleApiClient b;
   private MessageApi c;
   private NodeApi d;

   public as(Context var1) {
      this(var1, (at)null);
   }

   public as(Context var1, at var2) {
      super(var2);
      this.b = (new Builder(var1)).addApi(Wearable.API).build();
      this.c = Wearable.MessageApi;
      this.d = Wearable.NodeApi;
   }

   private Status a(String var1, byte[] var2) {
      GetConnectedNodesResult var3 = (GetConnectedNodesResult)this.d.getConnectedNodes(this.b).await(10000L, TimeUnit.MILLISECONDS);
      Status var4 = var3.getStatus();
      Status var5 = var4;
      if (var4.isSuccess()) {
         Iterator var6 = var3.getNodes().iterator();

         while(true) {
            var5 = var4;
            if (!var6.hasNext()) {
               break;
            }

            Node var7 = (Node)var6.next();
            var5 = ((SendMessageResult)this.c.sendMessage(this.b, var7.getId(), var1, var2).await(10000L, TimeUnit.MILLISECONDS)).getStatus();
            if (var4.isSuccess() && !var5.isSuccess()) {
               var4 = var5;
            }
         }
      }

      return var5;
   }

   private Status a(String var1, byte[] var2, String var3) {
      return ((SendMessageResult)this.c.sendMessage(this.b, var3, var1, var2).await(10000L, TimeUnit.MILLISECONDS)).getStatus();
   }

   protected List a(ar... var1) {
      byte var2 = 0;
      int var3 = 0;
      ArrayList var4 = new ArrayList();
      ConnectionResult var5 = this.b.blockingConnect(10000L, TimeUnit.MILLISECONDS);
      if (var5.isSuccess()) {
         for(int var6 = var1.length; var3 < var6; ++var3) {
            ar var7 = var1[var3];
            if (this.isCancelled()) {
               break;
            }

            if (TextUtils.isEmpty(var7.c())) {
               var4.add(this.a(var7.a(), var7.b()));
            } else {
               var4.add(this.a(var7.a(), var7.b(), var7.c()));
            }
         }

         this.b.disconnect();
      } else {
         fi.polar.polarflow.util.d.b(a, "Failed to connect to Google API Client(result=" + var5 + ")");

         for(var3 = var2; var3 < var1.length; ++var3) {
            var4.add(new Status(13));
         }
      }

      return var4;
   }

   // $FF: synthetic method
   protected Object doInBackground(Object[] var1) {
      return this.a((ar[])var1);
   }
}
