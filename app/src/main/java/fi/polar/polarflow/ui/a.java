package fi.polar.polarflow.ui;

import android.content.Intent;

public class a {
   public static boolean a(Intent var0) {
      boolean var1 = false;
      boolean var2 = var1;
      if (var0 != null) {
         var2 = var1;
         if (var0.getBooleanExtra("ActivityResult.extra.CLOSED_WITH_POLAR_BUTTON", false)) {
            var2 = true;
         }
      }

      return var2;
   }
}
