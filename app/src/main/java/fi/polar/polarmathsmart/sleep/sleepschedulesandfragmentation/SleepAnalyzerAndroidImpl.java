package fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class SleepAnalyzerAndroidImpl implements SleepAnalyzer {
   private native SleepAnalysisResult native_analyzeNightSleep(List var1, List var2);

   private native ContinuityIndexAverage native_calculateContinuityIndexAverage(List var1);

   private native List native_compressHypnogram(List var1, List var2);

   private native Hypnogram native_decompressHypnogram(List var1);

   private native SleepEvaluationResult native_evaluateSleep(List var1, List var2, double var3, double var5, SleepQualityRate var7);

   private native SleepDurationRecommendation native_getSleepDurationRecommendation(double var1);

   private native List native_trimSleepStartEnd(List var1, List var2, double var3, double var5);

   public SleepAnalysisResult analyzeNightSleep(List var1, List var2) {
      return this.native_analyzeNightSleep(var1, var2);
   }

   public ContinuityIndexAverage calculateContinuityIndexAverage(List var1) {
      try {
         ContinuityIndexAverage var3 = this.native_calculateContinuityIndexAverage(var1);
         return var3;
      } catch (Exception var2) {
         Log.d("Test", "Exception " + var2.toString());
         throw var2;
      }
   }

   public List compressHypnogram(List var1, List var2) {
      return this.native_compressHypnogram(var1, var2);
   }

   public Hypnogram decompressHypnogram(List var1) {
      return this.native_decompressHypnogram(var1);
   }

   public SleepEvaluationResult evaluateSleep(List var1, List var2, double var3, double var5, SleepQualityRate var7) {
      try {
         SleepEvaluationResult var9 = this.native_evaluateSleep(var1, var2, var3, var5, var7);
         return var9;
      } catch (Exception var8) {
         Log.d("TEST", "Exception " + var8.toString());
         throw var8;
      }
   }

   public SleepEvaluationResult evaluateSleepWithSleepPhases(List var1, List var2, double var3, double var5, double var7, double var9, SleepQualityRate var11) {
      ArrayList var12 = new ArrayList();
      ArrayList var13 = new ArrayList();

      try {
         var1 = this.native_trimSleepStartEnd(var1, var2, var3, var5);
      } catch (Exception var16) {
         Log.d("TEST", "Exception " + var16.toString());
         throw var16;
      }

      var3 = ((SleepIntervalState)var1.get(0)).getIntervalStartOffset();

      for(int var14 = 0; var14 < var1.size(); ++var14) {
         var12.add(((SleepIntervalState)var1.get(var14)).getIntervalStartOffset() - var3);
         var13.add(((SleepIntervalState)var1.get(var14)).getState().getDoubleValue());
      }

      var3 = var9 / 3600.0D;

      try {
         SleepEvaluationResult var17 = this.native_evaluateSleep(var12, var13, var7, var3, var11);
         return var17;
      } catch (Exception var15) {
         Log.d("TEST", "Exception " + var15.toString());
         throw var15;
      }
   }

   public SleepDurationRecommendation getSleepDurationRecommendation(double var1) {
      try {
         SleepDurationRecommendation var3 = this.native_getSleepDurationRecommendation(var1);
         return var3;
      } catch (Exception var4) {
         Log.d("TEST", "Exception " + var4.toString());
         throw var4;
      }
   }

   public List trimSleepStartEnd(List var1, List var2, double var3, double var5) {
      try {
         var1 = this.native_trimSleepStartEnd(var1, var2, var3, var5);
         return var1;
      } catch (Exception var7) {
         Log.d("TEST", "Exception " + var7.toString());
         throw var7;
      }
   }
}
