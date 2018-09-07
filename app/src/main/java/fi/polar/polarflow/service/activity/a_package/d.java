package fi.polar.polarflow.service.activity.a_package;

import android.content.Context;
import android.content.Intent;
import fi.polar.polarflow.data.orm.DailyActivityGoal;
import fi.polar.polarflow.data.orm.DailySummary;
import fi.polar.polarflow.data.orm.RecoveryTimes;
import fi.polar.polarflow.service.activity.bs;
import fi.polar.polarflow.service.activity.z;
import fi.polar.polarflow.util.ab;
import fi.polar.polarflow.util.v_StickyLocalBroadcastManager;

import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

public class d {
   private static final String a = d.class.getSimpleName();
   private final v_StickyLocalBroadcastManager b;
   private final bs c;
   private final z d;
   private h e;
   private DateTime f;
   private final w g;
   private final m h;
   private final l i;
   private final i j;
   private final n k;
   private LocalDate l;
   private int m;
   private int n;
   private final j o;
   private RecoveryTimes p;
   private DailySummary q;
   private final fi.polar.polarflow.service.d r;
   private float s = -1.0F;

   public d(Context var1, v_StickyLocalBroadcastManager var2, bs var3, z var4) {
      this.c = var3;
      this.d = var4;
      this.g = new w();
      this.h = new m();
      this.i = new l();
      this.j = new i();
      this.k = new n();
      this.o = new j();
      this.b = var2;
      this.r = fi.polar.polarflow.service.d.a(var1);
      this.l = null;
      this.m = -1;
      this.n = -1;
   }

   private int a(RecoveryTimes var1) {
      return fi.polar.polarflow.service.activity.a_package.g.b(var1) + (int)this.h.c_();
   }

   private DailySummary a(LocalDate var1) {
      DailySummary var2;
      if (this.q != null && this.q.getDate().equals(var1)) {
         var2 = this.q;
      } else {
         var2 = fi.polar.polarflow.service.activity.a_package.e.a(var1);
      }

      return var2;
   }

   // $FF: synthetic method
   static RecoveryTimes a(d var0, RecoveryTimes var1) {
      var0.p = var1;
      return var1;
   }

   // $FF: synthetic method
   static h a(d var0, h var1) {
      var0.e = var1;
      return var1;
   }

   // $FF: synthetic method
   static bs a(d var0) {
      return var0.c;
   }

   private void a(DailySummary var1) {
      int var2;
      if (var1.getAchievedPercentage() != -1.0F) {
         var2 = (int)var1.getAchievedPercentage();
      } else {
         var2 = -1;
      }

      int var3 = var1.getSteps();
      LocalDate var4 = var1.getDate();
      if (var3 != this.n || var2 != this.m || this.l == null || !this.l.equals(var4)) {
         Intent var5 = new Intent("DailyActivityService.action.DAILY_ACTIVITY_STATUS");
         var5.putExtra("DailyActivityService.extra.DAILY_SUMMARY", var1);
         this.b.b_sendStickyBroadcast(var5);
         this.l = var4;
         this.m = var2;
         this.n = var3;
         this.r.a(0);
      }

   }

   private void a(RecoveryTimes var1, DateTime var2) {
      var1.addSteps((int)this.h.c_());
      var1.addAccumulatedActivity(this.i.c_());
      var1.addActivityCalories((float)this.j.b());
      var1.addExerciseCalories((float)this.j.c());
      var1.addBmrCalories((float)this.j.d());
      fi.polar.polarflow.util.d.c(a, "saving: steps in half hour = " + (int)this.h.c_() + ", daily steps = " + var1.getSteps());
      fi.polar.polarflow.util.d.c(a, "saving: activity in half hour = " + (int)this.i.c_() + ", daily activity = " + var1.getAccumulatedActivity());
      this.h.a();
      this.i.a();
      this.j.a();
      this.b(var1, var2);
   }

