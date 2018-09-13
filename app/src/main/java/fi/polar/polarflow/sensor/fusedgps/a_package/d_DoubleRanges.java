package fi.polar.polarflow.sensor.fusedgps.a_package;

import android.util.SparseArray;

final class d_DoubleRanges extends SparseArray {
   d_DoubleRanges() {
      this.append(a_DataTypes.SPEED_INDEX, new h_MinMaxDoubleConstraint("Speed", 0.0D, 399.0D));
      this.append(a_DataTypes.ALTITUDE_INDEX, new h_MinMaxDoubleConstraint("Altitude", -550.0D, 9000.0D));
      this.append(a_DataTypes.LAT_INDEX, new h_MinMaxDoubleConstraint("Latitude", -90.0D, 90.0D));
      this.append(a_DataTypes.LON_INDEX, new h_MinMaxDoubleConstraint("Longitude", -180.0D, 180.0D));
      this.append(a_DataTypes.DISTANCE_INDEX, new h_MinMaxDoubleConstraint("Distance", 0.0D, 9999000.0D));
   }
}
