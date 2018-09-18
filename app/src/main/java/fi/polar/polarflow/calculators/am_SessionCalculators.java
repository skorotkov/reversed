package fi.polar.polarflow.calculators;

import android.content.Context;
import android.os.Handler;
import android.util.SparseLongArray;

import fi.polar.polarflow.c.a_accelerometer_package.a_AccelerometerSensor;
import fi.polar.polarflow.c.a_accelerometer_package.e_RunningCadenceProvider;
import fi.polar.polarflow.c.b_PolarSensorEventBase;
import fi.polar.polarflow.c.c_heartrate_package.a_HeartRateSensor;
import fi.polar.polarflow.c.d_gps_package.a_GpsLocationProviderBase;
import fi.polar.polarflow.c.e_PolarSensorListenerEx;
import fi.polar.polarflow.c.f_PolarSensorEvent;
import fi.polar.polarflow.c.l_PolarSensorListener;
import fi.polar.polarflow.c.m_SENSOR_STATE;
import fi.polar.polarflow.data.Training;
import fi.polar.polarflow.data.TrainingStatistics;
import fi.polar.polarflow.data.orm.Sport;
import fi.polar.polarflow.data.orm.SportProfile;
import fi.polar.polarflow.data.orm.SwimmingSamples;
import fi.polar.polarflow.data.orm.UserDeviceSettings;
import fi.polar.polarflow.util.aa_TimeUtils;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingPoolInformation;
import fi.polar.polarmathsmart.swimming.poolswimming.SwimmingStatistics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;

public class am_SessionCalculators {
   private static final String a_TAG = am_SessionCalculators.class.getSimpleName();
   private static final long l_500msInNanos;
   private int A;
   private int B;
   private int C;
   private long D_currentSamplingTimeFromBoot;
   private long E_gpsSampleDifference;
   private final e_PolarSensorListenerEx F_heartRatePolarSensorListener;
   private final e_PolarSensorListenerEx G_gpsPolarSensorListener;
   private final l_PolarSensorListener H_runningCadencePolarSensorListener;
   private final Runnable I_samplerTask;
   private final af J;
   private final List b_calcs;
   private final Context context;
   private final SparseLongArray d_hrSamplesTimeFromBoot;
   private final SparseLongArray e_gpsSamplesTimeFromBoot;
   private final SparseLongArray f_cadenceSamplesTimeFromBoot;
   private b_PolarSensorEventBase g;
   private f_PolarSensorEvent h_polarGpsSensorEvent;
   private int i;
   private long j;
   private int k;
   private final int m;
   private boolean n;
   private boolean o_isStopped;
   private final List p;
   private final List q_events;
   private final Handler r_handler;
   private final Training s_training;
   private aa_TimeUtils t_timeUtils;
   private final int[] u_samplesCounter;
   private a_GpsLocationProviderBase v_gpsSensor;
   private a_HeartRateSensor w_heartRateSensor;
   private e_RunningCadenceProvider x_runningCadenceProvider;
   private bb_SwimmingMetricsProvider y_swimmingMetricsProvider;
   private SwimmingSamples z_swimmingSamples;

   static {
      l_500msInNanos = TimeUnit.MILLISECONDS.toNanos(500L);
   }

   public am_SessionCalculators(Context var1) {
      this(var1, Training.getInstance(), new Handler());
   }

   public am_SessionCalculators(Context var1, Training var2, Handler var3) {
      this.m = 5;
      this.F_heartRatePolarSensorListener = new an_HrPolarSensorListener(this);
      this.G_gpsPolarSensorListener = new ao_GpsPolarSensorListener(this);
      this.H_runningCadencePolarSensorListener = new ap(this);
      this.I_samplerTask = new aq_SamplerTask(this);
      this.J = new ar(this);
      this.context = var1;
      this.b_calcs = new ArrayList();
      this.d_hrSamplesTimeFromBoot = new SparseLongArray();
      this.e_gpsSamplesTimeFromBoot = new SparseLongArray();
      this.f_cadenceSamplesTimeFromBoot = new SparseLongArray();
      this.r_handler = var3;
      this.u_samplesCounter = new int[]{0};
      this.s_training = var2;
      this.t_timeUtils = new aa_TimeUtils();
      this.E_gpsSampleDifference = 0L;
      this.p = new ArrayList();
      this.q_events = new ArrayList();
      this.i = -1;
      this.j = 0L;
      this.k = 0;
   }

