package fi.polar.polarflow.a_package;

import android.util.SparseArray;
import java.math.RoundingMode;

final class c extends SparseArray {
   c() {
      this.append(1, RoundingMode.DOWN);
      this.append(2, RoundingMode.DOWN);
      this.append(3, RoundingMode.UP);
      this.append(4, RoundingMode.DOWN);
      this.append(17, RoundingMode.DOWN);
      this.append(18, RoundingMode.UP);
      this.append(20, RoundingMode.HALF_UP);
      this.append(21, RoundingMode.HALF_UP);
   }
}
