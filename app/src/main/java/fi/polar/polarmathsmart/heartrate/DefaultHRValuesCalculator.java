package fi.polar.polarmathsmart.heartrate;

public interface DefaultHRValuesCalculator {
   int getDefaultAerobicThreshold(int var1);

   int getDefaultAnaerobicThreshold(int var1);

   int getDefaultHrMax(int var1);

   int getDefaultHrRest();
}
