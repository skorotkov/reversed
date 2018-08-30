package fi.polar.polarflow.service;

import android.app.job.JobParameters;
import android.os.AsyncTask;
import fi.polar.polarflow.ui.NotificationReceiver;

class e extends AsyncTask {
   // $FF: synthetic field
   final PeriodicJobService a;
   private final JobParameters b;

   public e(PeriodicJobService var1, JobParameters var2) {
      this.a = var1;
      this.b = var2;
   }

   protected Void a(Void... var1) {
      if (!this.isCancelled()) {
         NotificationReceiver.a(this.a.getApplicationContext());
      }

      if (!this.isCancelled()) {
      }

      if (!this.isCancelled()) {
         fi.polar.polarflow.util.d.c("PeriodicJobService", "Calling jobFinished()");
         this.a.jobFinished(this.b, false);
      }

      return null;
   }

   protected void a(Void var1) {
      fi.polar.polarflow.util.d.c("PeriodicJobService", "PeriodicAsyncTask.onPostExecute()");
      PeriodicJobService.a(this.a, (AsyncTask)null);
      PeriodicJobService.a(this.a.getApplicationContext());
   }

   protected void b(Void var1) {
      fi.polar.polarflow.util.d.c("PeriodicJobService", "PeriodicAsyncTask.onCancelled()");
      PeriodicJobService.a(this.a, (AsyncTask)null);
   }

   // $FF: synthetic method
   protected Object doInBackground(Object[] var1) {
      return this.a((Void[])var1);
   }

   // $FF: synthetic method
   protected void onCancelled(Object var1) {
      this.b((Void)var1);
   }

   // $FF: synthetic method
   protected void onPostExecute(Object var1) {
      this.a((Void)var1);
   }
}
