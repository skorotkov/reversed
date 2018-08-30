package fi.polar.polarmathsmart.defaults;

import fi.polar.polarmathsmart.types.ActivityLevel;

public class DefaultPhysicalParametersCalculatorAndroidImpl implements DefaultPhysicalParametersCalculator {
   private native double native_getDefaultHeight();

   private native int native_getDefaultTypicalDay();

   private native double native_getDefaultWeight();

   public double getDefaultHeight() {
      return this.native_getDefaultHeight();
   }

   public ActivityLevel getDefaultTypicalDay() {
      return ActivityLevel.convertFromInt(this.native_getDefaultTypicalDay());
   }

   public double getDefaultWeight() {
      return this.native_getDefaultWeight();
   }
}
