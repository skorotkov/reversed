package fi.polar.a.a;

import android.util.SparseArray;

final class d extends SparseArray {
   d() {
      this.append(0, "GATT_SUCCESS");
      this.append(2, "GATT_READ_NOT_PERMITTED");
      this.append(3, "GATT_WRITE_NOT_PERMITTED");
      this.append(5, "GATT_INSUFFICIENT_AUTHENTICATION");
      this.append(6, "GATT_REQUEST_NOT_SUPPORTED");
      this.append(15, "GATT_INSUFFICIENT_ENCRYPTION");
      this.append(7, "GATT_INVALID_OFFSET");
      this.append(13, "GATT_INVALID_ATTRIBUTE_LENGTH");
      this.append(143, "GATT_CONNECTION_CONGESTED");
      this.append(257, "GATT_FAILURE");
   }
}
