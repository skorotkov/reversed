package fi.polar.polarmathsmart.nonwear;

import java.util.List;

public interface LongTermNonWearCalculator {
   List defineLongTermNonWearStatus(List var1);

   LongTermNonWear detectLongTermNonWear(double var1, List var3, List var4);
}
