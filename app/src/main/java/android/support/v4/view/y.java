package android.support.v4.view;

import android.os.Build.VERSION;

public final class y {
   static final z a;

   static {
      if (VERSION.SDK_INT >= 17) {
         a = new ab();
      } else {
         a = new aa();
      }

   }

   public static int a(int var0, int var1) {
      return a.a(var0, var1);
   }
}
