package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

import java.util.List;

public interface SleepAnalyzer {
   SleepAnalysisResult analyzeNightSleep(List var1, List var2);

   ContinuityIndexAverage calculateContinuityIndexAverage(List var1);

   List compressHypnogram(List var1, List var2);

   Hypnogram decompressHypnogram(List var1);

   SleepEvaluationResult evaluateSleep(List var1, List var2, double var3, double var5, SleepQualityRate var7);

   SleepDurationRecommendation getSleepDurationRecommendation(double var1);

   List trimSleepStartEnd(List var1, List var2, double var3, double var5);
}
