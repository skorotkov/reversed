package fi.polar.polarflow.util.b;

import android.util.SparseArray;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepQualityRate;

final class e extends SparseArray {
   e() {
      this.append(0, SleepQualityRate.SLEEP_POORLY);
      this.append(1, SleepQualityRate.SLEEP_RATHER_POORLY);
      this.append(2, SleepQualityRate.SLEEP_NOT_POORLY_NOR_WELL);
      this.append(3, SleepQualityRate.SLEEP_RATHER_WELL);
      this.append(4, SleepQualityRate.SLEEP_WELL);
      this.append(Integer.MAX_VALUE, SleepQualityRate.ANSWER_NOT_AVAILABLE);
   }
}
