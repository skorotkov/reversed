package fi.polar.polarflow.calculators;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;

import fi.polar.polarflow.c.n_SENSOR_TYPE;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.orm.ExercisePhase;
import fi.polar.polarflow.data.orm.ExercisePhaseData;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.Zones;
import java.util.ArrayList;
import java.util.List;

public class j_ExercisePhaseCalc extends aj_CalcBase implements ae, ah, y {
   private static final ArrayList k = new ArrayList(3);
   private int A;
   private List B;
   private int C;
   private int D;
   private final android.support.v4.c.g E;
   private android.support.v4.c.g F;
   private final BroadcastReceiver G;
   private final Runnable H;
   private final Runnable I;
   as_SpeedRangeStatistics a_speedRangeStatistics;
   protected final Training b;
   private final Handler d;
   private final AlarmManager e;
   private PendingIntent f;
   private PendingIntent g;
   private PendingIntent h;
   private PendingIntent i;
   private boolean j;
   private ExercisePhase l;
   private int m;
   private float n;
   private float o;
   private float p;
   private float q;
   private float r;
   private float s;
   private long t;
   private long u;
   private boolean v;
   private boolean w;
   private final fi.polar.polarflow.calculators.a_package.c x;
   private final at_RangeStatistics y;
   private String z;

   static {
      k.add(n_SENSOR_TYPE.b_IN_DEVICE_GPS);
      k.add(n_SENSOR_TYPE.d_HEART_RATE);
      k.add(n_SENSOR_TYPE.e_RUNNING_CADENCE);
   }

   public j_ExercisePhaseCalc(Context var1) {
      this(var1, (Training)null, (Handler)null, (AlarmManager)null);
   }

   public j_ExercisePhaseCalc(Context var1, Training var2, Handler var3, AlarmManager var4) {
      this(var1, var2, var3, var4, (as_SpeedRangeStatistics)null);
   }

   public j_ExercisePhaseCalc(Context var1, Training var2, Handler var3, AlarmManager var4, as_SpeedRangeStatistics var5) {
      super(k);
      this.l = null;
      this.m = 1;
      this.n = -1.0F;
      this.o = 0.0F;
      this.p = -1.0F;
      this.q = 0.0F;
      this.r = -1.0F;
      this.s = 0.0F;
      this.t = 0L;
      this.u = 0L;
      this.v = false;
      this.w = false;
      this.x = new fi.polar.polarflow.calculators.a_package.c();
      this.y = new at_RangeStatistics(0.0F, 250.0F);
      this.z = "";
      this.C = -1;
      this.D = -1;
      this.G = new k(this);
      this.H = new m(this);
      this.I = new n(this);
      this.a_setCurrentEvent((ai_Event)(new l(this, 0, 0L)));
      if (var2 == null) {
         var2 = Training.getInstance();
      }

      this.b = var2;
      if (var3 == null) {
         this.d = new Handler();
      } else {
         this.d = var3;
      }

      if (var5 != null) {
         this.a_speedRangeStatistics = var5;
      } else {
         this.a_speedRangeStatistics = new as_SpeedRangeStatistics();
      }

      if (var4 != null) {
         this.e = var4;
      } else {
         this.e = (AlarmManager)var1.getApplicationContext().getSystemService("alarm");
      }

      this.a(var1);
      this.m = this.b.getTrainingPhase().getNumber();
      android.support.v4.c.g var6;
      if (var1 != null) {
         var6 = android.support.v4.c.g.a(var1);
      } else {
         var6 = null;
      }

      this.E = var6;
      IntentFilter var7 = new IntentFilter();
      var7.addAction("ExercisePhaseCalc.ACTION_START_PHASE");
      var7.addAction("fi.polar.polarflow.action.ZONE_ALARM_TRIGGERED");
      var7.addAction("fi.polar.polarflow.action.PHASE_FINISH_ALARM_TRIGGERED");
      var7.addAction("fi.polar.polarflow.action.PRE_PHASE_FINISH_ALARM_TRIGGERED");
      var7.addAction("fi.polar.polarflow.action.PHASE_END_COUNTDOWN_ALARM_TRIGGERED");
      var7.addAction("ExercisePhaseCalc.ACTION_SKIP_TO_NEXT_PHASE");
      this.x().a(this.G, var7);
      this.u();
      this.d(false);
   }

