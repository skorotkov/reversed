package android.support.v4.b;

import android.annotation.TargetApi;
import android.os.Bundle;

@TargetApi(16)
class dm {
   static Bundle a(dk var0) {
      Bundle var1 = new Bundle();
      var1.putString("resultKey", var0.a());
      var1.putCharSequence("label", var0.b());
      var1.putCharSequenceArray("choices", var0.c());
      var1.putBoolean("allowFreeFormInput", var0.d());
      var1.putBundle("extras", var0.e());
      return var1;
   }

   static Bundle[] a(dk[] var0) {
      Bundle[] var3;
      if (var0 == null) {
         var3 = null;
      } else {
         Bundle[] var1 = new Bundle[var0.length];

         for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = a(var0[var2]);
         }

         var3 = var1;
      }

      return var3;
   }
}
