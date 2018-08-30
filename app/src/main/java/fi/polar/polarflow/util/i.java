package fi.polar.polarflow.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public class i {
   private static final String a = i.class.getSimpleName();

   private i() {
   }

   public static int a(Context var0, String var1, int var2) {
      int var3;
      try {
         var3 = var0.getPackageManager().getApplicationInfo(var0.getPackageName(), 128).metaData.getInt(var1, var2);
      } catch (NameNotFoundException var4) {
         d.c(a, "Could not obtain application info", var4);
         return var2;
      }

      var2 = var3;
      return var2;
   }
}
