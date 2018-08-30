package android.support.v4.f;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public final class d {
   public static Creator a(f var0) {
      Object var1;
      if (VERSION.SDK_INT >= 13) {
         var1 = h.a(var0);
      } else {
         var1 = new e(var0);
      }

      return (Creator)var1;
   }
}
