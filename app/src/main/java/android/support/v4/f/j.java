package android.support.v4.f;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
class j {
   public static void a() {
      Trace.endSection();
   }

   public static void a(String var0) {
      Trace.beginSection(var0);
   }
}
