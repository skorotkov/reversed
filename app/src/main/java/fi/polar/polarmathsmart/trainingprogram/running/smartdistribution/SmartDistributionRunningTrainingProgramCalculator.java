package fi.polar.polarmathsmart.trainingprogram.running.smartdistribution;

import fi.polar.polarmathsmart.calendar.DayOfWeek;

public interface SmartDistributionRunningTrainingProgramCalculator {
   SmartDistributionRunningTrainingProgram calculateSmartDistributionRunningTrainingProgram(UsersTrainingHistory var1, UsersTrainingProgramPreferences var2, RunningEventDetails var3);

   boolean hasExtraWeek(DayOfWeek var1, DayOfWeek var2);

   SmartDistributionRunningTrainingProgram updateSmartDistributionRunningTrainingProgram(String var1, UsersTrainingProgramPreferences var2, RunningEventDetails var3);
}
