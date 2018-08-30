package fi.polar.polarmathsmart.activity;

import fi.polar.polarmathsmart.types.ActivityClass;
import fi.polar.polarmathsmart.types.InActivityAlertType;

public interface ActivityClassCalculator {
   InActivityAlertType getAlert();

   ActivityClass getCurrentActivityClass();

   float getFinalMETValue();

   ActivityClass getStabileActivityClass();

   ActivityClass update(float var1, boolean var2, boolean var3);
}