   // $FF: synthetic method
   static void a(d var0, RecoveryTimes var1, DateTime var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(d var0, o var1, k[] var2) {
      var0.a(var1, var2);
   }

   private void a(o var1) {
      this.a(var1, this.e());
   }

   private void a(o var1, k... var2) {
      int var3 = var2.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         k var5 = var2[var4];
         if (var5.a_() == var1.a) {
            var5.a(var1);
         }
      }

   }

   private void a(DateTime var1, boolean var2) {
      RecoveryTimes var3 = this.i();
      RecoveryTimes var4;
      if (var3 != null) {
         var4 = var3;
         if (var2) {
            fi.polar.polarflow.util.d.c(a, "Day has changed since last save, clear daily cumulative fields");
            fi.polar.polarflow.service.activity.a_package.g.a(var3);
            var4 = var3;
         }
      } else {
         var4 = fi.polar.polarflow.service.activity.a_package.g.a();
      }

      this.a(var4, var1);
   }

   private boolean a(RecoveryTimes var1, DailySummary var2, boolean var3) {
      boolean var4 = false;
      boolean var5 = var2.isActivityGoalReached();
      var2.setSteps(this.a(var1));
      var2.setActivityGoal(this.j());
      var2.setAchievedActivity(this.b(var1));
      if (!var5 && var2.isActivityGoalReached()) {
         var5 = true;
      } else {
         var5 = false;
      }

      x var6 = this.g.a(var2.getActivityGoal(), var2.getAchievedActivity());
      var2.setTimeToGoUp(var6.a);
      var2.setTimeToGoWalk(var6.b);
      var2.setTimeToGoJog(var6.c);
      var2.setActivityCalories((int)this.c(var1));
      var2.setTrainingCalories((int)this.d(var1));
      var2.setBmrCalories((int)this.e(var1));
      var2.addActivityDistance(this.o.c_());
      this.o.a();
      var2.addTimeSleep(this.k.a(1));
      var2.addTimeSedentary(this.k.a(2));
      var2.addTimeLightActivity(this.k.a(3));
      var2.addTimeContinuousModerate(this.k.a(4));
      var2.addTimeIntermittentModerate(this.k.a(5));
      var2.addTimeContinuousVigorous(this.k.a(6));
      var2.addTimeIntermittentVigorous(this.k.a(7));
      var2.addTimeNonWear(this.k.a(8));
      this.k.a();
      if (!var3) {
         var3 = var4;
         if (!var5) {
            return var3;
         }
      }

      var2.save();
      this.d.a(var2.createDataLayerRequest(), var2.createSyncInfoRequest(var5));
      var3 = true;
      return var3;
   }

   private boolean a(RecoveryTimes var1, boolean var2, boolean var3) {
      this.q = this.a(this.c.d());
      if (var3) {
         fi.polar.polarflow.service.activity.a_package.e.a(this.q);
      }

      var2 = this.a(var1, this.q, var2);
      this.a(this.q);
      return var2;
   }

   // $FF: synthetic method
   static boolean a(d var0, RecoveryTimes var1, boolean var2, boolean var3) {
      return var0.a(var1, var2, var3);
   }