   // $FF: synthetic method
   static int a(am_SessionCalculators var0, int var1) {
      var0.i = var1;
      return var1;
   }

   // $FF: synthetic method
   static long a(am_SessionCalculators var0, long var1) {
      var0.j = var1;
      return var1;
   }

   // $FF: synthetic method
   static b_PolarSensorEventBase a(am_SessionCalculators var0, b_PolarSensorEventBase var1) {
      var0.g = var1;
      return var1;
   }

   // $FF: synthetic method
   static f_PolarSensorEvent a(am_SessionCalculators var0, f_PolarSensorEvent var1) {
      var0.h_polarGpsSensorEvent = var1;
      return var1;
   }

   private void a(int param1) {
      // $FF: Couldn't be decompiled
      for(int[] var2 = this.u_samplesCounter; this.C < this.u_samplesCounter[0] && this.C < Integer.MAX_VALUE; ++this.C) {
         this.b(this.C, param1);
      }

   }

   private void a(int var1, boolean var2) {
      this.a(var1, var2, Integer.MAX_VALUE);
   }

   private void a(int var1, boolean var2, int var3) {
      // $FF: Couldn't be decompiled
      for(int[] var4 = this.u_samplesCounter; this.A < this.u_samplesCounter[0] && this.A < var3; ++this.A) {
         if (var2) {
            this.a(this.A, var1);
         } else {
            this.a(this.A, Math.round(this.g.a_values[0]));
         }
      }
   }

   // $FF: synthetic method
   static void a(am_SessionCalculators var0, int var1, boolean var2) {
      var0.a(var1, var2);
   }

