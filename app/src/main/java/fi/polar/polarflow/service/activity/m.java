package fi.polar.polarflow.service.activity;

import android.os.AsyncTask;

class m extends AsyncTask {
   // $FF: synthetic field
   final k a;

   private m(k var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   m(k var1, l var2) {
      this(var1);
   }

   protected Void a(Void... var1) {
      k.a(this.a, k.a(this.a) + this.a.e());
      return null;
   }

   protected void a(Void var1) {
      this.a.a(k.a(this.a));
      k.a(this.a, 0);
      k.a(this.a, (AsyncTask)null);
      this.a.l();
   }

   protected void b(Void var1) {
      fi.polar.polarflow.util.d.c("DailyActivityJobService", "onCancelled(), mProcessedEvents = [" + k.a(this.a) + "]");
      k.a(this.a, (AsyncTask)null);
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
