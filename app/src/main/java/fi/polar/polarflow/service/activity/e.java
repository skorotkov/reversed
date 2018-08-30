package fi.polar.polarflow.service.activity;

import android.util.SparseArray;
import fi.polar.polarmathsmart.types.ActivityClass;

final class e extends SparseArray {
   e() {
      this.append(1, ActivityClass.SLEEP);
      this.append(2, ActivityClass.SEDENTARY);
      this.append(3, ActivityClass.LIGHT_ACTIVITY);
      this.append(4, ActivityClass.CONTINUOUS_MODERATE);
      this.append(5, ActivityClass.INTERMITTENT_MODERATE);
      this.append(6, ActivityClass.CONTINUOUS_VIGOROUS);
      this.append(7, ActivityClass.INTERMITTENT_VIGOROUS);
      this.append(8, ActivityClass.NON_WEAR);
   }
}
