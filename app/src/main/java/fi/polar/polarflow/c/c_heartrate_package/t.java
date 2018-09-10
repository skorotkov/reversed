package fi.polar.polarflow.c.c_heartrate_package;

import android.util.SparseArray;

final class t extends SparseArray {
   t() {
      this.append(-1, "SENSOR_STATUS_NO_CONTACT");
      this.append(0, "SENSOR_STATUS_UNRELIABLE");
      this.append(1, "SENSOR_STATUS_ACCURACY_LOW");
      this.append(2, "SENSOR_STATUS_ACCURACY_MEDIUM");
      this.append(3, "SENSOR_STATUS_ACCURACY_HIGH");
   }
}