   private void a_handlePoolSwimmingEvent(float var1, float var2) {
      this.n = var1;
      this.a_speedRangeStatistics.a_addSample(3.6F * var2);
      this.s();
   }

   private void a_handleGpsDerivativesEvent(float var1, float var2, float var3, float var4) {
      if (this.o_getCurrentEvent().n_isTrusted()) {
         this.n = var1;
         this.p = var3;
         this.r = var4;
      }

      if (Float.isNaN(var2)) {
         this.a_speedRangeStatistics.b_addEmptySample();
      } else {
         this.a_speedRangeStatistics.a_addSample(3.6F * var2);
      }

      this.s();
   }

   private void a_handleHeartRateEvent(int var1) {
      if (this.o_getCurrentEvent().n_isTrusted()) {
         int var2;
         if (var1 < 0) {
            var2 = 0;
         } else {
            var2 = var1;
            if (var1 > 250) {
               var2 = 250;
            }
         }

         this.c(var2);
         this.y.a_addSample((float)var2);
      } else {
         this.v();
         this.y.b_addEmptySample();
      }

      this.r();
   }

   private void a_setNextZoneAlarm(long var1) {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "setNextZoneAlarm() " + var1 + " ms from now.");
      this.e.setExact(2, SystemClock.elapsedRealtime() + var1, this.f);
   }

   private void a(Context var1) {
      var1 = var1.getApplicationContext();
      Intent var2 = new Intent(var1, AlarmReceiver.class);
      var2.setAction("fi.polar.polarflow.action.CALCULATOR_ALARM");
      var2.putExtra("fi.polar.polarflow.extra.LOCAL_ACTION", "fi.polar.polarflow.action.ZONE_ALARM_TRIGGERED");
      this.f = PendingIntent.getBroadcast(var1, 2, var2, 134217728);
      var2 = new Intent(var1, AlarmReceiver.class);
      var2.setAction("fi.polar.polarflow.action.CALCULATOR_ALARM");
      var2.putExtra("fi.polar.polarflow.extra.LOCAL_ACTION", "fi.polar.polarflow.action.PRE_PHASE_FINISH_ALARM_TRIGGERED");
      this.h = PendingIntent.getBroadcast(var1, 3, var2, 134217728);
      var2 = new Intent(var1, AlarmReceiver.class);
      var2.setAction("fi.polar.polarflow.action.CALCULATOR_ALARM");
      var2.putExtra("fi.polar.polarflow.extra.LOCAL_ACTION", "fi.polar.polarflow.action.PHASE_FINISH_ALARM_TRIGGERED");
      this.g = PendingIntent.getBroadcast(var1, 4, var2, 134217728);
      var2 = new Intent(var1, AlarmReceiver.class);
      var2.setAction("fi.polar.polarflow.action.CALCULATOR_ALARM");
      var2.putExtra("fi.polar.polarflow.extra.LOCAL_ACTION", "fi.polar.polarflow.action.PHASE_END_COUNTDOWN_ALARM_TRIGGERED");
      this.i = PendingIntent.getBroadcast(var1, 6, var2, 134217728);
   }

   // $FF: synthetic method
   static void a(j_ExercisePhaseCalc var0, String var1, int var2) {
      var0.a_broadcastTargetZoneAction(var1, var2);
   }

   private void a_broadcastTargetZoneAction(String var1, int var2) {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "broadcastTargetZoneAction() " + var1 + " - " + var2);
      if (!this.c && !this.j) {
         Intent var3 = new Intent(var1);
         this.x().a(var3);
      }

      this.v();
      if (var2 > 0) {
         this.a_setNextZoneAlarm((long)var2);
      }

      this.z = var1;
      this.A = var2;
   }

   // $FF: synthetic method
   static boolean a(j_ExercisePhaseCalc var0) {
      return var0.w;
   }

   // $FF: synthetic method
   static boolean a(j_ExercisePhaseCalc var0, boolean var1) {
      var0.v = var1;
      return var1;
   }

   private void b_handleRunningCadenceEvent(int var1) {
      this.x.a(var1);
      this.q();
   }

   private void b_setPhaseFinishAlarms(long var1) {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "setPhaseFinishAlarms() " + var1 + " ms from now.");
      if (var1 > 4000L) {
         this.e.setExact(2, SystemClock.elapsedRealtime() + var1 - 4000L, this.i);
      }

      this.e.setExact(2, SystemClock.elapsedRealtime() + var1 - 700L, this.h);
      this.e.setExact(2, SystemClock.elapsedRealtime() + var1, this.g);
   }

   // $FF: synthetic method
   static void b(j_ExercisePhaseCalc var0) {
      var0.l_startNextPhase();
   }

   // $FF: synthetic method
   static Runnable c(j_ExercisePhaseCalc var0) {
      return var0.H;
   }

   private void c(int var1) {
      if (this.l != null && !this.w && this.l.getStartTime() != -1L && this.C != -1 && this.D != -1 && (float)var1 != this.y.i_getMostResentSample()) {
         if (var1 >= this.C && var1 <= this.D) {
            if (this.z.equals("ExercisePhaseCalc.ACTION_BELOW_TARGET_ZONE") || this.z.equals("ExercisePhaseCalc.ACTION_ABOVE_TARGET_ZONE")) {
               this.a_broadcastTargetZoneAction("ExercisePhaseCalc.ACTION_TARGET_ZONE_REACHED", 0);
            }
         } else if (var1 < this.C) {
            if (!this.z.equals("ExercisePhaseCalc.ACTION_BELOW_TARGET_ZONE")) {
               this.a_broadcastTargetZoneAction("ExercisePhaseCalc.ACTION_BELOW_TARGET_ZONE", 10000);
            }
         } else if (var1 > this.D && !this.z.equals("ExercisePhaseCalc.ACTION_ABOVE_TARGET_ZONE")) {
            this.a_broadcastTargetZoneAction("ExercisePhaseCalc.ACTION_ABOVE_TARGET_ZONE", 4000);
         }
      }

   }

   private void c(boolean var1) {
      if (this.l != null) {
         this.w();
         long var2;
         if (var1) {
            this.t = this.b.getDurationMs();
            var2 = this.l.getGoalDuration();
         } else {
            var2 = this.t + this.l.getGoalDuration() - this.b.getDurationMs();
         }

         this.b_setPhaseFinishAlarms(var2);
      }

   }

   // $FF: synthetic method
   static Handler d(j_ExercisePhaseCalc var0) {
      return var0.d;
   }

   private void d(boolean var1) {
      this.l = this.b.getCurrentPhase();
      this.n = -1.0F;
      this.p = -1.0F;
      this.r = -1.0F;
      this.j = false;
      this.y.a_clear();
      this.a_speedRangeStatistics.a_clear();
      this.x.c();
      if (this.l != null) {
         if (this.l.getGoalType() == 1) {
            this.c(var1);
         } else if (this.l.getGoalType() == 2 && var1) {
            this.o = this.b.getTotalDistance();
         }

         this.u = this.t_getTimeInHrZones();
         if (this.l.getIntensityType() == 1 && this.l.getIntensityZoneLower() != -1 && this.l.getIntensityZoneUpper() != -1) {
            this.C = ((int[])this.B.get(this.l.getIntensityZoneLower() - 1))[0];
            this.D = ((int[])this.B.get(this.l.getIntensityZoneUpper() - 1))[1];
            if (this.l.getIntensityZoneUpper() - 1 != 4) {
               --this.D;
            }
         } else {
            this.C = -1;
            this.D = -1;
            this.v();
         }

         this.l.setStartTime(SystemClock.elapsedRealtime());
      } else {
         this.v();
         fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "Current phase is null");
      }

   }

   // $FF: synthetic method
   static ExercisePhase e(j_ExercisePhaseCalc var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static int f(j_ExercisePhaseCalc var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static void g(j_ExercisePhaseCalc var0) {
      var0.m_skipPhase();
   }

   // $FF: synthetic method
   static String h(j_ExercisePhaseCalc var0) {
      return var0.z;
   }

   // $FF: synthetic method
   static int i(j_ExercisePhaseCalc var0) {
      return var0.A;
   }

   private void l_startNextPhase() {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "startNextPhase(): current phase number is " + this.m);
      ++this.m;
      this.d(true);
   }

   private void m_skipPhase() {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "skipPhase(): current phase number is " + this.m);
      this.w();
      this.a_broadcastPhaseAboutToFinish(true);
      this.d.post(this.I);
   }

   private void n_broadcastPhaseFinished() {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "broadcastPhaseFinished");
      Intent var1 = new Intent("ExercisePhaseCalc.ACTION_PHASE_FINISHED");
      var1.putExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", this.m);
      var1.putExtra("ExercisePhaseCalc.KEY_PHASE_GOAL", this.l.getGoalType());
      this.x().a(var1);
   }

   private void q() {
      Intent var1 = new Intent("ExercisePhaseCalc.ACTION_PHASE_CURRENT_DATA");
      var1.putExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", this.m);
      if (this.x.b()) {
         this.b.getTrainingPhase().setAvgCadence(this.x.d());
         this.b.getTrainingPhase().setMaxCadence(this.x.e());
         var1.putExtra("ExercisePhaseCalc.KEY_AVG_CADENCE", this.x.d());
         var1.putExtra("ExercisePhaseCalc.KEY_MAX_CADENCE", this.x.e());
      }

      if (!this.c) {
         this.x().a(var1);
      }

   }

   private void r() {
      Intent var1 = new Intent("ExercisePhaseCalc.ACTION_PHASE_CURRENT_DATA");
      var1.putExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", this.m);
      if (this.y.g_areAnySamplesAdded()) {
         this.b.getTrainingPhase().setAvgHr(this.y.c_getAverage());
         this.b.getTrainingPhase().setMaxHr(this.y.e_getMax());
         var1.putExtra("ExercisePhaseCalc.KEY_AVG_HR", Math.round(this.y.c_getAverage()));
         var1.putExtra("ExercisePhaseCalc.KEY_MAX_HR", Math.round(this.y.e_getMax()));
         var1.putExtra("ExercisePhaseCalc.KEY_MIN_HR", Math.round(this.y.d_getMin()));
      }

      if (!this.c) {
         this.x().a(var1);
      }

   }

   private void s() {
      Intent var1 = new Intent("ExercisePhaseCalc.ACTION_PHASE_CURRENT_DATA");
      var1.putExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", this.m);
      float var2 = this.f();
      if (var2 != -1.0F) {
         var1.putExtra("ExercisePhaseCalc.KEY_DISTANCE", var2);
         this.b.getTrainingPhase().setDistance(var2);
      }

      if (this.a_speedRangeStatistics.g_areAnySamplesAdded()) {
         var2 = this.a_speedRangeStatistics.a(this.e(), (double)var2);
         float var3 = Math.max(this.a_speedRangeStatistics.e_getMax(), var2);
         var1.putExtra("ExercisePhaseCalc.KEY_AVG_SPEED", var2);
         var1.putExtra("ExercisePhaseCalc.KEY_MAX_SPEED", var3);
         this.b.getTrainingPhase().setAvgSpeed(var2);
         this.b.getTrainingPhase().setMaxSpeed(var3);
      }

      if (!this.c) {
         this.x().a(var1);
      }

   }

   private long t_getTimeInHrZones() {
      long var1 = 0L;
      Zones var3 = this.b.getZones();
      long var4 = var1;
      if (this.l.getIntensityType() == 1) {
         var4 = var1;
         if (var3 != null) {
            int var6 = this.l.getIntensityZoneLower();

            while(true) {
               var4 = var1;
               if (var6 > this.l.getIntensityZoneUpper()) {
                  break;
               }

               var1 += var3.getTimeInHrZone(var6 - 1);
               ++var6;
            }
         }
      }

      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "getTimeInHrZones() for phase " + this.m + " returned " + var4);
      return var4;
   }

   private void u() {
      SportProfile var1 = this.b.getSportProfile();
      if (var1 != null) {
         this.B = var1.getSettings().getHeartRateZones();
      }

      if (this.B == null || this.B.size() == 0) {
         this.B = fi.polar.polarflow.ui.o.e(this.b.getUserMaximumHeartRate());
      }

   }

   private void v() {
      this.z = "";
      this.e.cancel(this.f);
   }

   private void w() {
      this.e.cancel(this.g);
      this.e.cancel(this.h);
      this.e.cancel(this.i);
   }

   private android.support.v4.c.g x() {
      android.support.v4.c.g var1;
      if (this.F == null) {
         var1 = this.E;
      } else {
         var1 = this.F;
      }

      return var1;
   }

   public void a_handleCurrentEvent() {
      if (this.l != null) {
         ai_Event var1 = this.o_getCurrentEvent();
         if (var1 instanceof z_HeartRateEvent) {
            this.a_handleHeartRateEvent(((z_HeartRateEvent)var1).a());
         } else if (var1 instanceof aa_GpsDerivativesEvent) {
            this.a_handleGpsDerivativesEvent(((aa_GpsDerivativesEvent)var1).b_getDistance(), ((aa_GpsDerivativesEvent)var1).a_getSpeed(), ((aa_GpsDerivativesEvent)var1).d_getAscent(), ((aa_GpsDerivativesEvent)var1).e_getDescent());
         } else if (var1 instanceof b_RunningCadenceEvent) {
            this.b_handleRunningCadenceEvent(((b_RunningCadenceEvent)var1).a_getCadence());
         } else if (var1 instanceof ag_PoolSwimmingEvent) {
            this.a_handlePoolSwimmingEvent(((ag_PoolSwimmingEvent)var1).a(), ((ag_PoolSwimmingEvent)var1).b());
         }

         if (this.l.getGoalType() == 2 && this.f() >= this.l.getGoalDistance()) {
            this.a_addPhaseData(true, false);
         }
      }

   }

   protected void a_broadcastPhaseAboutToFinish(boolean var1) {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "broadcastPhaseAboutToFinish");
      Intent var2 = new Intent("ExercisePhaseCalc.ACTION_PHASE_ABOUT_TO_FINISH");
      var2.putExtra("ExercisePhaseCalc.KEY_PHASE_NUMBER", this.m);
      var2.putExtra("ExercisePhaseCalc.KEY_PHASE_SKIPPED", var1);
      this.x().a(var2);
   }

   protected final void a_addPhaseData(boolean var1, boolean var2) {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "addPhaseData, number:" + this.m);
      ExercisePhaseData var3 = new ExercisePhaseData();
      var3.setIndex(this.l.getIndex());
      var3.setDuration(this.e());
      var3.setDistance(this.f());
      var3.setAscent(this.g());
      var3.setDescent(this.h());
      if (var1) {
         if (this.l.getGoalType() == 1) {
            var3.setDuration(this.l.getGoalDuration());
         } else if (this.l.getGoalType() == 2) {
            var3.setDistance(this.l.getGoalDistance());
            if (!this.c) {
               this.a_broadcastPhaseAboutToFinish(false);
            }
         }
      }

      var3.setPhaseFinished(var1);
      long var4 = var3.getDuration();
      this.t += var4;
      var3.setSplitTime(this.t);
      float var6 = var3.getDistance();
      if (var6 != -1.0F) {
         this.o += var6;
      }

      float var7 = var3.getAscent();
      if (var7 != -1.0F) {
         this.q += var7;
      }

      var7 = var3.getDescent();
      if (var7 != -1.0F) {
         this.s += var7;
      }

      if (this.y.g_areAnySamplesAdded()) {
         var3.setAvgHR(Math.round(this.y.c_getAverage()));
         var3.setMaxHR(Math.round(this.y.e_getMax()));
         this.y.a_clear();
      }

      if (this.a_speedRangeStatistics.g_areAnySamplesAdded()) {
         var3.setAvgSpeed(this.a_speedRangeStatistics.b(var4, (double)var6));
         var3.setMaxSpeed(this.a_speedRangeStatistics.c(var4, (double)var6));
         this.a_speedRangeStatistics.a_clear();
      }

      if (this.x.b()) {
         var3.setAvgCadence(this.x.d());
         var3.setMaxCadence(this.x.e());
         this.x.c();
      }

      var3.setInTargetZone(this.t_getTimeInHrZones() - this.u);
      this.b.addPhaseData(var3);
      if (!var2) {
         if (!this.c) {
            this.n_broadcastPhaseFinished();
         }

         if (this.b.getExercisePhase(this.m) == null) {
            this.b.setTrainingSessionTargetDone(true);
            this.b.setExerciseTargetReached(true);
         }

         if (this.l.getChangeType() == 1) {
            ++this.m;
            this.d(false);
         } else {
            this.v();
            this.l = null;
         }
      }

   }

   public void b() {
      this.w = true;
      if (this.l != null && this.l.getGoalType() == 1) {
         this.w();
      }

      this.v();
   }

   public void c() {
      this.w = false;
      if (this.v) {
         this.l_startNextPhase();
         this.v = false;
      }

      if (this.l != null && this.l.getGoalType() == 1) {
         this.c(false);
      }

      if (this.z.equals("ExercisePhaseCalc.ACTION_ABOVE_TARGET_ZONE") || this.z.equals("ExercisePhaseCalc.ACTION_BELOW_TARGET_ZONE")) {
         this.a_broadcastTargetZoneAction(this.z, this.A);
      }

   }

   public void d() {
      if (this.l != null) {
         this.a_addPhaseData(false, true);
         this.d.removeCallbacks(this.H);
         this.d.removeCallbacks(this.I);
      }

      this.v();
      this.w();
      this.x().a(this.G);
   }

   protected final long e() {
      return this.b.getDurationMs() - this.t;
   }

   protected final float f() {
      float var1 = this.n - this.o;
      float var2 = var1;
      if (var1 < 0.0F) {
         var2 = -1.0F;
      }

      return var2;
   }

   protected final float g() {
      float var1 = this.p - this.q;
      float var2 = var1;
      if (var1 < 0.0F) {
         var2 = -1.0F;
      }

      return var2;
   }

   protected final float h() {
      float var1 = this.r - this.s;
      float var2 = var1;
      if (var1 < 0.0F) {
         var2 = -1.0F;
      }

      return var2;
   }

   protected void i() {
      this.a_addPhaseData(true, false);
   }

   protected void j() {
      this.a_addPhaseData(false, false);
   }

   protected void k_broadcastPhaseEndCountdown() {
      fi.polar.polarflow.util.d.c("ExercisePhaseCalc", "broadcastPhaseEndCountdown");
      this.j = true;
      this.x().a(new Intent("ExercisePhaseCalc.ACTION_PHASE_END_COUNTDOWN"));
   }
}
