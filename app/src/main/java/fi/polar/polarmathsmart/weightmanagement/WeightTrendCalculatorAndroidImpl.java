package fi.polar.polarmathsmart.weightmanagement;

import android.util.Log;
import java.util.List;

public class WeightTrendCalculatorAndroidImpl implements WeightTrendCalculator {
   private native WeightTrend native_calculateWeightTrend(WeightPlotPoint[] var1, double var2, double var4);

   public WeightTrend calculateWeightTrend(List var1, double var2, double var4) throws NotEnoughKnownWeightMeasurementsToDetermineWeightTrendException {
      if (var1 != null && var1.size() >= 2) {
         WeightPlotPoint[] var7 = (WeightPlotPoint[])var1.toArray(new WeightPlotPoint[var1.size()]);

         try {
            WeightTrend var8 = this.native_calculateWeightTrend(var7, var2, var4);
            return var8;
         } catch (Exception var6) {
            Log.d("TEST", "Exception " + var6.toString());
            throw var6;
         }
      } else {
         throw new NotEnoughKnownWeightMeasurementsToDetermineWeightTrendException("Not enough known measurements to determine weight trend.");
      }
   }
}
