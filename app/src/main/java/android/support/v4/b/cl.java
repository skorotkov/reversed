package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.app.Notification.Builder;
import android.os.Bundle;

@TargetApi(20)
class cl {
   public static void a(Builder var0, cs var1) {
      android.app.Notification.Action.Builder var2 = new android.app.Notification.Action.Builder(var1.a(), var1.b(), var1.c());
      if (var1.g() != null) {
         RemoteInput[] var3 = di.a(var1.g());
         int var4 = var3.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            var2.addRemoteInput(var3[var5]);
         }
      }

      Bundle var6;
      if (var1.d() != null) {
         var6 = new Bundle(var1.d());
      } else {
         var6 = new Bundle();
      }

      var6.putBoolean("android.support.allowGeneratedReplies", var1.e());
      var2.addExtras(var6);
      var0.addAction(var2.build());
   }
}
