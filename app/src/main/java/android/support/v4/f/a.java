package android.support.v4.f;

import android.os.AsyncTask;
import android.os.Build.VERSION;

public final class a {
   public static AsyncTask a(AsyncTask var0, Object... var1) {
      if (var0 == null) {
         throw new IllegalArgumentException("task can not be null");
      } else {
         if (VERSION.SDK_INT >= 11) {
            b.a(var0, var1);
         } else {
            var0.execute(var1);
         }

         return var0;
      }
   }
}
