package fi.polar.polarflow.service.activity;

import android.content.Context;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import fi.polar.polarflow.data.orm.SleepWakePhase;
import java.util.Iterator;

class ba extends b {
   private final fi.polar.polarflow.util.b.a a;

   public ba(Context var1, fi.polar.polarflow.util.z var2, fi.polar.polarflow.service.datalayer.u var3, fi.polar.polarflow.util.b.a var4, boolean var5) {
      super(var1, var2, var3, var5);
      this.a = var4;
   }

   private static SleepAnalysisResult a(fi.polar.polarflow.util.b.a var0) {
      SleepAnalysisResult var1 = new SleepAnalysisResult();
      var1.setStartTime(var0.a);
      var1.setEndTime(var0.b);
      var1.setLastModified(var0.c.getMillis(), true);
      var1.setSleepGoalMinutes(var0.g);
      var1.setRecordingDevice(fi.polar.polarflow.util.c.a());
      var1.setBatteryRanOut(var0.n);
      Iterator var2 = var0.m.iterator();

      while(var2.hasNext()) {
         var1.addSleepWakePhase(new SleepWakePhase((SleepWakePhase)var2.next()));
      }

      return var1;
   }

   public void run() {
      this.a(a(this.a));
   }
}
