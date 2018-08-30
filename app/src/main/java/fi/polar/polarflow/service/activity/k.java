package fi.polar.polarflow.service.activity;

import android.os.AsyncTask;

public abstract class k extends a {
   private AsyncTask e;
   private int f = 0;

   public k() {
      super(65539, "com.polar.sensor.activity.met");
   }

   // $FF: synthetic method
   static int a(k var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static int a(k var0, int var1) {
      var0.f = var1;
      return var1;
   }

   // $FF: synthetic method
   static AsyncTask a(k var0, AsyncTask var1) {
      var0.e = var1;
      return var1;
   }

   protected abstract void a(int var1);

   protected abstract int e();

   protected void f() {
      if (this.e == null) {
         this.e = (new m(this, (l)null)).execute(new Void[0]);
      } else {
         fi.polar.polarflow.util.d.c("DailyActivityJobService", "onStartJob(): task is already running");
      }

   }

   protected boolean g() {
      fi.polar.polarflow.util.d.c("DailyActivityJobService", "onStopJob()");
      if (this.e != null) {
         this.e.cancel(false);
      }

      return true;
   }
}