   // $FF: synthetic method
   static void a(am_SessionCalculators var0, int var1, boolean var2, int var3) {
      var0.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static void a(am_SessionCalculators var0, List var1, int var2) {
      var0.a(var1, var2);
   }

   private void a(List var1, int var2) {
      // $FF: Couldn't be decompiled
      boolean var3 = false;
      int[] var4 = this.u_samplesCounter;
      boolean var5 = var3;
      if (this.A < this.u_samplesCounter[0]) {
         var5 = var3;
         if (this.A < var2) {
            var5 = true;
         }
      }

      if (var5 && var1.size() != 0) {
         for(; this.A < this.u_samplesCounter[0] && this.A < var2; ++this.A) {
            long var6 = TimeUnit.MILLISECONDS.toNanos(this.d_hrSamplesTimeFromBoot.get(this.A));
            b_PolarSensorEventBase var8 = b_PolarSensorEventBase.a(var6, var1, l_500msInNanos);
            if (var8 != null) {
               this.g = var8;
            } else if (var6 < ((b_PolarSensorEventBase)var1.get(0)).b_timestamp) {
               var8 = (b_PolarSensorEventBase)var1.get(0);
            } else if (var6 > ((b_PolarSensorEventBase)var1.get(var1.size() - 1)).b_timestamp) {
               var8 = (b_PolarSensorEventBase)var1.get(var1.size() - 1);
            } else {
               var8 = b_PolarSensorEventBase.a(var6, var1);
            }

            if (var8 != null) {
               this.a(this.A, Math.round(var8.a_values[0]));
            }
         }

         this.g = (b_PolarSensorEventBase)var1.get(var1.size() - 1);
      }

   }

   // $FF: synthetic method
   static boolean a(am_SessionCalculators var0) {
      return var0.n;
   }

   // $FF: synthetic method
   static long b_setAndReturnGpsSampleDifference(am_SessionCalculators var0, long var1) {
      var0.E_gpsSampleDifference = var1;
      return var1;
   }

   // $FF: synthetic method
   static aa_TimeUtils b_getTimeUtils(am_SessionCalculators var0) {
      return var0.t_timeUtils;
   }

   // $FF: synthetic method
   static void b(am_SessionCalculators var0, int var1) {
      var0.a(var1);
   }

   // $FF: synthetic method
   static int c(am_SessionCalculators var0, int var1) {
      var0.k = var1;
      return var1;
   }

   // $FF: synthetic method
   static long c_setAndReturnCurrentSamplingTimeFromBoot(am_SessionCalculators var0, long var1) {
      var0.D_currentSamplingTimeFromBoot = var1;
      return var1;
   }

   // $FF: synthetic method
   static int[] c(am_SessionCalculators var0) {
      return var0.u_samplesCounter;
   }

   // $FF: synthetic method
   static b_PolarSensorEventBase d(am_SessionCalculators var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static String d() {
      return a_TAG;
   }

   // $FF: synthetic method
   static int e(am_SessionCalculators var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static long e_get500msInNanos() {
      return l_500msInNanos;
   }

   // $FF: synthetic method
   static long f(am_SessionCalculators var0) {
      return var0.j;
   }

   private static SwimmingPoolInformation f() {
      int var0 = fi.polar.polarflow.util.u.a().k();
      int var1 = fi.polar.polarflow.util.u.a().j();
      int var2 = var1;
      if (var0 == 1) {
         var2 = fi.polar.polarflow.ui.o.b(var1);
      }

      return new SwimmingPoolInformation(var0, (float)var2);
   }

   // $FF: synthetic method
   static List g(am_SessionCalculators var0) {
      return var0.p;
   }

   private void g() {
      this.i_stopSamplerTask();
      this.b_calcs.clear();
   }

   // $FF: synthetic method
   static int h(am_SessionCalculators var0) {
      return var0.A;
   }

   private void h_resumeSamplerTask() {
      this.i_stopSamplerTask();
      this.D_currentSamplingTimeFromBoot = this.s_training.getSamplingStartTimeFromBoot();
      this.r_handler.postDelayed(this.I_samplerTask, 1000L);
   }

   // $FF: synthetic method
   static int i(am_SessionCalculators var0) {
      int var1 = var0.A;
      var0.A = var1 + 1;
      return var1;
   }

   private void i_stopSamplerTask() {
      this.r_handler.removeCallbacks(this.I_samplerTask);
   }

   // $FF: synthetic method
   static SparseLongArray j_get_d_samplesTimeFromBoot(am_SessionCalculators var0) {
      return var0.d_hrSamplesTimeFromBoot;
   }

   private void j() {
      // $FF: Couldn't be decompiled
      fi.polar.polarflow.c.f_PolarSensorEvent var1 = this.v_gpsSensor.k_fillPolarGpsSensorEvent();

      for(int[] var2 = this.u_samplesCounter; this.B < this.u_samplesCounter[0]; ++this.B) {
         this.a(this.B, var1);
      }

   }

   // $FF: synthetic method
   static List k_getEvents(am_SessionCalculators var0) {
      return var0.q_events;
   }

   // $FF: synthetic method
   static int l(am_SessionCalculators var0) {
      return var0.B;
   }

   // $FF: synthetic method
   static int m(am_SessionCalculators var0) {
      int var1 = var0.B;
      var0.B = var1 + 1;
      return var1;
   }

   // $FF: synthetic method
   static SparseLongArray n_get_e_samplesTimeFromBoot(am_SessionCalculators var0) {
      return var0.e_gpsSamplesTimeFromBoot;
   }

   // $FF: synthetic method
   static long o_getGpsSampleDifference(am_SessionCalculators var0) {
      return var0.E_gpsSampleDifference;
   }

   // $FF: synthetic method
   static f_PolarSensorEvent p_getPolarGpsSensorEvent(am_SessionCalculators var0) {
      return var0.h_polarGpsSensorEvent;
   }

   // $FF: synthetic method
   static int q(am_SessionCalculators var0) {
      return var0.k;
   }

   // $FF: synthetic method
   static Training r_getTraining(am_SessionCalculators var0) {
      return var0.s_training;
   }

   // $FF: synthetic method
   static long s_getCurrentSamplingTimeFromBoot(am_SessionCalculators var0) {
      return var0.D_currentSamplingTimeFromBoot;
   }

   // $FF: synthetic method
   static SparseLongArray t_get_f_samplesTimeFromBoot(am_SessionCalculators var0) {
      return var0.f_cadenceSamplesTimeFromBoot;
   }

   // $FF: synthetic method
   static Handler u_getHandler(am_SessionCalculators var0) {
      return var0.r_handler;
   }

   // $FF: synthetic method
   static List v_getCalcs(am_SessionCalculators var0) {
      return var0.b_calcs;
   }

   // $FF: synthetic method
   static SwimmingSamples w_getSwimmingSamples(am_SessionCalculators var0) {
      return var0.z_swimmingSamples;
   }

   public void a_stop() {
      boolean var1 = false;
      Iterator var2 = this.b_calcs.iterator();

      while(var2.hasNext()) {
         al_Calc var3 = (al_Calc)var2.next();
         if (var3 instanceof aj_CalcBase) {
            ((aj_CalcBase)var3).b(true);
         }
      }

      this.o_isStopped = true;
      if (this.w_heartRateSensor != null) {
         this.w_heartRateSensor.a_setPolarSensorListener((l_PolarSensorListener)null);
         int var4;
         if (this.i != -1) {
            var4 = this.i;
         } else {
            var4 = 0;
         }

         if (this.i != -1) {
            var1 = true;
         }

         this.a(var4, var1);
      }

      if (this.v_gpsSensor != null) {
         this.v_gpsSensor.a_setPolarSensorListener((l_PolarSensorListener)null);
         this.j();
      }

      if (this.x_runningCadenceProvider != null) {
         this.x_runningCadenceProvider.a_setPolarSensorListener((l_PolarSensorListener)null);
         this.a(this.k);
      }

      if (this.y_swimmingMetricsProvider != null) {
         SwimmingStatistics var5 = this.y_swimmingMetricsProvider.a();
         TrainingStatistics var7 = Training.getInstance().getStatistics();
         if (var7 != null) {
            var7.setSwimmingStatistics(new fi.polar.polarflow.data.orm.SwimmingStatistics(var5));
         }
      }

      Iterator var8 = this.b_calcs.iterator();

      while(var8.hasNext()) {
         al_Calc var6 = (al_Calc)var8.next();
         if (var6 instanceof y) {
            ((y)var6).d();
         }
      }

      this.g();
   }

   void a(int var1, int var2) {
      long var3 = this.d_hrSamplesTimeFromBoot.get(this.A);
      if (this.o_isStopped) {
         this.d_hrSamplesTimeFromBoot.put(this.A, 0L);
      } else {
         this.d_hrSamplesTimeFromBoot.delete(this.A);
      }

      boolean var5 = true;
      if (var2 == 0) {
         var5 = false;
      }

      Iterator var6 = this.b_calcs.iterator();

      while(var6.hasNext()) {
         al_Calc var7 = (al_Calc)var6.next();
         if (var7 instanceof h_ExerciseLapCalc) {
            ((h_ExerciseLapCalc)var7).b_handleEvent(new z_HeartRateEvent(var1, var3, var5, var2));
         } else if (var7 instanceof q_ExerciseSampleHeartrateCalc) {
            ((q_ExerciseSampleHeartrateCalc)var7).b_handleEvent(new z_HeartRateEvent(var1, var3, var5, var2));
         } else if (var7 instanceof j_ExercisePhaseCalc) {
            ((j_ExercisePhaseCalc)var7).b_handleEvent(new z_HeartRateEvent(var1, var3, var5, var2));
         }
      }

   }

   void a(int var1, f_PolarSensorEvent var2) {
      long var3 = this.e_gpsSamplesTimeFromBoot.get(this.B);
      if (this.o_isStopped) {
         this.e_gpsSamplesTimeFromBoot.put(this.B, 0L);
      } else {
         this.e_gpsSamplesTimeFromBoot.delete(this.B);
      }

      Iterator var5 = this.b_calcs.iterator();

      while(var5.hasNext()) {
         al_Calc var6 = (al_Calc)var5.next();
         if (var6 instanceof h_ExerciseLapCalc) {
            ((h_ExerciseLapCalc)var6).b_handleEvent(new aa_GpsDerivativesEvent(var1, var3, var2));
         } else if (var6 instanceof s_GpsDerivativesCalc) {
            ((s_GpsDerivativesCalc)var6).b_handleEvent(new aa_GpsDerivativesEvent(var1, var3, var2));
         } else if (var6 instanceof t_GpsLocationCalc) {
            ((t_GpsLocationCalc)var6).b_handleEvent(new v_GpsLocationEvent(var1, var3, var2));
         } else if (var6 instanceof j_ExercisePhaseCalc) {
            ((j_ExercisePhaseCalc)var6).b_handleEvent(new aa_GpsDerivativesEvent(var1, var3, var2));
         }
      }

   }

   public void a_startSessionCalculators(a_GpsLocationProviderBase var1_gpsSensor,
                                         a_HeartRateSensor var2_hearRateSensor,
                                         e_RunningCadenceProvider var3_cadenceSensor,
                                         a_AccelerometerSensor var4_accelerometerSensor) {
      fi.polar.polarflow.util.d.c(a_TAG, "startSessionCalculators");
      this.b_calcs.clear();
      if (var1_gpsSensor != null) {
         this.v_gpsSensor = var1_gpsSensor;
         this.b_calcs.add(new s_GpsDerivativesCalc());
         this.b_calcs.add(new t_GpsLocationCalc());
         if (this.v_gpsSensor.e_getState() == m_SENSOR_STATE.d_READY) {
            this.s_training.getStatistics().getSpeedStatistics().b_setMostRecentSample(this.v_gpsSensor.p_getSpeedInMetersPerSecond());
         }

         this.v_gpsSensor.a_setPolarSensorListener(this.G_gpsPolarSensorListener);
         this.h_polarGpsSensorEvent = this.v_gpsSensor.k_fillPolarGpsSensorEvent();
      }

      float var5;
      long var6_trainingStartTimeFromBoot;
      if (var2_hearRateSensor != null) {
         this.w_heartRateSensor = var2_hearRateSensor;
         this.b_calcs.add(new q_ExerciseSampleHeartrateCalc(this.context));
         if (this.w_heartRateSensor.e_getState() == m_SENSOR_STATE.d_READY) {
            this.s_training.getStatistics().getHeartrateStatistics().b_setMostRecentSample((float)this.w_heartRateSensor.n());
            var5 = (float)this.w_heartRateSensor.n();
            var6_trainingStartTimeFromBoot = this.t_timeUtils.c_elapsedRealtimeNanos();
            this.g = new b_PolarSensorEventBase(new float[]{var5}, var6_trainingStartTimeFromBoot, 3);
         } else {
            var6_trainingStartTimeFromBoot = this.t_timeUtils.c_elapsedRealtimeNanos();
            this.g = new b_PolarSensorEventBase(new float[]{0.0F}, var6_trainingStartTimeFromBoot, -1);
         }

         this.w_heartRateSensor.a_setPolarSensorListener(this.F_heartRatePolarSensorListener);
      }

      SportProfile var8_sportProfile = this.s_training.getSportProfile();
      int var9_automaticLap = -1;
      if (var8_sportProfile != null) {
         var9_automaticLap = var8_sportProfile.getSettings().getAutomaticLap();
      }

      var6_trainingStartTimeFromBoot = this.s_training.getStartTimeFromBoot();
      if (var4_accelerometerSensor != null) {
         if (Sport.isSwimmingSport(this.s_training.getSportId())) {
            this.z_swimmingSamples = this.s_training.getSwimmingSamples();
            this.z_swimmingSamples.setStart(new DateTime(this.s_training.getStartTime()));
            this.y_swimmingMetricsProvider = new bb_SwimmingMetricsProvider(var2_hearRateSensor, var4_accelerometerSensor, var6_trainingStartTimeFromBoot);
            var5 = -1.0F;
            if (var8_sportProfile != null) {
               var5 = var8_sportProfile.getSettings().getAutomaticLapDistance();
            }

            this.y_swimmingMetricsProvider.a(f(), UserDeviceSettings.getUsersDeviceLocation(), var5);
            this.y_swimmingMetricsProvider.a(this.J);
            this.b_calcs.add(new az(this.context, var6_trainingStartTimeFromBoot, this.y_swimmingMetricsProvider));
            if (var9_automaticLap == 2) {
               this.b_calcs.add(new av(this.context, var6_trainingStartTimeFromBoot, this.y_swimmingMetricsProvider));
            } else if (var9_automaticLap == 3) {
               this.b_calcs.add(new ax(this.context, var8_sportProfile.getSettings().getAutomaticLapDuration(), var6_trainingStartTimeFromBoot, this.y_swimmingMetricsProvider));
            }
         }
      } else if (var2_hearRateSensor != null || var1_gpsSensor != null) {
         this.b_calcs.add(new ab_ManualLapCalc(this.context, var6_trainingStartTimeFromBoot));
         if (var9_automaticLap == 2) {
            this.b_calcs.add(new d_DistanceLapCalc(this.context, var8_sportProfile.getSettings().getAutomaticLapDistance(), var6_trainingStartTimeFromBoot));
         } else if (var9_automaticLap == 3) {
            this.b_calcs.add(new e_DurationLapCalc(this.context, var8_sportProfile.getSettings().getAutomaticLapDuration(), var6_trainingStartTimeFromBoot));
         }
      }

      if (this.s_training.getTrainingSessionTarget() != null) {
         if (this.s_training.getTrainingSessionTarget().getExerciseTarget().getTargetType() == 2) {
            this.b_calcs.add(new j_ExercisePhaseCalc(this.context));
         } else if (this.s_training.getTrainingSessionTarget().getExerciseTarget().getTargetType() == 1) {
            this.b_calcs.add(new w_ExerciseVolumeTargetCalc(this.context));
         }
      }

      Sport var10_sport;
      if (var8_sportProfile != null) {
         var10_sport = var8_sportProfile.getSport();
      } else {
         var10_sport = null;
      }

      if (var1_gpsSensor != null && var2_hearRateSensor != null && var10_sport != null && var10_sport.getParentId() == 1L) {
         this.b_calcs.add(new p_ExerciseRunningIndexCalc());
      }

      if (var3_cadenceSensor != null) {
         this.b_calcs.add(new o_RunningCadenceCalc());
         this.x_runningCadenceProvider = var3_cadenceSensor;
         this.x_runningCadenceProvider.a_setPolarSensorListener(this.H_runningCadencePolarSensorListener);
      }

      if (!this.b_calcs.isEmpty()) {
         this.D_currentSamplingTimeFromBoot = this.s_training.getSamplingStartTimeFromBoot();
         this.r_handler.post(this.I_samplerTask);
      }

   }

   public void b() {
      fi.polar.polarflow.util.d.c(a_TAG, "pauseSessionCalculators");
      this.n = true;
      this.i_stopSamplerTask();
      Iterator var1 = this.b_calcs.iterator();

      while(var1.hasNext()) {
         al_Calc var2 = (al_Calc)var1.next();
         if (var2 instanceof ae) {
            ((ae)var2).b();
         }
      }

      if (this.y_swimmingMetricsProvider != null) {
         this.y_swimmingMetricsProvider.b();
      }

   }

   void b(int var1, int var2_cadence) {
      long var3 = this.f_cadenceSamplesTimeFromBoot.get(this.C);
      if (this.o_isStopped) {
         this.f_cadenceSamplesTimeFromBoot.put(this.C, 0L);
      } else {
         this.f_cadenceSamplesTimeFromBoot.delete(this.C);
      }

      b_RunningCadenceEvent var5 = new b_RunningCadenceEvent(var1, var3, var2_cadence);
      Iterator var6 = this.b_calcs.iterator();

      while(var6.hasNext()) {
         al_Calc var7 = (al_Calc)var6.next();
         if (var7 instanceof o_RunningCadenceCalc) {
            ((o_RunningCadenceCalc)var7).b_handleEvent(var5);
         } else if (var7 instanceof h_ExerciseLapCalc) {
            ((h_ExerciseLapCalc)var7).b_handleEvent(var5);
         } else if (var7 instanceof j_ExercisePhaseCalc) {
            ((j_ExercisePhaseCalc)var7).b_handleEvent(var5);
         }
      }

   }

   public void c_resumeSessionCalculators() {
      fi.polar.polarflow.util.d.c(a_TAG, "resumeSessionCalculators");
      this.n = false;
      Iterator var1 = this.b_calcs.iterator();

      while(var1.hasNext()) {
         al_Calc var2 = (al_Calc)var1.next();
         if (var2 instanceof ah) {
            ((ah)var2).c();
         }
      }

      if (this.y_swimmingMetricsProvider != null) {
         this.y_swimmingMetricsProvider.c();
      }

      this.h_resumeSamplerTask();
   }
}
