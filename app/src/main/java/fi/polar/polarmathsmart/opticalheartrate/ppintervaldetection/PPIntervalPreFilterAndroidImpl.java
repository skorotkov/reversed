package fi.polar.polarmathsmart.opticalheartrate.ppintervaldetection;

import java.util.ArrayList;

public class PPIntervalPreFilterAndroidImpl {
   private native ArrayList native_filterPPIntervals(ArrayList var1, ArrayList var2, ArrayList var3, ArrayList var4);

   private native PPIntervalPreFilterOutput native_filterPpiForFitnessTest(float var1, boolean var2, float var3, boolean var4);

   public ArrayList filterPPIntervals(ArrayList var1, ArrayList var2, ArrayList var3, ArrayList var4) {
      return this.native_filterPPIntervals(var1, var2, var3, var4);
   }

   public PPIntervalPreFilterOutput filterPpiForFitnessTest(float var1, boolean var2, float var3, boolean var4) {
      return this.native_filterPpiForFitnessTest(var1, var2, var3, var4);
   }
}
