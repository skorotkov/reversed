package fi.polar.polarmathsmart.defaults;

import fi.polar.polarmathsmart.types.ActivityLevel;

public interface DefaultPhysicalParametersCalculator {
   double getDefaultHeight();

   ActivityLevel getDefaultTypicalDay();

   double getDefaultWeight();
}
