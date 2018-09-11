package fi.polar.polarflow.sensor.fusedgps.a_package;

import android.util.SparseArray;

final class e_FloatRanges extends SparseArray {
   e_FloatRanges() {
      this.append(2, new j_MinMaxFloatConstraint("Speed", 0.0F, 399.0F));
      this.append(4, new j_MinMaxFloatConstraint("Altitude", -550.0F, 9000.0F));
      this.append(1, new j_MinMaxFloatConstraint("Distance", 0.0F, 9999000.0F));
      this.append(11, new j_MinMaxFloatConstraint("Duration (s)", 0.0F, 359999.0F));
      this.append(14, new j_MinMaxFloatConstraint("PoolLength", 0.0F, 999.0F));
      this.append(15, new j_MinMaxFloatConstraint("Swolf", 0.0F, 9999000.0F));
      this.append(19, new j_MinMaxFloatConstraint("MET", 0.875F, 31.875F));
   }
}
