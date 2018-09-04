package fi.polar.polarmathsmart.recoverystatus;

import fi.polar.polarmathsmart.types.Gender;
import java.util.List;

public interface RecoveryTimeCalculator {
   double calculateDailyRecoveryTimeSum(List var1);

   DailyTotalLoad calculateDailyTotalLoad(List var1, List var2, List var3, Gender var4, int var5, double var6, double var8, int var10, int var11, int var12, int var13, int var14, double var15, double var17, double var19, double var21, double var23, double var25, int var27) throws InvalidNumberOfDataPointsException;

   double calculateWeeklyRecoveryTimeSumAvg(List var1, List var2, TrainingBackground var3);

   List scaleRecoveryTime(List var1, double var2);
}
