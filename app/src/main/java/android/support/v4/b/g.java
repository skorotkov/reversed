package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

@TargetApi(16)
class g {
   public static void a(Activity var0, Intent var1, int var2, Bundle var3) {
      var0.startActivityForResult(var1, var2, var3);
   }

   public static void a(Activity var0, IntentSender var1, int var2, Intent var3, int var4, int var5, int var6, Bundle var7) {
      var0.startIntentSenderForResult(var1, var2, var3, var4, var5, var6, var7);
   }
}
