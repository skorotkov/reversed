package fi.polar.polarflow.ui.exeview.summary.a.b;

import android.util.SparseLongArray;

class c {
   private static final SparseLongArray a = new d();

   public static int a(long var0) {
      int var2 = 0;

      while(true) {
         if (var2 >= a.size()) {
            var2 = 5;
            break;
         }

         if (var0 >= a.valueAt(var2)) {
            var2 = a.keyAt(var2);
            break;
         }

         ++var2;
      }

      return var2;
   }
}
