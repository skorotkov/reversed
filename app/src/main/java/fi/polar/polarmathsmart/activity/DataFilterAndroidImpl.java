package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.activity.model.FilteredData;
import java.util.List;

public class DataFilterAndroidImpl implements DataFilter {
   private native FilteredData native_filterDataForActivityTimeline(List var1, List var2, int var3, int var4, int var5);

   public FilteredData filterDataForActivityTimeline(List var1, List var2, Integer var3, int var4, MaxIndex var5) {
      return this.native_filterDataForActivityTimeline(var1, var2, var3, var4, var5.getValue());
   }
}
