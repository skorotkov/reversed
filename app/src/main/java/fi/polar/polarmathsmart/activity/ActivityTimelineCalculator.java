package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.types.Gender;
import java.util.List;

public interface ActivityTimelineCalculator {
   List createMetVectorForActivityTimelineEswType(List var1, List var2, int var3, Gender var4);

   List createMetVectorForActivityTimelineWebServiceType(List var1, List var2, int var3, Gender var4);
}
