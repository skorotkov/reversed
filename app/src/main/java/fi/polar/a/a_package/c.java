package fi.polar.a.a_package;

import android.util.SparseArray;

final class c extends SparseArray {
   c() {
      this.append(0, "STATE_DISCONNECTED");
      this.append(1, "STATE_CONNECTING");
      this.append(2, "STATE_CONNECTED");
      this.append(3, "STATE_DISCONNECTING");
   }
}
