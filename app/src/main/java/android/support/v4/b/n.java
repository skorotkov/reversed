package android.support.v4.b;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

abstract class n extends m {
   boolean b;

   public void startActivityForResult(Intent var1, int var2, Bundle var3) {
      if (!this.b && var2 != -1) {
         b(var2);
      }

      super.startActivityForResult(var1, var2, var3);
   }

   public void startIntentSenderForResult(IntentSender var1, int var2, Intent var3, int var4, int var5, int var6, Bundle var7) {
      if (!this.a && var2 != -1) {
         b(var2);
      }

      super.startIntentSenderForResult(var1, var2, var3, var4, var5, var6, var7);
   }
}
