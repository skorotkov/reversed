package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.activity.model.FilteredData;
import java.util.List;

public interface DataFilter {
   FilteredData filterDataForActivityTimeline(List var1, List var2, Integer var3, int var4, MaxIndex var5);
}
