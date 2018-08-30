package fi.polar.polarmathsmart.calories;

import fi.polar.polarmathsmart.types.PmsSportId;

public interface HrCaloriesCalculator {
   float calculateHrCalories(short var1);

   float getEeChangePoint(boolean var1, PmsSportId var2);

   float getHrChangePoint(boolean var1, PmsSportId var2);
}
