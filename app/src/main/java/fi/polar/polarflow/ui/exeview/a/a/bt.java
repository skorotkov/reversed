package fi.polar.polarflow.ui.exeview.a.a;

import android.content.Intent;

final class bt {
   static int a(Intent var0) {
      int var1;
      if (var0 != null) {
         var1 = var0.getIntExtra("ExerciseLapCalc.KEY_LAP_NUMBER", 0) + 1;
      } else {
         var1 = 1;
      }

      return var1;
   }
}
