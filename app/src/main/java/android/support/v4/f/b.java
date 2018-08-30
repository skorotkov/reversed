package android.support.v4.f;

import android.annotation.TargetApi;
import android.os.AsyncTask;

@TargetApi(11)
class b {
   static void a(AsyncTask var0, Object... var1) {
      var0.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, var1);
   }
}
