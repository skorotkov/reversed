package fi.polar.polarflow.sensor.fusedgps.a_package;

import android.util.SparseArray;

final class d_DoubleRanges extends SparseArray {
   d_DoubleRanges() {
      this.append(2, new h_MinMaxDoubleConstraint("Speed", 0.0D, 399.0D));
      this.append(4, new h_MinMaxDoubleConstraint("Altitude", -550.0D, 9000.0D));
      this.append(5, new h_MinMaxDoubleConstraint("Latitude", -90.0D, 90.0D));
      this.append(6, new h_MinMaxDoubleConstraint("Longitude", -180.0D, 180.0D));
      this.append(1, new h_MinMaxDoubleConstraint("Distance", 0.0D, 9999000.0D));
   }
}
