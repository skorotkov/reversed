package fi.polar.polarmathsmart.calories;

public interface ExerciseCaloriesCalculator {
   double calculateEnergyPerMinute(float var1);

   double calculateEnergyPerMinuteBaro(float var1, float var2);

   double calculateEnergyPerMinuteExtended(float var1);
}
