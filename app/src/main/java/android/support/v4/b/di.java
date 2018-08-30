package android.support.v4.b;

import android.annotation.TargetApi;
import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

@TargetApi(20)
class di {
   static RemoteInput[] a(dk[] var0) {
      RemoteInput[] var4;
      if (var0 == null) {
         var4 = null;
      } else {
         RemoteInput[] var1 = new RemoteInput[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            dk var3 = var0[var2];
            var1[var2] = (new Builder(var3.a())).setLabel(var3.b()).setChoices(var3.c()).setAllowFreeFormInput(var3.d()).addExtras(var3.e()).build();
         }

         var4 = var1;
      }

      return var4;
   }
}
