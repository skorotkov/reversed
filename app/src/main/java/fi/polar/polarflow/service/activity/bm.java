package fi.polar.polarflow.service.activity;

import android.os.Binder;

public class bm extends Binder {
   // $FF: synthetic field
   final SleepTrackingService a;

   public bm(SleepTrackingService var1) {
      this.a = var1;
   }

   public SleepTrackingService a() {
      return this.a;
   }
}
