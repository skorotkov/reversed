package fi.polar.polarflow.service.activity.a;

import android.util.SparseArray;
import fi.polar.polarflow.data.orm.ActivityInfo;

class b extends SparseArray {
   // $FF: synthetic field
   final a a;

   b(a var1) {
      this.a = var1;
      int[] var4 = ActivityInfo.ACTIVITY_CLASSES;
      int var2 = var4.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         this.append(var4[var3], 0L);
      }

   }
}
