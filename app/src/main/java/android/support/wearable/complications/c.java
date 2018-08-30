package android.support.wearable.complications;

import android.annotation.TargetApi;
import android.os.RemoteException;
import android.util.Log;

@TargetApi(24)
public class c {
   private final m a;

   public c(m var1) {
      this.a = var1;
   }

   public void a(int var1) {
      try {
         this.a.a(var1, (ComplicationData)null);
      } catch (RemoteException var3) {
         Log.w("ComplicationManager", "Failed to send complication data.", var3);
      }

   }

   public void a(int var1, ComplicationData var2) {
      if (var2.a() != 1 && var2.a() != 2) {
         try {
            this.a.a(var1, var2);
         } catch (RemoteException var3) {
            Log.w("ComplicationManager", "Failed to send complication data.", var3);
         }

      } else {
         throw new IllegalArgumentException("Cannot send data of TYPE_NOT_CONFIGURED or TYPE_EMPTY. Use TYPE_NO_DATA instead.");
      }
   }
}
