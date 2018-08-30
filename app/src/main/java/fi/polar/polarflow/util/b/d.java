package fi.polar.polarflow.util.b;

import android.util.SparseArray;
import fi.polar.polarflow.data.orm.PhysData;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import fi.polar.polarflow.util.k;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepAnalyzerAndroidImpl;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepEvaluationResult;
import fi.polar.polarmathsmart.sleep.sleepschedulesandfragmentation.SleepQualityRate;
import org.joda.time.DateTime;

public class d {
   private static final SparseArray a = new e();
   private final k b;
   private final SleepAnalyzerAndroidImpl c;

   public d(PhysData var1) {
      this.b = new k(var1);
      this.c = new SleepAnalyzerAndroidImpl();
   }

   private static SleepQualityRate a(int var0) {
      SleepQualityRate var1 = (SleepQualityRate)a.get(var0);
      if (var1 == null) {
         var1 = SleepQualityRate.ANSWER_NOT_AVAILABLE;
      }

      return var1;
   }

   public a a(SleepAnalysisResult var1) {
      a var6;
      try {
         SleepEvaluationResult var2 = this.c.evaluateSleepWithSleepPhases(var1.getSleepWakeOffsetsAsDoubleList(), var1.getSleepWakeStatesAsDoubleList(), (double)var1.getSleepStartOffsetSeconds(0), (double)var1.getSleepEndOffsetSeconds(0), (double)this.b.p(), (double)(this.b.D() * 60), a(var1.getUserSleepRating()));
         c var3 = new c();
         var3 = var3.a(var1.getStartTimeTrimmed()).b(var1.getEndTimeTrimmed());
         DateTime var4 = new DateTime(var1.getLastModified());
         var6 = var3.c(var4).a((int)var2.getDuration()).b((int)var2.getSleepSpan()).c((int)var2.getTotalInterruptionDuration()).d(var1.getSleepGoalMinutes()).e(var2.getOneNightFeedback()).a(var2.getEfficiency()).b(var2.getContinuityIndex()).f((int)var2.getContinuityIndexClass()).g(var1.getUserSleepRating()).a(var1.cloneSleepWakePhaseList()).h(var1.getBatteryRanOut()).a();
      } catch (Exception var5) {
         fi.polar.polarflow.util.d.c("SleepAnalyzerHelper", "", var5);
         var6 = null;
      }

      return var6;
   }
}
