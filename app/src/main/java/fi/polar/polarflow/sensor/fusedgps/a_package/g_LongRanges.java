package fi.polar.polarflow.sensor.fusedgps.a_package;

import android.util.SparseArray;

final class g_LongRanges extends SparseArray {
   g_LongRanges() {
      this.append(10, new n_MinMaxLongConstraint("Duration (ms)", 0L, 359999999L));
      this.append(22, new n_MinMaxLongConstraint("Recovery time(ms)", 0L, 3932100000L));
   }
}
