package fi.polar.polarflow.util;

import android.util.SparseArray;
import fi.polar.polarmathsmart.types.ActivityLevel;

final class l extends SparseArray {
   l() {
      this.append(1, ActivityLevel.MOSTLY_SITTING);
      this.append(2, ActivityLevel.MOSTLY_STANDING);
      this.append(3, ActivityLevel.MOSTLY_MOVING);
   }
}