   private boolean a(DateTime var1) {
      boolean var2;
      if (!var1.isEqual(this.f)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private float b(RecoveryTimes var1) {
      return fi.polar.polarflow.service.activity.a_package.g.c(var1) + this.i.c_();
   }

   // $FF: synthetic method
   static RecoveryTimes b(d var0) {
      return var0.p;
   }

   private void b(RecoveryTimes var1, DateTime var2) {
      var1.setStartTime(var2);
      var1.save();
      this.d.a(var1.createDataLayerRequest());
      this.f = var2;
   }

   private boolean b(DateTime var1) {
      boolean var2;
      if (this.f != null && !ab.a(var1, this.f)) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   private double c(RecoveryTimes var1) {
      return (double)fi.polar.polarflow.service.activity.a_package.g.d(var1) + this.j.b();
   }

   // $FF: synthetic method
   static String c() {
      return a;
   }

   // $FF: synthetic method
   static k[] c(d var0) {
      return var0.f();
   }

   private double d(RecoveryTimes var1) {
      return (double)fi.polar.polarflow.service.activity.a_package.g.e(var1) + this.j.c();
   }

   private void d() {
      this.p = null;
      this.s = -1.0F;
      this.q = null;
      this.f = null;
      this.g.a();
      this.l = null;
      this.m = -1;
      this.n = -1;
      k[] var1 = this.e();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3].a();
      }

   }

   // $FF: synthetic method
   static k[] d(d var0) {
      return var0.g();
   }

   private double e(RecoveryTimes var1) {
      return (double)fi.polar.polarflow.service.activity.a_package.g.f(var1) + this.j.d();
   }

   private k[] e() {
      return new k[]{this.h, this.i, this.j, this.k, this.o};
   }

   private k[] f() {
      return new k[]{this.h, this.i, this.j};
   }

   private k[] g() {
      return new k[]{this.k, this.o};
   }

   private void h() {
      this.g.a();
      k[] var1 = this.e();
      int var2 = var1.length;

      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3].b_();
      }

   }

   private RecoveryTimes i() {
      if (this.p == null) {
         this.p = fi.polar.polarflow.service.activity.a_package.g.b();
      }

      return this.p;
   }

   private float j() {
      float var1;
      if (this.s > 0.0F) {
         var1 = this.s;
      } else {
         DailyActivityGoal var2 = DailyActivityGoal.getDailyActivityGoal();
         if (var2 != null && var2.getActivityMetMinGoal() > 0.0F) {
            this.s = var2.getActivityMetMinGoal();
            var1 = this.s;
         } else {
            var1 = this.i.e();
         }
      }

      return var1;
   }

   private DateTime k() {
      return RecoveryTimes.calculateStartTime(this.c.c());
   }

   public void a() {
      if (this.e != null) {
         this.e.cancel(true);
         this.e = null;
      }

      this.a(true);
      this.d();
   }

   public void a(f var1) {
      this.e = new h(this, var1);
      this.e.execute(new Void[0]);
   }

   public void a(List var1) {
      DateTime var2 = this.c.c();
      DateTime var3 = var2.withTimeAtStartOfDay();
      var2 = ab.c(var2);
      DateTime var4 = var2.minusDays(8);
      if (this.a(var4)) {
         boolean var6;
         if (this.b(var4)) {
            LocalDate var5 = (new LocalDate(this.c.c())).minusDays(1);
            this.a(this.i(), this.a(var5), true);
            this.h();
            var6 = true;
         } else {
            var6 = false;
         }

         Iterator var7 = var1.iterator();

         while(var7.hasNext()) {
            o var12 = (o)var7.next();
            if (fi.polar.polarflow.service.activity.a_package.c.a(var12, var3.minusMillis(1), var2)) {
               this.a(var12);
            }
         }

         this.a(var4, var6);
         Iterator var11 = var1.iterator();

         while(var11.hasNext()) {
            o var8 = (o)var11.next();
            if (fi.polar.polarflow.service.activity.a_package.c.a((o)var8, var2, (DateTime)null)) {
               this.a(var8);
            }
         }
      } else {
         Iterator var9 = var1.iterator();

         while(var9.hasNext()) {
            o var10 = (o)var9.next();
            if (fi.polar.polarflow.service.activity.a_package.c.a((o)var10, var3.minusMillis(1), (DateTime)null)) {
               this.a(var10);
            }
         }
      }

   }

   public boolean a(boolean var1) {
      DateTime var2 = this.k();
      if (this.a(var2)) {
         if (this.b(var2)) {
            LocalDate var3 = (new LocalDate(this.c.c())).minusDays(1);
            this.a(this.i(), fi.polar.polarflow.service.activity.a_package.e.a(var3), true);
            this.h();
            this.a(var2, true);
         } else {
            this.a(var2, false);
         }
      }

      return this.a(this.i(), var1, false);
   }

   public void b() {
      this.p = null;
      this.s = -1.0F;
      this.a(this.i(), true, false);
   }
}
