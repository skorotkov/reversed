package fi.polar.polarflow.c.fused.a_package;

import android.util.SparseArray;

final class f_IntRanges extends SparseArray {
   f_IntRanges() {
      this.append(7, new l_MinMaxIntConstraint("Calories", 0, 65535));
      this.append(9, new l_MinMaxIntConstraint("Cadence", 0, 199));
      this.append(12, new l_MinMaxIntConstraint("PoolCount", 0, 999));
      this.append(13, new l_MinMaxIntConstraint("Strokes", 0, 99999));
      this.append(16, new l_MinMaxIntConstraint("HeartRate", 0, 240));
   }
}
