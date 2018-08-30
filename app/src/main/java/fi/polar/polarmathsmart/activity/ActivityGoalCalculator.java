package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.types.ActivityIntensity;

public interface ActivityGoalCalculator {
   ActivityIntensity getCurrentIntensityLevel(float var1);

   float getGoal();

   void setGoal(float var1);

   float updateMetMinutes(float var1, float var2);
}
