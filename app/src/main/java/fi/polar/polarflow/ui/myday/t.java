package fi.polar.polarflow.ui.myday;

import android.os.AsyncTask;

class t extends AsyncTask {
   // $FF: synthetic field
   final StopSleepActivity a;
   private final Runnable b;

   public t(StopSleepActivity var1, int var2) {
      this.a = var1;
      StopSleepActivity.a(var1, false);
      this.b = new fi.polar.polarflow.ui.myday.item.sleeprating.b(var1, StopSleepActivity.e(var1), StopSleepActivity.f(var1), StopSleepActivity.g(var1), StopSleepActivity.h(var1), var2, false);
   }

   protected Void a(Void... var1) {
      if (!this.isCancelled()) {
         this.b.run();
      }

      return null;
   }

   protected void a(Void var1) {
      StopSleepActivity.a(this.a, true);
      StopSleepActivity.i(this.a);
      if (!this.a.isFinishing() && !this.a.isDestroyed()) {
         this.a.finish();
      }

   }

   // $FF: synthetic method
   protected Object doInBackground(Object[] var1) {
      return this.a((Void[])var1);
   }

   // $FF: synthetic method
   protected void onPostExecute(Object var1) {
      this.a((Void)var1);
   }
}
