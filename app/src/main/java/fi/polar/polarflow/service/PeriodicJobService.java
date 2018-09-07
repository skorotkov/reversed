package fi.polar.polarflow.service;

import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.app.job.JobInfo.Builder;
import android.content.ComponentName;
import android.content.Context;
import android.os.AsyncTask;
import fi.polar.polarflow.util.aa_TimeUtils;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormat;

public class PeriodicJobService extends JobService {
   static final long a;
   private AsyncTask b;

   static {
      a = TimeUnit.MINUTES.toMillis(178L);
   }

   // $FF: synthetic method
   static AsyncTask a(PeriodicJobService var0, AsyncTask var1) {
      var0.b = var1;
      return var1;
   }

   public static void a(Context var0) {
      JobScheduler var1 = (JobScheduler)var0.getSystemService(Context.JOB_SCHEDULER_SERVICE);
      long var2 = (new aa_TimeUtils()).a_currentTimeMillis();
      var2 = (new DateTime(var2)).plusDays(1).withTimeAtStartOfDay().plusMinutes(1).getMillis() - var2;
      fi.polar.polarflow.util.d.c("PeriodicJobService", "schedulePeriodicJob() in " + PeriodFormat.getDefault().print(new Period(var2)));
      if (var1.schedule((new Builder(1, new ComponentName(var0, PeriodicJobService.class))).setMinimumLatency(var2).setOverrideDeadline(var2 + a).build()) == 0) {
         fi.polar.polarflow.util.d.f("PeriodicJobService", "Failed to schedule a job");
      }

   }

   public boolean onStartJob(JobParameters var1) {
      if (this.b == null) {
         fi.polar.polarflow.util.d.c("PeriodicJobService", "onStartJob(): execute new task");
         this.b = (new e(this, var1)).execute(new Void[0]);
      } else {
         fi.polar.polarflow.util.d.c("PeriodicJobService", "onStartJob(): task is already running");
      }

      return true;
   }

   public boolean onStopJob(JobParameters var1) {
      if (this.b != null) {
         fi.polar.polarflow.util.d.c("PeriodicJobService", "onStopJob(): canceling task");
         this.b.cancel(true);
      } else {
         fi.polar.polarflow.util.d.c("PeriodicJobService", "onStopJob(): nothing to cancel");
      }

      return true;
   }
}
