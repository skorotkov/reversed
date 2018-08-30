package fi.polar.polarflow.a_package;

import android.util.SparseArray;

final class f extends SparseArray {
   f() {
      this.append(7, new l("Calories", 0, 65535));
      this.append(9, new l("Cadence", 0, 199));
      this.append(12, new l("PoolCount", 0, 999));
      this.append(13, new l("Strokes", 0, 99999));
      this.append(16, new l("HeartRate", 0, 240));
   }
}
