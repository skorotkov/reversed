package fi.polar.polarflow.service.activity;

import android.content.Intent;
import fi.polar.polarflow.data.orm.ActivityInfo;
import fi.polar.polarflow.data.orm.ActivitySamples;
import fi.polar.polarflow.data.orm.InactivityNonWearTriggerInfo;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportInfo;
import fi.polar.polarmathsmart.nonwear.LongTermNonWearCalculatorRealTime;
import fi.polar.polarmathsmart.nonwear.LongTermNonWearCalculatorRealTimeAndroidImpl;
import fi.polar.polarmathsmart.nonwear.LongTermNonWearOutput;
import org.joda.time.DateTime;

class f implements bu {
   private final LongTermNonWearCalculatorRealTime a;
   private final fi.polar.polarflow.util.v b;
   private final bs c;
   private final z d;
   private final Object e;
   private ActivitySamples f;
   private long g;
   private int h;
   private DateTime i;
   private boolean j;
   private boolean k;

   public f(fi.polar.polarflow.util.v var1, bs var2, z var3) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = new Object();
      this.a = new LongTermNonWearCalculatorRealTimeAndroidImpl();
      this.i = null;
   }

   private static ActivityInfo a(DateTime var0, int var1) {
      ActivityInfo var2 = new ActivityInfo();
      var2.setValue(var1);
      var2.setTimestamp(var0);
      return var2;
   }

   private static DateTime a(DateTime var0, boolean var1) {
      DateTime var2 = var0;
      if (var1) {
         DateTime var3 = var0.withTimeAtStartOfDay();
         var2 = var0;
         if (var0.getHourOfDay() == var3.getHourOfDay()) {
            var2 = var0;
            if (var0.getMinuteOfHour() == var3.getMinuteOfHour()) {
               var2 = var3;
            }
         }
      }

      return var2;
   }

   private void a(DateTime var1, float var2) {
      LongTermNonWearOutput var3 = this.a.defineLongTermNonWearStatus(var2);
      if (!this.j && var3.getNonWear3h() > 0) {
         this.c(var1.minusHours(3));
         this.j = true;
         this.d((DateTime)null);
      } else if (!this.k && var3.getNonWear5h() > 0) {
         this.c(var1.minusHours(5));
         this.k = true;
         this.d((DateTime)null);
      } else if (this.i != null && var3.getNonWear3h() == 0 && var3.getNonWear5h() == 0) {
         this.b(var1);
         this.d(var1);
         this.i = null;
         this.j = false;
         this.k = false;
      }

   }

   private void b(boolean var1) {
      fi.polar.polarflow.util.d.c("ActivityRecorder", "saveAndClose(" + var1 + ")");
      if (this.f != null) {
         if (var1) {
            this.f.addEndingActivityInfoAndSportInfo();
         }

         this.f.setClosed(true);
         this.c(false);
         this.f = null;
      }

   }

   private void c(DateTime var1) {
      if (this.i != null && var1 != null) {
         if (!var1.isBefore(this.i)) {
            var1 = this.i;
         }

         this.i = var1;
      } else if (this.i == null) {
         this.i = var1;
      }

   }

   private boolean c(boolean var1) {
      fi.polar.polarflow.util.d.c("ActivityRecorder", "save()");
      boolean var2 = false;
      boolean var3 = var2;
      if (this.f != null) {
         if (this.f.getMetSampleCount() != 0 && this.f.getStepsSampleCount() != 0) {
            this.f.save();
            this.d.a(this.f.createDataLayerRequest(), this.f.createSyncInfoRequest(var1));
            var3 = true;
         } else {
            fi.polar.polarflow.util.d.e("ActivityRecorder", "....No steps/MET samples in " + this.f.getPath() + this.f.getFilename() + " -> not saved");
            var3 = var2;
         }
      }

      return var3;
   }

   private void d(DateTime var1) {
      Intent var2 = new Intent("DailyActivityService.action.LONG_TERM_NON_WEAR");
      var2.putExtra("DailyActivityService.extra.START_TIME", this.i);
      var2.putExtra("DailyActivityService.extra.END_TIME", var1);
      this.b.a(var2);
   }

   private boolean e(DateTime var1) {
      boolean var2 = true;
      boolean var3 = this.f(var1);
      if (var3) {
         fi.polar.polarflow.util.d.c("ActivityRecorder", "Day has changed");
         this.b(false);
      } else if (this.g(var1)) {
         fi.polar.polarflow.util.d.c("ActivityRecorder", "UTC offset has changed");
         this.b(true);
      }

      if (this.f == null) {
         this.c.a((bu)this);
         this.f = this.h(a(var1, var3));
      } else {
         var2 = false;
      }

      return var2;
   }

   private boolean f(DateTime var1) {
      boolean var2;
      if (this.f != null && !fi.polar.polarflow.util.ab.a(this.f.getStartTime(), var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private boolean g(DateTime var1) {
      boolean var2;
      if (this.f != null && !fi.polar.polarflow.util.ab.b(this.f.getStartTime(), var1)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private ActivitySamples h(DateTime var1) {
      ActivitySamples var2 = new ActivitySamples();
      var2.setStartTime(var1);
      var2.setMetRecordingInterval(30000L);
      var2.setStepsRecordingInterval(60000L);
      var2.addSportInfo(this.i(var1));
      var2.addActivityInfo(a(var1, this.h));
      return var2;
   }

   private SportInfo i(DateTime var1) {
      float var2 = 1.0F;
      SportInfo var3 = new SportInfo();
      var3.setTimestamp(var1);
      if (this.g != -2L && this.g != -1L) {
         Sport var4 = Sport.getSport(this.g);
         if (var4 != null) {
            var2 = var4.getFactor();
         }

         var3.setFactor(var2);
         var3.setSportId(this.g);
      } else {
         var3.setFactor(1.0F);
         var3.setSportId(-1L);
      }

      return var3;
   }

   public void a() {
      this.g = -1L;
      this.h = 8;
      this.j = false;
      this.k = false;
      this.i = null;
   }

   public void a(float param1, DateTime param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void a(int param1, DateTime param2) {
      // $FF: Couldn't be decompiled
   }

   public void a(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void a(DateTime param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean a(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public void b() {
      // $FF: Couldn't be decompiled
   }

   void b(DateTime var1) {
      fi.polar.polarflow.util.d.c("ActivityRecorder", "addInactivityNonWearTrigger start: " + this.i + ", end: " + var1);
      InactivityNonWearTriggerInfo var2 = new InactivityNonWearTriggerInfo();
      var2.setStartTimestamp(this.i);
      var2.setEndTimestamp(var1);
      this.f.addInactivityNonWearTrigger(var2);
   }

   public void c() {
      // $FF: Couldn't be decompiled
   }
}
