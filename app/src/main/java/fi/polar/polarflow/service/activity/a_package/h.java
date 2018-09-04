package fi.polar.polarflow.service.activity.a_package;

import android.os.AsyncTask;
import fi.polar.polarflow.data.orm.ActivitySamples;
import fi.polar.polarflow.data.orm.RecoveryTimes;
import fi.polar.polarflow.util.ab;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;

class h extends AsyncTask {
   // $FF: synthetic field
   final d a;
   private final f b;

   public h(d var1, f var2) {
      this.a = var1;
      this.b = var2;
   }

   private void a(List var1, DateTime var2, DateTime var3, k... var4) {
      Iterator var5 = var1.iterator();

      while(var5.hasNext()) {
         o var6 = (o)var5.next();
         if (!this.isCancelled() && c.a(var6, var2, var3)) {
            d.a(this.a, var6, var4);
         }
      }

   }

   protected Void a(Void... var1) {
      DateTime var2 = d.a(this.a).c();
      DateTime var3 = ab.c(var2);
      List var6 = ActivitySamples.findByDate(d.a(this.a).d());
      List var8 = c.a(var6, var2);
      List var4 = c.a(var6);
      DateTime var5 = var3.minusDays(8);
      d.a(this.a, RecoveryTimes.getRecoveryTimes());
      DateTime var7;
      if (d.b(this.a) != null) {
         if (!ab.a(d.b(this.a).getStartTime(), var5)) {
            g.a(d.b(this.a));
            var7 = null;
         } else {
            var7 = d.b(this.a).getStartTime().plusDays(8);
         }
      } else {
         d.a(this.a, g.a());
         var7 = null;
      }

      this.a(var8, var7, var3, d.c(this.a));
      this.a(var4, var7, var3, d.c(this.a));
      if (!this.isCancelled()) {
         d.a(this.a, d.b(this.a), var5);
      }

      this.a(var8, var3, (DateTime)null, d.c(this.a));
      this.a(var4, var3, (DateTime)null, d.c(this.a));
      this.a(var8, (DateTime)null, (DateTime)null, d.d(this.a));
      this.a(var4, (DateTime)null, (DateTime)null, d.d(this.a));
      if (!this.isCancelled()) {
         d.a(this.a, d.b(this.a), true, true);
      }

      return null;
   }

   protected void a(Void var1) {
      fi.polar.polarflow.util.d.c(d.c(), "StartTask.onPostExecute()");
      if (this.b != null) {
         this.b.a();
      }

      d.a((d)this.a, (h)null);
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
