package fi.polar.polarflow.ui.myday.item.sleeprating;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.SleepAnalysisResult;
import fi.polar.polarflow.service.datalayer.u;
import fi.polar.polarflow.util.v;
import fi.polar.polarflow.util.z;
import org.joda.time.DateTime;

public class b extends fi.polar.polarflow.service.activity.b {
   private final v a;
   private final String b;
   private final int c;

   public b(Context var1, z var2, u var3, v var4, String var5, int var6) {
      this(var1, var2, var3, var4, var5, var6, true);
   }

   public b(Context var1, z var2, u var3, v var4, String var5, int var6, boolean var7) {
      super(var1, var2, var3, var7);
      this.a = var4;
      this.b = var5;
      this.c = var6;
   }

   private void a(int var1, DateTime var2) {
      Intent var3 = this.a.a((BroadcastReceiver)null, (String)"SleepTrackingService.action.SLEEP_ANALYSIS_RESULT");
      if (var3 != null) {
         fi.polar.polarflow.util.b_package.a var4 = (fi.polar.polarflow.util.b_package.a)var3.getParcelableExtra("SleepTrackingService.extra.SLEEP_ANALYSIS");
         if (this.b.equals(var4.c())) {
            var3.putExtra("SleepTrackingService.extra.SLEEP_ANALYSIS", var4.a(var1, var2));
            this.a.b(var3);
         }
      }

   }

   public void run() {
      SleepAnalysisResult var1 = SleepAnalysisResult.findByPath(this.b);
      if (var1 != null) {
         if (var1.getUserSleepRating() != this.c) {
            var1.setUserSleepRating(this.c);
            DateTime var2 = new DateTime();
            var1.setLastModified(var2.getMillis(), true);
            this.a(var1);
            this.a(this.c, var2);
         }
      } else {
         fi.polar.polarflow.util.d.e("SleepRatingSaveAndPublishTask", "Could not find SleepAnalysisResult with path " + this.b);
      }

   }
}
